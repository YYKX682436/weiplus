package dm3;

/* loaded from: classes3.dex */
public final class s implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f241736a;

    public s(android.widget.ImageView imageView) {
        this.f241736a = imageView;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        if (bitmap == null) {
            return;
        }
        um5.d dVar = new um5.d();
        dVar.b(bitmap);
        android.widget.ImageView imageView = this.f241736a;
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        dVar.f429141b = width;
        dVar.f429142c = height;
        dVar.f429144e.f429193b.d();
        dVar.a(new dm3.r(imageView));
    }
}
