package hm1;

/* loaded from: classes7.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final hm1.j f282200d = new hm1.j();

    public j() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("useXWebTextArea: abtest[true], isXWeb[");
        sb6.append(com.tencent.xweb.WebView.y0());
        sb6.append("], supper[");
        hm1.m mVar = hm1.m.f282203a;
        sb6.append(mVar.c());
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", sb6.toString());
        return java.lang.Boolean.valueOf(mVar.c());
    }
}
