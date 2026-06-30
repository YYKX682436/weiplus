package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class RemittanceUI extends com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI {

    /* renamed from: u2, reason: collision with root package name */
    public static final /* synthetic */ int f157595u2 = 0;

    /* renamed from: t2, reason: collision with root package name */
    public java.lang.String f157596t2;

    public final void C7() {
        gm0.j1.i();
        this.M = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_CONFIRM_WORDING_STRING, "");
        gm0.j1.i();
        this.N = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_DESC_URL_STRING, "");
        gm0.j1.i();
        this.P = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_DESC_URL_FLAG_INT, 0)).intValue();
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI
    public void a7() {
        int i17 = this.f157443i;
        if (i17 == 0 || i17 == 2) {
            C7();
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.M) || com.tencent.mm.sdk.platformtools.t8.K0(this.N)) {
                ss4.k0.H(true, null, new com.tencent.mm.plugin.remittance.ui.k8(this));
            } else {
                ss4.k0.H(false, null, new com.tencent.mm.plugin.remittance.ui.m8(this));
            }
            doSceneProgress(new com.tencent.mm.plugin.remittance.model.i(this.f157439g, this.W), false);
        }
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI
    public void b7(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.mm.autogen.events.F2fDynamicStartPayEvent f2fDynamicStartPayEvent) {
        c7(str, i17, str2, str3, str4, str5, str6, f2fDynamicStartPayEvent, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c7(java.lang.String r38, int r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, com.tencent.mm.autogen.events.F2fDynamicStartPayEvent r45, java.lang.String r46) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.remittance.ui.RemittanceUI.c7(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.autogen.events.F2fDynamicStartPayEvent, java.lang.String):void");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return false;
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI
    public void d7() {
        int i17 = this.f157443i;
        if (i17 == 0 || i17 == 2) {
            doSceneProgress(new com.tencent.mm.plugin.remittance.model.j(this.f157439g, this.W), false);
        }
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI
    public void e7(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceUI", "doUnionTransferPlaceOrder, userName:%s groupName:%s", this.f157439g, this.W);
        nr4.a aVar = this.f157433d;
        if (aVar != null) {
            aVar.b(3, java.lang.Integer.valueOf(this.f157449m), java.lang.Double.valueOf(this.f157435e));
        }
        com.tencent.mm.plugin.remittance.model.o1 o1Var = new com.tencent.mm.plugin.remittance.model.o1(this.f157439g, this.W, this.f157435e, this.X, str, str2);
        if (this.mKindaEnable) {
            showLoading();
            doSceneProgress(o1Var, false);
        } else {
            doSceneProgress(o1Var);
        }
        this.V = "";
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceUI", "[onCreate]");
        if (bundle != null) {
            boolean z17 = bundle.getBoolean("pageHasRestored", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceUI", "[onCreate] is restore status？: %s，needFinish？：%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).mj(z17, "3", "remittance")));
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15386, 1, 1);
        addSceneEndListener(2783);
        addSceneEndListener(4465);
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2783);
        removeSceneEndListener(4465);
        hideLoading();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("pageHasRestored", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceUI", "[onSaveInstanceState]");
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof com.tencent.mm.plugin.remittance.model.i) {
            com.tencent.mm.plugin.remittance.model.i iVar = (com.tencent.mm.plugin.remittance.model.i) m1Var;
            iVar.O(new com.tencent.mm.plugin.remittance.ui.p8(this, iVar));
            if (iVar.f214031i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceUI", "net error: %s", iVar);
            }
            return true;
        }
        if (!(m1Var instanceof com.tencent.mm.plugin.remittance.model.j)) {
            return super.onSceneEnd(i17, i18, str, m1Var);
        }
        hideLoading();
        com.tencent.mm.plugin.remittance.model.j jVar = (com.tencent.mm.plugin.remittance.model.j) m1Var;
        jVar.O(new com.tencent.mm.plugin.remittance.ui.r8(this, jVar));
        jVar.J(new com.tencent.mm.plugin.remittance.ui.q8(this, jVar));
        if (jVar.f214031i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceUI", "union net error: %s", jVar);
            r45.xx xxVar = jVar.f156861r;
            if (xxVar == null || com.tencent.mm.sdk.platformtools.t8.K0(xxVar.f390572i)) {
                this.I1 = getString(com.tencent.mm.R.string.k2x);
            } else {
                this.I1 = jVar.f156861r.f390572i;
            }
            j7();
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI
    public void p7(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = mMActivity.getString(com.tencent.mm.R.string.l0g);
        }
        db5.e1.G(mMActivity, str, null, false, new com.tencent.mm.plugin.remittance.ui.s8(this, z17));
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI
    public void q7() {
        db5.t7.makeText(getContext(), com.tencent.mm.R.string.hye, 0).show();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean shouldEnsureSoterConnection() {
        return true;
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI
    public void x7() {
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = new com.tencent.mm.autogen.events.WalletGetBulletinEvent();
        walletGetBulletinEvent.f54955g.f6893a = "7";
        walletGetBulletinEvent.f192364d = new com.tencent.mm.plugin.remittance.ui.j8(this, walletGetBulletinEvent);
        walletGetBulletinEvent.e();
    }
}
