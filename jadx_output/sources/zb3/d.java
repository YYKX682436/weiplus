package zb3;

/* loaded from: classes.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI f471267d;

    public d(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI) {
        this.f471267d = snsLuckyMoneyPrepareUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = this.f471267d;
        intent.setClass(snsLuckyMoneyPrepareUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI.class);
        intent.addFlags(67108864);
        androidx.appcompat.app.AppCompatActivity context = snsLuckyMoneyPrepareUI.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        snsLuckyMoneyPrepareUI.finish();
    }
}
