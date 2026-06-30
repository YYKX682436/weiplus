package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.p70 f149856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f149857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.y1 f149858f;

    public x1(com.tencent.mm.plugin.multitalk.ilinkservice.y1 y1Var, r45.p70 p70Var, int i17) {
        this.f149858f = y1Var;
        this.f149856d = p70Var;
        this.f149857e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.p70 p70Var = this.f149856d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "update avmembers, imroomid:%d roomid:%d memberList:%s", java.lang.Long.valueOf(p70Var.f382810d), java.lang.Long.valueOf(p70Var.f382811e), p70Var.f382812f);
        com.tencent.mm.plugin.multitalk.ilinkservice.y1 y1Var = this.f149858f;
        if (y1Var.f149861a.f149637n != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "hy: not in room. do not notify");
            return;
        }
        if (this.f149857e != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkService", "hy: invalid avmember list change. will ignore");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = p70Var.f382812f.iterator();
        while (it.hasNext()) {
            r45.o70 o70Var = (r45.o70) it.next();
            if ((o70Var.f382001e & 2) != 0) {
                arrayList.add(java.lang.Integer.valueOf(o70Var.f382000d));
            }
            int i17 = o70Var.f382001e;
            if ((i17 & 4) != 0 || (i17 & 8) != 0) {
                arrayList2.add(java.lang.Integer.valueOf(o70Var.f382000d));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "avmemberchange, mid:%d, avstatus:%d", java.lang.Integer.valueOf(o70Var.f382000d), java.lang.Integer.valueOf(o70Var.f382001e));
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = y1Var.f149861a;
        if (!i4Var.R1) {
            i4Var.Y.e(i4Var.f149623f, p70Var.f382812f);
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = y1Var.f149861a;
        java.util.LinkedList linkedList = p70Var.f382812f;
        i4Var2.P1 = linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "update avmembers, cachedMemberList:%s", linkedList);
    }
}
