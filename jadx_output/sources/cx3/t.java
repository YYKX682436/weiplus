package cx3;

/* loaded from: classes15.dex */
public final class t implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoOneFragment f224575a;

    public t(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoOneFragment demoOneFragment) {
        this.f224575a = demoOneFragment;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        pm0.v.V(1000L, new cx3.s(this.f224575a));
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        pm0.v.V(1000L, new cx3.r(this.f224575a));
        return true;
    }
}
