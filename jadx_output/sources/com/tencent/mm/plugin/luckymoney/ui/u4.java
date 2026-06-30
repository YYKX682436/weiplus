package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes8.dex */
public class u4 implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k2 f147486d;

    public u4(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, com.tencent.mm.ui.widget.dialog.k2 k2Var) {
        this.f147486d = k2Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface dialogInterface) {
        android.view.View decorView = this.f147486d.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(com.tencent.mm.ui.bk.C() ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
    }
}
