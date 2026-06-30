package cw1;

/* loaded from: classes3.dex */
public final class n4 implements p11.h {
    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(str).getOrientationInDegree();
        kotlin.jvm.internal.o.d(bVar);
        android.graphics.Bitmap bitmap = bVar.f359534d;
        if (orientationInDegree <= 0) {
            kotlin.jvm.internal.o.d(bitmap);
            return bitmap;
        }
        android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(bitmap, orientationInDegree);
        kotlin.jvm.internal.o.f(w07, "rotate(...)");
        return w07;
    }
}
