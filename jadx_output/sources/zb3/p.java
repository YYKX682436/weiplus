package zb3;

/* loaded from: classes9.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f471283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f471284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f471285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI f471286g;

    public p(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI, boolean z17, int i17, android.widget.EditText editText) {
        this.f471286g = snsLuckyMoneyPrepareUI;
        this.f471283d = z17;
        this.f471284e = i17;
        this.f471285f = editText;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = this.f471286g;
        boolean isShown = snsLuckyMoneyPrepareUI.f145763q.isShown();
        boolean z17 = this.f471283d;
        if (!isShown && !z17) {
            com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.V6(snsLuckyMoneyPrepareUI);
            snsLuckyMoneyPrepareUI.f145762p.setXMode(this.f471284e);
        } else if (z17) {
            snsLuckyMoneyPrepareUI.hideTenpayKB();
            ((android.view.inputmethod.InputMethodManager) snsLuckyMoneyPrepareUI.getContext().getSystemService("input_method")).showSoftInput(this.f471285f, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
