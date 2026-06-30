package o95;

/* loaded from: classes13.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final o95.e f343740d = new o95.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            if (fp.h.a(31)) {
                android.telephony.TelephonyManager telephonyManager = o95.k.f343744e;
                if (telephonyManager != null) {
                    o95.k.f343743d.getClass();
                    o95.g gVar = (o95.g) ((jz5.n) o95.k.f343753q).getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(256);
                    arrayList.add(gVar);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(telephonyManager, arrayList.toArray(), "com/tencent/mm/telephony/feature/TelephonyFeatureService$1", "invoke", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                    telephonyManager.listen((android.telephony.PhoneStateListener) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.f(telephonyManager, "com/tencent/mm/telephony/feature/TelephonyFeatureService$1", "invoke", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                }
            } else {
                android.telephony.TelephonyManager telephonyManager2 = o95.k.f343744e;
                if (telephonyManager2 != null) {
                    java.util.concurrent.Executor a17 = qo.q.f365321a.a("MicroMsg.TelephonyFeatureService.telephony", null);
                    o95.k.f343743d.getClass();
                    telephonyManager2.registerTelephonyCallback(a17, (o95.f) ((jz5.n) o95.k.f343754r).getValue());
                }
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                java.util.concurrent.Executor a18 = qo.q.f365321a.a("MicroMsg.TelephonyFeatureService.audio", null);
                o95.k.f343743d.getClass();
                ((android.media.AudioManager) systemService).addOnModeChangedListener(a18, (o95.f) ((jz5.n) o95.k.f343754r).getValue());
            }
        } catch (java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TelephonyFeatureService", "listen telephony failed cause %s", e17.getCause());
        }
        return jz5.f0.f302826a;
    }
}
