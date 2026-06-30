package mj;

/* loaded from: classes12.dex */
public class i implements jj.e {

    /* renamed from: o, reason: collision with root package name */
    public static mj.i f326968o;

    /* renamed from: a, reason: collision with root package name */
    public android.view.WindowManager f326971a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.WindowManager.LayoutParams f326972b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f326973c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.matrix.trace.view.FloatFrameView f326974d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnClickListener f326975e;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.DisplayMetrics f326976f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f326977g;

    /* renamed from: h, reason: collision with root package name */
    public final int f326978h;

    /* renamed from: i, reason: collision with root package name */
    public final int f326979i;

    /* renamed from: j, reason: collision with root package name */
    public final int f326980j;

    /* renamed from: k, reason: collision with root package name */
    public final int f326981k;

    /* renamed from: l, reason: collision with root package name */
    public final int f326982l;

    /* renamed from: m, reason: collision with root package name */
    public int f326983m;

    /* renamed from: n, reason: collision with root package name */
    public static final android.os.Handler f326967n = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.Object f326969p = new java.lang.Object();

    /* renamed from: q, reason: collision with root package name */
    public static final int f326970q = android.os.Build.VERSION.SDK_INT;

    public i(android.content.Context context, com.tencent.matrix.trace.view.FloatFrameView floatFrameView) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        this.f326976f = displayMetrics;
        this.f326977g = true;
        mj.a aVar = new mj.a(this);
        this.f326974d = floatFrameView;
        int color = context.getResources().getColor(com.tencent.mm.R.color.f479295vb);
        this.f326978h = color;
        this.f326979i = context.getResources().getColor(com.tencent.mm.R.color.f479299vf);
        this.f326980j = context.getResources().getColor(com.tencent.mm.R.color.f479298ve);
        this.f326981k = context.getResources().getColor(com.tencent.mm.R.color.f479297vd);
        this.f326982l = context.getResources().getColor(com.tencent.mm.R.color.f479296vc);
        this.f326983m = color;
        com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.observeForever(aVar);
        floatFrameView.addOnAttachStateChangeListener(new mj.b(this));
        this.f326971a = (android.view.WindowManager) context.getApplicationContext().getSystemService("window");
        try {
            android.util.DisplayMetrics displayMetrics2 = new android.util.DisplayMetrics();
            if (this.f326971a.getDefaultDisplay() != null) {
                this.f326971a.getDefaultDisplay().getMetrics(displayMetrics);
                this.f326971a.getDefaultDisplay().getMetrics(displayMetrics2);
            }
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
            this.f326972b = layoutParams;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                layoutParams.type = 2038;
            } else {
                layoutParams.type = 2002;
            }
            layoutParams.flags = 40;
            layoutParams.gravity = 8388659;
            layoutParams.x = displayMetrics2.widthPixels - (floatFrameView.getLayoutParams().width * 2);
            android.view.WindowManager.LayoutParams layoutParams2 = this.f326972b;
            layoutParams2.y = 0;
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            layoutParams2.format = -2;
        } catch (java.lang.Exception unused) {
        }
        floatFrameView.setOnTouchListener(new mj.d(this, floatFrameView));
    }

    public static void e(mj.i iVar, boolean z17) {
        android.os.Handler handler;
        iVar.getClass();
        oj.j.c("Matrix.FrameDecorator", "[onForeground] isForeground:%s", java.lang.Boolean.valueOf(z17));
        if (iVar.f326977g && (handler = f326967n) != null) {
            handler.post(new mj.h(iVar, z17));
        }
    }

    @Override // jj.e
    public void a(java.lang.String str, long[] jArr, int[] iArr, int[] iArr2, float f17, float f18, float f19) {
        java.lang.String format = java.lang.String.format("unknown delay: %.1fms", java.lang.Double.valueOf(jArr[0] / 1000000.0d));
        java.lang.String format2 = java.lang.String.format("input handling: %.1fms", java.lang.Double.valueOf(jArr[1] / 1000000.0d));
        java.lang.String format3 = java.lang.String.format("animation: %.1fms", java.lang.Double.valueOf(jArr[2] / 1000000.0d));
        java.lang.String format4 = java.lang.String.format("layout measure: %.1fms", java.lang.Double.valueOf(jArr[3] / 1000000.0d));
        java.lang.String format5 = java.lang.String.format("draw: %.1fms", java.lang.Double.valueOf(jArr[4] / 1000000.0d));
        java.lang.String format6 = java.lang.String.format("sync: %.1fms", java.lang.Double.valueOf(jArr[5] / 1000000.0d));
        java.lang.String format7 = java.lang.String.format("command issue: %.1fms", java.lang.Double.valueOf(jArr[6] / 1000000.0d));
        java.lang.String format8 = java.lang.String.format("swap buffers: %.1fms", java.lang.Double.valueOf(jArr[7] / 1000000.0d));
        java.lang.String format9 = java.lang.String.format("gpu: %.1fms", java.lang.Double.valueOf(jArr[9] / 1000000.0d));
        java.lang.String format10 = java.lang.String.format("total: %.1fms", java.lang.Double.valueOf(jArr[8] / 1000000.0d));
        if (f19 <= f18 - 42.0f) {
            this.f326983m = this.f326982l;
        } else if (f19 <= f18 - 24.0f) {
            this.f326983m = this.f326981k;
        } else if (f19 <= f18 - 9.0f) {
            this.f326983m = this.f326980j;
        } else if (f19 <= f18 - 3.0f) {
            this.f326983m = this.f326979i;
        } else {
            this.f326983m = this.f326978h;
        }
        f326967n.post(new com.tencent.matrix.trace.view.b(this, f19, format, format2, format3, format4, format5, format6, format7, format8, format9, format10, java.util.Arrays.copyOf(iArr2, iArr2.length), java.util.Arrays.copyOf(iArr, iArr.length)));
    }

    @Override // jj.e
    public boolean b() {
        return false;
    }

    @Override // jj.e
    public int c() {
        return 200;
    }

    @Override // jj.e
    public int d() {
        return 0;
    }

    @Override // jj.e
    public java.lang.String getName() {
        return null;
    }
}
