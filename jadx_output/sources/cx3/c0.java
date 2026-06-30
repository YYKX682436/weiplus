package cx3;

/* loaded from: classes15.dex */
public final class c0 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSixFragment f224555a;

    public c0(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSixFragment demoSixFragment) {
        this.f224555a = demoSixFragment;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        pm0.v.V(1000L, new cx3.b0(this.f224555a));
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        pm0.v.V(1000L, new cx3.a0(this.f224555a));
        return true;
    }
}
