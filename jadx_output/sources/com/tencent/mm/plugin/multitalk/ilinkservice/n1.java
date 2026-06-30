package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f149728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149730f;

    public n1(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, java.util.ArrayList arrayList, java.lang.String str) {
        this.f149730f = i4Var;
        this.f149728d = arrayList;
        this.f149729e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149730f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i4Var.f149637n);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(i4Var.S);
        java.util.ArrayList arrayList = this.f149728d;
        java.lang.String str = this.f149729e;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "enter inviteSync. %s, %s, %d, %b", arrayList, str, valueOf, valueOf2);
        int i17 = i4Var.f149637n;
        if (i17 == 1 || i4Var.S || i17 == 3) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Multitalk.ILinkService", "hy: already in room or callee ack!");
            i4Var.Z = null;
            i4Var.V = com.tencent.mm.plugin.multitalk.ilinkservice.d4.ILinkErrEnterRepeated;
            i4Var.T();
            return;
        }
        i4Var.f149641p = new java.lang.String("wechat");
        i4Var.f149639o = com.tencent.mm.plugin.multitalk.ilinkservice.c4.ReasonUnknown;
        i4Var.f149642p0 = false;
        i4Var.X = false;
        i4Var.D1 = com.tencent.mm.plugin.multitalk.ilinkservice.e4.ILinkMemberRoleCreate;
        i4Var.S = true;
        i4Var.B1 = i4Var.f149656y0;
        i4Var.f149628h2 = java.lang.System.currentTimeMillis();
        i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.e2(i4Var, str, arrayList));
    }
}
