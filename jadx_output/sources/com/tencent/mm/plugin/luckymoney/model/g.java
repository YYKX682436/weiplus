package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes8.dex */
public class g extends com.tencent.mm.modelbase.i {
    public g(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetRedpacketFission", "packetId: %s senderUsername：%s msgCreateTime:%s,packetSource：%s sceneType:%s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.wm3 wm3Var = new r45.wm3();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = wm3Var;
        lVar.f70665b = new r45.xm3();
        lVar.f70667d = 6957;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getredpacketfission";
        wm3Var.f389271d = str;
        wm3Var.f389272e = str2;
        wm3Var.f389273f = i17;
        wm3Var.f389274g = i18;
        wm3Var.f389275h = i19;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            try {
                byte[] decode = android.util.Base64.decode(str3, 2);
                if (decode != null && decode.length > 0) {
                    wm3Var.f389276i = com.tencent.mm.protobuf.g.b(decode);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CgiGetRedpacketFission", th6, "Fail to decode64.", new java.lang.Object[0]);
            }
        }
        p(lVar.a());
    }
}
