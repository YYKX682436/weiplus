package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes4.dex */
public abstract class s {
    public static boolean a(android.view.View view, android.text.Spanned spanned) {
        boolean z17;
        if (view != null && spanned != null && (((z17 = view instanceof android.widget.TextView)) || (view instanceof com.tencent.mm.kiss.widget.textview.StaticTextView))) {
            int lineCount = z17 ? ((android.widget.TextView) view).getLineCount() : view instanceof com.tencent.mm.kiss.widget.textview.StaticTextView ? ((com.tencent.mm.kiss.widget.textview.StaticTextView) view).getLineCount() : 0;
            if (lineCount == 1 && spanned.length() > 500) {
                com.tencent.mars.xlog.Log.e("MicroMsg.InvalidTextCheck", "error black dot");
                return true;
            }
            for (int i17 = 1; i17 < lineCount; i17++) {
                if (b(view, i17) - b(view, i17 - 1) > 500) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.InvalidTextCheck", "error black dot");
                    return true;
                }
            }
        }
        return false;
    }

    public static int b(android.view.View view, int i17) {
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            if (textView.getLayout() == null) {
                return 0;
            }
            return textView.getLayout().getLineEnd(i17);
        }
        if (!(view instanceof com.tencent.mm.kiss.widget.textview.StaticTextView)) {
            return 0;
        }
        com.tencent.mm.kiss.widget.textview.StaticTextView staticTextView = (com.tencent.mm.kiss.widget.textview.StaticTextView) view;
        if (staticTextView.getTvLayout() == null) {
            return 0;
        }
        return staticTextView.getTvLayout().getLineEnd(i17);
    }
}
