package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq5.c f214922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.d f214923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yq5.c cVar, com.tencent.mm.zoomimage.subsampling.internal.d dVar) {
        super(0);
        this.f214922d = cVar;
        this.f214923e = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yq5.c cVar = this.f214922d;
        if (cVar != null) {
            return cVar;
        }
        com.tencent.mm.zoomimage.subsampling.internal.d dVar = this.f214923e;
        yq5.f fVar = dVar.f214929e;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(((yq5.b) fVar).f464589a);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.io.InputStream D = com.tencent.mm.vfs.w6.D(a17, com.tencent.mm.vfs.a3.f212781a.m(a17, null));
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            arrayList.add(null);
            arrayList.add(D);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/zoomimage/subsampling/internal/DecodesKt", "decodeImageInfo", "(Lcom/tencent/mm/zoomimage/subsampling/ImageSource;)Lcom/tencent/mm/zoomimage/subsampling/ImageInfo;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            yj0.a.e(obj, android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2)), "com/tencent/mm/zoomimage/subsampling/internal/DecodesKt", "decodeImageInfo", "(Lcom/tencent/mm/zoomimage/subsampling/ImageSource;)Lcom/tencent/mm/zoomimage/subsampling/ImageInfo;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            vz5.b.a(D, null);
            java.lang.String str2 = options.outMimeType;
            if (str2 == null) {
                str2 = "";
            }
            yq5.c cVar2 = new yq5.c(zq5.h.a(options.outWidth, options.outHeight), str2, null);
            com.tencent.mm.zoomimage.subsampling.internal.e eVar = (com.tencent.mm.zoomimage.subsampling.internal.e) ((jz5.n) dVar.f214930f).getValue();
            kotlin.jvm.internal.o.g(eVar, "<this>");
            long d17 = zq5.h.d(cVar2.f464591a, eVar.f214939c);
            java.lang.String mimeType = cVar2.f464592b;
            kotlin.jvm.internal.o.g(mimeType, "mimeType");
            return new yq5.c(d17, mimeType, null);
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(D, th6);
                throw th7;
            }
        }
    }
}
