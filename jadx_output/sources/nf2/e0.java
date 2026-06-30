package nf2;

/* loaded from: classes10.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.g0 f336708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f336709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f336710f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f336711g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f336712h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f336713i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f336714m;

    public e0(nf2.g0 g0Var, android.view.ViewGroup viewGroup, float f17, float f18, android.view.View view, boolean z17, yz5.a aVar) {
        this.f336708d = g0Var;
        this.f336709e = viewGroup;
        this.f336710f = f17;
        this.f336711g = f18;
        this.f336712h = view;
        this.f336713i = z17;
        this.f336714m = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        nf2.g0 g0Var = this.f336708d;
        if (g0Var.f336742d <= 0 || g0Var.f336743e <= 0) {
            android.view.ViewGroup viewGroup = this.f336709e;
            g0Var.f336742d = viewGroup.getWidth();
            g0Var.f336743e = viewGroup.getHeight();
            g0Var.d();
        }
        int i18 = g0Var.f336742d;
        if (i18 <= 0 || (i17 = g0Var.f336743e) <= 0) {
            com.tencent.mars.xlog.Log.w("FinderLiveLyricsPositionManager", "setPosition failed: container size still 0");
            return;
        }
        float f17 = this.f336710f;
        float f18 = this.f336711g;
        android.view.View view = this.f336712h;
        float width = (i18 * f17) - (view.getWidth() / 2.0f);
        float height = (i17 * f18) - (view.getHeight() / 2.0f);
        if (this.f336713i) {
            jz5.l a17 = g0Var.a(width, height);
            view.setX(((java.lang.Number) a17.f302833d).floatValue());
            view.setY(((java.lang.Number) a17.f302834e).floatValue());
        } else {
            view.setX(width);
            view.setY(height);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsPositionManager", "setPosition: (" + f17 + ", " + f18 + ") -> view.pos=(" + view.getX() + ", " + view.getY() + ')');
        yz5.a aVar = this.f336714m;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
