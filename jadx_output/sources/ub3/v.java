package ub3;

/* loaded from: classes5.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI f426140d;

    public v(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI) {
        this.f426140d = luckyMoneyF2FReceiveUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI = this.f426140d;
        luckyMoneyF2FReceiveUI.f145108w.cancel();
        luckyMoneyF2FReceiveUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
