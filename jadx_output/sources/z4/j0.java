package z4;

/* loaded from: classes13.dex */
public class j0 implements z4.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface f470071a;

    public j0(org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f470071a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // z4.i0
    public java.lang.String[] a() {
        return this.f470071a.getSupportedFeatures();
    }

    @Override // z4.i0
    public org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView webView) {
        return (org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface.class, this.f470071a.createWebView(webView));
    }

    @Override // z4.i0
    public org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface.class, this.f470071a.getDropDataProvider());
    }

    @Override // z4.i0
    public org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface getProfileStore() {
        return (org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface.class, this.f470071a.getProfileStore());
    }

    @Override // z4.i0
    public org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface getProxyController() {
        return (org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface.class, this.f470071a.getProxyController());
    }

    @Override // z4.i0
    public org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics() {
        return (org.chromium.support_lib_boundary.StaticsBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.StaticsBoundaryInterface.class, this.f470071a.getStatics());
    }

    @Override // z4.i0
    public org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface.class, this.f470071a.getWebkitToCompatConverter());
    }
}
