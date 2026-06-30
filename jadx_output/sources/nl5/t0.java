package nl5;

/* loaded from: classes14.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f338377a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f338378b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f338379c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f338380d;

    public t0(java.lang.String idName, java.lang.String idPackage, java.lang.String titleName, java.lang.String titlePackage) {
        kotlin.jvm.internal.o.g(idName, "idName");
        kotlin.jvm.internal.o.g(idPackage, "idPackage");
        kotlin.jvm.internal.o.g(titleName, "titleName");
        kotlin.jvm.internal.o.g(titlePackage, "titlePackage");
        this.f338377a = idName;
        this.f338378b = idPackage;
        this.f338379c = titleName;
        this.f338380d = titlePackage;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl5.t0)) {
            return false;
        }
        nl5.t0 t0Var = (nl5.t0) obj;
        return kotlin.jvm.internal.o.b(this.f338377a, t0Var.f338377a) && kotlin.jvm.internal.o.b(this.f338378b, t0Var.f338378b) && kotlin.jvm.internal.o.b(this.f338379c, t0Var.f338379c) && kotlin.jvm.internal.o.b(this.f338380d, t0Var.f338380d);
    }

    public int hashCode() {
        return (((((this.f338377a.hashCode() * 31) + this.f338378b.hashCode()) * 31) + this.f338379c.hashCode()) * 31) + this.f338380d.hashCode();
    }

    public java.lang.String toString() {
        return "SysMenuConfigItem(idName=" + this.f338377a + ", idPackage=" + this.f338378b + ", titleName=" + this.f338379c + ", titlePackage=" + this.f338380d + ')';
    }
}
