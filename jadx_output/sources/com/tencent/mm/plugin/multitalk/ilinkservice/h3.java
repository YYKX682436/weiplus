package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f149599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f149600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149601f;

    public h3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, java.lang.Integer num, boolean z17) {
        this.f149601f = i4Var;
        this.f149599d = num;
        this.f149600e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149601f;
        int i17 = i4Var.f149637n;
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve: not in room, status: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.Integer num = this.f149599d;
        if (num.intValue() < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve: no subscribers, return,  status: %d", java.lang.Integer.valueOf(i4Var.f149637n));
            return;
        }
        int i18 = this.f149600e ? 640 : 480;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.bi6 bi6Var = new r45.bi6();
        bi6Var.f370787d = num.intValue();
        bi6Var.f370788e = i18;
        int A = i4Var.A(num.intValue());
        if (A == 102 || A == 101) {
            linkedList2.add(bi6Var);
        } else {
            linkedList.add(bi6Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "subscribeOneByUserMid, videoMembers memberId:%d", num);
        r45.ai6 ai6Var = i4Var.S1;
        ai6Var.f370027d = linkedList;
        if (A == 102 || A == 101) {
            bi6Var.f370788e = 240;
        }
        ai6Var.f370028e = linkedList2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "hy: subscribeOneByUserMid, videoMembers %s", ai6Var);
        com.tencent.mm.plugin.multitalk.ilinkservice.g0.d(i4Var.S1);
    }
}
