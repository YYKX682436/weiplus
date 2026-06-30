package kl;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public java.io.InputStream f308706a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f308707b;

    public b(java.lang.String str, boolean z17, java.lang.String str2) {
        if (z17) {
            this.f308707b = rl.a.f(str2, str);
        } else {
            this.f308707b = rl.a.a(str);
        }
        java.lang.Object[] objArr = {this.f308707b};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioConvertCacheReader", "cacheFile:%s", objArr);
        try {
            this.f308706a = com.tencent.mm.vfs.w6.C(rl.a.b(this.f308707b));
        } catch (java.io.FileNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioConvertCacheReader", e17, "VFSFileOp.openRead", new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioConvertCacheReader", e18, "VFSFileOp.openRead", new java.lang.Object[0]);
        }
    }

    public byte[] a(int i17) {
        java.io.InputStream inputStream = this.f308706a;
        if (inputStream == null) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioConvertCacheReader", "readPcmDataTrack, inputStream is null", null);
            return null;
        }
        if (i17 > 0) {
            byte[] bArr = new byte[i17];
            try {
                if (inputStream.read(bArr, 0, i17) > 0) {
                    return bArr;
                }
            } catch (java.lang.Exception e17) {
                int i19 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioConvertCacheReader", e17, "readPcmDataTrack", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public void b() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioConvertCacheReader", "release", null);
        try {
            java.io.InputStream inputStream = this.f308706a;
            if (inputStream != null) {
                inputStream.close();
                this.f308706a = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioConvertCacheReader", e17, "inputStream close", new java.lang.Object[0]);
        }
    }
}
