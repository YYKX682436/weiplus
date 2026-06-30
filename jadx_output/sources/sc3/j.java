package sc3;

/* loaded from: classes7.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f406460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f406461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f406462g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f406463h;

    public j(sc3.k1 k1Var, yz5.l lVar, boolean z17, int i17, int i18) {
        this.f406459d = k1Var;
        this.f406460e = lVar;
        this.f406461f = z17;
        this.f406462g = i17;
        this.f406463h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap;
        yg.b bVar;
        yg.b bVar2;
        sc3.k1 k1Var = this.f406459d;
        boolean z17 = this.f406461f;
        int i17 = this.f406462g;
        int i18 = this.f406463h;
        synchronized (k1Var) {
            bitmap = null;
            if (z17) {
                com.tencent.magicbrush.MagicBrush magicBrush = k1Var.f406488t;
                if (magicBrush != null && (bVar2 = magicBrush.f48591o) != null) {
                    bitmap = bVar2.a(i17, i18, true);
                }
            } else {
                com.tencent.magicbrush.MagicBrush magicBrush2 = k1Var.f406488t;
                if (magicBrush2 != null && (bVar = magicBrush2.f48591o) != null) {
                    bitmap = bVar.a(i17, i18, false);
                }
            }
        }
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e(this.f406459d.Q, "hy: can not capture using readPixels!!");
        }
        this.f406460e.invoke(bitmap);
    }
}
