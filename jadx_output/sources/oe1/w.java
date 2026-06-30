package oe1;

/* loaded from: classes15.dex */
public class w implements oe1.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView f344751a;

    public w(com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView) {
        this.f344751a = appBrandVideoView;
    }

    @Override // oe1.i1
    public void a(int i17) {
        this.f344751a.u(i17, false);
    }

    @Override // oe1.i1
    public void b() {
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.E1;
        this.f344751a.o("onSeekPre", new java.lang.Object[0]);
    }
}
