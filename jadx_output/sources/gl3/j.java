package gl3;

/* loaded from: classes13.dex */
public abstract class j {
    public static boolean a(java.lang.String str) {
        b21.v c17 = gl3.e.c(gl3.h.b(str));
        if (c17 != null) {
            return gl3.i.b(str) && gl3.i.c(str) > 0 && c17.f17372e == 1;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Audio.IndexBitMgr", "isQQAudioCacheValid pMusic is null!'");
        return false;
    }
}
