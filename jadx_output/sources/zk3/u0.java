package zk3;

/* loaded from: classes8.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk3.d f473512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f473513e;

    public u0(kk3.d dVar, android.graphics.Bitmap bitmap) {
        this.f473512d = dVar;
        this.f473513e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk3.d dVar = this.f473512d;
        if (dVar != null) {
            kk3.d.c(dVar, this.f473513e, false, 0, 6, null);
        }
    }
}
