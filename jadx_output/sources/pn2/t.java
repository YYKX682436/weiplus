package pn2;

/* loaded from: classes3.dex */
public final class t implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f357027d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f357028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn2.c0 f357029f;

    public t(pn2.c0 c0Var, pn2.c0 viewCallback) {
        kotlin.jvm.internal.o.g(viewCallback, "viewCallback");
        this.f357029f = c0Var;
        this.f357027d = new java.lang.ref.WeakReference(viewCallback);
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        boolean z17 = ((pn2.c0) this.f357027d.get()) == null;
        java.lang.String str = this.f357029f.f356977m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showPrepareLottery onAnimationCancel,view:");
        sb6.append(mMPAGView != null ? mMPAGView.hashCode() : 0);
        sb6.append(" emptyViewCallback:");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        yz5.a aVar = this.f357028e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        java.lang.String str = this.f357029f.f356977m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationStart:$");
        sb6.append(mMPAGView != null ? mMPAGView.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        pn2.c0 c0Var = (pn2.c0) this.f357027d.get();
        boolean z17 = c0Var == null;
        java.lang.String str = this.f357029f.f356977m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showPrepareLottery onAnimationEnd,view:");
        sb6.append(mMPAGView != null ? mMPAGView.hashCode() : 0);
        sb6.append(" emptyViewCallback:");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        android.widget.TextView B = c0Var != null ? c0Var.B() : null;
        if (B != null) {
            B.setVisibility(0);
        }
        yz5.a aVar = this.f357028e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
        java.lang.String str = this.f357029f.f356977m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationRepeat:$");
        sb6.append(mMPAGView != null ? mMPAGView.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }
}
