package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.k4 f192724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f192725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.j4 f192726f;

    public h4(com.tencent.mm.sdk.platformtools.j4 j4Var, com.tencent.mm.sdk.platformtools.k4 k4Var, java.lang.Runnable runnable) {
        this.f192726f = j4Var;
        this.f192724d = k4Var;
        this.f192725e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f192726f.f192764f.f192834q) {
            com.tencent.mm.sdk.platformtools.j4.a(this.f192726f, this.f192724d);
        }
        synchronized (this.f192726f.f192764f) {
            com.tencent.mm.sdk.platformtools.l4 l4Var = this.f192726f.f192764f;
            l4Var.f192830m--;
        }
        java.lang.Runnable runnable = this.f192725e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
