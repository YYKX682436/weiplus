package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class p6 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI f147307d;

    public p6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI) {
        this.f147307d = luckyMoneyMyRecordUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 >= 1) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = this.f147307d;
            if (i17 <= luckyMoneyMyRecordUI.f146166v.getCount()) {
                db5.e1.e(luckyMoneyMyRecordUI, luckyMoneyMyRecordUI.getResources().getString(com.tencent.mm.R.string.glj), null, luckyMoneyMyRecordUI.getResources().getString(com.tencent.mm.R.string.f490367t0), new com.tencent.mm.plugin.luckymoney.ui.o6(this, i17 - 1));
            }
        }
        return true;
    }
}
