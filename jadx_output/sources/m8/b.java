package m8;

/* loaded from: classes15.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f324543a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.UUID f324544b;

    static {
        f324543a = t9.d0.f416498a < 23 ? com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST : 6396;
        f324544b = new java.util.UUID(0L, 0L);
        new java.util.UUID(1186680826959645954L, -5988876978535335093L);
        new java.util.UUID(-1301668207276963122L, -6645017420763422227L);
        new java.util.UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j17) {
        return (j17 == -9223372036854775807L || j17 == Long.MIN_VALUE) ? j17 : j17 * 1000;
    }

    public static long b(long j17) {
        return (j17 == -9223372036854775807L || j17 == Long.MIN_VALUE) ? j17 : j17 / 1000;
    }
}
