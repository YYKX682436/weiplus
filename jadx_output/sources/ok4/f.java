package ok4;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ok4.f f345994a = new ok4.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f345995b = new java.util.HashMap();

    public final void a(java.lang.String mediaId, int i17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPredictDataReport", "setPredictStatsToReport >> " + mediaId + ", " + i17);
        f345995b.put(mediaId, java.lang.Integer.valueOf(i17));
    }
}
