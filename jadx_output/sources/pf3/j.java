package pf3;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f353831a;

    /* renamed from: b, reason: collision with root package name */
    public final int f353832b;

    public j(int i17, int i18, int i19, int i27) {
        this.f353831a = i18;
        this.f353832b = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf3.j)) {
            return false;
        }
        pf3.j jVar = (pf3.j) obj;
        jVar.getClass();
        return this.f353831a == jVar.f353831a && this.f353832b == jVar.f353832b;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(0) * 31) + java.lang.Integer.hashCode(this.f353831a)) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Integer.hashCode(this.f353832b);
    }

    public java.lang.String toString() {
        return "HitExpand(left=0, top=" + this.f353831a + ", right=0, bottom=" + this.f353832b + ')';
    }
}
