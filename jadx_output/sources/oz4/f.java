package oz4;

/* loaded from: classes12.dex */
public class f extends oz4.e<java.lang.Boolean, com.tencent.mm.plugin.wenote.model.nativenote.spans.HighlightSpan> {
    @Override // oz4.v
    public void a(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText, java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        mz4.t tVar = new mz4.t(wXRTEditText);
        int i17 = tVar.a() ? 18 : 34;
        android.text.Editable text = wXRTEditText.getText();
        java.util.Iterator it = d(text, tVar, oz4.u.SPAN_FLAGS).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            com.tencent.mm.plugin.wenote.model.nativenote.spans.HighlightSpan highlightSpan = (com.tencent.mm.plugin.wenote.model.nativenote.spans.HighlightSpan) next;
            highlightSpan.getClass();
            boolean equals = java.lang.Boolean.TRUE.equals(bool);
            int spanStart = text.getSpanStart(next);
            int i18 = tVar.f333350d;
            if (spanStart < i18) {
                if (equals) {
                    tVar.b(i18 - spanStart, 0);
                    i17 = 34;
                } else {
                    highlightSpan.getClass();
                    text.setSpan(new com.tencent.mm.plugin.wenote.model.nativenote.spans.HighlightSpan(), spanStart, tVar.f333350d, 33);
                }
            }
            int spanEnd = text.getSpanEnd(next);
            int i19 = tVar.f333351e;
            if (spanEnd > i19) {
                if (equals) {
                    tVar.b(0, spanEnd - i19);
                } else {
                    highlightSpan.getClass();
                    text.setSpan(new com.tencent.mm.plugin.wenote.model.nativenote.spans.HighlightSpan(), tVar.f333351e, spanEnd, 34);
                }
            }
            text.removeSpan(next);
        }
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        text.setSpan(new com.tencent.mm.plugin.wenote.model.nativenote.spans.HighlightSpan(), tVar.f333350d, tVar.f333351e, i17);
    }

    @Override // oz4.v
    public int b() {
        return 0;
    }

    @Override // oz4.e
    public boolean f(java.lang.Object obj) {
        return obj instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.HighlightSpan;
    }
}
