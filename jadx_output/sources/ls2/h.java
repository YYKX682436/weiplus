package ls2;

/* loaded from: classes5.dex */
public final class h extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f321029d;

    /* renamed from: e, reason: collision with root package name */
    public int f321030e;

    /* renamed from: f, reason: collision with root package name */
    public int f321031f;

    public h(int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i18 = (i27 & 2) != 0 ? 0 : i18;
        i19 = (i27 & 4) != 0 ? 3 : i19;
        this.f321029d = i17;
        this.f321030e = i18;
        this.f321031f = i19;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        if (this.f321030e == 0) {
            return;
        }
        int v07 = parent.v0(view);
        int i17 = this.f321030e;
        int i18 = this.f321031f;
        boolean z17 = false;
        int i19 = ((i17 / i18) * i18) - (i17 % i18 > 0 ? 0 : i18);
        int i27 = (i19 + i18) - 1;
        int i28 = this.f321029d;
        if (v07 < i18) {
            outRect.bottom = i28;
            return;
        }
        if (i19 <= v07 && v07 <= i27) {
            z17 = true;
        }
        if (z17) {
            outRect.top = i28;
        } else {
            outRect.top = i28;
            outRect.bottom = i28;
        }
    }
}
