package e33;

/* loaded from: classes10.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f247107d;

    public a(e33.b0 b0Var) {
        this.f247107d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        kn5.e eVar = this.f247107d.F;
        eVar.getClass();
        try {
            eVar.f309799s = true;
            eVar.d();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("DragSelectTouchListener", th6, "forceDragStop err", new java.lang.Object[0]);
        }
    }
}
