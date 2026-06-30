package pl2;

/* loaded from: classes3.dex */
public final class h extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl2.s f356627d;

    public h(pl2.s sVar) {
        this.f356627d = sVar;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        androidx.recyclerview.widget.k3 m07 = this.f356627d.c().m0(view);
        int dimension = ((int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9)) - i65.a.b(view.getContext(), 2);
        if (m07 != null && m07.getAdapterPosition() == 0) {
            outRect.left = dimension;
            outRect.right = dimension;
            outRect.bottom = 0;
            outRect.top = 0;
            return;
        }
        outRect.left = dimension;
        outRect.right = dimension;
        outRect.bottom = 0;
        outRect.top = dimension;
    }
}
