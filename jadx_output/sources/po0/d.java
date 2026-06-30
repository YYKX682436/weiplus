package po0;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f357285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f357286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f357287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f357288g;

    public d(android.graphics.Bitmap bitmap, yz5.l lVar, float f17, int i17) {
        this.f357285d = bitmap;
        this.f357286e = lVar;
        this.f357287f = f17;
        this.f357288g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f357286e;
        android.graphics.Bitmap bitmap = this.f357285d;
        if (bitmap == null) {
            if (lVar != null) {
                lVar.invoke(null);
                return;
            }
            return;
        }
        try {
            um5.d dVar = new um5.d();
            dVar.b(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            dVar.f429141b = width;
            dVar.f429142c = height;
            uq5.b b17 = dVar.f429144e.f429193b.b();
            b17.d(this.f357287f);
            b17.e(5.0f);
            dVar.a(new po0.b(this.f357288g, lVar));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiveBitmapUtil", "fastblur failed: " + e17.getMessage());
            com.tencent.mm.sdk.platformtools.u3.h(new po0.c(lVar));
        }
    }
}
