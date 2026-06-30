package cx3;

/* loaded from: classes15.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSevFragment f224576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSevFragment demoSevFragment) {
        super(0);
        this.f224576d = demoSevFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int d17 = c06.e.f37716d.d(10) + 3;
        com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSevFragment demoSevFragment = this.f224576d;
        demoSevFragment.p0();
        if (d17 < 10) {
            demoSevFragment.m0().f();
        } else {
            demoSevFragment.m0().e(true);
        }
        return jz5.f0.f302826a;
    }
}
