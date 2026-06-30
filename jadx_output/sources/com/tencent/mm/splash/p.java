package com.tencent.mm.splash;

/* loaded from: classes12.dex */
public class p implements android.os.Handler.Callback {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f193668g = new java.util.HashSet(java.util.Arrays.asList("com.tencent.mm.plugin.wear.model.service.WearDataLayerService", "com.tencent.mm.plugin.account.model.AccountAuthenticatorService", "com.tencent.mm.plugin.account.model.ContactsSyncService", "com.tencent.mm.plugin.hld.WxHldService", "com.tencent.mm.plugin.fcm.WCFirebaseMessagingService", "com.tencent.mm.plugin.fcm.FCMInstanceIDListenerService", "com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService", "com.tencent.smtt.sandbox.SandboxedProcessService0", "com.tencent.smtt.sandbox.SandboxedProcessService1", "com.google.firebase.iid.FirebaseInstanceIdService", "com.google.firebase.messaging.FirebaseMessagingService", "com.google.android.gms.auth.api.signin.RevocationBoundService"));

    /* renamed from: h, reason: collision with root package name */
    public static boolean f193669h = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f193670d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler.Callback f193671e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f193672f = false;

    public p(android.content.Context context, java.lang.Object obj, android.os.Handler.Callback callback) {
        this.f193670d = obj;
        this.f193671e = callback;
    }

    public final void a(java.lang.Object obj) {
        java.lang.Object obj2 = this.f193670d;
        if (fp.h.b(25)) {
            try {
                if (com.tencent.mm.splash.q.f193679g == null) {
                    java.lang.reflect.Field declaredField = java.lang.Class.forName("android.app.ActivityThread$ActivityClientRecord").getDeclaredField("mPreserveWindow");
                    declaredField.setAccessible(true);
                    com.tencent.mm.splash.q.f193679g = declaredField;
                }
                if (obj instanceof android.os.IBinder) {
                    if (com.tencent.mm.splash.q.f193680h == null) {
                        java.lang.reflect.Field declaredField2 = obj2.getClass().getDeclaredField("mActivities");
                        declaredField2.setAccessible(true);
                        com.tencent.mm.splash.q.f193680h = (java.util.Map) declaredField2.get(obj2);
                    }
                    obj = com.tencent.mm.splash.q.f193680h.get(obj);
                }
                com.tencent.mm.splash.j.d("WxSplash.SplashHackHandlerCallback", "preserveWindow is %s, will set false", java.lang.Boolean.valueOf(((java.lang.Boolean) com.tencent.mm.splash.q.f193679g.get(obj)).booleanValue()));
                com.tencent.mm.splash.q.f193679g.set(obj, java.lang.Boolean.FALSE);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.splash.j.e(e17, "");
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int indexOf;
        com.tencent.mm.splash.p pVar;
        if (this.f193672f) {
            com.tencent.mm.splash.j.d("WxSplash.SplashHackHandlerCallback", "found a infinite call loop", new java.lang.Object[0]);
            return false;
        }
        f193669h = false;
        com.tencent.mm.splash.j.d("WxSplash.SplashHackHandlerCallback", "before handleMessage %s, splash %s, pending early %s, obj %s", java.lang.Integer.valueOf(message.what), java.lang.Boolean.valueOf(com.tencent.mm.splash.j.f193650i), java.lang.Boolean.valueOf(com.tencent.mm.splash.j.f193651j), message.obj);
        if (message.what == 987654321 && (pVar = com.tencent.mm.splash.q.f193677e) != null && message.obj == pVar) {
            message.arg2 = 1;
            return true;
        }
        if (com.tencent.mm.splash.j.f193650i && !com.tencent.mm.splash.j.f193651j) {
            com.tencent.mm.splash.j.d("WxSplash.SplashHackHandlerCallback", "handleMessage %s, splash %s", java.lang.Integer.valueOf(message.what), java.lang.Boolean.valueOf(com.tencent.mm.splash.j.f193650i));
            int i17 = message.what;
            if (i17 == 113 || i17 == 114 || i17 == 115 || i17 == 116 || i17 == 121 || i17 == 122 || i17 == 145) {
                android.os.Message obtain = android.os.Message.obtain();
                obtain.copyFrom(message);
                com.tencent.mm.splash.j.f193643b.add(obtain);
                if (com.tencent.mm.splash.j.f193648g != null) {
                    nm.a.a(512);
                }
                return true;
            }
        }
        int i18 = message.what;
        if (i18 == 126 || (android.os.Build.VERSION.SDK_INT >= 28 && i18 == 160)) {
            java.util.HashSet hashSet = (java.util.HashSet) com.tencent.mm.splash.j.f193649h;
            if (hashSet.size() > 0) {
                f193669h = true;
            }
            com.tencent.mm.splash.j.d("WxSplash.SplashHackHandlerCallback", "received a RELAUNCH_ACTIVITY message, with %s splash activity", java.lang.Integer.valueOf(hashSet.size()));
            a(message.obj);
        }
        if (message.what == 134) {
            java.lang.Object obj = message.obj;
            if (obj instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) obj;
                com.tencent.mm.splash.j.d("WxSplash.SplashHackHandlerCallback", "DOS_PROOF: remote crash msg: %s", str);
                if (str.contains("did not then call Service.startForeground()") && (indexOf = str.indexOf("ServiceRecord{")) >= 0) {
                    java.lang.String[] split = str.substring(indexOf).split(" +");
                    if (split.length >= 3) {
                        java.lang.String str2 = split[2];
                        if (str2.endsWith("}")) {
                            str2 = str2.substring(0, str2.length() - 1);
                        }
                        android.content.ComponentName unflattenFromString = android.content.ComponentName.unflattenFromString(str2.trim());
                        if (((java.util.HashSet) f193668g).contains(unflattenFromString.getClassName())) {
                            com.tencent.mm.splash.j.d("WxSplash.SplashHackHandlerCallback", "DOS_PROOF: DOS related to '%s' was avoided.", unflattenFromString.getClassName());
                            return true;
                        }
                    }
                }
            }
        }
        android.os.Handler.Callback callback = this.f193671e;
        if (callback == null) {
            return false;
        }
        this.f193672f = true;
        boolean handleMessage = callback.handleMessage(message);
        this.f193672f = false;
        return handleMessage;
    }
}
