package t16;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n16.b f414611a;

    /* renamed from: b, reason: collision with root package name */
    public final int f414612b;

    public f(n16.b classId, int i17) {
        kotlin.jvm.internal.o.g(classId, "classId");
        this.f414611a = classId;
        this.f414612b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t16.f)) {
            return false;
        }
        t16.f fVar = (t16.f) obj;
        return kotlin.jvm.internal.o.b(this.f414611a, fVar.f414611a) && this.f414612b == fVar.f414612b;
    }

    public int hashCode() {
        return (this.f414611a.hashCode() * 31) + java.lang.Integer.hashCode(this.f414612b);
    }

    public java.lang.String toString() {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i18 = 0;
        while (true) {
            i17 = this.f414612b;
            if (i18 >= i17) {
                break;
            }
            sb6.append("kotlin/Array<");
            i18++;
        }
        sb6.append(this.f414611a);
        for (int i19 = 0; i19 < i17; i19++) {
            sb6.append(">");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
