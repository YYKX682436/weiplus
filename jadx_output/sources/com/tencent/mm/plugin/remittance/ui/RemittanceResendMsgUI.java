package com.tencent.mm.plugin.remittance.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class RemittanceResendMsgUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(4808);
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResendMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/remittance/ui/RemittanceResendMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setTitleVisibility(8);
        java.lang.String stringExtra = getIntent().getStringExtra(ya.b.TRANSACTION_ID);
        java.lang.String stringExtra2 = getIntent().getStringExtra("transfer_id");
        java.lang.String stringExtra3 = getIntent().getStringExtra("receiver_name");
        int intExtra = getIntent().getIntExtra("resend_msg_from_flag", 1);
        int intExtra2 = getIntent().getIntExtra("invalid_time", 0);
        int intExtra3 = getIntent().getIntExtra("is_open_im", 0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResendMsgUI", "onCreate() receiverName == null");
        } else {
            if (intExtra3 != 0) {
                doSceneProgress(new com.tencent.mm.plugin.remittance.model.m1(stringExtra2, intExtra));
                return;
            }
            com.tencent.mm.plugin.remittance.model.h1 h1Var = new com.tencent.mm.plugin.remittance.model.h1(stringExtra, stringExtra2, stringExtra3, intExtra2, intExtra);
            h1Var.setProcessName("RemittanceProcess");
            doSceneProgress(h1Var);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(4808);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResendMsgUI", "onSceneEnd() errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " netsceneType:" + m1Var.getType());
        if (m1Var instanceof com.tencent.mm.plugin.remittance.model.h1) {
            if (i17 != 0 || i18 != 0) {
                db5.e1.y(this, str, "", getContext().getString(com.tencent.mm.R.string.f490454vi), new com.tencent.mm.plugin.remittance.ui.z7(this));
                return true;
            }
            db5.h7.c(null, getContext().getResources().getString(com.tencent.mm.R.string.fw6), getContext(), 0, null);
            finish();
            new com.tencent.mm.autogen.events.RemittanceDetailUIFinishEvent().e();
            return true;
        }
        if (!(m1Var instanceof com.tencent.mm.plugin.remittance.model.m1)) {
            return false;
        }
        if (i17 == 0 && i18 == 0) {
            r45.dy dyVar = ((com.tencent.mm.plugin.remittance.model.m1) m1Var).f156900r;
            if (dyVar.f372842d == 0) {
                db5.h7.c(null, getContext().getResources().getString(com.tencent.mm.R.string.fw6), getContext(), 0, null);
                finish();
                new com.tencent.mm.autogen.events.RemittanceDetailUIFinishEvent().e();
            } else {
                showNetErrorDialog(dyVar.f372843e, true);
            }
        } else {
            showNetErrorDialog(str, true);
        }
        return true;
    }
}
