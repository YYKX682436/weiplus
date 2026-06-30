package to1;

/* loaded from: classes15.dex */
public final class d implements ro1.i {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f420908a;

    public d(android.net.Uri baseUri) {
        kotlin.jvm.internal.o.g(baseUri, "baseUri");
        this.f420908a = baseUri;
    }

    @Override // ro1.i
    public java.lang.String a(java.lang.String str) {
        return "SAF";
    }

    @Override // ro1.i
    public boolean b(java.lang.String baseDirPath, java.lang.String fileName) {
        kotlin.jvm.internal.o.g(baseDirPath, "baseDirPath");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        to1.r b17 = to1.i.f420915a.b(this.f420908a, baseDirPath, false);
        return (b17 != null ? b17.d(fileName, false) : null) != null;
    }

    @Override // ro1.i
    public java.io.InputStream c(java.lang.String baseDirPath, java.lang.String fileName) {
        kotlin.jvm.internal.o.g(baseDirPath, "baseDirPath");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        to1.i iVar = to1.i.f420915a;
        android.net.Uri uri = this.f420908a;
        to1.r b17 = iVar.b(uri, baseDirPath, false);
        to1.r d17 = b17 != null ? b17.d(fileName, false) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openInputStream uri(");
        sb6.append(uri);
        sb6.append(") path(");
        sb6.append(baseDirPath);
        sb6.append('/');
        sb6.append(fileName);
        sb6.append("), targetFileIsNull=");
        sb6.append(d17 == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SAFUDiskDevice", sb6.toString());
        if (d17 == null || d17.f420937b) {
            return null;
        }
        android.net.Uri uri2 = d17.f420936a;
        kotlin.jvm.internal.o.g(uri2, "uri");
        return iVar.c(uri2);
    }

    @Override // ro1.i
    public java.io.OutputStream d(java.lang.String baseDirPath, java.lang.String fileName) {
        kotlin.jvm.internal.o.g(baseDirPath, "baseDirPath");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        to1.i iVar = to1.i.f420915a;
        android.net.Uri uri = this.f420908a;
        to1.r b17 = iVar.b(uri, baseDirPath, true);
        to1.r d17 = b17 != null ? b17.d(fileName, true) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openOutputStream uri(");
        sb6.append(uri);
        sb6.append(") path(");
        sb6.append(baseDirPath);
        sb6.append('/');
        sb6.append(fileName);
        sb6.append("), targetFileIsNull=");
        sb6.append(d17 == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SAFUDiskDevice", sb6.toString());
        if (d17 == null || d17.f420937b) {
            return null;
        }
        android.net.Uri uri2 = d17.f420936a;
        kotlin.jvm.internal.o.g(uri2, "uri");
        return iVar.d(uri2);
    }
}
