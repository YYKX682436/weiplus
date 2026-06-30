package p1;

/* loaded from: classes14.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final long f350909a;

    /* renamed from: b, reason: collision with root package name */
    public final long f350910b;

    /* renamed from: c, reason: collision with root package name */
    public final long f350911c;

    /* renamed from: d, reason: collision with root package name */
    public final long f350912d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f350913e;

    /* renamed from: f, reason: collision with root package name */
    public final int f350914f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f350915g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f350916h;

    /* renamed from: i, reason: collision with root package name */
    public final long f350917i;

    public w(long j17, long j18, long j19, long j27, boolean z17, int i17, boolean z18, java.util.List list, long j28, kotlin.jvm.internal.i iVar) {
        this.f350909a = j17;
        this.f350910b = j18;
        this.f350911c = j19;
        this.f350912d = j27;
        this.f350913e = z17;
        this.f350914f = i17;
        this.f350915g = z18;
        this.f350916h = list;
        this.f350917i = j28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1.w)) {
            return false;
        }
        p1.w wVar = (p1.w) obj;
        if (p1.r.a(this.f350909a, wVar.f350909a) && this.f350910b == wVar.f350910b && d1.e.a(this.f350911c, wVar.f350911c) && d1.e.a(this.f350912d, wVar.f350912d) && this.f350913e == wVar.f350913e) {
            return (this.f350914f == wVar.f350914f) && this.f350915g == wVar.f350915g && kotlin.jvm.internal.o.b(this.f350916h, wVar.f350916h) && d1.e.a(this.f350917i, wVar.f350917i);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((java.lang.Long.hashCode(this.f350909a) * 31) + java.lang.Long.hashCode(this.f350910b)) * 31;
        int i17 = d1.e.f225626e;
        int hashCode2 = (((hashCode + java.lang.Long.hashCode(this.f350911c)) * 31) + java.lang.Long.hashCode(this.f350912d)) * 31;
        boolean z17 = this.f350913e;
        int i18 = z17;
        if (z17 != 0) {
            i18 = 1;
        }
        int hashCode3 = (((hashCode2 + i18) * 31) + java.lang.Integer.hashCode(this.f350914f)) * 31;
        boolean z18 = this.f350915g;
        return ((((hashCode3 + (z18 ? 1 : z18 ? 1 : 0)) * 31) + this.f350916h.hashCode()) * 31) + java.lang.Long.hashCode(this.f350917i);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PointerInputEventData(id=");
        sb6.append((java.lang.Object) p1.r.b(this.f350909a));
        sb6.append(", uptime=");
        sb6.append(this.f350910b);
        sb6.append(", positionOnScreen=");
        sb6.append((java.lang.Object) d1.e.h(this.f350911c));
        sb6.append(", position=");
        sb6.append((java.lang.Object) d1.e.h(this.f350912d));
        sb6.append(", down=");
        sb6.append(this.f350913e);
        sb6.append(", type=");
        int i17 = this.f350914f;
        sb6.append((java.lang.Object) (i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb6.append(", issuesEnterExit=");
        sb6.append(this.f350915g);
        sb6.append(", historical=");
        sb6.append(this.f350916h);
        sb6.append(", scrollDelta=");
        sb6.append((java.lang.Object) d1.e.h(this.f350917i));
        sb6.append(')');
        return sb6.toString();
    }
}
