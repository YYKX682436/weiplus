package uf5;

/* loaded from: classes10.dex */
public class t0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f427299d = new com.tencent.mm.sdk.platformtools.b4(new uf5.s0(this), false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.ContactMgrUIBase f427300e;

    public t0(com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase) {
        this.f427300e = contactMgrUIBase;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f427299d;
        b4Var.d();
        b4Var.c(500L, 500L);
    }
}
