package hl;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.io.RandomAccessFile f282012a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f282013b;

    public a(java.lang.String str, java.lang.String str2) {
        java.lang.String f17 = rl.a.f(str, str2);
        this.f282013b = f17;
        java.lang.Object[] objArr = {str2, f17};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmCacheFile", "AudioPcmCacheFile mUrl:%s, fileName:%s,", objArr);
    }

    public synchronized void a() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmCacheFile", "close", null);
        java.io.RandomAccessFile randomAccessFile = this.f282012a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmCacheFile", "close RandomAccessFile error ", "" + e17.getMessage());
            }
        }
    }

    public synchronized int b() {
        java.io.RandomAccessFile randomAccessFile = this.f282012a;
        if (randomAccessFile == null) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmCacheFile", "getLength error, randomAccessFile is null", null);
            return -1;
        }
        try {
            return (int) randomAccessFile.length();
        } catch (java.io.IOException e17) {
            java.lang.Object[] objArr = {"" + e17.getMessage()};
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmCacheFile", "Error get length of file , err %s", objArr);
            return -1;
        }
    }
}
