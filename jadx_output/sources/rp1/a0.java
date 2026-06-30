package rp1;

/* loaded from: classes14.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBackgroundView f398353d;

    public a0(com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView) {
        this.f398353d = floatBackgroundView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = this.f398353d;
        floatBackgroundView.setVisibility(8);
        floatBackgroundView.f93441f = false;
    }
}
