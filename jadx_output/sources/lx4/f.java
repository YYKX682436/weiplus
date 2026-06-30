package lx4;

/* loaded from: classes2.dex */
public final class f extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f322127d;

    /* renamed from: e, reason: collision with root package name */
    public final int f322128e;

    /* renamed from: f, reason: collision with root package name */
    public final int f322129f;

    public f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f322127d = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        this.f322128e = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        this.f322129f = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        outRect.top = this.f322127d;
        int u07 = parent.u0(view);
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (u07 / 4 == (itemCount - 1) / 4) {
            if (itemCount <= 4) {
                outRect.bottom = this.f322129f;
            } else {
                outRect.bottom = this.f322128e;
            }
        }
    }
}
