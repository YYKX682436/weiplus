package ps2;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f358056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f358057e;

    public b(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        this.f358056d = bitmap;
        this.f358057e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um5.d dVar = new um5.d();
        android.graphics.Bitmap resource = this.f358056d;
        kotlin.jvm.internal.o.f(resource, "$resource");
        dVar.b(resource);
        android.widget.ImageView imageView = this.f358057e;
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        dVar.f429141b = width;
        dVar.f429142c = height;
        dVar.f429144e.f429193b.d();
        dVar.a(new ps2.a(imageView));
    }
}
