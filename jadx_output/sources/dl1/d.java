package dl1;

/* loaded from: classes8.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f235171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl1.f f235172e;

    public d(dl1.f fVar, java.lang.Runnable runnable) {
        this.f235172e = fVar;
        this.f235171d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        cl1.k0 k0Var;
        dl1.f fVar = this.f235172e;
        dl1.a aVar = fVar.f235180d;
        if (aVar != null) {
            android.view.View view = fVar.f235178b;
            int i17 = fVar.f235183g;
            int i18 = fVar.f235184h;
            java.lang.Object obj = fVar.f235181e;
            cl1.h hVar = (cl1.h) aVar;
            hVar.getClass();
            if ((obj instanceof cl1.n0) && ((cl1.n0) obj).f42889b == 2 && (k0Var = hVar.f42871a.H) != null) {
                k0Var.c(i17, i18, obj);
            }
        }
        java.lang.Runnable runnable = this.f235171d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
