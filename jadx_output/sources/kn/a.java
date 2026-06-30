package kn;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Calendar f309370a;

    /* renamed from: b, reason: collision with root package name */
    public int f309371b;

    /* renamed from: c, reason: collision with root package name */
    public int f309372c;

    /* renamed from: d, reason: collision with root package name */
    public int f309373d;

    /* renamed from: e, reason: collision with root package name */
    public long f309374e;

    /* renamed from: f, reason: collision with root package name */
    public long f309375f;

    public a(int i17, int i18, int i19) {
        this.f309373d = i17;
        this.f309372c = i18;
        this.f309371b = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof kn.a) {
            kn.a aVar = (kn.a) obj;
            if (aVar.f309371b == this.f309371b && aVar.f309372c == this.f309372c && aVar.f309373d == this.f309373d) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        return "{ year: " + this.f309373d + ", month: " + this.f309372c + ", day: " + this.f309371b + " }";
    }

    public a(long j17) {
        this.f309374e = j17;
        if (this.f309370a == null) {
            this.f309370a = java.util.Calendar.getInstance();
        }
        this.f309370a.setTimeInMillis(j17);
        this.f309372c = this.f309370a.get(2);
        this.f309373d = this.f309370a.get(1);
        this.f309371b = this.f309370a.get(5);
    }
}
