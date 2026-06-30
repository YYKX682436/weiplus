package com.tencent.mm.plugin.finder.service;

@j95.b
/* loaded from: classes2.dex */
public final class l2 extends i95.w implements zy2.a7 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f126117h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f126119m;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.c0 f126113d = new com.tencent.mm.sdk.platformtools.c0(200);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.service.b2 f126114e = new com.tencent.mm.plugin.finder.service.b2();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f126115f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f126116g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f126118i = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f126120n = new java.util.concurrent.CopyOnWriteArraySet();

    public void Ai(java.util.List feedList, int i17, int i18, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(feedList, "feedList");
        if (z17) {
            if (i18 != 0) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f126116g;
                java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(java.lang.Integer.valueOf(i18));
                if (l17 == null) {
                    l17 = 0L;
                }
                long longValue = l17.longValue();
                java.lang.Integer num = (java.lang.Integer) this.f126115f.get(java.lang.Integer.valueOf(i18));
                if (num == null) {
                    num = 0;
                }
                int intValue = num.intValue();
                if (longValue > 0 && c01.id.c() - longValue < intValue) {
                    com.tencent.mars.xlog.Log.i("FinderFeedDetailService", "preloadEncryptedFeedList skip, lastFetchTime:" + longValue + " intervalMs:" + intValue);
                    return;
                }
                concurrentHashMap.put(java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(c01.id.c()));
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = feedList.iterator();
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                r45.rv0 rv0Var = new r45.rv0();
                rv0Var.set(1, (java.lang.String) lVar.f302833d);
                rv0Var.set(2, (java.lang.String) lVar.f302834e);
                linkedList.add(rv0Var);
            }
            Di(i17, i18, linkedList, 1, z18);
        }
    }

    public void Bi(com.tencent.mm.protocal.protobuf.FinderObject feed, int i17, int i18) {
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mars.xlog.Log.i("FinderFeedDetailService", "preloadFeed " + pm0.v.u(feed.getId()) + ", commentScene:" + i17 + ", preloadStage:" + i18);
        this.f126114e.a(i17, kz5.b0.c(feed), i18);
    }

    public final void Di(int i17, int i18, java.util.LinkedList objectIds, int i19, boolean z17) {
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Rf).getValue()).r()).booleanValue()) {
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(5, java.lang.Integer.valueOf(i17));
            new az2.a(objectIds, qt2Var, i18).l().H(new com.tencent.mm.plugin.finder.service.d2(i17, objectIds, z17, i18, this, i19));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.k kVar = (cq.k) c17;
        r45.qt2 qt2Var2 = new r45.qt2();
        qt2Var2.set(5, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.finder.service.e2 e2Var = new com.tencent.mm.plugin.finder.service.e2(i17, objectIds, z17, i18, this, i19);
        com.tencent.mm.plugin.finder.service.f2 f2Var = new com.tencent.mm.plugin.finder.service.f2(i17, objectIds);
        kotlin.jvm.internal.o.g(objectIds, "objectIds");
        new bq.f(objectIds, qt2Var2, i18, -1).l().q(new cq.r(e2Var, f2Var, kVar, qt2Var2));
    }

    public void wi(int i17, java.lang.String encryptedObjectId, boolean z17, java.lang.String str, yz5.p call) {
        kotlin.jvm.internal.o.g(encryptedObjectId, "encryptedObjectId");
        kotlin.jvm.internal.o.g(call, "call");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = z17 ? (com.tencent.mm.protocal.protobuf.FinderObject) this.f126113d.b(encryptedObjectId) : null;
        if (finderObject != null) {
            call.invoke(encryptedObjectId, finderObject);
            return;
        }
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(i17));
        qt2Var.set(11, str);
        new db2.g4(0L, "", 0, 2, "", true, null, null, 0L, null, false, false, encryptedObjectId, qt2Var, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536858560, null).l().H(new com.tencent.mm.plugin.finder.service.c2(this, encryptedObjectId, call));
    }
}
