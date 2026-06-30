package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes3.dex */
public class f3 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f138057d;

    /* renamed from: e, reason: collision with root package name */
    public final int f138058e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f138059f = new android.graphics.Paint(1);

    public f3(com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI fTSServiceNotifyUI) {
        this.f138057d = i65.a.b(fTSServiceNotifyUI.getContext(), 37);
        this.f138058e = i65.a.b(fTSServiceNotifyUI.getContext(), 18);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        super.getItemOffsets(rect, view, recyclerView, h3Var);
        int i17 = this.f138057d;
        int i18 = this.f138058e;
        rect.set(i17, i18, i17, i18);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        super.onDraw(canvas, recyclerView, h3Var);
        android.graphics.Paint paint = this.f138059f;
        paint.setColor(-2434342);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        int childCount = recyclerView.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = recyclerView.getChildAt(i17);
            if (i17 == 0) {
                int right = childAt.getRight();
                int i18 = this.f138057d;
                canvas.drawLine(right + i18, childAt.getTop(), childAt.getRight() + i18, childAt.getBottom(), paint);
            }
        }
    }
}
