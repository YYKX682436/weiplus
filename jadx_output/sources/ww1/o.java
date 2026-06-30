package ww1;

/* loaded from: classes9.dex */
public class o extends com.tencent.mm.wallet_core.model.h1 {
    public o(int i17, int i18, java.lang.String str, java.lang.String str2, com.tencent.mm.protobuf.g gVar, boolean z17, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiSaveQrcodeNotify", "CgiSaveQrcodeNotify request：notifyType：%s，amount：%s，memo：%s，url：%s , desc_required:%s descPlaceholder:%s ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, java.lang.Boolean.valueOf(z17), str3);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ax axVar = new r45.ax();
        axVar.f370319d = i17;
        axVar.f370320e = i18;
        axVar.f370321f = str;
        axVar.f370322g = str2;
        axVar.f370323h = (int) (java.lang.System.currentTimeMillis() / 1000);
        axVar.f370324i = gVar;
        axVar.f370325m = z17;
        axVar.f370326n = str3;
        lVar.f70664a = axVar;
        lVar.f70665b = new r45.bx();
        lVar.f70666c = "/cgi-bin/mmpay-bin/qrcodesavenotify";
        lVar.f70667d = 3781;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
    }
}
