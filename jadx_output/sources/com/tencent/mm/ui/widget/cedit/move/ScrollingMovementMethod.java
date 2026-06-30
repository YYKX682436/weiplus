package com.tencent.mm.ui.widget.cedit.move;

/* loaded from: classes15.dex */
public class ScrollingMovementMethod extends com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod {
    private static com.tencent.mm.ui.widget.cedit.move.ScrollingMovementMethod sInstance;

    public static il5.a getInstance() {
        if (sInstance == null) {
            sInstance = new com.tencent.mm.ui.widget.cedit.move.ScrollingMovementMethod();
        }
        return sInstance;
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean bottom(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return scrollBottom(customTextView, spannable);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean down(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return scrollDown(customTextView, spannable, 1);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean end(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return bottom(customTextView, spannable);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean home(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return top(customTextView, spannable);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean left(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return scrollLeft(customTextView, spannable, 1);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean lineEnd(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return scrollLineEnd(customTextView, spannable);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean lineStart(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return scrollLineStart(customTextView, spannable);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod, il5.a
    public void onTakeFocus(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17) {
        android.text.Layout layout = customTextView.getLayout();
        if (layout != null && (i17 & 2) != 0) {
            customTextView.scrollTo(customTextView.getScrollX(), layout.getLineTop(0));
        }
        if (layout == null || (i17 & 1) == 0) {
            return;
        }
        customTextView.scrollTo(customTextView.getScrollX(), layout.getLineTop((layout.getLineCount() - 1) + 1) - (customTextView.getHeight() - (customTextView.getTotalPaddingTop() + customTextView.getTotalPaddingBottom())));
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod, il5.a
    public boolean onTouchEvent(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        return il5.c.a(customTextView, spannable, motionEvent);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean pageDown(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return scrollPageDown(customTextView, spannable);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean pageUp(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return scrollPageUp(customTextView, spannable);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean right(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return scrollRight(customTextView, spannable, 1);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean top(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return scrollTop(customTextView, spannable);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean up(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return scrollUp(customTextView, spannable, 1);
    }
}
