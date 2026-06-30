package dx2;

/* loaded from: classes10.dex */
public final class a extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f244495d;

    public a(android.graphics.drawable.Drawable divider, int i17, int[] padding, int i18) {
        kotlin.jvm.internal.o.g(divider, "divider");
        kotlin.jvm.internal.o.g(padding, "padding");
        this.f244495d = divider;
        divider.setBounds(0, 0, 0, i17);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
    }
}
