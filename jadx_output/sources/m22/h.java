package m22;

/* loaded from: classes4.dex */
public final class h extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f323047d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f323048e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f323049f;

    /* renamed from: g, reason: collision with root package name */
    public final float f323050g;

    public h(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f323047d = i17;
        this.f323048e = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f323049f = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(context.getResources().getColor(com.tencent.mm.R.color.f479307vn));
        this.f323050g = i65.a.b(context, 64);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDrawOver(canvas, parent, state);
        canvas.save();
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            androidx.recyclerview.widget.k3 w07 = parent.w0(childAt);
            int adapterPosition = w07.getAdapterPosition();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
            kotlin.jvm.internal.o.d(layoutManager);
            android.graphics.Rect rect = this.f323048e;
            layoutManager.getDecoratedBoundsWithMargins(childAt, rect);
            int round = rect.bottom + java.lang.Math.round(childAt.getTranslationY());
            int i18 = rect.top;
            childAt.getTranslationY();
            android.graphics.Paint paint = this.f323049f;
            paint.getStrokeWidth();
            androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
            if (adapter == null) {
                return;
            }
            boolean z17 = adapterPosition == (adapter.getItemCount() - 1) - this.f323047d;
            if (w07 instanceof m22.o) {
                if (z17) {
                    float f17 = round;
                    canvas.drawLine(0.0f, f17, rect.width(), f17, paint);
                } else {
                    float f18 = round;
                    canvas.drawLine(this.f323050g, f18, rect.width(), f18, paint);
                }
            }
        }
        canvas.restore();
    }
}
