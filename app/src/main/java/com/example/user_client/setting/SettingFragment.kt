package com.example.user_client.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.user_client.MainActivity
import com.example.user_client.R

class SettingFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //툴바 타이틀 설정
        val mMainactivity = activity as MainActivity
        mMainactivity.setTitle("설정")
        return inflater.inflate(R.layout.nav_fragment_setting, container, false)
    }
}