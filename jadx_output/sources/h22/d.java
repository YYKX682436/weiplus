package h22;

/* loaded from: classes2.dex */
public final class d extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f278291d;

    public d(int i17) {
        this.f278291d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 1;
        int i17 = this.f278291d;
        if (u07 == itemCount) {
            outRect.right = i17;
        }
        outRect.left = i17;
    }
}
