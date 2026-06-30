package m12;

/* loaded from: classes10.dex */
public final class c extends m12.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f322822f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f322823g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String inputPath, java.lang.String outputPath) {
        super(inputPath, outputPath);
        kotlin.jvm.internal.o.g(inputPath, "inputPath");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        this.f322822f = outputPath;
    }

    @Override // m12.a
    public java.lang.Object c(kotlin.coroutines.Continuation continuation) {
        android.graphics.Bitmap bitmap;
        if (a() && (bitmap = this.f322823g) != null) {
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, this.f322816b, this.f322817c, false);
            kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
            android.graphics.Rect rect = this.f322815a;
            int i17 = rect.left;
            int i18 = rect.top;
            int width = rect.width();
            int height = this.f322815a.height();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(createScaledBitmap);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/emoji/editor/generator/PhotoEmojiGenerator", "generate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/emoji/editor/generator/PhotoEmojiGenerator", "generate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            if (!createBitmap.isMutable()) {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Boolean.TRUE);
                arrayList2.add(config);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(createBitmap, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/editor/generator/PhotoEmojiGenerator", "generate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap copy = createBitmap.copy((android.graphics.Bitmap.Config) arrayList2.get(0), ((java.lang.Boolean) arrayList2.get(1)).booleanValue());
                yj0.a.e(createBitmap, copy, "com/tencent/mm/plugin/emoji/editor/generator/PhotoEmojiGenerator", "generate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(copy, "copy(...)");
                createBitmap = copy;
            }
            android.graphics.Bitmap bitmap2 = this.f322818d;
            if (bitmap2 != null) {
                new android.graphics.Canvas(createBitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
            }
            java.lang.String str = this.f322822f;
            java.io.OutputStream K = com.tencent.mm.vfs.w6.K(str, false);
            try {
                createBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, K);
                vz5.b.a(K, null);
                java.lang.String i19 = com.tencent.mm.vfs.w6.i(str, true);
                kotlin.jvm.internal.o.d(i19);
                androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(i19);
                exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ARTIST, c01.z1.r());
                exifInterface.saveAttributes();
                return java.lang.Boolean.TRUE;
            } finally {
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
