package uw0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.o f431570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.a f431571e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(uw0.o oVar, uw0.a aVar) {
        super(0);
        this.f431570d = oVar;
        this.f431571e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f431570d.F7().X6() && this.f431571e.getSelectedTabPage() == ov0.e.f349125e) {
            uw0.o oVar = this.f431570d;
            pf5.e.launchUI$default(oVar, null, null, new uw0.i(oVar, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
