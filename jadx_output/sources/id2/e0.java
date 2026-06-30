package id2;

/* loaded from: classes3.dex */
public final class e0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290545d;

    public e0(id2.v1 v1Var) {
        this.f290545d = v1Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        int i17 = u07 % 4;
        id2.v1 v1Var = this.f290545d;
        if (i17 == 0) {
            outRect.left = ((java.lang.Number) ((jz5.n) v1Var.f290852y).getValue()).intValue();
            outRect.right = id2.v1.O6(v1Var);
        } else if (i17 != 3) {
            outRect.left = id2.v1.O6(v1Var);
            outRect.right = id2.v1.O6(v1Var);
        } else {
            outRect.left = id2.v1.O6(v1Var);
            outRect.right = ((java.lang.Number) ((jz5.n) v1Var.f290852y).getValue()).intValue();
        }
        if (u07 >= 4) {
            outRect.top = ((java.lang.Number) ((jz5.n) v1Var.A).getValue()).intValue();
        }
    }
}
