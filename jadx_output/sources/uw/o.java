package uw;

/* loaded from: classes.dex */
public final class o implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f431500d;

    public o(android.content.Context context) {
        this.f431500d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        try {
            o25.z.d(this.f431500d, "weixin://dl/SettingsNotifyRemindSwitch", "", 0, "", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrsNotificationPushUtils", "gotoNotificationSettingsPage error: " + e17.getMessage());
        }
        uw.p.a(uw.p.f431501a, 2);
        dialogInterface.dismiss();
    }
}
