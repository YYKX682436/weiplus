package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class w0 implements com.tencent.mm.plugin.wallet_core.ui.k8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wo3.z f152747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.a1 f152748b;

    public w0(com.tencent.mm.plugin.offline.ui.a1 a1Var, wo3.z zVar) {
        this.f152748b = a1Var;
        this.f152747a = zVar;
    }

    public void a() {
        com.tencent.mm.plugin.offline.ui.e eVar = this.f152748b.f152578b;
        wo3.z zVar = this.f152747a;
        if (eVar != null) {
            ((com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) eVar).Y6(0, zVar.f448238f, "", zVar.f448240h);
        }
        to3.q.a(zVar.f448240h, com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "launchPwdDialog do cancel pay");
    }
}
