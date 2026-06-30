package r35;

/* loaded from: classes3.dex */
public final class f0 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f369105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f369106b;

    public f0(java.lang.String str, android.widget.ImageView imageView) {
        this.f369105a = str;
        this.f369106b = imageView;
    }

    @Override // p11.h
    public void a(java.lang.String url, android.view.View view) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b imageData) {
        android.graphics.Bitmap bitmap;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(imageData, "imageData");
        if ((imageData.f359531a != 0 || (bitmap = imageData.f359534d) == null || bitmap.isRecycled()) && kotlin.jvm.internal.o.b(url, this.f369105a)) {
            pm0.v.X(new r35.e0(this.f369106b));
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String url, android.view.View view, q11.b imageData) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(imageData, "imageData");
        android.graphics.Bitmap bitmap = imageData.f359534d;
        kotlin.jvm.internal.o.f(bitmap, "bitmap");
        return bitmap;
    }
}
