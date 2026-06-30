package oe1;

/* loaded from: classes15.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f344730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oe1.q f344731e;

    public p(oe1.q qVar, android.graphics.Bitmap bitmap) {
        this.f344731e = qVar;
        this.f344730d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f344730d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f344731e.f344733e.f83543t.setImageBitmap(bitmap);
    }
}
