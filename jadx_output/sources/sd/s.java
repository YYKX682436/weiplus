package sd;

/* loaded from: classes8.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.w f406650d;

    public s(sd.w wVar) {
        this.f406650d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.w wVar = this.f406650d;
        if (((android.app.Activity) wVar.f406661b).isFinishing()) {
            return;
        }
        android.content.Context applicationContext = wVar.f406661b.getApplicationContext();
        java.lang.Class c17 = wVar.c();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = sd.q0.f406645a;
        sd.o0 o0Var = new sd.o0(applicationContext, c17);
        if (!android.text.TextUtils.isEmpty(null)) {
            o0Var.j(null);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = sd.q0.f406645a;
        concurrentHashMap2.put(java.lang.Integer.valueOf(o0Var.hashCode()), o0Var);
        com.tencent.mars.xlog.Log.i(sd.q0.class.getSimpleName(), "preload, url: %s, holding size: %d", null, java.lang.Integer.valueOf(concurrentHashMap2.size()));
        wVar.f406667h = java.lang.Integer.valueOf(o0Var.hashCode());
    }
}
