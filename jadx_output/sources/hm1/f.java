package hm1;

/* loaded from: classes7.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final hm1.f f282196d = new hm1.f();

    public f() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = (org.xwalk.core.XWalkEnvironment.o() && org.xwalk.core.XWalkEnvironment.f(com.tencent.mm.plugin.appbrand.jsapi.auth.v1.CTRL_INDEX)) && com.tencent.xweb.WebView.y0();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", "xwebSupportInputSameLayer: " + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
