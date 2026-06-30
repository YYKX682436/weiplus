package ts0;

/* loaded from: classes10.dex */
public abstract class b implements ts0.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f421519a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f421520b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f421521c;

    /* renamed from: d, reason: collision with root package name */
    public final int f421522d;

    /* renamed from: e, reason: collision with root package name */
    public final us0.c f421523e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f421524f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f421525g;

    /* renamed from: h, reason: collision with root package name */
    public ts0.a f421526h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f421527i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f421528j;

    /* renamed from: k, reason: collision with root package name */
    public final di3.g0 f421529k;

    /* renamed from: l, reason: collision with root package name */
    public final ts0.c f421530l;

    /* renamed from: m, reason: collision with root package name */
    public gt0.c f421531m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.SurfaceTexture f421532n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.SurfaceHolder f421533o;

    /* renamed from: p, reason: collision with root package name */
    public int f421534p;

    /* renamed from: q, reason: collision with root package name */
    public android.util.Size f421535q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Float f421536r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Point f421537s;

    /* renamed from: t, reason: collision with root package name */
    public int f421538t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f421539u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f421540v;

    public b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f421519a = context;
        this.f421520b = "MicroMsg.BaseCommonCamera";
        this.f421521c = "MicroMsg.MMSightCameraSetting";
        this.f421522d = 2100;
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        kotlin.jvm.internal.o.f(mainLooper, "getMainLooper(...)");
        this.f421523e = new us0.c(mainLooper, context, this);
        this.f421525g = true;
        this.f421526h = ts0.a.f421515d;
        this.f421527i = true;
        this.f421529k = di3.g0.a();
        this.f421530l = ts0.c.f421541a;
        this.f421534p = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
        this.f421538t = -1;
    }

    public android.util.Size C(android.graphics.Point displaySize) {
        java.lang.String str = this.f421520b;
        kotlin.jvm.internal.o.g(displaySize, "displaySize");
        try {
            boolean D = D();
            android.util.Size[] F = F();
            if (F == null) {
                com.tencent.mars.xlog.Log.e(str, "preview size null!!");
                return null;
            }
            di3.s c17 = di3.t.c(F, displaySize, this.f421534p, D);
            if (c17.f232757a == null) {
                com.tencent.mars.xlog.Log.e(str, "preview size still null!!");
                c17 = di3.t.h(F, new android.graphics.Point(java.lang.Math.min(displaySize.x, displaySize.y), java.lang.Math.max(displaySize.x, displaySize.y)), this.f421522d, D);
            }
            if (c17.f232757a == null) {
                com.tencent.mars.xlog.Log.i(str, "checkMore start %s", c17.toString());
                c17.f232757a = c17.f232760d;
                c17.f232758b = c17.f232761e;
                c17.f232759c = c17.f232762f;
            }
            android.graphics.Point point = c17.f232757a;
            android.util.Size size = new android.util.Size(point.x, point.y);
            com.tencent.mars.xlog.Log.i(str, "final set camera preview size: " + size + ", cropSize: " + this.f421537s);
            return size;
        } catch (android.hardware.camera2.CameraAccessException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "selectNoCropPreviewSize Exception by camera access exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            return null;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e18, "selectNoCropPreviewSize Exception, %s, %s", android.os.Looper.myLooper(), e18.getMessage());
            return null;
        }
    }

    public abstract boolean D();

    public final android.graphics.Point E() {
        if (this.f421535q == null) {
            return ai3.d.f(this.f421519a);
        }
        android.util.Size size = this.f421535q;
        kotlin.jvm.internal.o.d(size);
        int width = size.getWidth();
        android.util.Size size2 = this.f421535q;
        kotlin.jvm.internal.o.d(size2);
        return new android.graphics.Point(width, size2.getHeight());
    }

    public abstract android.util.Size[] F();

    public boolean G() {
        return this.f421526h == ts0.a.f421516e;
    }

    public void H() {
        us0.c cVar = this.f421523e;
        vs0.l lVar = cVar.f430452f;
        if (lVar != null) {
            lVar.b();
        }
        android.os.HandlerThread handlerThread = cVar.f430450d;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    public boolean I(int i17) {
        di3.g0 g0Var = this.f421529k;
        java.lang.String str = this.f421520b;
        try {
            boolean D = D();
            android.graphics.Point E = E();
            android.util.Size[] F = F();
            if (F == null) {
                com.tencent.mars.xlog.Log.e(str, "preview size null!!");
                return false;
            }
            di3.s c17 = di3.t.c(F, E, i17, D);
            if (c17.f232757a == null) {
                com.tencent.mars.xlog.Log.e(str, "preview size still null!!");
                c17 = di3.t.h(F, new android.graphics.Point(java.lang.Math.min(E.x, E.y), java.lang.Math.max(E.x, E.y)), this.f421522d, D);
            }
            if (c17.f232757a == null) {
                com.tencent.mars.xlog.Log.i(str, "checkMore start %s", c17.toString());
                c17.f232757a = c17.f232760d;
                c17.f232758b = c17.f232761e;
                c17.f232759c = c17.f232762f;
            }
            android.graphics.Point point = c17.f232757a;
            android.util.Size size = new android.util.Size(point.x, point.y);
            g0Var.f232711c = size.getWidth();
            g0Var.f232710b = size.getHeight();
            android.graphics.Point point2 = c17.f232759c;
            if (point2 != null) {
                this.f421537s = point2;
            }
            J(size.getWidth(), size.getHeight());
            com.tencent.mars.xlog.Log.i(str, "final set camera preview size: " + size + ", cropSize: " + this.f421537s);
            return true;
        } catch (android.hardware.camera2.CameraAccessException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "selectNoCropPreviewSize Exception by camera access exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            return false;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e18, "selectNoCropPreviewSize Exception, %s, %s", android.os.Looper.myLooper(), e18.getMessage());
            return false;
        }
    }

    public abstract boolean J(int i17, int i18);

    public final void K() {
        android.content.Context context;
        if (this.f421524f || (context = this.f421519a) == null) {
            return;
        }
        if (!r26.i0.p(android.os.Build.MANUFACTURER, "meizu", true) || zo.e.d()) {
            com.tencent.mm.autogen.events.PermissionShowDlgEvent permissionShowDlgEvent = new com.tencent.mm.autogen.events.PermissionShowDlgEvent();
            permissionShowDlgEvent.f54614g.f6856a = 2;
            permissionShowDlgEvent.e();
            permissionShowDlgEvent.f54615h.getClass();
            com.tencent.mm.ui.widget.dialog.j0 i17 = db5.e1.i(context, com.tencent.mm.R.string.j4f, com.tencent.mm.R.string.f490573yv);
            if (i17 != null) {
                i17.setCancelable(false);
                i17.setCanceledOnTouchOutside(false);
                i17.show();
                this.f421524f = true;
            }
        }
    }

    public abstract void L(android.view.SurfaceHolder surfaceHolder, boolean z17, int i17);

    public boolean M() {
        android.graphics.SurfaceTexture surfaceTexture = this.f421532n;
        java.lang.String str = this.f421520b;
        if (surfaceTexture == null && this.f421533o == null) {
            com.tencent.mars.xlog.Log.e(str, " do you forget override func startPreview");
            return false;
        }
        if (!G()) {
            com.tencent.mars.xlog.Log.e(str, " now is cpature image and refuse to switchCamera");
            return false;
        }
        release();
        android.content.Context context = this.f421519a;
        kotlin.jvm.internal.o.d(context);
        c(context, !this.f421525g);
        com.tencent.mars.xlog.Log.i(str, "useCpuCrop : " + this.f421527i + " , resolutionLimit: " + this.f421534p);
        android.graphics.SurfaceTexture surfaceTexture2 = this.f421532n;
        if (surfaceTexture2 != null) {
            kotlin.jvm.internal.o.d(surfaceTexture2);
            r(surfaceTexture2, this.f421527i, this.f421536r, this.f421534p);
            return this.f421525g;
        }
        android.view.SurfaceHolder surfaceHolder = this.f421533o;
        kotlin.jvm.internal.o.d(surfaceHolder);
        L(surfaceHolder, this.f421527i, this.f421534p);
        return this.f421525g;
    }

    @Override // ts0.r
    public boolean g(yz5.l dataCallback) {
        kotlin.jvm.internal.o.g(dataCallback, "dataCallback");
        return false;
    }

    @Override // ts0.r
    public boolean x(yz5.l dataCallback) {
        kotlin.jvm.internal.o.g(dataCallback, "dataCallback");
        return false;
    }
}
