package io;

/* loaded from: classes3.dex */
public final class n extends androidx.recyclerview.widget.p2 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f293416f = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 20.0f);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f293417d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f293418e = jz5.h.b(new io.m(this));

    public n(android.content.Context context) {
        this.f293417d = context;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        if (u07 <= 0) {
            u07 = 0;
        }
        if (u07 > 0) {
            outRect.top = 1;
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        parent.getChildCount();
        android.graphics.Rect rect = new android.graphics.Rect();
        int paddingLeft = parent.getPaddingLeft();
        int i17 = f293416f;
        rect.left = paddingLeft + i17;
        rect.right = (parent.getMeasuredWidth() - parent.getPaddingRight()) - i17;
        int childCount = parent.getChildCount();
        for (int i18 = 1; i18 < childCount; i18++) {
            android.view.View childAt = parent.getChildAt(i18);
            if (childAt == null) {
                return;
            }
            int top = childAt.getTop();
            rect.bottom = top;
            rect.top = top - 1;
            canvas.drawRect(rect, (android.graphics.Paint) ((jz5.n) this.f293418e).getValue());
        }
    }
}
