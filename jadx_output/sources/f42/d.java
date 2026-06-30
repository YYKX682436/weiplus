package f42;

/* loaded from: classes5.dex */
public class d implements yj0.b {
    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.autogen.events.KillSelfEvent killSelfEvent = new com.tencent.mm.autogen.events.KillSelfEvent();
        killSelfEvent.f54453g.f6358a = 1;
        killSelfEvent.e();
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.w("MicroMsg.KillselfMonitor", "on kill proc: " + str4 + ", args=" + java.util.Arrays.toString(objArr));
        if (str4.equals("exit")) {
            mm.g0.f328483a.d(kz5.b0.c(java.lang.Integer.valueOf(android.os.Process.myPid())));
        }
        if (str4.equals("killProcess") && objArr != null && objArr.length >= 1) {
            java.lang.Object obj2 = objArr[0];
            if (obj2 instanceof java.lang.Integer) {
                mm.g0.f328483a.d(kz5.b0.c(java.lang.Integer.valueOf(((java.lang.Integer) obj2).intValue())));
            }
        }
        com.tencent.mm.autogen.events.KillSelfEvent killSelfEvent = new com.tencent.mm.autogen.events.KillSelfEvent();
        killSelfEvent.f54453g.f6358a = 0;
        killSelfEvent.e();
    }
}
