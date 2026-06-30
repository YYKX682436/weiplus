package y73;

/* loaded from: classes11.dex */
public class v implements w11.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y73.q f459764a;

    public v(y73.q qVar) {
        this.f459764a = qVar;
    }

    @Override // w11.e1
    public void a(boolean z17) {
        boolean z18;
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        voipEvent.f54945g.f8415b = 2;
        voipEvent.e();
        boolean z19 = voipEvent.f54946h.f8501b;
        boolean H = iq.b.H();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f459764a.getClass();
        try {
            for (android.view.Display display : ((android.hardware.display.DisplayManager) context.getApplicationContext().getSystemService("display")).getDisplays()) {
                if (display.getState() == 2) {
                    z18 = true;
                    break;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.HotPatchApplyService", th6, "Fail to fetch status of displays.", new java.lang.Object[0]);
        }
        z18 = false;
        if (z17 || z18 || z19 || H) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Tinker.HotPatchApplyService", "app is background now, i can kill quietly");
        ak0.n.c();
        try {
            ak0.n.a();
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.HotPatchApplyService", th7, "Fail to call tinker.cleanPatch.", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.appenderFlushSync();
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/hp/model/HotpatchIPXXApplyService$3", "onScreenStateChange", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/plugin/hp/model/HotpatchIPXXApplyService$3", "onScreenStateChange", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
