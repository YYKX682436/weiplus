package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y70 f149586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f149587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.h1 f149588f;

    public g1(com.tencent.mm.plugin.multitalk.ilinkservice.h1 h1Var, r45.y70 y70Var, int i17) {
        this.f149588f = h1Var;
        this.f149586d = y70Var;
        this.f149587e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.y70 y70Var = this.f149586d;
        java.util.Iterator it = y70Var.f390836g.iterator();
        while (it.hasNext()) {
            r45.x70 x70Var = (r45.x70) it.next();
            r45.y07 y07Var = new r45.y07();
            y07Var.f390689d = x70Var.f389837e;
            y07Var.f390690e = x70Var.f389836d;
            y07Var.f390691f = x70Var.f389839g;
            linkedList.add(y07Var);
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.h1 h1Var = this.f149588f;
        java.util.LinkedList k17 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.k(h1Var.f149597a, linkedList, 4);
        if (k17.size() == linkedList.size() && !k17.isEmpty()) {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.m(h1Var.f149597a, true);
            com.tencent.mm.plugin.multitalk.ilinkservice.u4 u4Var = h1Var.f149597a.Z;
            if (u4Var != null) {
                u4Var.a(this.f149587e, null);
                return;
            }
            return;
        }
        if (!k17.isEmpty()) {
            h1Var.f149597a.Y.f(k17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "invite success, roomid:%d, selfmemberid:%d, selfname:%s", java.lang.Long.valueOf(y70Var.f390833d), java.lang.Integer.valueOf(y70Var.f390835f), h1Var.f149597a.f149656y0);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = h1Var.f149597a;
        i4Var.f149637n = 1;
        com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var = i4Var.f149623f;
        c0Var.f149518b = y70Var.f390833d;
        c0Var.f149522f = i4Var.f149656y0;
        java.lang.String str = y70Var.f390834e;
        i4Var.f149654x1 = str;
        c0Var.f149524h = str;
        i4Var.getClass();
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = h1Var.f149597a;
        i4Var2.f149638n2 = true;
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = i4Var2.Y;
        com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var2 = i4Var2.f149623f;
        cVar.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.multitalk.ilinkservice.k(cVar, c0Var2));
    }
}
