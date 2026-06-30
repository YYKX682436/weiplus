package of1;

/* loaded from: classes7.dex */
public final class y0 extends com.tencent.mm.plugin.appbrand.jsapi.webview.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f345058a;

    public y0(of1.w1 w1Var) {
        this.f345058a = w1Var;
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public boolean onSetRequestedOrientation(int i17) {
        of1.w1 w1Var = this.f345058a;
        xi1.m C1 = w1Var.f345034e.C1();
        if (C1 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onSetRequestedOrientation hash[%d] NULL fullscreenImpl", java.lang.Integer.valueOf(w1Var.hashCode()));
            return false;
        }
        C1.h(xi1.j.a(i17));
        return true;
    }
}
