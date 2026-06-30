package ww1;

/* loaded from: classes9.dex */
public class n extends com.tencent.mm.wallet_core.model.h1 {
    public n(double d17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.mm.protobuf.g gVar, java.lang.String str6, boolean z17, java.lang.String str7) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiSaveQrcodeMch", "CgiSaveQrcodeMch request ");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.gx gxVar = new r45.gx();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.wallet_core.ui.r1.i0(d17 + "", "100"));
        sb6.append("");
        gxVar.f375583d = sb6.toString();
        gxVar.f375584e = str;
        gxVar.f375585f = str2;
        gxVar.f375586g = str3;
        gxVar.f375587h = str4;
        gxVar.f375588i = str5;
        gxVar.f375589m = gVar;
        gxVar.f375590n = str6;
        gxVar.f375591o = z17;
        gxVar.f375592p = str7;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiSaveQrcodeMch", "fee：%s desc:%s desc_required:%s descPlaceholder:%s", java.lang.Double.valueOf(d17), str6, java.lang.Boolean.valueOf(z17), str7);
        lVar.f70664a = gxVar;
        lVar.f70665b = new r45.hx();
        lVar.f70666c = "/cgi-bin/mmpay-bin/sjtsaveqrcheck";
        lVar.f70667d = 5166;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
    }
}
