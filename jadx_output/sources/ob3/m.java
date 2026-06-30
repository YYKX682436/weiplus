package ob3;

/* loaded from: classes5.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ob3.n f344072d;

    public m(ob3.n nVar) {
        this.f344072d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ob3.n nVar = this.f344072d;
        android.view.View view = nVar.f344077h.f145040t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        nVar.f344075f.requestFocus();
        com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = nVar.f344077h;
        com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow = wxaLuckyMoneyPrepareUI.f145038r;
        if (myKeyboardWindow != null) {
            myKeyboardWindow.setInputEditText(nVar.f344074e);
        }
        wxaLuckyMoneyPrepareUI.f145038r.setXMode(nVar.f344076g);
    }
}
