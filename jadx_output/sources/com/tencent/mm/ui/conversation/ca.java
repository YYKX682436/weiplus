package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public class ca implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f207614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f207615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f207616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f207617g;

    public ca(android.content.SharedPreferences sharedPreferences, android.content.Context context, int i17, int i18) {
        this.f207614d = sharedPreferences;
        this.f207615e = context;
        this.f207616f = i17;
        this.f207617g = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f207614d.edit().putInt("show_rating_flag", 4).commit();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        o25.z.n(this.f207615e, "weixin://dl/feedback", null, 0, null, o45.cg.a(), new byte[0], null);
        com.tencent.mm.ui.conversation.ea.f207655a = null;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11216, 2, java.lang.Integer.valueOf(this.f207616f), java.lang.Integer.valueOf(this.f207617g));
    }
}
