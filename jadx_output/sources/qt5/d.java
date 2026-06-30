package qt5;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f366677a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f366678b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Throwable f366679c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f366680d;

    public d(int i17, java.lang.String errMsg, java.lang.Throwable th6) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f366677a = i17;
        this.f366678b = errMsg;
        this.f366679c = th6;
    }

    public final java.lang.String a() {
        java.lang.Throwable th6;
        if (this.f366677a == 0 || (th6 = this.f366679c) == null) {
            return "";
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th6.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.o.f(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt5.d)) {
            return false;
        }
        qt5.d dVar = (qt5.d) obj;
        return this.f366677a == dVar.f366677a && kotlin.jvm.internal.o.b(this.f366678b, dVar.f366678b) && kotlin.jvm.internal.o.b(this.f366679c, dVar.f366679c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f366677a) * 31) + this.f366678b.hashCode()) * 31;
        java.lang.Throwable th6 = this.f366679c;
        return hashCode + (th6 == null ? 0 : th6.hashCode());
    }

    public java.lang.String toString() {
        return "CameraErrorInfo(errCode=" + this.f366677a + ", errMsg=" + this.f366678b + ", err=" + this.f366679c + ')';
    }
}
