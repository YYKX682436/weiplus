package sc3;

/* loaded from: classes7.dex */
public final class l implements dh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406495a;

    public l(sc3.k1 k1Var) {
        this.f406495a = k1Var;
    }

    @Override // dh.a
    public void a(java.lang.String path, yz5.l callback) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // dh.a
    public java.lang.String getAbsolutePath(java.lang.String fileId) {
        kotlin.jvm.internal.o.g(fileId, "fileId");
        if (r26.i0.y(fileId, "wxfile://", false)) {
            sc3.k1 k1Var = this.f406495a;
            jc3.x xVar = k1Var.f406486r;
            if (xVar == null) {
                kotlin.jvm.internal.o.o("pkgManagement");
                throw null;
            }
            com.tencent.mm.vfs.r6 absoluteFile = xVar.b().getAbsoluteFile(fileId);
            if (absoluteFile != null && absoluteFile.m()) {
                java.lang.String o17 = absoluteFile.o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                com.tencent.mars.xlog.Log.i(k1Var.Q, "fileSystem: getAbsolutePath ret = ".concat(o17));
                return o17;
            }
        }
        return fileId;
    }

    @Override // dh.a
    public byte[] readDataFromURLSync(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        bf3.g0 g0Var = bf3.g0.f19627a;
        jc3.x xVar = this.f406495a.f406486r;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("pkgManagement");
            throw null;
        }
        java.nio.ByteBuffer c17 = g0Var.c(xVar, path);
        if (c17 == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[c17.remaining()];
        c17.get(bArr);
        return bArr;
    }
}
