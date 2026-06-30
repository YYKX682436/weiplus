package tc3;

/* loaded from: classes7.dex */
public final class c extends com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding {

    /* renamed from: a, reason: collision with root package name */
    public final cl.p f417169a;

    public c(cl.p jsRuntime) {
        kotlin.jvm.internal.o.g(jsRuntime, "jsRuntime");
        this.f417169a = jsRuntime;
    }

    @Override // com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding
    public void invokeCallbackHandler(int i17, java.lang.String str, java.lang.String str2) {
        ((cl.a) this.f417169a).h(new tc3.a(this, i17, str, str2), false);
    }

    @Override // com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding
    public void subscribeHandler(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        ((cl.a) this.f417169a).h(new tc3.b(this, str, str2, i17, str3), false);
    }
}
