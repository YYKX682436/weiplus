package te2;

/* loaded from: classes3.dex */
public final class z3 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.v62 f418556a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f418557b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f418558c;

    /* renamed from: d, reason: collision with root package name */
    public final te2.v3 f418559d;

    public z3(r45.v62 originData) {
        kotlin.jvm.internal.o.g(originData, "originData");
        this.f418556a = originData;
        java.lang.String string = originData.getString(0);
        this.f418557b = string == null ? "" : string;
        java.lang.String string2 = originData.getString(4);
        this.f418558c = string2 != null ? string2 : "";
        this.f418559d = te2.v3.f418491d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te2.z3) && kotlin.jvm.internal.o.b(this.f418556a, ((te2.z3) obj).f418556a);
    }

    public int hashCode() {
        return this.f418556a.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("id = " + this.f418557b);
        sb6.append(", ");
        sb6.append("micId = " + this.f418558c);
        sb6.append(", ");
        sb6.append("state = " + this.f418559d);
        sb6.append("\n");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
