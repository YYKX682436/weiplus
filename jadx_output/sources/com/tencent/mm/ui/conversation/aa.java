package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public class aa implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f207444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f207445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f207446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f207447g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f207448h;

    public aa(android.content.SharedPreferences sharedPreferences, android.content.Context context, boolean z17, int i17, int i18) {
        this.f207444d = sharedPreferences;
        this.f207445e = context;
        this.f207446f = z17;
        this.f207447g = i17;
        this.f207448h = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.SharedPreferences sharedPreferences = this.f207444d;
        sharedPreferences.edit().putInt("show_rating_flag", 4).commit();
        java.lang.String str = "market://details?id=" + com.tencent.mm.sdk.platformtools.x2.f193072b;
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse(str));
        android.content.Context context = this.f207445e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/conversation/RatingDialogHelper$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/conversation/RatingDialogHelper$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        sharedPreferences.edit().putBoolean("show_rating_again", false).commit();
        com.tencent.mm.ui.conversation.ea.f207655a = null;
        boolean z17 = this.f207446f;
        int i18 = this.f207448h;
        int i19 = this.f207447g;
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11216, 5, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11216, 4, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        }
    }
}
