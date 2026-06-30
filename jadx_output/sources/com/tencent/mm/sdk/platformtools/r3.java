package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.s3 f192954d;

    public r3(com.tencent.mm.sdk.platformtools.u3 u3Var, com.tencent.mm.sdk.platformtools.s3 s3Var) {
        this.f192954d = s3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f192954d.a();
        com.tencent.mm.sdk.platformtools.u3.b().postAtFrontOfQueue(new com.tencent.mm.sdk.platformtools.q3(this));
    }

    public java.lang.String toString() {
        return super.toString() + "|" + this.f192954d.toString();
    }
}
