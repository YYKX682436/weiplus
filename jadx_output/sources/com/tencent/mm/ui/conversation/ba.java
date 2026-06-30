package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public class ba implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f207485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f207486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f207487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f207488g;

    public ba(android.content.SharedPreferences sharedPreferences, boolean z17, int i17, int i18) {
        this.f207485d = sharedPreferences;
        this.f207486e = z17;
        this.f207487f = i17;
        this.f207488g = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.SharedPreferences sharedPreferences = this.f207485d;
        sharedPreferences.edit().putInt("show_rating_flag", 4).commit();
        boolean z17 = this.f207486e;
        int i18 = this.f207488g;
        int i19 = this.f207487f;
        if (z17) {
            sharedPreferences.edit().putBoolean("show_rating_again", false).commit();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11216, 3, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        } else {
            sharedPreferences.edit().putBoolean("show_rating_again", true).commit();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11216, 6, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        }
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        com.tencent.mm.ui.conversation.ea.f207655a = null;
    }
}
