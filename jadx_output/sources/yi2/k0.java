package yi2;

/* loaded from: classes10.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.l0 f462541d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(yi2.l0 l0Var) {
        super(0);
        this.f462541d = l0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yi2.l0 l0Var = this.f462541d;
        dk2.u4 u4Var = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) l0Var.f462544b).a().a(mm2.o4.class)).Z;
        java.lang.Integer valueOf = u4Var != null ? java.lang.Integer.valueOf(u4Var.f234158e) : null;
        if (valueOf != null && valueOf.intValue() == 6) {
            l0Var.h();
        }
        return jz5.f0.f302826a;
    }
}
