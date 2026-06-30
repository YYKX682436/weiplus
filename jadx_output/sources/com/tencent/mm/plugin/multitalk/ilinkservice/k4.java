package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.m4 f149677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f149678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f149679f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.j4 f149680g;

    public k4(com.tencent.mm.plugin.multitalk.ilinkservice.n4 n4Var, com.tencent.mm.plugin.multitalk.ilinkservice.m4 m4Var, int i17, int i18, java.lang.String str, com.tencent.mm.plugin.multitalk.ilinkservice.j4 j4Var, boolean z17) {
        this.f149677d = m4Var;
        this.f149678e = i17;
        this.f149679f = i18;
        this.f149680g = j4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.j4 j4Var;
        com.tencent.mm.plugin.multitalk.ilinkservice.d1 d1Var = (com.tencent.mm.plugin.multitalk.ilinkservice.d1) this.f149677d;
        d1Var.getClass();
        if (this.f149678e == 0 && this.f149679f == 0 && (j4Var = this.f149680g) != null && j4Var.a()) {
            java.lang.String str = j4Var.f149665a;
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.UpdateAuthKey(str.getBytes(), str.getBytes().length);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Multitalk.ILinkService", "hy: refresh session key error!");
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = d1Var.f149542a.f149559d.f149576a;
        com.tencent.mm.plugin.multitalk.ilinkservice.c4 c4Var = com.tencent.mm.plugin.multitalk.ilinkservice.c4.ReasonSessionUpdateFailed;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        i4Var.y(c4Var);
    }
}
