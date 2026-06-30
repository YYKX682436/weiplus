package tv2;

/* loaded from: classes10.dex */
public final class m extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f422315h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f422316i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f422317m;

    /* renamed from: n, reason: collision with root package name */
    public pv2.g f422318n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f422319o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f422320p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.finder.storage.FinderItem finderObj, byte[] bArr) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f422315h = finderObj;
        this.f422316i = bArr;
        this.f422317m = "LogPost.FinderPostCgiStage";
        this.f422318n = new tv2.x(finderObj, 2);
        this.f422319o = new java.util.concurrent.CountDownLatch(1);
        w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
        java.lang.String str = finderObj.field_username;
        ((qs2.q) eVar).getClass();
        boolean z17 = false;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.C8).getValue()).r()).intValue() != 0) {
            m92.b j37 = g92.a.j3(g92.b.f269769e, str == null ? "" : str, false, 2, null);
            if (j37 != null) {
                r45.ju0 ju0Var = (r45.ju0) j37.u0().getCustom(33);
                z17 = !(ju0Var != null ? ju0Var.getBoolean(0) : true);
            }
        }
        this.f422320p = z17;
    }

    public static final void k(tv2.m mVar, int i17, int i18, java.lang.String str, long j17) {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = mVar.f422315h;
        finderItem.trackPost("doPostSceneEnd");
        if (i17 == 0 && i18 == 0) {
            if (mVar.f422320p) {
                mVar.n(new tv2.o(finderItem));
            } else {
                com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j17);
                if (h17 != null && (finderFeedReportObject2 = h17.field_reportObject) != null) {
                    finderFeedReportObject2.setPostTaskCost(finderFeedReportObject2.getPostTaskCost() + ((int) mVar.g()));
                }
                if (h17 != null && (finderFeedReportObject = h17.field_reportObject) != null) {
                    hc2.p0.b(finderFeedReportObject, "postSuccess");
                }
                mVar.n(new tv2.q(finderItem));
            }
            ov2.e.i(mVar, "andr_Cgi_Post_Suc", mVar.f422315h, 0, null, 12, null);
        } else {
            com.tencent.mm.plugin.finder.report.p2.f125237a.P(finderItem.getLocalId(), i17, i18);
            if (finderItem.isPostFailed()) {
                mv2.f0 f0Var = mv2.f0.f331561a;
                pm0.v.X(new mv2.w(finderItem.getLocalId()));
            }
            mVar.n(new tv2.x(finderItem, 2));
            mVar.h("andr_Cgi_Post_Fail", finderItem, i18, str);
        }
        hz2.d.f286313a.h(i17, i18, str);
    }

    @Override // pv2.g
    public int a() {
        return 4;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // ov2.e
    public pv2.g j() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        r45.zw0 client_draft_ext_info;
        r45.zw0 client_draft_ext_info2;
        r45.q23 video_tmpl_info;
        r45.ko6 ko6Var;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f422315h;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
        java.lang.String str = "start localId:" + finderItem.getLocalId() + " checkSum:" + ((objectDesc == null || (video_tmpl_info = objectDesc.getVideo_tmpl_info()) == null || (ko6Var = video_tmpl_info.f383601w) == null) ? null : ko6Var.f378884i);
        java.lang.String str2 = this.f422317m;
        com.tencent.mars.xlog.Log.i(str2, str);
        cu2.t tVar = cu2.u.f222441a;
        if (!tVar.k(finderItem.getLocalId())) {
            return new tv2.x(finderItem, 1);
        }
        com.tencent.mars.xlog.Log.i(str2, "doPostScene " + finderItem.getLocalId());
        boolean isLongVideo = finderItem.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 23L, 1L);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 23L, 1L);
            }
        }
        finderItem.trackPost("doPostScene");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setPostStage(4);
        }
        tVar.l(finderItem);
        boolean isQAFeed = finderItem.isQAFeed();
        byte[] bArr = this.f422316i;
        if (isQAFeed) {
            int qAType = finderItem.getQAType();
            db2.t2 t2Var = new db2.t2(finderItem, bArr, qAType != 1 ? qAType != 2 ? 4 : 2 : 1);
            com.tencent.mars.xlog.Log.i(str2, "doPostSceneContinue finderObj_waitType: " + finderItem.getPostInfo().getInteger(13));
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.d1().r()).intValue() == 3) {
                n(new tv2.x(finderItem, 2));
            } else {
                t2Var.l().K(new tv2.k(this));
            }
        } else {
            db2.p2 p2Var = new db2.p2(finderItem, bArr, this.f422320p);
            r45.qo5 qo5Var = (r45.qo5) finderItem.getPostInfo().getCustom(12);
            java.lang.String string4 = qo5Var != null ? qo5Var.getString(2) : null;
            int i17 = 0;
            if (string4 == null || string4.length() == 0) {
                l(p2Var);
            } else {
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderItem.getFeedObject().getObjectDesc();
                if (((objectDesc2 == null || (client_draft_ext_info2 = objectDesc2.getClient_draft_ext_info()) == null) ? 0 : client_draft_ext_info2.getInteger(0)) != 0) {
                    com.tencent.mars.xlog.Log.i(str2, "dealDumpCgi has done, continue post");
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderItem.getFeedObject().getObjectDesc();
                    if (objectDesc3 != null && (client_draft_ext_info = objectDesc3.getClient_draft_ext_info()) != null) {
                        i17 = client_draft_ext_info.getInteger(0);
                    }
                    p2Var.f228114w.set(23, java.lang.Integer.valueOf(i17));
                    l(p2Var);
                } else {
                    r45.qo5 qo5Var2 = (r45.qo5) finderItem.getPostInfo().getCustom(12);
                    java.lang.String field_username = finderItem.field_username;
                    kotlin.jvm.internal.o.f(field_username, "field_username");
                    new db2.k0(field_username, finderItem.getClientId(), (qo5Var2 == null || (string3 = qo5Var2.getString(2)) == null) ? "" : string3, (qo5Var2 == null || (string2 = qo5Var2.getString(0)) == null) ? "" : string2, (qo5Var2 == null || (string = qo5Var2.getString(1)) == null) ? "" : string).l().K(new tv2.j(finderItem, this, p2Var));
                }
            }
        }
        this.f422319o.await();
        return this.f422318n;
    }

    public final void l(db2.p2 p2Var) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f422315h;
        r45.ab4 ab4Var = (r45.ab4) finderItem.getPostInfo().getCustom(31);
        if (ab4Var != null) {
            java.lang.String string = ab4Var.getString(1);
            if (!(string == null || string.length() == 0)) {
                new cq.k();
                int integer = ab4Var.getInteger(0);
                java.lang.String string2 = ab4Var.getString(1);
                java.lang.String string3 = ab4Var.getString(2);
                r45.xy6 xy6Var = (r45.xy6) ab4Var.getCustom(3);
                java.lang.String string4 = ab4Var.getString(4);
                java.lang.String string5 = ab4Var.getString(5);
                java.lang.String string6 = ab4Var.getString(8);
                java.lang.String finderUsername = finderItem.getUserName();
                tv2.h hVar = new tv2.h(p2Var, ab4Var, this);
                tv2.i iVar = new tv2.i(this);
                kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
                new bq.s1(integer, string2, string3, xy6Var, string4, string5, string6, finderUsername).l().q(new cq.p0(hVar, iVar));
                return;
            }
        }
        m(p2Var);
    }

    public final boolean m(db2.p2 p2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPostSceneContinue finderObj_waitType: ");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f422315h;
        sb6.append(finderItem.getPostInfo().getInteger(13));
        sb6.append(", request_waitType:");
        sb6.append(p2Var.f228114w.getInteger(23));
        com.tencent.mars.xlog.Log.i(this.f422317m, sb6.toString());
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.d1().r()).intValue() == 3) {
            n(new tv2.x(finderItem, 2));
            return false;
        }
        com.tencent.mm.plugin.finder.report.p2 p2Var2 = com.tencent.mm.plugin.finder.report.p2.f125237a;
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        com.tencent.mm.plugin.finder.report.p2.y(p2Var2, finderItem, "PostConfirmCgi", null, null, 0, 0L, 60, null);
        ov2.e.i(this, "andr_Cgi_Post_Begin", this.f422315h, 0, null, 12, null);
        p2Var.l().K(new tv2.l(this));
        return true;
    }

    public final void n(pv2.g gVar) {
        this.f422318n = gVar;
        this.f422319o.countDown();
    }
}
