package rb2;

/* loaded from: classes3.dex */
public final class c1 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rb2.d1 f393594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f393595c;

    public c1(java.lang.String str, rb2.d1 d1Var, int i17, kotlin.jvm.internal.h0 h0Var) {
        this.f393593a = str;
        this.f393594b = d1Var;
        this.f393595c = h0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        rb2.d1 d1Var = this.f393594b;
        if (!kotlin.jvm.internal.o.b(this.f393593a, d1Var.f393606e)) {
            com.tencent.mars.xlog.Log.e("FinderCommentImageGalleryView", "image url changed");
            return;
        }
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("FinderCommentImageGalleryView", "bitmap is null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        mn2.h3 h3Var = (mn2.h3) aVar.f293573a;
        sb6.append(h3Var != null ? h3Var.getPath() : null);
        sb6.append(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
        java.lang.String sb7 = sb6.toString();
        if (!com.tencent.mm.sdk.platformtools.x.D0(bitmap, 90, android.graphics.Bitmap.CompressFormat.JPEG, sb7, false)) {
            com.tencent.mars.xlog.Log.e("FinderCommentImageGalleryView", "save bitmap failed");
        }
        kotlinx.coroutines.y0 a17 = v65.m.a((android.view.View) this.f393595c.f310123d);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(a17, kotlinx.coroutines.internal.b0.f310484a, null, new rb2.b1(d1Var, sb7, bitmap, null), 2, null);
    }
}
