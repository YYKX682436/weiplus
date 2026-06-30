package p05;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f350615a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f350616b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f350617c;

    public m0(int i17, java.lang.String giftImgPath, java.lang.String luaResPath) {
        kotlin.jvm.internal.o.g(giftImgPath, "giftImgPath");
        kotlin.jvm.internal.o.g(luaResPath, "luaResPath");
        this.f350615a = i17;
        this.f350616b = giftImgPath;
        this.f350617c = luaResPath;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05.m0)) {
            return false;
        }
        p05.m0 m0Var = (p05.m0) obj;
        return this.f350615a == m0Var.f350615a && kotlin.jvm.internal.o.b(this.f350616b, m0Var.f350616b) && kotlin.jvm.internal.o.b(this.f350617c, m0Var.f350617c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f350615a) * 31) + this.f350616b.hashCode()) * 31) + this.f350617c.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cnt = ");
        sb6.append(this.f350615a);
        sb6.append(", giftImgPath = ");
        sb6.append(this.f350616b);
        sb6.append(", giftImgExist = ");
        java.lang.String str = this.f350617c;
        sb6.append(com.tencent.mm.vfs.w6.j(str));
        sb6.append(", luaResPath = ");
        sb6.append(str);
        sb6.append(", luaFileExist = ");
        sb6.append(com.tencent.mm.vfs.w6.j(str));
        return sb6.toString();
    }
}
