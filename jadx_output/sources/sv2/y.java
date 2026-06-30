package sv2;

/* loaded from: classes10.dex */
public final class y extends ov2.e implements com.tencent.mm.modelbase.u0 {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413375h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f413376i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f413377m;

    /* renamed from: n, reason: collision with root package name */
    public pv2.g f413378n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f413379o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashSet f413380p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f413381q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f413382r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        super("draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413375h = draftItem;
        this.f413376i = "LogPost.MvDraftCgiStage";
        this.f413377m = draftItem.t0();
        this.f413378n = new sv2.c(draftItem, 2);
        this.f413379o = new java.util.concurrent.CountDownLatch(1);
        this.f413380p = new java.util.HashSet();
        this.f413382r = new sv2.x(this);
    }

    @Override // pv2.g
    public int a() {
        return 4;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        gm0.j1.d().q(6649, this.f413382r);
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        gm0.j1.d().q(6649, this.f413382r);
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        gm0.j1.d().q(6649, this.f413382r);
    }

    @Override // ov2.e
    public pv2.g j() {
        java.util.HashSet hashSet;
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start localId:");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f413377m;
        sb6.append(finderItem.getLocalId());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f413376i;
        com.tencent.mars.xlog.Log.i(str, sb7);
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f413375h;
        if (!(((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(x80Var.field_localId) != null)) {
            com.tencent.mars.xlog.Log.i(str, "start but not exist: " + x80Var.field_localId);
            return new sv2.c(x80Var, 1);
        }
        com.tencent.mars.xlog.Log.i(str, "doMvPostScene " + x80Var.field_localId);
        boolean isLongVideo = finderItem.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1718L, 23L, 1L);
        if (isLongVideo) {
            g0Var.C(1719L, 23L, 1L);
        }
        finderItem.trackPost("doMvPostScene");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setPostStage(7);
        }
        java.lang.String string = finderItem.getPostInfo().getString(0);
        if (string == null || string.length() == 0) {
            finderItem.getPostInfo().set(0, "FinderLocal_" + java.lang.System.nanoTime());
        }
        cu2.o.f222430a.b(x80Var);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
        r45.ef2 mvInfo = objectDesc != null ? objectDesc.getMvInfo() : null;
        if (mvInfo == null) {
            return new sv2.c(x80Var, 2);
        }
        gm0.j1.d().a(6649, this.f413382r);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (mvInfo.getInteger(6) == 1) {
            java.util.LinkedList list = mvInfo.getList(5);
            kotlin.jvm.internal.o.f(list, "getOrdered_track_list_flex_clip(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (((r45.jf2) obj2).getLong(2) == 0) {
                    arrayList.add(obj2);
                }
            }
            linkedList.addAll(arrayList);
        } else {
            java.util.LinkedList list2 = mvInfo.getList(0);
            kotlin.jvm.internal.o.f(list2, "getOrderedTrackList(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : list2) {
                if (((r45.jf2) obj3).getLong(2) == 0) {
                    arrayList2.add(obj3);
                }
            }
            linkedList.addAll(arrayList2);
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashSet = this.f413380p;
            if (!hasNext) {
                break;
            }
            r45.jf2 jf2Var = (r45.jf2) it.next();
            java.util.Iterator<T> it6 = finderItem.getClipListExt().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it6.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.storage.FinderItem) obj).getObjectNonceId(), jf2Var.getString(3))) {
                    break;
                }
            }
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = (com.tencent.mm.plugin.finder.storage.FinderItem) obj;
            if (finderItem2 != null) {
                hashSet.add(new wv2.p(finderItem2, jf2Var, null, 4, null));
            }
        }
        if (!hashSet.isEmpty()) {
            com.tencent.mars.xlog.Log.i(str, "start clip cgi, size:" + hashSet.size());
            java.util.Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                gm0.j1.d().g((wv2.p) it7.next());
            }
        } else {
            k();
        }
        this.f413379o.await();
        return this.f413378n;
    }

    public final void k() {
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f413375h;
        boolean z17 = ((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(x80Var.field_localId) != null;
        java.util.concurrent.CountDownLatch countDownLatch = this.f413379o;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(this.f413376i, "post before doScene cancel because feed is deleted " + x80Var.field_localId);
            this.f413378n = new sv2.c(x80Var, 2);
            countDownLatch.countDown();
            return;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f413377m;
        boolean isLongVideo = finderItem.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1718L, 23L, 1L);
        if (isLongVideo) {
            g0Var.C(1719L, 23L, 1L);
        }
        finderItem.trackPost("doMvPostScene");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setPostStage(4);
        }
        cu2.o.f222430a.b(x80Var);
        com.tencent.mm.plugin.finder.storage.x80 x80Var2 = this.f413375h;
        java.lang.String string = finderItem.getPostInfo().getString(0);
        if (string == null) {
            string = "";
        }
        wv2.o oVar = new wv2.o(x80Var2, string, null, null, 12, null);
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.d1().r()).intValue() == 3) {
            this.f413378n = new sv2.c(x80Var, 2);
            countDownLatch.countDown();
        } else {
            gm0.j1.n().f273288b.a(6649, this);
            gm0.j1.d().h(oVar, 0);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof wv2.o) {
            gm0.j1.n().f273288b.q(6649, this);
            wv2.o oVar = (wv2.o) m1Var;
            java.lang.String str2 = oVar.f450035h;
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2};
            java.lang.String str3 = this.f413376i;
            com.tencent.mars.xlog.Log.i(str3, "errType %d, errCode %d, errMsg %s, clientId %s", objArr);
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f413377m;
            if (!str2.equals(finderItem.getPostInfo().getString(0))) {
                com.tencent.mars.xlog.Log.w(str3, "not my feed!");
                return;
            }
            finderItem.trackDraftPost("doPostSceneEnd");
            com.tencent.mm.protobuf.f fVar = oVar.f450036i.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPostDraftResponse");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.pp2) fVar).getCustom(1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("svrFinderObj id:");
            sb6.append(finderObject != null ? java.lang.Long.valueOf(finderObject.getId()) : null);
            sb6.append(", localId:");
            com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f413375h;
            sb6.append(x80Var.field_localId);
            com.tencent.mars.xlog.Log.i(str3, sb6.toString());
            cu2.o oVar2 = cu2.o.f222430a;
            java.util.concurrent.CountDownLatch countDownLatch = this.f413379o;
            if (i17 != 0 || i18 != 0 || finderObject == null) {
                com.tencent.mm.plugin.finder.report.e0 e0Var = com.tencent.mm.plugin.finder.report.e0.f125003a;
                e0Var.f(finderItem.isLongVideo());
                if (((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(x80Var.field_localId) != null) {
                    if (i17 == 4) {
                        x80Var.field_localFlag = (x80Var.field_localFlag | 2) & (-2);
                        oVar2.b(x80Var);
                        e0Var.e(finderItem.isLongVideo());
                    }
                    if ((x80Var.field_localFlag & 2) != 0) {
                        com.tencent.mm.plugin.finder.report.p2.f125237a.P(x80Var.field_localId, i17, i18);
                        com.tencent.mm.plugin.finder.report.b0.f124961a.a(x80Var);
                        mv2.f0 f0Var = mv2.f0.f331561a;
                        pm0.v.X(new mv2.t(x80Var.field_localId, false));
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(str3, "deleted when scene end.");
                }
                this.f413378n = new sv2.c(x80Var, 2);
                countDownLatch.countDown();
                return;
            }
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.setPostTaskCost(finderFeedReportObject.getPostTaskCost() + ((int) g()));
            }
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = finderItem.field_reportObject;
            if (finderFeedReportObject2 != null) {
                hc2.p0.b(finderFeedReportObject2, "postSuccess");
            }
            com.tencent.mm.plugin.finder.report.b0.f124961a.a(x80Var);
            oVar2.c(x80Var, finderObject);
            mv2.f0 f0Var2 = mv2.f0.f331561a;
            pm0.v.X(new mv2.u(x80Var.field_localId, finderObject.getId(), true));
            if (finderItem.getPostInfo().getLong(6) > 0) {
                long a17 = c01.id.a() - finderItem.getPostInfo().getLong(6);
                boolean isLongVideo = finderItem.isLongVideo();
                com.tencent.mm.plugin.finder.report.f0 f0Var3 = com.tencent.mm.plugin.finder.report.f0.f125015a;
                f0Var3.d(1718L, 11L, 1L, isLongVideo);
                f0Var3.d(1718L, 12L, a17, isLongVideo);
            }
            this.f413378n = new sv2.b(x80Var);
            countDownLatch.countDown();
        }
    }
}
