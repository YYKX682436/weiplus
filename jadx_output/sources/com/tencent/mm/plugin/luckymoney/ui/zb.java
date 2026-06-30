package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public final class zb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147776d;

    public zb(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147776d = luckyMoneyNewPrepareUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147776d;
        intent.putExtra("key_username", luckyMoneyNewPrepareUI.E1);
        intent.setClass(luckyMoneyNewPrepareUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI.class);
        intent.addFlags(67108864);
        androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewPrepareUI.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$onSceneEnd$4", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$onSceneEnd$4", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyNewPrepareUI.finish();
    }
}
