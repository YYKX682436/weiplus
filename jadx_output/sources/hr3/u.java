package hr3;

/* loaded from: classes11.dex */
public class u implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.AddDescriptionUI f284036d;

    public u(com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI, hr3.h hVar) {
        this.f284036d = addDescriptionUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int c17;
        com.tencent.mm.ui.tools.v4.b(400, editable.toString());
        com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI = this.f284036d;
        addDescriptionUI.f153629e.e(this);
        java.lang.String obj = editable.toString();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            int f17 = com.tencent.mm.ui.tools.v4.f(obj);
            com.tencent.mm.ui.tools.v4.d(400, obj);
            if (f17 > 400 && (c17 = com.tencent.mm.ui.tools.v4.c(400, obj)) > 0 && c17 < 400 && c17 < obj.length()) {
                addDescriptionUI.f153629e.setText(obj.substring(0, c17 + 1));
                com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = addDescriptionUI.f153629e;
                mMLimitedClearEditText.setSelection(mMLimitedClearEditText.getText().length());
                com.tencent.mm.ui.jk.a();
            }
        }
        addDescriptionUI.f153629e.b(this);
        addDescriptionUI.X6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
