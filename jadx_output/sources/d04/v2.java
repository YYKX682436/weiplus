package d04;

/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f225528a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f225529b;

    public v2(int i17, java.lang.String scanTabTitle) {
        kotlin.jvm.internal.o.g(scanTabTitle, "scanTabTitle");
        this.f225528a = i17;
        this.f225529b = scanTabTitle;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d04.v2)) {
            return false;
        }
        d04.v2 v2Var = (d04.v2) obj;
        return this.f225528a == v2Var.f225528a && kotlin.jvm.internal.o.b(this.f225529b, v2Var.f225529b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f225528a) * 31) + this.f225529b.hashCode();
    }

    public java.lang.String toString() {
        return "ScanTabInfo(scanTabId=" + this.f225528a + ", scanTabTitle=" + this.f225529b + ')';
    }
}
