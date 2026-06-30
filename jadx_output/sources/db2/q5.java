package db2;

/* loaded from: classes2.dex */
public final class q5 extends az2.v {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228128g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228129h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f228130i;

    /* renamed from: m, reason: collision with root package name */
    public r45.y71 f228131m;

    /* renamed from: n, reason: collision with root package name */
    public int f228132n;

    /* renamed from: o, reason: collision with root package name */
    public int f228133o;

    /* renamed from: p, reason: collision with root package name */
    public final long f228134p;

    /* renamed from: q, reason: collision with root package name */
    public int f228135q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f228136r;

    /* renamed from: s, reason: collision with root package name */
    public final org.json.JSONObject f228137s;

    /* renamed from: t, reason: collision with root package name */
    public final org.json.JSONObject f228138t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(long j17, java.lang.String nonceId, java.lang.String sessionBuffer, com.tencent.mm.protobuf.g gVar, int i17, float f17, float f18, r45.kv0 baseRequest, r45.kd1 kd1Var, r45.qt2 contextObj, r45.gy0 gy0Var, java.util.LinkedList linkedList, int i18, r45.o72 o72Var, r45.q92 q92Var, int i19) {
        super(contextObj);
        java.lang.String string;
        r45.k30 k30Var;
        java.lang.String string2;
        r45.nm1 nm1Var;
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(sessionBuffer, "sessionBuffer");
        kotlin.jvm.internal.o.g(baseRequest, "baseRequest");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f228130i = "NetSceneFinderGetLiveRelatedList";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f228137s = jSONObject;
        this.f228138t = new org.json.JSONObject();
        this.f228134p = j17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6479;
        this.f228131m = new r45.y71();
        N().set(3, java.lang.Long.valueOf(j17));
        N().set(4, nonceId);
        N().set(5, java.lang.Float.valueOf(f17));
        N().set(6, java.lang.Float.valueOf(f18));
        N().set(2, gVar);
        N().set(10, sessionBuffer);
        N().set(1, baseRequest);
        N().set(23, java.lang.Integer.valueOf(i19));
        N().set(7, java.lang.Integer.valueOf(i17));
        N().set(11, kd1Var);
        N().set(14, gy0Var);
        N().set(16, java.lang.Integer.valueOf(this.f228133o));
        r45.y71 N = N();
        zl2.q4 q4Var = zl2.q4.f473933a;
        N.set(17, q4Var.b());
        N().set(18, linkedList);
        N().set(19, java.lang.Integer.valueOf(i18));
        N().set(8, db2.t4.f228171a.n());
        N().set(9, zl2.q4.d(q4Var, null, new java.util.LinkedList(((b92.m2) ((zy2.n8) i95.n0.c(zy2.n8.class))).wi("FinderGetLiveRelated")), 1, null));
        N().set(24, o72Var);
        java.util.LinkedList list = q92Var != null ? q92Var.getList(0) : null;
        if (!(list == null || list.isEmpty())) {
            N().set(20, q92Var != null ? q92Var.getList(0) : null);
            N().set(21, q92Var != null ? q92Var.getByteString(1) : null);
            N().set(22, q92Var != null ? q92Var.getByteString(2) : null);
        }
        lVar.f70664a = N();
        lVar.f70665b = new r45.z71();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetliverelatedlist";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f228128g = a17;
        if (this.f228135q == 3) {
            a17.setIsUserCmd(true);
        }
        jSONObject.put("object_id", j17);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realInit feedId ");
        sb6.append(j17);
        sb6.append("  category  lastBuffer relScene:");
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(gVar);
        sb6.append(" tab_tips_path=");
        sb6.append(kd1Var != null ? kd1Var.getString(3) : null);
        sb6.append("  tabTipsByPassInfo=");
        sb6.append((kd1Var != null ? kd1Var.getByteString(2) : null) != null);
        sb6.append(" objectId=");
        sb6.append(kd1Var != null ? java.lang.Long.valueOf(kd1Var.getLong(0)) : null);
        sb6.append(" isUserCmd=");
        sb6.append(a17.getIsUserCmd());
        sb6.append(" pullType:");
        sb6.append(N().getInteger(16));
        sb6.append(" speed=");
        r45.om1 om1Var = (r45.om1) N().getCustom(17);
        sb6.append((om1Var == null || (nm1Var = (r45.nm1) om1Var.getCustom(0)) == null) ? null : java.lang.Integer.valueOf(nm1Var.getInteger(0)));
        sb6.append(" readStatSize:");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        sb6.append(" cur_object_index:");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("NetSceneFinderGetLiveRelatedList", sb6.toString());
        com.tencent.mars.xlog.Log.i("NetSceneFinderGetLiveRelatedList", "refObjectId:".concat(pm0.v.u(o72Var != null ? o72Var.getLong(9) : 0L)));
        java.lang.String str = "";
        com.tencent.mars.xlog.Log.i("NetSceneFinderGetLiveRelatedList", "ref_comment_scene:".concat((o72Var == null || (k30Var = (r45.k30) o72Var.getCustom(16)) == null || (string2 = k30Var.getString(2)) == null) ? "" : string2));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("comm_by_pass:");
        sb7.append(gy0Var != null ? java.lang.Integer.valueOf(gy0Var.getInteger(0)) : null);
        sb7.append(", ");
        sb7.append(gy0Var != null ? gy0Var.getByteString(1) : null);
        com.tencent.mars.xlog.Log.i("NetSceneFinderGetLiveRelatedList", sb7.toString());
        if (o72Var != null && (string = o72Var.getString(5)) != null) {
            str = string;
        }
        com.tencent.mars.xlog.Log.i("NetSceneFinderGetLiveRelatedList", "chnl_expose_type:".concat(str));
    }

    @Override // az2.u
    public java.util.List H() {
        return kz5.b0.c(new jz5.l("pull_type", java.lang.String.valueOf(N().getInteger(16))));
    }

    @Override // az2.v, az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.J(i17, i18, i19, str, v0Var, bArr);
        java.lang.String str2 = hashCode() + " errType " + i18 + ", errCode " + i19 + ", errMsg " + str + ", pullType:" + this.f228133o;
        java.lang.String str3 = this.f228130i;
        com.tencent.mars.xlog.Log.i(str3, str2);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i(str3, "feedId " + this.f228134p + ", " + hc2.o0.k(M()));
            this.f228138t.put("count", M().size());
            com.tencent.mm.modelbase.o oVar = this.f228128g;
            if (oVar == null) {
                kotlin.jvm.internal.o.o("rr");
                throw null;
            }
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
            if (((r45.z71) fVar).getBoolean(7)) {
                com.tencent.mars.xlog.Log.i(str3, "setHasShowFinderLoadMoreScrollFlag now");
                zl2.q4 q4Var = zl2.q4.f473933a;
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_SERVER_FLAG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f228129h;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // az2.v
    public java.util.List K(com.tencent.mm.network.v0 v0Var) {
        com.tencent.mm.modelbase.o oVar = this.f228128g;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("rr");
            throw null;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = ((r45.z71) fVar).getList(1);
        if (list == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        return arrayList;
    }

    @Override // az2.v
    public long L() {
        r45.kv0 kv0Var = (r45.kv0) N().getCustom(1);
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }

    public final java.util.LinkedList M() {
        com.tencent.mm.modelbase.o oVar = this.f228128g;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("rr");
            throw null;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
        java.util.LinkedList list = ((r45.z71) fVar).getList(1);
        return list == null ? new java.util.LinkedList() : list;
    }

    public final r45.y71 N() {
        r45.y71 y71Var = this.f228131m;
        if (y71Var != null) {
            return y71Var;
        }
        kotlin.jvm.internal.o.o("request");
        throw null;
    }

    public final void O(int i17) {
        this.f228133o = i17;
        N().set(16, java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i(this.f228130i, hashCode() + " setReqPullType " + i17);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228129h = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f228128g;
        if (oVar != null) {
            return dispatch(sVar, oVar, this);
        }
        kotlin.jvm.internal.o.o("rr");
        throw null;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6479;
    }

    @Override // az2.u, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }

    @Override // az2.u, cz2.j
    public org.json.JSONObject w() {
        return this.f228137s;
    }

    @Override // az2.u, cz2.j
    public org.json.JSONObject z() {
        return this.f228138t;
    }
}
