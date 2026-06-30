package zn1;

/* loaded from: classes11.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final zn1.a0 f474420d = new zn1.a0();

    public a0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zn1.i0 i0Var = zn1.i0.f474447a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            zn1.c0 c0Var = zn1.c0.f474424d;
            android.content.res.XmlResourceParser xml = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getXml(com.tencent.mm.R.xml.f494868di);
            kotlin.jvm.internal.o.f(xml, "getXml(...)");
            while (xml.getEventType() != 1) {
                if (xml.getEventType() == 2 && kotlin.jvm.internal.o.b(xml.getName(), "usb-device")) {
                    zn1.z zVar = new zn1.z((java.lang.Integer) c0Var.invoke(xml, "vendor-id"), (java.lang.Integer) c0Var.invoke(xml, "product-id"), (java.lang.Integer) c0Var.invoke(xml, "class"), (java.lang.Integer) c0Var.invoke(xml, "subclass"), (java.lang.Integer) c0Var.invoke(xml, "protocol"));
                    arrayList.add(zVar);
                    com.tencent.mars.xlog.Log.i("UsbDeviceManager", "Add device=" + zVar + " to usb device filter");
                }
                xml.next();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("UsbDeviceManager", "Fail to load usb device filter, exception=" + e17);
        }
        return arrayList;
    }
}
