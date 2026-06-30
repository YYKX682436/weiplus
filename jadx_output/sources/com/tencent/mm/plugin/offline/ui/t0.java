package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class t0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo3.z f152718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.a1 f152719e;

    public t0(com.tencent.mm.plugin.offline.ui.a1 a1Var, wo3.z zVar) {
        this.f152719e = a1Var;
        this.f152718d = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.offline.ui.e eVar = this.f152719e.f152578b;
        wo3.z zVar = this.f152718d;
        if (eVar != null) {
            ((com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) eVar).Y6(0, zVar.f448238f, "", zVar.f448240h);
        }
        to3.q.a(zVar.f448240h, com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "launchPwdDialog do cancel pay");
    }
}
