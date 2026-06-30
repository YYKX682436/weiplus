package qm;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f364622a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public int a(android.content.Context context, boolean z17, boolean z18, android.app.Notification notification, java.lang.String str) {
        int i17;
        boolean z19;
        boolean z27;
        boolean z28;
        int i18;
        android.app.Notification notification2 = notification;
        int i19 = 1;
        boolean z29 = true;
        if (fp.h.c(26)) {
            if (notification2 == null) {
                notification2 = new android.app.Notification();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NotificationDefaults", "begin initDefaults, isNeedSound: %B, isNeedShake: %B, n.defaults: %d, n.vibrate: %s, n.sound: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(notification2.defaults), qm.z.a(notification2.vibrate), notification2.sound);
            if (z18) {
                notification2.vibrate = com.tencent.mm.sdk.platformtools.t8.f192990b;
            }
            if (z17) {
                android.util.Pair i27 = ip.l.i();
                java.lang.String str2 = (java.lang.String) i27.second;
                android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
                if (!(audioManager == null ? false : audioManager.isWiredHeadsetOn())) {
                    if (str2 != null) {
                        notification2.sound = ((java.lang.Boolean) i27.first).booleanValue() ? com.tencent.mm.sdk.platformtools.i1.b(context, com.tencent.mm.vfs.r6.j(new java.io.File((java.lang.String) i27.second))) : android.net.Uri.parse(str2);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.NotificationDefaults", "end initDefaults, defaults: %d, n.vibrate: %s, n.sound: %s", java.lang.Integer.valueOf(i19), qm.z.a(notification2.vibrate), notification2.sound);
                    this.f364622a = i19;
                    return i19;
                }
                notification2.sound = null;
            }
            i19 = 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.NotificationDefaults", "end initDefaults, defaults: %d, n.vibrate: %s, n.sound: %s", java.lang.Integer.valueOf(i19), qm.z.a(notification2.vibrate), notification2.sound);
            this.f364622a = i19;
            return i19;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationDefaults", "begin initDefaults, isNeedSound: %B, isNeedShake: %B, n.defaults: %d, n.vibrate: %s, n.sound: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(notification2.defaults), notification2.vibrate, notification2.sound);
        if (z17) {
            android.media.AudioManager audioManager2 = (android.media.AudioManager) context.getSystemService("audio");
            if (audioManager2 == null ? false : audioManager2.isWiredHeadsetOn()) {
                z19 = true;
                i17 = 0;
            } else {
                i17 = 1;
                z19 = false;
            }
        } else {
            i17 = 0;
            z19 = false;
        }
        if (z18) {
            i17 |= 2;
        }
        android.util.Pair i28 = ip.l.i();
        java.lang.String str3 = (java.lang.String) i28.second;
        boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        boolean z38 = wo.v1.f447833m.f447755m != 2;
        if (z38) {
            if (((i17 & 2) > 0) == true) {
                i17 &= -3;
                com.tencent.mm.sdk.platformtools.t8.L1(context, true);
                z27 = true;
            } else {
                z27 = false;
            }
            if (!((i17 & 1) > 0) == true || z19) {
                z28 = false;
            } else {
                i17 &= -2;
                (qm.n.f364643c ? qm.n.f364642b : qm.n.f364641a).a(str3, false, ((java.lang.Boolean) i28.first).booleanValue());
                z28 = true;
            }
        } else {
            z27 = false;
            z28 = false;
        }
        if (z19) {
            i18 = i17 & (-2);
            (qm.n.f364643c ? qm.n.f364642b : qm.n.f364641a).a(str3, false, ((java.lang.Boolean) i28.first).booleanValue());
        } else {
            if (((i17 & 1) <= 0 ? (char) 0 : (char) 1) != 0 && str3 != null) {
                i17 &= -2;
                notification2.sound = ((java.lang.Boolean) i28.first).booleanValue() ? com.tencent.mm.sdk.platformtools.i1.b(context, com.tencent.mm.vfs.r6.j(new java.io.File((java.lang.String) i28.second))) : android.net.Uri.parse(str3);
            }
            i18 = i17;
            z29 = z28;
        }
        this.f364622a = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationDefaults", "end initDefaults, n.defaults: %d, n.vibrate: %s, n.sound: %s, soundUri: %s, headset&Play: %B, SrvDeviceInfo.mCommonInfo.mmnotify is Enable: %B, isMMShake: %B, isMMPlaySound: %B", java.lang.Integer.valueOf(notification2.defaults), qm.z.a(notification2.vibrate), notification2.sound, str3, java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z38), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z29));
        return this.f364622a;
    }
}
