package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f149591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f149592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149593f;

    public g3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, java.util.ArrayList arrayList, boolean z17) {
        this.f149593f = i4Var;
        this.f149591d = arrayList;
        this.f149592e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149593f;
        int i17 = i4Var.f149637n;
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve: not in room, status: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        java.util.ArrayList arrayList = this.f149591d;
        if (arrayList == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve: no subscribers, return,  status: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        int size = arrayList.size();
        boolean z17 = this.f149592e;
        if (size != 1 || z17) {
            int i18 = z17 ? 640 : 480;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                r45.bi6 bi6Var = new r45.bi6();
                bi6Var.f370787d = num.intValue();
                bi6Var.f370788e = i18;
                int A = i4Var.A(num.intValue());
                if (A == 102 || A == 101) {
                    bi6Var.f370788e = 240;
                    linkedList2.add(bi6Var);
                } else {
                    linkedList.add(bi6Var);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "subscribeByUserMids, videoMembers memberId:%d", num);
            }
            r45.ai6 ai6Var = i4Var.S1;
            ai6Var.f370027d = linkedList;
            ai6Var.f370028e = linkedList2;
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "hy: subscribeByUserMids, videoMembers %s", ai6Var);
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.d(i4Var.S1);
            return;
        }
        int i19 = i4Var.f149637n;
        if (i19 != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve: not in room, status: %d", java.lang.Integer.valueOf(i19));
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList a17 = i4Var.f149623f.a();
        if (a17 == null || a17.size() == 0) {
            return;
        }
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        java.util.Iterator it6 = a17.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.multitalk.ilinkservice.w wVar = (com.tencent.mm.plugin.multitalk.ilinkservice.w) it6.next();
            if (i4Var.f149656y0.equals(wVar.f149842c)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "subscribeAll, skip myself memberId:%d,memberName%s", java.lang.Integer.valueOf(wVar.f149840a), wVar.f149842c);
            } else {
                int i27 = wVar.f149840a;
                r45.bi6 bi6Var2 = new r45.bi6();
                bi6Var2.f370787d = i27;
                bi6Var2.f370788e = 480;
                int A2 = i4Var.A(i27);
                if (A2 == 102 || A2 == 101) {
                    bi6Var2.f370788e = 240;
                    linkedList4.add(bi6Var2);
                } else {
                    linkedList3.add(bi6Var2);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "subscribeAll, videoMembers memberId:%d,memberName%s", java.lang.Integer.valueOf(i27), wVar.f149842c);
            }
        }
        r45.ai6 ai6Var2 = i4Var.S1;
        ai6Var2.f370027d = linkedList3;
        ai6Var2.f370028e = linkedList4;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "hy: subscribe, videoMembers %s", arrayList2);
        com.tencent.mm.plugin.multitalk.ilinkservice.g0.d(ai6Var2);
    }
}
