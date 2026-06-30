package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class e implements uc0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g f154043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMLimitedClearEditText f154044b;

    public e(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g gVar, com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText) {
        this.f154043a = gVar;
        this.f154044b = mMLimitedClearEditText;
    }

    @Override // uc0.p
    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g gVar = this.f154043a;
        gVar.f154061t[1] = 1;
        if (!x51.t1.b(str)) {
            gVar.f154061t[2] = 1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = this.f154044b;
        sb6.append((java.lang.Object) mMLimitedClearEditText.getText());
        sb6.append(str);
        mMLimitedClearEditText.setText(sb6.toString());
        mMLimitedClearEditText.clearFocus();
        android.widget.TextView textView = gVar.f311478f;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
