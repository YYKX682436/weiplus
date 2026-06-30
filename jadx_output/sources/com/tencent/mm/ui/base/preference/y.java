package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class y implements com.tencent.mm.ui.base.preference.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.DialogPreference f197857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f197858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.a0 f197859c;

    public y(com.tencent.mm.ui.base.preference.a0 a0Var, com.tencent.mm.ui.base.preference.DialogPreference dialogPreference, com.tencent.mm.ui.base.preference.Preference preference) {
        this.f197859c = a0Var;
        this.f197857a = dialogPreference;
        this.f197858b = preference;
    }

    @Override // com.tencent.mm.ui.base.preference.k
    public void a(boolean z17) {
        com.tencent.mm.ui.base.preference.h0 h0Var;
        android.content.SharedPreferences sharedPreferences;
        if (z17) {
            com.tencent.mm.ui.base.preference.a0 a0Var = this.f197859c;
            a0Var.f197791d.dirty = true;
            com.tencent.mm.ui.base.preference.DialogPreference dialogPreference = this.f197857a;
            if (dialogPreference.f197785v) {
                sharedPreferences = a0Var.f197791d.f197762sp;
                sharedPreferences.edit().putString(this.f197858b.f197780q, dialogPreference.L.f197829h).commit();
            }
            h0Var = a0Var.f197791d.adapter;
            h0Var.notifyDataSetChanged();
        }
    }
}
