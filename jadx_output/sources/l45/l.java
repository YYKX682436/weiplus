package l45;

/* loaded from: classes10.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final qk.p7 f316455d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f316456e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f316457f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f316458g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l45.n f316459h;

    public l(l45.n nVar, qk.p7 p7Var, boolean z17, boolean z18) {
        this.f316459h = nVar;
        this.f316455d = p7Var;
        this.f316456e = z17;
        this.f316457f = z18;
    }

    public final void a(android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "GenerateTask: success callback");
        ((ku5.t0) ku5.t0.f312615d).B(new l45.k(this, bitmap));
    }

    public final android.graphics.Rect b(android.graphics.Bitmap bitmap) {
        android.graphics.Rect rect = new android.graphics.Rect(this.f316459h.f316460a.getBaseBoardView().getAliveRect());
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "[saveEditPhoto] clipRectF:%s w:%s h:%s", rect, java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
        if (rect.left < 0) {
            rect.left = 0;
        }
        if (rect.top < 0) {
            rect.top = 0;
        }
        if (rect.bottom < 0) {
            rect.bottom = 0;
        }
        if (rect.right < 0) {
            rect.right = 0;
        }
        if (rect.bottom > bitmap.getHeight()) {
            rect.bottom = bitmap.getHeight();
        }
        if (rect.right > bitmap.getWidth()) {
            rect.right = bitmap.getWidth();
        }
        return rect;
    }

    public final android.graphics.Rect c(android.graphics.Bitmap bitmap) {
        android.graphics.Rect b17 = b(bitmap);
        float width = (float) ((b17.width() * 1.0d) / b17.height());
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "[saveEditPhoto] clipRectF:%s w:%s h:%s ratio:%f", b17, java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Float.valueOf(width));
        double d17 = width;
        l45.n nVar = this.f316459h;
        float f17 = nVar.f316468i;
        if (d17 < f17 - 0.06d || d17 > f17 + 0.06d) {
            if (f17 > width) {
                int centerY = b17.centerY();
                int width2 = (int) ((b17.width() * 1.0f) / nVar.f316468i);
                com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "clipRect.width() : " + b17.width() + " new height:" + width2);
                int i17 = width2 / 2;
                b17.top = centerY - i17;
                b17.bottom = centerY + i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "top :" + b17.top + " bottom:" + b17.bottom);
            } else {
                int centerX = b17.centerX();
                int height = (int) (b17.height() * 1.0f * nVar.f316468i);
                com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "clipRect.height() : " + b17.height() + " new width:" + height);
                int i18 = height / 2;
                b17.left = centerX - i18;
                b17.right = centerX + i18;
                com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "left :" + b17.left + " right:" + b17.right + " cropRectRatio:" + nVar.f316468i);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "ratio clipRect :" + ((b17.width() * 1.0f) / b17.height()));
        return b17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ku5.u0 u0Var;
        l45.j jVar;
        android.graphics.Bitmap bitmap;
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "GenerateTask run: start on [%s]", java.lang.Thread.currentThread().getName());
        try {
            try {
                java.util.Iterator it = this.f316459h.f316463d.iterator();
                while (it.hasNext()) {
                    dl.b bVar = (dl.b) it.next();
                    bVar.getClass();
                    ((ku5.t0) ku5.t0.f312615d).B(new dl.d(bVar));
                }
                if (this.f316459h.f316460a.getBaseBoardView().f()) {
                    bitmap = this.f316459h.f316465f;
                } else {
                    android.graphics.Rect aliveRect = this.f316459h.f316460a.getBaseBoardView().getAliveRect();
                    int width = aliveRect.width();
                    int height = aliveRect.height();
                    if (width <= 0 || height <= 0) {
                        bitmap = null;
                    } else {
                        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(config);
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Integer.valueOf(height));
                        arrayList.add(java.lang.Integer.valueOf(width));
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter$GenerateTask", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                        yj0.a.e(obj, bitmap, "com/tencent/mm/presenter/DrawingPresenter$GenerateTask", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DrawingPresenter", e17, "generate bitmap failed", new java.lang.Object[0]);
                ((ku5.t0) ku5.t0.f312615d).B(new l45.i(this, e17));
                if (!this.f316457f) {
                    return;
                }
                u0Var = ku5.t0.f312615d;
                jVar = new l45.j(this);
            }
            if (bitmap == null) {
                this.f316455d.onError(new java.lang.NullPointerException("bitmap is null!"));
                if (this.f316457f) {
                    ((ku5.t0) ku5.t0.f312615d).B(new l45.j(this));
                    return;
                }
                return;
            }
            if (this.f316458g) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(bitmap);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/presenter/DrawingPresenter$GenerateTask", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList2.get(0));
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/presenter/DrawingPresenter$GenerateTask", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;");
                bitmap = createBitmap;
            }
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            java.util.Iterator it6 = this.f316459h.f316463d.iterator();
            while (it6.hasNext()) {
                dl.b bVar2 = (dl.b) it6.next();
                bVar2.toString();
                bVar2.d().O3(canvas);
            }
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.tencent.mm.sdk.platformtools.x.J(this.f316459h.f316461b.f364234d, options);
            float height2 = (options.outHeight * 1.0f) / bitmap.getHeight();
            float width2 = (options.outWidth * 1.0f) / bitmap.getWidth();
            if (height2 <= width2) {
                height2 = width2;
            }
            if (height2 == 0.0f) {
                height2 = 1.0f;
            }
            l45.n nVar = this.f316459h;
            int i17 = nVar.f316471l;
            if (i17 > 0 && nVar.f316470k > 0) {
                height2 = (i17 * 1.0f) / bitmap.getHeight();
                float width3 = (this.f316459h.f316470k * 1.0f) / bitmap.getWidth();
                if (height2 > width3) {
                    height2 = width3;
                }
            }
            float d17 = this.f316459h.f316460a.getBaseBoardView().d(this.f316459h.f316460a.getBaseBoardView().getMainMatrix());
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postScale(height2, height2, 0.0f, 0.0f);
            matrix.postRotate(-d17);
            android.graphics.Bitmap l17 = this.f316459h.l(bitmap, this.f316459h.f316460a.getConfig().f364231a == qk.n9.VIDEO_COVER ? new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()) : this.f316459h.f316468i > 0.0f ? c(bitmap) : b(bitmap), d17, options, matrix);
            cm5.g gVar = this.f316459h.f316477r;
            if (gVar != null) {
                l17 = gVar.a(l17);
            }
            a(l17);
            if (this.f316457f) {
                u0Var = ku5.t0.f312615d;
                jVar = new l45.j(this);
                ((ku5.t0) u0Var).B(jVar);
            }
        } catch (java.lang.Throwable th6) {
            if (this.f316457f) {
                ((ku5.t0) ku5.t0.f312615d).B(new l45.j(this));
            }
            throw th6;
        }
    }

    public l(l45.n nVar, qk.p7 p7Var, boolean z17, boolean z18, boolean z19) {
        this.f316459h = nVar;
        this.f316455d = p7Var;
        this.f316456e = z17;
        this.f316457f = z18;
        this.f316458g = z19;
    }
}
