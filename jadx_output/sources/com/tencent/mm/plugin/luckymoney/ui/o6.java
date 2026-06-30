package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class o6 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.p6 f147263b;

    public o6(com.tencent.mm.plugin.luckymoney.ui.p6 p6Var, int i17) {
        this.f147263b = p6Var;
        this.f147262a = i17;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.p6 p6Var = this.f147263b;
        com.tencent.mm.plugin.luckymoney.model.o4 item = p6Var.f147307d.f146166v.getItem(this.f147262a);
        if (item != null) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = p6Var.f147307d;
            int i18 = this.f147262a;
            luckyMoneyMyRecordUI.D = i18;
            luckyMoneyMyRecordUI.getClass();
            if (i18 < 0 || i18 > luckyMoneyMyRecordUI.f146166v.getCount()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyMyRecordUI", "param is illegal");
            } else {
                luckyMoneyMyRecordUI.doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.b6(item.f145509t, item.f145508s, luckyMoneyMyRecordUI.f146154g, i18, "v1.0"));
            }
        }
    }
}
