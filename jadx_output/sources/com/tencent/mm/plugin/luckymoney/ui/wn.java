package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class wn implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f147659d;

    public wn(com.tencent.mm.plugin.luckymoney.ui.co coVar) {
        this.f147659d = coVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.luckymoney.ui.co coVar = this.f147659d;
        g4Var.d(0, coVar.M.getResources().getColor(com.tencent.mm.R.color.f478532ac), coVar.M.getString(com.tencent.mm.R.string.gmr));
    }
}
