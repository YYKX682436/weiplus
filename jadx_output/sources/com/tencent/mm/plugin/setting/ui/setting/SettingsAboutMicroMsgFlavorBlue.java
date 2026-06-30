package com.tencent.mm.plugin.setting.ui.setting;

@gm0.a2
/* loaded from: classes4.dex */
public class SettingsAboutMicroMsgFlavorBlue extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160254d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f160255e = {"7.0.21", "7.0.20", "7.0.19", "7.0.18"};

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f160256f = {"小程序\n   1.connectWifi Android 10适配\n   2.视频相关bug修改\n   3.音视频编辑组件网络流添加断点续传功能，能对网络资源进行缓存;网络流添加seek支持;硬编码改成兼容性更好的VBR（动态码率）模式，编解码速度更快\n   4.websocket细分返回的错误信息\n小游戏\n   1.connectWifi Android 10适配\n   2.视频相关bug修改\n   3.音视频编辑组件网络流添加断点续传功能，能对网络资源进行缓存;网络流添加seek支持;硬编码改成兼容性更好的VBR（动态码率）模式，编解码速度更快\n   4.websocket细分返回的错误信息\n   5.小游戏性能优化方案渲染层更新\n", "小程序\n   1.优化小程序进程分配策略\n   2.优化小程序js注入耗时\n   3.修复全屏相关bug\n小游戏\n   1.启动阶段功能模块懒加载，进程加载优化，优化启动速度\n   2.性能面板增加js注入耗时、首屏渲染耗时\n   3.优化从朋友圈分享的卡片点开跳转速度\n", "小程序\n   1.优化识别二维码打开小程序的速度\n   2.worker 支持 CPU Profile\n   3.修复蓝牙线程安全问题\n   4.WebSocket切后台时支持主动断开连接\n   5.音频延迟以及CPU占用优化\n小游戏\n   1.worker 支持 CPU Profile\n   2.修复蓝牙线程安全问题\n   3.WebSocket切后台时支持主动断开连接\n   4.音频延迟以及CPU占用优化\n", "小程序\n   1.小程序正式版,拥有体验版权限的开发者能打开菜单中的开发调试\n   2.小程序webiew与service通信优化\n   3.小程序界面层级优化\n   4.小程序界面显示重构\n小游戏\n   1.小游戏正式版,拥有体验版权限的开发者能打开菜单中的开发调试\n   2.修复相同图片重复解码时内存泄漏问题\n"};

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f160257g = new java.util.HashMap();

    public final void V6() {
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f160254d = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).t();
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = this.f160255e;
            if (i17 >= strArr.length) {
                ((com.tencent.mm.ui.base.preference.h0) this.f160254d).notifyDataSetChanged();
                return;
            }
            com.tencent.mm.ui.base.preference.IconPreference iconPreference = new com.tencent.mm.ui.base.preference.IconPreference(this);
            ((com.tencent.mm.ui.base.preference.h0) this.f160254d).d(iconPreference, -1);
            iconPreference.C(strArr[i17]);
            iconPreference.L(strArr[i17]);
            i17++;
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494933c1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(getResources().getString(com.tencent.mm.R.string.fhe));
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.aaw);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.g5(this));
        if (getListView() != null) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
            getListView().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            getListView().setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        }
        V6();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = this.f160255e;
            if (i17 >= strArr.length) {
                initView();
                return;
            } else {
                this.f160257g.put(strArr[i17], this.f160256f[i17]);
                i17++;
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutMicroMsgFlavorBlue", str + " item has been clicked!");
        java.lang.String str2 = (java.lang.String) this.f160257g.get(str);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 2, 2);
        z2Var.y(getResources().getString(com.tencent.mm.R.string.f490454vi));
        z2Var.x(0);
        z2Var.F = new com.tencent.mm.plugin.setting.ui.setting.h5(this, z2Var);
        z2Var.q(str);
        android.widget.TextView textView = new android.widget.TextView(this);
        textView.setText(str2);
        z2Var.j(textView);
        z2Var.C();
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        V6();
    }
}
