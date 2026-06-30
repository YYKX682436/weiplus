package com.tencent.mm.ui.widget.cedit.move;

/* loaded from: classes15.dex */
public class BaseMovementMethod implements il5.a {
    private int getBottomLine(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView) {
        return customTextView.getLayout().getLineForVertical(customTextView.getScrollY() + getInnerHeight(customTextView));
    }

    private int getCharacterWidth(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView) {
        return (int) java.lang.Math.ceil(customTextView.getPaint().getFontSpacing());
    }

    private int getInnerHeight(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView) {
        return (customTextView.getHeight() - customTextView.getTotalPaddingTop()) - customTextView.getTotalPaddingBottom();
    }

    private int getInnerWidth(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView) {
        return (customTextView.getWidth() - customTextView.getTotalPaddingLeft()) - customTextView.getTotalPaddingRight();
    }

    private int getScrollBoundsLeft(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView) {
        android.text.Layout layout = customTextView.getLayout();
        int topLine = getTopLine(customTextView);
        int bottomLine = getBottomLine(customTextView);
        if (topLine > bottomLine) {
            return 0;
        }
        int i17 = Integer.MAX_VALUE;
        while (topLine <= bottomLine) {
            int floor = (int) java.lang.Math.floor(layout.getLineLeft(topLine));
            if (floor < i17) {
                i17 = floor;
            }
            topLine++;
        }
        return i17;
    }

    private int getScrollBoundsRight(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView) {
        android.text.Layout layout = customTextView.getLayout();
        int topLine = getTopLine(customTextView);
        int bottomLine = getBottomLine(customTextView);
        if (topLine > bottomLine) {
            return 0;
        }
        int i17 = Integer.MIN_VALUE;
        while (topLine <= bottomLine) {
            int ceil = (int) java.lang.Math.ceil(layout.getLineRight(topLine));
            if (ceil > i17) {
                i17 = ceil;
            }
            topLine++;
        }
        return i17;
    }

    private int getTopLine(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView) {
        return customTextView.getLayout().getLineForVertical(customTextView.getScrollY());
    }

    public boolean bottom(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    @Override // il5.a
    public boolean canSelectArbitrarily() {
        return false;
    }

    public boolean down(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    public boolean end(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    public int getMovementMetaState(android.text.Spannable spannable, android.view.KeyEvent keyEvent) {
        return android.view.KeyEvent.normalizeMetaState(android.text.method.MetaKeyKeyListener.getMetaState(spannable, keyEvent) & (-1537)) & (-194);
    }

    public boolean handleMovementKey(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17, int i18, android.view.KeyEvent keyEvent) {
        if (i17 == 92) {
            if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                return pageUp(customTextView, spannable);
            }
            if (android.view.KeyEvent.metaStateHasModifiers(i18, 2)) {
                return top(customTextView, spannable);
            }
            return false;
        }
        if (i17 == 93) {
            if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                return pageDown(customTextView, spannable);
            }
            if (android.view.KeyEvent.metaStateHasModifiers(i18, 2)) {
                return bottom(customTextView, spannable);
            }
            return false;
        }
        if (i17 == 122) {
            if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                return home(customTextView, spannable);
            }
            if (android.view.KeyEvent.metaStateHasModifiers(i18, 4096)) {
                return top(customTextView, spannable);
            }
            return false;
        }
        if (i17 == 123) {
            if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                return end(customTextView, spannable);
            }
            if (android.view.KeyEvent.metaStateHasModifiers(i18, 4096)) {
                return bottom(customTextView, spannable);
            }
            return false;
        }
        switch (i17) {
            case 19:
                if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                    return up(customTextView, spannable);
                }
                if (android.view.KeyEvent.metaStateHasModifiers(i18, 2)) {
                    return top(customTextView, spannable);
                }
                return false;
            case 20:
                if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                    return down(customTextView, spannable);
                }
                if (android.view.KeyEvent.metaStateHasModifiers(i18, 2)) {
                    return bottom(customTextView, spannable);
                }
                return false;
            case 21:
                if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                    return left(customTextView, spannable);
                }
                if (android.view.KeyEvent.metaStateHasModifiers(i18, 4096)) {
                    return leftWord(customTextView, spannable);
                }
                if (android.view.KeyEvent.metaStateHasModifiers(i18, 2)) {
                    return lineStart(customTextView, spannable);
                }
                return false;
            case 22:
                if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                    return right(customTextView, spannable);
                }
                if (android.view.KeyEvent.metaStateHasModifiers(i18, 4096)) {
                    return rightWord(customTextView, spannable);
                }
                if (android.view.KeyEvent.metaStateHasModifiers(i18, 2)) {
                    return lineEnd(customTextView, spannable);
                }
                return false;
            default:
                return false;
        }
    }

    public boolean home(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    @Override // il5.a
    public void initialize(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
    }

    public boolean left(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    public boolean leftWord(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    public boolean lineEnd(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    public boolean lineStart(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // il5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(com.tencent.mm.ui.widget.cedit.edit.CustomTextView r7, android.text.Spannable r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r9.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L6e
            int r0 = r9.getAction()
            r2 = 8
            if (r0 == r2) goto L12
            goto L6e
        L12:
            int r0 = r9.getMetaState()
            r0 = r0 & 1
            r2 = 9
            r3 = 0
            if (r0 == 0) goto L23
            float r9 = r9.getAxisValue(r2)
            r0 = r3
            goto L2e
        L23:
            float r0 = r9.getAxisValue(r2)
            float r0 = -r0
            r2 = 10
            float r9 = r9.getAxisValue(r2)
        L2e:
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 >= 0) goto L3f
            float r9 = -r9
            double r4 = (double) r9
            double r4 = java.lang.Math.ceil(r4)
            int r9 = (int) r4
            boolean r9 = r6.scrollLeft(r7, r8, r9)
        L3d:
            r1 = r1 | r9
            goto L4e
        L3f:
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto L4e
            double r4 = (double) r9
            double r4 = java.lang.Math.ceil(r4)
            int r9 = (int) r4
            boolean r9 = r6.scrollRight(r7, r8, r9)
            goto L3d
        L4e:
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 >= 0) goto L5f
            float r9 = -r0
            double r2 = (double) r9
            double r2 = java.lang.Math.ceil(r2)
            int r9 = (int) r2
            boolean r7 = r6.scrollUp(r7, r8, r9)
        L5d:
            r1 = r1 | r7
            goto L6e
        L5f:
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 <= 0) goto L6e
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r9 = (int) r2
            boolean r7 = r6.scrollDown(r7, r8, r9)
            goto L5d
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod.onGenericMotionEvent(com.tencent.mm.ui.widget.cedit.edit.CustomTextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }

    @Override // il5.a
    public boolean onKeyDown(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17, android.view.KeyEvent keyEvent) {
        boolean handleMovementKey = handleMovementKey(customTextView, spannable, i17, getMovementMetaState(spannable, keyEvent), keyEvent);
        if (handleMovementKey) {
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(spannable);
            jl5.c.a(spannable);
        }
        return handleMovementKey;
    }

    @Override // il5.a
    public boolean onKeyOther(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, android.view.KeyEvent keyEvent) {
        int movementMetaState = getMovementMetaState(spannable, keyEvent);
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 0 || keyEvent.getAction() != 2) {
            return false;
        }
        int repeatCount = keyEvent.getRepeatCount();
        int i17 = 0;
        boolean z17 = false;
        while (i17 < repeatCount && handleMovementKey(customTextView, spannable, keyCode, movementMetaState, keyEvent)) {
            i17++;
            z17 = true;
        }
        if (z17) {
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(spannable);
            jl5.c.a(spannable);
        }
        return z17;
    }

    @Override // il5.a
    public boolean onKeyUp(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17, android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // il5.a
    public void onTakeFocus(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17) {
    }

    @Override // il5.a
    public boolean onTouchEvent(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // il5.a
    public boolean onTrackballEvent(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        return false;
    }

    public boolean pageDown(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    public boolean pageUp(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    public boolean right(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    public boolean rightWord(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    public boolean scrollBottom(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Layout layout = customTextView.getLayout();
        int lineCount = layout.getLineCount();
        if (getBottomLine(customTextView) > lineCount - 1) {
            return false;
        }
        il5.c.b(customTextView, layout, customTextView.getScrollX(), layout.getLineTop(lineCount) - getInnerHeight(customTextView));
        return true;
    }

    public boolean scrollDown(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17) {
        android.text.Layout layout = customTextView.getLayout();
        int innerHeight = getInnerHeight(customTextView);
        int scrollY = customTextView.getScrollY() + innerHeight;
        int lineForVertical = layout.getLineForVertical(scrollY);
        int i18 = lineForVertical + 1;
        if (layout.getLineTop(i18) < scrollY + 1) {
            lineForVertical = i18;
        }
        int lineCount = layout.getLineCount() - 1;
        if (lineForVertical > lineCount) {
            return false;
        }
        il5.c.b(customTextView, layout, customTextView.getScrollX(), layout.getLineTop(java.lang.Math.min((lineForVertical + i17) - 1, lineCount) + 1) - innerHeight);
        return true;
    }

    public boolean scrollLeft(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17) {
        int scrollBoundsLeft = getScrollBoundsLeft(customTextView);
        int scrollX = customTextView.getScrollX();
        if (scrollX <= scrollBoundsLeft) {
            return false;
        }
        customTextView.scrollTo(java.lang.Math.max(scrollX - (getCharacterWidth(customTextView) * i17), scrollBoundsLeft), customTextView.getScrollY());
        return true;
    }

    public boolean scrollLineEnd(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        int scrollBoundsRight = getScrollBoundsRight(customTextView) - getInnerWidth(customTextView);
        if (customTextView.getScrollX() >= scrollBoundsRight) {
            return false;
        }
        customTextView.scrollTo(scrollBoundsRight, customTextView.getScrollY());
        return true;
    }

    public boolean scrollLineStart(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        int scrollBoundsLeft = getScrollBoundsLeft(customTextView);
        if (customTextView.getScrollX() <= scrollBoundsLeft) {
            return false;
        }
        customTextView.scrollTo(scrollBoundsLeft, customTextView.getScrollY());
        return true;
    }

    public boolean scrollPageDown(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Layout layout = customTextView.getLayout();
        int innerHeight = getInnerHeight(customTextView);
        int lineForVertical = layout.getLineForVertical(customTextView.getScrollY() + innerHeight + innerHeight);
        if (lineForVertical > layout.getLineCount() - 1) {
            return false;
        }
        il5.c.b(customTextView, layout, customTextView.getScrollX(), layout.getLineTop(lineForVertical + 1) - innerHeight);
        return true;
    }

    public boolean scrollPageUp(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Layout layout = customTextView.getLayout();
        int lineForVertical = layout.getLineForVertical(customTextView.getScrollY() - getInnerHeight(customTextView));
        if (lineForVertical < 0) {
            return false;
        }
        il5.c.b(customTextView, layout, customTextView.getScrollX(), layout.getLineTop(lineForVertical));
        return true;
    }

    public boolean scrollRight(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17) {
        int scrollBoundsRight = getScrollBoundsRight(customTextView) - getInnerWidth(customTextView);
        int scrollX = customTextView.getScrollX();
        if (scrollX >= scrollBoundsRight) {
            return false;
        }
        customTextView.scrollTo(java.lang.Math.min(scrollX + (getCharacterWidth(customTextView) * i17), scrollBoundsRight), customTextView.getScrollY());
        return true;
    }

    public boolean scrollTop(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        android.text.Layout layout = customTextView.getLayout();
        if (getTopLine(customTextView) < 0) {
            return false;
        }
        il5.c.b(customTextView, layout, customTextView.getScrollX(), layout.getLineTop(0));
        return true;
    }

    public boolean scrollUp(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17) {
        android.text.Layout layout = customTextView.getLayout();
        int scrollY = customTextView.getScrollY();
        int lineForVertical = layout.getLineForVertical(scrollY);
        if (layout.getLineTop(lineForVertical) == scrollY) {
            lineForVertical--;
        }
        if (lineForVertical < 0) {
            return false;
        }
        il5.c.b(customTextView, layout, customTextView.getScrollX(), layout.getLineTop(java.lang.Math.max((lineForVertical - i17) + 1, 0)));
        return true;
    }

    public boolean top(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }

    public boolean up(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable) {
        return false;
    }
}
