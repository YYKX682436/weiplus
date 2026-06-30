package ww1;

/* loaded from: classes8.dex */
public class p extends com.tencent.mm.wallet_core.model.h1 {
    public p(int i17, int i18, java.lang.String str, java.lang.String str2, com.tencent.mm.protobuf.g gVar, boolean z17, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiSaveQrcodeNotifyMch", "CgiSaveQrcodeNotifyMch request：notifyType：%s，amount：%s，memo：%s，url：%s , desc_required:%s descPlaceholder:%s ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, java.lang.Boolean.valueOf(z17), str3);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.yw ywVar = new r45.yw();
        ywVar.f391430d = i17;
        ywVar.f391431e = i18;
        ywVar.f391432f = str;
        ywVar.f391433g = str2;
        ywVar.f391434h = (int) (java.lang.System.currentTimeMillis() / 1000);
        ywVar.f391435i = gVar;
        ywVar.f391436m = z17;
        ywVar.f391437n = str3;
        lVar.f70664a = ywVar;
        lVar.f70665b = new r45.zw();
        lVar.f70666c = "/cgi-bin/mmpay-bin/sjtsaveqrnotify";
        lVar.f70667d = 4590;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
    }
}
