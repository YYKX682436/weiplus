package ec3;

/* loaded from: classes2.dex */
public final class k0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251044d;

    public k0(ec3.g1 g1Var) {
        this.f251044d = g1Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (u07 == -1) {
            return;
        }
        int i17 = itemCount - 1;
        ec3.g1 g1Var = this.f251044d;
        if (u07 == i17) {
            outRect.right = i65.a.b(g1Var.getContext(), 0);
        } else {
            outRect.right = i65.a.b(g1Var.getContext(), 6);
        }
    }
}
