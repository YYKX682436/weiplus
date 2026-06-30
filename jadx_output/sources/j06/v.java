package j06;

/* loaded from: classes16.dex */
public final class v extends j06.a0 implements j06.i {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f297089f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.reflect.Field field, boolean z17, java.lang.Object obj) {
        super(field, z17, false, null);
        kotlin.jvm.internal.o.g(field, "field");
        this.f297089f = obj;
    }

    @Override // j06.a0, j06.k
    public java.lang.Object call(java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        c(args);
        ((java.lang.reflect.Field) this.f297063a).set(this.f297089f, kz5.z.L(args));
        return jz5.f0.f302826a;
    }
}
