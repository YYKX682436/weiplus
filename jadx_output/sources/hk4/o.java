package hk4;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f281972a;

    /* renamed from: b, reason: collision with root package name */
    public final int f281973b;

    /* renamed from: c, reason: collision with root package name */
    public final int f281974c;

    public o(int i17, int i18, int i19) {
        this.f281972a = i17;
        this.f281973b = i18;
        this.f281974c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk4.o)) {
            return false;
        }
        hk4.o oVar = (hk4.o) obj;
        return this.f281972a == oVar.f281972a && this.f281973b == oVar.f281973b && this.f281974c == oVar.f281974c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f281972a) * 31) + java.lang.Integer.hashCode(this.f281973b)) * 31) + java.lang.Integer.hashCode(this.f281974c);
    }

    public java.lang.String toString() {
        return "MultiMediaInfo(width=" + this.f281972a + ", height=" + this.f281973b + ", rotate=" + this.f281974c + ')';
    }
}
