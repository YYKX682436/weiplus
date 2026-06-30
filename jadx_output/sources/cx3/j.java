package cx3;

/* loaded from: classes15.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFourFragment f224564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFourFragment demoFourFragment) {
        super(0);
        this.f224564d = demoFourFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFourFragment demoFourFragment = this.f224564d;
        if (((java.util.ArrayList) demoFourFragment.f158077d).size() > 30) {
            demoFourFragment.m0().f();
            bx3.a aVar = demoFourFragment.f158086g;
            if (aVar == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            aVar.notifyDataSetChanged();
        } else {
            demoFourFragment.p0();
            demoFourFragment.m0().e(true);
        }
        return jz5.f0.f302826a;
    }
}
