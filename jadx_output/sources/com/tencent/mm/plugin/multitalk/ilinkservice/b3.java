package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class b3 implements com.tencent.mm.plugin.multitalk.ilinkservice.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i3 f149512a;

    public b3(com.tencent.mm.plugin.multitalk.ilinkservice.i3 i3Var) {
        this.f149512a = i3Var;
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "joinSync initEngine done! %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            if (i18 != -66) {
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.m(this.f149512a.f149611f, true);
            }
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149512a.f149611f;
            i4Var.Y.c(2, i4Var.f149643p1, null);
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkService", "joinSync initEngine fail errtype %d errcode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.i3 i3Var = this.f149512a;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = i3Var.f149611f;
        java.lang.String str2 = i3Var.f149609d;
        java.lang.String str3 = i3Var.f149610e;
        i4Var2.f149643p1 = str3;
        i4Var2.f149654x1 = str2;
        i4Var2.D1 = com.tencent.mm.plugin.multitalk.ilinkservice.e4.ILinkMemberRoleJoin;
        i4Var2.f149642p0 = false;
        i4Var2.f149623f.f149517a.clear();
        i4Var2.Q();
        i4Var2.w();
        com.tencent.mm.plugin.multitalk.ilinkservice.u3 u3Var = new com.tencent.mm.plugin.multitalk.ilinkservice.u3(i4Var2, str3, str2);
        i4Var2.A = u3Var;
        i4Var2.B = new com.tencent.mm.plugin.multitalk.ilinkservice.w3(i4Var2);
        i4Var2.C = new com.tencent.mm.plugin.multitalk.ilinkservice.z3(i4Var2);
        i4Var2.D = new com.tencent.mm.plugin.multitalk.ilinkservice.a4(i4Var2);
        com.tencent.mm.plugin.multitalk.ilinkservice.f0 f0Var = i4Var2.f149621e;
        f0Var.b(3, u3Var);
        f0Var.b(4, i4Var2.B);
        f0Var.b(22, i4Var2.C);
        f0Var.b(23, i4Var2.D);
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "join sdkGroupId:%s", str2);
        if (gq4.v.Ni()) {
            i4Var2.G();
        }
        i4Var2.Z();
        int i27 = i4Var2.f149657y1;
        java.lang.String[] strArr = com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149583a;
        r45.z70 z70Var = new r45.z70();
        z70Var.f391759e = str2;
        z70Var.f391760f = i4Var2.f149645q;
        z70Var.f391763i = i27;
        z70Var.f391762h = true;
        z70Var.f391765n = "";
        z70Var.f391766o = str3;
        try {
            i19 = com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.JoinRoom(z70Var.toByteArray(), z70Var.toByteArray().length);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Multitalk.ILinkNativeEngine", e17, "JoinRoom exception", new java.lang.Object[0]);
            i19 = -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "joinRoom ret:" + i19 + ", groupId:" + str2);
        if (i19 == 0) {
            i4Var2.f149636m2 = true;
            i4Var2.W(new com.tencent.mm.plugin.multitalk.ilinkservice.b4(i4Var2));
        }
        synchronized (this.f149512a.f149611f.Q1) {
            java.util.Iterator it = this.f149512a.f149611f.Q1.iterator();
            while (it.hasNext()) {
                r45.q07 q07Var = (r45.q07) it.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "joinSync deal with the cached invite notify");
                this.f149512a.f149611f.Z();
                byte[] bArr = q07Var.f383546i.f192156a;
                com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.RecvNotify(bArr, bArr.length, this.f149512a.f149611f.f149657y1);
            }
            this.f149512a.f149611f.Q1.clear();
        }
    }
}
