package on2;

/* loaded from: classes3.dex */
public final class o1 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.a2 f346979d;

    public o1(on2.a2 a2Var) {
        this.f346979d = a2Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        outRect.left = 0;
        outRect.right = 0;
        outRect.top = 0;
        outRect.bottom = this.f346979d.f346832o.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
    }
}
