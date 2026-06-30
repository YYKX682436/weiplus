package wl3;

/* loaded from: classes4.dex */
public final class f extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final float f447064d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f447065e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f447066f;

    public f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f447065e = paint;
        this.f447066f = new java.util.ArrayList();
        paint.setColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        paint.setTextSize(i65.a.b(context, 10));
        this.f447064d = paint.measureText("00:00");
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        int i17;
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int childCount = parent.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = parent.getChildAt(i18);
            int u07 = parent.u0(childAt);
            float bottom = childAt.getBottom();
            android.graphics.Paint paint = this.f447065e;
            float f17 = bottom - paint.getFontMetrics().descent;
            int left = childAt.getLeft();
            int right = childAt.getRight();
            float f18 = left;
            float f19 = this.f447064d;
            float f27 = 2;
            float f28 = (-f19) / f27;
            java.util.ArrayList arrayList = this.f447066f;
            if (f18 > f28) {
                c17.drawText((java.lang.String) arrayList.get(u07), f18 - (f19 / f27), f17, paint);
            }
            if (i18 == childCount - 1 && (i17 = u07 + 1) < arrayList.size()) {
                float f29 = right;
                if (f29 < parent.getWidth() + (f19 / f27)) {
                    c17.drawText((java.lang.String) arrayList.get(i17), f29 - (f19 / f27), f17 - paint.getFontMetrics().descent, paint);
                }
            }
        }
        super.onDrawOver(c17, parent, state);
    }
}
