package xx0;

/* loaded from: classes2.dex */
public final class o extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f457925d;

    /* renamed from: e, reason: collision with root package name */
    public final int f457926e;

    /* renamed from: f, reason: collision with root package name */
    public final int f457927f;

    /* renamed from: g, reason: collision with root package name */
    public final int f457928g;

    public o(android.content.Context context, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f457925d = i17;
        this.f457926e = i18;
        this.f457927f = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ait);
        this.f457928g = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480599aq4);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int width = parent.getWidth();
        int u07 = parent.u0(view);
        int i17 = this.f457925d;
        int i18 = u07 % i17;
        int i19 = this.f457927f;
        int i27 = this.f457926e;
        outRect.left = (i19 + (i18 * (i27 + (((width - (i19 * 2)) - (i17 * i27)) / (i17 - 1))))) - ((((width - (i17 * i27)) / i17) + i27) * i18);
        if (u07 < i17) {
            outRect.top = this.f457928g;
        }
    }
}
