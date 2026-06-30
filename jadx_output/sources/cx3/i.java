package cx3;

/* loaded from: classes15.dex */
public final class i implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFiveFragment f224563a;

    public i(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFiveFragment demoFiveFragment) {
        this.f224563a = demoFiveFragment;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        pm0.v.V(1000L, new cx3.h(this.f224563a));
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        pm0.v.V(1000L, new cx3.g(this.f224563a));
        return true;
    }
}
