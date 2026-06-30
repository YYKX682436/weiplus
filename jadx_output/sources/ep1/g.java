package ep1;

/* loaded from: classes14.dex */
public final class g implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f255623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ep1.k f255624f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f255625g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f255626h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qn5.a f255627i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pv.y f255628m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ fp1.b f255629n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f255630o;

    public g(android.view.View view, android.graphics.Point point, ep1.k kVar, android.graphics.Point point2, boolean z17, qn5.a aVar, pv.y yVar, fp1.b bVar, int i17) {
        this.f255622d = view;
        this.f255623e = point;
        this.f255624f = kVar;
        this.f255625g = point2;
        this.f255626h = z17;
        this.f255627i = aVar;
        this.f255628m = yVar;
        this.f255629n = bVar;
        this.f255630o = i17;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f255622d;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.graphics.Point point = this.f255625g;
        ep1.k kVar = this.f255624f;
        android.graphics.Point point2 = this.f255623e;
        if (point2 == null) {
            point2 = kVar.g(view, point, this.f255626h);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallPageAnimationHelper", "handlePageAnimation contentView.width: %s, floatBallPosition: %s", java.lang.Integer.valueOf(view.getWidth()), point2);
        if (point2 == null || point2.x == -1 || point2.y == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallPageAnimationHelper", "handlePageAnimation floatBallPosition invalid");
            kVar.j(this.f255627i);
            return;
        }
        pv.y yVar = this.f255628m;
        yVar.f358509f = point2;
        yVar.f358508e = point;
        fp1.b bVar = this.f255629n;
        yVar.f358515l = bVar != null ? bVar.a() : false;
        if (bVar != null) {
            fp1.a aVar = (fp1.a) bVar;
            aVar.getClass();
            if (aVar instanceof com.tencent.mm.plugin.finder.viewmodel.component.fg) {
                android.view.View view2 = this.f255622d;
                view2.post(new ep1.e(this.f255624f, this.f255630o, view2, this.f255628m, this.f255627i));
                return;
            }
        }
        pm0.v.X(new ep1.f(this.f255624f, this.f255630o, this.f255622d, this.f255628m, this.f255627i));
    }
}
