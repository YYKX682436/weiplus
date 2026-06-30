package cx3;

/* loaded from: classes15.dex */
public final class x implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSevFragment f224578a;

    public x(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSevFragment demoSevFragment) {
        this.f224578a = demoSevFragment;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        pm0.v.V(1000L, new cx3.w(this.f224578a));
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        pm0.v.V(1000L, new cx3.v(this.f224578a));
        return true;
    }
}
