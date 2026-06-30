package zk3;

/* loaded from: classes8.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC f473482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f473483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f473484f;

    public n0(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC, int i17, boolean z17) {
        this.f473482d = multiTaskUIC;
        this.f473483e = i17;
        this.f473484f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f473483e;
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC = this.f473482d;
        multiTaskUIC.f150595h = i17;
        com.tencent.mm.plugin.multitask.ui.panel.MultiTaskContainerView multiTaskContainerView = multiTaskUIC.f150601q;
        if (multiTaskContainerView != null) {
            multiTaskContainerView.f150579q = 0;
            multiTaskContainerView.invalidate();
        }
        multiTaskUIC.n7();
        rk3.e eVar = multiTaskUIC.f150591d;
        if (eVar != null) {
            eVar.i(0, this.f473484f);
        }
        if (multiTaskUIC.getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            androidx.appcompat.app.AppCompatActivity activity = multiTaskUIC.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).hideVKB();
        } else if (multiTaskUIC.getActivity() instanceof com.tencent.mm.ui.MMFragmentActivity) {
            androidx.appcompat.app.AppCompatActivity activity2 = multiTaskUIC.getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            ((com.tencent.mm.ui.MMFragmentActivity) activity2).hideVKB();
        }
    }
}
