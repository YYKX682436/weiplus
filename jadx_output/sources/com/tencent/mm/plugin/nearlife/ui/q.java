package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes9.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f152343d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f152344e;

    public q(java.lang.String str, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f152343d = str;
        this.f152344e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] u07 = com.tencent.mm.sdk.platformtools.t8.u0(this.f152343d);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.obj = u07;
        this.f152344e.sendMessage(obtain);
    }
}
