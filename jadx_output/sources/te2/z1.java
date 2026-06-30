package te2;

/* loaded from: classes3.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC f418555d;

    public z1(com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC finderLiveAnchorUIC) {
        this.f418555d = finderLiveAnchorUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC finderLiveAnchorUIC = this.f418555d;
        if (finderLiveAnchorUIC.f111555g == null) {
            android.app.Activity context = finderLiveAnchorUIC.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            finderLiveAnchorUIC.f111555g = new com.tencent.mm.ui.tools.f5(context);
            com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC finderLiveAnchorUIC2 = this.f418555d;
            com.tencent.mm.ui.tools.f5 f5Var = finderLiveAnchorUIC2.f111555g;
            if (f5Var != null) {
                f5Var.f210400e = new te2.x1(finderLiveAnchorUIC2);
            }
            com.tencent.mm.ui.tools.f5 f5Var2 = this.f418555d.f111555g;
            if (f5Var2 != null) {
                f5Var2.f210401f = te2.y1.f418541a;
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var3 = this.f418555d.f111555g;
        if (f5Var3 != null) {
            f5Var3.f();
        }
    }
}
