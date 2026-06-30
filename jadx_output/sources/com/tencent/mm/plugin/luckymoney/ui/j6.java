package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class j6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI f147047d;

    public j6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI) {
        this.f147047d = luckyMoneyMyRecordUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f147047d.finish();
        return true;
    }
}
