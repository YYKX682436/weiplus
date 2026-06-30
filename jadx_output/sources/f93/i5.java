package f93;

/* loaded from: classes3.dex */
public final class i5 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f260358d;

    /* renamed from: e, reason: collision with root package name */
    public final int f260359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f93.p5 f260360f;

    public i5(f93.p5 p5Var) {
        this.f260360f = p5Var;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f260358d = paint;
        this.f260359e = 1;
        paint.setColor(i65.a.d(p5Var.getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_1));
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            if (parent.u0(parent.getChildAt(i17)) != (parent.getAdapter() != null ? r4.getItemCount() : 0) - 1) {
                c17.drawRect(parent.getPaddingLeft() + i65.a.h(this.f260360f.getContext(), com.tencent.mm.R.dimen.f479732dp), r2.getBottom() - this.f260359e, parent.getWidth() - parent.getPaddingRight(), r2.getBottom(), this.f260358d);
            }
        }
    }
}
