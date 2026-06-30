package sr2;

/* loaded from: classes10.dex */
public final class s5 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.v5 f411717d;

    public s5(sr2.v5 v5Var) {
        this.f411717d = v5Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int dimension = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        outRect.left = dimension;
        if (parent.u0(view) == (parent.getAdapter() != null ? r4.getItemCount() : this.f411717d.f411745f) - 1) {
            outRect.right = dimension * 6;
        } else {
            outRect.right = dimension;
        }
    }
}
