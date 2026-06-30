package dq1;

/* loaded from: classes8.dex */
public final class l implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f242351a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f242352b;

    public l(java.lang.ref.WeakReference weakUI) {
        kotlin.jvm.internal.o.g(weakUI, "weakUI");
        this.f242351a = weakUI;
        this.f242352b = "MicroMsg.BizSchemeMiniProgram";
    }

    @Override // l81.e1
    public void a() {
        com.tencent.mars.xlog.Log.i(this.f242352b, "onAppBrandProcessDied");
        com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI bizComSchIntermediateUI = (com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI) this.f242351a.get();
        if (bizComSchIntermediateUI != null) {
            bizComSchIntermediateUI.finish();
        }
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mars.xlog.Log.i(this.f242352b, "onAppBrandPreconditionError");
        com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI bizComSchIntermediateUI = (com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI) this.f242351a.get();
        if (bizComSchIntermediateUI != null) {
            bizComSchIntermediateUI.finish();
        }
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f242352b, "onTriggerHalfScreenShare");
    }

    @Override // l81.e1
    public void e() {
        com.tencent.mars.xlog.Log.i(this.f242352b, "onAppBrandUIEnter");
        com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI bizComSchIntermediateUI = (com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI) this.f242351a.get();
        if (bizComSchIntermediateUI != null) {
            bizComSchIntermediateUI.finish();
        }
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f242352b, "onAppBrandUIExit");
        com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI bizComSchIntermediateUI = (com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI) this.f242351a.get();
        if (bizComSchIntermediateUI != null) {
            bizComSchIntermediateUI.finish();
        }
    }
}
