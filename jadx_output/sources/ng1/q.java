package ng1;

/* loaded from: classes7.dex */
public final class q extends ng1.r {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle f336948a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle permission) {
        super(null);
        kotlin.jvm.internal.o.g(permission, "permission");
        this.f336948a = permission;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng1.q) && kotlin.jvm.internal.o.b(this.f336948a, ((ng1.q) obj).f336948a);
    }

    public int hashCode() {
        return this.f336948a.hashCode();
    }

    public java.lang.String toString() {
        return "Succeed(permission=" + this.f336948a + ')';
    }
}
