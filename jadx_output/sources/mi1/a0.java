package mi1;

/* loaded from: classes7.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.b0 f326507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(mi1.b0 b0Var) {
        super(1);
        this.f326507d = b0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cf.m lifecycle = (cf.m) obj;
        kotlin.jvm.internal.o.g(lifecycle, "$this$lifecycle");
        lifecycle.a(new mi1.y(this.f326507d));
        mi1.z zVar = mi1.z.f326738d;
        lifecycle.f40828e.put(u81.b.FOREGROUND, zVar);
        return jz5.f0.f302826a;
    }
}
