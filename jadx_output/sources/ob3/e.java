package ob3;

/* loaded from: classes5.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f344049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f344050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI f344051f;

    public e(com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI, android.widget.EditText editText, android.widget.EditText editText2) {
        this.f344051f = wxaLuckyMoneyPrepareUI;
        this.f344049d = editText;
        this.f344050e = editText2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f344049d.setOnClickListener(null);
        this.f344050e.setOnClickListener(null);
        com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = this.f344051f;
        wxaLuckyMoneyPrepareUI.setEditFocusListener(wxaLuckyMoneyPrepareUI.f145034n, 2, false);
        wxaLuckyMoneyPrepareUI.setEditFocusListener(wxaLuckyMoneyPrepareUI.f145033m, 0, false);
        wxaLuckyMoneyPrepareUI.f145038r.setXMode(2);
        wxaLuckyMoneyPrepareUI.f145038r.setInputEditText((android.widget.EditText) view);
        android.view.View view2 = wxaLuckyMoneyPrepareUI.f145040t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
