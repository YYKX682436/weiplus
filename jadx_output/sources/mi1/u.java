package mi1;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.v f326694d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(mi1.v vVar) {
        super(1);
        this.f326694d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cf.m lifecycle = (cf.m) obj;
        kotlin.jvm.internal.o.g(lifecycle, "$this$lifecycle");
        mi1.v vVar = this.f326694d;
        lifecycle.a(new mi1.r(vVar));
        mi1.s sVar = new mi1.s(vVar);
        lifecycle.f40828e.put(u81.b.FOREGROUND, sVar);
        lifecycle.b(new mi1.t(vVar));
        return jz5.f0.f302826a;
    }
}
