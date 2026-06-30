package ff4;

/* loaded from: classes4.dex */
public final class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f261665d;

    /* renamed from: e, reason: collision with root package name */
    public long f261666e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f261667f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f261668g;

    /* renamed from: h, reason: collision with root package name */
    public final int f261669h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f261670i;

    public c(java.lang.String userName, long j17, java.lang.String date) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(date, "date");
        this.f261665d = userName;
        this.f261666e = j17;
        this.f261667f = date;
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "fp mUserName " + userName);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "np mUserName " + userName);
        }
        this.f261669h = 4;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pe6();
        lVar.f70665b = new r45.qe6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmstorydatedetail";
        lVar.f70667d = yc1.z.CTRL_INDEX;
        int i17 = 0;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f261668g = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryDateDetailRequest");
        r45.pe6 pe6Var = (r45.pe6) fVar;
        pe6Var.f382986d = userName;
        pe6Var.f382989g = this.f261666e;
        try {
            java.lang.String k07 = com.tencent.mm.sdk.platformtools.t8.k0();
            kotlin.jvm.internal.o.f(k07, "getTimeZoneOffset(...)");
            i17 = (int) java.lang.Float.parseFloat(k07);
        } catch (java.lang.Exception unused) {
        }
        pe6Var.f382987e = i17;
        pe6Var.f382988f = this.f261667f;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "req.mUserName:" + pe6Var.f382986d + " req.MaxId:" + pe6Var.f382989g + " req.TimeZone:" + pe6Var.f382987e + " req.Date:" + pe6Var.f382988f);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f261670i = callback;
        return dispatch(sVar, this.f261668g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return yc1.z.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        nf4.l lVar;
        int i27;
        com.tencent.mm.protobuf.f fVar = this.f261668g.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryDateDetailResponse");
        r45.qe6 qe6Var = (r45.qe6) fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "objCount: " + qe6Var.f383916d + ", expiredTime: " + qe6Var.f383920h);
        java.util.LinkedList linkedList = qe6Var.f383917e;
        if (linkedList.isEmpty()) {
            com.tencent.mm.modelbase.u0 u0Var = this.f261670i;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            } else {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
        }
        ef4.d0 d0Var = ef4.e0.f252441a;
        java.lang.String userName = this.f261665d;
        kotlin.jvm.internal.o.g(userName, "userName");
        if (linkedList == null || linkedList.isEmpty()) {
            new java.util.LinkedList();
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            nf4.l i28 = ef4.w.f252468t.i();
            int size = linkedList.size();
            int i29 = 0;
            while (i29 < size) {
                r45.df6 df6Var = (r45.df6) linkedList.get(i29);
                nf4.j D0 = i28.D0(df6Var.f372383d);
                if (D0 == null) {
                    D0 = new nf4.j();
                }
                if (d0Var.c(D0, df6Var, this.f261669h) == 0) {
                    lVar = i28;
                    i27 = size;
                } else {
                    lVar = i28;
                    i27 = size;
                    if (D0.field_storyID != 0) {
                        linkedList2.add(D0);
                    }
                }
                i29++;
                i28 = lVar;
                size = i27;
            }
        }
        if (this.f261666e == 0) {
            this.f261666e = ((r45.df6) linkedList.getFirst()).f372383d;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "insertList mUserName %s maxId %s minId %s", userName, java.lang.Long.valueOf(this.f261666e), 0L);
        com.tencent.mm.modelbase.u0 u0Var2 = this.f261670i;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        } else {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
    }
}
