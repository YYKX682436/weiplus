package r61;

/* loaded from: classes4.dex */
public class o1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f392930d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392931e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f392932f;

    /* renamed from: g, reason: collision with root package name */
    public final int f392933g;

    /* renamed from: h, reason: collision with root package name */
    public int f392934h;

    /* renamed from: i, reason: collision with root package name */
    public int f392935i;

    /* renamed from: m, reason: collision with root package name */
    public int f392936m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f392937n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f392938o;

    public o1(java.util.ArrayList arrayList, int i17, java.util.HashMap hashMap, java.lang.String str) {
        this.f392937n = new java.util.HashMap();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.e74();
        lVar.f70665b = new r45.f74();
        lVar.f70666c = "/cgi-bin/micromsg-bin/listgooglecontact";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.sensor.z.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f392930d = lVar.a();
        this.f392932f = arrayList;
        this.f392933g = i17;
        this.f392934h = 0;
        this.f392936m = 1;
        this.f392937n = hashMap;
        this.f392938o = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doScene");
        this.f392931e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f392930d;
        r45.e74 e74Var = (r45.e74) oVar.f70710a.f70684a;
        java.util.ArrayList arrayList = this.f392932f;
        if (arrayList != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            this.f392935i = arrayList.size();
            for (int i17 = this.f392934h; i17 < this.f392935i && i17 < this.f392934h + 500; i17++) {
                r45.yt3 yt3Var = new r45.yt3();
                yt3Var.f391353d = ((r61.s0) arrayList.get(i17)).field_googlegmail;
                linkedList.add(yt3Var);
            }
            e74Var.f373074e = linkedList;
            e74Var.f373073d = linkedList.size();
            int i18 = this.f392934h + 500;
            int i19 = this.f392935i;
            if (i18 > i19) {
                this.f392936m = 0;
            } else {
                this.f392936m = 1;
            }
            e74Var.f373075f = this.f392936m;
            e74Var.f373076g = this.f392933g;
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doscene mTotalSize:%d, mStarIndex:%d, mContinueFlag:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f392934h), java.lang.Integer.valueOf(this.f392936m));
        }
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.sensor.z.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27;
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f392931e.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.f74 f74Var = (r45.f74) this.f392930d.f70711b.f70700a;
        synchronized (this) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "handleListGoogleContactCGIResponse Count:%d", java.lang.Integer.valueOf(f74Var.f374074d));
            java.util.LinkedList linkedList = f74Var.f374075e;
            if (linkedList != null && linkedList.size() > 0) {
                int size = f74Var.f374075e.size();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                for (int i28 = 0; i28 < size; i28++) {
                    r45.xt3 xt3Var = (r45.xt3) f74Var.f374075e.get(i28);
                    if (android.text.TextUtils.isEmpty(xt3Var.f390392e)) {
                        i27 = 1;
                    } else {
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(xt3Var.f390392e, true);
                        i27 = (n17 == null || !n17.r2()) ? 0 : 2;
                    }
                    java.util.HashMap hashMap = this.f392937n;
                    if (hashMap != null && hashMap.containsKey(xt3Var.f390391d)) {
                        r61.s0 s0Var = (r61.s0) this.f392937n.get(xt3Var.f390391d);
                        s0Var.field_username = xt3Var.f390392e;
                        java.lang.String str2 = xt3Var.f390396i;
                        s0Var.field_nickname = str2;
                        s0Var.field_usernamepy = x51.k.b(str2);
                        s0Var.field_nicknameqp = x51.k.a(xt3Var.f390396i);
                        s0Var.field_ret = xt3Var.f390395h;
                        s0Var.field_small_url = xt3Var.f390394g;
                        s0Var.field_big_url = xt3Var.f390393f;
                        s0Var.field_status = i27;
                        s0Var.field_googlecgistatus = 2;
                        if (i27 != 2 && i27 != 0) {
                            s0Var.field_contecttype = "google";
                            s0Var.field_googlenamepy = x51.k.b(s0Var.field_googlename);
                            arrayList.add(s0Var);
                            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).fj(s0Var.field_googleid, s0Var.field_googlephotourl, this.f392938o);
                            ((us.a) ((vs.e) i95.n0.c(vs.e.class))).getClass();
                            com.tencent.mm.storage.h hVar = new com.tencent.mm.storage.h();
                            hVar.field_userName = xt3Var.f390392e;
                            hVar.field_scene = 58;
                            hVar.field_ticket = xt3Var.f390397m;
                            linkedList2.add(hVar);
                        }
                        s0Var.field_contecttype = "weixin" + i28;
                        s0Var.field_googlenamepy = x51.k.b(s0Var.field_googlename);
                        arrayList.add(s0Var);
                        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).fj(s0Var.field_googleid, s0Var.field_googlephotourl, this.f392938o);
                        ((us.a) ((vs.e) i95.n0.c(vs.e.class))).getClass();
                        com.tencent.mm.storage.h hVar2 = new com.tencent.mm.storage.h();
                        hVar2.field_userName = xt3Var.f390392e;
                        hVar2.field_scene = 58;
                        hVar2.field_ticket = xt3Var.f390397m;
                        linkedList2.add(hVar2);
                    }
                }
                ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                m61.k.Di().z0(arrayList);
                ((us.a) ((vs.e) i95.n0.c(vs.e.class))).wi(linkedList2);
            }
        }
        if (this.f392936m == 1) {
            this.f392934h += 500;
            if (doScene(dispatcher(), this.f392931e) < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doScene again failed");
                this.f392931e.onSceneEnd(3, -1, "", this);
            }
        }
        this.f392931e.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 20;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
