package zv;

/* loaded from: classes11.dex */
public final class o4 implements com.tencent.wechat.aff.brand_service.b {

    /* renamed from: a, reason: collision with root package name */
    public static final zv.o4 f476068a = new zv.o4();

    @Override // com.tencent.wechat.aff.brand_service.b
    public final void complete(boolean z17) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginBrandEcs", "[BRS]cleanUnExpiredNotifyMsg success");
            dw.f fVar = dw.f.f244070a;
            if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("service_officialaccounts") == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "Restart WeChat service number box is not in the main interface");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "Restart WeChat service number box update main digest info");
                fVar.a();
            }
        }
    }
}
