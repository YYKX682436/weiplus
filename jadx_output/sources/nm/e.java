package nm;

/* loaded from: classes12.dex */
public class e implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f338430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nm.i f338431e;

    public e(nm.i iVar, android.view.View view) {
        this.f338431e = iVar;
        this.f338430d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement2", "[+] onGlobalLayout called.");
        this.f338430d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        synchronized (this.f338431e.f338439c) {
            nm.i iVar = this.f338431e;
            nm.h hVar = iVar.f338437a;
            android.app.Application application = iVar.f338439c[0];
            hVar.getClass();
            application.unregisterActivityLifecycleCallbacks(hVar);
            hVar.f338435e.f338438b.removeCallbacks(hVar);
        }
        this.f338431e.f338438b.a();
    }
}
