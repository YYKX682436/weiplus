package e11;

/* loaded from: classes15.dex */
public class a implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public long f246349d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f246350e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f246351f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f246352g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f246353h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f246354i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f246355m = true;

    /* renamed from: n, reason: collision with root package name */
    public int f246356n = 0;

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        long j17;
        e11.a aVar = (e11.a) obj;
        long j18 = this.f246349d;
        if (j18 != 0) {
            long j19 = aVar.f246349d;
            if (j19 != 0) {
                j17 = j18 - j19;
                return (int) j17;
            }
        }
        j17 = this.f246350e - aVar.f246350e;
        return (int) j17;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f246352g;
        if (i17 == 0) {
            sb6.append(java.lang.String.format("server time:%s,local start time:%s,local end time:%s,[mm] pid:%s,normal execute:%s", e11.b.c(this.f246349d), e11.b.c(this.f246350e), e11.b.c(this.f246351f), java.lang.Integer.valueOf(this.f246353h), java.lang.Boolean.valueOf(this.f246355m)));
        } else if (i17 == 1) {
            sb6.append(java.lang.String.format("server time:%s,local start time:%s,local end time:%s,[push] pid:%s,network:%s,normal execute:%s", e11.b.c(this.f246349d), e11.b.c(this.f246350e), e11.b.c(this.f246351f), java.lang.Integer.valueOf(this.f246353h), java.lang.Integer.valueOf(this.f246354i), java.lang.Boolean.valueOf(this.f246355m)));
        } else if (i17 == 2) {
            sb6.append(java.lang.String.format("server time:%s,local start time:%s,local end time:%s,send broadcast type(push):%s", e11.b.c(this.f246349d), e11.b.c(this.f246350e), e11.b.c(this.f246351f), java.lang.Integer.valueOf(this.f246356n)));
        } else if (i17 == 3) {
            sb6.append(java.lang.String.format("server time:%s,local start time:%s,local end time:%s,receive broadcast type(mm):%s", e11.b.c(this.f246349d), e11.b.c(this.f246350e), e11.b.c(this.f246351f), java.lang.Integer.valueOf(this.f246356n)));
        } else if (i17 == 4) {
            sb6.append(java.lang.String.format("server time:%s,local start time:%s,local end time:%s,delayed msg pid:%s, msg server time:%s,interval time:%s, msg server id:%s, %s", e11.b.c(this.f246349d), e11.b.c(this.f246350e), e11.b.c(this.f246351f), java.lang.Integer.valueOf(this.f246353h), e11.b.c(0L), 0L, 0L, "background"));
        }
        sb6.append("\n");
        return sb6.toString();
    }
}
