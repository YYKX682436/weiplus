package ob3;

/* loaded from: classes5.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f344073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f344074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f344075f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f344076g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI f344077h;

    public n(com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI, boolean z17, android.widget.EditText editText, android.view.View view, int i17) {
        this.f344077h = wxaLuckyMoneyPrepareUI;
        this.f344073d = z17;
        this.f344074e = editText;
        this.f344075f = view;
        this.f344076g = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = this.f344077h;
        boolean isShown = wxaLuckyMoneyPrepareUI.f145040t.isShown();
        android.widget.EditText editText = this.f344074e;
        boolean z17 = this.f344073d;
        if (isShown && !z17) {
            com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow = wxaLuckyMoneyPrepareUI.f145038r;
            if (myKeyboardWindow != null) {
                myKeyboardWindow.setInputEditText(editText);
            }
        } else if (!wxaLuckyMoneyPrepareUI.f145040t.isShown() && !z17) {
            ((android.view.inputmethod.InputMethodManager) wxaLuckyMoneyPrepareUI.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new ob3.m(this), 200L);
        } else if (z17) {
            android.view.View view2 = wxaLuckyMoneyPrepareUI.f145040t;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.view.inputmethod.InputMethodManager) wxaLuckyMoneyPrepareUI.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
