package fx2;

/* loaded from: classes8.dex */
public final class b implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fx2.c f267114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fx2.c f267115b;

    public b(fx2.c cVar, fx2.c cVar2) {
        this.f267114a = cVar;
        this.f267115b = cVar2;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            if (!(!bitmap.isRecycled())) {
                bitmap = null;
            }
            if (bitmap != null) {
                fx2.c cVar = this.f267114a;
                com.tencent.mars.xlog.Log.i(cVar.f267117b, "loaded, " + this.f267115b.f267116a);
                pm0.v.X(new fx2.a(cVar, bitmap));
            }
        }
    }
}
