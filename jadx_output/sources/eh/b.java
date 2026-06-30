package eh;

/* loaded from: classes7.dex */
public final class b implements f8.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s7.t2 f252865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.c f252866b;

    public b(s7.t2 t2Var, eh.c cVar) {
        this.f252865a = t2Var;
        this.f252866b = cVar;
    }

    @Override // f8.b
    public boolean a(java.io.InputStream inputStream, android.graphics.Bitmap.Config config, f8.c cVar) {
        return true;
    }

    @Override // f8.b
    public com.github.henryye.nativeiv.bitmap.IBitmap b() {
        return new eh.a(this.f252865a, this.f252866b);
    }

    @Override // f8.b
    public void destroy() {
    }
}
