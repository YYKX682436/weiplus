package im2;

/* loaded from: classes3.dex */
public final class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC f292267d;

    public b7(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC finderLiveVisitorUIC) {
        this.f292267d = finderLiveVisitorUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC finderLiveVisitorUIC = this.f292267d;
        if (finderLiveVisitorUIC.f117005m == null) {
            android.app.Activity context = finderLiveVisitorUIC.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            finderLiveVisitorUIC.f117005m = new com.tencent.mm.ui.tools.f5(context);
            com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC finderLiveVisitorUIC2 = this.f292267d;
            com.tencent.mm.ui.tools.f5 f5Var = finderLiveVisitorUIC2.f117005m;
            if (f5Var != null) {
                f5Var.f210400e = new im2.a7(finderLiveVisitorUIC2);
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f292267d.f117005m;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
