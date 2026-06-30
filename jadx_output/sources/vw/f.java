package vw;

/* loaded from: classes4.dex */
public final class f implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f440634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f440635b;

    public f(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f440634a = h0Var;
        this.f440635b = h0Var2;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public final void a(java.io.OutputStream outputStream) {
        try {
            try {
                byte[] bArr = new byte[8192];
                java.io.Closeable closeable = (java.io.Closeable) this.f440635b.f310123d;
                try {
                    java.io.ByteArrayInputStream byteArrayInputStream = (java.io.ByteArrayInputStream) closeable;
                    while (true) {
                        int read = byteArrayInputStream.read(bArr);
                        if (read == -1) {
                            vz5.b.a(closeable, null);
                            outputStream.flush();
                            vz5.b.a(outputStream, null);
                            return;
                        }
                        outputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizPicWaterMarkService", "Error while writing to output stream: " + e17.getMessage());
            kotlin.jvm.internal.h0 h0Var = this.f440634a;
            if (com.tencent.mm.vfs.w6.j((java.lang.String) h0Var.f310123d)) {
                com.tencent.mm.vfs.w6.h((java.lang.String) h0Var.f310123d);
            }
        }
    }
}
