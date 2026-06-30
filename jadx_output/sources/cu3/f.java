package cu3;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cu3.d f222473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f222474e;

    public f(cu3.d dVar, android.graphics.Bitmap bitmap) {
        this.f222473d = dVar;
        this.f222474e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cu3.d dVar = this.f222473d;
        dVar.getClass();
        android.graphics.Bitmap bitmap = this.f222474e;
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        dVar.f222469d.setImageBitmap(bitmap);
        dVar.f222471f = true;
    }
}
