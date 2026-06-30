package com.tencent.mm.ui.tools;

/* loaded from: classes13.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f210644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f210645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.k0 f210647g;

    public q0(android.content.Context context, android.net.Uri uri, java.lang.String str, com.tencent.mm.ui.tools.k0 k0Var) {
        this.f210644d = context;
        this.f210645e = uri;
        this.f210646f = str;
        this.f210647g = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String a17 = com.tencent.mm.ui.tools.r0.a(this.f210644d, this.f210645e, this.f210646f);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.tools.p0(this.f210647g, a17));
    }
}
