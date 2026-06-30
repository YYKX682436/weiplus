package qo5;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f365664b;

    /* renamed from: c, reason: collision with root package name */
    public static android.content.Intent f365665c;

    /* renamed from: d, reason: collision with root package name */
    public static long f365666d;

    /* renamed from: a, reason: collision with root package name */
    public static final qo5.b f365663a = new qo5.b();

    /* renamed from: e, reason: collision with root package name */
    public static final qo5.a f365667e = new qo5.a();

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPVoIPNotificationHelper", "cancelNotify: ");
        ((com.tencent.mm.booter.notification.x) mo3.f.f330406a).f(41);
        f365667e.dead();
    }

    public final android.widget.RemoteViews b(java.lang.String str, boolean z17, boolean z18) {
        android.widget.RemoteViews remoteViews;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(z17 ? com.tencent.mm.R.string.f493470kc3 : com.tencent.mm.R.string.f493469kc2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (!ip.b.a()) {
            if (!fp.h.c(31) || com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().targetSdkVersion < 31) {
                remoteViews = new android.widget.RemoteViews(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.R.layout.d4p);
                remoteViews.setTextViewText(com.tencent.mm.R.id.pjm, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f490495wp));
                remoteViews.setTextViewText(com.tencent.mm.R.id.kfu, string);
            } else if (z18) {
                remoteViews = new android.widget.RemoteViews(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.R.layout.eqj);
                remoteViews.setTextViewText(com.tencent.mm.R.id.kfu, string);
            } else {
                remoteViews = new android.widget.RemoteViews(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.R.layout.eqi);
                remoteViews.setTextViewText(com.tencent.mm.R.id.pjm, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f490495wp));
                remoteViews.setTextViewText(com.tencent.mm.R.id.kfu, string);
            }
            return remoteViews;
        }
        android.widget.RemoteViews remoteViews2 = new android.widget.RemoteViews(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.R.layout.d4o);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        java.lang.String d17 = n17 != null ? n17.d1() : null;
        ((sg3.a) v0Var).getClass();
        java.lang.String e17 = c01.a2.e(d17);
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap b17 = com.tencent.mm.modelavatar.g.b(str, false, 20, null);
        remoteViews2.setTextViewText(com.tencent.mm.R.id.f486168kg0, e17);
        remoteViews2.setTextViewText(com.tencent.mm.R.id.kg7, string);
        remoteViews2.setImageViewBitmap(com.tencent.mm.R.id.kfq, b17);
        remoteViews2.setImageViewResource(com.tencent.mm.R.id.pjk, com.tencent.mm.R.drawable.btt);
        remoteViews2.setImageViewResource(com.tencent.mm.R.id.kfv, z17 ? com.tencent.mm.R.drawable.btp : com.tencent.mm.R.drawable.btq);
        return remoteViews2;
    }

    public final void c(boolean z17) {
        java.lang.String str;
        android.os.Bundle extras;
        android.os.Bundle extras2;
        android.os.Bundle extras3;
        android.content.Intent intent = f365665c;
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPVoIPNotificationHelper", "refreshService: serviceIntent is null");
            return;
        }
        if (intent == null || (extras3 = intent.getExtras()) == null || (str = extras3.getString("Voip_User")) == null) {
            str = "";
        }
        android.content.Intent intent2 = f365665c;
        boolean z18 = false;
        boolean z19 = (intent2 == null || (extras2 = intent2.getExtras()) == null) ? false : extras2.getBoolean("Voip_VideoCall", false);
        android.content.Intent intent3 = f365665c;
        if (intent3 != null && (extras = intent3.getExtras()) != null) {
            z18 = extras.getBoolean("Voip_CallInMulti", false);
        }
        d(str, z19, z18, z17);
    }

    public final void d(java.lang.String username, boolean z17, boolean z18, boolean z19) {
        java.lang.Object m521constructorimpl;
        java.lang.Object m521constructorimpl2;
        java.lang.String str;
        android.os.Bundle extras;
        android.os.Bundle extras2;
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VoIPMPVoIPNotificationHelper", "startFGS isBindVoIPForegroundService " + f365664b + " username：" + username + " videoCall:" + z17, new java.lang.Object[0]);
        if (fp.h.c(26)) {
            if (f365664b) {
                android.content.Intent intent = f365665c;
                if (intent == null || (extras2 = intent.getExtras()) == null || (str = extras2.getString("Voip_User")) == null) {
                    str = "";
                }
                android.content.Intent intent2 = f365665c;
                if (!((kotlin.jvm.internal.o.b(str, username) && z17 == ((intent2 == null || (extras = intent2.getExtras()) == null) ? false : extras.getBoolean("Voip_VideoCall", false)) && f365665c != null) ? false : true) && !z19) {
                    return;
                }
            }
            android.content.Intent intent3 = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.voip.widget.VoipNewForegroundService.class);
            intent3.putExtra("Voip_User", username);
            intent3.putExtra("Voip_VideoCall", z17);
            intent3.putExtra("is_ilink_voip", true);
            intent3.putExtra("Voip_CallInMulti", z18);
            f365665c = intent3;
            if (z17) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                if (!j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.CAMERA", "android.permission.RECORD_AUDIO")) {
                    return;
                }
            }
            if (!z17) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                if (!j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.RECORD_AUDIO")) {
                    return;
                }
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.tencent.mm.sdk.platformtools.x2.f193071a.startService(intent3);
                f365664b = true;
                m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl == null) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPVoIPNotificationHelper", "bindServiceIfNeed: startService err", m524exceptionOrNullimpl);
            try {
                com.tencent.mm.sdk.platformtools.x2.f193071a.startForegroundService(intent3);
                f365664b = true;
                m521constructorimpl2 = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th7) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
            }
            java.lang.Throwable m524exceptionOrNullimpl2 = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl2);
            if (m524exceptionOrNullimpl2 != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPVoIPNotificationHelper", "bindServiceIfNeed: startForegroundService err", m524exceptionOrNullimpl2);
            }
            f365664b = false;
        }
    }
}
