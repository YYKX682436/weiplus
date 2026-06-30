package ph5;

/* loaded from: classes5.dex */
public class a implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f354487d;

    public static void a(final int i17, java.lang.String str, int i18, int i19, int i27) {
        if (f354487d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SamplingTraceDumpTask", "Already tracing.");
            return;
        }
        android.os.Debug.startMethodTracingSampling(str, i18, i19);
        f354487d = true;
        if (i27 >= 1000) {
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
            t0Var.getClass();
            t0Var.t(new java.lang.Runnable() { // from class: ph5.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    ph5.a.b(i17);
                }
            }, i27, null);
        }
    }

    public static void b(int i17) {
        if (i17 == android.os.Process.myPid()) {
            f354487d = false;
            android.os.Debug.stopMethodTracing();
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) sh.c.n(com.tencent.mm.sdk.platformtools.x2.f193071a)).iterator();
        while (it.hasNext()) {
            m3.d dVar = (m3.d) it.next();
            if (((java.lang.Integer) dVar.f323092a).intValue() == i17) {
                java.lang.String str = (java.lang.String) dVar.f323093b;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("stopTrace", true);
                com.tencent.mm.ipcinvoker.d0.d(str, bundle, ph5.a.class, new ph5.a$$b());
                return;
            }
        }
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle.getBoolean("stopTrace", false)) {
            f354487d = false;
            android.os.Debug.stopMethodTracing();
        } else {
            a(android.os.Process.myPid(), bundle.getString("tracePath", null), bundle.getInt("bufferSize", 8388608), bundle.getInt("intervalUs", 10), bundle.getInt("durationMs", -1));
        }
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
