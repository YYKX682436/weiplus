package zb3;

/* loaded from: classes9.dex */
public class o implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f471279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f471280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f471281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI f471282g;

    public o(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI, boolean z17, int i17, android.widget.EditText editText) {
        this.f471282g = snsLuckyMoneyPrepareUI;
        this.f471279d = z17;
        this.f471280e = i17;
        this.f471281f = editText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (!view.isFocused() || this.f471279d) {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new zb3.n(this), 200L);
        } else {
            ((android.view.inputmethod.InputMethodManager) this.f471282g.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new zb3.m(this, view), 300L);
        }
    }
}
