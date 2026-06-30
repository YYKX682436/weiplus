package pk2;

/* loaded from: classes3.dex */
public final class n7 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.p7 f356040d;

    public n7(pk2.p7 p7Var) {
        this.f356040d = p7Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int i17 = u07 / 5;
        int i18 = u07 % 5;
        pk2.p7 p7Var = this.f356040d;
        int dimension = (int) p7Var.f356160a.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        if (i17 < (((itemCount + 5) - 1) / 5) - 1) {
            outRect.bottom = dimension;
        }
        int dimension2 = (int) p7Var.f356160a.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        if (i18 == 0) {
            outRect.left = 0;
            outRect.right = dimension2 / 2;
        } else if (i18 == 4) {
            outRect.left = dimension2 / 2;
            outRect.right = 0;
        } else {
            int i19 = dimension2 / 2;
            outRect.left = i19;
            outRect.right = i19;
        }
    }
}
