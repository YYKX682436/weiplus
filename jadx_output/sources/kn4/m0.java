package kn4;

/* loaded from: classes12.dex */
public class m0 implements kn4.w {

    /* renamed from: j, reason: collision with root package name */
    public static final int f309720j = android.os.Process.myUid();

    /* renamed from: a, reason: collision with root package name */
    public final kn4.c f309721a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f309722b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f309723c;

    /* renamed from: d, reason: collision with root package name */
    public long f309724d;

    /* renamed from: e, reason: collision with root package name */
    public long f309725e;

    /* renamed from: f, reason: collision with root package name */
    public long f309726f;

    /* renamed from: g, reason: collision with root package name */
    public long f309727g;

    /* renamed from: h, reason: collision with root package name */
    public long f309728h;

    /* renamed from: i, reason: collision with root package name */
    public long f309729i;

    public m0() {
        this.f309722b = false;
        boolean z17 = true;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.f309722b = true;
            this.f309721a = new kn4.z();
        }
        try {
            int i17 = f309720j;
            this.f309724d = android.net.TrafficStats.getUidRxBytes(i17);
            this.f309725e = android.net.TrafficStats.getUidTxBytes(i17);
            long mobileRxBytes = android.net.TrafficStats.getMobileRxBytes();
            long mobileTxBytes = android.net.TrafficStats.getMobileTxBytes();
            this.f309726f = android.net.TrafficStats.getTotalRxBytes() - mobileRxBytes;
            this.f309727g = android.net.TrafficStats.getTotalTxBytes() - mobileTxBytes;
            if (this.f309724d == -1 || this.f309725e == -1) {
                z17 = false;
            }
            this.f309723c = z17;
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.i("TrafficStatsWrapper", e17.toString());
            this.f309723c = false;
        }
    }
}
