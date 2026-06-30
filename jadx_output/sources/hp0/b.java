package hp0;

/* loaded from: classes10.dex */
public class b extends hp0.i {

    /* renamed from: b, reason: collision with root package name */
    public final hp0.h f282906b;

    public b(java.lang.String str, java.lang.String str2, hp0.h hVar) {
        super(str);
        this.f282906b = hVar;
    }

    @Override // hp0.i
    public jp0.f a() {
        return this.f282906b.a(this.f282914a);
    }

    @Override // hp0.i
    public void b(java.io.OutputStream stream) {
        java.lang.String filePath = (java.lang.String) this.f282914a;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(stream, "stream");
        if (!com.tencent.mm.vfs.w6.j(filePath)) {
            return;
        }
        try {
            java.io.InputStream E = com.tencent.mm.vfs.w6.E(filePath);
            if (E == null) {
                return;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = E.read(bArr);
                    if (read == -1) {
                        vz5.b.a(E, null);
                        return;
                    }
                    stream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            jx3.f.INSTANCE.idkeyStat(1299L, 12L, 1L, false);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Loader.DiskFunction", th6, "save failed. path:".concat(filePath), new java.lang.Object[0]);
        }
    }
}
