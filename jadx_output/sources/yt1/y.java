package yt1;

/* loaded from: classes8.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f465287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.p0 f465288e;

    public y(yt1.z zVar, java.lang.String str, com.tencent.mm.modelbase.p0 p0Var) {
        this.f465287d = str;
        this.f465288e = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.b().c();
        if (xt1.t0.fj().f456577o == null) {
            xt1.t0.fj().f456577o = new eu1.h();
        }
        eu1.h hVar = xt1.t0.fj().f456577o;
        java.lang.String str = "" + this.f465288e.f70726a.f377568r;
        hVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardMsgMgr", "sharecard onReceiveMsg msgId is " + str);
        java.lang.String str2 = this.f465287d;
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        eu1.g gVar = null;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "sysmsg", null);
        if (d17 != null) {
            gVar = new eu1.g(hVar);
            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.notifysharecard.state_flag");
            if (!android.text.TextUtils.isEmpty(str3) && lu1.a0.y(str3)) {
                com.tencent.mm.sdk.platformtools.t8.P(str3, 0);
            }
            gVar.f256754a = (java.lang.String) d17.get(".sysmsg.notifysharecard.card_id");
        }
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardMsgMgr", "card msg == null");
            return;
        }
        if (android.text.TextUtils.isEmpty(gVar.f256754a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardMsgMgr", "card id == null");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardMsgMgr", "sharecard doSyncNetScene card id is " + gVar.f256754a);
        xt1.t0.mj().a();
        lu1.a0.K();
    }
}
