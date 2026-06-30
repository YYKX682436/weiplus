package hz3;

/* loaded from: classes12.dex */
public class p implements hz3.a0 {
    @Override // hz3.a0
    public void a(ry3.p request, hz3.z zVar) {
        kotlin.jvm.internal.o.g(request, "request");
        hz3.s sVar = new hz3.s(request.f401527a, 3);
        java.lang.String imagePath = request.f401531e;
        kotlin.jvm.internal.o.f(imagePath, "imagePath");
        sVar.f286355b = imagePath;
        java.lang.String str = request.f401531e;
        android.graphics.Point point = null;
        if (!(str == null || str.length() == 0) && com.tencent.mm.vfs.w6.j(str)) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.tencent.mm.graphics.e.d(str, options);
            point = new android.graphics.Point(options.outWidth, options.outHeight);
        }
        sVar.f286356c = point;
        sVar.f286359f = 1;
        sVar.f286360g = true;
        b(request, sVar, new hz3.o(zVar));
    }

    public final void b(ry3.p request, hz3.s checkImageRequest, hz3.r callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(checkImageRequest, "checkImageRequest");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new hz3.n(request, checkImageRequest, callback, null), 3, null);
    }

    @Override // hz3.a0
    public java.lang.String name() {
        return "MicroMsg.AiScanDefaultImageCDNStrategy";
    }
}
