package rf2;

/* loaded from: classes10.dex */
public final class c extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.f f394673d;

    public c(rf2.f fVar) {
        this.f394673d = fVar;
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
        outRect.bottom = (int) this.f394673d.f394713d.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
    }
}
