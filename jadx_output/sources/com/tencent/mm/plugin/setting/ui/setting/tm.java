package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class tm extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI f161583d;

    public tm(com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI) {
        this.f161583d = settingsSwitchAccountUI;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "up animation end");
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI = this.f161583d;
        android.content.Intent b17 = y7Var.b(settingsSwitchAccountUI);
        b17.addFlags(67108864);
        com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI2 = this.f161583d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(settingsSwitchAccountUI2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsSwitchAccountUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(settingsSwitchAccountUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsSwitchAccountUI.finish();
        db5.f.k(settingsSwitchAccountUI);
    }
}
