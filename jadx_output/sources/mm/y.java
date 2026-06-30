package mm;

/* loaded from: classes12.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f328568a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f328569b = java.util.Collections.emptyMap();

    /* renamed from: c, reason: collision with root package name */
    public long f328570c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f328571d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f328572e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f328573f = 0;

    public y(java.lang.String str) {
        this.f328568a = str;
    }

    public void a() {
        if (this.f328569b != java.util.Collections.EMPTY_MAP) {
            synchronized (this) {
                if (!this.f328569b.isEmpty()) {
                    java.util.Iterator it = this.f328569b.values().iterator();
                    while (it.hasNext()) {
                        this.f328570c += ((java.lang.Integer) it.next()).intValue();
                    }
                    this.f328569b.clear();
                }
            }
            long j17 = this.f328572e;
            if (j17 > 0) {
                this.f328573f += j17;
                this.f328572e = 0L;
            }
        }
    }

    public boolean b() {
        boolean z17 = true;
        if (!(this.f328569b != java.util.Collections.EMPTY_MAP)) {
            return false;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j17 = this.f328571d;
        if (j17 > 0) {
            long j18 = uptimeMillis - j17;
            if (j18 < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                this.f328572e += j18;
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyPowerInspector", "collect " + this.f328568a + " addicted ms: " + j18 + ", all=" + this.f328572e);
                this.f328571d = uptimeMillis;
                return z17;
            }
        }
        z17 = false;
        this.f328571d = uptimeMillis;
        return z17;
    }

    public void c(java.lang.String str) {
        if (this.f328569b != java.util.Collections.EMPTY_MAP) {
            synchronized (this) {
                java.lang.Integer num = (java.lang.Integer) this.f328569b.get(str);
                this.f328569b.put(str, java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            }
        }
    }

    public void d() {
        synchronized (this) {
            this.f328569b = new java.util.HashMap();
        }
    }
}
