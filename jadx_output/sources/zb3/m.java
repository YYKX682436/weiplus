package zb3;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f471276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zb3.o f471277e;

    public m(zb3.o oVar, android.view.View view) {
        this.f471277e = oVar;
        this.f471276d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        zb3.o oVar = this.f471277e;
        boolean isShown = oVar.f471282g.f145763q.isShown();
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = oVar.f471282g;
        android.view.View view = this.f471276d;
        if (!isShown && view.isShown()) {
            com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.V6(snsLuckyMoneyPrepareUI);
        }
        snsLuckyMoneyPrepareUI.f145762p.setXMode(oVar.f471280e);
        snsLuckyMoneyPrepareUI.f145762p.setInputEditText((android.widget.EditText) view);
        ((android.view.inputmethod.InputMethodManager) snsLuckyMoneyPrepareUI.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
