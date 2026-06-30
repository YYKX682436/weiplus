package zb3;

/* loaded from: classes9.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f471297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f471298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI f471299f;

    public y(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI, android.widget.EditText editText, android.widget.EditText editText2) {
        this.f471299f = snsLuckyMoneyPrepareUI;
        this.f471297d = editText;
        this.f471298e = editText2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f471297d.setOnClickListener(null);
        this.f471298e.setOnClickListener(null);
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = this.f471299f;
        snsLuckyMoneyPrepareUI.setEditFocusListener(snsLuckyMoneyPrepareUI.f145757h, 2, false);
        snsLuckyMoneyPrepareUI.setEditFocusListener(snsLuckyMoneyPrepareUI.f145756g, 0, false);
        snsLuckyMoneyPrepareUI.f145762p.setXMode(2);
        snsLuckyMoneyPrepareUI.f145762p.setInputEditText((android.widget.EditText) view);
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.V6(snsLuckyMoneyPrepareUI);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
