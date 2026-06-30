package com.tencent.mm.ui.tools;

/* loaded from: classes13.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f210611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.k0 f210613f;

    public o0(android.content.Context context, java.lang.String str, com.tencent.mm.ui.tools.k0 k0Var) {
        this.f210611d = context;
        this.f210612e = str;
        this.f210613f = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String a17 = com.tencent.mm.ui.tools.r0.a(this.f210611d, com.tencent.mm.sdk.platformtools.v6.d(this.f210611d, this.f210612e), this.f210612e);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.tools.n0(this.f210613f, a17));
    }
}
