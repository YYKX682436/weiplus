package wl5;

/* loaded from: classes15.dex */
public abstract class y {
    /* JADX WARN: Multi-variable type inference failed */
    public static int a(android.view.View view, int i17, int i18, int i19) {
        android.text.Layout layout;
        int lineForVertical;
        android.text.Layout layout2;
        int offsetForHorizontal;
        boolean z17 = view instanceof com.tencent.neattextview.textview.view.NeatTextView;
        boolean z18 = false;
        if (z17) {
            ks5.a layout3 = ((com.tencent.neattextview.textview.view.NeatTextView) view).getLayout();
            if (layout3 != null) {
                lineForVertical = layout3.h(i18);
            }
            lineForVertical = 0;
        } else if (view instanceof wl5.a) {
            android.text.Layout selectableLayout = ((wl5.a) view).getSelectableLayout();
            if (selectableLayout != null) {
                lineForVertical = selectableLayout.getLineForVertical(i18);
            }
            lineForVertical = 0;
        } else {
            if ((view instanceof android.widget.TextView) && (layout = ((android.widget.TextView) view).getLayout()) != null) {
                lineForVertical = layout.getLineForVertical(i18);
            }
            lineForVertical = 0;
        }
        if (i19 > 0 && d(view, i19) == d(view, i19 + (-1)) + 1) {
            int i27 = i19 - 1;
            int m17 = (int) m(view, i27);
            int g17 = (int) g(view, lineForVertical);
            if (i17 > g17 - ((g17 - m17) / 2)) {
                i19 = i27;
            }
        }
        int d17 = d(view, i19);
        int i28 = i(view, d17);
        int c17 = c(view, d17);
        int i29 = (c17 - i28) / 2;
        if ((lineForVertical == d17 + 1 && i18 - c17 < i29) || (lineForVertical == d17 - 1 && i28 - i18 < i29)) {
            lineForVertical = d17;
        }
        float f17 = i17;
        if (z17) {
            ks5.a layout4 = ((com.tencent.neattextview.textview.view.NeatTextView) view).getLayout();
            if (layout4 != null) {
                offsetForHorizontal = layout4.g(lineForVertical, f17);
            }
            offsetForHorizontal = 0;
        } else if (view instanceof wl5.a) {
            android.text.Layout selectableLayout2 = ((wl5.a) view).getSelectableLayout();
            if (selectableLayout2 != null) {
                offsetForHorizontal = selectableLayout2.getOffsetForHorizontal(lineForVertical, f17);
            }
            offsetForHorizontal = 0;
        } else {
            if ((view instanceof android.widget.TextView) && (layout2 = ((android.widget.TextView) view).getLayout()) != null) {
                offsetForHorizontal = layout2.getOffsetForHorizontal(lineForVertical, f17);
            }
            offsetForHorizontal = 0;
        }
        if (offsetForHorizontal >= o(view).length() - 1) {
            return offsetForHorizontal;
        }
        int i37 = offsetForHorizontal + 1;
        if (i37 > 0 && d(view, i37) == d(view, i37 - 1) + 1) {
            z18 = true;
        }
        if (!z18) {
            return offsetForHorizontal;
        }
        int m18 = (int) m(view, offsetForHorizontal);
        int g18 = (int) g(view, lineForVertical);
        return i17 > g18 - ((g18 - m18) / 2) ? i37 : offsetForHorizontal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ks5.a layout2 = ((com.tencent.neattextview.textview.view.NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.c(i17);
            }
            return 0;
        }
        if (view instanceof wl5.a) {
            android.text.Layout selectableLayout = ((wl5.a) view).getSelectableLayout();
            if (selectableLayout != null) {
                return selectableLayout.getLineBaseline(i17);
            }
            return 0;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0;
        }
        return layout.getLineBaseline(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ks5.a layout2 = ((com.tencent.neattextview.textview.view.NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.e(i17);
            }
            return 0;
        }
        if (view instanceof wl5.a) {
            android.text.Layout selectableLayout = ((wl5.a) view).getSelectableLayout();
            if (selectableLayout != null) {
                return selectableLayout.getLineBottom(i17);
            }
            return 0;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0;
        }
        return layout.getLineBottom(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ks5.a layout2 = ((com.tencent.neattextview.textview.view.NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.n(i17);
            }
            return 0;
        }
        if (view instanceof wl5.a) {
            android.text.Layout selectableLayout = ((wl5.a) view).getSelectableLayout();
            if (selectableLayout != null) {
                return selectableLayout.getLineForOffset(i17);
            }
            return 0;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0;
        }
        return layout.getLineForOffset(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(android.view.View view) {
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            return ((com.tencent.neattextview.textview.view.NeatTextView) view).getLineHeight();
        }
        if (view instanceof wl5.a) {
            return ((wl5.a) view).getSelectableLineHeight();
        }
        if (view instanceof android.widget.TextView) {
            return ((android.widget.TextView) view).getLineHeight();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float f(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ks5.a layout2 = ((com.tencent.neattextview.textview.view.NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.f(layout2.b(i17));
            }
            return 0.0f;
        }
        if (view instanceof wl5.a) {
            android.text.Layout selectableLayout = ((wl5.a) view).getSelectableLayout();
            if (selectableLayout != null) {
                return selectableLayout.getLineLeft(i17);
            }
            return 0.0f;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0.0f;
        }
        return layout.getLineLeft(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float g(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ks5.a layout2 = ((com.tencent.neattextview.textview.view.NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.i(i17);
            }
            return 0.0f;
        }
        if (view instanceof wl5.a) {
            android.text.Layout selectableLayout = ((wl5.a) view).getSelectableLayout();
            if (selectableLayout != null) {
                return selectableLayout.getLineRight(i17);
            }
            return 0.0f;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0.0f;
        }
        return layout.getLineRight(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int h(android.view.View view, int i17) {
        android.text.Layout layout;
        int lineStart;
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ks5.a layout2 = ((com.tencent.neattextview.textview.view.NeatTextView) view).getLayout();
            if (layout2 != null) {
                lineStart = layout2.b(i17);
            }
            lineStart = 0;
        } else if (view instanceof wl5.a) {
            android.text.Layout selectableLayout = ((wl5.a) view).getSelectableLayout();
            if (selectableLayout != null) {
                lineStart = selectableLayout.getLineStart(i17);
            }
            lineStart = 0;
        } else {
            if ((view instanceof android.widget.TextView) && (layout = ((android.widget.TextView) view).getLayout()) != null) {
                lineStart = layout.getLineStart(i17);
            }
            lineStart = 0;
        }
        if (lineStart >= 0) {
            return lineStart;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int i(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ks5.a layout2 = ((com.tencent.neattextview.textview.view.NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.a(i17);
            }
            return 0;
        }
        if (view instanceof wl5.a) {
            android.text.Layout selectableLayout = ((wl5.a) view).getSelectableLayout();
            if (selectableLayout != null) {
                return selectableLayout.getLineTop(i17);
            }
            return 0;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0;
        }
        return layout.getLineTop(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float j(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ks5.a layout2 = ((com.tencent.neattextview.textview.view.NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.o(i17);
            }
            return 0.0f;
        }
        if (view instanceof wl5.a) {
            android.text.Layout selectableLayout = ((wl5.a) view).getSelectableLayout();
            if (selectableLayout != null) {
                return selectableLayout.getLineWidth(i17);
            }
            return 0.0f;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0.0f;
        }
        return layout.getLineWidth(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int k(android.view.View view, int i17, int i18) {
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ks5.a layout = ((com.tencent.neattextview.textview.view.NeatTextView) view).getLayout();
            if (layout != null) {
                return layout.k(i17, i18);
            }
            return 0;
        }
        if (view instanceof wl5.a) {
            android.text.Layout selectableLayout = ((wl5.a) view).getSelectableLayout();
            if (selectableLayout == null) {
                return -1;
            }
            int offsetForHorizontal = selectableLayout.getOffsetForHorizontal(selectableLayout.getLineForVertical(i18), i17);
            return ((int) selectableLayout.getPrimaryHorizontal(offsetForHorizontal)) > i17 ? selectableLayout.getOffsetToLeftOf(offsetForHorizontal) : offsetForHorizontal;
        }
        if (!(view instanceof android.widget.TextView)) {
            return 0;
        }
        android.text.Layout layout2 = ((android.widget.TextView) view).getLayout();
        if (layout2 == null) {
            return -1;
        }
        int offsetForHorizontal2 = layout2.getOffsetForHorizontal(layout2.getLineForVertical(i18), i17);
        return ((int) layout2.getPrimaryHorizontal(offsetForHorizontal2)) > i17 ? layout2.getOffsetToLeftOf(offsetForHorizontal2) : offsetForHorizontal2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static android.text.TextPaint l(android.view.View view) {
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            return ((com.tencent.neattextview.textview.view.NeatTextView) view).getPaint();
        }
        if (!(view instanceof wl5.a)) {
            if (view instanceof android.widget.TextView) {
                return ((android.widget.TextView) view).getPaint();
            }
            return null;
        }
        android.text.Layout selectableLayout = ((wl5.a) view).getSelectableLayout();
        if (selectableLayout != null) {
            return selectableLayout.getPaint();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float m(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ks5.a layout2 = ((com.tencent.neattextview.textview.view.NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.f(i17);
            }
            return 0.0f;
        }
        if (view instanceof wl5.a) {
            android.text.Layout selectableLayout = ((wl5.a) view).getSelectableLayout();
            if (selectableLayout != null) {
                return selectableLayout.getPrimaryHorizontal(i17);
            }
            return 0.0f;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0.0f;
        }
        return layout.getPrimaryHorizontal(i17);
    }

    public static int n(android.content.Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.CharSequence o(android.view.View view) {
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            return ((com.tencent.neattextview.textview.view.NeatTextView) view).a();
        }
        if (!(view instanceof wl5.a)) {
            return view instanceof android.widget.TextView ? ((android.widget.TextView) view).getText() : "";
        }
        java.lang.CharSequence selectableText = ((wl5.a) view).getSelectableText();
        return selectableText == null ? "" : selectableText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float p(android.view.View view) {
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            return ((com.tencent.neattextview.textview.view.NeatTextView) view).getTextSize();
        }
        if (view instanceof wl5.a) {
            return ((wl5.a) view).getSelectableTextSize();
        }
        if (view instanceof android.widget.TextView) {
            return ((android.widget.TextView) view).getTextSize();
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void q(android.view.View view, java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            ((com.tencent.neattextview.textview.view.NeatTextView) view).c(charSequence, bufferType, null);
        } else if (view instanceof wl5.a) {
            ((wl5.a) view).setSelectableText(charSequence);
        } else if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(charSequence, bufferType);
        }
    }
}
