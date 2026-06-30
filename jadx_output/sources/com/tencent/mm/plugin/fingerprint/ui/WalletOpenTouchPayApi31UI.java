package com.tencent.mm.plugin.fingerprint.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/fingerprint/ui/WalletOpenTouchPayApi31UI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class WalletOpenTouchPayApi31UI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f137017d = jz5.h.b(new qz2.k1(this));

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (((java.lang.Number) ((jz5.n) this.f137017d).getValue()).intValue() == 1) {
            qz2.j1 j1Var = (qz2.j1) component(qz2.j1.class);
            j1Var.getClass();
            java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(str) ? j1Var.getString(com.tencent.mm.R.string.f_k) : str;
            if (m1Var instanceof d50.l) {
                if (i17 != 0 || i18 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: failed get challenge");
                    re4.n.g(7, i17, i18, "get challenge failed");
                    j1Var.O6(new qz2.v0(string));
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "get challenge success");
                if (com.tencent.mm.sdk.platformtools.t8.K0(((oz2.a) ((d50.l) m1Var)).f350239f)) {
                    j1Var.O6(new qz2.v0(j1Var.getString(com.tencent.mm.R.string.f_k)));
                    return false;
                }
                com.tencent.mm.sdk.platformtools.u3.h(new qz2.g1(j1Var, m1Var));
                return false;
            }
            if (!(m1Var instanceof d50.m)) {
                if (!(m1Var instanceof ss4.e0)) {
                    return false;
                }
                j1Var.P6(qz2.p0.f367900a);
                return false;
            }
            if (i18 != 0 || i17 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: open");
                re4.n.g(8, i17, i18, "open fp pay failed");
                j1Var.O6(new qz2.v0(""));
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: open success");
            re4.n.h();
            re4.n.g(0, 0, 0, "OK");
            j1Var.P6(qz2.l0.f367886a);
            return false;
        }
        qz2.i2 i2Var = (qz2.i2) component(qz2.i2.class);
        i2Var.getClass();
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? i2Var.getString(com.tencent.mm.R.string.f_k) : str;
        if (m1Var instanceof d50.l) {
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenTouchPayUIC", "hy: failed get challenge");
                re4.n.g(7, i17, i18, "get challenge failed");
                i2Var.O6(new qz2.v1(string2));
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayUIC", "get challenge success");
            if (com.tencent.mm.sdk.platformtools.t8.K0(((oz2.a) ((d50.l) m1Var)).f350239f)) {
                i2Var.O6(new qz2.v1(i2Var.getString(com.tencent.mm.R.string.f_k)));
                return false;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new qz2.f2(i2Var, m1Var));
            return false;
        }
        if (!(m1Var instanceof d50.m)) {
            if (!(m1Var instanceof ss4.e0)) {
                return false;
            }
            i2Var.P6(qz2.p1.f367901a);
            return false;
        }
        if (i18 != 0 || i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayUIC", "hy: open");
            re4.n.g(8, i17, i18, "open fp pay failed");
            i2Var.O6(new qz2.v1(""));
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayUIC", "hy: open success");
        re4.n.h();
        re4.n.g(0, 0, 0, "OK");
        i2Var.P6(qz2.l1.f367887a);
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        if (((java.lang.Number) ((jz5.n) this.f137017d).getValue()).intValue() == 1) {
            set.add(qz2.j1.class);
        } else {
            set.add(qz2.i2.class);
        }
    }
}
