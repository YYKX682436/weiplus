package qb2;

/* loaded from: classes8.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f361318a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f361319b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.modelbase.p0 f361320c;

    /* renamed from: d, reason: collision with root package name */
    public final int f361321d;

    public z0(java.lang.String str, java.util.Map values, com.tencent.mm.modelbase.p0 p0Var, int i17) {
        kotlin.jvm.internal.o.g(values, "values");
        this.f361318a = str;
        this.f361319b = values;
        this.f361320c = p0Var;
        this.f361321d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb2.z0)) {
            return false;
        }
        qb2.z0 z0Var = (qb2.z0) obj;
        return kotlin.jvm.internal.o.b(this.f361318a, z0Var.f361318a) && kotlin.jvm.internal.o.b(this.f361319b, z0Var.f361319b) && kotlin.jvm.internal.o.b(this.f361320c, z0Var.f361320c) && this.f361321d == z0Var.f361321d;
    }

    public int hashCode() {
        java.lang.String str = this.f361318a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f361319b.hashCode()) * 31;
        com.tencent.mm.modelbase.p0 p0Var = this.f361320c;
        return ((hashCode + (p0Var != null ? p0Var.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f361321d);
    }

    public java.lang.String toString() {
        return "ConsumeNewXmlData(subType=" + this.f361318a + ", values=" + this.f361319b + ", addMsgInfo=" + this.f361320c + ", pendingReason=" + this.f361321d + ')';
    }
}
