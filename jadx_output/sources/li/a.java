package li;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ li.d f318740d;

    public a(li.d dVar) {
        this.f318740d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        li.d dVar = this.f318740d;
        dVar.getClass();
        com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance().init();
        com.tencent.matrix.openglleak.hook.OpenGLHook.hookEgl();
        android.content.Context context = dVar.f318745h;
        try {
            z17 = context.bindService(new android.content.Intent(context, (java.lang.Class<?>) com.tencent.matrix.openglleak.detector.OpenglIndexDetectorService.class), new li.c(dVar), 1);
        } catch (java.lang.Exception e17) {
            oj.j.a("matrix.OpenglLeakPlugin", "bindService error = " + e17.getCause(), new java.lang.Object[0]);
            z17 = false;
        }
        oj.j.a("matrix.OpenglLeakPlugin", "bindService result = " + z17, new java.lang.Object[0]);
        if (z17) {
            if (li.d.f318744m != null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1403L, 36L, 1L);
                com.tencent.mars.xlog.Log.e("OpenglLeakPlugin.TAG", "onExpProcessSuccess call & report");
                return;
            }
            return;
        }
        if (li.d.f318744m != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1403L, 37L, 1L);
            com.tencent.mars.xlog.Log.e("OpenglLeakPlugin.TAG", "onExpProcessFail call & report");
        }
    }
}
