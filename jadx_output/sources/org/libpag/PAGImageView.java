package org.libpag;

/* loaded from: classes13.dex */
public class PAGImageView extends android.view.View implements org.libpag.PAGAnimator.Listener {
    private volatile int A;
    private volatile int B;
    android.graphics.Paint C;
    private volatile boolean D;
    private volatile boolean E;
    private java.util.concurrent.atomic.AtomicBoolean F;
    private boolean G;

    /* renamed from: a, reason: collision with root package name */
    private org.libpag.PAGAnimator f347772a;

    /* renamed from: b, reason: collision with root package name */
    private float f347773b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f347774c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile org.libpag.c.a f347775d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.Object f347776e;

    /* renamed from: f, reason: collision with root package name */
    private volatile android.graphics.Bitmap f347777f;

    /* renamed from: g, reason: collision with root package name */
    private volatile android.graphics.Bitmap f347778g;

    /* renamed from: h, reason: collision with root package name */
    private volatile android.hardware.HardwareBuffer f347779h;

    /* renamed from: i, reason: collision with root package name */
    private volatile android.graphics.Bitmap f347780i;

    /* renamed from: j, reason: collision with root package name */
    private volatile android.hardware.HardwareBuffer f347781j;

    /* renamed from: k, reason: collision with root package name */
    private android.graphics.Matrix f347782k;

    /* renamed from: l, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentHashMap f347783l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f347784m;

    /* renamed from: n, reason: collision with root package name */
    private org.libpag.PAGComposition f347785n;

    /* renamed from: o, reason: collision with root package name */
    private int f347786o;

    /* renamed from: p, reason: collision with root package name */
    private volatile android.graphics.Matrix f347787p;

    /* renamed from: q, reason: collision with root package name */
    private float f347788q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f347789r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f347790s;

    /* renamed from: t, reason: collision with root package name */
    private int f347791t;

    /* renamed from: u, reason: collision with root package name */
    private int f347792u;

    /* renamed from: v, reason: collision with root package name */
    int f347793v;

    /* renamed from: w, reason: collision with root package name */
    long f347794w;

    /* renamed from: x, reason: collision with root package name */
    private final java.util.ArrayList f347795x;

    /* renamed from: y, reason: collision with root package name */
    private volatile int f347796y;

    /* renamed from: z, reason: collision with root package name */
    private volatile int f347797z;

    /* loaded from: classes13.dex */
    public interface PAGImageViewListener {
        void onAnimationCancel(org.libpag.PAGImageView pAGImageView);

        void onAnimationEnd(org.libpag.PAGImageView pAGImageView);

        void onAnimationRepeat(org.libpag.PAGImageView pAGImageView);

        void onAnimationStart(org.libpag.PAGImageView pAGImageView);

        void onAnimationUpdate(org.libpag.PAGImageView pAGImageView);
    }

    static {
        b56.a.a("pag");
    }

    public PAGImageView(android.content.Context context) {
        super(context);
        this.f347773b = 30.0f;
        this.f347774c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f347775d = new org.libpag.c.a();
        this.f347776e = new java.lang.Object();
        this.f347783l = new java.util.concurrent.ConcurrentHashMap();
        this.f347786o = 2;
        this.f347788q = 1.0f;
        this.f347789r = false;
        this.f347790s = false;
        this.f347792u = 0;
        this.f347793v = -1;
        this.f347794w = 0L;
        this.f347795x = new java.util.ArrayList();
        this.C = null;
        this.D = false;
        this.E = false;
        this.F = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.G = false;
        e();
    }

    private static native int ContentVersion(org.libpag.PAGComposition pAGComposition);

    @java.lang.Deprecated
    public static long MaxDiskCache() {
        return org.libpag.PAGDiskCache.MaxDiskSize();
    }

    @java.lang.Deprecated
    public static void SetMaxDiskCache(long j17) {
        org.libpag.PAGDiskCache.SetMaxDiskSize(j17);
    }

    private void b() {
        org.libpag.PAGComposition pAGComposition;
        boolean z17 = false;
        if (this.f347790s) {
            this.f347790s = false;
            z17 = true;
        }
        if (this.f347784m == null && (pAGComposition = this.f347785n) != null) {
            int ContentVersion = ContentVersion(pAGComposition);
            int i17 = this.f347793v;
            boolean z18 = (i17 < 0 || i17 == ContentVersion) ? z17 : true;
            this.f347793v = ContentVersion;
            z17 = z18;
        }
        if (z17) {
            this.f347783l.clear();
            if (this.f347775d.a()) {
                return;
            }
            org.libpag.PAGComposition pAGComposition2 = this.f347785n;
            if (pAGComposition2 == null) {
                pAGComposition2 = a(this.f347784m);
            }
            this.f347775d.a(pAGComposition2, this.f347796y, this.f347797z, this.f347773b);
        }
    }

    private void c() {
        boolean z17 = this.D && isShown() && d();
        if (this.G == z17) {
            return;
        }
        this.G = z17;
        if (!z17) {
            this.f347772a.setDuration(0L);
            return;
        }
        org.libpag.PAGComposition pAGComposition = this.f347785n;
        this.f347772a.setDuration(pAGComposition != null ? pAGComposition.duration() : this.f347794w);
        this.f347772a.update();
    }

    private boolean d() {
        return this.f347796y > 0 && this.f347797z > 0;
    }

    private void e() {
        this.C = new android.graphics.Paint(6);
        this.f347772a = org.libpag.PAGAnimator.a(getContext(), this);
    }

    private void g() {
        int i17 = this.f347786o;
        if (i17 == 0) {
            return;
        }
        this.f347787p = org.libpag.c.a(i17, this.f347775d.f347827a, this.f347775d.f347828b, this.f347796y, this.f347797z);
    }

    private void h() {
        if (!this.f347775d.b() && this.f347792u == 0 && this.f347796y > 0) {
            f();
        }
        if (this.f347775d.b() && this.f347775d.a()) {
            this.f347792u = this.f347775d.c();
        }
    }

    private void i() {
        synchronized (this.f347776e) {
            this.f347777f = null;
            this.f347778g = null;
            this.f347780i = null;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                if (this.f347779h != null) {
                    this.f347779h.close();
                    this.f347779h = null;
                }
                if (this.f347781j != null) {
                    this.f347781j.close();
                    this.f347781j = null;
                }
            }
        }
    }

    private void j() {
        if (a()) {
            this.f347775d.d();
        }
    }

    public void addListener(org.libpag.PAGImageView.PAGImageViewListener pAGImageViewListener) {
        synchronized (this) {
            this.f347795x.add(pAGImageViewListener);
        }
    }

    public boolean cacheAllFramesInMemory() {
        return this.f347789r;
    }

    public int currentFrame() {
        return this.f347791t;
    }

    public android.graphics.Bitmap currentImage() {
        return this.f347777f;
    }

    public void f() {
        synchronized (this.f347775d) {
            if (!this.f347775d.b()) {
                if (this.f347785n == null) {
                    this.f347785n = a(this.f347784m);
                }
                if (this.f347775d.a(this.f347785n, this.f347796y, this.f347797z, this.f347773b) && this.f347784m != null) {
                    this.f347785n = null;
                }
                if (!this.f347775d.b()) {
                    return;
                }
            }
            g();
            this.f347774c.set(false);
        }
    }

    public void finalize() {
        super.finalize();
    }

    public boolean flush() {
        if (!this.f347775d.b()) {
            f();
            if (!this.f347775d.b()) {
                postInvalidate();
                return false;
            }
        }
        if (this.f347775d.a()) {
            this.f347792u = this.f347775d.c();
        }
        int a17 = org.libpag.c.a(this.f347772a.progress(), this.f347792u);
        this.f347791t = a17;
        if (!a(a17)) {
            this.E = false;
            return false;
        }
        this.E = false;
        postInvalidate();
        return true;
    }

    public org.libpag.PAGComposition getComposition() {
        if (this.f347784m != null) {
            return null;
        }
        return this.f347785n;
    }

    public java.lang.String getPath() {
        return this.f347784m;
    }

    public boolean isPlaying() {
        return this.f347772a.isRunning();
    }

    public android.graphics.Matrix matrix() {
        return this.f347787p;
    }

    public int numFrames() {
        h();
        return this.f347792u;
    }

    @Override // org.libpag.PAGAnimator.Listener
    public void onAnimationCancel(org.libpag.PAGAnimator pAGAnimator) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f347795x);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.libpag.PAGImageView.PAGImageViewListener) it.next()).onAnimationCancel(this);
        }
    }

    @Override // org.libpag.PAGAnimator.Listener
    public void onAnimationEnd(org.libpag.PAGAnimator pAGAnimator) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f347795x);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.libpag.PAGImageView.PAGImageViewListener) it.next()).onAnimationEnd(this);
        }
    }

    @Override // org.libpag.PAGAnimator.Listener
    public void onAnimationRepeat(org.libpag.PAGAnimator pAGAnimator) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f347795x);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.libpag.PAGImageView.PAGImageViewListener) it.next()).onAnimationRepeat(this);
        }
    }

    @Override // org.libpag.PAGAnimator.Listener
    public void onAnimationStart(org.libpag.PAGAnimator pAGAnimator) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f347795x);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.libpag.PAGImageView.PAGImageViewListener) it.next()).onAnimationStart(this);
        }
    }

    @Override // org.libpag.PAGAnimator.Listener
    public void onAnimationUpdate(org.libpag.PAGAnimator pAGAnimator) {
        java.util.ArrayList arrayList;
        org.libpag.PAGComposition pAGComposition;
        if (this.D) {
            if (this.G && (pAGComposition = this.f347785n) != null) {
                pAGAnimator.setDuration(pAGComposition.duration());
            }
            flush();
            synchronized (this) {
                arrayList = new java.util.ArrayList(this.f347795x);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((org.libpag.PAGImageView.PAGImageViewListener) it.next()).onAnimationUpdate(this);
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        this.D = true;
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.D = false;
        super.onDetachedFromWindow();
        c();
        this.f347775d.e();
        if (this.f347772a.isRunning()) {
            i();
        }
        this.f347783l.clear();
        this.f347793v = -1;
        this.f347790s = false;
        this.f347774c.set(false);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f347774c.get() || this.f347777f == null || this.f347777f.isRecycled()) {
            return;
        }
        super.onDraw(canvas);
        int saveCount = canvas.getSaveCount();
        canvas.save();
        android.graphics.Matrix matrix = this.f347782k;
        if (matrix != null) {
            canvas.concat(matrix);
        }
        if (this.f347787p != null) {
            canvas.concat(this.f347787p);
        }
        try {
            canvas.drawBitmap(this.f347777f, 0.0f, 0.0f, this.C);
        } catch (java.lang.Exception unused) {
        }
        canvas.restoreToCount(saveCount);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f347774c.set(true);
        this.f347775d.e();
        this.A = i17;
        this.B = i18;
        this.f347796y = (int) (this.f347788q * i17);
        this.f347797z = (int) (this.f347788q * i18);
        i();
        this.E = true;
        c();
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z17) {
        super.onVisibilityAggregated(z17);
        c();
    }

    public void pause() {
        this.f347772a.cancel();
    }

    public void play() {
        this.f347772a.a();
    }

    public void removeListener(org.libpag.PAGImageView.PAGImageViewListener pAGImageViewListener) {
        synchronized (this) {
            this.f347795x.remove(pAGImageViewListener);
        }
    }

    public float renderScale() {
        return this.f347788q;
    }

    public int repeatCount() {
        return this.f347772a.repeatCount();
    }

    public int scaleMode() {
        return this.f347786o;
    }

    public void setCacheAllFramesInMemory(boolean z17) {
        this.f347790s = z17 != this.f347789r;
        this.f347789r = z17;
    }

    public void setComposition(org.libpag.PAGComposition pAGComposition) {
        setComposition(pAGComposition, 30.0f);
    }

    public void setCurrentFrame(int i17) {
        int i18;
        h();
        if (this.f347792u == 0 || !this.f347775d.b() || i17 < 0 || i17 >= (i18 = this.f347792u)) {
            return;
        }
        this.f347791t = i17;
        this.f347772a.setProgress(org.libpag.c.a(i17, i18));
        this.f347772a.update();
    }

    public void setMatrix(android.graphics.Matrix matrix) {
        this.f347787p = matrix;
        this.f347786o = 0;
        if (d()) {
            postInvalidate();
        }
    }

    public boolean setPath(java.lang.String str) {
        return setPath(str, 30.0f);
    }

    public void setPathAsync(java.lang.String str, org.libpag.PAGFile.LoadListener loadListener) {
        setPathAsync(str, 30.0f, loadListener);
    }

    public void setRenderScale(float f17) {
        if (this.f347788q == f17) {
            return;
        }
        if (f17 < 0.0f || f17 > 1.0f) {
            f17 = 1.0f;
        }
        this.f347788q = f17;
        this.f347796y = (int) (this.A * f17);
        this.f347797z = (int) (this.B * f17);
        g();
        if (f17 < 1.0f) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            this.f347782k = matrix;
            float f18 = 1.0f / f17;
            matrix.setScale(f18, f18);
        }
    }

    public void setRepeatCount(int i17) {
        this.f347772a.setRepeatCount(i17);
    }

    public void setScaleMode(int i17) {
        if (i17 == this.f347786o) {
            return;
        }
        this.f347786o = i17;
        if (!d()) {
            this.f347787p = null;
        } else {
            g();
            postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str, float f17, org.libpag.PAGFile.LoadListener loadListener) {
        setPath(str, f17);
        if (loadListener != null) {
            loadListener.onLoad((org.libpag.PAGFile) this.f347785n);
        }
    }

    public void setComposition(org.libpag.PAGComposition pAGComposition, float f17) {
        a((java.lang.String) null, pAGComposition, f17);
    }

    public boolean setPath(java.lang.String str, float f17) {
        org.libpag.PAGComposition a17 = a(str);
        a(str, a17, f17);
        return a17 != null;
    }

    public void setPathAsync(final java.lang.String str, final float f17, final org.libpag.PAGFile.LoadListener loadListener) {
        org.libpag.NativeTask.Run(new java.lang.Runnable() { // from class: org.libpag.PAGImageView$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.libpag.PAGImageView.this.a(str, f17, loadListener);
            }
        });
    }

    private org.libpag.PAGComposition a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("assets://")) {
            return org.libpag.PAGFile.Load(getContext().getAssets(), str.substring(9));
        }
        return org.libpag.PAGFile.Load(str);
    }

    private void a(java.lang.String str, org.libpag.PAGComposition pAGComposition, float f17) {
        this.f347774c.set(true);
        this.f347775d.e();
        this.f347773b = f17;
        this.f347787p = null;
        i();
        this.f347784m = str;
        this.f347785n = pAGComposition;
        this.f347791t = 0;
        this.f347772a.setProgress(pAGComposition == null ? 0.0d : pAGComposition.getProgress());
        org.libpag.PAGComposition pAGComposition2 = this.f347785n;
        long duration = pAGComposition2 == null ? 0L : pAGComposition2.duration();
        this.f347794w = duration;
        if (this.G) {
            this.f347772a.setDuration(duration);
        }
        this.f347772a.update();
    }

    private boolean a() {
        if (this.f347775d.b() && this.f347775d.a()) {
            this.f347792u = this.f347775d.c();
        }
        return this.f347783l.size() == this.f347792u;
    }

    public PAGImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f347773b = 30.0f;
        this.f347774c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f347775d = new org.libpag.c.a();
        this.f347776e = new java.lang.Object();
        this.f347783l = new java.util.concurrent.ConcurrentHashMap();
        this.f347786o = 2;
        this.f347788q = 1.0f;
        this.f347789r = false;
        this.f347790s = false;
        this.f347792u = 0;
        this.f347793v = -1;
        this.f347794w = 0L;
        this.f347795x = new java.util.ArrayList();
        this.C = null;
        this.D = false;
        this.E = false;
        this.F = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.G = false;
        e();
    }

    private boolean a(int i17) {
        android.hardware.HardwareBuffer hardwareBuffer;
        android.graphics.Bitmap bitmap;
        if (!this.f347775d.b() || this.f347774c.get()) {
            return false;
        }
        b();
        j();
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) this.f347783l.get(java.lang.Integer.valueOf(i17));
        if (bitmap2 != null) {
            this.f347777f = bitmap2;
            return true;
        }
        if (this.f347774c.get() || !this.f347775d.a()) {
            return false;
        }
        if (!this.E && !this.f347775d.a(i17)) {
            return true;
        }
        synchronized (this.f347776e) {
            if (this.f347778g == null || this.f347789r) {
                android.util.Pair a17 = org.libpag.a.a(this.f347775d.f347827a, this.f347775d.f347828b, false);
                java.lang.Object obj = a17.first;
                if (obj == null) {
                    return false;
                }
                this.f347778g = (android.graphics.Bitmap) obj;
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    this.f347779h = (android.hardware.HardwareBuffer) a17.second;
                }
            }
            if (this.f347778g == null) {
                return false;
            }
            if (!this.f347789r) {
                if (this.f347780i == null) {
                    android.util.Pair a18 = org.libpag.a.a(this.f347775d.f347827a, this.f347775d.f347828b, false);
                    if (a18.first == null) {
                        return false;
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        this.f347781j = (android.hardware.HardwareBuffer) a18.second;
                    }
                    this.f347780i = (android.graphics.Bitmap) a18.first;
                }
                if (this.F.get()) {
                    bitmap = this.f347778g;
                    hardwareBuffer = this.f347779h;
                } else {
                    bitmap = this.f347780i;
                    hardwareBuffer = this.f347781j;
                }
                this.F.set(!r5.get());
            } else {
                hardwareBuffer = this.f347779h;
                bitmap = this.f347778g;
            }
            if (hardwareBuffer != null) {
                if (!this.f347775d.a(i17, hardwareBuffer)) {
                    return false;
                }
            } else {
                if (!this.f347775d.a(bitmap, i17)) {
                    return false;
                }
                bitmap.prepareToDraw();
            }
            this.f347777f = bitmap;
            if (this.f347789r && this.f347777f != null) {
                this.f347783l.put(java.lang.Integer.valueOf(i17), this.f347777f);
            }
            return true;
        }
    }

    public PAGImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f347773b = 30.0f;
        this.f347774c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f347775d = new org.libpag.c.a();
        this.f347776e = new java.lang.Object();
        this.f347783l = new java.util.concurrent.ConcurrentHashMap();
        this.f347786o = 2;
        this.f347788q = 1.0f;
        this.f347789r = false;
        this.f347790s = false;
        this.f347792u = 0;
        this.f347793v = -1;
        this.f347794w = 0L;
        this.f347795x = new java.util.ArrayList();
        this.C = null;
        this.D = false;
        this.E = false;
        this.F = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.G = false;
        e();
    }
}
