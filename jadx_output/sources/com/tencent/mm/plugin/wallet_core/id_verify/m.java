package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.o f179415d;

    public m(com.tencent.mm.plugin.wallet_core.id_verify.o oVar) {
        this.f179415d = oVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "NetSceneTenpayBindBankcard dialog lOk");
        com.tencent.mm.plugin.wallet_core.id_verify.o oVar = this.f179415d;
        oVar.f338834b.d(new rs4.a(oVar.f179448c, "1", oVar.f179449d.f213801c.getString("key_realname_sessionid")), true);
        at4.y0.a(1);
    }
}
