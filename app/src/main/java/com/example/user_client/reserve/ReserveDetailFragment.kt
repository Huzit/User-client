package com.example.user_client.reserve

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.user_client.MainActivity
import com.example.user_client.databinding.ReserveFragmentDetailBinding
import com.example.user_client.viewModel.ReserveViewModel

class ReserveDetailFragment : Fragment() {
    private var _binding: ReserveFragmentDetailBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: ReserveViewModel

    //inflate
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = ReserveFragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //뷰모델, 데이터 바인딩
        viewModel = ViewModelProvider(requireActivity()).get(ReserveViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        //뒤로가기 이벤트
        setBackPressed()
        //버튼 이벤트
        setButtonEvent()
    }

    //뒤로가기 이벤트
    private fun setBackPressed() {
        val activity = activity as MainActivity
        activity.setHomeEnabled(true)
        activity.fragment = ReserveConfirmFragment()
    }

    //버튼클릭 이벤트
    private fun setButtonEvent() {
        //전화버튼
        binding.confirmButtonCall.setOnClickListener {
            //버튼 클릭시 전화번호 띄워주기기
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", viewModel.engineerPhoneNumber.value, null))
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}