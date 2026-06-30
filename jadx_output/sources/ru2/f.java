package ru2;

/* loaded from: classes2.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ru2.f f399738d = new ru2.f();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = (com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) ((com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseUnFocusView before createdVideoViews:");
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = finderVideoRecycler.f133677m;
        sb6.append(concurrentLinkedQueue.size());
        sb6.append(" recycledVideoViews:");
        java.util.HashSet hashSet = finderVideoRecycler.f133676i;
        sb6.append(hashSet.size());
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", sb6.toString());
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            cw2.da daVar = (cw2.da) ((java.lang.ref.WeakReference) it.next()).get();
            if (daVar != null) {
                if (kotlin.jvm.internal.o.b(daVar, finderVideoRecycler.f133685u)) {
                    com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "releaseUnFocusView return for view:" + daVar + " mediaid:" + daVar.getVideoMediaId());
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "releaseUnFocusView view:" + daVar + " mediaid:" + daVar.getVideoMediaId());
                    daVar.d();
                    daVar.b();
                    finderVideoRecycler.e7(daVar.getVideoView());
                    it.remove();
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "releaseUnFocusView after createdVideoViews:" + concurrentLinkedQueue.size() + " recycledVideoViews:" + hashSet.size());
        ru2.j.f399743f = null;
    }
}
