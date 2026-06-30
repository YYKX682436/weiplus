package com.tencent.mm.ui.base.preference;

/* loaded from: classes9.dex */
public class c implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f197793a;

    public c(com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference) {
        this.f197793a = checkBoxPreference;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f197793a;
        com.tencent.mm.ui.base.preference.q0 q0Var = checkBoxPreference.f197771e;
        if (q0Var == null) {
            return;
        }
        q0Var.a(checkBoxPreference, valueOf);
    }
}
