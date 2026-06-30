package oe1;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView f344733e;

    public q(com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView, java.lang.String str) {
        this.f344733e = appBrandVideoView;
        this.f344732d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.u3.h(new oe1.p(this, com.tencent.mm.sdk.platformtools.x.D(this.f344732d, 1, -1)));
    }
}
