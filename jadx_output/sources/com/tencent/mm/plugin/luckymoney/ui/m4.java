package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class m4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.n0 f147164d;

    public m4(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, com.tencent.mm.plugin.luckymoney.model.n0 n0Var) {
        this.f147164d = n0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.i iVar = this.f147164d.f213885c;
        if (iVar != null) {
            iVar.j();
        }
    }
}
