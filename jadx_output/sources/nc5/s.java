package nc5;

/* loaded from: classes2.dex */
public final class s extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f336230d;

    public s(android.content.Context activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f336230d = activity;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        android.content.Context context = this.f336230d;
        if (u07 == 0) {
            outRect.left = i65.a.f(context, com.tencent.mm.R.dimen.f479672c9);
        }
        outRect.right = i65.a.f(context, com.tencent.mm.R.dimen.f479738dv);
    }
}
