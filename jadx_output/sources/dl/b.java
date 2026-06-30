package dl;

/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: p, reason: collision with root package name */
    public static final dl.b f235038p = new dl.c();

    /* renamed from: a, reason: collision with root package name */
    public l45.q f235039a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Matrix f235040b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f235041c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Rect f235042d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235043e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235044f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f235045g;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Runnable f235048j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Runnable f235049k;

    /* renamed from: o, reason: collision with root package name */
    public dl.f f235053o;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f235046h = new android.graphics.Paint();

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Canvas f235047i = new android.graphics.Canvas();

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.PointF f235050l = new android.graphics.PointF();

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.PointF f235051m = new android.graphics.PointF();

    /* renamed from: n, reason: collision with root package name */
    public final float[] f235052n = new float[9];

    public abstract void A(java.lang.String str);

    public void B() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseArtist" + m(), "[onSelected] ");
    }

    public abstract void C();

    public void D() {
        if (d().pop() != null) {
            d().o5();
        }
        ((l45.n) this.f235039a).f316460a.removeCallbacks(this.f235048j);
        ym5.h hVar = ((l45.n) this.f235039a).f316460a;
        dl.e eVar = new dl.e(this);
        this.f235048j = eVar;
        hVar.postDelayed(eVar, 66L);
    }

    public void E(boolean z17) {
        android.graphics.Canvas canvas = this.f235047i;
        canvas.setBitmap(e());
        um.m d17 = d();
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseArtist", "updateCache: cache is null");
        } else {
            d17.M(canvas, z17);
            canvas.drawArc(0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, true, this.f235046h);
        }
    }

    public void F(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        android.graphics.PointF pointF = this.f235050l;
        if (pointerCount > 1) {
            android.graphics.PointF pointF2 = this.f235051m;
            pointF2.x = motionEvent.getX(1);
            pointF2.y = motionEvent.getY(1);
        } else if (motionEvent.getPointerCount() == 1) {
            pointF.x = motionEvent.getX(0);
            pointF.y = motionEvent.getY(0);
        }
        if (motionEvent.getActionMasked() == 6) {
            if (motionEvent.getPointerCount() <= 1 || 1 - motionEvent.getActionIndex() < 0 || 1 - motionEvent.getActionIndex() >= motionEvent.getPointerCount()) {
                pointF.x = motionEvent.getX(0);
                pointF.y = motionEvent.getY(0);
            } else {
                pointF.x = motionEvent.getX(1 - motionEvent.getActionIndex());
                pointF.y = motionEvent.getY(1 - motionEvent.getActionIndex());
            }
        }
    }

    public float[] a(float f17, float f18) {
        android.graphics.Matrix matrix = new android.graphics.Matrix(this.f235040b);
        this.f235040b.invert(matrix);
        float[] fArr = {f17, f18};
        matrix.mapPoints(fArr);
        return fArr;
    }

    public void b(final java.lang.String str) {
        ((l45.n) this.f235039a).f316460a.removeCallbacks(this.f235049k);
        ym5.h hVar = ((l45.n) this.f235039a).f316460a;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: dl.b$$a
            @Override // java.lang.Runnable
            public final void run() {
                dl.b bVar = dl.b.this;
                bVar.A(str);
                bVar.r();
                bVar.f235049k = null;
            }
        };
        this.f235049k = runnable;
        hVar.postDelayed(runnable, 66L);
    }

    public android.graphics.Rect c() {
        return ((l45.n) this.f235039a).f316460a.getBaseBoardView().getBoardRect();
    }

    public um.m d() {
        l45.q qVar = this.f235039a;
        dl.a m17 = m();
        l45.n nVar = (l45.n) qVar;
        nVar.getClass();
        com.tencent.mm.cache.ArtistCacheManager a17 = com.tencent.mm.cache.ArtistCacheManager.a();
        java.lang.String str = nVar.f316461b.f364234d;
        a17.getClass();
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.util.HashMap hashMap = com.tencent.mm.cache.ArtistCacheManager.f63630d;
        if (isEmpty) {
            if (hashMap.containsKey(a17.f63632a)) {
                return ((um.c) hashMap.get(a17.f63632a)).b(m17);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ArtistCacheManager", "[getArtistCache] id is not contains! %s", a17.f63632a);
        } else {
            if (hashMap.containsKey(str)) {
                return ((um.c) hashMap.get(str)).b(m17);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ArtistCacheManager", "[getArtistCache] id is not contains! %s", str);
        }
        return null;
    }

    public android.graphics.Bitmap e() {
        int width;
        int height;
        android.graphics.Bitmap bitmap = this.f235045g;
        if (bitmap == null || bitmap.isRecycled()) {
            android.graphics.Rect imageBitmapRect = ((l45.n) this.f235039a).f316460a.getBaseBoardView().getImageBitmapRect();
            if (imageBitmapRect.isEmpty() || !((l45.n) this.f235039a).f316460a.getBaseBoardView().f()) {
                width = ((l45.n) this.f235039a).f316460a.getBaseBoardView().getBoardRect().width();
                height = ((l45.n) this.f235039a).f316460a.getBaseBoardView().getBoardRect().height();
            } else {
                width = imageBitmapRect.width();
                height = imageBitmapRect.height();
            }
            if (width <= 0 || height <= 0) {
                return null;
            }
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/artists/BaseArtist", "getCacheBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/artists/BaseArtist", "getCacheBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.f235045g = createBitmap;
        }
        return this.f235045g;
    }

    public int f(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() <= 1) {
            return 0;
        }
        int x17 = (int) (motionEvent.getX(0) - motionEvent.getX(1));
        int y17 = (int) (motionEvent.getY(0) - motionEvent.getY(1));
        return (int) java.lang.Math.sqrt((x17 * x17) + (y17 * y17));
    }

    public int[] g(android.view.MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (motionEvent.getPointerCount() > 1) {
            iArr[0] = (int) (motionEvent.getX(0) - motionEvent.getX(1));
            iArr[1] = (int) (motionEvent.getY(0) - motionEvent.getY(1));
        }
        return iArr;
    }

    public android.graphics.Matrix h() {
        return ((l45.n) this.f235039a).f316460a.getBaseBoardView().getMainMatrix();
    }

    public float i() {
        android.graphics.Matrix matrix = this.f235040b;
        float[] fArr = this.f235052n;
        matrix.getValues(fArr);
        double d17 = fArr[1];
        this.f235040b.getValues(fArr);
        return (float) java.lang.Math.round(java.lang.Math.atan2(d17, fArr[0]) * 57.29577951308232d);
    }

    public float j(android.graphics.Matrix matrix) {
        float[] fArr = this.f235052n;
        matrix.getValues(fArr);
        double d17 = fArr[1];
        matrix.getValues(fArr);
        return (float) java.lang.Math.round(java.lang.Math.atan2(d17, fArr[0]) * 57.29577951308232d);
    }

    public float k() {
        android.graphics.Matrix matrix = this.f235040b;
        float[] fArr = this.f235052n;
        matrix.getValues(fArr);
        float f17 = fArr[3];
        this.f235040b.getValues(fArr);
        float f18 = fArr[0];
        return (float) java.lang.Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public hk0.u0 l() {
        l45.q qVar = this.f235039a;
        if (qVar != null) {
            return ((l45.n) qVar).f316484y;
        }
        return null;
    }

    public abstract dl.a m();

    public boolean n() {
        return this.f235044f && this.f235043e;
    }

    public boolean o() {
        try {
            return d().A3(true) > 0;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public boolean p(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        android.graphics.PointF pointF = this.f235050l;
        if (pointerCount <= 1) {
            if (motionEvent.getPointerCount() == 1) {
                return java.lang.Math.abs(pointF.x - motionEvent.getX(0)) > 3.0f || java.lang.Math.abs(pointF.y - motionEvent.getY(0)) > 3.0f;
            }
            return false;
        }
        if (java.lang.Math.abs(pointF.x - motionEvent.getX(0)) <= 3.0f && java.lang.Math.abs(pointF.y - motionEvent.getY(0)) <= 3.0f) {
            android.graphics.PointF pointF2 = this.f235051m;
            if (java.lang.Math.abs(pointF2.x - motionEvent.getX(1)) <= 3.0f && java.lang.Math.abs(pointF2.y - motionEvent.getY(1)) <= 3.0f) {
                return false;
            }
        }
        return true;
    }

    public boolean q() {
        return ((l45.n) this.f235039a).f().m() == m();
    }

    public void r() {
        ((l45.n) this.f235039a).f316460a.getBaseBoardView().postInvalidate();
    }

    public void s() {
        ((l45.n) this.f235039a).f316460a.getBaseFooterView().postInvalidate();
    }

    public void t() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseArtist" + m(), "[onAlive] isAlive:%s", java.lang.Boolean.valueOf(this.f235043e));
        if (this.f235043e) {
            return;
        }
        this.f235043e = true;
        um.m d17 = d();
        if (d17 != null) {
            d17.f3(false);
            d17.R2(false);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseArtist", "[onAlive] type:%s cache is null", m());
        }
        this.f235045g = e();
    }

    public void u(l45.q qVar, android.graphics.Matrix matrix, android.graphics.Rect rect) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseArtist" + m(), "[onCreate]");
        this.f235044f = true;
        this.f235039a = qVar;
        this.f235040b = matrix;
        this.f235041c = rect;
        this.f235042d = rect;
    }

    public void v(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.f235045g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f235045g, 0.0f, 0.0f, (android.graphics.Paint) null);
    }

    public void w() {
        this.f235044f = false;
        this.f235043e = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseArtist" + m(), "[onDestroy]");
        ((ku5.t0) ku5.t0.f312615d).B(new dl.d(this));
    }

    public boolean x(android.view.MotionEvent motionEvent) {
        if (!p(motionEvent)) {
            return false;
        }
        F(motionEvent);
        return false;
    }

    public abstract void y(android.graphics.Canvas canvas);

    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseArtist", "[onFinish] type:%s", m());
        this.f235043e = false;
        this.f235044f = false;
        um.m d17 = d();
        if (d17 != null) {
            d17.R2(true);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseArtist", "[onFinish] type:%s cache is null", m());
        }
        ((ku5.t0) ku5.t0.f312615d).B(new dl.d(this));
    }
}
