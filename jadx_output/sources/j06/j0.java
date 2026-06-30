package j06;

/* loaded from: classes16.dex */
public abstract class j0 implements j06.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Member f297063a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Type f297064b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class f297065c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f297066d;

    public j0(java.lang.reflect.Member member, java.lang.reflect.Type type, java.lang.Class cls, java.lang.reflect.Type[] typeArr, kotlin.jvm.internal.i iVar) {
        java.util.List z07;
        this.f297063a = member;
        this.f297064b = type;
        this.f297065c = cls;
        if (cls != null) {
            kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0(2);
            l0Var.a(cls);
            l0Var.b(typeArr);
            z07 = kz5.c0.i(l0Var.d(new java.lang.reflect.Type[l0Var.c()]));
        } else {
            z07 = kz5.z.z0(typeArr);
        }
        this.f297066d = z07;
    }

    @Override // j06.k
    public java.util.List a() {
        return this.f297066d;
    }

    @Override // j06.k
    public final java.lang.reflect.Member b() {
        return this.f297063a;
    }

    public void c(java.lang.Object[] objArr) {
        j06.j.a(this, objArr);
    }

    public final void d(java.lang.Object obj) {
        if (obj == null || !this.f297063a.getDeclaringClass().isInstance(obj)) {
            throw new java.lang.IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // j06.k
    public final java.lang.reflect.Type getReturnType() {
        return this.f297064b;
    }
}
