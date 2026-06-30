package g22;

/* loaded from: classes15.dex */
public final class f extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f267807d;

    /* renamed from: e, reason: collision with root package name */
    public final int f267808e;

    /* renamed from: f, reason: collision with root package name */
    public final int f267809f;

    /* renamed from: g, reason: collision with root package name */
    public final i22.w f267810g;

    /* renamed from: h, reason: collision with root package name */
    public int f267811h;

    /* renamed from: i, reason: collision with root package name */
    public int f267812i;

    public f(int i17, int i18, int i19, i22.w sizeResolver) {
        kotlin.jvm.internal.o.g(sizeResolver, "sizeResolver");
        this.f267807d = i17;
        this.f267808e = i18;
        this.f267809f = i19;
        this.f267810g = sizeResolver;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        i22.w wVar = this.f267810g;
        this.f267811h = wVar.f288060b;
        this.f267812i = wVar.f288061c;
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b17 = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).b();
        if (b17 < 0 || itemCount <= 0) {
            return;
        }
        androidx.recyclerview.widget.f2 adapter2 = parent.getAdapter();
        int itemViewType = adapter2 != null ? adapter2.getItemViewType(b17) : -1;
        int i17 = this.f267808e;
        if (itemViewType != 4) {
            if (itemViewType == 7) {
                int i18 = i17 + wVar.f288063e;
                outRect.set(i18, 0, i18, 0);
                return;
            } else {
                if (itemViewType != 8) {
                    return;
                }
                outRect.set(0, 0, 0, 0);
                return;
            }
        }
        int i19 = b17 - this.f267809f;
        int i27 = this.f267811h;
        int i28 = i19 % i27;
        int i29 = i19 / i27;
        outRect.bottom = this.f267807d;
        float f17 = (((i17 * 2) + ((i27 - 1) * r1)) * 1.0f) / i27;
        float f18 = i17 + (i28 * (this.f267812i - f17));
        outRect.left = a06.d.b(f18);
        outRect.right = a06.d.b(f17 - f18);
    }
}
