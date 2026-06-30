package com.tencent.mm.plugin.game.media;

/* loaded from: classes5.dex */
public class TextViewWithBottomLine extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f140099g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f140100h;

    public TextViewWithBottomLine(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public final void b() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f140099g = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f140099g.setColor(getResources().getColor(com.tencent.mm.R.color.a0c));
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f140100h;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f140100h) {
            canvas.drawRoundRect(0.0f, getHeight() - com.tencent.mm.ui.zk.a(getContext(), 2), getWidth(), getHeight(), com.tencent.mm.ui.zk.a(getContext(), 1), com.tencent.mm.ui.zk.a(getContext(), 1), this.f140099g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z17) {
        this.f140100h = z17;
        if (z17) {
            setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        } else {
            setTextColor(getResources().getColor(com.tencent.mm.R.color.f478873jj));
        }
        invalidate();
    }

    public TextViewWithBottomLine(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b();
    }
}
