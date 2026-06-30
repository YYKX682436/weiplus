package com.tencent.mm.ui;

/* loaded from: classes4.dex */
public class ScrollAlwaysTextView extends android.widget.TextView {
    public ScrollAlwaysTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        if (z17) {
            super.onFocusChanged(z17, i17, rect);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            super.onMeasure(i17, i18);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        try {
            return super.onPreDraw();
        } catch (java.lang.Throwable unused) {
            return true;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z17) {
        if (z17) {
            super.onWindowFocusChanged(z17);
        }
    }

    public ScrollAlwaysTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
