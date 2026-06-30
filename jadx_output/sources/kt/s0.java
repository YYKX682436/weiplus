package kt;

@j95.b
/* loaded from: classes8.dex */
public class s0 extends i95.w implements lt.r0 {
    public boolean Ai(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str3);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenBusinessViewUtil", "launchBackApp info is null");
            return false;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp(bundle);
        resp.extMsg = str2;
        resp.errStr = str4;
        resp.openId = h17.field_openId;
        resp.errCode = i17;
        resp.businessType = str;
        resp.transaction = com.tencent.mm.pluginsdk.ui.tools.n5.f191793a;
        java.lang.String str5 = h17.field_packageName;
        resp.toBundle(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = str5;
        args.bundle = bundle;
        args.flags = 268435456;
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.send(com.tencent.mm.sdk.platformtools.x2.f193071a, args);
        return true;
    }

    public boolean wi(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "isSameAccount appid is null");
            return true;
        }
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "isSameAccount appInfo is null");
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "isSameAccount openId is null");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "isSameAccount %s/%s", str2, h17.field_openId);
        return str2.equalsIgnoreCase(h17.field_openId);
    }
}
