package sz3;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f414081a;

    /* renamed from: b, reason: collision with root package name */
    public int f414082b = 100;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f414083c = new java.util.HashSet();

    public final int a() {
        int i17;
        synchronized (java.lang.Integer.valueOf(this.f414081a)) {
            i17 = this.f414081a - 1;
            this.f414081a = i17;
        }
        return i17;
    }

    public final int b() {
        int i17;
        synchronized (java.lang.Integer.valueOf(this.f414082b)) {
            i17 = this.f414082b + 1;
            this.f414082b = i17;
        }
        return i17;
    }
}
