package com.tencent.mm.plugin.qrcode.model;

/* loaded from: classes.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f154964d;

    public k(java.lang.Runnable runnable) {
        this.f154964d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable = this.f154964d;
        if (runnable != null) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(runnable, 200L);
        }
    }
}
