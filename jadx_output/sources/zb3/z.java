package zb3;

/* loaded from: classes9.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f471300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f471301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI f471302f;

    public z(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI, android.widget.EditText editText, android.widget.EditText editText2) {
        this.f471302f = snsLuckyMoneyPrepareUI;
        this.f471300d = editText;
        this.f471301e = editText2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f471300d.setOnClickListener(null);
        this.f471301e.setOnClickListener(null);
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = this.f471302f;
        snsLuckyMoneyPrepareUI.setEditFocusListener(snsLuckyMoneyPrepareUI.f145757h, 2, false);
        snsLuckyMoneyPrepareUI.setEditFocusListener(snsLuckyMoneyPrepareUI.f145756g, 0, false);
        snsLuckyMoneyPrepareUI.f145762p.setXMode(0);
        snsLuckyMoneyPrepareUI.f145762p.setInputEditText((android.widget.EditText) view);
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.V6(snsLuckyMoneyPrepareUI);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
