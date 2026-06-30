package tc5;

/* loaded from: classes10.dex */
public final class e extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f417557c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f417558d;

    public e(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        this.f417557c = recyclerView;
        this.f417558d = i17;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        androidx.recyclerview.widget.f2 adapter = this.f417557c.getAdapter();
        if (adapter == null) {
            return 1;
        }
        int itemViewType = adapter.getItemViewType(i17);
        if (itemViewType == -1 || itemViewType == 0) {
            return this.f417558d;
        }
        return 1;
    }
}
