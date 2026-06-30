package rh;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f395414a;

    /* renamed from: b, reason: collision with root package name */
    public final long f395415b;

    /* renamed from: c, reason: collision with root package name */
    public final long f395416c;

    /* renamed from: d, reason: collision with root package name */
    public final long f395417d;

    /* renamed from: e, reason: collision with root package name */
    public final int f395418e;

    /* renamed from: f, reason: collision with root package name */
    public final long f395419f = java.lang.System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f395420g;

    public i(int i17, long j17, long j18, long j19, int i18, java.lang.String str) {
        this.f395414a = i17;
        this.f395415b = j17;
        this.f395416c = j18;
        this.f395417d = j19;
        this.f395418e = i18;
        this.f395420g = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rh.i.class == obj.getClass() && hashCode() == ((rh.i) obj).hashCode();
    }

    public java.lang.String toString() {
        return "AlarmRecord{type=" + this.f395414a + ", triggerAtMillis=" + this.f395415b + ", windowMillis=" + this.f395416c + ", intervalMillis=" + this.f395417d + ", flag=" + this.f395418e + ", timeBgn=" + this.f395419f + ", stack='" + this.f395420g + "'}";
    }
}
