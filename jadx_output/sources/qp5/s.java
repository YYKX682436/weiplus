package qp5;

/* loaded from: classes9.dex */
public class s implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f365849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView f365850e;

    public s(com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView, android.content.Context context) {
        this.f365850e = editHintPasswdView;
        this.f365849d = context;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "after textchange");
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = this.f365850e;
        if (editHintPasswdView.f214155s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "afterTextChanged accessibilitySecuritySwitchSvrOpen");
            editHintPasswdView.f214154r = editHintPasswdView.f214143d.getInputLength();
        } else {
            editHintPasswdView.setContentDescription(this.f365849d.getString(com.tencent.mm.R.string.l3p, editHintPasswdView.f214143d.getText().toString().length() + ""));
        }
        qp5.t tVar = editHintPasswdView.f214149m;
        if (tVar != null) {
            tVar.onInputValidChange(editHintPasswdView.c());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
