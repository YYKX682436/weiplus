package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class ChatFooterBottom extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f190121d;

    public ChatFooterBottom(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f190121d = false;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
        return super.getLayoutParams();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.View.MeasureSpec.getSize(i17);
        android.view.View.MeasureSpec.getSize(i18);
        if (this.f190121d) {
            setVisibility(8);
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            i17 = makeMeasureSpec;
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
    }

    public void setIsHide(boolean z17) {
        this.f190121d = z17;
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (i17 == 0) {
            this.f190121d = false;
        }
        super.setVisibility(i17);
    }

    public ChatFooterBottom(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f190121d = false;
    }
}
