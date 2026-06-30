package com.tencent.mm.splash;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.splash.SplashActivity f193665d;

    public m(com.tencent.mm.splash.SplashActivity splashActivity) {
        this.f193665d = splashActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.splash.SplashActivity splashActivity = this.f193665d;
        splashActivity.finish();
        int i17 = com.tencent.mm.splash.SplashActivity.f193627h;
        splashActivity.getClass();
        if (com.tencent.mm.splash.j.f193655n == null || !com.tencent.mm.ui.bk.S()) {
            splashActivity.overridePendingTransition(com.tencent.mm.R.anim.f477900eo, com.tencent.mm.R.anim.f477899en);
        } else {
            splashActivity.overridePendingTransition(com.tencent.mm.R.anim.f477900eo, com.tencent.mm.R.anim.f477900eo);
        }
    }
}
