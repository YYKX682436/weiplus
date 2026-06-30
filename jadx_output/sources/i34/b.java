package i34;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f288308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i34.d f288309e;

    public b(i34.d dVar, android.graphics.Bitmap bitmap) {
        this.f288309e = dVar;
        this.f288308d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f288309e.f288316g.setImageBitmap(this.f288308d);
    }
}
