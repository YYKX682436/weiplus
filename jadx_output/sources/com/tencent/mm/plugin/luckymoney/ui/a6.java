package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public class a6 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.b6 f146694a;

    public a6(com.tencent.mm.plugin.luckymoney.ui.b6 b6Var) {
        this.f146694a = b6Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        int i19 = 1;
        if (i18 != 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 3, 0, 0, 0, 5);
            i19 = 2;
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 3, 0, 0, 0, 6);
        }
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.luckymoney.ui.b6 b6Var = this.f146694a;
        intent.setClass(b6Var.f146739d.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.class);
        intent.putExtra("key_username", b6Var.f146739d.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_type", i19);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI luckyMoneyIndexUI = b6Var.f146739d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyIndexUI, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyIndexUI$4$1", "onClick", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyIndexUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyIndexUI, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyIndexUI$4$1", "onClick", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
