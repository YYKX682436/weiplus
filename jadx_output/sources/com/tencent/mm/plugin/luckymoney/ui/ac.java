package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public final class ac implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146706d;

    public ac(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f146706d = luckyMoneyNewPrepareUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface arg0, int i17) {
        kotlin.jvm.internal.o.g(arg0, "arg0");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146706d;
        intent.setClass(luckyMoneyNewPrepareUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.class);
        intent.putExtra("key_type", 1);
        intent.putExtra("key_username", luckyMoneyNewPrepareUI.getIntent().getStringExtra("key_username"));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = this.f146706d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyNewPrepareUI2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$onSceneEnd$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyNewPrepareUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyNewPrepareUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$onSceneEnd$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
