package in5;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final in5.c f293070a;

    /* renamed from: b, reason: collision with root package name */
    public long f293071b;

    /* renamed from: c, reason: collision with root package name */
    public long f293072c;

    /* renamed from: d, reason: collision with root package name */
    public long f293073d;

    /* renamed from: e, reason: collision with root package name */
    public int f293074e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f293075f;

    public j(in5.c associatedObject) {
        kotlin.jvm.internal.o.g(associatedObject, "associatedObject");
        this.f293070a = associatedObject;
        this.f293071b = -1L;
        this.f293072c = -1L;
        this.f293073d = -1L;
        this.f293074e = -1;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof in5.j) {
            return this == obj || this.f293070a.getItemId() == ((in5.j) obj).f293070a.getItemId();
        }
        return false;
    }

    public int hashCode() {
        return (int) this.f293070a.getItemId();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n");
        sb6.append("adapterPosition = " + this.f293074e);
        sb6.append("\n");
        sb6.append("exposeTime = " + this.f293073d);
        sb6.append("\n");
        sb6.append("startTime = " + this.f293071b);
        sb6.append("\n");
        sb6.append("endTime = " + this.f293072c);
        sb6.append("\n");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
