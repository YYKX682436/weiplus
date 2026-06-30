package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y70 f149748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.r2 f149749f;

    public q2(com.tencent.mm.plugin.multitalk.ilinkservice.r2 r2Var, int i17, r45.y70 y70Var) {
        this.f149749f = r2Var;
        this.f149747d = i17;
        this.f149748e = y70Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f149747d;
        boolean z17 = i17 == 0;
        com.tencent.mm.plugin.multitalk.ilinkservice.r2 r2Var = this.f149749f;
        r45.y70 y70Var = this.f149748e;
        if (y70Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "roomInfo is NULL, errcode:%d", java.lang.Integer.valueOf(i17));
            r2Var.f149757a.f149780e.Y.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "add member error.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "addmember errcode:%d, roomid:%d, selfmemberid:%d, selfname:%s, groupid:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(y70Var.f390833d), java.lang.Integer.valueOf(y70Var.f390835f), r2Var.f149757a.f149780e.f149656y0, y70Var.f390834e);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = y70Var.f390836g;
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            r45.x70 x70Var = (r45.x70) it.next();
            r45.y07 y07Var = new r45.y07();
            y07Var.f390689d = x70Var.f389837e;
            y07Var.f390690e = x70Var.f389836d;
            y07Var.f390691f = x70Var.f389839g;
            linkedList.add(y07Var);
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.s2 s2Var = r2Var.f149757a;
        java.util.LinkedList k17 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.k(s2Var.f149780e, linkedList, 4);
        if (k17.size() == linkedList2.size()) {
            s2Var.f149780e.Y.f(k17);
            return;
        }
        if (!k17.isEmpty()) {
            s2Var.f149780e.Y.f(k17);
        }
        s2Var.f149780e.Y.getClass();
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "add member ok.");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "add member error.");
        }
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "add fail %d", java.lang.Integer.valueOf(i17));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "danialguo add success, roomid:%d selfmemberid:%d ", java.lang.Long.valueOf(y70Var.f390833d), java.lang.Integer.valueOf(y70Var.f390835f));
        }
    }
}
