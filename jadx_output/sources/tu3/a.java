package tu3;

/* loaded from: classes2.dex */
public final class a extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f422164d;

    public a(int i17) {
        this.f422164d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        if (u07 == 0) {
            outRect.left = i65.a.b(view.getContext(), 8);
        }
        if (u07 == this.f422164d - 1) {
            outRect.right = i65.a.b(view.getContext(), 8);
        }
    }
}
