package ey2;

/* loaded from: classes2.dex */
public final class b1 extends pf5.o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f257325f = kz5.z.D0(new java.lang.Integer[]{-561, -562, -563, -564, -1203, -1204, -1205, -1208, -2026, -3001, 30001});

    /* renamed from: e, reason: collision with root package name */
    public boolean f257326e;

    public b1() {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(new ey2.w0(this), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }

    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed N6(int i17, int i18) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed[] O6 = O6(i17, i18, 1);
        if (O6 != null) {
            return (com.tencent.mm.plugin.finder.model.BaseFinderFeed) kz5.z.O(O6);
        }
        return null;
    }

    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed[] O6(int i17, int i18, int i19) {
        c66.q qVar = c66.q.f39493a;
        com.tencent.wcdb.winq.Expression and = ni0.d.f337208e.eq(i18).and(ni0.d.f337210g.gt(c01.id.e()));
        kotlin.jvm.internal.o.f(and, "and(...)");
        if (i17 == 0 || i17 == 1) {
            and = and.and(ni0.d.f337212i.bitAnd(128));
            kotlin.jvm.internal.o.f(and, "and(...)");
        }
        try {
            java.util.List<T> allObjects = qVar.d().getAllObjects(and, ni0.d.f337206c.order(com.tencent.wcdb.winq.Order.Desc), i19);
            kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
            java.util.Iterator it = allObjects.iterator();
            while (it.hasNext()) {
                arrayList.add(((ni0.j) it.next()).f337235b);
            }
            java.util.ArrayList b17 = qVar.b(arrayList, (kk.l) ((jz5.n) c66.q.f39501i).getValue(), new c66.n(allObjects));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("getLocalFeeds sucess, pullType:");
            sb6.append(i17);
            sb6.append(", scene:");
            sb6.append(i18);
            sb6.append(" count:");
            sb6.append(b17.size());
            sb6.append(" tidArray:");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(b17, 10));
            java.util.Iterator it6 = b17.iterator();
            while (it6.hasNext()) {
                arrayList2.add(pm0.v.u(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it6.next()).getFeedObject().getFeedObject().getId()));
            }
            sb6.append(arrayList2);
            com.tencent.mars.xlog.Log.i("Finder.WCFinderWCDB", sb6.toString());
            return (com.tencent.mm.plugin.finder.model.BaseFinderFeed[]) b17.toArray(new com.tencent.mm.plugin.finder.model.BaseFinderFeed[0]);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.WCFinderWCDB", "getLocalFeeds fail, pullType:" + i17 + ", scene:" + i18 + "}, e:" + e17.getMessage());
            return null;
        }
    }

    public final void P6() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (t70Var.M0().f126614b > 0 || t70Var.M0().f126615c > 0) {
            r45.oq2 Q6 = Q6();
            int e17 = c01.id.e();
            boolean z17 = false;
            if (e17 < Q6.getInteger(0) + Q6.getInteger(1)) {
                com.tencent.mars.xlog.Log.i("FinderLocalFeedProvider", "currentTimestamp:" + e17 + " < lastRequestTimestamp:" + Q6 + ".last_request_timestamp requestInterval:" + Q6.getInteger(1) + ' ');
                return;
            }
            int max = java.lang.Math.max(1, t70Var.M0().f126616d);
            int b17 = hc2.d0.b(4);
            c66.q qVar = c66.q.f39493a;
            com.tencent.wcdb.winq.Expression and = ni0.d.f337208e.eq(b17).and(ni0.d.f337210g.gt(c01.id.e()));
            kotlin.jvm.internal.o.f(and, "and(...)");
            com.tencent.wcdb.winq.Expression and2 = and.and(ni0.d.f337212i.bitAnd(128));
            kotlin.jvm.internal.o.f(and2, "and(...)");
            try {
                com.tencent.wcdb.base.Value value = qVar.d().getValue(com.tencent.wcdb.winq.Column.all().count(), and2);
                java.lang.Integer valueOf = value != null ? java.lang.Integer.valueOf(value.getInt()) : null;
                com.tencent.mars.xlog.Log.i("Finder.WCFinderWCDB", "hasEnoughValidLocalFeeds sucess, pullType=0, scene=" + b17 + ", required_count=" + max + ", localCount=" + valueOf);
                if ((valueOf != null ? valueOf.intValue() : 0) > max) {
                    z17 = true;
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("Finder.WCFinderWCDB", "hasEnoughValidLocalFeeds fail, pullType=0, scene=" + b17 + ", required_count=" + max);
            }
            if (z17 || this.f257326e) {
                return;
            }
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new ey2.a1(this, 4, 0, Q6, null), 3, null);
        }
    }

    public final r45.oq2 Q6() {
        r45.oq2 oq2Var = new r45.oq2();
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_LOCALBACKUP_PREFETCH_DISASTER_INFO_STRING, "");
        kotlin.jvm.internal.o.d(v17);
        if (v17.length() > 0) {
            oq2Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17));
        }
        return oq2Var;
    }

    public final void R6(java.util.List feedList, int i17, int i18) {
        kotlin.jvm.internal.o.g(feedList, "feedList");
        if (feedList.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = feedList.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) next;
            if (!hc2.o0.F(baseFinderFeed.getFeedObject().getFeedObject()) && !hc2.o0.E(baseFinderFeed.getFeedObject().getFeedObject(), false, 1, null)) {
                z17 = true;
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        c66.q qVar = c66.q.f39493a;
        qVar.d().deleteObjects(ni0.d.f337208e.eq(i17).and(ni0.d.f337211h.eq(i18)));
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("Finder.WCFinderWCDB", "delete local backup cache with scene:" + i17 + ", source:" + i18);
            return;
        }
        if (arrayList.size() > 100) {
            com.tencent.mars.xlog.Log.w("Finder.WCFinderWCDB", "insert backup feeds count = " + arrayList.size());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) it6.next();
            ni0.i iVar = new ni0.i();
            iVar.f337231a = pm0.v.u(baseFinderFeed2.getFeedObject().getFeedObject().getId());
            iVar.f337232b = baseFinderFeed2.getFeedObject().getFeedObject().toByteArray();
            iVar.f337233c = c01.id.e();
            arrayList2.add(iVar);
        }
        qVar.e(arrayList2);
        int e17 = c01.id.e() + c66.q.f39494b;
        long c17 = ((i18 * 10000000000L) + (c01.id.c() % 10000000000L)) * 100;
        e06.k g17 = kz5.c0.g(arrayList);
        e06.i iVar2 = new e06.i(g17.f246210e, 0, -g17.f246211f);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(iVar2, 10));
        kz5.x0 it7 = iVar2.iterator();
        while (((e06.j) it7).f246214f) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) arrayList.get(it7.b());
            ni0.j jVar = new ni0.j();
            long j17 = 1 + c17;
            jVar.f337234a = c17;
            jVar.f337235b = pm0.v.u(baseFinderFeed3.getFeedObject().getFeedObject().getId());
            jVar.f337236c = i17;
            jVar.f337237d = baseFinderFeed3.getFeedObject().getFromType();
            jVar.f337239f = i18;
            jVar.f337240g = baseFinderFeed3.getFeedObject().getFeedObject().getFunc_flag();
            jVar.f337238e = baseFinderFeed3.getFeedObject().getUnreadExpiredTime() != 0 ? baseFinderFeed3.getFeedObject().getUnreadExpiredTime() : e17;
            arrayList3.add(jVar);
            c17 = j17;
        }
        try {
            qVar.d().insertOrReplaceObjects(arrayList3);
            java.util.Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed4 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) it8.next();
                c66.q qVar2 = c66.q.f39493a;
                ((kk.l) ((jz5.n) c66.q.f39501i).getValue()).put(pm0.v.u(baseFinderFeed4.getFeedObject().getFeedObject().getId()), baseFinderFeed4);
            }
            com.tencent.mars.xlog.Log.i("Finder.WCFinderWCDB", "update local backup cache success, scene:" + i17 + ", source:" + i18 + ", array:" + arrayList3);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("Finder.WCFinderWCDB", "update local backup cache fail, scene:" + i17 + ", source:" + i18 + ", array:" + arrayList3 + ", e:" + e18.getMessage());
        }
    }
}
