package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.c80 f149833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.w0 f149834e;

    public v0(com.tencent.mm.plugin.multitalk.ilinkservice.w0 w0Var, r45.c80 c80Var) {
        this.f149834e = w0Var;
        this.f149833d = c80Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.w0 w0Var = this.f149834e;
        java.util.Map map = w0Var.f149846a.f149634l2;
        r45.c80 c80Var = this.f149833d;
        r45.q07 q07Var = (r45.q07) ((java.util.concurrent.ConcurrentHashMap) map).get(java.lang.Long.valueOf(c80Var.f371364d));
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = w0Var.f149846a;
        if (q07Var == null) {
            java.util.Map map2 = i4Var.f149634l2;
            if (map2 == null || ((java.util.concurrent.ConcurrentHashMap) map2).size() <= 0) {
                return;
            }
            ((java.util.concurrent.ConcurrentHashMap) i4Var.f149634l2).clear();
            return;
        }
        i4Var.Q();
        i4Var.f149643p1 = q07Var.f383541d;
        i4Var.f149654x1 = q07Var.f383543f;
        i4Var.C1 = q07Var.f383547m;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "recv invite, roomid:%d callerid:%s, roomtype:%d, groupip:%s, sdkgroupid:%s", java.lang.Long.valueOf(c80Var.f371364d), c80Var.f371367g, java.lang.Integer.valueOf(c80Var.f371365e), i4Var.f149643p1, i4Var.f149654x1);
        java.util.Map map3 = i4Var.f149634l2;
        if (map3 != null && ((java.util.concurrent.ConcurrentHashMap) map3).size() > 0) {
            ((java.util.concurrent.ConcurrentHashMap) i4Var.f149634l2).clear();
        }
        i4Var.getClass();
        boolean Bi = com.tencent.mm.sdk.platformtools.l5.Bi();
        iq.b.r();
        iq.b.r();
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "danial: isOnSystemCalling:%b, %b", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(Bi));
        i4Var.getClass();
        android.os.Bundle bundle = (android.os.Bundle) com.tencent.mm.ipcinvoker.d0.f("com.tencent.mm", null, com.tencent.mm.plugin.multitalk.ilinkservice.g4.class);
        boolean z17 = bundle != null ? bundle.getBoolean("is_in_voip") : false;
        boolean z18 = z17 || p21.i.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve: isOnOtherCalling:%b,%b,%b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(p21.i.a()));
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "other call is on, hangup!!!");
            i4Var.getClass();
            i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.c1(i4Var, 3));
            return;
        }
        com.tencent.mm.plugin.multitalk.model.e3.Ri().O(i4Var.f149643p1, 2);
        i4Var.f149623f.e();
        com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var = i4Var.f149623f;
        c0Var.f149518b = c80Var.f371364d;
        c0Var.f149524h = i4Var.f149654x1;
        c0Var.f149520d = i4Var.f149643p1;
        java.util.LinkedList linkedList = i4Var.C1;
        c0Var.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.y07 y07Var = (r45.y07) it.next();
            c0Var.f(y07Var.f390689d, y07Var.f390690e, 1);
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.q0 q0Var = new com.tencent.mm.plugin.multitalk.ilinkservice.q0(this);
        i4Var.K = q0Var;
        i4Var.L = new com.tencent.mm.plugin.multitalk.ilinkservice.s0(this);
        i4Var.R = new com.tencent.mm.plugin.multitalk.ilinkservice.u0(this);
        i4Var.f149621e.b(12, q0Var);
        i4Var.f149621e.b(13, i4Var.L);
        i4Var.f149621e.b(17, i4Var.R);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.multitalk.ilinkservice.w wVar = new com.tencent.mm.plugin.multitalk.ilinkservice.w();
        java.util.Iterator it6 = i4Var.C1.iterator();
        while (it6.hasNext()) {
            r45.y07 y07Var2 = (r45.y07) it6.next();
            com.tencent.mm.plugin.multitalk.ilinkservice.w wVar2 = new com.tencent.mm.plugin.multitalk.ilinkservice.w();
            java.lang.String str = y07Var2.f390690e;
            wVar2.f149841b = str;
            java.lang.String str2 = y07Var2.f390689d;
            wVar2.f149842c = str2;
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "a member: %s, sdkusername:%s", str2, str);
            if (c80Var.f371367g.equals(y07Var2.f390690e)) {
                wVar2.f149844e = 1;
                java.lang.String str3 = y07Var2.f390689d;
                i4Var.B1 = str3;
                i4Var.f149623f.f149522f = str3;
            } else {
                wVar2.f149844e = 2;
            }
            wVar2.f149843d = i4Var.B1;
            if (y07Var2.f390689d.equals(i4Var.f149656y0)) {
                wVar = wVar2;
            }
            arrayList.add(wVar2);
        }
        java.lang.String str4 = i4Var.B1;
        if (str4 != null) {
            wVar.f149843d = str4;
        }
        i4Var.f149623f.f149521e = arrayList;
        com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.Ack();
    }
}
