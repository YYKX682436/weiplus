package ru2;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ru2.d f399736d = new ru2.d();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = (com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) ((com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseAllView before createdVideoViews:");
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = finderVideoRecycler.f133677m;
        sb6.append(concurrentLinkedQueue.size());
        sb6.append(" recycledVideoViews:");
        java.util.HashSet hashSet = finderVideoRecycler.f133676i;
        sb6.append(hashSet.size());
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", sb6.toString());
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "releaseAllView after createdVideoViews:" + concurrentLinkedQueue.size() + " recycledVideoViews:" + hashSet.size());
                ru2.j.f399745h = null;
                return;
            }
            cw2.da daVar = (cw2.da) ((java.lang.ref.WeakReference) it.next()).get();
            if (daVar != null) {
                com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "releaseAllView view:" + daVar + " mediaid:" + daVar.getVideoMediaId());
                daVar.d();
                daVar.b();
                if (kotlin.jvm.internal.o.b(daVar, finderVideoRecycler.f133685u)) {
                    android.view.ViewParent parent = daVar.getVideoView().getParent();
                    cw2.v9 v9Var = parent instanceof cw2.v9 ? (cw2.v9) parent : null;
                    cw2.h8 playInfo = v9Var != null ? v9Var.getPlayInfo() : null;
                    if (playInfo != null) {
                        playInfo.f223753i = false;
                    }
                }
                finderVideoRecycler.e7(daVar.getVideoView());
                it.remove();
            }
        }
    }
}
