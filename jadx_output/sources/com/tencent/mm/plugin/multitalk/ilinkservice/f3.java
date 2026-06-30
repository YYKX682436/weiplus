package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f149578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f149579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149580f;

    public f3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f149580f = i4Var;
        this.f149578d = arrayList;
        this.f149579e = arrayList2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149580f;
        int i17 = i4Var.f149637n;
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve: not in room, status: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = this.f149578d.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mm.plugin.multitalk.ilinkservice.w b17 = i4Var.f149623f.b(str);
            if (b17 != null) {
                int i18 = b17.f149840a;
                r45.bi6 bi6Var = new r45.bi6();
                bi6Var.f370787d = i18;
                bi6Var.f370788e = 480;
                int A = i4Var.A(i18);
                if (A == 102 || A == 101) {
                    bi6Var.f370788e = 240;
                    linkedList2.add(bi6Var);
                } else {
                    linkedList.add(bi6Var);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "subscribeByUserList, small memberId:%d,memberName:%s,len:%d", java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(bi6Var.f370788e));
            }
        }
        java.util.Iterator it6 = this.f149579e.iterator();
        while (it6.hasNext()) {
            java.lang.String str2 = (java.lang.String) it6.next();
            com.tencent.mm.plugin.multitalk.ilinkservice.w b18 = i4Var.f149623f.b(str2);
            if (b18 != null) {
                int i19 = b18.f149840a;
                r45.bi6 bi6Var2 = new r45.bi6();
                bi6Var2.f370787d = i19;
                bi6Var2.f370788e = 640;
                int A2 = i4Var.A(i19);
                if (A2 == 102 || A2 == 101) {
                    bi6Var2.f370788e = 1920;
                    linkedList2.add(bi6Var2);
                } else {
                    linkedList.add(bi6Var2);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "subscribeByUserList, small memberId:%d,memberName:%s,len:%d", java.lang.Integer.valueOf(i19), str2, java.lang.Integer.valueOf(bi6Var2.f370788e));
            }
        }
        r45.ai6 ai6Var = i4Var.S1;
        ai6Var.f370027d = linkedList;
        ai6Var.f370028e = linkedList2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "hy: subscribeByUsernames, videoMembers %s", ai6Var);
        com.tencent.mm.plugin.multitalk.ilinkservice.g0.d(i4Var.S1);
    }
}
