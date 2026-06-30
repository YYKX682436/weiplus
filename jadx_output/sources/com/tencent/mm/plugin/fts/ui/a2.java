package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes3.dex */
public class a2 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f138013d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f138014e = new android.graphics.Paint(1);

    public a2(com.tencent.mm.plugin.fts.ui.FTSChattingConvUI fTSChattingConvUI) {
        this.f138013d = (int) fTSChattingConvUI.getResources().getDimension(com.tencent.mm.R.dimen.f479567j);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        super.getItemOffsets(rect, view, recyclerView, h3Var);
        int i17 = this.f138013d;
        rect.set(i17, i17, i17, i17);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        super.onDraw(canvas, recyclerView, h3Var);
        android.graphics.Paint paint = this.f138014e;
        paint.setColor(-2434342);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        int childCount = recyclerView.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = recyclerView.getChildAt(i17);
            int i18 = this.f138013d;
            if (i17 == 1 || i17 == 4) {
                canvas.drawLine(childAt.getLeft() - i18, childAt.getTop(), childAt.getLeft() - i18, childAt.getBottom(), paint);
                canvas.drawLine(childAt.getRight() + i18, childAt.getTop(), childAt.getRight() + i18, childAt.getBottom(), paint);
            } else if (i17 == 7) {
                canvas.drawLine(childAt.getLeft() - i18, childAt.getTop(), childAt.getLeft() - i18, childAt.getBottom(), paint);
            }
        }
    }
}
