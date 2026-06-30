package db2;

/* loaded from: classes2.dex */
public final class t5 extends az2.v {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228178g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228179h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f228180i;

    /* renamed from: m, reason: collision with root package name */
    public int f228181m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f228182n;

    /* renamed from: o, reason: collision with root package name */
    public final int f228183o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(java.lang.String topic, long j17, com.tencent.mm.protobuf.g gVar, java.lang.Long l17, int i17, com.tencent.mm.protobuf.g gVar2, r45.qt2 qt2Var, java.lang.String str, r45.a34 a34Var, int i18, kotlin.jvm.internal.i iVar) {
        super(qt2Var);
        java.lang.String str2 = (i18 & 128) != 0 ? null : str;
        r45.a34 a34Var2 = (i18 & 256) != 0 ? null : a34Var;
        kotlin.jvm.internal.o.g(topic, "topic");
        this.f228180i = "Finder.NetSceneFinderGetTopicFeed";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 817;
        r45.na1 na1Var = new r45.na1();
        na1Var.set(3, java.lang.Integer.valueOf(i17));
        na1Var.set(4, topic);
        na1Var.set(13, java.lang.Long.valueOf(j17));
        na1Var.set(2, gVar2);
        na1Var.set(14, gVar);
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        na1Var.set(18, 1);
        na1Var.set(19, qt2Var != null ? qt2Var.getString(18) : null);
        db2.t4 t4Var = db2.t4.f228171a;
        na1Var.set(1, t4Var.b(817, qt2Var));
        na1Var.set(12, t4Var.n());
        M(na1Var, str2);
        db2.t4.i(t4Var, (r45.kv0) na1Var.getCustom(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0), java.lang.Long.valueOf(na1Var.getLong(7)))), null, 4, null);
        t4Var.k((r45.kv0) na1Var.getCustom(1), a34Var2);
        lVar.f70664a = na1Var;
        lVar.f70667d = 817;
        lVar.f70665b = new r45.oa1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f228178g = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + topic + ", " + i17 + ", " + j17 + ", " + l17);
        this.f228183o = i17;
    }

    @Override // az2.v, az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.J(i17, i18, i19, str, this.f228178g, bArr);
        java.lang.String str2 = this.f228180i;
        com.tencent.mars.xlog.Log.i(str2, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i(str2, "pullType " + this.f228181m + " selectedTag" + this.f228182n + ' ' + hc2.o0.k(P()));
            com.tencent.mm.protobuf.f fVar = this.f228178g.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
            r45.oa1 oa1Var = (r45.oa1) fVar;
            yr2.a aVar = yr2.a.f464659a;
            r45.sq2 sq2Var = (r45.sq2) oa1Var.getCustom(9);
            java.util.LinkedList list = oa1Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            aVar.b(sq2Var, list, 817);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f228179h;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        r45.qt2 qt2Var = this.f16154d;
        if (qt2Var != null) {
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : P()) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((com.tencent.mm.plugin.finder.report.o3) c17).rk(finderObject, qt2Var.getInteger(5), null);
            }
        }
    }

    @Override // az2.v
    public java.util.List K(com.tencent.mm.network.v0 v0Var) {
        java.util.LinkedList P = P();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(P, 10));
        java.util.Iterator it = P.iterator();
        while (it.hasNext()) {
            arrayList.add(com.tencent.mm.plugin.finder.storage.h90.b(com.tencent.mm.plugin.finder.storage.FinderItem.Companion, (com.tencent.mm.protocal.protobuf.FinderObject) it.next(), 0, 2, null));
        }
        return arrayList;
    }

    @Override // az2.v
    public long L() {
        com.tencent.mm.protobuf.f fVar = this.f228178g.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListRequest");
        r45.kv0 kv0Var = (r45.kv0) ((r45.na1) fVar).getCustom(1);
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }

    public final void M(r45.na1 na1Var, java.lang.String str) {
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            na1Var.set(17, new com.tencent.mm.protobuf.g(bytes, 0, bytes.length));
        }
    }

    public final r45.o03 N() {
        com.tencent.mm.protobuf.f fVar = this.f228178g.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
        r45.r03 r03Var = (r45.r03) ((r45.oa1) fVar).getCustom(5);
        if (r03Var != null) {
            return (r45.o03) r03Var.getCustom(12);
        }
        return null;
    }

    public final int O() {
        com.tencent.mm.protobuf.f fVar = this.f228178g.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
        return ((r45.oa1) fVar).getInteger(3);
    }

    public final java.util.LinkedList P() {
        com.tencent.mm.protobuf.f fVar = this.f228178g.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
        java.util.LinkedList list = ((r45.oa1) fVar).getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        return list;
    }

    public final int Q() {
        com.tencent.mm.protobuf.f fVar = this.f228178g.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListRequest");
        return ((r45.na1) fVar).getInteger(3);
    }

    public final int R() {
        com.tencent.mm.protobuf.f fVar = this.f228178g.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListRequest");
        return ((r45.na1) fVar).getInteger(16);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        r45.qt2 qt2Var = this.f16154d;
        o3Var.f125215n.put(qt2Var != null ? qt2Var.getInteger(5) : 0, java.lang.Long.valueOf(c01.id.c()));
        this.f228179h = u0Var;
        return dispatch(sVar, this.f228178g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 817;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(java.lang.String topic, long j17, com.tencent.mm.protobuf.g gVar, java.lang.Long l17, com.tencent.mm.protobuf.g gVar2, r45.xu2 xu2Var, r45.qt2 qt2Var, java.lang.String str, r45.a34 a34Var, int i17, kotlin.jvm.internal.i iVar) {
        super(qt2Var);
        java.lang.String str2 = (i17 & 128) != 0 ? null : str;
        r45.a34 a34Var2 = (i17 & 256) != 0 ? null : a34Var;
        kotlin.jvm.internal.o.g(topic, "topic");
        this.f228180i = "Finder.NetSceneFinderGetTopicFeed";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 817;
        r45.na1 na1Var = new r45.na1();
        na1Var.set(3, 5);
        na1Var.set(4, topic);
        na1Var.set(13, java.lang.Long.valueOf(j17));
        na1Var.set(2, gVar2);
        na1Var.set(14, gVar);
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        na1Var.set(10, xu2Var);
        db2.t4 t4Var = db2.t4.f228171a;
        na1Var.set(1, t4Var.b(817, qt2Var));
        na1Var.set(19, qt2Var != null ? qt2Var.getString(18) : null);
        na1Var.set(18, 1);
        na1Var.set(12, t4Var.n());
        M(na1Var, str2);
        db2.t4.i(t4Var, (r45.kv0) na1Var.getCustom(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0), java.lang.Long.valueOf(na1Var.getLong(7)))), null, 4, null);
        t4Var.k((r45.kv0) na1Var.getCustom(1), a34Var2);
        lVar.f70664a = na1Var;
        lVar.f70667d = 817;
        lVar.f70665b = new r45.oa1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f228178g = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + topic + ", " + l17);
        this.f228183o = this.f228183o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(java.lang.String topic, long j17, java.lang.Long l17, int i17, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, java.lang.String str, java.lang.String str2, com.tencent.mm.protobuf.g gVar2, com.tencent.mm.protobuf.g gVar3, r45.a34 a34Var, int i18, kotlin.jvm.internal.i iVar) {
        super(qt2Var);
        int i19;
        int i27;
        java.lang.String str3 = null;
        java.lang.String str4 = (i18 & 64) != 0 ? null : str;
        java.lang.String str5 = (i18 & 128) != 0 ? null : str2;
        com.tencent.mm.protobuf.g gVar4 = (i18 & 256) != 0 ? null : gVar2;
        com.tencent.mm.protobuf.g gVar5 = (i18 & 512) != 0 ? null : gVar3;
        r45.a34 a34Var2 = (i18 & 1024) != 0 ? null : a34Var;
        kotlin.jvm.internal.o.g(topic, "topic");
        this.f228180i = "Finder.NetSceneFinderGetTopicFeed";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 817;
        r45.na1 na1Var = new r45.na1();
        na1Var.set(3, java.lang.Integer.valueOf(i17));
        na1Var.set(4, topic);
        na1Var.set(13, java.lang.Long.valueOf(j17));
        na1Var.set(2, gVar);
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        if (str5 != null) {
            str3 = str5;
        } else if (qt2Var != null) {
            str3 = qt2Var.getString(18);
        }
        na1Var.set(19, str3);
        na1Var.set(18, 1);
        db2.t4 t4Var = db2.t4.f228171a;
        na1Var.set(1, t4Var.b(817, qt2Var));
        na1Var.set(12, t4Var.n());
        na1Var.set(21, gVar4);
        na1Var.set(14, gVar5);
        M(na1Var, str4);
        r45.kv0 kv0Var = (r45.kv0) na1Var.getCustom(1);
        if (qt2Var != null) {
            i19 = 7;
            i27 = qt2Var.getInteger(7);
        } else {
            i19 = 7;
            i27 = 0;
        }
        db2.t4.i(t4Var, kv0Var, kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(na1Var.getLong(i19)))), null, 4, null);
        t4Var.k((r45.kv0) na1Var.getCustom(1), a34Var2);
        lVar.f70664a = na1Var;
        lVar.f70667d = 817;
        lVar.f70665b = new r45.oa1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f228178g = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + topic + ", " + l17 + " finderUsername=" + str5);
        this.f228183o = i17;
    }

    public t5(int i17, long j17, java.lang.Long l17, java.lang.String str, int i18, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, java.lang.String str2, r45.a34 a34Var) {
        super(qt2Var);
        this.f228180i = "Finder.NetSceneFinderGetTopicFeed";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 817;
        r45.na1 na1Var = new r45.na1();
        na1Var.set(3, java.lang.Integer.valueOf(i17));
        na1Var.set(13, java.lang.Long.valueOf(j17));
        na1Var.set(4, java.lang.String.valueOf(j17));
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            na1Var.set(11, 4);
        }
        na1Var.set(15, str == null ? "" : str);
        na1Var.set(2, gVar);
        na1Var.set(16, java.lang.Integer.valueOf(i18));
        na1Var.set(19, qt2Var != null ? qt2Var.getString(18) : null);
        db2.t4 t4Var = db2.t4.f228171a;
        na1Var.set(1, t4Var.b(817, qt2Var));
        na1Var.set(18, 1);
        na1Var.set(12, t4Var.n());
        M(na1Var, str2);
        db2.t4.i(t4Var, (r45.kv0) na1Var.getCustom(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0), java.lang.Long.valueOf(na1Var.getLong(7)))), null, 4, null);
        t4Var.k((r45.kv0) na1Var.getCustom(1), a34Var);
        lVar.f70664a = na1Var;
        lVar.f70667d = 817;
        lVar.f70665b = new r45.oa1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f228178g = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get eventTopic init eventTopicId:" + j17 + ", " + l17 + " encryptedTopicId:" + str + " innerTabType:" + i18 + " pullType:" + this.f228181m);
        this.f228183o = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(java.lang.String topic, java.lang.Long l17, com.tencent.mm.protobuf.g gVar, r45.xu2 xu2Var, r45.qt2 qt2Var, int i17, java.lang.String str, int i18, r45.a34 a34Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(topic, "topic");
        this.f228180i = "Finder.NetSceneFinderGetTopicFeed";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 817;
        r45.na1 na1Var = new r45.na1();
        na1Var.set(3, 1);
        na1Var.set(4, topic);
        na1Var.set(2, gVar);
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        na1Var.set(18, 1);
        na1Var.set(10, xu2Var);
        na1Var.set(16, java.lang.Integer.valueOf(i17));
        na1Var.set(19, qt2Var != null ? qt2Var.getString(18) : null);
        db2.t4 t4Var = db2.t4.f228171a;
        na1Var.set(1, t4Var.b(817, qt2Var));
        na1Var.set(20, java.lang.Integer.valueOf(i18));
        na1Var.set(12, t4Var.n());
        M(na1Var, str);
        db2.t4.i(t4Var, (r45.kv0) na1Var.getCustom(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0), java.lang.Long.valueOf(na1Var.getLong(7)))), null, 4, null);
        t4Var.k((r45.kv0) na1Var.getCustom(1), a34Var);
        lVar.f70664a = na1Var;
        lVar.f70667d = 817;
        lVar.f70665b = new r45.oa1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f228178g = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + topic + ", " + l17);
        if (com.tencent.mars.xlog.Log.isDebug()) {
            com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word req: " + na1Var.toJSON());
        }
        this.f228183o = this.f228183o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(java.lang.String poiClassifyId, float f17, float f18, java.lang.Long l17, com.tencent.mm.protobuf.g gVar, int i17, r45.xn5 xn5Var, r45.xu2 xu2Var, r45.qt2 qt2Var, java.lang.String str, r45.a34 a34Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(poiClassifyId, "poiClassifyId");
        this.f228180i = "Finder.NetSceneFinderGetTopicFeed";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 817;
        r45.na1 na1Var = new r45.na1();
        na1Var.set(3, 2);
        na1Var.set(4, poiClassifyId);
        na1Var.set(5, java.lang.Float.valueOf(f17));
        na1Var.set(6, java.lang.Float.valueOf(f18));
        na1Var.set(2, gVar);
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        na1Var.set(10, xu2Var);
        na1Var.set(11, 1);
        if (xu2Var != null) {
            na1Var.set(11, 2);
        }
        na1Var.set(19, qt2Var != null ? qt2Var.getString(18) : null);
        na1Var.set(18, 1);
        na1Var.set(8, java.lang.Integer.valueOf(i17));
        M(na1Var, str);
        if (xn5Var != null) {
            r45.ao6 ao6Var = new r45.ao6();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList list = xn5Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getTopic_list(...)");
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedList.add(java.lang.Long.valueOf(((r45.r03) it.next()).getLong(1)));
            }
            ao6Var.set(0, linkedList);
            na1Var.set(9, ao6Var);
            this.f228182n = ((r45.r03) xn5Var.getList(0).get(0)).getString(0);
        }
        db2.t4 t4Var = db2.t4.f228171a;
        na1Var.set(12, t4Var.n());
        na1Var.set(1, t4Var.b(817, qt2Var));
        db2.t4.i(t4Var, (r45.kv0) na1Var.getCustom(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0), java.lang.Long.valueOf(na1Var.getLong(7)))), null, 4, null);
        t4Var.k((r45.kv0) na1Var.getCustom(1), a34Var);
        lVar.f70664a = na1Var;
        lVar.f70667d = 817;
        lVar.f70665b = new r45.oa1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f228178g = lVar.a();
        com.tencent.mars.xlog.Log.i(this.f228180i, "NetSceneFinderGetTopicFeed get poi init: " + poiClassifyId + ' ' + l17);
        this.f228183o = this.f228183o;
    }
}
