package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class d6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.f6 f178149d;

    public d6(com.tencent.mm.plugin.wallet.balance.ui.lqt.f6 f6Var) {
        this.f178149d = f6Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.util.Iterator it = this.f178149d.f178174a.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            g4Var.add(0, i17, 0, ((java.lang.String) it.next()).split("\\|\\|")[0]);
            i17++;
        }
    }
}
