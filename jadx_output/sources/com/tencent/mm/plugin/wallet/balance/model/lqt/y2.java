package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class y2 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.b3 f177753a;

    public y2(com.tencent.mm.plugin.wallet.balance.model.lqt.b3 b3Var) {
        this.f177753a = b3Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    public km5.d b(int i17, int i18) {
        return ((km5.q) km5.u.f(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18))).n(this);
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = this.f177753a.f177618a;
        int intValue = ((java.lang.Integer) bVar.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) bVar.a(1)).intValue();
        w2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "reportLqtSaveShowingAndClickState, clickState: %s, showingState: %s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
        km5.b b17 = km5.u.b();
        w2Var.f177742l = b17;
        b17.b();
        new com.tencent.mm.plugin.wallet.balance.model.lqt.e0(intValue, intValue2).l().h(new com.tencent.mm.plugin.wallet.balance.model.lqt.m2(w2Var));
        return null;
    }
}
