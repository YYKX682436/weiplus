package ox3;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.f0 f349739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f349740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ox3.f0 f0Var, in5.s0 s0Var) {
        super(0);
        this.f349739d = f0Var;
        this.f349740e = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        c50.a1 a1Var = this.f349739d.f349747n;
        android.view.View p17 = this.f349740e.p(com.tencent.mm.R.id.f486695m63);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        ((lt2.b) a1Var).getClass();
        android.view.View childAt = ((android.widget.FrameLayout) p17).getChildAt(0);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = childAt instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) childAt : null;
        if (finderThumbPlayerProxy != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoPlayHelper", "stop mediaId:" + finderThumbPlayerProxy.getVideoMediaId());
            finderThumbPlayerProxy.setVideoViewFocused(false);
            finderThumbPlayerProxy.stop();
        }
        return jz5.f0.f302826a;
    }
}
