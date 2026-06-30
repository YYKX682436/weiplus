package vg2;

/* loaded from: classes3.dex */
public final class x extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.a0 f436615d;

    public x(vg2.a0 a0Var) {
        this.f436615d = a0Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b17 = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).b();
        com.tencent.mars.xlog.Log.i("GiftBatchSelectToastWidget", "getItemOffsets: pos: " + b17);
        vg2.a0 a0Var = this.f436615d;
        a0Var.f436470f.size();
        outRect.left = b17 > 0 ? a0Var.f436470f.size() > 5 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1) : 0;
        outRect.right = 0;
        outRect.bottom = 0;
        outRect.top = 0;
    }
}
