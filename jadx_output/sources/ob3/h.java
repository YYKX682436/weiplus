package ob3;

/* loaded from: classes5.dex */
public class h implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f344058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f344059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI f344060f;

    public h(com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI, android.widget.EditText editText, android.widget.EditText editText2) {
        this.f344060f = wxaLuckyMoneyPrepareUI;
        this.f344058d = editText;
        this.f344059e = editText2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        this.f344058d.setOnClickListener(null);
        this.f344059e.setOnClickListener(null);
        com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = this.f344060f;
        wxaLuckyMoneyPrepareUI.setEditFocusListener(wxaLuckyMoneyPrepareUI.f145034n, 2, false);
        wxaLuckyMoneyPrepareUI.setEditFocusListener(wxaLuckyMoneyPrepareUI.f145033m, 0, false);
    }
}
