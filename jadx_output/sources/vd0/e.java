package vd0;

@j95.b
/* loaded from: classes12.dex */
public final class e extends i95.w implements ia0.m {

    /* renamed from: d, reason: collision with root package name */
    public boolean f435391d;

    /* renamed from: e, reason: collision with root package name */
    public final vd0.d f435392e = new vd0.d(this);

    public static final void wi(vd0.e eVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckDensityService", "checkReStart isDensityChanged: " + eVar.f435391d);
        if (eVar.f435391d) {
            com.tencent.mm.autogen.events.VoipCallEvent voipCallEvent = new com.tencent.mm.autogen.events.VoipCallEvent();
            voipCallEvent.e();
            boolean z18 = voipCallEvent.f54941g.f8049a;
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckDensityService", "checkReStart isVoipCalling: " + z18);
            if (z18) {
                return;
            }
            eVar.f435391d = false;
            if (z17) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Intro_Need_Clear_Top ", true);
                ((com.tencent.mm.app.y7) f14.g.b()).d(intent, com.tencent.mm.sdk.platformtools.x2.f193071a);
                return;
            }
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/feature/setting/CheckDensityService", "checkReStart", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/feature/setting/CheckDensityService", "checkReStart", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckDensityService", "onAccountInitialized");
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(this.f435392e);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckDensityService", "onAccountReleased");
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.removeLifecycleCallback(this.f435392e);
    }
}
