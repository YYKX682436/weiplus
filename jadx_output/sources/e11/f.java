package e11;

/* loaded from: classes15.dex */
public class f implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public int f246385d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f246386e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f246387f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f246388g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f246389h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f246390i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f246391m = false;

    public e11.f a(int i17, long j17, long j18, int i18) {
        long j19 = j18 - j17;
        if (this.f246389h == i18 && j19 <= e11.g.b() + 20000) {
            this.f246385d = i17;
            if (this.f246387f <= 0) {
                this.f246387f = j17;
                this.f246386e = c01.id.a();
            }
            this.f246388g = j18;
            this.f246389h = i18;
            return null;
        }
        e11.f fVar = new e11.f();
        fVar.f246385d = i17;
        fVar.f246387f = j17;
        fVar.f246388g = j18;
        fVar.f246389h = i18;
        if (this.f246389h != i18) {
            fVar.f246391m = true;
        }
        if (j19 > e11.g.b() + 20000) {
            fVar.f246390i = false;
        }
        return fVar;
    }

    public java.lang.String toString() {
        return java.lang.String.format("pid:%s,startServerTime:%s,startTime:%s,endTime:%s,normalExecute:%s,changedNetworkStatus:%s,networkStatus:%s", java.lang.Integer.valueOf(this.f246385d), e11.b.c(this.f246386e), e11.b.c(this.f246387f), e11.b.c(this.f246388g), java.lang.Boolean.valueOf(this.f246390i), java.lang.Boolean.valueOf(this.f246391m), java.lang.Integer.valueOf(this.f246389h));
    }
}
