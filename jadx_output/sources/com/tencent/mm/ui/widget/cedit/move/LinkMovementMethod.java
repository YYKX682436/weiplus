package com.tencent.mm.ui.widget.cedit.move;

/* loaded from: classes15.dex */
public class LinkMovementMethod extends com.tencent.mm.ui.widget.cedit.move.ScrollingMovementMethod {
    private static final int CLICK = 1;
    private static final int DOWN = 3;
    private static java.lang.Object FROM_BELOW = new android.text.NoCopySpan.Concrete();
    private static final int HIDE_FLOATING_TOOLBAR_DELAY_MS = 200;
    private static final int UP = 2;
    private static com.tencent.mm.ui.widget.cedit.move.LinkMovementMethod sInstance;
    private java.lang.String TAG = "cmEdit.LinkMovementMethod";

    private boolean action(int i17, com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Layout layout = customTextView.getLayout();
        int totalPaddingTop = customTextView.getTotalPaddingTop() + customTextView.getTotalPaddingBottom();
        int scrollY = customTextView.getScrollY();
        int height = (customTextView.getHeight() + scrollY) - totalPaddingTop;
        int lineForVertical = layout.getLineForVertical(scrollY);
        int lineForVertical2 = layout.getLineForVertical(height);
        int lineStart = layout.getLineStart(lineForVertical);
        int lineEnd = layout.getLineEnd(lineForVertical2);
        android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) spannable.getSpans(lineStart, lineEnd, android.text.style.ClickableSpan.class);
        int selectionStart = android.text.Selection.getSelectionStart(spannable);
        int selectionEnd = android.text.Selection.getSelectionEnd(spannable);
        int min = java.lang.Math.min(selectionStart, selectionEnd);
        int max = java.lang.Math.max(selectionStart, selectionEnd);
        if (min < 0 && spannable.getSpanStart(FROM_BELOW) >= 0) {
            min = spannable.length();
            max = min;
        }
        if (min > lineEnd) {
            max = Integer.MAX_VALUE;
            min = Integer.MAX_VALUE;
        }
        int i18 = -1;
        if (max < lineStart) {
            max = -1;
            min = -1;
        }
        if (i17 == 1) {
            if (min == max) {
                return false;
            }
            android.text.style.ClickableSpan[] clickableSpanArr2 = (android.text.style.ClickableSpan[]) spannable.getSpans(min, max, android.text.style.ClickableSpan.class);
            if (clickableSpanArr2.length != 1) {
                return false;
            }
            android.text.style.ClickableSpan clickableSpan = clickableSpanArr2[0];
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                if (clickableSpan instanceof android.view.textclassifier.TextLinks.TextLinkSpan) {
                    clickableSpan.onClick(customTextView);
                } else {
                    clickableSpan.onClick(customTextView);
                }
            }
        } else if (i17 == 2) {
            int i19 = -1;
            for (int i27 = 0; i27 < clickableSpanArr.length; i27++) {
                int spanEnd = spannable.getSpanEnd(clickableSpanArr[i27]);
                if ((spanEnd < max || min == max) && spanEnd > i19) {
                    i18 = spannable.getSpanStart(clickableSpanArr[i27]);
                    i19 = spanEnd;
                }
            }
            if (i18 >= 0) {
                android.text.Selection.setSelection(spannable, i19, i18);
                return true;
            }
        } else if (i17 == 3) {
            int i28 = Integer.MAX_VALUE;
            int i29 = Integer.MAX_VALUE;
            for (int i37 = 0; i37 < clickableSpanArr.length; i37++) {
                int spanStart = spannable.getSpanStart(clickableSpanArr[i37]);
                if ((spanStart > min || min == max) && spanStart < i29) {
                    i28 = spannable.getSpanEnd(clickableSpanArr[i37]);
                    i29 = spanStart;
                }
            }
            if (i28 < Integer.MAX_VALUE) {
                android.text.Selection.setSelection(spannable, i29, i28);
                return true;
            }
        }
        return false;
    }

    public static il5.a getInstance() {
        if (sInstance == null) {
            sInstance = new com.tencent.mm.ui.widget.cedit.move.LinkMovementMethod();
        }
        return sInstance;
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod, il5.a
    public boolean canSelectArbitrarily() {
        return true;
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.ScrollingMovementMethod, com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean down(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        if (action(3, customTextView, spannable)) {
            return true;
        }
        return super.down(customTextView, spannable);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean handleMovementKey(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17, int i18, android.view.KeyEvent keyEvent) {
        if ((i17 == 23 || i17 == 66) && android.view.KeyEvent.metaStateHasNoModifiers(i18) && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && action(1, customTextView, spannable)) {
            return true;
        }
        return super.handleMovementKey(customTextView, spannable, i17, i18, keyEvent);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod, il5.a
    public void initialize(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Selection.removeSelection(spannable);
        spannable.removeSpan(FROM_BELOW);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.ScrollingMovementMethod, com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean left(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        if (action(2, customTextView, spannable)) {
            return true;
        }
        return super.left(customTextView, spannable);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.ScrollingMovementMethod, com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod, il5.a
    public void onTakeFocus(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17) {
        android.text.Selection.removeSelection(spannable);
        if ((i17 & 1) != 0) {
            spannable.setSpan(FROM_BELOW, 0, 0, 34);
        } else {
            spannable.removeSpan(FROM_BELOW);
        }
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.ScrollingMovementMethod, com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod, il5.a
    public boolean onTouchEvent(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        gl5.e0 e0Var;
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            int totalPaddingLeft = x17 - customTextView.getTotalPaddingLeft();
            int totalPaddingTop = y17 - customTextView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + customTextView.getScrollX();
            int scrollY = totalPaddingTop + customTextView.getScrollY();
            android.text.Layout layout = customTextView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                android.text.style.ClickableSpan clickableSpan = clickableSpanArr[0];
                if (action == 1) {
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        clickableSpan.onClick(customTextView);
                    }
                } else if (action == 0) {
                    if (customTextView.getContext().getApplicationInfo().targetSdkVersion >= 28 && (e0Var = customTextView.f211589g2) != null) {
                        e0Var.U.removeCallbacks(e0Var.V);
                        hl5.g gVar = e0Var.Z;
                        if (gVar != null) {
                            try {
                                gVar.f282134i.getEditor().n().b(gVar.f282140o);
                                gVar.f282126a.dismiss();
                            } catch (java.lang.Throwable unused) {
                            }
                        }
                        android.view.ActionMode actionMode = e0Var.f272945c;
                        if (actionMode != null) {
                            actionMode.hide(200);
                        }
                    }
                    android.text.Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
                }
                return true;
            }
            android.text.Selection.removeSelection(spannable);
        }
        return super.onTouchEvent(customTextView, spannable, motionEvent);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.ScrollingMovementMethod, com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean right(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        if (action(3, customTextView, spannable)) {
            return true;
        }
        return super.right(customTextView, spannable);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.ScrollingMovementMethod, com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean up(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        if (action(2, customTextView, spannable)) {
            return true;
        }
        return super.up(customTextView, spannable);
    }
}
