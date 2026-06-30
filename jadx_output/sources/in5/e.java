package in5;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f293022a;

    /* renamed from: b, reason: collision with root package name */
    public long f293023b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f293024c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f293025d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f293026e = -1;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f293027f;

    public e(java.lang.Object obj) {
        this.f293022a = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof in5.e)) {
            return false;
        }
        if (this != obj) {
            java.lang.Object obj2 = this.f293022a;
            int hashCode = obj2 != null ? obj2.hashCode() : 0;
            java.lang.Object obj3 = ((in5.e) obj).f293022a;
            if (hashCode != (obj3 != null ? obj3.hashCode() : 0)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        java.lang.Object obj = this.f293022a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n");
        sb6.append("adapterPosition = " + this.f293026e);
        sb6.append("\n");
        sb6.append("exposeTime = " + this.f293025d);
        sb6.append("\n");
        sb6.append("startTime = " + this.f293023b);
        sb6.append("\n");
        sb6.append("endTime = " + this.f293024c);
        sb6.append("\n");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
