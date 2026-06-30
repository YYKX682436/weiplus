package kr;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.panel.SmileyPanelView f311295d;

    public g(com.tencent.mm.emoji.panel.SmileyPanelView smileyPanelView) {
        this.f311295d = smileyPanelView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.emoji.panel.SmileyPanelView smileyPanelView = this.f311295d;
        smileyPanelView.f64923z.setEmpty();
        smileyPanelView.f64923z.union(smileyPanelView.f64920w.getLeft(), smileyPanelView.f64920w.getTop(), smileyPanelView.f64920w.getRight(), smileyPanelView.f64920w.getBottom());
        smileyPanelView.f64923z.union(smileyPanelView.f64922y.getLeft(), smileyPanelView.f64922y.getTop(), smileyPanelView.f64922y.getRight(), smileyPanelView.f64922y.getBottom());
        smileyPanelView.f64923z.offset(-smileyPanelView.f64919v.getLeft(), -smileyPanelView.f64919v.getTop());
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = smileyPanelView.f64919v.getLayoutManager();
        com.tencent.mm.emoji.panel.layout.SmileyLayoutManager smileyLayoutManager = layoutManager instanceof com.tencent.mm.emoji.panel.layout.SmileyLayoutManager ? (com.tencent.mm.emoji.panel.layout.SmileyLayoutManager) layoutManager : null;
        if (smileyLayoutManager != null) {
            android.graphics.Rect rect = smileyPanelView.f64923z;
            kotlin.jvm.internal.o.g(rect, "rect");
            smileyLayoutManager.D.set(rect);
            smileyLayoutManager.e0();
        }
    }
}
