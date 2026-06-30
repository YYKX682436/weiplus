package hk0;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f281782a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f281783b;

    public o(int i17, boolean z17) {
        this.f281782a = i17;
        this.f281783b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.o)) {
            return false;
        }
        hk0.o oVar = (hk0.o) obj;
        return this.f281782a == oVar.f281782a && this.f281783b == oVar.f281783b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f281782a) * 31) + java.lang.Boolean.hashCode(this.f281783b);
    }

    public java.lang.String toString() {
        return "FuncState(funcType=" + this.f281782a + ", isSelect=" + this.f281783b + ')';
    }
}
