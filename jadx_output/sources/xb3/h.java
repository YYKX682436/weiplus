package xb3;

/* loaded from: classes9.dex */
public class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI f452902a;

    public h(com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI) {
        this.f452902a = luckyMoneyHKReceiveUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI = this.f452902a;
        luckyMoneyHKReceiveUI.f145141o.setVisibility(0);
        com.tencent.mm.plugin.luckymoney.model.m5.H(luckyMoneyHKReceiveUI.f145142p);
        luckyMoneyHKReceiveUI.f145141o.setClickable(true);
        luckyMoneyHKReceiveUI.W6();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "do open hb, errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.r43 r43Var = (r45.r43) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "do open hb, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(r43Var.f384522d), r43Var.f384523e);
            int i17 = r43Var.f384522d;
            if (i17 == 0) {
                com.tencent.mm.plugin.luckymoney.ui.up.a(luckyMoneyHKReceiveUI.getContext(), com.tencent.mm.R.string.f492414gj5);
                r45.q34 q34Var = r43Var.I;
                if (q34Var != null) {
                    com.tencent.mm.wallet_core.model.p0.d(q34Var).g(luckyMoneyHKReceiveUI.getContext(), new xb3.g(this, r43Var));
                    return java.lang.Boolean.TRUE;
                }
                com.tencent.mm.plugin.wallet_core.utils.n b17 = com.tencent.mm.plugin.wallet_core.utils.n.b(r43Var.L);
                if (com.tencent.mm.plugin.wallet_core.utils.l0.d(b17)) {
                    luckyMoneyHKReceiveUI.setContentViewVisibility(4);
                    com.tencent.mm.plugin.wallet_core.utils.l0 l0Var = new com.tencent.mm.plugin.wallet_core.utils.l0(luckyMoneyHKReceiveUI);
                    l0Var.f180921a = true;
                    l0Var.b(b17, new com.tencent.mm.plugin.wallet_core.utils.b0(l0Var));
                    return java.lang.Boolean.TRUE;
                }
                com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI.V6(luckyMoneyHKReceiveUI, r43Var);
            } else if (i17 == 416) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "need verify realname");
                r45.lj5 lj5Var = r43Var.D;
                if (lj5Var != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ".hk.ui.LuckyMoneyHKReceiveUI");
                    bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                    luckyMoneyHKReceiveUI.f145141o.setBackgroundResource(com.tencent.mm.R.drawable.c3t);
                    int i18 = lj5Var.f379523d;
                    if (i18 == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "showRealnameDialog");
                        zs4.q.g(luckyMoneyHKReceiveUI.getContext(), lj5Var.f379524e, 0, lj5Var.f379525f, lj5Var.f379526g, bundle, false, null, null, 1003, 2);
                    } else if (i18 == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(lj5Var.f379527h)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "showUploadCreditDialog");
                        zs4.q.h(luckyMoneyHKReceiveUI.getContext(), lj5Var.f379524e, lj5Var.f379527h, lj5Var.f379525f, lj5Var.f379526g, false, null);
                    }
                }
            } else {
                java.lang.String str = com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI.B;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(r43Var.f384523e)) {
                    str = r43Var.f384523e;
                }
                db5.e1.T(luckyMoneyHKReceiveUI.getContext(), str);
                luckyMoneyHKReceiveUI.finish();
            }
        } else {
            java.lang.String str2 = com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI.B;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(fVar.f70617c)) {
                str2 = fVar.f70617c;
            }
            db5.e1.T(luckyMoneyHKReceiveUI.getContext(), str2);
            luckyMoneyHKReceiveUI.finish();
        }
        return null;
    }
}
