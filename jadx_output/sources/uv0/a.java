package uv0;

/* loaded from: classes3.dex */
public final class a extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f431316d;

    /* renamed from: e, reason: collision with root package name */
    public final int f431317e;

    public a(int i17, int i18) {
        this.f431316d = i17;
        this.f431317e = i18;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        int i17 = this.f431316d;
        int i18 = this.f431317e;
        if (u07 == 0) {
            outRect.left = i17;
        } else {
            outRect.left = i18;
        }
        if (u07 == state.b() - 1) {
            outRect.right = i17;
        } else {
            outRect.right = i18;
        }
    }
}
