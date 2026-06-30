package cw1;

/* loaded from: classes12.dex */
public final class p5 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f223240d;

    /* renamed from: e, reason: collision with root package name */
    public final int f223241e;

    /* renamed from: f, reason: collision with root package name */
    public final int f223242f;

    /* renamed from: g, reason: collision with root package name */
    public final int f223243g;

    /* renamed from: h, reason: collision with root package name */
    public final int f223244h;

    public p5(android.content.Context context, java.util.List items) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(items, "items");
        this.f223240d = items;
        this.f223241e = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ais);
        this.f223242f = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aih);
        this.f223243g = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479556yd);
        this.f223244h = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aii);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        cw1.o5 o5Var = (cw1.o5) this.f223240d.get(u07);
        boolean z17 = o5Var.f223202b;
        int i17 = this.f223242f;
        if (z17) {
            if (u07 == 0) {
                outRect.top = i17;
                return;
            }
            return;
        }
        int i18 = o5Var.f223204d;
        int i19 = i18 & 1;
        int i27 = this.f223241e;
        int i28 = this.f223244h;
        if (i19 == 0) {
            outRect.left = i28;
            outRect.right = i27;
        } else {
            outRect.left = i27;
            outRect.right = i28;
        }
        if (i18 < 2) {
            i17 = this.f223243g;
        }
        outRect.top = i17;
        if (i18 / 2 == (((i18 == u07 ? r7.size() : ((cw1.o5) r7.get((u07 - i18) - 1)).f223204d) + 1) / 2) - 1) {
            outRect.bottom = i28;
        }
    }
}
