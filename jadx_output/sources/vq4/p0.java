package vq4;

/* loaded from: classes14.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static r45.n27 f439374a;

    static {
        new java.lang.StringBuilder("VERSION.RELEASE:[").append(android.os.Build.VERSION.RELEASE);
        new java.lang.StringBuilder("] VERSION.CODENAME:[").append(android.os.Build.VERSION.CODENAME);
        new java.lang.StringBuilder("] VERSION.INCREMENTAL:[").append(android.os.Build.VERSION.INCREMENTAL);
        new java.lang.StringBuilder("] BOARD:[").append(android.os.Build.BOARD);
        new java.lang.StringBuilder("] DEVICE:[").append(android.os.Build.DEVICE);
        new java.lang.StringBuilder("] DISPLAY:[").append(android.os.Build.DISPLAY);
        new java.lang.StringBuilder("] FINGERPRINT:[").append(android.os.Build.FINGERPRINT);
        new java.lang.StringBuilder("] HOST:[").append(android.os.Build.HOST);
        new java.lang.StringBuilder("] MANUFACTURER:[").append(android.os.Build.MANUFACTURER);
        "] MODEL:[".concat(wo.w0.m());
        new java.lang.StringBuilder("] PRODUCT:[").append(android.os.Build.PRODUCT);
        new java.lang.StringBuilder("] TAGS:[").append(android.os.Build.TAGS);
        new java.lang.StringBuilder("] TYPE:[").append(android.os.Build.TYPE);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("] USER:[");
        sb6.append(android.os.Build.USER);
        sb6.append("]");
        android.net.Uri.parse("content://com.lbe.security.miui.permmgr/active");
    }

    public static android.app.Notification a(z2.k0 k0Var) {
        return fp.h.a(16) ? k0Var.b() : k0Var.b();
    }

    public static r45.n27 b() {
        if (f439374a == null) {
            r45.n27 n27Var = new r45.n27();
            f439374a = n27Var;
            n27Var.f381033d = android.os.Build.MANUFACTURER;
            f439374a.f381034e = wo.w0.m();
            f439374a.f381035f = android.os.Build.VERSION.RELEASE;
            f439374a.f381036g = android.os.Build.VERSION.INCREMENTAL;
            f439374a.f381037h = wo.r.a();
            f439374a.f381039m = new java.util.LinkedList();
            int i17 = 0;
            for (android.media.MediaCodecInfo mediaCodecInfo : new android.media.MediaCodecList(0).getCodecInfos()) {
                java.lang.String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                for (int i18 = 0; i18 < supportedTypes.length; i18++) {
                    if (supportedTypes[i18].startsWith("video/")) {
                        r45.ev3 ev3Var = new r45.ev3();
                        ev3Var.f373741d = mediaCodecInfo.getName();
                        ev3Var.f373742e = supportedTypes[i18];
                        f439374a.f381039m.add(ev3Var);
                        i17++;
                    }
                }
            }
            f439374a.f381038i = i17;
        }
        return f439374a;
    }

    public static boolean c() {
        com.tencent.mm.autogen.events.CheckIPCallIsStartedEvent checkIPCallIsStartedEvent = new com.tencent.mm.autogen.events.CheckIPCallIsStartedEvent();
        checkIPCallIsStartedEvent.e();
        return checkIPCallIsStartedEvent.f54051g.f7596a;
    }

    public static boolean d() {
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        voipEvent.f54945g.f8415b = 2;
        voipEvent.e();
        return voipEvent.f54946h.f8501b;
    }
}
