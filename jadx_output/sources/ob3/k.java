package ob3;

/* loaded from: classes5.dex */
public class k implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f344064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f344066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI f344067g;

    public k(com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI, boolean z17, int i17, android.widget.EditText editText) {
        this.f344067g = wxaLuckyMoneyPrepareUI;
        this.f344064d = z17;
        this.f344065e = i17;
        this.f344066f = editText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (!view.isFocused() || this.f344064d) {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new ob3.j(this), 200L);
        } else {
            ((android.view.inputmethod.InputMethodManager) this.f344067g.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new ob3.i(this, view), 300L);
        }
    }
}
