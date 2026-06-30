package hq5;

/* loaded from: classes12.dex */
public final class j extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.m f283236d;

    public j(hq5.m mVar) {
        this.f283236d = mVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        android.app.Notification.Builder builder;
        java.util.List i17 = kz5.c0.i(1, 2, 6, 15, 7, 8);
        hq5.m mVar = this.f283236d;
        if (!i17.contains(java.lang.Integer.valueOf(mVar.f283247g))) {
            com.tencent.mars.xlog.Log.w(mVar.f283244d, "onAppBackground() called, state: " + mVar.f283247g);
            return;
        }
        com.tencent.mars.xlog.Log.i(mVar.f283244d, "onAppBackground() called, showNotification");
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
            pf5.j0.a(intent, hq5.u0.class);
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, 201326592);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.app.NotificationManager T6 = mVar.T6(context);
                if (T6.getNotificationChannel("WeDropPushChannel") == null) {
                    T6.createNotificationChannel(new android.app.NotificationChannel("WeDropPushChannel", "WeDropPushChannel", 4));
                }
                builder = new android.app.Notification.Builder(context, "WeDropPushChannel");
            } else {
                builder = new android.app.Notification.Builder(context);
            }
            builder.setContentTitle(context.getString(mVar.f283246f ? com.tencent.mm.R.string.f491689nt1 : com.tencent.mm.R.string.f491688nt0)).setStyle(new android.app.Notification.BigTextStyle().bigText("")).setSmallIcon(com.tencent.mm.R.drawable.c7v).setAutoCancel(true).setContentIntent(activity).setWhen(java.lang.System.currentTimeMillis());
            mVar.T6(context).notify(mVar.f283245e, builder.build());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(mVar.f283244d, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        hq5.m mVar = this.f283236d;
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context != null) {
                mVar.T6(context).cancel(mVar.f283245e);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(mVar.f283244d, e17, "", new java.lang.Object[0]);
        }
    }
}
