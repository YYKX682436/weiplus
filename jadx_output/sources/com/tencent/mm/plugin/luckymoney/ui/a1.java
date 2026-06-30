package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class a1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI f146688d;

    public a1(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI luckyMoneyCanShareListUI) {
        this.f146688d = luckyMoneyCanShareListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f146688d.finish();
        return true;
    }
}
