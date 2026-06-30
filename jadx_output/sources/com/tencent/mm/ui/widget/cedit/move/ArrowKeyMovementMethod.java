package com.tencent.mm.ui.widget.cedit.move;

/* loaded from: classes15.dex */
public class ArrowKeyMovementMethod extends com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod {
    private static final java.lang.Object LAST_TAP_DOWN = new java.lang.Object();
    private static final java.lang.String TAG = "cmEdit.ArrowKeyMovementMethod";
    private static com.tencent.mm.ui.widget.cedit.move.ArrowKeyMovementMethod sInstance;

    private static int getCurrentLineTop(android.text.Spannable spannable, android.text.Layout layout) {
        return layout.getLineTop(layout.getLineForOffset(android.text.Selection.getSelectionEnd(spannable)));
    }

    public static il5.a getInstance() {
        if (sInstance == null) {
            sInstance = new com.tencent.mm.ui.widget.cedit.move.ArrowKeyMovementMethod();
        }
        return sInstance;
    }

    private static int getPageHeight(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView) {
        android.graphics.Rect rect = new android.graphics.Rect();
        if (customTextView.getGlobalVisibleRect(rect)) {
            return rect.height();
        }
        return 0;
    }

    private static boolean isSelecting(android.text.Spannable spannable) {
        return android.text.method.MetaKeyKeyListener.getMetaState(spannable, 1) == 1 || android.text.method.MetaKeyKeyListener.getMetaState(spannable, 2048) != 0;
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean bottom(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        if (isSelecting(spannable)) {
            android.text.Selection.extendSelection(spannable, spannable.length());
            return true;
        }
        android.text.Selection.setSelection(spannable, spannable.length());
        return true;
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod, il5.a
    public boolean canSelectArbitrarily() {
        return true;
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean down(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Layout layout = customTextView.getLayout();
        return isSelecting(spannable) ? android.text.Selection.extendDown(spannable, layout) : android.text.Selection.moveDown(spannable, layout);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean end(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return lineEnd(customTextView, spannable);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean handleMovementKey(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17, int i18, android.view.KeyEvent keyEvent) {
        return (i17 == 23 && android.view.KeyEvent.metaStateHasNoModifiers(i18) && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && android.text.method.MetaKeyKeyListener.getMetaState(spannable, 2048, keyEvent) != 0) ? customTextView.showContextMenu() : super.handleMovementKey(customTextView, spannable, i17, i18, keyEvent);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean home(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return lineStart(customTextView, spannable);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod, il5.a
    public void initialize(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Selection.setSelection(spannable, 0);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean left(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Layout layout = customTextView.getLayout();
        return isSelecting(spannable) ? android.text.Selection.extendLeft(spannable, layout) : android.text.Selection.moveLeft(spannable, layout);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean leftWord(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean lineEnd(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Layout layout = customTextView.getLayout();
        return isSelecting(spannable) ? android.text.Selection.extendToRightEdge(spannable, layout) : android.text.Selection.moveToRightEdge(spannable, layout);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean lineStart(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Layout layout = customTextView.getLayout();
        return isSelecting(spannable) ? android.text.Selection.extendToLeftEdge(spannable, layout) : android.text.Selection.moveToLeftEdge(spannable, layout);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod, il5.a
    public void onTakeFocus(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17) {
        if ((i17 & 130) == 0) {
            android.text.Selection.setSelection(spannable, spannable.length());
        } else if (customTextView.getLayout() == null) {
            android.text.Selection.setSelection(spannable, spannable.length());
        }
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod, il5.a
    public boolean onTouchEvent(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        int i17;
        int selectionStart;
        int action = motionEvent.getAction();
        boolean z17 = false;
        int i18 = -1;
        if (action == 1) {
            il5.b[] bVarArr = (il5.b[]) spannable.getSpans(0, spannable.length(), il5.b.class);
            i17 = bVarArr.length > 0 ? bVarArr[0].f292149f : -1;
            il5.b[] bVarArr2 = (il5.b[]) spannable.getSpans(0, spannable.length(), il5.b.class);
            if (bVarArr2.length > 0) {
                i18 = bVarArr2[0].f292150g;
            }
        } else {
            i17 = -1;
        }
        boolean isSelecting = isSelecting(spannable);
        boolean a17 = il5.c.a(customTextView, spannable, motionEvent);
        gl5.e0 e0Var = customTextView.f211589g2;
        if (e0Var != null && e0Var.f272956n) {
            z17 = true;
        }
        if (z17) {
            return a17;
        }
        if (action == 0) {
            if (!isSelecting(spannable) || (!customTextView.isFocused() && !customTextView.requestFocus())) {
                return a17;
            }
            int K = customTextView.K(motionEvent.getX(), motionEvent.getY());
            spannable.setSpan(LAST_TAP_DOWN, K, K, 34);
            customTextView.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (customTextView.isFocused()) {
            if (action == 2) {
                if (isSelecting(spannable) && a17) {
                    int spanStart = spannable.getSpanStart(LAST_TAP_DOWN);
                    customTextView.cancelLongPress();
                    int K2 = customTextView.K(motionEvent.getX(), motionEvent.getY());
                    android.text.Selection.setSelection(spannable, java.lang.Math.min(spanStart, K2), java.lang.Math.max(spanStart, K2));
                    return true;
                }
            } else if (action == 1) {
                if ((i18 < 0 || i18 == customTextView.getScrollY()) && (i17 < 0 || i17 == customTextView.getScrollX())) {
                    if (isSelecting) {
                        java.lang.Object obj = LAST_TAP_DOWN;
                        int spanStart2 = spannable.getSpanStart(obj);
                        int K3 = customTextView.K(motionEvent.getX(), motionEvent.getY());
                        android.text.Selection.setSelection(spannable, java.lang.Math.min(spanStart2, K3), java.lang.Math.max(spanStart2, K3));
                        spannable.removeSpan(obj);
                    }
                    android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(spannable);
                    jl5.c.a(spannable);
                    return true;
                }
                if ((customTextView.A instanceof android.text.Spannable) && (selectionStart = customTextView.getSelectionStart()) == customTextView.getSelectionEnd()) {
                    int lineForOffset = customTextView.M.getLineForOffset(selectionStart);
                    int lineTop = customTextView.M.getLineTop(lineForOffset);
                    int lineTop2 = customTextView.M.getLineTop(lineForOffset + 1);
                    int bottom = ((customTextView.getBottom() - customTextView.getTop()) - customTextView.getExtendedPaddingTop()) - customTextView.getExtendedPaddingBottom();
                    int i19 = lineTop2 - lineTop;
                    int i27 = i19 / 2;
                    int i28 = bottom / 4;
                    if (i27 > i28) {
                        i27 = i28;
                    }
                    int scrollY = customTextView.getScrollY();
                    int i29 = scrollY + i27;
                    if (lineTop < i29) {
                        lineForOffset = customTextView.M.getLineForVertical(i29 + i19);
                    } else {
                        int i37 = (bottom + scrollY) - i27;
                        if (lineTop2 > i37) {
                            lineForOffset = customTextView.M.getLineForVertical(i37 - i19);
                        }
                    }
                    int right = ((customTextView.getRight() - customTextView.getLeft()) - customTextView.getCompoundPaddingLeft()) - customTextView.getCompoundPaddingRight();
                    int offsetForHorizontal = customTextView.M.getOffsetForHorizontal(lineForOffset, customTextView.getScrollX());
                    int offsetForHorizontal2 = customTextView.M.getOffsetForHorizontal(lineForOffset, right + r1);
                    int i38 = offsetForHorizontal < offsetForHorizontal2 ? offsetForHorizontal : offsetForHorizontal2;
                    if (offsetForHorizontal <= offsetForHorizontal2) {
                        offsetForHorizontal = offsetForHorizontal2;
                    }
                    if (selectionStart >= i38) {
                        i38 = selectionStart > offsetForHorizontal ? offsetForHorizontal : selectionStart;
                    }
                    if (i38 != selectionStart) {
                        android.text.Selection.setSelection(customTextView.B, i38);
                    }
                }
                return true;
            }
        }
        return a17;
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean pageDown(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Layout layout = customTextView.getLayout();
        boolean isSelecting = isSelecting(spannable);
        int currentLineTop = getCurrentLineTop(spannable, layout) + getPageHeight(customTextView);
        boolean z17 = false;
        while (true) {
            int selectionEnd = android.text.Selection.getSelectionEnd(spannable);
            if (isSelecting) {
                android.text.Selection.extendDown(spannable, layout);
            } else {
                android.text.Selection.moveDown(spannable, layout);
            }
            if (android.text.Selection.getSelectionEnd(spannable) == selectionEnd) {
                return z17;
            }
            if (getCurrentLineTop(spannable, layout) >= currentLineTop) {
                return true;
            }
            z17 = true;
        }
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean pageUp(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Layout layout = customTextView.getLayout();
        boolean isSelecting = isSelecting(spannable);
        int currentLineTop = getCurrentLineTop(spannable, layout) - getPageHeight(customTextView);
        boolean z17 = false;
        while (true) {
            int selectionEnd = android.text.Selection.getSelectionEnd(spannable);
            if (isSelecting) {
                android.text.Selection.extendUp(spannable, layout);
            } else {
                android.text.Selection.moveUp(spannable, layout);
            }
            if (android.text.Selection.getSelectionEnd(spannable) == selectionEnd) {
                return z17;
            }
            if (getCurrentLineTop(spannable, layout) <= currentLineTop) {
                return true;
            }
            z17 = true;
        }
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean right(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Layout layout = customTextView.getLayout();
        return isSelecting(spannable) ? android.text.Selection.extendRight(spannable, layout) : android.text.Selection.moveRight(spannable, layout);
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean rightWord(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean top(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        if (isSelecting(spannable)) {
            android.text.Selection.extendSelection(spannable, 0);
            return true;
        }
        android.text.Selection.setSelection(spannable, 0);
        return true;
    }

    @Override // com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod
    public boolean up(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Layout layout = customTextView.getLayout();
        return isSelecting(spannable) ? android.text.Selection.extendUp(spannable, layout) : android.text.Selection.moveUp(spannable, layout);
    }
}
