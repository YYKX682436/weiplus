package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f149779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149780e;

    public s2(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, java.util.LinkedList linkedList) {
        this.f149780e = i4Var;
        this.f149779d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.r2 r2Var = new com.tencent.mm.plugin.multitalk.ilinkservice.r2(this);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149780e;
        i4Var.Q = r2Var;
        int i17 = i4Var.f149645q;
        java.lang.String str = i4Var.f149623f.f149520d;
        int i18 = i4Var.f149657y1;
        java.lang.String[] strArr = com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149583a;
        r45.w70 w70Var = new r45.w70();
        w70Var.f388919d = this.f149779d;
        w70Var.f388920e = i17;
        w70Var.f388922g = i18;
        w70Var.f388923h = str;
        w70Var.f388924i = "";
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "steve: addmember ret:" + com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.Add(w70Var.toByteArray(), w70Var.toByteArray().length));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Multitalk.ILinkNativeEngine", e17, "Invite exception", new java.lang.Object[0]);
        }
        i4Var.f149621e.b(18, i4Var.Q);
        i4Var.f149621e.b(19, i4Var.Q);
        i4Var.Z();
        i4Var.Z = null;
    }
}
