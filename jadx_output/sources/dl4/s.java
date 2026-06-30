package dl4;

/* loaded from: classes.dex */
public final class s implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f235465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dl4.m0 f235466c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff0.v f235467d;

    public s(java.lang.String str, android.widget.ImageView imageView, dl4.m0 m0Var, ff0.v vVar) {
        this.f235464a = str;
        this.f235465b = imageView;
        this.f235466c = m0Var;
        this.f235467d = vVar;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... extraObj) {
        kotlin.jvm.internal.o.g(extraObj, "extraObj");
        if (bitmap != null) {
            bitmap.getWidth();
        }
        if (bitmap != null) {
            bitmap.getHeight();
        }
        android.widget.ImageView imageView = this.f235465b;
        if (imageView != null) {
            imageView.getTag(com.tencent.mm.R.id.o9g);
        }
        boolean b17 = kotlin.jvm.internal.o.b(imageView != null ? imageView.getTag(com.tencent.mm.R.id.o9g) : null, this.f235464a);
        ff0.v vVar = this.f235467d;
        if (!b17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingImageFeatureService", "loadTingImage onImageLoadComplete tag not equal, imageView: %s", imageView);
            if (vVar != null) {
                vVar.a(str, view, bitmap, imageView == null);
                return;
            }
            return;
        }
        this.f235466c.getClass();
        pm0.v.X(new dl4.l0(bitmap, imageView));
        if (vVar != null) {
            vVar.a(str, view, bitmap, (bitmap == null || bitmap.isRecycled()) ? false : true);
        }
    }
}
