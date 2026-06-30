package ry2;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f401384a;

    /* renamed from: b, reason: collision with root package name */
    public final int f401385b;

    /* renamed from: c, reason: collision with root package name */
    public final int f401386c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f401387d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.q f401388e;

    public f(int i17, int i18, int i19, yz5.a aVar, yz5.q qVar, int i27, kotlin.jvm.internal.i iVar) {
        i18 = (i27 & 2) != 0 ? 0 : i18;
        i19 = (i27 & 4) != 0 ? 0 : i19;
        aVar = (i27 & 8) != 0 ? null : aVar;
        qVar = (i27 & 16) != 0 ? null : qVar;
        this.f401384a = i17;
        this.f401385b = i18;
        this.f401386c = i19;
        this.f401387d = aVar;
        this.f401388e = qVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry2.f)) {
            return false;
        }
        ry2.f fVar = (ry2.f) obj;
        return this.f401384a == fVar.f401384a && this.f401385b == fVar.f401385b && this.f401386c == fVar.f401386c && kotlin.jvm.internal.o.b(this.f401387d, fVar.f401387d) && kotlin.jvm.internal.o.b(this.f401388e, fVar.f401388e);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f401384a) * 31) + java.lang.Integer.hashCode(this.f401385b)) * 31) + java.lang.Integer.hashCode(this.f401386c)) * 31;
        yz5.a aVar = this.f401387d;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        yz5.q qVar = this.f401388e;
        return hashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MenuData(menuId=" + this.f401384a + ", colorResId=" + this.f401385b + ", titleResId=" + this.f401386c + ", onClick=" + this.f401387d + ", onMenuGetView=" + this.f401388e + ')';
    }
}
