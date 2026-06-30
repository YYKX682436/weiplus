package so1;

/* loaded from: classes5.dex */
public final class d implements ro1.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f410232a;

    public d(java.lang.String absolutePath) {
        kotlin.jvm.internal.o.g(absolutePath, "absolutePath");
        this.f410232a = absolutePath;
    }

    @Override // ro1.i
    public java.lang.String a(java.lang.String str) {
        return ((str == null || str.length() == 0) || kotlin.jvm.internal.o.b(str, "Direct")) ? "Direct" : str;
    }

    @Override // ro1.i
    public boolean b(java.lang.String baseDirPath, java.lang.String fileName) {
        kotlin.jvm.internal.o.g(baseDirPath, "baseDirPath");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        try {
            ro1.a aVar = ro1.a.f397974a;
            return com.tencent.mm.vfs.w6.j(aVar.b(this.f410232a, aVar.b(baseDirPath, fileName)));
        } catch (java.io.FileNotFoundException e17) {
            com.tencent.mars.xlog.Log.w("DirectDiskDeviceDelegate", "openInputStream: %s", e17.toString());
            return false;
        } catch (java.lang.SecurityException e18) {
            com.tencent.mars.xlog.Log.w("DirectDiskDeviceDelegate", "openInputStream: %s", e18.toString());
            return false;
        }
    }

    @Override // ro1.i
    public java.io.InputStream c(java.lang.String baseDirPath, java.lang.String fileName) {
        java.lang.String b17;
        kotlin.jvm.internal.o.g(baseDirPath, "baseDirPath");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        for (int i17 = 1; i17 < 4; i17++) {
            try {
                ro1.a aVar = ro1.a.f397974a;
                b17 = aVar.b(this.f410232a, aVar.b(baseDirPath, fileName));
            } catch (java.io.FileNotFoundException e17) {
                com.tencent.mars.xlog.Log.w("DirectDiskDeviceDelegate", "openInputStream: %s", e17.toString());
            } catch (java.lang.SecurityException e18) {
                com.tencent.mars.xlog.Log.w("DirectDiskDeviceDelegate", "openInputStream: %s", e18.toString());
            }
            if (com.tencent.mm.vfs.w6.j(b17)) {
                return new java.io.FileInputStream(b17);
            }
            com.tencent.mars.xlog.Log.i("DirectDiskDeviceDelegate", "[openInputStream] Path=" + b17 + " is not exist, tryCount=" + i17);
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        return null;
    }

    @Override // ro1.i
    public java.io.OutputStream d(java.lang.String baseDirPath, java.lang.String fileName) {
        java.lang.String b17;
        java.lang.String b18;
        kotlin.jvm.internal.o.g(baseDirPath, "baseDirPath");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        for (int i17 = 1; i17 < 4; i17++) {
            try {
                ro1.a aVar = ro1.a.f397974a;
                b17 = aVar.b(this.f410232a, baseDirPath);
                b18 = aVar.b(b17, fileName);
            } catch (java.io.FileNotFoundException e17) {
                com.tencent.mars.xlog.Log.w("DirectDiskDeviceDelegate", "openOutputStream: " + e17 + ", tryCount=" + i17);
            } catch (java.lang.SecurityException e18) {
                com.tencent.mars.xlog.Log.w("DirectDiskDeviceDelegate", "openOutputStream: " + e18 + ", tryCount=" + i17);
            }
            if (com.tencent.mm.vfs.w6.j(b17) || com.tencent.mm.vfs.w6.u(b17)) {
                return new java.io.FileOutputStream(b18);
            }
            com.tencent.mars.xlog.Log.i("DirectDiskDeviceDelegate", "[openOutputStream] Path=" + b17 + " is not exist and can't create, tryCount=" + i17);
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        return null;
    }
}
