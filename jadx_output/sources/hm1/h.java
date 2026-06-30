package hm1;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final hm1.h f282198d = new hm1.h();

    public h() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = com.tencent.xweb.a3.m() && com.tencent.xweb.WebView.y0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("useXWebCamera: abtest[");
        hm1.m mVar = hm1.m.f282203a;
        sb6.append(mVar.a());
        sb6.append("], isXWeb[");
        sb6.append(com.tencent.xweb.WebView.y0());
        sb6.append("], supper[");
        sb6.append(z17);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", sb6.toString());
        return java.lang.Boolean.valueOf(z17 && mVar.a());
    }
}
