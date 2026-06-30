package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public class da implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f207636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f207638f;

    public da(android.content.SharedPreferences sharedPreferences, int i17, int i18) {
        this.f207636d = sharedPreferences;
        this.f207637e = i17;
        this.f207638f = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f207636d.edit().putInt("show_rating_flag", 4).commit();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        com.tencent.mm.ui.conversation.ea.f207655a = null;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11216, 1, java.lang.Integer.valueOf(this.f207637e), java.lang.Integer.valueOf(this.f207638f));
    }
}
