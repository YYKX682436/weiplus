package ge;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.plugin.appbrand.ui.zd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6) {
        super(rt6);
        kotlin.jvm.internal.o.g(rt6, "rt");
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.zd, com.tencent.mm.plugin.appbrand.ui.bd
    public int E6(com.tencent.mm.plugin.appbrand.e9 service) {
        android.graphics.Rect safeAreaInsets;
        kotlin.jvm.internal.o.g(service, "service");
        int E6 = super.E6(service);
        if (E6 > 0) {
            return E6;
        }
        xi1.g windowAndroid = service.getWindowAndroid();
        return java.lang.Math.max(E6, (windowAndroid == null || (safeAreaInsets = windowAndroid.getSafeAreaInsets()) == null) ? 0 : safeAreaInsets.top);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.zd, com.tencent.mm.plugin.appbrand.ui.bd
    public com.tencent.mm.plugin.appbrand.ui.ad a7() {
        com.tencent.mm.plugin.appbrand.ui.ad a76 = super.a7();
        return new com.tencent.mm.plugin.appbrand.ui.ad(a76.f89510a, a76.f89511b + a(b(), com.tencent.mm.R.dimen.f480049ml), a(b(), com.tencent.mm.R.dimen.f480019ls) + a(b(), com.tencent.mm.R.dimen.f480048mk), a76.f89513d);
    }
}
