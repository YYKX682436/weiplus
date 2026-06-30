package oe1;

/* loaded from: classes15.dex */
public class a0 implements com.tencent.mm.plugin.appbrand.jsapi.media.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper f344693a;

    public a0(com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper appBrandVideoWrapper) {
        this.f344693a = appBrandVideoWrapper;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onPause() {
        bm5.x0 x0Var = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper.f83555z;
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper appBrandVideoWrapper = this.f344693a;
        appBrandVideoWrapper.p("onPause", new java.lang.Object[0]);
        appBrandVideoWrapper.pause();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onResume() {
        bm5.x0 x0Var = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper.f83555z;
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper appBrandVideoWrapper = this.f344693a;
        appBrandVideoWrapper.p("onResume", new java.lang.Object[0]);
        appBrandVideoWrapper.play();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onStop() {
        bm5.x0 x0Var = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper.f83555z;
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper appBrandVideoWrapper = this.f344693a;
        appBrandVideoWrapper.p("onStop", new java.lang.Object[0]);
        appBrandVideoWrapper.stop();
    }
}
