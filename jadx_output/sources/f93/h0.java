package f93;

/* loaded from: classes11.dex */
public final class h0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f260346d;

    public h0(com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel) {
        this.f260346d = new com.tencent.mm.sdk.platformtools.b4(new f93.g0(contactEditLabel), false);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f260346d;
        b4Var.d();
        b4Var.c(500L, 500L);
    }
}
