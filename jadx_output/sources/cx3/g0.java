package cx3;

/* loaded from: classes15.dex */
public final class g0 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoTwoFragment f224561a;

    public g0(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoTwoFragment demoTwoFragment) {
        this.f224561a = demoTwoFragment;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        pm0.v.V(1000L, new cx3.f0(this.f224561a));
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        pm0.v.V(1000L, new cx3.e0(this.f224561a));
        return true;
    }
}
