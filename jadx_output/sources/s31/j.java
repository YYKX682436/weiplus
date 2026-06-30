package s31;

/* loaded from: classes12.dex */
public final class j implements q31.p, q31.m {

    /* renamed from: d, reason: collision with root package name */
    public int f402456d;

    /* renamed from: e, reason: collision with root package name */
    public an5.d f402457e;

    @Override // q31.m
    public void a(org.w3c.dom.Node node) {
        java.lang.String nodeValue;
        java.lang.Integer h17;
        java.lang.Integer h18;
        java.lang.Integer h19;
        java.lang.Integer h27;
        if (node instanceof org.w3c.dom.Element) {
            org.w3c.dom.Element element = (org.w3c.dom.Element) node;
            if (kotlin.jvm.internal.o.b(element.getNodeName(), "LinearLayout")) {
                element.setAttribute("padding", "12, 8, 12, 8");
                org.w3c.dom.Node namedItem = element.getAttributes().getNamedItem("orientation");
                an5.d dVar = null;
                java.lang.String nodeValue2 = namedItem != null ? namedItem.getNodeValue() : null;
                int i17 = 0;
                this.f402456d = (!kotlin.jvm.internal.o.b(nodeValue2, "horizontal") && kotlin.jvm.internal.o.b(nodeValue2, "vertical")) ? 1 : 0;
                org.w3c.dom.Node namedItem2 = element.getAttributes().getNamedItem("padding");
                if (namedItem2 != null && (nodeValue = namedItem2.getNodeValue()) != null) {
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[() ]");
                    kotlin.jvm.internal.o.f(compile, "compile(...)");
                    java.lang.String replaceAll = compile.matcher(nodeValue).replaceAll("");
                    kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
                    java.util.List f07 = r26.n0.f0(replaceAll, new java.lang.String[]{","}, false, 0, 6, null);
                    java.lang.String str = (java.lang.String) kz5.n0.a0(f07, 0);
                    int intValue = (str == null || (h27 = r26.h0.h(str)) == null) ? 0 : h27.intValue();
                    java.lang.String str2 = (java.lang.String) kz5.n0.a0(f07, 1);
                    int intValue2 = (str2 == null || (h19 = r26.h0.h(str2)) == null) ? 0 : h19.intValue();
                    java.lang.String str3 = (java.lang.String) kz5.n0.a0(f07, 2);
                    int intValue3 = (str3 == null || (h18 = r26.h0.h(str3)) == null) ? 0 : h18.intValue();
                    java.lang.String str4 = (java.lang.String) kz5.n0.a0(f07, 3);
                    if (str4 != null && (h17 = r26.h0.h(str4)) != null) {
                        i17 = h17.intValue();
                    }
                    dVar = new an5.d(intValue, intValue2, intValue3, i17);
                }
                this.f402457e = dVar;
            }
        }
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    public java.lang.String toString() {
        return "DslLinearLayoutViewModel {orientation: " + this.f402456d + ", gravity: 17, padding: " + this.f402457e;
    }
}
