package nu0;

/* loaded from: classes2.dex */
public final class d2 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f339911d = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn);

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int i17 = this.f339911d;
        outRect.left = i17;
        outRect.right = i17;
    }
}
