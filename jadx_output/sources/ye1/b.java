package ye1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ye1.b f461179a = new ye1.b();

    public final boolean a(java.io.InputStream inputStream) {
        kotlin.jvm.internal.o.g(inputStream, "inputStream");
        byte[] bArr = new byte[32768];
        int read = inputStream.read(bArr, 0, 1024);
        int i17 = 0;
        boolean z17 = false;
        while (-1 != read) {
            i17 += read;
            java.lang.String str = new java.lang.String(bArr, 0, i17, r26.c.f368865a);
            if (!z17) {
                if (!r26.i0.y(str, "#EXTM3U", false)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ContainerFormatInferCommons", "isHls, magicChecked fail");
                    return false;
                }
                z17 = true;
            }
            if (r26.n0.B(str, "#EXT-X-STREAM-INF:", false) || r26.n0.B(str, "#EXT-X-TARGETDURATION:", false) || r26.n0.B(str, "#EXT-X-MEDIA-SEQUENCE:", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ContainerFormatInferCommons", "isHls, infer done, hadReadLen: " + i17);
                return true;
            }
            int i18 = 32768 - i17;
            if (i18 > 1024) {
                i18 = 1024;
            }
            if (i18 <= 0) {
                break;
            }
            read = inputStream.read(bArr, i17, i18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ContainerFormatInferCommons", "isHls, infer done, hadReadLen: " + i17 + ", curReadLen: " + read);
        return false;
    }
}
