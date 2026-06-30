package cx3;

/* loaded from: classes15.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment f224571d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment demoNineFragment) {
        super(0);
        this.f224571d = demoNineFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment demoNineFragment = this.f224571d;
        com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment.l0(demoNineFragment, 0, 1, null);
        com.tencent.mm.view.refreshLayout.horizontal.WxHRefreshLayout wxHRefreshLayout = demoNineFragment.f158091i;
        if (wxHRefreshLayout == null) {
            kotlin.jvm.internal.o.o("hRefreshLayout");
            throw null;
        }
        wxHRefreshLayout.i(true);
        com.tencent.mm.view.refreshLayout.horizontal.WxHRefreshLayout wxHRefreshLayout2 = demoNineFragment.f158091i;
        if (wxHRefreshLayout2 == null) {
            kotlin.jvm.internal.o.o("hRefreshLayout");
            throw null;
        }
        wxHRefreshLayout2.getCommonConfig().f330194d = false;
        wxHRefreshLayout2.getCommonConfig().f330193c = false;
        return jz5.f0.f302826a;
    }
}
