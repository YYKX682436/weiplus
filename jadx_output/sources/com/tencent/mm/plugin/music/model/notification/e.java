package com.tencent.mm.plugin.music.model.notification;

/* loaded from: classes11.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService f150642c;

    /* renamed from: d, reason: collision with root package name */
    public android.app.NotificationManager f150643d;

    /* renamed from: e, reason: collision with root package name */
    public ll3.c1 f150644e;

    /* renamed from: g, reason: collision with root package name */
    public android.content.BroadcastReceiver f150646g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f150640a = false;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Bundle f150641b = null;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f150645f = new com.tencent.mm.plugin.music.model.notification.a(this);

    public static void b(android.view.View view, java.util.List list) {
        if (!(view instanceof android.view.ViewGroup)) {
            if (view instanceof android.widget.TextView) {
                list.add((android.widget.TextView) view);
            }
        } else {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                b(viewGroup.getChildAt(i17), list);
            }
        }
    }

    public final android.app.Notification a(android.content.Context context, ql3.a aVar, boolean z17) {
        android.content.Intent s07;
        if (aVar.f364576k2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Music.MMMusicNotification", "buildNotification: isFromTingPlayer should not reach here, TingMediaBrowserService handles notification now");
            s07 = null;
        } else {
            s07 = ll3.b1.f319141b.s0();
            this.f150641b = s07.getExtras();
            if (aVar.f364575j2) {
                s07.setClassName(context, "com.tencent.mm.plugin.mv.ui.MusicMvMainUI");
            } else {
                s07.setClassName(context, "com.tencent.mm.plugin.music.ui.MusicMainUI");
            }
        }
        if (s07 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Music.MMMusicNotification", "buildMusicNotification intent is null, build notification without contentIntent");
            z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
            android.app.Notification notification = k0Var.D;
            notification.icon = com.tencent.mm.R.drawable.c7v;
            notification.contentView = c(context, aVar, z17);
            return k0Var.b();
        }
        s07.putExtra("key_scene", 5);
        android.app.PendingIntent activity = com.tencent.mm.sdk.platformtools.t8.K0(s07.getAction()) ? android.app.PendingIntent.getActivity(context, 0, s07, fp.g0.a(134217728)) : android.app.PendingIntent.getBroadcast(context, 0, s07, fp.g0.a(134217728));
        z2.k0 k0Var2 = new z2.k0(context, "reminder_channel_id");
        k0Var2.f469463g = activity;
        android.app.Notification notification2 = k0Var2.D;
        notification2.icon = com.tencent.mm.R.drawable.c7v;
        notification2.contentView = c(context, aVar, z17);
        return k0Var2.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b7  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x00ad -> B:12:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.RemoteViews c(android.content.Context r18, ql3.a r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.music.model.notification.e.c(android.content.Context, ql3.a, boolean):android.widget.RemoteViews");
    }

    public void d(ql3.a aVar, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotification", "sendMusicPlayerEvent action:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
        am.jk jkVar = musicPlayerEvent.f54512g;
        jkVar.f7036b = i17;
        jkVar.f7040f = "";
        jkVar.f7037c = aVar.u0();
        jkVar.f7044j = "not from app brand appid";
        jkVar.f7041g = z17;
        musicPlayerEvent.b(android.os.Looper.getMainLooper());
    }
}
