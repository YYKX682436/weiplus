package rh;

/* loaded from: classes12.dex */
public class f extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public int f395374d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f395375e;

    /* renamed from: g, reason: collision with root package name */
    public rh.x2 f395377g;

    /* renamed from: h, reason: collision with root package name */
    public int f395378h;

    /* renamed from: i, reason: collision with root package name */
    public int f395379i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f395380j;

    /* renamed from: f, reason: collision with root package name */
    public long f395376f = java.lang.System.currentTimeMillis();

    /* renamed from: k, reason: collision with root package name */
    public boolean f395381k = false;

    /* renamed from: l, reason: collision with root package name */
    public long f395382l = 100;

    /* renamed from: m, reason: collision with root package name */
    public long f395383m = 100;

    /* renamed from: n, reason: collision with root package name */
    public long f395384n = 100;

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        return new rh.e(this, (rh.f) d3Var, this);
    }

    public java.lang.String toString() {
        return "TaskJiffiesSnapshot{appStat=" + this.f395378h + ", devStat=" + this.f395379i + ", tid=" + this.f395374d + ", name='" + this.f395375e + "', jiffies=" + this.f395377g + '}';
    }
}
