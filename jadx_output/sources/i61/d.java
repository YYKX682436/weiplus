package i61;

/* loaded from: classes2.dex */
public class d extends com.tencent.mm.wallet_core.model.h1 {
    public d(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.d dVar = new r45.d();
        dVar.f371952d = str;
        dVar.f371953e = str2;
        lVar.f70664a = dVar;
        lVar.f70665b = new r45.e();
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaaclosenotify";
        lVar.f70667d = 1672;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiCloseAAUrgeNotify", "CgiCloseAAUrgeNotify, billNo: %s, chatroom: %s", str, str2);
    }
}
