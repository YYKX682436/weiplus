package i95;

/* loaded from: classes12.dex */
public class d0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f289788d;

    public d0(i95.e0 e0Var, android.view.View view) {
        this.f289788d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ServiceManager", "[+] onGlobalLayout called.");
        this.f289788d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (i95.n0.g()) {
            android.os.Handler handler = i95.n0.f289829m;
            handler.removeCallbacks(i95.n0.f289833q);
            java.lang.Runnable runnable = i95.n0.f289832p;
            handler.removeCallbacks(runnable);
            handler.postAtFrontOfQueue(runnable);
            i95.n0.f289817a.unregisterActivityLifecycleCallbacks(i95.n0.f289834r);
        }
    }
}
