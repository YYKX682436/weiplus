package ry2;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.y f401497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f401498e;

    public v(ry2.y yVar, android.graphics.Bitmap bitmap) {
        this.f401497d = yVar;
        this.f401498e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f401497d.p().setImageBitmap(this.f401498e);
    }
}
