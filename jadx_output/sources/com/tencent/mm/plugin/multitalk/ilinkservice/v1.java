package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b80 f149835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.w1 f149836e;

    public v1(com.tencent.mm.plugin.multitalk.ilinkservice.w1 w1Var, r45.b80 b80Var) {
        this.f149836e = w1Var;
        this.f149835d = b80Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.w1 w1Var;
        r45.b80 b80Var = this.f149835d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "update members, imroomid:%d roomid:%d memberNum:%d seq:%d status:%d", java.lang.Long.valueOf(b80Var.f370622d), java.lang.Long.valueOf(b80Var.f370623e), java.lang.Integer.valueOf(b80Var.f370624f.size()), java.lang.Integer.valueOf(b80Var.f370625g), java.lang.Integer.valueOf(b80Var.f370626h));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = b80Var.f370624f.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            w1Var = this.f149836e;
            if (!hasNext) {
                break;
            }
            r45.a80 a80Var = (r45.a80) it.next();
            w1Var.f149847a.f149623f.f(a80Var.f369813f, a80Var.f369812e, 2);
            com.tencent.mm.plugin.multitalk.ilinkservice.x c17 = w1Var.f149847a.f149623f.c(a80Var.f369812e);
            if (c17 == null) {
                linkedList.add(a80Var.f369812e);
            } else if (c17.f149853c < 2) {
                linkedList2.add(a80Var.f369812e);
            }
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voip_ilink_getsdkuserinfo_mode, 0);
        boolean z17 = Ni != 2 && (linkedList.size() > 0 || (Ni == 0 && linkedList2.size() > 0));
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "needQueryOpenid is %b getSdkUserInfoMode is %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(Ni));
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = w1Var.f149847a;
        i4Var.R1 = true;
        if (!z17) {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.l(i4Var, b80Var, null);
            return;
        }
        linkedList.addAll(linkedList2);
        com.tencent.mm.ipcinvoker.wx_extension.x xVar = (com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = w1Var.f149847a;
        com.tencent.mm.plugin.multitalk.ilinkservice.v vVar = i4Var2.f149629i;
        long j17 = i4Var2.f149633l1;
        java.lang.String str = i4Var2.f149643p1;
        vVar.getClass();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.o07();
        lVar.f70665b = new r45.p07();
        lVar.f70667d = 3602;
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipmtgetsdkuserinfo";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.o07 o07Var = (r45.o07) a17.f70710a.f70684a;
        o07Var.f381806d = linkedList;
        o07Var.f381807e = str;
        ((h80.i) xVar).wi(a17, new com.tencent.mm.plugin.multitalk.ilinkservice.u1(this));
    }
}
