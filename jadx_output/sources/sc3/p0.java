package sc3;

/* loaded from: classes7.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f406514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f406515g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f406516h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f406517i;

    public p0(sc3.k1 k1Var, int i17, int i18, int i19, long j17, java.util.List list) {
        this.f406512d = k1Var;
        this.f406513e = i17;
        this.f406514f = i18;
        this.f406515g = i19;
        this.f406516h = j17;
        this.f406517i = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView;
        jz5.f0 f0Var;
        sc3.k1 k1Var = this.f406512d;
        pc3.c cVar = (pc3.c) k1Var.f406489u.get(java.lang.Integer.valueOf(this.f406513e));
        if (cVar == null || (magicBrushView = cVar.f353372f) == null) {
            return;
        }
        com.tencent.magicbrush.MagicBrush magicBrush = k1Var.f406488t;
        if (magicBrush != null) {
            magicBrush.g(this.f406513e, magicBrushView.getCanvasId(), k1Var.A.c(this.f406514f, this.f406515g, this.f406516h, this.f406517i, magicBrush.f48578b.device_pixel_ratio_), k1Var.A.f48634c);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(k1Var.Q, "post canvas touch event without magicbrush??");
        }
    }
}
