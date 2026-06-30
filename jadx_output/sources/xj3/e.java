package xj3;

/* loaded from: classes4.dex */
public final class e extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public int f454874d;

    /* renamed from: e, reason: collision with root package name */
    public final int f454875e;

    public e(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f454875e = sj3.i1.f408557b / 2;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int i17 = this.f454875e;
        if (u07 == 0) {
            outRect.set((parent.getWidth() - this.f454874d) / 2, 0, i17, 0);
        } else if (u07 == itemCount - 1) {
            outRect.set(i17, 0, (parent.getWidth() - this.f454874d) / 2, 0);
        } else {
            outRect.set(i17, 0, i17, 0);
        }
    }
}
