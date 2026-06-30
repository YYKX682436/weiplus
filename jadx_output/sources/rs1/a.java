package rs1;

/* loaded from: classes3.dex */
public final class a extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f399321d;

    /* renamed from: e, reason: collision with root package name */
    public final int f399322e;

    /* renamed from: f, reason: collision with root package name */
    public final int f399323f;

    public a(int i17, int i18, int i19) {
        this.f399321d = i17;
        this.f399322e = i18;
        this.f399323f = i19;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        int i17;
        int i18;
        int i19;
        int i27;
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        if (u07 != -1 && (i17 = this.f399321d) > 1 && (i18 = this.f399323f) > 0 && (i19 = this.f399322e) > 0 && (i27 = u07 % i17) >= 0 && i27 < i17) {
            int i28 = i19 - (i18 * i17);
            float f17 = (i28 > 0 ? i28 / i17 : 0.0f) / (i17 - 1);
            if (i27 == 0) {
                outRect.left = 0;
                outRect.right = 0;
            } else {
                outRect.left = (int) (i27 * f17);
                outRect.right = 0;
            }
        }
    }
}
