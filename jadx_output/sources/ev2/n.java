package ev2;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static final ev2.n f256921f = new ev2.n();

    /* renamed from: a, reason: collision with root package name */
    public final fp0.o f256922a = new fp0.o(new gp0.g(new gp0.b(100, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "uni_action_like_post_quene"));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f256923b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f256924c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f256925d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f256926e;

    public n() {
        try {
            java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.plugin.finder.storage.u90) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).f39131v).getValue()).y0()).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.finder.storage.t90 t90Var = (com.tencent.mm.plugin.finder.storage.t90) it.next();
                this.f256925d.put(java.lang.Long.valueOf(t90Var.field_localId), t90Var);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MusicUni.FinderLikeActionMgr", th6, "restoreLocalLikeFeed", new java.lang.Object[0]);
        }
        this.f256923b = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f256924c = new java.util.concurrent.ConcurrentHashMap();
        this.f256925d = new java.util.HashMap();
        this.f256926e = new ev2.m(this);
    }

    public final int a(long j17, jv2.c commentObj, int i17) {
        ev2.t tVar;
        boolean z17;
        ev2.t tVar2;
        kotlin.jvm.internal.o.g(commentObj, "commentObj");
        if (j17 == 0) {
            return commentObj.getLikeCount();
        }
        boolean z18 = commentObj.u0().getLikeFlag() == 1;
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.j().r()).intValue();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f256924c;
        if (intValue == 1 || com.tencent.mm.plugin.finder.storage.t70.M != 1) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (concurrentHashMap2 != null && (tVar = (ev2.t) concurrentHashMap2.get(new ev2.k(commentObj.t0(), i17))) != null) {
                z17 = tVar.f256935e;
            }
            z17 = z18;
        } else {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (concurrentHashMap3 != null && (tVar2 = (ev2.t) concurrentHashMap3.get(new ev2.k(commentObj.t0(), 1))) != null) {
                z17 = tVar2.f256935e;
            }
            z17 = z18;
        }
        return (!z18 || z18 == z17) ? (z18 || z18 == z17) ? commentObj.getLikeCount() : commentObj.getLikeCount() + 1 : commentObj.getLikeCount() - 1;
    }

    public final boolean b(long j17, jv2.c commentObj, int i17) {
        ev2.t tVar;
        ev2.t tVar2;
        kotlin.jvm.internal.o.g(commentObj, "commentObj");
        if (j17 == 0) {
            return commentObj.u0().getLikeFlag() == 1;
        }
        boolean z17 = commentObj.u0().getLikeFlag() == 1;
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.j().r()).intValue();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f256924c;
        if (intValue == 1 || com.tencent.mm.plugin.finder.storage.t70.M != 1) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (concurrentHashMap2 != null && (tVar = (ev2.t) concurrentHashMap2.get(new ev2.k(commentObj.t0(), i17))) != null) {
                z17 = tVar.f256935e;
            }
        } else {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (concurrentHashMap3 != null && (tVar2 = (ev2.t) concurrentHashMap3.get(new ev2.k(commentObj.t0(), 1))) != null) {
                z17 = tVar2.f256935e;
            }
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z17;
    }

    public final void c(ev2.t action) {
        kotlin.jvm.internal.o.g(action, "action");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f256924c.get(java.lang.Long.valueOf(action.f256937g));
        if (concurrentHashMap != null) {
            ev2.k kVar = new ev2.k(action.f256934d.t0(), action.f256938h);
            ev2.t tVar = (ev2.t) concurrentHashMap.get(kVar);
            if (tVar != null) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (action.f256907b >= tVar.f256907b) {
                    concurrentHashMap.remove(kVar);
                }
            }
        }
    }

    public final void d() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f256923b;
        if (concurrentLinkedQueue.size() <= 0) {
            return;
        }
        ev2.e eVar = (ev2.e) concurrentLinkedQueue.poll();
        eVar.getClass();
        boolean z17 = eVar.f256906a < 2 && c01.id.a() - eVar.f256907b <= ((long) 1200000);
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.FinderLikeActionMgr", "tryNext isValid:" + z17 + " action:" + eVar + " size:" + concurrentLinkedQueue.size());
        if (z17) {
            this.f256922a.b(new ev2.q(eVar), new ev2.l(this, eVar));
        } else {
            d();
        }
    }
}
