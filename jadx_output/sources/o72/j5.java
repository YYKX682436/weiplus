package o72;

/* loaded from: classes12.dex */
public class j5 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f343371m = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public static int f343372n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f343373d;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f343375f;

    /* renamed from: h, reason: collision with root package name */
    public final int f343377h;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f343374e = null;

    /* renamed from: g, reason: collision with root package name */
    public int f343376g = 0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f343378i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_scene_xml_null_batch_get, true);

    public j5(java.util.LinkedList linkedList) {
        this.f343377h = 100;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.lf();
        lVar.f70665b = new r45.mf();
        lVar.f70666c = "/cgi-bin/micromsg-bin/batchgetfavitem";
        lVar.f70667d = 402;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f343373d = lVar.a();
        this.f343375f = linkedList;
        f343371m.incrementAndGet();
        if (com.tencent.mars.xlog.Log.isDebug()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
        }
        this.f343377h = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Fav_SceneLimit_Int, 100);
        java.util.HashSet hashSet = new java.util.HashSet(linkedList);
        linkedList.clear();
        linkedList.addAll(hashSet);
        java.lang.System.currentTimeMillis();
    }

    public static void H() {
        f343371m.decrementAndGet();
        com.tencent.mars.xlog.Log.isDebug();
    }

    public final boolean I() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(8217, null)) == 0;
        java.util.LinkedList linkedList = this.f343375f;
        boolean z18 = linkedList != null && this.f343376g < linkedList.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "check needContinue, notInit %B indexOK %B", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        return !z17 && z18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "ashutest::doscene count:%d", java.lang.Integer.valueOf(f343371m.get()));
        java.util.LinkedList linkedList = this.f343375f;
        if (linkedList == null || linkedList.isEmpty() || this.f343376g >= linkedList.size()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchgetFav", "klem doScene, idlist size = " + linkedList.size() + ", begIndex = " + this.f343376g + ", xmlError = false");
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene size %d, begIndex %d, total %s", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f343376g), linkedList);
        if (com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(8217, null)) == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneBatchgetFav", "klem doScene, init not done, do not batchget");
            return -1;
        }
        com.tencent.mm.modelbase.o oVar = this.f343373d;
        r45.lf lfVar = (r45.lf) oVar.f70710a.f70684a;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i17 = this.f343376g;
        linkedList2.addAll(linkedList.subList(i17, java.lang.Math.min(i17 + 15, linkedList.size())));
        lfVar.f379401e = linkedList2;
        lfVar.f379400d = linkedList2.size();
        this.f343376g += 15;
        byte[] h17 = fo3.s.INSTANCE.h();
        if (h17 != null && h17.length > 0) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(h17);
            lfVar.f379402f = cu5Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "doScene set SecAuthRequestBuffer, size=%d", java.lang.Integer.valueOf(h17.length));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene checkd size %d, %s", java.lang.Integer.valueOf(linkedList2.size()), linkedList2);
        this.f343374e = u0Var;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 402;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        boolean z17;
        r45.cu5 cu5Var;
        com.tencent.mm.protobuf.g gVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(this.f343376g);
        java.util.LinkedList linkedList = this.f343375f;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg[%s]", valueOf, valueOf2, valueOf3, valueOf4, java.lang.Integer.valueOf(linkedList.size()), str);
        if (i19 == 3005) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "FAV_ERR_MAIN_DEVICE_AUTH_BLOCK received, parsing SecAuthResponseBuffer");
            r45.mf mfVar = (r45.mf) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            if (mfVar == null || (cu5Var = mfVar.f380437f) == null || (gVar = cu5Var.f371841f) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneBatchgetFav", "SecAuthResponseBuffer is null or empty");
            } else {
                java.lang.String str2 = new java.lang.String(gVar.f192156a);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "SecAuthResponseBuffer content: %s", str2);
                com.tencent.mm.autogen.events.FavoritesBatchSafeCheckerEvent favoritesBatchSafeCheckerEvent = new com.tencent.mm.autogen.events.FavoritesBatchSafeCheckerEvent();
                favoritesBatchSafeCheckerEvent.f54245g.f6227a = str2;
                favoritesBatchSafeCheckerEvent.e();
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "FavoritesBatchSafeCheckerEvent published");
            }
            H();
            this.f343374e.onSceneEnd(i18, i19, str, this);
            return;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = f343371m;
        if (i18 != 0 || i19 != 0) {
            if (!I()) {
                H();
                this.f343374e.onSceneEnd(i18, i19, str, this);
                return;
            }
            int doScene = doScene(dispatcher(), this.f343374e);
            if (doScene != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "doScene ret:%s, minus sceneCount, cur:%s", java.lang.Integer.valueOf(doScene), java.lang.Integer.valueOf(atomicInteger.get()));
                H();
                return;
            }
            return;
        }
        r45.mf mfVar2 = (r45.mf) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        int i27 = mfVar2.f380435d;
        java.util.LinkedList linkedList2 = mfVar2.f380436e;
        int size = linkedList2.size();
        boolean z18 = true;
        if (i27 != size) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(size);
            objArr[1] = java.lang.Integer.valueOf(i27);
            objArr[2] = java.lang.Integer.valueOf(this.f343376g > linkedList.size() ? linkedList.size() % 15 : 15);
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchgetFav", "klem onGYNet resp list size:%d, return count %d, request count %d", objArr);
            if (!I()) {
                H();
                this.f343374e.onSceneEnd(i18, -1, str, this);
                return;
            }
            int doScene2 = doScene(dispatcher(), this.f343374e);
            if (doScene2 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "doScene ret:%s, minus sceneCount, cur:%s", java.lang.Integer.valueOf(doScene2), java.lang.Integer.valueOf(atomicInteger.get()));
                H();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "onGYNetEnd listSize:%s", java.lang.Integer.valueOf(size));
        int i28 = 0;
        while (i28 < size) {
            r45.tp0 tp0Var = (r45.tp0) linkedList2.get(i28);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "klem onGYNet index:%s favid:%d, status:%d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(tp0Var.f386638d), java.lang.Integer.valueOf(tp0Var.f386639e));
            if (tp0Var.f386639e == 0) {
                o72.r2 re6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(tp0Var.f386638d);
                if (re6 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favid:%d not exist!", java.lang.Integer.valueOf(tp0Var.f386638d));
                    z17 = z18;
                    i28++;
                    z18 = z17;
                } else {
                    java.lang.String str3 = tp0Var.f386640f;
                    re6.field_xml = str3;
                    re6.U0(str3);
                    re6.field_flag = tp0Var.f386641g;
                    re6.field_localSeq = tp0Var.f386643i;
                    re6.field_updateTime = (tp0Var.f386642h * 1000) + i28;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "field_update");
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "huahuahailang:item field_xml batgch get :\n %s", re6.field_xml);
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "data dealed needUpload:%b  needDownload:%b", bool, bool);
                    re6.field_itemStatus = 10;
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(re6, dm.i4.COL_LOCALID);
                    o72.x1.Q0(re6);
                    re6.w0("MicroMsg.NetSceneBatchgetFav", o72.r2.G1);
                    tp0Var = tp0Var;
                }
            }
            if ((tp0Var.f386641g & 1) != 0) {
                o72.r2 re7 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(tp0Var.f386638d);
                z17 = true;
                o72.x1.l(re7, true, null, 4, null);
            } else {
                z17 = true;
            }
            i28++;
            z18 = z17;
        }
        ((a82.v) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
        if (I()) {
            int doScene3 = doScene(dispatcher(), this.f343374e);
            if (doScene3 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "doScene ret:%s, minus sceneCount, cur:%s", java.lang.Integer.valueOf(doScene3), java.lang.Integer.valueOf(atomicInteger.get()));
                H();
                return;
            }
            return;
        }
        H();
        if (this.f343378i) {
            f343372n = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchgetFav", "report sync flow end, retry count = " + f343372n);
        this.f343374e.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return this.f343377h;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
        if (n1Var == com.tencent.mm.modelbase.n1.EReachMaxLimit) {
            this.f343374e.onSceneEnd(3, -1, "EReachMaxLimit", this);
        }
    }
}
