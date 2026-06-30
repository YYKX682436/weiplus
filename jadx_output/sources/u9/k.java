package u9;

/* loaded from: classes15.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final u9.j f425759a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f425760b;

    /* renamed from: c, reason: collision with root package name */
    public final long f425761c;

    /* renamed from: d, reason: collision with root package name */
    public final long f425762d;

    /* renamed from: e, reason: collision with root package name */
    public long f425763e;

    /* renamed from: f, reason: collision with root package name */
    public long f425764f;

    /* renamed from: g, reason: collision with root package name */
    public long f425765g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f425766h;

    /* renamed from: i, reason: collision with root package name */
    public long f425767i;

    /* renamed from: j, reason: collision with root package name */
    public long f425768j;

    /* renamed from: k, reason: collision with root package name */
    public long f425769k;

    public k(android.content.Context context) {
        double refreshRate = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay() != null ? r6.getDefaultDisplay().getRefreshRate() : -1.0d;
        boolean z17 = refreshRate != -1.0d;
        this.f425760b = z17;
        if (!z17) {
            this.f425759a = null;
            this.f425761c = -1L;
            this.f425762d = -1L;
        } else {
            this.f425759a = u9.j.f425754h;
            long j17 = (long) (1.0E9d / refreshRate);
            this.f425761c = j17;
            this.f425762d = (j17 * 80) / 100;
        }
    }
}
