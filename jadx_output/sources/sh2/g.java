package sh2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final sh2.g f408020e = new sh2.g();

    /* renamed from: a, reason: collision with root package name */
    public final fp0.o f408021a = new fp0.o(new gp0.g(new gp0.b(100, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "finder_action_like_post_quene"));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f408022b = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f408023c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f408024d = new sh2.f(this);

    public final void a() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f408022b;
        sh2.a aVar = (sh2.a) concurrentLinkedQueue.poll();
        if (aVar == null) {
            return;
        }
        boolean z17 = aVar.f408009b < 2 && c01.id.a() - aVar.f408010c <= ((long) 1200000);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveLikeActionMgr", "tryNext isValid:" + z17 + " action:" + aVar + " size:" + concurrentLinkedQueue.size());
        if (z17) {
            this.f408021a.b(new sh2.j(aVar), new sh2.e(this, aVar));
        } else {
            a();
        }
    }
}
