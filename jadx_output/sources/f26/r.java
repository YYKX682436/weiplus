package f26;

/* loaded from: classes15.dex */
public abstract class r implements f26.c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f259213a;

    public abstract boolean b(o06.j jVar);

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f26.c2) || obj.hashCode() != hashCode()) {
            return false;
        }
        f26.c2 c2Var = (f26.c2) obj;
        if (c2Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        o06.j i17 = i();
        o06.j i18 = c2Var.i();
        if (i18 == null) {
            return false;
        }
        if ((h26.m.f(i17) || r16.i.p(i17)) ? false : true) {
            if ((h26.m.f(i18) || r16.i.p(i18)) ? false : true) {
                return b(i18);
            }
        }
        return false;
    }

    public int hashCode() {
        int i17 = this.f259213a;
        if (i17 != 0) {
            return i17;
        }
        o06.j i18 = i();
        int hashCode = !h26.m.f(i18) && !r16.i.p(i18) ? r16.i.g(i18).hashCode() : java.lang.System.identityHashCode(this);
        this.f259213a = hashCode;
        return hashCode;
    }
}
