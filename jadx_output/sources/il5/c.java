package il5;

/* loaded from: classes15.dex */
public abstract class c {
    public static boolean a(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        float x17;
        float f17;
        float y17;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            for (java.lang.Object obj : (il5.b[]) spannable.getSpans(0, spannable.length(), il5.b.class)) {
                spannable.removeSpan(obj);
            }
            spannable.setSpan(new il5.b(motionEvent.getX(), motionEvent.getY(), customTextView.getScrollX(), customTextView.getScrollY()), 0, 0, 17);
            return true;
        }
        if (actionMasked == 1) {
            il5.b[] bVarArr = (il5.b[]) spannable.getSpans(0, spannable.length(), il5.b.class);
            for (il5.b bVar : bVarArr) {
                spannable.removeSpan(bVar);
            }
            return bVarArr.length > 0 && bVarArr[0].f292152i;
        }
        if (actionMasked == 2) {
            il5.b[] bVarArr2 = (il5.b[]) spannable.getSpans(0, spannable.length(), il5.b.class);
            if (bVarArr2.length > 0) {
                if (!bVarArr2[0].f292151h) {
                    float scaledTouchSlop = android.view.ViewConfiguration.get(customTextView.getContext()).getScaledTouchSlop();
                    if (java.lang.Math.abs(motionEvent.getX() - bVarArr2[0].f292147d) >= scaledTouchSlop || java.lang.Math.abs(motionEvent.getY() - bVarArr2[0].f292148e) >= scaledTouchSlop) {
                        bVarArr2[0].f292151h = true;
                    }
                }
                il5.b bVar2 = bVarArr2[0];
                if (bVar2.f292151h) {
                    bVar2.f292152i = true;
                    if (((motionEvent.getMetaState() & 1) == 0 && android.text.method.MetaKeyKeyListener.getMetaState(spannable, 1) != 1 && android.text.method.MetaKeyKeyListener.getMetaState(spannable, 2048) == 0) ? false : true) {
                        x17 = motionEvent.getX() - bVarArr2[0].f292147d;
                        f17 = motionEvent.getY();
                        y17 = bVarArr2[0].f292148e;
                    } else {
                        x17 = bVarArr2[0].f292147d - motionEvent.getX();
                        f17 = bVarArr2[0].f292148e;
                        y17 = motionEvent.getY();
                    }
                    bVarArr2[0].f292147d = motionEvent.getX();
                    bVarArr2[0].f292148e = motionEvent.getY();
                    int scrollX = customTextView.getScrollX() + ((int) x17);
                    int scrollY = customTextView.getScrollY() + ((int) (f17 - y17));
                    int totalPaddingTop = customTextView.getTotalPaddingTop() + customTextView.getTotalPaddingBottom();
                    android.text.Layout layout = customTextView.getLayout();
                    int max = java.lang.Math.max(java.lang.Math.min(scrollY, layout.getHeight() - (customTextView.getHeight() - totalPaddingTop)), 0);
                    int scrollX2 = customTextView.getScrollX();
                    int scrollY2 = customTextView.getScrollY();
                    b(customTextView, layout, scrollX, max);
                    if (scrollX2 != customTextView.getScrollX() || scrollY2 != customTextView.getScrollY()) {
                        customTextView.cancelLongPress();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static void b(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Layout layout, int i17, int i18) {
        int i19;
        int i27;
        int width = customTextView.getWidth() - (customTextView.getTotalPaddingLeft() + customTextView.getTotalPaddingRight());
        int lineForVertical = layout.getLineForVertical(i18);
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(lineForVertical);
        int i28 = 0;
        boolean z17 = layout.getParagraphDirection(lineForVertical) > 0;
        if (customTextView.getHorizontallyScrolling()) {
            int lineForVertical2 = layout.getLineForVertical((customTextView.getHeight() + i18) - (customTextView.getTotalPaddingTop() + customTextView.getTotalPaddingBottom()));
            i19 = 0;
            i28 = Integer.MAX_VALUE;
            while (lineForVertical <= lineForVertical2) {
                i28 = (int) java.lang.Math.min(i28, layout.getLineLeft(lineForVertical));
                i19 = (int) java.lang.Math.max(i19, layout.getLineRight(lineForVertical));
                lineForVertical++;
            }
        } else {
            i19 = width;
        }
        int i29 = i19 - i28;
        if (i29 < width) {
            if (paragraphAlignment == android.text.Layout.Alignment.ALIGN_CENTER) {
                i27 = (width - i29) / 2;
            } else if ((z17 && paragraphAlignment == android.text.Layout.Alignment.ALIGN_OPPOSITE) || (!z17 && paragraphAlignment == android.text.Layout.Alignment.ALIGN_NORMAL)) {
                com.tencent.mars.xlog.Log.i("Touch", "scrollto may err");
                i27 = width - i29;
            }
            i28 -= i27;
        } else {
            i28 = java.lang.Math.max(java.lang.Math.min(i17, i19 - width), i28);
        }
        customTextView.scrollTo(i28, i18);
    }
}
