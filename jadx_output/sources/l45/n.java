package l45;

/* loaded from: classes10.dex */
public class n implements l45.q {

    /* renamed from: a, reason: collision with root package name */
    public ym5.h f316460a;

    /* renamed from: b, reason: collision with root package name */
    public qk.l9 f316461b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.HashMap f316462c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f316463d;

    /* renamed from: e, reason: collision with root package name */
    public qk.i6 f316464e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f316465f;

    /* renamed from: o, reason: collision with root package name */
    public l45.o f316474o;

    /* renamed from: p, reason: collision with root package name */
    public l45.p f316475p;

    /* renamed from: r, reason: collision with root package name */
    public cm5.g f316477r;

    /* renamed from: t, reason: collision with root package name */
    public l45.m f316479t;

    /* renamed from: u, reason: collision with root package name */
    public qk.g6 f316480u;

    /* renamed from: v, reason: collision with root package name */
    public qk.g6 f316481v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f316482w;

    /* renamed from: x, reason: collision with root package name */
    public dl.b f316483x;

    /* renamed from: y, reason: collision with root package name */
    public hk0.u0 f316484y;

    /* renamed from: g, reason: collision with root package name */
    public boolean f316466g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f316467h = true;

    /* renamed from: i, reason: collision with root package name */
    public float f316468i = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f316469j = false;

    /* renamed from: k, reason: collision with root package name */
    public int f316470k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f316471l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f316472m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f316473n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f316476q = 0;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f316478s = null;

    public n() {
        qk.g6 g6Var = qk.g6.DEFAULT;
        this.f316480u = g6Var;
        this.f316481v = g6Var;
        this.f316482w = false;
        this.f316483x = null;
        this.f316484y = null;
    }

    public static void a(l45.n nVar, boolean z17) {
        if (z17) {
            nVar.getClass();
            nVar.b(c01.s2.f37446v, null);
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(nVar.e(), com.tencent.mm.R.anim.f477857df);
            loadAnimation.setAnimationListener(new l45.f(nVar));
            nVar.f316460a.getRubbishView().startAnimation(loadAnimation);
            return;
        }
        if (nVar.f316460a.getConfig().f364231a != qk.n9.VIDEO_COVER) {
            android.view.View rubbishView = nVar.f316460a.getRubbishView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.82f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(rubbishView, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter", "setRubbishViewVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            rubbishView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(rubbishView, "com/tencent/mm/presenter/DrawingPresenter", "setRubbishViewVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        nVar.b(c01.s2.f37447w, null);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(nVar.e(), com.tencent.mm.R.anim.f477855dd);
        loadAnimation2.setAnimationListener(new l45.g(nVar));
        nVar.f316460a.getRubbishView().startAnimation(loadAnimation2);
    }

    public final void b(c01.s2 s2Var, xk0.f fVar) {
        l45.p pVar = this.f316475p;
        if (pVar != null) {
            ((aw3.e) pVar).a(s2Var, fVar);
        }
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "checkInitArtist: %s", java.lang.Boolean.valueOf(this.f316482w));
        if (this.f316482w) {
            return;
        }
        this.f316482w = true;
        java.util.Iterator it = this.f316463d.iterator();
        while (it.hasNext()) {
            dl.b bVar = (dl.b) it.next();
            if (com.tencent.mm.cache.ArtistCacheManager.a().d(bVar.m())) {
                bVar.t();
                bVar.E(true);
                com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "[onAttachedToWindow] %s is revert onAlive!", bVar.m());
            }
        }
        if (this.f316460a.getBaseBoardView().f()) {
            this.f316460a.getBaseBoardView().a();
            this.f316460a.getBaseBoardView().invalidate();
        }
    }

    public dl.b d(qk.g6 g6Var) {
        this.f316462c.size();
        this.f316462c.containsKey(g6Var);
        return (dl.b) this.f316462c.get(g6Var);
    }

    public android.content.Context e() {
        return this.f316460a.getContext();
    }

    public dl.b f() {
        dl.b bVar = this.f316483x;
        if (bVar != null) {
            return bVar;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.DrawingPresenter", "[getCurArtist] is null!");
        return dl.b.f235038p;
    }

    public float g() {
        return this.f316460a.getBaseBoardView().getCurScale();
    }

    public android.graphics.Bitmap h() {
        android.graphics.Rect rect = new android.graphics.Rect(this.f316460a.getBaseBoardView().getAliveRect());
        if (f() instanceof dl.t) {
            dl.t tVar = (dl.t) f();
            tVar.getClass();
            android.graphics.RectF rectF = new android.graphics.RectF(tVar.f235130x);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            tVar.h().invert(matrix);
            matrix.mapRect(rectF);
            rect = new android.graphics.Rect();
            rectF.round(rect);
        }
        android.graphics.Bitmap bitmap = this.f316465f;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.sdk.platformtools.x.J(this.f316461b.f364234d, options);
        float height = (options.outHeight * 1.0f) / bitmap.getHeight();
        float width = (options.outWidth * 1.0f) / bitmap.getWidth();
        if (height <= width) {
            height = width;
        }
        if (height == 0.0f) {
            height = 1.0f;
        }
        int i17 = this.f316471l;
        if (i17 > 0 && this.f316470k > 0) {
            height = (i17 * 1.0f) / bitmap.getHeight();
            float width2 = (this.f316470k * 1.0f) / bitmap.getWidth();
            if (height > width2) {
                height = width2;
            }
        }
        float d17 = this.f316460a.getBaseBoardView().d(this.f316460a.getBaseBoardView().getMainMatrix());
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postScale(height, height, 0.0f, 0.0f);
        matrix2.postRotate(-d17);
        if (this.f316460a.getConfig().f364231a == qk.n9.VIDEO_COVER) {
            rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else if (this.f316468i > 0.0f) {
            i(bitmap, rect);
            float width3 = (float) ((rect.width() * 1.0d) / rect.height());
            com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "[saveEditPhoto] clipRectF:%s w:%s h:%s ratio:%f", rect, java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Float.valueOf(width3));
            double d18 = width3;
            float f17 = this.f316468i;
            double d19 = f17;
            if (d18 < d19 - 0.06d || d18 > d19 + 0.06d) {
                if (f17 > width3) {
                    int centerY = rect.centerY();
                    int width4 = (int) ((rect.width() * 1.0f) / this.f316468i);
                    com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "clipRect.width() : " + rect.width() + " new height:" + width4);
                    int i18 = width4 / 2;
                    rect.top = centerY - i18;
                    rect.bottom = centerY + i18;
                    com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "top :" + rect.top + " bottom:" + rect.bottom);
                } else {
                    int centerX = rect.centerX();
                    int height2 = (int) (rect.height() * 1.0f * this.f316468i);
                    com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "clipRect.height() : " + rect.height() + " new width:" + height2);
                    int i19 = height2 / 2;
                    rect.left = centerX - i19;
                    rect.right = centerX + i19;
                    com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "left :" + rect.left + " right:" + rect.right + " cropRectRatio:" + this.f316468i);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "ratio clipRect :" + ((rect.width() * 1.0f) / rect.height()));
        } else {
            i(bitmap, rect);
        }
        return l(bitmap, rect, d17, options, matrix2);
    }

    public final android.graphics.Rect i(android.graphics.Bitmap bitmap, android.graphics.Rect rect) {
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

    public java.util.List j() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        dl.y yVar = (dl.y) d(qk.g6.EMOJI);
        if (yVar != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            um.g gVar = (um.g) yVar.d();
            if (gVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EmojiAndTextArtist", "getCurrentEmojiList failed, cache is null!");
            } else {
                java.util.ListIterator f17 = gVar.f();
                while (f17.hasPrevious()) {
                    com.tencent.mm.api.IEmojiInfo iEmojiInfo = ((xk0.f) f17.previous()).f454951f;
                    if (iEmojiInfo != null) {
                        arrayList2.add(iEmojiInfo);
                    }
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public float k() {
        return this.f316460a.getBaseBoardView().getInitScale();
    }

    public final android.graphics.Bitmap l(android.graphics.Bitmap bitmap, android.graphics.Rect rect, float f17, android.graphics.BitmapFactory.Options options, android.graphics.Matrix matrix) {
        android.graphics.Bitmap createBitmap;
        try {
        } catch (java.lang.OutOfMemoryError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DrawingPresenter", e17, "", new java.lang.Object[0]);
            float f18 = 1920.0f / options.outHeight;
            float f19 = 1920.0f / options.outWidth;
            if (f18 <= f19) {
                f18 = f19;
            }
            matrix.reset();
            matrix.postScale(f18, f18, 0.0f, 0.0f);
            matrix.postRotate(-f17);
            if (bitmap.getWidth() - rect.width() > 9 || bitmap.getHeight() - rect.height() > 9) {
                int i17 = rect.left;
                int i18 = rect.top;
                int width = rect.width();
                int height = rect.height();
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar.c(java.lang.Boolean.TRUE);
                aVar.c(matrix);
                aVar.c(java.lang.Integer.valueOf(height));
                aVar.c(java.lang.Integer.valueOf(width));
                aVar.c(java.lang.Integer.valueOf(i18));
                aVar.c(java.lang.Integer.valueOf(i17));
                aVar.c(bitmap);
                java.lang.Object obj = new java.lang.Object();
                yj0.a.d(obj, aVar.b(), "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            } else {
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                zj0.a aVar2 = new zj0.a();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                aVar2.c(java.lang.Boolean.TRUE);
                aVar2.c(matrix);
                aVar2.c(java.lang.Integer.valueOf(height2));
                aVar2.c(java.lang.Integer.valueOf(width2));
                aVar2.c(0);
                aVar2.c(0);
                aVar2.c(bitmap);
                java.lang.Object obj2 = new java.lang.Object();
                yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            }
        }
        if (bitmap.getWidth() - rect.width() <= 9 && bitmap.getHeight() - rect.height() <= 9) {
            int width3 = bitmap.getWidth();
            int height3 = bitmap.getHeight();
            zj0.a aVar3 = new zj0.a();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            aVar3.c(java.lang.Boolean.TRUE);
            aVar3.c(matrix);
            aVar3.c(java.lang.Integer.valueOf(height3));
            aVar3.c(java.lang.Integer.valueOf(width3));
            aVar3.c(0);
            aVar3.c(0);
            aVar3.c(bitmap);
            java.lang.Object obj3 = new java.lang.Object();
            yj0.a.d(obj3, aVar3.b(), "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar3.a(0), ((java.lang.Integer) aVar3.a(1)).intValue(), ((java.lang.Integer) aVar3.a(2)).intValue(), ((java.lang.Integer) aVar3.a(3)).intValue(), ((java.lang.Integer) aVar3.a(4)).intValue(), (android.graphics.Matrix) aVar3.a(5), ((java.lang.Boolean) aVar3.a(6)).booleanValue());
            yj0.a.e(obj3, createBitmap, "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "getSafeResultBitmap: result bitmap:[w:%d,h:%d], src bitmap:[w:%d,h:%d], clipRect:[w:%d,h:%d, left:%d, top:%d], rotation:%s", java.lang.Integer.valueOf(createBitmap.getWidth()), java.lang.Integer.valueOf(createBitmap.getHeight()), java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Integer.valueOf(rect.width()), java.lang.Integer.valueOf(rect.height()), java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Float.valueOf(f17));
            return createBitmap;
        }
        int i19 = rect.left;
        int i27 = rect.top;
        int width4 = rect.width();
        int height4 = rect.height();
        zj0.a aVar4 = new zj0.a();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        aVar4.c(java.lang.Boolean.TRUE);
        aVar4.c(matrix);
        aVar4.c(java.lang.Integer.valueOf(height4));
        aVar4.c(java.lang.Integer.valueOf(width4));
        aVar4.c(java.lang.Integer.valueOf(i27));
        aVar4.c(java.lang.Integer.valueOf(i19));
        aVar4.c(bitmap);
        java.lang.Object obj4 = new java.lang.Object();
        yj0.a.d(obj4, aVar4.b(), "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar4.a(0), ((java.lang.Integer) aVar4.a(1)).intValue(), ((java.lang.Integer) aVar4.a(2)).intValue(), ((java.lang.Integer) aVar4.a(3)).intValue(), ((java.lang.Integer) aVar4.a(4)).intValue(), (android.graphics.Matrix) aVar4.a(5), ((java.lang.Boolean) aVar4.a(6)).booleanValue());
        yj0.a.e(obj4, createBitmap, "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "getSafeResultBitmap: result bitmap:[w:%d,h:%d], src bitmap:[w:%d,h:%d], clipRect:[w:%d,h:%d, left:%d, top:%d], rotation:%s", java.lang.Integer.valueOf(createBitmap.getWidth()), java.lang.Integer.valueOf(createBitmap.getHeight()), java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Integer.valueOf(rect.width()), java.lang.Integer.valueOf(rect.height()), java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Float.valueOf(f17));
        return createBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[LOOP:4: B:95:0x0152->B:155:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014f A[LOOP:3: B:91:0x0149->B:93:0x014f, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v11, types: [dl.d0] */
    /* JADX WARN: Type inference failed for: r7v12, types: [dl.t] */
    /* JADX WARN: Type inference failed for: r7v13, types: [dl.z] */
    /* JADX WARN: Type inference failed for: r7v14, types: [dl.f0, dl.y] */
    /* JADX WARN: Type inference failed for: r7v9, types: [dl.y] */
    /* JADX WARN: Type inference failed for: r9v11, types: [dl.b] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(qk.l9 r20) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l45.n.m(qk.l9):void");
    }

    public boolean n() {
        return f().m() != dl.a.CROP_PHOTO && this.f316466g;
    }

    public void o() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "onCancelTextEdit: ");
        this.f316460a.setFooterVisible(true);
        y(false);
    }

    public void p() {
        java.util.Iterator it = this.f316463d.iterator();
        while (it.hasNext()) {
            ((dl.b) it.next()).w();
        }
        this.f316463d.clear();
        this.f316462c.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "onDestroy: ");
    }

    public void q(android.graphics.Canvas canvas) {
        java.util.Iterator it = this.f316463d.iterator();
        while (it.hasNext()) {
            dl.b bVar = (dl.b) it.next();
            if (bVar.n()) {
                if (f().m() != bVar.m()) {
                    canvas.save();
                    canvas.clipRect(this.f316460a.getBaseBoardView().getAliveRect());
                    bVar.v(canvas);
                    canvas.restore();
                } else {
                    bVar.y(canvas);
                }
            }
        }
    }

    public xk0.f r(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        dl.y yVar = (dl.y) d(qk.g6.EMOJI);
        if (yVar == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextArtist", "[addEmojiItem] item:%s", iEmojiInfo);
        um.g gVar = (um.g) yVar.d();
        if (gVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
            return null;
        }
        yVar.S();
        yVar.Q();
        yVar.E(false);
        android.graphics.Rect c17 = yVar.c();
        xk0.f fVar = new xk0.f(com.tencent.mm.sdk.platformtools.x2.f193071a, yVar.h(), gVar.A3(true) + "", iEmojiInfo, c17, yVar.f235042d);
        fVar.w(true);
        float[] H = yVar.H();
        fVar.g(H[0], H[1], ((l45.n) yVar.f235039a).k() / ((l45.n) yVar.f235039a).g(), (int) yVar.i());
        fVar.x(H[0], H[1]);
        if (yVar.l() != null) {
            xk0.f fVar2 = new xk0.f(com.tencent.mm.sdk.platformtools.x2.f193071a, yVar.h(), gVar.A3(true) + "", iEmojiInfo, c17, yVar.f235042d);
            fVar2.w(true);
            fVar2.g(H[0], H[1], ((l45.n) yVar.f235039a).k() / ((l45.n) yVar.f235039a).g(), (int) yVar.i());
            fVar2.x(H[0], H[1]);
            hk0.z zVar = yVar.l().f281818i;
            hk0.p pVar = hk0.p.f281786d;
            zVar.getClass();
            java.lang.String str = ((hk0.k) zVar.f281849a.getLast()).f281758b;
            hk0.m mVar = (hk0.m) zVar.f281855g.get(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", "updateLatestEmojiData >> " + pVar + ", " + str);
            if (mVar != null) {
                mVar.f281774e = fVar2;
                mVar.f281772c = pVar;
                fVar2.f454966x = str;
            }
            fVar.f454966x = str;
        }
        gVar.add(fVar);
        yVar.r();
        yVar.P();
        return fVar;
    }

    public void s(java.lang.String str, int i17, int i18, java.lang.String str2) {
        t(str, i17, i18, str2, false, 0.0f, true, true, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, float f17, boolean z18, boolean z19, int i19) {
        xk0.f fVar;
        xk0.f fVar2;
        xk0.f fVar3;
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "onFinishTextEdit: ");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DrawingPresenter", "onFinishTextEdit: text empty");
            return;
        }
        y(false);
        this.f316460a.setFooterVisible(true);
        dl.b f18 = f();
        if (f18.m() == dl.a.EMOJI_AND_TEXT || f18.m() == dl.a.STICKER) {
            dl.y yVar = (dl.y) f18;
            android.widget.EditText editText = (android.widget.EditText) this.f316460a.getTextEditView().findViewById(com.tencent.mm.R.id.o4a);
            if (editText.getTag() == null || !(editText.getTag() instanceof xk0.h)) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context e17 = e();
                ((ke0.e) xVar).getClass();
                android.text.SpannableString i27 = com.tencent.mm.pluginsdk.ui.span.c0.i(e17, str);
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextArtist", "[addItem] text:%s", i27);
                if (!com.tencent.mm.sdk.platformtools.t8.J0(i27)) {
                    um.g gVar = (um.g) yVar.d();
                    if (gVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
                    } else {
                        yVar.S();
                        yVar.Q();
                        yVar.E(false);
                        android.graphics.Rect c17 = yVar.c();
                        xk0.f L = yVar.L(com.tencent.mm.sdk.platformtools.x2.f193071a, yVar.h(), gVar.A3(true) + "", c17, yVar.f235042d, i27, i17, i18, str2);
                        L.w(true);
                        L.f454964v = true;
                        L.f454965w = z19;
                        yVar.U(L, z17, f17, z18, i19);
                        float[] H = yVar.H();
                        L.g(H[0], H[1], ((l45.n) yVar.f235039a).k() / ((l45.n) yVar.f235039a).g(), (int) yVar.i());
                        L.x(H[0], H[1]);
                        if (yVar.l() != null) {
                            fVar = L;
                            xk0.f L2 = yVar.L(com.tencent.mm.sdk.platformtools.x2.f193071a, yVar.h(), gVar.A3(true) + "", c17, yVar.f235042d, i27, i17, i18, str2);
                            L2.w(true);
                            L2.f454964v = true;
                            L2.f454965w = z19;
                            yVar.U(L2, z17, f17, z18, i19);
                            L2.g(H[0], H[1], ((l45.n) yVar.f235039a).k() / ((l45.n) yVar.f235039a).g(), (int) yVar.i());
                            L2.x(H[0], H[1]);
                            fVar2 = null;
                            fVar.f454966x = yVar.l().f281818i.h(hk0.p.f281786d, (xk0.p) L2, null);
                        } else {
                            fVar = L;
                            fVar2 = null;
                        }
                        gVar.add(fVar);
                        yVar.r();
                        yVar.P();
                        editText.setTag(fVar2);
                    }
                }
            } else {
                xk0.f fVar4 = (xk0.f) editText.getTag();
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context e18 = e();
                ((ke0.e) xVar2).getClass();
                android.text.SpannableString i28 = com.tencent.mm.pluginsdk.ui.span.c0.i(e18, str);
                um.g gVar2 = (um.g) yVar.d();
                if (gVar2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
                } else if (fVar4 instanceof xk0.h) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextArtist", "updateTextItem: ");
                    gVar2.b(fVar4.q());
                    fVar4.w(true);
                    fVar4.f454964v = true;
                    fVar4.f454965w = z19;
                    xk0.h hVar = (xk0.h) fVar4;
                    hVar.c(z17);
                    hVar.b(i19);
                    yVar.S();
                    yVar.Q();
                    yVar.E(true);
                    if (!com.tencent.mm.sdk.platformtools.t8.J0(i28)) {
                        android.graphics.Rect c18 = yVar.c();
                        xk0.f L3 = yVar.L(com.tencent.mm.sdk.platformtools.x2.f193071a, yVar.h(), gVar2.A3(true) + "", c18, yVar.f235042d, i28, i17, i18, str2);
                        L3.w(true);
                        L3.f454965w = z19;
                        yVar.U(L3, z17, f17, z18, i19);
                        android.graphics.PointF pointF = fVar4.f454955m;
                        L3.g(pointF.x, pointF.y, ((l45.n) yVar.f235039a).k() / ((l45.n) yVar.f235039a).g(), fVar4.f454956n);
                        yVar.R(L3, fVar4.f454957o);
                        L3.x(yVar.f235041c.width() * 0.5f, yVar.f235041c.height() * 0.5f);
                        if (yVar.l() != null) {
                            fVar3 = L3;
                            xk0.f L4 = yVar.L(com.tencent.mm.sdk.platformtools.x2.f193071a, yVar.h(), gVar2.A3(true) + "", c18, yVar.f235042d, i28, i17, i18, str2);
                            L4.w(true);
                            L4.f454965w = z19;
                            yVar.U(L4, z17, f17, z18, i19);
                            L4.g(pointF.x, pointF.y, ((l45.n) yVar.f235039a).k() / ((l45.n) yVar.f235039a).g(), fVar4.f454956n);
                            yVar.R(L4, fVar4.f454957o);
                            L4.x(yVar.f235041c.width() * 0.5f, yVar.f235041c.height() * 0.5f);
                            fVar3.f454966x = yVar.l().f281818i.h(hk0.p.f281788f, (xk0.p) L4, fVar4.f454966x);
                        } else {
                            fVar3 = L3;
                        }
                        gVar2.add(fVar3);
                    }
                    yVar.r();
                    yVar.P();
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EmojiAndTextArtist", "updateTextItem: not text item");
                }
            }
            fVar2 = null;
            editText.setTag(fVar2);
        } else {
            fVar2 = null;
        }
        b(c01.s2.f37433f, fVar2);
    }

    public void u() {
        if (this.f316460a.getBaseFooterView().f242056z) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "onLaunchTextEdit: ");
        ((android.widget.EditText) this.f316460a.getTextEditView().findViewById(com.tencent.mm.R.id.o4a)).setTextColor(dn5.c.D[0]);
        y(true);
        this.f316460a.setFooterVisible(false);
    }

    public boolean v(android.view.MotionEvent motionEvent) {
        boolean z17;
        l45.o oVar;
        dl.b bVar;
        dl.a m17 = f().m();
        dl.a aVar = dl.a.CROP_PHOTO;
        if (m17 == aVar || f().m() == dl.a.CROP_VIDEO) {
            z17 = false;
        } else {
            java.util.HashMap hashMap = this.f316462c;
            qk.g6 g6Var = qk.g6.TEXT;
            if (hashMap.containsKey(g6Var)) {
                bVar = (dl.b) this.f316462c.get(g6Var);
            } else {
                java.util.HashMap hashMap2 = this.f316462c;
                qk.g6 g6Var2 = qk.g6.EMOJI;
                if (hashMap2.containsKey(g6Var2)) {
                    bVar = (dl.b) this.f316462c.get(g6Var2);
                } else {
                    java.util.HashMap hashMap3 = this.f316462c;
                    qk.g6 g6Var3 = qk.g6.STICKER;
                    bVar = hashMap3.containsKey(g6Var3) ? (dl.b) this.f316462c.get(g6Var3) : null;
                }
            }
            z17 = bVar != null ? bVar.x(motionEvent) : false;
            if (z17) {
                this.f316483x = bVar;
            }
            motionEvent.getAction();
        }
        if (!z17) {
            dl.b bVar2 = (dl.b) this.f316462c.get(this.f316460a.getBaseFooterView().getCurFeatureType());
            if (bVar2 != this.f316483x) {
                this.f316483x = bVar2;
            }
            java.util.Iterator it = this.f316463d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dl.b bVar3 = (dl.b) it.next();
                if (bVar3.m() != dl.a.EMOJI_AND_TEXT && bVar3.m() != dl.a.STICKER && bVar3.x(motionEvent)) {
                    z17 = true;
                    break;
                }
            }
            if (!z17 && (oVar = this.f316474o) != null) {
                android.view.GestureDetector gestureDetector = ((ju3.n1) oVar).f301981a.D;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout$loadCurrentPage$3", "onDispatchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout$loadCurrentPage$3", "onDispatchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            }
        }
        if (f().m() == aVar) {
            dl.t tVar = (dl.t) f();
            if (this.f316469j) {
                if (motionEvent.getAction() == 0) {
                    tVar.F = true;
                } else if (motionEvent.getAction() == 1) {
                    tVar.F = false;
                }
            }
        }
        if (!z17) {
            b(c01.s2.f37444t, null);
        }
        return z17;
    }

    public void w(int i17) {
        dl.b bVar = this.f316483x;
        if (bVar == null || bVar.m() != dl.a.EMOJI_AND_TEXT) {
            return;
        }
        ((dl.y) this.f316483x).M.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditRotateHelper", "setMinSafeRotate >> " + i17);
    }

    public void x(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "setOutputSize width:%d height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f316470k = i17;
        this.f316471l = i18;
    }

    public final void y(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "setTextEditViewVisible: isShow=[%b]", java.lang.Boolean.valueOf(z17));
        if (z17) {
            b(c01.s2.f37431d, null);
        } else {
            b(c01.s2.f37432e, null);
        }
        if (!z17) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(e(), com.tencent.mm.R.anim.f477855dd);
            loadAnimation.setAnimationListener(new l45.e(this));
            this.f316460a.getTextEditView().startAnimation(loadAnimation);
            return;
        }
        android.view.View textEditView = this.f316460a.getTextEditView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textEditView, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter", "setTextEditViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textEditView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textEditView, "com/tencent/mm/presenter/DrawingPresenter", "setTextEditViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(e(), com.tencent.mm.R.anim.f477857df);
        loadAnimation2.setAnimationListener(new l45.d(this));
        this.f316460a.getTextEditView().startAnimation(loadAnimation2);
    }
}
