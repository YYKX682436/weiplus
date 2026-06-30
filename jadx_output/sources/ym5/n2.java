package ym5;

/* loaded from: classes10.dex */
public final class n2 implements ym5.n3 {

    /* renamed from: a, reason: collision with root package name */
    public float f463441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MediaBanner f463442b;

    public n2(com.tencent.mm.view.MediaBanner mediaBanner) {
        this.f463442b = mediaBanner;
    }

    @Override // ym5.n3
    public void a(android.view.MotionEvent event) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        kotlin.jvm.internal.o.g(event, "event");
        int action = event.getAction();
        com.tencent.mm.view.MediaBanner mediaBanner = this.f463442b;
        if (action == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaBanner", "[pauseLoopPlay] isAutoPlay:" + mediaBanner.isAutoPlay);
            if (mediaBanner.isAutoPlay) {
                com.tencent.mm.sdk.platformtools.n3 n3Var = mediaBanner.f213361t;
                n3Var.removeMessages(1);
                n3Var.sendEmptyMessageDelayed(1, 2000L);
            }
        }
        androidx.recyclerview.widget.RecyclerView parentRecyclerView = mediaBanner.getParentRecyclerView();
        java.lang.Object layoutManager2 = parentRecyclerView != null ? parentRecyclerView.getLayoutManager() : null;
        if (!(layoutManager2 instanceof ym5.o2) || (layoutManager = mediaBanner.getPagerView().getLayoutManager()) == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager3 = (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) && ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).getItemCount() > 1 ? layoutManager : null;
        if (layoutManager3 != null) {
            if (event.getAction() == 0) {
                this.f463441a = event.getRawX();
            } else if (event.getAction() == 2 && java.lang.Math.abs(event.getRawX() - this.f463441a) >= 10.0f) {
                ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) ((ym5.o2) layoutManager2)).C = false;
            }
            if (event.getAction() == 1 || event.getAction() == 3) {
                ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) ((ym5.o2) layoutManager2)).C = true;
            }
        }
    }

    @Override // ym5.n3
    public boolean b(int i17, android.view.MotionEvent event, boolean z17) {
        kotlin.jvm.internal.o.g(event, "event");
        this.f463442b.getClass();
        return z17;
    }
}
