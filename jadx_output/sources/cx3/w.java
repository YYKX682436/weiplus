package cx3;

/* loaded from: classes15.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSevFragment f224577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSevFragment demoSevFragment) {
        super(0);
        this.f224577d = demoSevFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int d17 = c06.e.f37716d.d(10) + 3;
        com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSevFragment demoSevFragment = this.f224577d;
        demoSevFragment.j0(d17);
        if (d17 < 9) {
            demoSevFragment.m0().k();
        } else {
            demoSevFragment.m0().i(true);
        }
        return jz5.f0.f302826a;
    }
}
