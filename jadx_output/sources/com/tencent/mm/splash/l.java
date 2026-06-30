package com.tencent.mm.splash;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.splash.SplashActivity f193664d;

    public l(com.tencent.mm.splash.SplashActivity splashActivity) {
        this.f193664d = splashActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f193664d.finish();
    }
}
