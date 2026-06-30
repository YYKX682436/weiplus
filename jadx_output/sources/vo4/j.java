package vo4;

/* loaded from: classes10.dex */
public final class j extends vo4.b {

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f438648p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i17, int i18, int i19, com.tencent.mm.plugin.vlog.model.n0 material) {
        super(i17, i18, i19, material, false, 16, null);
        kotlin.jvm.internal.o.g(material, "material");
    }

    @Override // vo4.b
    public void a(boolean z17) {
    }

    @Override // vo4.b
    public void b(long j17, boolean z17) {
        android.graphics.Bitmap bitmap;
        if (!z17 || (bitmap = this.f438648p) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogImagePlayer", "VLogImagePlayer playing, uploadBitmapTexture, bitmap:" + bitmap + ", width:" + bitmap.getWidth() + ", height:" + bitmap.getHeight());
        rs0.g gVar = rs0.i.f399296a;
        android.opengl.GLES20.glBindTexture(3553, this.f438602a);
        android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        bitmap.recycle();
        this.f438648p = null;
    }

    @Override // vo4.b
    public void c() {
        this.f438616o = true;
    }

    @Override // vo4.b
    public void d(long j17) {
        boolean z17;
        vo4.k kVar;
        long j18;
        android.graphics.Bitmap bitmap;
        androidx.exifinterface.media.ExifInterface exifInterface;
        java.lang.Integer num;
        int i17;
        java.lang.Integer num2;
        if (this.f438615n) {
            return;
        }
        this.f438615n = true;
        vo4.k kVar2 = vo4.k.f438649a;
        com.tencent.mm.plugin.vlog.model.p0 p0Var = this.f438605d;
        vo4.a a17 = kVar2.a(p0Var.f175710c);
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogImagePlayer", "prepare get info from cache");
            this.f438607f = a17.f438595a;
            this.f438608g = a17.f438596b;
            this.f438613l = a17.f438597c;
            z17 = true;
        } else {
            z17 = false;
        }
        int i18 = this.f438604c;
        int i19 = this.f438603b;
        if (z17 && this.f438648p != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogImagePlayer", "prepare finish get from cache");
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogImagePlayer", "prepare drawWidth:" + i19 + ", drawHeight:" + i18 + ", width:" + this.f438607f + ", height:" + this.f438608g);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.lang.String str = p0Var.f175710c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/vlog/player/VLogImagePlayer", "readyAt", "(J)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/plugin/vlog/player/VLogImagePlayer", "readyAt", "(J)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        int i27 = options.outWidth;
        int i28 = options.outHeight;
        options.inSampleSize = com.tencent.mm.sdk.platformtools.x.f(i27, i28, i19, i18);
        options.inJustDecodeBounds = false;
        android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(p0Var.f175710c, options);
        if (d17 == null || d17.isRecycled()) {
            kVar = kVar2;
            j18 = currentTimeMillis;
            bitmap = null;
        } else {
            if (d17.getWidth() % 2 == 1) {
                int width = d17.getWidth() + 1;
                int height = d17.getHeight();
                j18 = currentTimeMillis;
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(height));
                arrayList2.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/player/VLogImagePlayer", "resizeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                kVar = kVar2;
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/vlog/player/VLogImagePlayer", "resizeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.d(createBitmap);
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                canvas.drawARGB(0, 0, 0, 0);
                canvas.drawBitmap(d17, 0.0f, 0.0f, (android.graphics.Paint) null);
                d17 = createBitmap;
            } else {
                kVar = kVar2;
                j18 = currentTimeMillis;
            }
            bitmap = d17;
        }
        kotlin.jvm.internal.o.d(bitmap);
        this.f438607f = bitmap.getWidth();
        this.f438608g = bitmap.getHeight();
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogImagePlayer", "prepare,oriWidth:" + i27 + "  oriHeight:" + i28 + " drawWidth:" + i19 + ", drawHeight:" + i18 + ", width:" + this.f438607f + ", height:" + this.f438608g);
        java.io.InputStream E = com.tencent.mm.vfs.w6.E(p0Var.f175710c);
        if (E != null) {
            try {
                exifInterface = new androidx.exifinterface.media.ExifInterface(E);
                num = null;
                vz5.b.a(E, null);
            } finally {
            }
        } else {
            num = null;
            exifInterface = null;
        }
        if (exifInterface != null) {
            i17 = 1;
            num2 = java.lang.Integer.valueOf(exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1));
        } else {
            i17 = 1;
            num2 = num;
        }
        if (num2 != null && num2.intValue() == 6) {
            this.f438613l = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogImagePlayer", "image rotate 90");
        } else if (num2 != null && num2.intValue() == 3) {
            this.f438613l = 2;
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogImagePlayer", "image rotate 180");
        } else if (num2 != null && num2.intValue() == 8) {
            this.f438613l = 3;
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogImagePlayer", "image rotate 270");
        }
        this.f438648p = bitmap;
        vo4.k.b(kVar, p0Var.f175710c, this.f438607f, this.f438608g, this.f438613l, 0, 0, 0, 0, 240, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogImagePlayer", "[prepare] image play time = " + (java.lang.System.currentTimeMillis() - j18));
    }

    @Override // vo4.b
    public void e() {
        this.f438615n = false;
        android.graphics.Bitmap bitmap = this.f438648p;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f438648p = null;
        this.f438616o = false;
    }

    @Override // vo4.b
    public void f() {
        this.f438615n = false;
    }
}
