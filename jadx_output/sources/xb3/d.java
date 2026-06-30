package xb3;

/* loaded from: classes9.dex */
public class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI f452897b;

    public d(com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI luckyMoneyHKBeforeDetailUI, java.lang.String str) {
        this.f452897b = luckyMoneyHKBeforeDetailUI;
        this.f452896a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "do query detail: errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI luckyMoneyHKBeforeDetailUI = this.f452897b;
        if (i17 != 0 || fVar.f70616b != 0) {
            java.lang.String str = com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI.f145132m;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(fVar.f70617c)) {
                str = fVar.f70617c;
            }
            db5.e1.T(luckyMoneyHKBeforeDetailUI.getContext(), str);
            luckyMoneyHKBeforeDetailUI.finish();
            return null;
        }
        r45.p43 p43Var = (r45.p43) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "do query detail: retcode: %s, retmsg: %s", java.lang.Integer.valueOf(p43Var.f382727d), p43Var.f382728e);
        if (p43Var.f382727d != 0) {
            java.lang.String str2 = com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI.f145132m;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(p43Var.f382728e)) {
                str2 = p43Var.f382728e;
            }
            db5.e1.T(luckyMoneyHKBeforeDetailUI.getContext(), str2);
            luckyMoneyHKBeforeDetailUI.finish();
            return null;
        }
        com.tencent.mm.plugin.luckymoney.model.e1 e17 = com.tencent.mm.plugin.luckymoney.model.g5.e(p43Var);
        com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = new com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch();
        luckyMoneyEmojiSwitch.f145156g = p43Var.I;
        luckyMoneyEmojiSwitch.f145155f = p43Var.H;
        luckyMoneyHKBeforeDetailUI.getIntent().putExtra("key_emoji_switch", luckyMoneyEmojiSwitch);
        gb3.l.b(this.f452896a, e17);
        java.lang.String str3 = com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI.f145132m;
        luckyMoneyHKBeforeDetailUI.V6(false);
        return null;
    }
}
