package jj1;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f299966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jj1.d f299967e;

    public c(jj1.d dVar, android.graphics.Bitmap bitmap) {
        this.f299967e = dVar;
        this.f299966d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        jj1.d dVar = this.f299967e;
        boolean z17 = dVar.f299968a;
        android.graphics.Bitmap bitmap = this.f299966d;
        if (z17) {
            dVar.f299969b.f88858n.setImageBitmap(bitmap);
            dVar.f299969b.f88853f.setImageBitmap(bitmap);
        } else {
            dVar.f299969b.f88858n.setImageBitmap(bitmap);
            dVar.f299969b.f88853f.setImageBitmap(bitmap);
        }
    }
}
