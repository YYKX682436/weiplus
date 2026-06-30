package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes11.dex */
public class ChattingUILayout extends com.tencent.mm.ui.BasePanelKeybordLayout {

    /* renamed from: n, reason: collision with root package name */
    public int f190137n;

    /* renamed from: o, reason: collision with root package name */
    public int f190138o;

    /* renamed from: p, reason: collision with root package name */
    public int f190139p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f190140q;

    public ChattingUILayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f190137n = 0;
        this.f190138o = 0;
        this.f190139p = 0;
        this.f190140q = new android.graphics.Paint(0);
    }

    @Override // com.tencent.mm.ui.widget.DrawnCallBackLinearLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f190139p > 0 && com.tencent.mm.ui.b4.c(getContext())) {
            canvas.drawRect(0.0f, getMeasuredHeight() - this.f190139p, getMeasuredWidth(), getMeasuredHeight(), this.f190140q);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(android.graphics.Rect rect) {
        rect.toString();
        getFitsSystemWindows();
        rect.bottom += this.f190137n;
        rect.right += this.f190138o;
        if (com.tencent.mm.ui.b4.c(getContext()) && getFitsSystemWindows()) {
            this.f190139p = rect.bottom;
            android.graphics.Paint paint = this.f190140q;
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(getResources().getColor(com.tencent.mm.R.color.f478490b));
        }
        return super.fitSystemWindows(rect);
    }

    @Override // com.tencent.mm.ui.BasePanelKeybordLayout
    public java.util.List<android.view.View> getPanelView() {
        return new java.util.ArrayList();
    }
}
