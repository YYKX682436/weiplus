package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public class y9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f208274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f208275e;

    public y9(android.content.SharedPreferences sharedPreferences, android.content.Context context) {
        this.f208274d = sharedPreferences;
        this.f208275e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f208274d.edit().putInt("show_rating_flag", 1).commit();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        com.tencent.mm.ui.conversation.ea.f207655a = null;
        com.tencent.mm.ui.conversation.ea.b(this.f208275e, true);
    }
}
