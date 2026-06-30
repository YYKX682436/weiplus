package nv2;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final nv2.o f340558e = new nv2.o();

    /* renamed from: a, reason: collision with root package name */
    public final fp0.o f340559a = new fp0.o(new gp0.g(new gp0.b(100, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "finder_action_fav_post_quene"));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f340560b = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f340561c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f340562d = new nv2.n(this);

    public static void a(nv2.o oVar, com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17, int i17, nv2.i1 i1Var, r45.qt2 contextObj, int i18, java.lang.String str, r45.t21 t21Var, r45.bc1 bc1Var, int i19, java.lang.Object obj) {
        nv2.i1 i1Var2 = (i19 & 8) != 0 ? null : i1Var;
        int i27 = (i19 & 32) != 0 ? 0 : i18;
        java.lang.String str2 = (i19 & 64) != 0 ? null : str;
        r45.t21 newLifeReportInfo = (i19 & 128) != 0 ? new r45.t21() : t21Var;
        r45.bc1 bc1Var2 = (i19 & 256) != 0 ? null : bc1Var;
        oVar.getClass();
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(newLifeReportInfo, "newLifeReportInfo");
        com.tencent.mars.xlog.Log.i("Finder.FavActionMgr", "dolike " + feed.getUserName() + ' ' + z17);
        long j17 = feed.field_id;
        nv2.l lVar = new nv2.l(feed, j17, feed.getObjectNonceId(), z17, i17, i1Var2, contextObj, i27, str2, newLifeReportInfo, bc1Var2);
        oVar.f340561c.put(java.lang.Long.valueOf(j17), lVar);
        oVar.f340559a.b(new nv2.q(lVar), new nv2.m(oVar, lVar));
    }

    public final int b(com.tencent.mm.protocal.protobuf.FinderObject f17) {
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        kotlin.jvm.internal.o.g(f17, "f");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) t70Var.d2().r()).booleanValue()) {
            return f17.getFavCount();
        }
        if (f17.getId() == 0) {
            return f17.getLikeCount();
        }
        if ((((java.lang.Number) t70Var.w0().r()).intValue() == 1) && (h17 = bu2.j.f24534a.h(f17.getId())) != null && (feedObject = h17.getFeedObject()) != null) {
            f17 = feedObject;
        }
        boolean z17 = f17.getFavFlag() == 1;
        nv2.l lVar = (nv2.l) this.f340561c.get(java.lang.Long.valueOf(f17.getId()));
        boolean z18 = lVar != null ? lVar.f340522g : z17;
        return (!z17 || z17 == z18) ? (z17 || z17 == z18) ? f17.getFavCount() : f17.getFavCount() + 1 : f17.getFavCount() - 1;
    }

    public final boolean c(com.tencent.mm.protocal.protobuf.FinderObject feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.d2().r()).booleanValue()) {
            return feed.getFavFlag() == 1;
        }
        if (feed.getId() == 0) {
            return feed.getFavFlag() == 1;
        }
        boolean z17 = feed.getFavFlag() == 1;
        nv2.l lVar = (nv2.l) this.f340561c.get(java.lang.Long.valueOf(feed.getId()));
        if (lVar != null) {
            z17 = lVar.f340522g;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z17;
    }

    public final void d(nv2.l action) {
        kotlin.jvm.internal.o.g(action, "action");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f340561c;
        long j17 = action.f340520e;
        nv2.l lVar = (nv2.l) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (lVar != null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (action.f340575c >= lVar.f340575c) {
                concurrentHashMap.remove(java.lang.Long.valueOf(j17));
            }
        }
    }

    public final void e() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f340560b;
        if (concurrentLinkedQueue.size() <= 0) {
            return;
        }
        nv2.r rVar = (nv2.r) concurrentLinkedQueue.poll();
        boolean b17 = rVar.b();
        com.tencent.mars.xlog.Log.i("Finder.FavActionMgr", "tryNext isValid:" + b17 + " action:" + rVar + " size:" + concurrentLinkedQueue.size());
        if (!b17) {
            e();
            return;
        }
        this.f340559a.b(new nv2.q(rVar), new nv2.m(this, rVar));
    }
}
