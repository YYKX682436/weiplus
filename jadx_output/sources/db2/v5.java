package db2;

/* loaded from: classes2.dex */
public final class v5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f228197g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228198h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228199i;

    /* renamed from: m, reason: collision with root package name */
    public final org.json.JSONObject f228200m;

    /* renamed from: n, reason: collision with root package name */
    public final org.json.JSONObject f228201n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f228202o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f228203p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public v5(java.lang.String username, java.util.List cmdList, boolean z17, int i17, java.lang.String str, java.lang.Long l17, java.lang.String str2, int i18, kotlin.jvm.internal.i iVar) {
        super(null, 1, null);
        ?? r66 = (i18 & 4) != 0 ? 0 : z17;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        str = (i18 & 16) != 0 ? null : str;
        l17 = (i18 & 32) != 0 ? null : l17;
        str2 = (i18 & 64) != 0 ? null : str2;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdList, "cmdList");
        this.f228197g = "Finder.NetSceneFinderOplog";
        this.f228200m = new org.json.JSONObject();
        this.f228201n = new org.json.JSONObject();
        this.f228203p = "";
        this.f228203p = username;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3870;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderoplog";
        r45.rn2 rn2Var = new r45.rn2();
        rn2Var.set(1, username);
        if (i17 != 0) {
            rn2Var.set(5, java.lang.Integer.valueOf(i17));
        }
        if (!(str == null || str.length() == 0)) {
            rn2Var.set(6, str);
        }
        rn2Var.getList(2).addAll(cmdList);
        db2.t4 t4Var = db2.t4.f228171a;
        r45.kv0 a17 = t4Var.a(3870);
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127719ge).getValue()).r()).booleanValue()) {
            a17.set(8, java.lang.Integer.valueOf(a17.getInteger(8) | 4));
        }
        rn2Var.set(3, a17);
        r45.kv0 kv0Var = (r45.kv0) rn2Var.getCustom(3);
        kotlin.jvm.internal.o.d(kv0Var);
        kv0Var.set(1, java.lang.Integer.valueOf((int) r66));
        if (str2 != null && l17 != null) {
            t4Var.j((r45.kv0) rn2Var.getCustom(3), l17.longValue(), str2);
        }
        lVar.f70664a = rn2Var;
        lVar.f70665b = new r45.sn2();
        this.f228198h = lVar.a();
        synchronized (cmdList) {
            java.util.Iterator it = cmdList.iterator();
            int i19 = 0;
            while (it.hasNext()) {
                r45.hx0 hx0Var = (r45.hx0) it.next();
                this.f228201n.put("req" + i19, hx0Var.getInteger(0));
                i19++;
            }
        }
        this.f228201n.put("isMegaVideo", (boolean) r66);
        com.tencent.mars.xlog.Log.i(this.f228197g, "NetSceneFinderOplog init ");
    }

    @Override // az2.u
    public boolean I() {
        return !this.f228202o;
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.String str2 = this.f228197g;
        com.tencent.mars.xlog.Log.i(str2, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.tencent.mars.xlog.Log.i(str2, "retList " + K().size());
        org.json.JSONObject jSONObject = this.f228200m;
        jSONObject.put("retsize", K().size());
        int i27 = 0;
        for (r45.ix0 ix0Var : K()) {
            jSONObject.put("resp" + i27, ix0Var.getInteger(1));
            jSONObject.put("respm" + i27, ix0Var.getString(2));
            i27++;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f228199i;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        for (r45.ix0 ix0Var2 : K()) {
            com.tencent.mars.xlog.Log.i(str2, "retCode " + ix0Var2.getInteger(1) + " retMsg " + ix0Var2.getString(2));
            if (!this.f228202o) {
                hz2.d dVar = hz2.d.f286313a;
                int integer = ix0Var2.getInteger(1);
                java.lang.String string = ix0Var2.getString(2);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    if (integer == -5002) {
                        i95.m c17 = i95.n0.c(zy2.b6.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        cq.k1.a();
                        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127719ge).getValue()).r()).booleanValue()) {
                            if (string != null) {
                                dVar.o(string);
                            }
                            jx3.f.INSTANCE.idkeyStat(1264L, 1L, 1L, false);
                        }
                    } else if (integer == -5001) {
                        if (string != null) {
                            dVar.n(string);
                        }
                        jx3.f.INSTANCE.idkeyStat(1264L, 1L, 1L, false);
                    } else if (integer == -4019) {
                        if (string != null) {
                            dVar.m(string);
                        }
                        jx3.f.INSTANCE.idkeyStat(1264L, 6L, 1L, false);
                    } else if (integer == -4017) {
                        if (string != null) {
                            dVar.m(string);
                        }
                        jx3.f.INSTANCE.idkeyStat(1264L, 2L, 1L, false);
                    } else if (integer == -4007) {
                        if (string != null) {
                            dVar.m(string);
                        }
                        jx3.f.INSTANCE.idkeyStat(1264L, 1L, 1L, false);
                    } else if (integer != -4006) {
                        dVar.e(4, integer, string);
                    } else {
                        if (string != null) {
                            dVar.m(string);
                        }
                        jx3.f.INSTANCE.idkeyStat(1264L, 0L, 1L, false);
                    }
                }
            }
        }
    }

    public final java.util.List K() {
        com.tencent.mm.modelbase.o oVar = this.f228198h;
        kotlin.jvm.internal.o.d(oVar);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOplogResponse");
        java.util.LinkedList list = ((r45.sn2) fVar).getList(1);
        kotlin.jvm.internal.o.f(list, "getRetList(...)");
        return list;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228199i = u0Var;
        return dispatch(sVar, this.f228198h, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3870;
    }

    @Override // az2.u, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }

    @Override // az2.u, cz2.j
    public org.json.JSONObject w() {
        return this.f228201n;
    }

    @Override // az2.u, cz2.j
    public org.json.JSONObject z() {
        return this.f228200m;
    }
}
