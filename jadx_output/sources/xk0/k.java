package xk0;

/* loaded from: classes10.dex */
public class k implements java.lang.Cloneable {

    /* renamed from: o, reason: collision with root package name */
    public static final int f454982o = cm5.h.b(12.0f);

    /* renamed from: p, reason: collision with root package name */
    public static final android.graphics.Paint f454983p;

    /* renamed from: q, reason: collision with root package name */
    public static final android.graphics.Paint f454984q;

    /* renamed from: r, reason: collision with root package name */
    public static final android.graphics.Paint f454985r;

    /* renamed from: d, reason: collision with root package name */
    public final xk0.i f454986d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Bitmap f454987e;

    /* renamed from: g, reason: collision with root package name */
    public long f454989g;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Path f454992m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f454993n;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f454988f = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f454990h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f454991i = false;

    static {
        android.graphics.Paint paint = new android.graphics.Paint();
        f454983p = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        f454984q = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        f454985r = paint3;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(-16776961);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setColor(-1);
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint3.setAntiAlias(true);
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setColor(i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.BW_100_Alpha_0_2));
        paint3.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    public k(xk0.i iVar, android.graphics.Path path, float f17, android.graphics.Bitmap bitmap) {
        this.f454986d = iVar;
        this.f454987e = bitmap;
        this.f454992m = path;
        f454983p.setStrokeWidth(cm5.h.b(24.0f) * f17);
        f454985r.setStrokeWidth(cm5.h.b(24.0f) * f17);
        f454984q.setStrokeWidth(cm5.h.b(28.0f) * f17);
    }

    public void a(android.graphics.Canvas canvas, boolean z17, boolean z18, android.graphics.Bitmap bitmap) {
        android.graphics.Paint paint = f454983p;
        if (z18) {
            paint.setAlpha(100);
        } else {
            paint.setAlpha(255);
        }
        xk0.i iVar = xk0.i.ONE;
        xk0.i iVar2 = this.f454986d;
        if (iVar2 == iVar) {
            android.graphics.Bitmap bitmap2 = this.f454987e;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            boolean z19 = this.f454990h;
            android.graphics.Path path = this.f454992m;
            if (z19) {
                canvas.drawPath(path, f454984q);
            }
            canvas.saveLayer(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight(), null, 31);
            canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            canvas.drawPath(path, paint);
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
            paint.setXfermode(null);
            if (this.f454990h) {
                canvas.drawPath(path, f454985r);
            }
            canvas.restore();
            return;
        }
        if (iVar2 == xk0.i.TWO) {
            java.util.LinkedList linkedList = this.f454993n;
            if (linkedList.size() <= 0) {
                return;
            }
            if (this.f454990h) {
                if (bitmap != null) {
                    rk0.c.c("MicroMsg.MosaicItem", "use cache bitmap", new java.lang.Object[0]);
                    canvas.saveLayer(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), null, 31);
                    canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                    paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OVER));
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    paint.setXfermode(null);
                    canvas.restore();
                    return;
                }
                paint.setAlpha(100);
            }
            if (!z17) {
                xk0.j jVar = (xk0.j) linkedList.getLast();
                b(canvas, jVar, c(jVar.f454975a), z17);
            } else {
                android.graphics.Bitmap c17 = c(((xk0.j) linkedList.get(0)).f454975a);
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    b(canvas, (xk0.j) it.next(), c17, z17);
                }
            }
        }
    }

    public void b(android.graphics.Canvas canvas, xk0.j jVar, android.graphics.Bitmap bitmap, boolean z17) {
        float f17 = jVar.f454975a;
        int random = (int) (java.lang.Math.random() * 100.0d);
        float f18 = jVar.f454980f;
        float f19 = jVar.f454981g;
        if (f18 == 0.0f && f19 == 0.0f && z17) {
            return;
        }
        android.graphics.Paint paint = f454983p;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColorFilter(new android.graphics.LightingColorFilter(jVar.f454977c, 1));
        float f27 = jVar.f454979e;
        float f28 = jVar.f454978d;
        if (f18 == 0.0f && f19 == 0.0f) {
            float f29 = f454982o * f17;
            if (bitmap != null) {
                f19 = f27 - ((bitmap.getHeight() * 1.0f) / 2.0f);
                f18 = f28 - ((bitmap.getWidth() * 1.0f) / 2.0f);
            }
            if (random > 0 && random <= 20) {
                f18 += f29;
                f19 += f29;
            } else if (80 < random) {
                f18 -= f29;
                f19 -= f29;
            }
            jVar.f454980f = f18;
            jVar.f454981g = f19;
        }
        canvas.save();
        canvas.rotate(-jVar.f454976b, f28, f27);
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, f18, f19, paint);
        }
        canvas.restore();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColorFilter(null);
    }

    public android.graphics.Bitmap c(float f17) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.app));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/items/MosaicItem", "getMosaicBitmap", "(F)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(2)), "com/tencent/mm/items/MosaicItem", "getMosaicBitmap", "(F)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        int round = java.lang.Math.round(options.outWidth * f17 * 0.7f);
        int round2 = java.lang.Math.round(options.outHeight * f17 * 0.7f);
        int i17 = options.outHeight;
        int i18 = 1;
        while (options.outWidth / i18 > round) {
            i18++;
        }
        while (i17 / i18 > round2) {
            i18++;
        }
        options.inSampleSize = i18;
        options.inJustDecodeBounds = false;
        android.content.res.Resources resources2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(options);
        arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.app));
        arrayList2.add(resources2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/items/MosaicItem", "getMosaicBitmap", "(F)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.BitmapFactory.Options) arrayList2.get(2));
        yj0.a.e(obj2, decodeResource, "com/tencent/mm/items/MosaicItem", "getMosaicBitmap", "(F)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeResource;
    }

    public k(xk0.i iVar, java.util.LinkedList linkedList, float f17) {
        this.f454986d = iVar;
        this.f454993n = linkedList;
        f454983p.setStrokeWidth(cm5.h.b(24.0f) * f17);
        f454985r.setStrokeWidth(cm5.h.b(24.0f) * f17);
        f454984q.setStrokeWidth(cm5.h.b(28.0f) * f17);
    }
}
