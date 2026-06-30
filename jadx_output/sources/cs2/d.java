package cs2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f222063a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f222064b;

    /* renamed from: c, reason: collision with root package name */
    public final int f222065c;

    public d(boolean z17, boolean z18, int i17) {
        this.f222063a = z17;
        this.f222064b = z18;
        this.f222065c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs2.d)) {
            return false;
        }
        cs2.d dVar = (cs2.d) obj;
        return this.f222063a == dVar.f222063a && this.f222064b == dVar.f222064b && this.f222065c == dVar.f222065c;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f222063a) * 31) + java.lang.Boolean.hashCode(this.f222064b)) * 31) + java.lang.Integer.hashCode(this.f222065c);
    }

    public java.lang.String toString() {
        return "FirstBufferingConfig(onEnterPreload=" + this.f222063a + ", onFetchDonePreload=" + this.f222064b + ", preloadStage=" + this.f222065c + ')';
    }
}
