package df;

/* loaded from: classes7.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f229422b;

    /* renamed from: f, reason: collision with root package name */
    public static yz5.a f229426f;

    /* renamed from: a, reason: collision with root package name */
    public static final df.a1 f229421a = new df.a1();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f229423c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f229424d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f229425e = new java.util.HashMap();

    public final synchronized void a(long j17) {
        com.tencent.mars.xlog.Log.i("SkylineManager", "init " + j17);
        java.util.HashMap hashMap = f229423c;
        if (((df.x0) hashMap.get(java.lang.Long.valueOf(j17))) == null) {
            hashMap.put(java.lang.Long.valueOf(j17), new df.x0(j17));
        }
    }
}
