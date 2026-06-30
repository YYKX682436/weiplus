package qp5;

/* loaded from: classes9.dex */
public class r implements com.tenpay.android.wechat.TenpaySecureEditText.IPasswdInputChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f365847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView f365848b;

    public r(com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView, android.content.Context context) {
        this.f365848b = editHintPasswdView;
        this.f365847a = context;
    }

    @Override // com.tenpay.android.wechat.TenpaySecureEditText.IPasswdInputChangeListener
    public void onInputChanged() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "secureEditText input change callback");
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = this.f365848b;
        if (editHintPasswdView.f214155s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "onInputChanged accessibilitySecuritySwitchSvrOpen");
            editHintPasswdView.f214154r = editHintPasswdView.f214143d.getInputLength();
        } else {
            editHintPasswdView.setContentDescription(this.f365847a.getString(com.tencent.mm.R.string.l3p, editHintPasswdView.f214143d.getInputLength() + ""));
        }
        qp5.t tVar = editHintPasswdView.f214149m;
        if (tVar != null) {
            tVar.onInputValidChange(editHintPasswdView.c());
        }
    }
}
