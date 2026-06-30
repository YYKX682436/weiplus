package j06;

/* loaded from: classes16.dex */
public final class l0 extends j06.n0 implements j06.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f297068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(java.lang.reflect.Method unboxMethod, java.lang.Object obj) {
        super(unboxMethod, kz5.p0.f313996d, null);
        kotlin.jvm.internal.o.g(unboxMethod, "unboxMethod");
        this.f297068d = obj;
    }

    @Override // j06.k
    public java.lang.Object call(java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        j06.j.a(this, args);
        return this.f297070a.invoke(this.f297068d, java.util.Arrays.copyOf(args, args.length));
    }
}
