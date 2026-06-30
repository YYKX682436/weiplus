package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f192717d;

    public g4(com.tencent.mm.sdk.platformtools.j4 j4Var, java.lang.Runnable runnable) {
        this.f192717d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable = this.f192717d;
        runnable.run();
        com.tencent.mm.sdk.platformtools.j6.f192765a.remove(runnable);
    }
}
