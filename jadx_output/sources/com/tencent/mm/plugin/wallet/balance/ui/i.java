package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class i implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.k f177901d;

    public i(com.tencent.mm.plugin.wallet.balance.ui.k kVar) {
        this.f177901d = kVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = 0;
        for (at4.e eVar : this.f177901d.f177908d.f13842j.f13815a) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(eVar.f13825a)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(eVar.f13826b)) {
                    g4Var.f(i17, eVar.f13825a);
                } else {
                    g4Var.p(i17, eVar.f13825a, eVar.f13826b, 0);
                }
            }
            i17++;
        }
    }
}
