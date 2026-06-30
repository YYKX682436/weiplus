package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public class b6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI f146739d;

    public b6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI luckyMoneyIndexUI) {
        this.f146739d = luckyMoneyIndexUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 3, 0, 0, 0, 4);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI luckyMoneyIndexUI = this.f146739d;
        linkedList.add(luckyMoneyIndexUI.getString(com.tencent.mm.R.string.glw));
        linkedList2.add(0);
        linkedList.add(luckyMoneyIndexUI.getString(com.tencent.mm.R.string.gly));
        linkedList2.add(1);
        db5.e1.d(luckyMoneyIndexUI.getContext(), "", linkedList, linkedList2, "", false, new com.tencent.mm.plugin.luckymoney.ui.a6(this));
        return true;
    }
}
