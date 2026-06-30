package zn1;

/* loaded from: classes11.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final zn1.n f474455d = new zn1.n();

    public n() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zn1.p pVar = zn1.p.f474464a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.content.res.XmlResourceParser xml = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getXml(com.tencent.mm.R.xml.f494827dc);
            kotlin.jvm.internal.o.f(xml, "getXml(...)");
            while (xml.next() != 1) {
                if (xml.getEventType() == 2 && kotlin.jvm.internal.o.b(xml.getName(), "usb-accessory")) {
                    zn1.g gVar = new zn1.g(xml.getAttributeValue(null, "manufacturer"), xml.getAttributeValue(null, "model"));
                    arrayList.add(gVar);
                    com.tencent.mars.xlog.Log.i("UsbAccessoryManager", "Add device=" + gVar + " to accessory device filter");
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("UsbAccessoryManager", "Fail to parse accessory filter, exception=" + e17);
        }
        return arrayList;
    }
}
