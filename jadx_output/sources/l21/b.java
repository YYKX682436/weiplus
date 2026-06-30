package l21;

/* loaded from: classes8.dex */
public class b extends java.io.FilterOutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final l21.a f315204d;

    public b(com.tencent.mm.vfs.r6 r6Var, long j17) {
        super(com.tencent.mm.vfs.w6.I(r6Var.f213166d, r6Var.M(), false));
        this.f315204d = new l21.a(j17);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        l21.a aVar = this.f315204d;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EncEngine", "free mNativePtr: " + aVar.f315203b + " hashcode " + aVar.hashCode());
            com.tencent.mm.plugin.imgenc.MMIMAGEENCJNI.free(aVar.f315203b);
            aVar.f315203b = 0L;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        l21.a aVar = this.f315204d;
        if (aVar.f315203b == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transFor ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(com.tencent.mm.sdk.platformtools.z3.b(true));
            com.tencent.mars.xlog.Log.i("MicroMsg.EncEngine", sb6.toString());
        }
        long j17 = i18;
        com.tencent.mm.plugin.imgenc.MMIMAGEENCJNI.transFor(aVar.f315203b, bArr, aVar.f315202a, j17);
        aVar.f315202a += j17;
        super.write(bArr, i17, i18);
    }
}
