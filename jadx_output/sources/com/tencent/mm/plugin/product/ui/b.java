package com.tencent.mm.plugin.product.ui;

/* loaded from: classes12.dex */
public class b implements android.text.Html.TagHandler {
    public b(com.tencent.mm.plugin.product.ui.HtmlTextView htmlTextView) {
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z17, java.lang.String str, android.text.Editable editable, org.xml.sax.XMLReader xMLReader) {
        java.lang.Object obj;
        if (str.equalsIgnoreCase("strike") || str.equals("s")) {
            int length = editable.length();
            if (z17) {
                editable.setSpan(new android.text.style.StrikethroughSpan(), length, length, 17);
                return;
            }
            java.lang.Object[] spans = editable.getSpans(0, editable.length(), android.text.style.StrikethroughSpan.class);
            if (spans.length != 0) {
                int length2 = spans.length;
                while (length2 > 0) {
                    length2--;
                    if (editable.getSpanFlags(spans[length2]) == 17) {
                        obj = spans[length2];
                        break;
                    }
                }
            }
            obj = null;
            int spanStart = editable.getSpanStart(obj);
            editable.removeSpan(obj);
            if (spanStart != length) {
                editable.setSpan(new android.text.style.StrikethroughSpan(), spanStart, length, 33);
            }
        }
    }
}
