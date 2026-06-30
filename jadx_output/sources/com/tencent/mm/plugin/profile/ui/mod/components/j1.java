package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class j1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.k1 f153939d;

    public j1(com.tencent.mm.plugin.profile.ui.mod.components.k1 k1Var) {
        this.f153939d = k1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        com.tencent.mm.ui.base.FlowLayout flowLayout;
        kotlin.jvm.internal.o.g(s17, "s");
        int f17 = com.tencent.mm.ui.tools.v4.f(s17.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModRemarkUI", "afterTextChanged() MAX_REMARK_NAME_LENGTH:%s curLength:%s", 64, java.lang.Integer.valueOf(f17));
        com.tencent.mm.plugin.profile.ui.mod.components.k1 k1Var = this.f153939d;
        if (f17 >= 64 && (flowLayout = k1Var.f311390e) != null) {
            flowLayout.setVisibility(8);
        }
        k1Var.e7();
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
