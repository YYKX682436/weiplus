package qn2;

/* loaded from: classes3.dex */
public final class r implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f365141d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f365142e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f365143f;

    public r(qn2.z zVar, java.lang.ref.WeakReference rPlugin) {
        kotlin.jvm.internal.o.g(rPlugin, "rPlugin");
        this.f365141d = rPlugin;
        this.f365142e = "FinderLiveLotteryCardPlugin";
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        qn2.z zVar = (qn2.z) this.f365141d.get();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BigAnimListener onAnimationCancel ViewCallback is null:");
        sb6.append(zVar == null);
        com.tencent.mars.xlog.Log.i(this.f365142e, sb6.toString());
        android.widget.FrameLayout frameLayout = zVar != null ? zVar.f365221q : null;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = zVar != null ? zVar.f365222r : null;
        if (mMPAGView2 != null) {
            mMPAGView2.setVisibility(8);
        }
        yz5.a aVar = this.f365143f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.view.MMPAGView mMPAGView2;
        qn2.z zVar = (qn2.z) this.f365141d.get();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BigAnimListener onAnimationStart ViewCallback is null:");
        sb6.append(zVar == null);
        com.tencent.mars.xlog.Log.i(this.f365142e, sb6.toString());
        android.widget.FrameLayout frameLayout = zVar != null ? zVar.f365221q : null;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        com.tencent.mm.view.MMPAGView mMPAGView3 = zVar != null ? zVar.f365222r : null;
        if (mMPAGView3 != null) {
            mMPAGView3.setVisibility(0);
        }
        if (zVar == null || (mMPAGView2 = zVar.f365222r) == null) {
            return;
        }
        mMPAGView2.d();
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        qn2.z zVar = (qn2.z) this.f365141d.get();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BigAnimListener onAnimationEnd ViewCallback is null:");
        sb6.append(zVar == null);
        com.tencent.mars.xlog.Log.i(this.f365142e, sb6.toString());
        android.widget.FrameLayout frameLayout = zVar != null ? zVar.f365221q : null;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = zVar != null ? zVar.f365222r : null;
        if (mMPAGView2 != null) {
            mMPAGView2.setVisibility(8);
        }
        yz5.a aVar = this.f365143f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
