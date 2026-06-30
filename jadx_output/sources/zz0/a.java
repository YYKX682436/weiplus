package zz0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final zz0.a f477696a = new zz0.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f477697b;

    static {
        java.lang.String str = com.tencent.mm.vfs.q7.c("finder") + '/';
        com.tencent.mars.xlog.Log.i("MMPMediaFileCachePathRouter", "FINDER_DATA_ROOT=" + str);
        com.tencent.mars.xlog.Log.i("MMPMediaFileCachePathRouter", "FINDER_LIVE_ROOT=" + (com.tencent.mm.vfs.q7.c("live") + '/'));
        com.tencent.mars.xlog.Log.i("MMPMediaFileCachePathRouter", "FINDER_POSTING_ROOT=" + (com.tencent.mm.vfs.q7.c("finderposting") + '/'));
        java.lang.String str2 = str + "video/";
        com.tencent.mars.xlog.Log.i("MMPMediaFileCachePathRouter", "FINDER_VIDEO_DIR=" + str2);
        f477697b = str2;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f477697b);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("finder_video_");
        sb7.append(str);
        sb7.append('_');
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (str3 == null) {
                str3 = "";
            }
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            str2 = com.tencent.mm.sdk.platformtools.w2.b(str3.getBytes());
        }
        sb7.append(str2);
        sb6.append(sb7.toString());
        return sb6.toString();
    }
}
