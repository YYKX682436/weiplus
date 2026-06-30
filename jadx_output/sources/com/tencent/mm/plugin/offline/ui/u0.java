package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class u0 implements com.tencent.mm.plugin.wallet_core.ui.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wo3.z f152726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.a1 f152727b;

    public u0(com.tencent.mm.plugin.offline.ui.a1 a1Var, wo3.z zVar) {
        this.f152727b = a1Var;
        this.f152726a = zVar;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.m8
    public void a(java.lang.String str, com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo, boolean z17) {
        com.tencent.mm.plugin.offline.ui.a1 a1Var = this.f152727b;
        android.app.Activity activity = a1Var.f152577a;
        if (activity instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) activity).hideVKB();
        }
        com.tencent.mm.plugin.offline.ui.e eVar = a1Var.f152578b;
        if (eVar != null) {
            wo3.z zVar = this.f152726a;
            ((com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) eVar).Y6(1, zVar.f448238f, str, zVar.f448240h);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "launchPwdDialog do pay");
    }
}
