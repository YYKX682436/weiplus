package ws2;

/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f449025a;

    public d2(boolean z17, boolean z18, boolean z19) {
        this.f449025a = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws2.d2)) {
            return false;
        }
        ws2.d2 d2Var = (ws2.d2) obj;
        d2Var.getClass();
        return this.f449025a == d2Var.f449025a;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(false) * 31) + java.lang.Boolean.hashCode(false)) * 31) + java.lang.Boolean.hashCode(this.f449025a);
    }

    public java.lang.String toString() {
        return "HasToast(first=false, second=false, third=" + this.f449025a + ')';
    }
}
