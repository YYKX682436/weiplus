package dj4;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f233036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f233037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f233038g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f233039h;

    public r(java.lang.String str, android.widget.ImageView imageView, boolean z17, android.graphics.Bitmap bitmap, float f17) {
        this.f233035d = str;
        this.f233036e = imageView;
        this.f233037f = z17;
        this.f233038g = bitmap;
        this.f233039h = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map = dj4.u.f233050b;
        android.widget.ImageView imageView = this.f233036e;
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) map).get(java.lang.String.valueOf(imageView.hashCode()));
        imageView.hashCode();
        java.lang.String str2 = this.f233035d;
        if ((!r26.n0.N(str2)) && !kotlin.jvm.internal.o.b(str, str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "setImageWithGradient() skip, with: iv = " + imageView.hashCode() + ", oldIvBindInfo=" + str2 + ", needBindInfo=" + str);
            return;
        }
        boolean z17 = this.f233037f;
        android.graphics.Bitmap bitmap = this.f233038g;
        if (!z17 && bitmap.getWidth() != 0 && imageView.getWidth() != 0 && bitmap.getHeight() / bitmap.getWidth() >= imageView.getHeight() / imageView.getWidth()) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        um5.d dVar = new um5.d();
        dVar.b(bitmap);
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        dVar.f429141b = width;
        dVar.f429142c = height;
        um5.p pVar = dVar.f429144e;
        pVar.f429193b.d();
        if (z17) {
            pVar.f429193b.b().d(this.f233039h);
        }
        dVar.a(new dj4.q(imageView));
    }
}
