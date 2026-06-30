package e32;

/* loaded from: classes2.dex */
public final class b extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f247100d;

    /* renamed from: e, reason: collision with root package name */
    public final int f247101e;

    public b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f247100d = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480353ve);
        this.f247101e = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
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
        androidx.recyclerview.widget.f2 adapter2 = parent.getAdapter();
        java.lang.Integer valueOf = adapter2 != null ? java.lang.Integer.valueOf(adapter2.getItemViewType(u07)) : null;
        int i17 = this.f247100d;
        int i18 = this.f247101e;
        if (u07 == 0) {
            outRect.set((parent.getWidth() - i17) / 2, 0, i18, 0);
        } else if (u07 == itemCount - 1) {
            outRect.set(i18, 0, (valueOf != null && valueOf.intValue() == 2) ? ((parent.getWidth() / 2) - ((i17 / 2) * 3)) - (i18 * 2) : (parent.getWidth() - i17) / 2, 0);
        } else {
            outRect.set(i18, 0, i18, 0);
        }
    }
}
