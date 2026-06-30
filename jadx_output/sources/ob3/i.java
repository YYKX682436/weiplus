package ob3;

/* loaded from: classes5.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f344061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ob3.k f344062e;

    public i(ob3.k kVar, android.view.View view) {
        this.f344062e = kVar;
        this.f344061d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        ob3.k kVar = this.f344062e;
        boolean isShown = kVar.f344067g.f145040t.isShown();
        com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = kVar.f344067g;
        android.view.View view = this.f344061d;
        if (!isShown && view.isShown()) {
            android.view.View view2 = wxaLuckyMoneyPrepareUI.f145040t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$14$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$14$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        wxaLuckyMoneyPrepareUI.f145038r.setXMode(kVar.f344065e);
        wxaLuckyMoneyPrepareUI.f145038r.setInputEditText((android.widget.EditText) view);
        ((android.view.inputmethod.InputMethodManager) wxaLuckyMoneyPrepareUI.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
