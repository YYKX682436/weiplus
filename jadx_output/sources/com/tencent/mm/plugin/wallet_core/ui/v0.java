package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class v0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final java.text.Collator f180662d = java.text.Collator.getInstance(java.util.Locale.getDefault());

    public v0(com.tencent.mm.plugin.wallet_core.ui.r0 r0Var) {
    }

    public final int a(gt4.n nVar, gt4.n nVar2) {
        java.lang.String fullPY;
        if (com.tencent.mm.sdk.platformtools.t8.K0(nVar.f275474d)) {
            com.tencent.mars.xlog.Log.e("WalletBankCardSelectUI", "should not go here");
            fullPY = com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI.getFullPY(nVar.f275473c, "#", "_", true);
        } else {
            fullPY = nVar.f275474d.toUpperCase();
        }
        java.lang.String upperCase = !com.tencent.mm.sdk.platformtools.t8.K0(nVar2.f275474d) ? nVar2.f275474d.toUpperCase() : com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI.getFullPY(nVar2.f275473c, "#", "_", true);
        if (fullPY.equals("#")) {
            return 1;
        }
        if (upperCase.equals("#")) {
            return -1;
        }
        int min = java.lang.Math.min(fullPY.length(), upperCase.length());
        for (int i17 = 0; i17 < min; i17++) {
            char charAt = fullPY.charAt(i17);
            char charAt2 = upperCase.charAt(i17);
            if (charAt == '_' && charAt2 == '_') {
                return this.f180662d.compare(nVar.f275473c, nVar2.f275473c);
            }
            if (charAt != charAt2) {
                if (charAt == '_') {
                    return -1;
                }
                return (charAt2 != '_' && charAt < charAt2) ? -1 : 1;
            }
        }
        if (fullPY.length() > min) {
            return 1;
        }
        return upperCase.length() > min ? -1 : 0;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        fb5.n nVar = (fb5.n) obj;
        fb5.n nVar2 = (fb5.n) obj2;
        if (nVar == null && nVar2 == null) {
            return 0;
        }
        if (nVar != null) {
            if (nVar2 != null) {
                if (nVar.f260897a.equals("☆") && nVar2.f260897a.equals("☆")) {
                    return a((gt4.n) nVar.f260898b, (gt4.n) nVar2.f260898b);
                }
                if (!nVar2.f260897a.equals("☆")) {
                    if (!nVar.f260897a.equals("☆")) {
                        if (!nVar2.f260897a.equals("☆")) {
                            return a((gt4.n) nVar.f260898b, (gt4.n) nVar2.f260898b);
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
