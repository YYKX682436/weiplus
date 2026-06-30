package ft3;

/* loaded from: classes12.dex */
public final class c extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.r0 f266545d;

    public c(em.r0 r0Var) {
        this.f266545d = r0Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        if (u07 <= 0) {
            u07 = 0;
        }
        if (u07 > 0) {
            outRect.left = ym5.x.a(this.f266545d.a().getContext(), 8.0f);
        }
    }
}
