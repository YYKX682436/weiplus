package dw2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final so2.j5 f244114a;

    /* renamed from: b, reason: collision with root package name */
    public final in5.s0 f244115b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f244116c;

    public d(so2.j5 j5Var, in5.s0 s0Var) {
        this.f244114a = j5Var;
        this.f244115b = s0Var;
        this.f244116c = new java.util.LinkedList();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw2.d)) {
            return false;
        }
        dw2.d dVar = (dw2.d) obj;
        return kotlin.jvm.internal.o.b(this.f244114a, dVar.f244114a) && kotlin.jvm.internal.o.b(this.f244115b, dVar.f244115b);
    }

    public int hashCode() {
        so2.j5 j5Var = this.f244114a;
        int hashCode = (j5Var == null ? 0 : j5Var.hashCode()) * 31;
        in5.s0 s0Var = this.f244115b;
        return hashCode + (s0Var != null ? s0Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VisibilityFeed:");
        int i17 = 0;
        for (java.lang.Object obj : this.f244116c) {
            int i18 = i17 + 1;
            java.lang.Integer num = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append("[index:" + i17);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("type:");
            so2.j5 j5Var = ((dw2.d) obj).f244114a;
            if (j5Var != null) {
                num = java.lang.Integer.valueOf(j5Var.h());
            }
            sb7.append(num);
            sb7.append(']');
            sb6.append(sb7.toString());
            i17 = i18;
        }
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        return sb8;
    }

    public /* synthetic */ d(so2.j5 j5Var, in5.s0 s0Var, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : j5Var, (i17 & 2) != 0 ? null : s0Var);
    }
}
