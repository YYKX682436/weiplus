package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f202502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.x0 f202504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.w0 f202505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.z0 f202506h;

    public v0(com.tencent.mm.ui.chatting.presenter.z0 z0Var, long j17, java.lang.String str, com.tencent.mm.ui.chatting.presenter.x0 x0Var, com.tencent.mm.ui.chatting.presenter.w0 w0Var) {
        this.f202506h = z0Var;
        this.f202502d = j17;
        this.f202503e = str;
        this.f202504f = x0Var;
        this.f202505g = w0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.z0 z0Var = this.f202506h;
        if (z0Var.f202572s.get()) {
            return;
        }
        java.lang.String str = z0Var.f202542e;
        long j17 = this.f202502d;
        te5.i a17 = te5.j.f418686a.a(pt0.f0.Li(str, j17), this.f202503e, z0Var.f202541d);
        z0Var.f202573t.put(java.lang.Long.valueOf(j17), a17);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.presenter.u0(this, a17));
    }
}
