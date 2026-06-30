package lr;

/* loaded from: classes15.dex */
public final class q extends lr.y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lr.u f320575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(lr.u uVar, lr.z zVar) {
        super(zVar);
        this.f320575b = uVar;
    }

    @Override // ir.d0
    public void b(ir.k0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String c17 = data.p().c();
        lr.u uVar = this.f320575b;
        if (c17 != null) {
            lr.z zVar = uVar.f320587g;
            zVar.getClass();
            com.tencent.mars.xlog.Log.i(zVar.f320618e, "smiley_log setCustomType ".concat(c17));
            if (kotlin.jvm.internal.o.b(c17, "custom")) {
                zVar.f320621h = true;
            } else if (kotlin.jvm.internal.o.b(c17, "smiley")) {
                zVar.f320622i = true;
            }
        }
        this.f320612a.E(data.b());
        uVar.i();
    }
}
