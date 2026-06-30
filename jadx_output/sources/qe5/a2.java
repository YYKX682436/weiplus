package qe5;

/* loaded from: classes3.dex */
public final class a2 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.f2 f362071d;

    public a2(qe5.f2 f2Var) {
        this.f362071d = f2Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        outRect.right = (int) this.f362071d.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
    }
}
