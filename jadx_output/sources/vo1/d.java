package vo1;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.k3 f438505a;

    /* renamed from: b, reason: collision with root package name */
    public final int f438506b;

    /* renamed from: c, reason: collision with root package name */
    public final int f438507c;

    /* renamed from: d, reason: collision with root package name */
    public final int f438508d;

    /* renamed from: e, reason: collision with root package name */
    public final int f438509e;

    public d(androidx.recyclerview.widget.k3 holder, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f438505a = holder;
        this.f438506b = i17;
        this.f438507c = i18;
        this.f438508d = i19;
        this.f438509e = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo1.d)) {
            return false;
        }
        vo1.d dVar = (vo1.d) obj;
        return kotlin.jvm.internal.o.b(this.f438505a, dVar.f438505a) && this.f438506b == dVar.f438506b && this.f438507c == dVar.f438507c && this.f438508d == dVar.f438508d && this.f438509e == dVar.f438509e;
    }

    public int hashCode() {
        return (((((((this.f438505a.hashCode() * 31) + java.lang.Integer.hashCode(this.f438506b)) * 31) + java.lang.Integer.hashCode(this.f438507c)) * 31) + java.lang.Integer.hashCode(this.f438508d)) * 31) + java.lang.Integer.hashCode(this.f438509e);
    }

    public java.lang.String toString() {
        return "MoveInfo(holder=" + this.f438505a + ", fromX=" + this.f438506b + ", fromY=" + this.f438507c + ", toX=" + this.f438508d + ", toY=" + this.f438509e + ')';
    }
}
