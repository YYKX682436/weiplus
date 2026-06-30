package com.tencent.mm.wallet_core.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public abstract class WalletPreferenceUI extends com.tencent.mm.ui.base.preference.MMPreference implements np5.f {

    /* renamed from: d, reason: collision with root package name */
    public np5.b0 f214093d = null;

    /* renamed from: e, reason: collision with root package name */
    public np5.g f214094e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.h f214095f = null;

    public np5.b0 V6() {
        if (this.f214093d == null) {
            this.f214093d = new np5.b0(this, this);
        }
        return this.f214093d;
    }

    public abstract boolean W6(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var);

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setStatusColor();
        np5.b0 b0Var = new np5.b0(this, this);
        this.f214093d = b0Var;
        b0Var.c(385);
        this.f214093d.c(1518);
        if (getLayoutId() > 0) {
            java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f214093d.i(385);
        this.f214093d.i(1518);
        this.f214093d = null;
        super.onDestroy();
    }

    @Override // np5.f
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        if (W6(i17, i18, str, m1Var) || i18 == 0) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = getString(com.tencent.mm.R.string.kkk);
        }
        db5.e1.G(this, str, null, false, new com.tencent.mm.wallet_core.ui.a2(this));
    }

    public void setStatusColor() {
        setActionbarColor(getActionbarColor());
    }
}
