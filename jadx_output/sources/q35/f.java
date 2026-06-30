package q35;

/* loaded from: classes5.dex */
public class f implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f359978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap.CompressFormat f359979b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f359980c;

    public f(android.graphics.Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressFormat, int i17) {
        this.f359978a = bitmap;
        this.f359979b = compressFormat;
        this.f359980c = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public void a(java.io.OutputStream outputStream) {
        try {
            try {
                this.f359978a.compress(this.f359979b, this.f359980c, outputStream);
                outputStream.flush();
                try {
                    outputStream.close();
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoUtil", e17, "", new java.lang.Object[0]);
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoUtil", e18, "", new java.lang.Object[0]);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoUtil", e19, "", new java.lang.Object[0]);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.io.IOException e27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoUtil", e27, "", new java.lang.Object[0]);
                }
            }
            throw th6;
        }
    }
}
