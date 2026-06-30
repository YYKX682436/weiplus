package com.tencent.mm.plugin.honey_pay.ui;

/* loaded from: classes9.dex */
public abstract class HoneyPayBaseUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f142260d = "MicroMsg.".concat(getClass().getSimpleName());

    /* renamed from: e, reason: collision with root package name */
    public int f142261e = com.tencent.mm.R.color.aaw;

    public void U6() {
        setActionbarColor(getResources().getColor(this.f142261e));
        hideActionbarLine();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        U6();
        setBackBtn(new v73.a(this));
    }
}
