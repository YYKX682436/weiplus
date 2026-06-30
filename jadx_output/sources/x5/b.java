package x5;

/* loaded from: classes14.dex */
public final class b implements x5.g {
    @Override // x5.g
    public boolean a(java.lang.Object obj) {
        android.graphics.Bitmap data = (android.graphics.Bitmap) obj;
        kotlin.jvm.internal.o.g(data, "data");
        return true;
    }

    @Override // x5.g
    public java.lang.Object b(s5.a aVar, java.lang.Object obj, coil.size.Size size, v5.k kVar, kotlin.coroutines.Continuation continuation) {
        android.content.res.Resources resources = kVar.f433289a.getResources();
        kotlin.jvm.internal.o.f(resources, "context.resources");
        return new x5.e(new android.graphics.drawable.BitmapDrawable(resources, (android.graphics.Bitmap) obj), false, v5.d.MEMORY);
    }

    @Override // x5.g
    public java.lang.String c(java.lang.Object obj) {
        android.graphics.Bitmap data = (android.graphics.Bitmap) obj;
        kotlin.jvm.internal.o.g(data, "data");
        return null;
    }
}
