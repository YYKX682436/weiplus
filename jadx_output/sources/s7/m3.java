package s7;

/* loaded from: classes16.dex */
public class m3 extends org.xml.sax.ext.DefaultHandler2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s7.r3 f403727a;

    public m3(s7.r3 r3Var, s7.h3 h3Var) {
        this.f403727a = r3Var;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i17, int i18) {
        this.f403727a.L(new java.lang.String(cArr, i17, i18));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() {
        this.f403727a.getClass();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f403727a.c(str, str2, str3);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void processingInstruction(java.lang.String str, java.lang.String str2) {
        s7.p3 p3Var = new s7.p3(str2);
        s7.r3 r3Var = this.f403727a;
        r3Var.C(p3Var);
        r3Var.getClass();
        str.equals("xml-stylesheet");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() {
        s7.r3 r3Var = this.f403727a;
        r3Var.getClass();
        r3Var.f403814a = new s7.t2();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(java.lang.String str, java.lang.String str2, java.lang.String str3, org.xml.sax.Attributes attributes) {
        this.f403727a.J(str, str2, str3, attributes);
    }
}
