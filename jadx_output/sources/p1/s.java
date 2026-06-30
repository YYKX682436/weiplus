package p1;

/* loaded from: classes14.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final long f350879a;

    /* renamed from: b, reason: collision with root package name */
    public final long f350880b;

    /* renamed from: c, reason: collision with root package name */
    public final long f350881c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f350882d;

    /* renamed from: e, reason: collision with root package name */
    public final long f350883e;

    /* renamed from: f, reason: collision with root package name */
    public final long f350884f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f350885g;

    /* renamed from: h, reason: collision with root package name */
    public final int f350886h;

    /* renamed from: i, reason: collision with root package name */
    public final long f350887i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f350888j;

    /* renamed from: k, reason: collision with root package name */
    public p1.d f350889k;

    public s(long j17, long j18, long j19, boolean z17, long j27, long j28, boolean z18, boolean z19, int i17, long j29, kotlin.jvm.internal.i iVar) {
        this.f350879a = j17;
        this.f350880b = j18;
        this.f350881c = j19;
        this.f350882d = z17;
        this.f350883e = j27;
        this.f350884f = j28;
        this.f350885g = z18;
        this.f350886h = i17;
        this.f350887i = j29;
        this.f350889k = new p1.d(z19, z19);
    }

    public final void a() {
        p1.d dVar = this.f350889k;
        dVar.f350807b = true;
        dVar.f350806a = true;
    }

    public final boolean b() {
        p1.d dVar = this.f350889k;
        return dVar.f350807b || dVar.f350806a;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PointerInputChange(id=");
        sb6.append((java.lang.Object) p1.r.b(this.f350879a));
        sb6.append(", uptimeMillis=");
        sb6.append(this.f350880b);
        sb6.append(", position=");
        sb6.append((java.lang.Object) d1.e.h(this.f350881c));
        sb6.append(", pressed=");
        sb6.append(this.f350882d);
        sb6.append(", previousUptimeMillis=");
        sb6.append(this.f350883e);
        sb6.append(", previousPosition=");
        sb6.append((java.lang.Object) d1.e.h(this.f350884f));
        sb6.append(", previousPressed=");
        sb6.append(this.f350885g);
        sb6.append(", isConsumed=");
        sb6.append(b());
        sb6.append(", type=");
        int i17 = this.f350886h;
        sb6.append((java.lang.Object) (i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb6.append(", historical=");
        java.lang.Object obj = this.f350888j;
        if (obj == null) {
            obj = kz5.p0.f313996d;
        }
        sb6.append(obj);
        sb6.append(",scrollDelta=");
        sb6.append((java.lang.Object) d1.e.h(this.f350887i));
        sb6.append(')');
        return sb6.toString();
    }

    public s(long j17, long j18, long j19, boolean z17, long j27, long j28, boolean z18, boolean z19, int i17, java.util.List list, long j29, kotlin.jvm.internal.i iVar) {
        this(j17, j18, j19, z17, j27, j28, z18, z19, i17, j29, null);
        this.f350888j = list;
    }
}
