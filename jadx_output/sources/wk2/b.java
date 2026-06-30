package wk2;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wk2.c f446934d;

    public b(wk2.c cVar) {
        this.f446934d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinish createdViews ");
        wk2.c cVar = this.f446934d;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = cVar.f446936b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(concurrentLinkedQueue, 10));
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((java.lang.ref.WeakReference) it.next()).hashCode()));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("FinderLivePlayerViewRecycler", sb6.toString());
        java.util.Iterator it6 = cVar.f446936b.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView multiStreamPreviewView = (com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView) ((java.lang.ref.WeakReference) it6.next()).get();
            if (multiStreamPreviewView != null) {
                multiStreamPreviewView.d();
            }
        }
        cVar.f446936b.clear();
        cVar.f446935a.clear();
        cVar.f446937c.removeCallbacksAndMessages(null);
    }
}
