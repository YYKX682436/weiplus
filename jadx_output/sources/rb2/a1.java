package rb2;

/* loaded from: classes3.dex */
public final class a1 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rb2.d1 f393564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f393565c;

    public a1(java.lang.String str, rb2.d1 d1Var, int i17, kotlin.jvm.internal.h0 h0Var) {
        this.f393563a = str;
        this.f393564b = d1Var;
        this.f393565c = h0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        rb2.d1 d1Var = this.f393564b;
        if (!kotlin.jvm.internal.o.b(this.f393563a, d1Var.f393606e)) {
            com.tencent.mars.xlog.Log.e("FinderCommentImageGalleryView", "isLocal. image url changed");
            return;
        }
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("FinderCommentImageGalleryView", "isLocal. bitmap is null");
            return;
        }
        java.lang.String str = ((java.lang.String) aVar.f293573a) + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        com.tencent.mm.sdk.platformtools.x.D0(bitmap, 90, android.graphics.Bitmap.CompressFormat.JPEG, str, false);
        kotlinx.coroutines.y0 a17 = v65.m.a((android.view.View) this.f393565c.f310123d);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(a17, kotlinx.coroutines.internal.b0.f310484a, null, new rb2.z0(d1Var, str, bitmap, null), 2, null);
    }
}
