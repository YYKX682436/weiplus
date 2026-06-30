package kd2;

/* loaded from: classes3.dex */
public final class g0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f306747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView f306748b;

    public g0(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView finderLiveFeedMiniView) {
        this.f306747a = imageView;
        this.f306748b = finderLiveFeedMiniView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        wu5.c cVar;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            android.widget.ImageView imageView = this.f306747a;
            com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView finderLiveFeedMiniView = this.f306748b;
            ku5.u0 u0Var = ku5.t0.f312615d;
            kd2.f0 f0Var = new kd2.f0(bitmap, imageView, finderLiveFeedMiniView);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            cVar = t0Var.k(f0Var, 0L);
        } else {
            cVar = null;
        }
        if (cVar == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveFeedMiniView", "loadBackgroundImage resource is empty!");
        }
    }
}
