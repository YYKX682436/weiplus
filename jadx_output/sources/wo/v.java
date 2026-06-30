package wo;

/* loaded from: classes13.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public int f447812a;

    /* renamed from: b, reason: collision with root package name */
    public long f447813b;

    /* renamed from: c, reason: collision with root package name */
    public long f447814c;

    /* renamed from: d, reason: collision with root package name */
    public final long f447815d;

    /* renamed from: e, reason: collision with root package name */
    public long f447816e;

    /* renamed from: f, reason: collision with root package name */
    public int f447817f;

    public v(wo.w wVar) {
        this.f447812a = 0;
        this.f447813b = 0L;
        this.f447814c = 0L;
        this.f447815d = 0L;
        this.f447816e = 0L;
        this.f447817f = 0;
    }

    public void a(java.lang.String[] strArr) {
        long parseLong = java.lang.Long.parseLong(strArr[4], 10);
        long j17 = 0;
        boolean z17 = true;
        for (java.lang.String str : strArr) {
            if (z17) {
                z17 = false;
            } else {
                j17 += java.lang.Long.parseLong(str, 10);
            }
        }
        long j18 = parseLong - this.f447814c;
        long j19 = j17 - this.f447813b;
        this.f447812a = (int) ((((float) (j19 - j18)) / ((float) j19)) * 100.0f);
        this.f447813b = j17;
        this.f447814c = parseLong;
        com.tencent.mars.xlog.Log.i(" MicroMsg.CpuUsage", "CpuUsageInfo(" + hashCode() + ") CPU total=" + j17 + "; idle=" + parseLong + "; usage=" + this.f447812a);
    }

    public v(wo.w wVar, long j17) {
        this.f447815d = j17;
    }
}
