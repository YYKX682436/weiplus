package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public final class k7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f192812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f192813f;

    public k7(java.lang.String str, long j17, boolean z17) {
        this.f192811d = str;
        this.f192812e = j17;
        this.f192813f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onContentChange fileAdded, filePath: ");
        java.lang.String str = this.f192811d;
        sb6.append(str);
        sb6.append(", screenShotTime: ");
        long j17 = this.f192812e;
        sb6.append(j17);
        sb6.append(", isPending: ");
        boolean z17 = this.f192813f;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", sb6.toString());
        com.tencent.mm.sdk.platformtools.m7.a(str, j17, z17);
    }
}
