package kk1;

/* loaded from: classes12.dex */
public class b implements android.text.Html.TagHandler {

    /* renamed from: a, reason: collision with root package name */
    public final kk1.c f308479a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f308480b;

    public b(kk1.c cVar, boolean z17) {
        this.f308479a = cVar;
        this.f308480b = z17;
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z17, java.lang.String str, android.text.Editable editable, org.xml.sax.XMLReader xMLReader) {
        if ("a".equalsIgnoreCase(str)) {
            boolean z18 = this.f308480b;
            kk1.c cVar = this.f308479a;
            if (z17) {
                int length = editable.length();
                editable.setSpan(new com.tencent.mm.plugin.appbrand.utils.html.CustomURLSpan("", cVar, z18), length, length, 17);
                return;
            }
            int length2 = editable.length();
            java.lang.Object[] spans = editable.getSpans(0, editable.length(), com.tencent.mm.plugin.appbrand.utils.html.CustomURLSpan.class);
            java.lang.Object obj = null;
            if (spans.length != 0) {
                int length3 = spans.length;
                while (true) {
                    if (length3 <= 0) {
                        break;
                    }
                    length3--;
                    if (editable.getSpanFlags(spans[length3]) == 17) {
                        obj = spans[length3];
                        break;
                    }
                }
            }
            com.tencent.mm.plugin.appbrand.utils.html.CustomURLSpan customURLSpan = (com.tencent.mm.plugin.appbrand.utils.html.CustomURLSpan) obj;
            int spanStart = editable.getSpanStart(customURLSpan);
            java.lang.String charSequence = editable.subSequence(spanStart, length2).toString();
            editable.removeSpan(customURLSpan);
            if (spanStart != length2) {
                editable.setSpan(new com.tencent.mm.plugin.appbrand.utils.html.CustomURLSpan(charSequence, cVar, z18), spanStart, length2, 33);
            }
        }
    }
}
