package vo1;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public androidx.recyclerview.widget.k3 f438498a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.recyclerview.widget.k3 f438499b;

    /* renamed from: c, reason: collision with root package name */
    public final int f438500c;

    /* renamed from: d, reason: collision with root package name */
    public final int f438501d;

    /* renamed from: e, reason: collision with root package name */
    public final int f438502e;

    /* renamed from: f, reason: collision with root package name */
    public final int f438503f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.l f438504g;

    public c(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2, int i17, int i18, int i19, int i27, jz5.l lVar) {
        this.f438498a = k3Var;
        this.f438499b = k3Var2;
        this.f438500c = i17;
        this.f438501d = i18;
        this.f438502e = i19;
        this.f438503f = i27;
        this.f438504g = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo1.c)) {
            return false;
        }
        vo1.c cVar = (vo1.c) obj;
        return kotlin.jvm.internal.o.b(this.f438498a, cVar.f438498a) && kotlin.jvm.internal.o.b(this.f438499b, cVar.f438499b) && this.f438500c == cVar.f438500c && this.f438501d == cVar.f438501d && this.f438502e == cVar.f438502e && this.f438503f == cVar.f438503f && kotlin.jvm.internal.o.b(this.f438504g, cVar.f438504g);
    }

    public int hashCode() {
        androidx.recyclerview.widget.k3 k3Var = this.f438498a;
        int hashCode = (k3Var == null ? 0 : k3Var.hashCode()) * 31;
        androidx.recyclerview.widget.k3 k3Var2 = this.f438499b;
        int hashCode2 = (((((((((hashCode + (k3Var2 == null ? 0 : k3Var2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f438500c)) * 31) + java.lang.Integer.hashCode(this.f438501d)) * 31) + java.lang.Integer.hashCode(this.f438502e)) * 31) + java.lang.Integer.hashCode(this.f438503f)) * 31;
        jz5.l lVar = this.f438504g;
        return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ChangeInfo(oldHolder=" + this.f438498a + ", newHolder=" + this.f438499b + ", fromX=" + this.f438500c + ", fromY=" + this.f438501d + ", toX=" + this.f438502e + ", toY=" + this.f438503f + ", expandInfo=" + this.f438504g + ')';
    }
}
