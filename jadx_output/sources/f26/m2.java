package f26;

/* loaded from: classes15.dex */
public abstract class m2 implements f26.l2 {
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f26.l2)) {
            return false;
        }
        f26.l2 l2Var = (f26.l2) obj;
        return b() == l2Var.b() && c() == l2Var.c() && getType().equals(l2Var.getType());
    }

    public int hashCode() {
        int hashCode = c().hashCode();
        if (f26.z2.o(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (b() ? 17 : getType().hashCode());
    }

    public java.lang.String toString() {
        if (b()) {
            return "*";
        }
        if (c() == f26.d3.f259143f) {
            return getType().toString();
        }
        return c() + " " + getType();
    }
}
