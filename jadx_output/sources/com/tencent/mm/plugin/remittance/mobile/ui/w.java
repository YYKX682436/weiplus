package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes2.dex */
public class w extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f156733d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f156734e;

    /* renamed from: f, reason: collision with root package name */
    public final int f156735f;

    /* renamed from: g, reason: collision with root package name */
    public final int f156736g;

    public w(android.content.Context context) {
        this.f156735f = i65.a.a(context, 0.5f);
        this.f156736g = i65.a.b(context, 16);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f156733d = paint;
        paint.setColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f156734e = paint2;
        paint2.setColor(context.getResources().getColor(com.tencent.mm.R.color.BW_93));
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        super.getItemOffsets(rect, view, recyclerView, h3Var);
        rect.bottom = this.f156735f;
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        super.onDraw(canvas, recyclerView, h3Var);
        int childCount = recyclerView.getChildCount();
        int paddingLeft = recyclerView.getPaddingLeft();
        int i17 = this.f156736g + paddingLeft;
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = recyclerView.getChildAt(i18);
            float bottom = childAt.getBottom();
            float bottom2 = childAt.getBottom() + this.f156735f;
            if (i18 == childCount - 1) {
                canvas.drawRect(paddingLeft, bottom, width, bottom2, this.f156734e);
            } else {
                canvas.drawRect(i17, bottom, width, bottom2, this.f156733d);
            }
        }
    }
}
