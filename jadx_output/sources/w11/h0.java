package w11;

/* loaded from: classes4.dex */
public class h0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f442038d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f442039e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final int f442040f;

    /* renamed from: g, reason: collision with root package name */
    public final int f442041g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442042h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f442043i;

    /* renamed from: m, reason: collision with root package name */
    public final int f442044m;

    /* renamed from: n, reason: collision with root package name */
    public final int f442045n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f442046o;

    public h0(java.util.List list, int i17, int i18, int i19) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f442046o = linkedList;
        this.f442038d = list;
        this.f442040f = i17;
        this.f442041g = i18;
        this.f442045n = list.size();
        this.f442044m = i19;
        linkedList.addAll(list);
    }

    public r45.hg H() {
        return (r45.hg) this.f442043i.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        int i17;
        this.f442042h = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/batchmodcontacttype";
        lVar.f70667d = 3990;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70664a = new r45.gg();
        lVar.f70665b = new r45.hg();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f442043i = a17;
        r45.gg ggVar = (r45.gg) a17.f70710a.f70684a;
        ggVar.f375206e = new java.util.LinkedList();
        int i18 = 0;
        while (true) {
            int i19 = this.f442044m;
            i17 = this.f442040f;
            if (i18 >= i19) {
                break;
            }
            java.util.List list = this.f442038d;
            if (list.size() <= 0) {
                break;
            }
            r45.un4 un4Var = new r45.un4();
            un4Var.f387494d = (java.lang.String) list.remove(0);
            un4Var.f387495e = i17;
            un4Var.f387496f = this.f442041g;
            ggVar.f375206e.add(un4Var);
            i18++;
        }
        ggVar.f375205d = ggVar.f375206e.size();
        if (i17 == 134217728 || i17 == 33554432) {
            ggVar.f375207f = 1;
        }
        return dispatch(sVar, this.f442043i, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3990;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchModContactType", "errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        int i27 = 0;
        if (i18 == 0 && i19 == 0) {
            java.util.Iterator it = ((r45.hg) this.f442043i.f70711b.f70700a).f376127e.iterator();
            while (it.hasNext()) {
                r45.vn4 vn4Var = (r45.vn4) it.next();
                if (com.tencent.mars.xlog.Log.isDebug()) {
                    int i28 = vn4Var.f388396d;
                    java.lang.String str2 = vn4Var.f388397e.f387494d;
                }
                if (vn4Var.f388396d == 0) {
                    gm0.j1.i();
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(vn4Var.f388397e.f387494d, true);
                    com.tencent.mars.xlog.Log.isDebug();
                    if (n17 != null && n17.r2()) {
                        r45.un4 un4Var = vn4Var.f388397e;
                        int i29 = un4Var.f387495e;
                        if (i29 != 8388608) {
                            if (i29 != 33554432) {
                                if (i29 == 134217728) {
                                    if (un4Var.f387496f == 1) {
                                        n17.setType(n17.getType() | 134217728);
                                    } else {
                                        n17.setType(n17.getType() & (-134217729));
                                    }
                                }
                            } else if (un4Var.f387496f == 1) {
                                n17.setType(n17.getType() | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62);
                            } else {
                                n17.setType(n17.getType() & (-33554433));
                            }
                        } else if (un4Var.f387496f == 1) {
                            n17.i3();
                        } else {
                            n17.setType(n17.getType() & (-8388609));
                        }
                        gm0.j1.i();
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(n17.d1(), n17);
                        ((java.util.LinkedList) this.f442039e).add(n17.d1());
                    }
                } else {
                    i27++;
                }
            }
            if (i27 == 0 && this.f442038d.size() > 0) {
                if (doScene(dispatcher(), this.f442042h) < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchModContactType", "onGYNetEnd : doScene fail");
                    this.f442042h.onSceneEnd(3, -1, "", this);
                    return;
                }
                return;
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f442042h;
        if (i27 > 0) {
            i19 = -3500;
        }
        u0Var.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 10;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
