package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class f implements uc0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.h f153901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMLimitedClearEditText f153902b;

    public f(com.tencent.mm.plugin.profile.ui.mod.components.h hVar, com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText) {
        this.f153901a = hVar;
        this.f153902b = mMLimitedClearEditText;
    }

    @Override // uc0.p
    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.profile.ui.mod.components.h hVar = this.f153901a;
        hVar.f153920t[1] = 1;
        if (!x51.t1.b(str)) {
            hVar.f153920t[2] = 1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = this.f153902b;
        sb6.append((java.lang.Object) mMLimitedClearEditText.getText());
        sb6.append(str);
        mMLimitedClearEditText.setText(sb6.toString());
        mMLimitedClearEditText.clearFocus();
        android.widget.TextView textView = hVar.f311391f;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
