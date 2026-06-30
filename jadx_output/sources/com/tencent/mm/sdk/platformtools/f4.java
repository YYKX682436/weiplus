package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.k4 f192669d;

    public f4(com.tencent.mm.sdk.platformtools.j4 j4Var, com.tencent.mm.sdk.platformtools.k4 k4Var) {
        this.f192669d = k4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f192669d.f192807e.await();
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
