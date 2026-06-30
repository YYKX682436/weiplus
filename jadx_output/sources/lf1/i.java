package lf1;

/* loaded from: classes7.dex */
public final class i implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f318261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lf1.j f318262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f318263c;

    public i(kotlin.jvm.internal.h0 h0Var, lf1.j jVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f318261a = h0Var;
        this.f318262b = jVar;
        this.f318263c = lVar;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c
    public void d(int i17) {
        java.lang.Object obj = this.f318261a.f310123d;
        if (obj == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "requestFullscreen, page view is null");
            return;
        }
        int i18 = -90;
        if (i17 != -90) {
            if (i17 != 0) {
                i18 = 90;
                if (i17 != 90 && i17 == 180) {
                    i18 = 180;
                }
            } else {
                i18 = 0;
            }
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) obj;
        v5Var.m(new lf1.g(v5Var, this.f318262b, this.f318263c, i18));
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c
    public void exitFullScreen() {
        java.lang.Object obj = this.f318261a.f310123d;
        if (obj == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "exitFullscreen, page view is null");
        } else {
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) obj;
            v5Var.m(new lf1.h(v5Var, this.f318262b, this.f318263c));
        }
    }
}
