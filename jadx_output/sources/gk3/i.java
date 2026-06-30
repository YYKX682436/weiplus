package gk3;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk3.m f272511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk3.d f272512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f272513f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f272514g;

    public i(gk3.m mVar, kk3.d dVar, android.graphics.Bitmap bitmap, int i17) {
        this.f272511d = mVar;
        this.f272512e = dVar;
        this.f272513f = bitmap;
        this.f272514g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f272511d.e();
        kk3.d dVar = this.f272512e;
        if (dVar != null) {
            dVar.d(this.f272513f, false, this.f272514g);
        }
    }
}
