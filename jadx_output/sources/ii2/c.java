package ii2;

/* loaded from: classes5.dex */
public final class c extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final ii2.a f291624d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f291625e;

    public c(ii2.a config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f291624d = config;
        this.f291625e = new android.graphics.drawable.ColorDrawable(config.f291617a);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        int i17;
        int i18;
        int i19;
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int paddingLeft = parent.getPaddingLeft();
        ii2.a aVar = this.f291624d;
        int i27 = paddingLeft + aVar.f291618b.left;
        int width = (parent.getWidth() - parent.getPaddingRight()) - aVar.f291618b.right;
        int childCount = parent.getChildCount();
        for (int i28 = 0; i28 < childCount; i28++) {
            yz5.p pVar = aVar.f291620d;
            if (!(pVar != null && ((java.lang.Boolean) pVar.invoke(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(childCount))).booleanValue())) {
                android.view.View childAt = parent.getChildAt(i28);
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
                int ordinal = aVar.f291619c.ordinal();
                if (ordinal == 0) {
                    int top = childAt.getTop() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                    android.graphics.Rect rect = aVar.f291618b;
                    i17 = top + rect.top;
                    i18 = rect.bottom;
                } else if (ordinal != 1) {
                    i17 = 0;
                    i19 = 0;
                    android.graphics.drawable.Drawable drawable = this.f291625e;
                    drawable.setBounds(i27, i17, width, i19);
                    drawable.draw(c17);
                } else {
                    int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    android.graphics.Rect rect2 = aVar.f291618b;
                    i17 = bottom + rect2.top;
                    i18 = rect2.bottom;
                }
                i19 = i18 + i17;
                android.graphics.drawable.Drawable drawable2 = this.f291625e;
                drawable2.setBounds(i27, i17, width, i19);
                drawable2.draw(c17);
            }
        }
    }
}
