package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public class z9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f208312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f208313e;

    public z9(android.content.SharedPreferences sharedPreferences, android.content.Context context) {
        this.f208312d = sharedPreferences;
        this.f208313e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f208312d.edit().putInt("show_rating_flag", 2).commit();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        com.tencent.mm.ui.conversation.ea.f207655a = null;
        com.tencent.mm.ui.conversation.ea.a(this.f208313e);
    }
}
