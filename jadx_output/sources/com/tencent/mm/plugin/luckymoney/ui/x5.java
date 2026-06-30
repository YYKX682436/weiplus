package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public class x5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI f147672d;

    public x5(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI luckyMoneyIndexUI) {
        this.f147672d = luckyMoneyIndexUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f147672d.finish();
        return true;
    }
}
