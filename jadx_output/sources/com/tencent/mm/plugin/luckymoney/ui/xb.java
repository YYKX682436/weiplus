package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class xb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f147682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147683e;

    public xb(com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147682d = m1Var;
        this.f147683e = luckyMoneyNewPrepareUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialog, int i17) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        if (com.tencent.mm.plugin.luckymoney.model.h6.K(this.f147682d)) {
            this.f147683e.finish();
        }
    }
}
