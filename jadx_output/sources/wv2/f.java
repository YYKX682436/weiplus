package wv2;

/* loaded from: classes10.dex */
public final class f extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f450005h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f450006i;

    /* renamed from: m, reason: collision with root package name */
    public pv2.g f450007m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f450008n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f450009o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f450010p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f450011q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f450005h = finderObj;
        this.f450006i = "LogPost.MvPostCgiStage";
        this.f450007m = new wv2.n(finderObj, 2);
        this.f450008n = new java.util.concurrent.CountDownLatch(1);
        this.f450009o = new java.util.HashSet();
        this.f450011q = new wv2.e(this);
    }

    @Override // pv2.g
    public int a() {
        return 4;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        gm0.j1.d().q(6649, this.f450011q);
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        gm0.j1.d().q(6649, this.f450011q);
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        gm0.j1.d().q(6649, this.f450011q);
    }

    @Override // ov2.e
    public pv2.g j() {
        java.util.HashSet hashSet;
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start localId:");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f450005h;
        sb6.append(finderItem.getLocalId());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f450006i;
        com.tencent.mars.xlog.Log.i(str, sb7);
        cu2.t tVar = cu2.u.f222441a;
        if (!tVar.k(finderItem.getLocalId())) {
            return new wv2.n(finderItem, 1);
        }
        com.tencent.mars.xlog.Log.i(str, "doMvPostScene " + finderItem.getLocalId());
        boolean isLongVideo = finderItem.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 23L, 1L);
        if (isLongVideo) {
            g0Var.C(1523L, 23L, 1L);
        }
        finderItem.trackPost("doMvPostScene");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setPostStage(7);
        }
        tVar.n(finderItem);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
        r45.ef2 mvInfo = objectDesc != null ? objectDesc.getMvInfo() : null;
        if (mvInfo == null) {
            return new wv2.n(finderItem, 2);
        }
        gm0.j1.d().a(6649, this.f450011q);
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
            hashSet = this.f450009o;
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
            java.util.Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                gm0.j1.d().g((wv2.p) it7.next());
            }
        } else {
            k();
        }
        this.f450008n.await();
        return this.f450007m;
    }

    public final void k() {
        cu2.t tVar = cu2.u.f222441a;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f450005h;
        boolean k17 = tVar.k(finderItem.getLocalId());
        java.util.concurrent.CountDownLatch countDownLatch = this.f450008n;
        if (!k17) {
            com.tencent.mars.xlog.Log.i(this.f450006i, "post before doScene cancel because feed is deleted");
            this.f450007m = new wv2.n(finderItem, 2);
            countDownLatch.countDown();
            return;
        }
        boolean isLongVideo = finderItem.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 23L, 1L);
        if (isLongVideo) {
            g0Var.C(1523L, 23L, 1L);
        }
        finderItem.trackPost("doMvPostScene");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setPostStage(4);
        }
        tVar.n(finderItem);
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.d1().r()).intValue() != 3) {
            new db2.p2(this.f450005h, null, false, 6, null).l().K(new wv2.d(this));
        } else {
            this.f450007m = new wv2.n(finderItem, 2);
            countDownLatch.countDown();
        }
    }
}
