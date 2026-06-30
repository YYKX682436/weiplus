package mn2;

/* loaded from: classes15.dex */
public final class b implements ki.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f329913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn2.d f329914e;

    public b(int i17, mn2.d dVar) {
        this.f329913d = i17;
        this.f329914e = dVar;
    }

    @Override // ki.a
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.DefaultBitmapMemoryCache", "[systemTrim] level(" + i17 + ") trim to " + this.f329913d);
        this.f329914e.f329936a.clear();
    }

    @Override // ki.a
    public void b() {
        com.tencent.mars.xlog.Log.i("Finder.DefaultBitmapMemoryCache", "[backgroundTrim] trim to " + this.f329913d);
        this.f329914e.f329936a.clear();
    }
}
