package cx3;

/* loaded from: classes15.dex */
public final class c implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoEightFragment f224554a;

    public c(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoEightFragment demoEightFragment) {
        this.f224554a = demoEightFragment;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        pm0.v.V(1000L, new cx3.b(this.f224554a));
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        pm0.v.V(1000L, new cx3.a(this.f224554a));
        return true;
    }
}
