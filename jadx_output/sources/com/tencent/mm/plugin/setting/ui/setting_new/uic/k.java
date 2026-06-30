package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes8.dex */
public final class k implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.uic.n f162001d;

    public k(com.tencent.mm.plugin.setting.ui.setting_new.uic.n nVar) {
        this.f162001d = nVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.setting.ui.setting_new.uic.n nVar = this.f162001d;
        long j17 = nVar.f162009h + 1;
        nVar.f162009h = j17;
        if (!(charSequence == null || r26.n0.N(charSequence))) {
            java.lang.String obj = charSequence.toString();
            kotlinx.coroutines.r2 r2Var = nVar.f162008g;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = nVar.O6();
            nVar.f162008g = O6 != null ? kotlinx.coroutines.l.d(O6, null, null, new com.tencent.mm.plugin.setting.ui.setting_new.uic.j(this.f162001d, obj, j17, null), 3, null) : null;
            return;
        }
        kotlinx.coroutines.r2 r2Var2 = nVar.f162008g;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        j75.f Q6 = nVar.Q6();
        if (Q6 != null) {
            Q6.B3(new r24.c("", kz5.p0.f313996d, com.tencent.mm.plugin.setting.ui.setting_new.uic.n.T6(nVar)));
        }
    }
}
