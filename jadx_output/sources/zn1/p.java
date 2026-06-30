package zn1;

/* loaded from: classes11.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final zn1.p f474464a = new zn1.p();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f474465b = jz5.h.b(zn1.n.f474455d);

    /* renamed from: c, reason: collision with root package name */
    public static final zn1.n0 f474466c = new zn1.n0(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.sync.d f474467d = kotlinx.coroutines.sync.l.a(false, 1, null);

    public final zn1.f a(android.hardware.usb.UsbAccessory usbAccessory, android.hardware.usb.UsbManager usbManager) {
        zn1.n0 n0Var;
        java.lang.Integer h17;
        com.tencent.mars.xlog.Log.i("UsbAccessoryManager", "[connectAccessory] accessory@" + usbAccessory.hashCode());
        com.tencent.wechat.aff.migration.f fVar = com.tencent.wechat.aff.migration.f.f217390b;
        if (fVar.e()) {
            com.tencent.mars.xlog.Log.i("UsbAccessoryManager", "[connectAccessory] aoa is already valid, skip connecting accessory@" + usbAccessory.hashCode());
            return zn1.b.f474421a;
        }
        android.os.ParcelFileDescriptor openAccessory = usbManager.openAccessory(usbAccessory);
        if (openAccessory == null || !openAccessory.getFileDescriptor().valid()) {
            com.tencent.mars.xlog.Log.e("UsbAccessoryManager", "[connectAccessory] Fail to open accessory@" + usbAccessory.hashCode() + ", pfd=" + openAccessory);
            return new zn1.a("Fail to open accessory");
        }
        java.lang.String version = usbAccessory.getVersion();
        if (version == null || version.length() == 0) {
            n0Var = new zn1.n0(0, 0);
        } else {
            java.util.List e07 = r26.n0.e0(version, new char[]{'.'}, false, 0, 6, null);
            int intValue = (e07.size() < 2 || (h17 = r26.h0.h((java.lang.String) e07.get(1))) == null) ? 0 : h17.intValue();
            java.lang.Integer h18 = r26.h0.h((java.lang.String) e07.get(0));
            n0Var = new zn1.n0(h18 != null ? h18.intValue() : 0, intValue);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[connectAccessory] fd=");
        sb6.append(openAccessory.getFd());
        sb6.append(", version=");
        sb6.append(n0Var);
        sb6.append(", VERSION=");
        zn1.n0 n0Var2 = f474466c;
        sb6.append(n0Var2);
        com.tencent.mars.xlog.Log.i("UsbAccessoryManager", sb6.toString());
        if (n0Var.a(n0Var2) > 0 || n0Var.a(new zn1.n0(2, 0)) < 0) {
            try {
                openAccessory.close();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("UsbAccessoryManager", e17.toString());
            }
            return n0Var.a(n0Var2) > 0 ? zn1.d.f474425a : zn1.e.f474432a;
        }
        com.tencent.mars.xlog.Log.i("UsbAccessoryManager", "[connectAccessory] fd=" + openAccessory.getFd() + ", isValid=" + openAccessory.getFileDescriptor().valid());
        fVar.j(openAccessory.getFd());
        openAccessory.close();
        kotlinx.coroutines.flow.i2 i2Var = yn1.r2.f463809f;
        ((kotlinx.coroutines.flow.q2) yn1.r2.f463809f).e(java.lang.Boolean.TRUE);
        return zn1.c.f474423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r9v15, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.hardware.usb.UsbAccessory r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.p.b(android.hardware.usb.UsbAccessory, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
