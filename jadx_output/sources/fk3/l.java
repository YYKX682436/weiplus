package fk3;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk3.d f263576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f263577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f263578f;

    public l(kk3.d dVar, android.graphics.Bitmap bitmap, int i17) {
        this.f263576d = dVar;
        this.f263577e = bitmap;
        this.f263578f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk3.d dVar = this.f263576d;
        if (dVar != null) {
            dVar.b(this.f263577e, this.f263578f);
        }
    }
}
