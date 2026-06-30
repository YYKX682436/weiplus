package cx3;

/* loaded from: classes15.dex */
public final class q implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment f224572a;

    public q(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment demoNineFragment) {
        this.f224572a = demoNineFragment;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        pm0.v.V(1000L, new cx3.p(this.f224572a));
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        pm0.v.V(1000L, new cx3.o(this.f224572a));
        return true;
    }
}
