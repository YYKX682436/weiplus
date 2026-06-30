package kp4;

/* loaded from: classes3.dex */
public final class x extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f311154d;

    public x(int i17) {
        this.f311154d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int i17 = this.f311154d;
        outRect.left = i17 / 2;
        outRect.bottom = 0;
        outRect.top = 0;
        outRect.right = i17 / 2;
    }
}
