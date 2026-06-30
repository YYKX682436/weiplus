package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class x90 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler f136427d;

    public x90(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler) {
        this.f136427d = finderVideoRecycler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinish createdVideoViews ");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = this.f136427d;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = finderVideoRecycler.f133677m;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(concurrentLinkedQueue, 10));
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((java.lang.ref.WeakReference) it.next()).hashCode()));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", sb6.toString());
        finderVideoRecycler.f133677m.size();
        finderVideoRecycler.getClass();
        java.util.List S0 = kz5.n0.S0(finderVideoRecycler.f133677m);
        finderVideoRecycler.f133677m.clear();
        java.util.Iterator it6 = S0.iterator();
        while (it6.hasNext()) {
            cw2.da daVar = (cw2.da) ((java.lang.ref.WeakReference) it6.next()).get();
            if (daVar != null) {
                daVar.d();
                daVar.b();
            }
        }
        finderVideoRecycler.f133676i.clear();
    }
}
