package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class l3 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || !com.tencent.mm.sdk.platformtools.w9.f193053a.equals(com.tencent.mm.ipcinvoker.y.a())) {
            return;
        }
        java.lang.String string = bundle.getString("appId");
        java.lang.String string2 = bundle.getString("extInfo");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m k17 = com.tencent.mm.pluginsdk.model.app.w.k(string, true);
        if (k17 == null) {
            return;
        }
        com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
        wXAppExtendObject.extInfo = string2;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
        wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
        wXMediaMessage.messageExt = string2;
        boolean fj6 = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).fj(com.tencent.mm.sdk.platformtools.x2.f193071a, k17.field_appId, wXMediaMessage, 2, null, null);
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(fj6));
        }
    }
}
