package qa1;

/* loaded from: classes14.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f360960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f360961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceHolder f360962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f360963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qa1.o f360964h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qa1.f0 f360965i;

    public a0(qa1.f0 f0Var, int i17, int i18, android.view.SurfaceHolder surfaceHolder, int i19, qa1.o oVar) {
        this.f360965i = f0Var;
        this.f360960d = i17;
        this.f360961e = i18;
        this.f360962f = surfaceHolder;
        this.f360963g = i19;
        this.f360964h = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.f0 f0Var = this.f360965i;
        ms0.c cVar = f0Var.f360988i;
        int i17 = this.f360961e;
        int i18 = this.f360960d;
        if (cVar != null) {
            cVar.t(i18, i17);
            f0Var.f360988i.u(i18, i17);
        }
        f0Var.f360990n.getAndSet(true);
        f0Var.getClass();
        f0Var.f360983d.d(this.f360962f, this.f360963g, i18, i17);
        f0Var.f360983d.b(this.f360964h);
    }
}
