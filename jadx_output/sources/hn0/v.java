package hn0;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final hn0.v f282440a = new hn0.v();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f282441b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static long f282442c;

    public final synchronized kn0.e a() {
        return (kn0.e) kz5.n0.k0(f282441b);
    }

    public final kn0.e b(android.os.Bundle bundle) {
        java.lang.String str;
        kn0.e eVar = new kn0.e(0L, 0, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 0, null, 0, 0.0f, 0.0f, 0, 0, 0L, 0L, -1, 7, null);
        long j17 = bundle != null ? bundle.getLong("NET_STATUS_START_TIME", 0L) : 0L;
        eVar.f309503a = bundle != null ? bundle.getLong("NET_STATUS_LIVE_ID", 0L) : 0L;
        eVar.f309504b = bundle != null ? bundle.getInt("NET_STATUS_ROLE", 0) : 0;
        eVar.f309505c = bundle != null ? bundle.getInt("NET_STATUS_MODE", 0) : 0;
        eVar.f309507e = bundle != null ? bundle.getInt("NET_STATUS_NET_TYPE", 0) : 0;
        eVar.f309506d = bundle != null ? bundle.getLong("NET_STATUS_TIMESTAMP", 0L) : 0L;
        eVar.f309525w = (int) (j17 / 1000);
        eVar.f309523u = java.lang.System.currentTimeMillis() - j17;
        java.lang.String string = bundle != null ? bundle.getString(com.tencent.rtmp.TXLiveConstants.NET_STATUS_CPU_USAGE) : null;
        if (string != null) {
            java.lang.String str2 = string;
            eVar.D = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) kz5.n0.X(r26.n0.f0(str2, new java.lang.String[]{"/"}, false, 0, 6, null)), 0);
            eVar.E = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) kz5.n0.i0(r26.n0.f0(str2, new java.lang.String[]{"/"}, false, 0, 6, null)), 0);
        }
        eVar.f309508f = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_WIDTH) : 0;
        eVar.f309509g = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_HEIGHT) : 0;
        eVar.f309510h = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_FPS) : 0;
        eVar.f309511i = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_GOP) : 0;
        eVar.f309512j = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_BITRATE) : 0;
        eVar.f309513k = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_AUDIO_BITRATE) : 0;
        eVar.f309514l = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_NET_SPEED) : 0;
        eVar.f309515m = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_CACHE) : 0;
        eVar.f309516n = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_AUDIO_CACHE) : 0;
        eVar.f309517o = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE) : 0;
        eVar.f309518p = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL) : 0;
        eVar.f309519q = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL) : 0;
        eVar.f309520r = (int) (bundle != null ? bundle.getFloat(com.tencent.rtmp.TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD) : 0.0f);
        eVar.f309521s = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_NET_JITTER) : 0;
        eVar.f309522t = bundle != null ? bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_QUALITY_LEVEL) : 0;
        if (bundle == null || (str = bundle.getString(com.tencent.rtmp.TXLiveConstants.NET_STATUS_SERVER_IP)) == null) {
            str = "";
        }
        eVar.B = str;
        eVar.f309528z = bundle != null ? bundle.getInt("NET_STATUS_RTT") : 0;
        eVar.F = bundle != null ? bundle.getInt("NET_STATUS_UP_LOSS") : 0;
        eVar.G = bundle != null ? bundle.getInt("NET_STATUS_DOWN_LOSS") : 0;
        eVar.H = bundle != null ? bundle.getLong("NET_STATUS_SEND_BYTES") : 0L;
        eVar.I = bundle != null ? bundle.getLong("NET_STATUS_RECEIVE_BYTES") : 0L;
        return eVar;
    }

    public final long c() {
        return f282442c;
    }
}
