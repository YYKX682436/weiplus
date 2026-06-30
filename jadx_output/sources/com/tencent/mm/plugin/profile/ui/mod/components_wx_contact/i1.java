package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class i1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 f154080d;

    public i1(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 j1Var) {
        this.f154080d = j1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        com.tencent.mm.ui.base.FlowLayout flowLayout;
        kotlin.jvm.internal.o.g(s17, "s");
        int f17 = com.tencent.mm.ui.tools.v4.f(s17.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModRemarkUI", "afterTextChanged() MAX_REMARK_NAME_LENGTH:%s curLength:%s", 64, java.lang.Integer.valueOf(f17));
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 j1Var = this.f154080d;
        if (f17 >= 64 && (flowLayout = j1Var.f311477e) != null) {
            flowLayout.setVisibility(8);
        }
        j1Var.d7();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }
}
