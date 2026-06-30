package sc2;

/* loaded from: classes.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final long f406338a;

    /* renamed from: b, reason: collision with root package name */
    public final int f406339b;

    /* renamed from: c, reason: collision with root package name */
    public final int f406340c;

    /* renamed from: d, reason: collision with root package name */
    public final int f406341d;

    public w6(long j17, int i17, int i18, int i19) {
        this.f406338a = j17;
        this.f406339b = i17;
        this.f406340c = i18;
        this.f406341d = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof sc2.w6)) {
            return false;
        }
        sc2.w6 w6Var = (sc2.w6) obj;
        return this.f406338a == w6Var.f406338a && this.f406339b == w6Var.f406339b && this.f406340c == w6Var.f406340c && this.f406341d == w6Var.f406341d;
    }

    public int hashCode() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f406338a);
        sb6.append('_');
        sb6.append(this.f406339b);
        sb6.append('_');
        sb6.append(this.f406340c);
        sb6.append('_');
        sb6.append(this.f406341d);
        return sb6.toString().hashCode();
    }
}
