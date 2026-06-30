package t00;

/* loaded from: classes9.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f414315a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f414316b;

    /* renamed from: c, reason: collision with root package name */
    public final int f414317c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f414318d;

    public m0(boolean z17, boolean z18, int i17, java.util.ArrayList arrayList) {
        this.f414315a = z17;
        this.f414316b = z18;
        this.f414317c = i17;
        this.f414318d = arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t00.m0)) {
            return false;
        }
        t00.m0 m0Var = (t00.m0) obj;
        return this.f414315a == m0Var.f414315a && this.f414316b == m0Var.f414316b && this.f414317c == m0Var.f414317c && kotlin.jvm.internal.o.b(this.f414318d, m0Var.f414318d);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Boolean.hashCode(this.f414315a) * 31) + java.lang.Boolean.hashCode(this.f414316b)) * 31) + java.lang.Integer.hashCode(this.f414317c)) * 31;
        java.util.ArrayList arrayList = this.f414318d;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public java.lang.String toString() {
        return "EcsGetPreloadDataParseModel(isValid=" + this.f414315a + ", isAsync=" + this.f414316b + ", timeoutMS=" + this.f414317c + ", keys=" + this.f414318d + ')';
    }

    public /* synthetic */ m0(boolean z17, boolean z18, int i17, java.util.ArrayList arrayList, int i18, kotlin.jvm.internal.i iVar) {
        this(z17, z18, i17, (i18 & 8) != 0 ? null : arrayList);
    }
}
