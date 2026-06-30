package zn1;

/* loaded from: classes11.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final zn1.c0 f474424d = new zn1.c0();

    public c0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer i17;
        android.content.res.XmlResourceParser parser = (android.content.res.XmlResourceParser) obj;
        java.lang.String attrName = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(parser, "parser");
        kotlin.jvm.internal.o.g(attrName, "attrName");
        java.lang.String attributeValue = parser.getAttributeValue(null, attrName);
        if (attributeValue == null) {
            return null;
        }
        if (r26.i0.y(attributeValue, "0x", false) || r26.i0.y(attributeValue, "0X", false)) {
            java.lang.String substring = attributeValue.substring(2);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            i17 = r26.h0.i(substring, 16);
        } else {
            i17 = r26.h0.h(attributeValue);
        }
        return i17;
    }
}
