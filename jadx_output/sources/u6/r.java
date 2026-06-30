package u6;

/* loaded from: classes13.dex */
public abstract class r implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.net.Uri f424861d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.ContentResolver f424862e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f424863f;

    public r(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        this.f424862e = contentResolver;
        this.f424861d = uri;
    }

    @Override // u6.e
    public t6.a b() {
        return t6.a.LOCAL;
    }

    public abstract void c(java.lang.Object obj);

    @Override // u6.e
    public void cancel() {
    }

    public abstract java.lang.Object d(android.net.Uri uri, android.content.ContentResolver contentResolver);

    @Override // u6.e
    public final void e(com.bumptech.glide.g gVar, u6.d dVar) {
        try {
            java.lang.Object d17 = d(this.f424861d, this.f424862e);
            this.f424863f = d17;
            dVar.c(d17);
        } catch (java.io.FileNotFoundException e17) {
            android.util.Log.isLoggable("LocalUriFetcher", 3);
            dVar.d(e17);
        }
    }

    @Override // u6.e
    public void h() {
        java.lang.Object obj = this.f424863f;
        if (obj != null) {
            try {
                c(obj);
            } catch (java.io.IOException unused) {
            }
        }
    }
}
