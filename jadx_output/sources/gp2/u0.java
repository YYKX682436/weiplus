package gp2;

/* loaded from: classes10.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.v0 f274324d;

    public u0(gp2.v0 v0Var) {
        this.f274324d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinish createdViews ");
        gp2.v0 v0Var = this.f274324d;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = v0Var.f274329e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(concurrentLinkedQueue, 10));
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((java.lang.ref.WeakReference) it.next()).hashCode()));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("NearbyLivePlayerViewRecycler", sb6.toString());
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = v0Var.f274329e;
        java.util.Iterator it6 = concurrentLinkedQueue2.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) ((java.lang.ref.WeakReference) it6.next()).get();
            if (nearbyLivePreviewView != null) {
                nearbyLivePreviewView.stop();
                nearbyLivePreviewView.release();
                nearbyLivePreviewView.r("completelyQuit");
                mn0.b0 b0Var = nearbyLivePreviewView.player;
                if (b0Var != null) {
                    ((mn0.y) b0Var).w();
                }
            }
        }
        concurrentLinkedQueue2.clear();
        v0Var.f274328d.clear();
        v0Var.f274330f.removeCallbacksAndMessages(null);
    }
}
