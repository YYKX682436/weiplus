package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class i4 extends at4.o0 {
    public i4(com.tencent.mm.plugin.wallet_core.ui.j4 j4Var) {
    }

    @Override // at4.o0
    public java.lang.String a(java.util.Vector vector, int i17) {
        if (vector == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletFavorDialog", "func[getComposedKey] keyList null");
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < vector.size(); i18++) {
            at4.m0 m0Var = ((at4.n0) vector.get(i18)).f13905b;
            if (i18 == i17 || m0Var == at4.m0.CHECKED) {
                sb6.append(((java.lang.String) ((at4.n0) vector.get(i18)).f13904a) + "-");
            }
        }
        if (sb6.length() == 0) {
            return "0";
        }
        if (sb6.length() > 1) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        return sb6.toString();
    }
}
