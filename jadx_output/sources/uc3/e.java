package uc3;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni f426371a;

    /* renamed from: b, reason: collision with root package name */
    public final int f426372b;

    public e(com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni commonBinding, int i17) {
        kotlin.jvm.internal.o.g(commonBinding, "commonBinding");
        this.f426371a = commonBinding;
        this.f426372b = i17;
    }

    @Override // com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding
    public void createRuntime(long j17, long j18) {
    }

    @Override // com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding
    public void destroyRuntime() {
    }

    @Override // com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding
    public void invokeCallbackHandler(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni appBrandCommonBindingJni = this.f426371a;
        int i18 = this.f426372b;
        if (i18 > 0) {
            appBrandCommonBindingJni.postToJsThreadInWorker(i18, uc3.a.f426360d, false);
        } else {
            appBrandCommonBindingJni.postToJsThread(new uc3.b(this, i17, str, str2), false);
        }
    }

    @Override // com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding
    public void setJsExceptionCallback(android.webkit.ValueCallback valueCallback) {
    }

    @Override // com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding
    public void subscribeHandler(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni appBrandCommonBindingJni = this.f426371a;
        int i18 = this.f426372b;
        if (i18 > 0) {
            appBrandCommonBindingJni.postToJsThreadInWorker(i18, uc3.c.f426365d, false);
        } else {
            appBrandCommonBindingJni.postToJsThread(new uc3.d(this, str, str2, i17, str3), false);
        }
    }

    @Override // com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding
    public void createRuntime(long j17, long j18, java.lang.String str, boolean z17) {
    }
}
