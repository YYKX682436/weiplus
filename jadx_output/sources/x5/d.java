package x5;

/* loaded from: classes14.dex */
public final class d implements x5.g {

    /* renamed from: a, reason: collision with root package name */
    public final v5.h f451943a;

    public d(v5.h drawableDecoder) {
        kotlin.jvm.internal.o.g(drawableDecoder, "drawableDecoder");
        this.f451943a = drawableDecoder;
    }

    @Override // x5.g
    public boolean a(java.lang.Object obj) {
        android.graphics.drawable.Drawable data = (android.graphics.drawable.Drawable) obj;
        kotlin.jvm.internal.o.g(data, "data");
        return true;
    }

    @Override // x5.g
    public java.lang.Object b(s5.a aVar, java.lang.Object obj, coil.size.Size size, v5.k kVar, kotlin.coroutines.Continuation continuation) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
        l36.i0 i0Var = h6.d.f279116a;
        kotlin.jvm.internal.o.g(drawable, "<this>");
        boolean z17 = (drawable instanceof v4.d) || (drawable instanceof android.graphics.drawable.VectorDrawable);
        if (z17) {
            android.graphics.Bitmap a17 = this.f451943a.a(drawable, kVar.f433290b, size, kVar.f433292d, kVar.f433293e);
            android.content.res.Resources resources = kVar.f433289a.getResources();
            kotlin.jvm.internal.o.f(resources, "context.resources");
            drawable = new android.graphics.drawable.BitmapDrawable(resources, a17);
        }
        return new x5.e(drawable, z17, v5.d.MEMORY);
    }

    @Override // x5.g
    public java.lang.String c(java.lang.Object obj) {
        android.graphics.drawable.Drawable data = (android.graphics.drawable.Drawable) obj;
        kotlin.jvm.internal.o.g(data, "data");
        return null;
    }
}
