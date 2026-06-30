package ff4;

/* loaded from: classes4.dex */
public final class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f261671d;

    /* renamed from: e, reason: collision with root package name */
    public long f261672e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f261673f;

    /* renamed from: g, reason: collision with root package name */
    public final int f261674g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f261675h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f261676i;

    /* renamed from: m, reason: collision with root package name */
    public long f261677m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f261678n;

    /* renamed from: o, reason: collision with root package name */
    public long f261679o;

    public d(java.lang.String userName, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f261671d = userName;
        this.f261672e = j17;
        this.f261676i = "";
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "fp mUserName ".concat(userName));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "np mUserName ".concat(userName));
        }
        this.f261674g = 20;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ue6();
        lVar.f70665b = new r45.ve6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmstoryhistorypage";
        lVar.f70667d = 191;
        int i17 = 0;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f261673f = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryHistoryPageRequest");
        r45.ue6 ue6Var = (r45.ue6) fVar;
        ue6Var.f387305e = userName;
        long j18 = this.f261672e;
        ue6Var.f387307g = j18;
        boolean z18 = j18 == 0;
        this.f261678n = z18;
        ef4.v vVar = ef4.w.f252468t;
        vVar.j();
        long b17 = vVar.i().b1(z18 ? 0L : this.f261672e, 30);
        this.f261679o = b17;
        ue6Var.f387308h = b17;
        ue6Var.f387309i = 0;
        try {
            java.lang.String k07 = com.tencent.mm.sdk.platformtools.t8.k0();
            kotlin.jvm.internal.o.f(k07, "getTimeZoneOffset(...)");
            i17 = (int) java.lang.Float.parseFloat(k07);
        } catch (java.lang.Exception unused) {
        }
        ue6Var.f387306f = i17;
        if (this.f261678n) {
            java.lang.String str = ef4.w.f252468t.g().L0("@__weixinhistory").field_md5;
            this.f261676i = str;
            if (str == null) {
                this.f261676i = "";
            }
            ue6Var.f387304d = this.f261676i;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "req.mUserName:" + ue6Var.f387305e + " req.MaxId:" + ue6Var.f387307g + " req.MinFilterId:" + ue6Var.f387308h + " req.LastRequestTime:" + ue6Var.f387309i + " req.FirstPageMd5:" + ue6Var.f387304d + " req.TimeZone:" + ue6Var.f387306f);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f261675h = callback;
        return dispatch(sVar, this.f261673f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 191;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.String str2;
        java.util.Iterator it;
        r45.te6 te6Var;
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mm.protobuf.f fVar = this.f261673f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryHistoryPageResponse");
        r45.ve6 ve6Var = (r45.ve6) fVar;
        this.f261677m = ve6Var.f388177h;
        java.lang.String str3 = ve6Var.f388173d;
        if (str3 == null) {
            str3 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "objCount:" + ve6Var.f388174e + " firstPageMd5:" + str3 + ", expiredTime:" + ve6Var.f388178i);
        java.util.LinkedList linkedList = ve6Var.f388175f;
        if (linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "server give size zero");
            com.tencent.mm.modelbase.u0 u0Var = this.f261675h;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            } else {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
        }
        ef4.v vVar = ef4.w.f252468t;
        vVar.g().W0("@__weixinhistory", str3);
        boolean z17 = this.f261678n;
        java.lang.String userName = this.f261671d;
        if (z17) {
            str2 = "callback";
            if (((r45.te6) linkedList.get(linkedList.size() - 1)).f386359d > ef4.e0.f252441a.b(userName).field_storyID) {
                long j17 = ((r45.te6) linkedList.get(linkedList.size() - 1)).f386359d;
                if (com.tencent.mm.sdk.platformtools.t8.D0(userName, vVar.e())) {
                    vVar.i().f336872h.A("MMStoryInfo", "UPDATE MMStoryInfo SET sourceType = 4 Where userName = '" + userName + "' AND storyID < " + j17);
                }
            }
        } else {
            str2 = "callback";
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            r45.te6 te6Var2 = (r45.te6) it6.next();
            java.lang.String str4 = te6Var2.f386360e;
            r45.df6 StoryObject = te6Var2.f386361f;
            kotlin.jvm.internal.o.f(StoryObject, "StoryObject");
            kotlin.jvm.internal.o.g(userName, "userName");
            ef4.v vVar2 = ef4.w.f252468t;
            nf4.j D0 = vVar2.i().D0(StoryObject.f372383d);
            if (D0 == null) {
                D0 = new nf4.j();
            }
            r45.cu5 cu5Var = StoryObject.f372388i;
            if (cu5Var == null || (gVar = cu5Var.f371841f) == null) {
                it = it6;
                te6Var = te6Var2;
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryInfoStorageLogic", "object desc is null");
            } else {
                it = it6;
                java.lang.String str5 = new java.lang.String(gVar.g(), r26.c.f368865a);
                r45.lf6 a17 = ef4.h0.f252445a.a(str5);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str5) || a17 == null || !D0.D0(a17)) {
                    te6Var = te6Var2;
                } else {
                    StoryObject.f372388i.d(new byte[0]);
                    D0.field_userName = StoryObject.f372384e;
                    D0.field_createTime = StoryObject.f372386g;
                    te6Var = te6Var2;
                    D0.field_storyID = StoryObject.f372383d;
                    java.util.LinkedList linkedList2 = StoryObject.f372390n;
                    if (!linkedList2.isEmpty()) {
                        D0.field_attrBuf = StoryObject.toByteArray();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.StoryInfoStorageLogic", "id:" + D0.field_storyID + " createTime:" + D0.field_createTime + " CommentListSize:" + linkedList2.size() + " BubbleListSize:" + StoryObject.f372392p.size());
                    D0.field_sourceType = D0.field_sourceType | this.f261674g;
                    r45.lf6 y07 = D0.y0();
                    y07.f379429e = StoryObject.f372384e;
                    D0.G0(y07);
                    android.database.Cursor B = vVar2.i().f336872h.B("select *,rowid from MMStoryInfo  where MMStoryInfo.storyID = " + StoryObject.f372383d, null);
                    int count = B.getCount();
                    B.close();
                    if (count > 0) {
                        vVar2.i().update(StoryObject.f372383d, D0);
                        vVar2.i().L0(StoryObject.f372383d);
                    } else {
                        vVar2.i().f336872h.l("MMStoryInfo", "", D0.convertTo());
                    }
                }
            }
            nf4.h hVar = new nf4.h();
            r45.te6 te6Var3 = te6Var;
            java.lang.String str6 = te6Var3.f386360e;
            if (str6 == null) {
                str6 = "";
            }
            hVar.field_date = str6;
            hVar.field_count = te6Var3.f386362g;
            vVar2.h().z0(hVar);
            it6 = it;
        }
        if (this.f261672e == 0) {
            this.f261672e = ((r45.te6) linkedList.getFirst()).f386359d;
        }
        this.f261679o = ((r45.te6) linkedList.getLast()).f386359d;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "insertList mUserName %s maxId %s minId %s NewRequestTime %s", userName, java.lang.Long.valueOf(this.f261672e), java.lang.Long.valueOf(this.f261679o), java.lang.Integer.valueOf(ve6Var.f388176g));
        com.tencent.mm.modelbase.u0 u0Var2 = this.f261675h;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        } else {
            kotlin.jvm.internal.o.o(str2);
            throw null;
        }
    }
}
