package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class z implements com.tencent.mm.ui.base.preference.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.EditPreference f197860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f197861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.a0 f197862c;

    public z(com.tencent.mm.ui.base.preference.a0 a0Var, com.tencent.mm.ui.base.preference.EditPreference editPreference, com.tencent.mm.ui.base.preference.Preference preference) {
        this.f197862c = a0Var;
        this.f197860a = editPreference;
        this.f197861b = preference;
    }

    @Override // com.tencent.mm.ui.base.preference.o
    public void a(boolean z17) {
        com.tencent.mm.ui.base.preference.h0 h0Var;
        android.content.SharedPreferences sharedPreferences;
        if (z17) {
            com.tencent.mm.ui.base.preference.a0 a0Var = this.f197862c;
            a0Var.f197791d.dirty = true;
            com.tencent.mm.ui.base.preference.EditPreference editPreference = this.f197860a;
            if (editPreference.f197785v) {
                sharedPreferences = a0Var.f197791d.f197762sp;
                sharedPreferences.edit().putString(this.f197861b.f197780q, editPreference.P).commit();
            }
            h0Var = a0Var.f197791d.adapter;
            h0Var.notifyDataSetChanged();
        }
    }
}
