package lr;

/* loaded from: classes10.dex */
public final class a0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final lr.o0 f320491d;

    public a0(lr.o0 sizeResolver) {
        kotlin.jvm.internal.o.g(sizeResolver, "sizeResolver");
        this.f320491d = sizeResolver;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        int u07;
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        if (adapter == null || (u07 = parent.u0(view)) == -1) {
            return;
        }
        int itemViewType = adapter.getItemViewType(u07);
        int i17 = this.f320491d.f320564e;
        if (itemViewType == 2) {
            outRect.set(i17, 0, i17, 0);
        }
    }
}
