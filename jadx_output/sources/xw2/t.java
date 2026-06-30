package xw2;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f457724a;

    /* renamed from: b, reason: collision with root package name */
    public final int f457725b;

    /* renamed from: c, reason: collision with root package name */
    public final int f457726c;

    public t(int i17, int i18, int i19) {
        this.f457724a = i17;
        this.f457725b = i18;
        this.f457726c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw2.t)) {
            return false;
        }
        xw2.t tVar = (xw2.t) obj;
        return this.f457724a == tVar.f457724a && this.f457725b == tVar.f457725b && this.f457726c == tVar.f457726c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f457724a) * 31) + java.lang.Integer.hashCode(this.f457725b)) * 31) + java.lang.Integer.hashCode(this.f457726c);
    }

    public java.lang.String toString() {
        return "RecyclerViewState(totalItemCount=" + this.f457724a + ", lastVisibleItemPosition=" + this.f457725b + ", curGroupCount=" + this.f457726c + ')';
    }
}
