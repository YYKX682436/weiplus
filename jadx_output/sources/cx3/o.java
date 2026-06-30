package cx3;

/* loaded from: classes15.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment f224570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment demoNineFragment) {
        super(0);
        this.f224570d = demoNineFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment demoNineFragment = this.f224570d;
        demoNineFragment.p0();
        com.tencent.mm.view.refreshLayout.horizontal.WxHRefreshLayout wxHRefreshLayout = demoNineFragment.f158091i;
        if (wxHRefreshLayout != null) {
            wxHRefreshLayout.e(true);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("hRefreshLayout");
        throw null;
    }
}
