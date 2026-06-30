package o25;

/* loaded from: classes9.dex */
public class e0 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342507a;

    public e0(java.lang.String str) {
        this.f342507a = str;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        try {
            new cl0.g().h(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, num);
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DeepLinkHelper", e17, "FINDER_OPEN_EVENT json expt", new java.lang.Object[0]);
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(this.f342507a);
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.opensdk.modelbiz.WXChannelOpenEvent.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXChannelOpenEvent.Resp();
        if (num.intValue() == 400) {
            resp.errCode = 400;
            resp.extMsg = "";
            if (h17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.DeepLinkHelper", "can not find app info");
                return;
            }
            resp.toBundle(bundle);
            com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
            args.targetPkgName = h17.field_packageName;
            args.bundle = bundle;
            args.flags = 268435456;
            com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
            com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
            com.tencent.mm.opensdk.channel.MMessageActV2.send(com.tencent.mm.sdk.platformtools.x2.f193071a, args);
        }
    }
}
