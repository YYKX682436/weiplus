package f93;

/* loaded from: classes3.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public int f260305a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f260306b;

    /* renamed from: c, reason: collision with root package name */
    public final f93.r5 f260307c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f260308d;

    public c5(int i17, java.lang.String str, f93.r5 r5Var, com.tencent.mm.storage.z3 z3Var, int i18, kotlin.jvm.internal.i iVar) {
        str = (i18 & 2) != 0 ? null : str;
        r5Var = (i18 & 4) != 0 ? null : r5Var;
        z3Var = (i18 & 8) != 0 ? null : z3Var;
        this.f260305a = i17;
        this.f260306b = str;
        this.f260307c = r5Var;
        this.f260308d = z3Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f93.c5)) {
            return false;
        }
        f93.c5 c5Var = (f93.c5) obj;
        return this.f260305a == c5Var.f260305a && kotlin.jvm.internal.o.b(this.f260306b, c5Var.f260306b) && kotlin.jvm.internal.o.b(this.f260307c, c5Var.f260307c) && kotlin.jvm.internal.o.b(this.f260308d, c5Var.f260308d);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f260305a) * 31;
        java.lang.String str = this.f260306b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        f93.r5 r5Var = this.f260307c;
        int hashCode3 = (hashCode2 + (r5Var == null ? 0 : r5Var.hashCode())) * 31;
        com.tencent.mm.storage.z3 z3Var = this.f260308d;
        return hashCode3 + (z3Var != null ? z3Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ItemInfo(type=" + this.f260305a + ", title=" + this.f260306b + ", label=" + this.f260307c + ", contact=" + this.f260308d + ')';
    }
}
