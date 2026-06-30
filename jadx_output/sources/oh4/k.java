package oh4;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph4.b f345477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f345478e;

    public k(ph4.b bVar, android.graphics.Bitmap bitmap) {
        this.f345477d = bVar;
        this.f345478e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f345477d.f354462e.setImageBitmap(this.f345478e);
    }
}
