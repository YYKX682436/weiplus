package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f149795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f149797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.u1 f149798h;

    public t1(com.tencent.mm.plugin.multitalk.ilinkservice.u1 u1Var, int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        this.f149798h = u1Var;
        this.f149794d = i17;
        this.f149795e = i18;
        this.f149796f = str;
        this.f149797g = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.protobuf.f fVar;
        int i17 = this.f149794d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = this.f149795e;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "on cgiGetSDKUserInfo result: %d, %d, %s", valueOf, java.lang.Integer.valueOf(i18), this.f149796f);
        com.tencent.mm.plugin.multitalk.ilinkservice.u1 u1Var = this.f149798h;
        if (i17 != 0 || i18 != 0 || (fVar = this.f149797g.f70711b.f70700a) == null) {
            u1Var.f149828a.f149836e.f149847a.R1 = false;
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkService", "hy: cgiGetSDKUserInfo fail, errType:" + i17 + ",errCode:" + i18);
            return;
        }
        java.util.LinkedList linkedList = ((r45.p07) fVar).f382650d;
        com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var = u1Var.f149828a.f149836e.f149847a.f149623f;
        c0Var.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.y07 y07Var = (r45.y07) it.next();
            c0Var.f(y07Var.f390689d, y07Var.f390690e, 2);
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.v1 v1Var = u1Var.f149828a;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.l(v1Var.f149836e.f149847a, v1Var.f149835d, null);
    }
}
