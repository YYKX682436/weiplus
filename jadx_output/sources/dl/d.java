package dl;

/* loaded from: classes10.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl.b f235078d;

    public d(dl.b bVar) {
        this.f235078d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl.b bVar = this.f235078d;
        android.graphics.Bitmap bitmap = bVar.f235045g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseArtist" + bVar.m(), "[recycleCacheBitmap]");
        bVar.f235045g.recycle();
    }
}
