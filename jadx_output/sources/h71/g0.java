package h71;

/* loaded from: classes.dex */
public class g0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI f279390d;

    public g0(com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI securityAccountVerifyUI) {
        this.f279390d = securityAccountVerifyUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        this.f279390d.enableOptionMenu((editable == null || com.tencent.mm.sdk.platformtools.t8.K0(editable.toString())) ? false : true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
