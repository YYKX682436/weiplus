package r61;

/* loaded from: classes11.dex */
public class h1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f392878d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392879e = null;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f392880f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f392881g;

    public h1() {
        H();
        r45.gi3 gi3Var = (r45.gi3) this.f392878d.f70710a.f70684a;
        gi3Var.f375279e = "";
        gi3Var.f375283i = null;
        gi3Var.f375282h = 0;
        gi3Var.f375281g = null;
        gi3Var.f375280f = 0;
        gi3Var.f375278d = 0;
        gi3Var.f375284m = 1;
    }

    public final void H() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gi3();
        lVar.f70665b = new r45.hi3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getmfriend";
        lVar.f70667d = com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f392878d = lVar.a();
    }

    public final void I(r61.a aVar, r45.je4 je4Var) {
        aVar.f392805u = je4Var.f377747f;
        aVar.f392806v = je4Var.f377748g;
        aVar.f392807w = je4Var.f377749h;
        aVar.f392808x = je4Var.f377750i;
        aVar.f392809y = je4Var.f377751m;
        aVar.f392810z = je4Var.f377752n;
        aVar.A = je4Var.f377753o;
        aVar.B = je4Var.f377755q;
        aVar.D = je4Var.f377757s;
        aVar.C = je4Var.f377756r;
        aVar.E = je4Var.f377759u;
        aVar.F = je4Var.f377760v;
        r45.cb6 cb6Var = je4Var.f377758t;
        if (cb6Var != null) {
            aVar.G = cb6Var.f371428d;
            aVar.H = cb6Var.f371429e;
            aVar.I = cb6Var.f371430f;
        }
        r45.va0 va0Var = je4Var.f377761w;
        if (va0Var != null) {
            aVar.f392784J = va0Var.f388021d;
            aVar.K = va0Var.f388022e;
            aVar.L = va0Var.f388023f;
            aVar.M = va0Var.f388024g;
        }
    }

    public void J() {
        r45.gi3 gi3Var = (r45.gi3) this.f392878d.f70710a.f70684a;
        gi3Var.f375279e = (java.lang.String) gm0.j1.u().c().l(65828, null);
        gi3Var.f375278d = 1;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f392879e = u0Var;
        r45.gi3 gi3Var = (r45.gi3) this.f392878d.f70710a.f70684a;
        if (gi3Var.f375278d == 2) {
            java.util.List<java.lang.String> list = this.f392881g;
            java.util.List<java.lang.String> list2 = this.f392880f;
            if ((list2 == null || list2.size() == 0) && (list == null || list.size() == 0)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetMFriend", "doScene failed, mobile list and email list empty.");
                return -1;
            }
            if (list2 != null && list2.size() > 0) {
                list2.size();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (java.lang.String str : list2) {
                    r45.en4 en4Var = new r45.en4();
                    en4Var.f373615d = str;
                    linkedList.add(en4Var);
                }
                gi3Var.f375281g = linkedList;
                gi3Var.f375280f = linkedList.size();
            }
            if (list != null && list.size() > 0) {
                list.size();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                for (java.lang.String str2 : list) {
                    r45.ie4 ie4Var = new r45.ie4();
                    ie4Var.f376969d = str2;
                    linkedList2.add(ie4Var);
                }
                gi3Var.f375283i = linkedList2;
                gi3Var.f375282h = linkedList2.size();
            }
        }
        return dispatch(sVar, this.f392878d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022f  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r24, int r25, int r26, java.lang.String r27, com.tencent.mm.network.v0 r28, byte[] r29) {
        /*
            Method dump skipped, instructions count: 1321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r61.h1.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    public h1(java.util.List list, java.util.List list2) {
        H();
        if ((list == null || list.size() == 0) && (list2 == null || list2.size() == 0)) {
            return;
        }
        this.f392880f = list;
        this.f392881g = list2;
        r45.gi3 gi3Var = (r45.gi3) this.f392878d.f70710a.f70684a;
        gi3Var.f375279e = "";
        gi3Var.f375278d = 2;
        gi3Var.f375284m = 1;
    }
}
