package u6;

/* loaded from: classes13.dex */
public abstract class b implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f424840d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.res.AssetManager f424841e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f424842f;

    public b(android.content.res.AssetManager assetManager, java.lang.String str) {
        this.f424841e = assetManager;
        this.f424840d = str;
    }

    @Override // u6.e
    public t6.a b() {
        return t6.a.LOCAL;
    }

    public abstract void c(java.lang.Object obj);

    @Override // u6.e
    public void cancel() {
    }

    public abstract java.lang.Object d(android.content.res.AssetManager assetManager, java.lang.String str);

    @Override // u6.e
    public void e(com.bumptech.glide.g gVar, u6.d dVar) {
        try {
            java.lang.Object d17 = d(this.f424841e, this.f424840d);
            this.f424842f = d17;
            dVar.c(d17);
        } catch (java.io.IOException e17) {
            android.util.Log.isLoggable("AssetPathFetcher", 3);
            dVar.d(e17);
        }
    }

    @Override // u6.e
    public void h() {
        java.lang.Object obj = this.f424842f;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (java.io.IOException unused) {
        }
    }
}
