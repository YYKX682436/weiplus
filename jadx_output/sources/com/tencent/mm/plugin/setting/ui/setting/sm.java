package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class sm implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI f161547d;

    public sm(com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI) {
        this.f161547d = settingsSwitchAccountUI;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f161547d.f160685e.setTranslationY((-floatValue) * r0.getHeight());
    }
}
