package zl2;

/* loaded from: classes3.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f474051a;

    /* renamed from: b, reason: collision with root package name */
    public long f474052b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f474053c;

    public z4(java.lang.String stage, long j17, java.util.List children, int i17, kotlin.jvm.internal.i iVar) {
        children = (i17 & 4) != 0 ? new java.util.ArrayList() : children;
        kotlin.jvm.internal.o.g(stage, "stage");
        kotlin.jvm.internal.o.g(children, "children");
        this.f474051a = stage;
        this.f474052b = j17;
        this.f474053c = children;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2.z4)) {
            return false;
        }
        zl2.z4 z4Var = (zl2.z4) obj;
        return kotlin.jvm.internal.o.b(this.f474051a, z4Var.f474051a) && this.f474052b == z4Var.f474052b && kotlin.jvm.internal.o.b(this.f474053c, z4Var.f474053c);
    }

    public int hashCode() {
        return (((this.f474051a.hashCode() * 31) + java.lang.Long.hashCode(this.f474052b)) * 31) + this.f474053c.hashCode();
    }

    public java.lang.String toString() {
        return "TreeNode(stage=" + this.f474051a + ", cost=" + this.f474052b + ", children=" + this.f474053c + ')';
    }
}
