package of2;

/* loaded from: classes2.dex */
public final class i extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f345087d;

    public i(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f345087d = recyclerView;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        if (parent.u0(view) > 0) {
            outRect.left = ym5.x.a(this.f345087d.getContext(), 16.0f);
        }
    }
}
