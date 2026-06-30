package j06;

/* loaded from: classes16.dex */
public final class p extends j06.u implements j06.i {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f297074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.reflect.Field field, java.lang.Object obj) {
        super(field, false, null);
        kotlin.jvm.internal.o.g(field, "field");
        this.f297074e = obj;
    }

    @Override // j06.u, j06.k
    public java.lang.Object call(java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        j06.j.a(this, args);
        return ((java.lang.reflect.Field) this.f297063a).get(this.f297074e);
    }
}
