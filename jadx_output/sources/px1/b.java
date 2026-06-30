package px1;

/* loaded from: classes12.dex */
public class b extends px1.e<java.lang.Boolean, com.tencent.mm.plugin.component.editor.model.nativenote.spans.BoldSpan> {
    @Override // px1.u
    public void a(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText, java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        nx1.p pVar = new nx1.p(wXRTEditText);
        int i17 = pVar.a() ? 18 : 34;
        android.text.Editable text = wXRTEditText.getText();
        java.util.Iterator it = d(text, pVar, px1.r.SPAN_FLAGS).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            com.tencent.mm.plugin.component.editor.model.nativenote.spans.BoldSpan boldSpan = (com.tencent.mm.plugin.component.editor.model.nativenote.spans.BoldSpan) next;
            boldSpan.getClass();
            boolean equals = java.lang.Boolean.TRUE.equals(bool);
            int spanStart = text.getSpanStart(next);
            int i18 = pVar.f341315d;
            if (spanStart < i18) {
                if (equals) {
                    pVar.f341315d = java.lang.Math.max(0, i18 - (i18 - spanStart));
                    pVar.f341316e += 0;
                    i17 = 34;
                } else {
                    boldSpan.getClass();
                    text.setSpan(new com.tencent.mm.plugin.component.editor.model.nativenote.spans.BoldSpan(), spanStart, pVar.f341315d, 33);
                }
            }
            int spanEnd = text.getSpanEnd(next);
            int i19 = pVar.f341316e;
            if (spanEnd > i19) {
                if (equals) {
                    pVar.f341315d = java.lang.Math.max(0, pVar.f341315d - 0);
                    pVar.f341316e += spanEnd - i19;
                } else {
                    boldSpan.getClass();
                    text.setSpan(new com.tencent.mm.plugin.component.editor.model.nativenote.spans.BoldSpan(), pVar.f341316e, spanEnd, 34);
                }
            }
            text.removeSpan(next);
        }
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        text.setSpan(new com.tencent.mm.plugin.component.editor.model.nativenote.spans.BoldSpan(), pVar.f341315d, pVar.f341316e, i17);
    }

    @Override // px1.u
    public int b() {
        return 0;
    }
}
