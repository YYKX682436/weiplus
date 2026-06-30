package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class c8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f146783a;

    public c8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f146783a = luckyMoneyNewDetailUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[getHKRecordList] resp，errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f146783a;
        if (i17 != 0 || fVar.f70616b != 0) {
            db5.e1.T(luckyMoneyNewDetailUI.getContext(), fVar.f70617c);
            luckyMoneyNewDetailUI.finish();
            return null;
        }
        r45.p43 p43Var = (r45.p43) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[getHKRecordList] resp，retcode: %s, retmsg: %s", java.lang.Integer.valueOf(p43Var.f382727d), p43Var.f382728e);
        if (p43Var.f382727d != 0) {
            db5.e1.T(luckyMoneyNewDetailUI.getContext(), p43Var.f382728e);
            luckyMoneyNewDetailUI.finish();
            return null;
        }
        com.tencent.mm.plugin.luckymoney.model.e1 e17 = com.tencent.mm.plugin.luckymoney.model.g5.e(p43Var);
        luckyMoneyNewDetailUI.U2 = e17;
        luckyMoneyNewDetailUI.q7(e17);
        return null;
    }
}
