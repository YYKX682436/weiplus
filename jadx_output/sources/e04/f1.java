package e04;

/* loaded from: classes15.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f245917a;

    /* renamed from: b, reason: collision with root package name */
    public long f245918b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f245919c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f245920d;

    /* renamed from: e, reason: collision with root package name */
    public long f245921e;

    /* renamed from: f, reason: collision with root package name */
    public long f245922f;

    /* renamed from: g, reason: collision with root package name */
    public long f245923g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f245924h;

    public f1(java.lang.Boolean bool, long j17, int i17, kotlin.jvm.internal.i iVar) {
        bool = (i17 & 1) != 0 ? null : bool;
        j17 = (i17 & 2) != 0 ? -1L : j17;
        this.f245917a = bool;
        this.f245918b = j17;
        this.f245921e = -1L;
        this.f245922f = -1L;
        this.f245923g = -1L;
    }

    public java.lang.String toString() {
        return "taskCalled: " + this.f245917a + ", cost: " + this.f245918b + ", threadScheduleCost: " + this.f245921e + ", startCallTimestamp: " + this.f245922f + ", taskFinishTimestamp: " + this.f245923g + ", hasException: " + this.f245919c + ", updated: " + this.f245920d;
    }
}
