package gk3;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk3.m f272519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk3.d f272520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f272521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f272522g;

    public k(gk3.m mVar, kk3.d dVar, android.graphics.Bitmap bitmap, int i17) {
        this.f272519d = mVar;
        this.f272520e = dVar;
        this.f272521f = bitmap;
        this.f272522g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gk3.m mVar = this.f272519d;
        mVar.f272530f = false;
        com.tencent.mm.sdk.platformtools.u3.h(new gk3.j(this.f272520e, this.f272521f, this.f272522g, mVar));
    }
}
