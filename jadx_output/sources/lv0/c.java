package lv0;

/* loaded from: classes3.dex */
public final class c extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f321480d;

    /* renamed from: e, reason: collision with root package name */
    public final int f321481e;

    /* renamed from: f, reason: collision with root package name */
    public final int f321482f;

    /* renamed from: g, reason: collision with root package name */
    public final int f321483g;

    /* renamed from: h, reason: collision with root package name */
    public final lv0.f f321484h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f321485i;

    public c(int i17, int i18, int i19, int i27, int i28, lv0.f positionType, int i29, kotlin.jvm.internal.i iVar) {
        i18 = (i29 & 2) != 0 ? i17 : i18;
        i19 = (i29 & 4) != 0 ? i17 : i19;
        i27 = (i29 & 8) != 0 ? 0 : i27;
        i28 = (i29 & 16) != 0 ? -1 : i28;
        positionType = (i29 & 32) != 0 ? lv0.f.f321488e : positionType;
        kotlin.jvm.internal.o.g(positionType, "positionType");
        this.f321480d = i17;
        this.f321481e = i18;
        this.f321482f = i19;
        this.f321483g = i27;
        this.f321484h = positionType;
        if (i28 != -1) {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.f321485i = paint;
            paint.setColor(i28);
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        if (parent.getAdapter() == null) {
            return;
        }
        int intValue = ((java.lang.Number) this.f321484h.f321491d.invoke(view)).intValue();
        if (intValue == 0) {
            outRect.left = this.f321481e;
        }
        if (intValue == r5.getItemCount() - 1) {
            outRect.right = this.f321482f;
        } else {
            outRect.right = this.f321480d;
        }
        int i17 = this.f321483g;
        if (i17 > 0) {
            outRect.top = (parent.getHeight() - i17) / 2;
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        android.graphics.Paint paint;
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        if (parent.getChildCount() == 0 || (paint = this.f321485i) == null) {
            return;
        }
        android.view.View childAt = parent.getChildAt(0);
        c17.drawRect(new android.graphics.Rect(0, childAt.getTop(), parent.getWidth(), childAt.getBottom()), paint);
    }
}
