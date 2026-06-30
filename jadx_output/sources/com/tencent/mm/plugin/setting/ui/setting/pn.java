package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes13.dex */
public class pn implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI f161452d;

    public pn(com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI) {
        this.f161452d = settingsTrustFriendUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI = this.f161452d;
        if (!settingsTrustFriendUI.f160739i || motionEvent.getAction() != 1 || settingsTrustFriendUI.f160735e.pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY()) != -1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        settingsTrustFriendUI.f160739i = false;
        settingsTrustFriendUI.f160736f.notifyDataSetChanged();
        yj0.a.i(true, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
