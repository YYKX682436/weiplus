package cx3;

/* loaded from: classes15.dex */
public final class l implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFourFragment f224566a;

    public l(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFourFragment demoFourFragment) {
        this.f224566a = demoFourFragment;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        pm0.v.V(1000L, new cx3.k(this.f224566a));
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        pm0.v.V(1000L, new cx3.j(this.f224566a));
        return true;
    }
}
