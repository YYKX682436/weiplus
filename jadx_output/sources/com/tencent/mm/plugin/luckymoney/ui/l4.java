package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class l4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f147124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI f147126c;

    public l4(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, com.tencent.mm.ui.widget.dialog.u3 u3Var, java.lang.String str) {
        this.f147126c = luckyMoneyHistoryEnvelopeUI;
        this.f147124a = u3Var;
        this.f147125b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "do confirm errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = this.f147126c;
        if (luckyMoneyHistoryEnvelopeUI.isDestroyed() || luckyMoneyHistoryEnvelopeUI.isFinishing()) {
            return null;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f147124a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            com.tencent.mm.wallet_core.ui.r1.K(luckyMoneyHistoryEnvelopeUI.getContext(), fVar.f70617c);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "retcode: %s", java.lang.Integer.valueOf(((r45.g80) fVar.f70618d).f374977d));
        r45.g80 g80Var = (r45.g80) fVar.f70618d;
        if (g80Var.f374977d != 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(g80Var.f374978e)) {
                return null;
            }
            com.tencent.mm.wallet_core.ui.r1.M(luckyMoneyHistoryEnvelopeUI.getContext(), ((r45.g80) fVar.f70618d).f374978e);
            return null;
        }
        java.util.ArrayList arrayList = luckyMoneyHistoryEnvelopeUI.f146136w;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            in5.c cVar = (in5.c) it.next();
            if ((cVar instanceof com.tencent.mm.plugin.luckymoney.ui.i5) && ((com.tencent.mm.plugin.luckymoney.ui.i5) cVar).f147015d.f389500f.equals(this.f147125b)) {
                arrayList.remove(cVar);
                break;
            }
            i17++;
        }
        if (i17 < 0) {
            return null;
        }
        luckyMoneyHistoryEnvelopeUI.f146135v.notifyItemRemoved(i17);
        return null;
    }
}
