package gt4;

/* loaded from: classes13.dex */
public class r1 extends android.view.View {
    public boolean A;
    public final float B;
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView C;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f275513d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Canvas f275514e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f275515f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f275516g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f275517h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Paint f275518i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Path f275519m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Path f275520n;

    /* renamed from: o, reason: collision with root package name */
    public float f275521o;

    /* renamed from: p, reason: collision with root package name */
    public float f275522p;

    /* renamed from: q, reason: collision with root package name */
    public int f275523q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f275524r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f275525s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f275526t;

    /* renamed from: u, reason: collision with root package name */
    public q35.d f275527u;

    /* renamed from: v, reason: collision with root package name */
    public float f275528v;

    /* renamed from: w, reason: collision with root package name */
    public float f275529w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f275530x;

    /* renamed from: y, reason: collision with root package name */
    public long f275531y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f275532z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView walletScratchShakeView, android.content.Context context) {
        super(context);
        this.C = walletScratchShakeView;
        this.f275532z = false;
        this.B = 0.9f;
    }

    public boolean a(android.view.MotionEvent motionEvent) {
        if (this.f275513d == null) {
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3 && motionEvent.getAction() != 0) {
            return false;
        }
        int width = getWidth();
        getHeight();
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int i17 = (width * y17) + x17;
        getWidth();
        getHeight();
        motionEvent.getX();
        motionEvent.getY();
        return i17 > 0 && x17 > 0 && y17 > 0 && x17 < getWidth() && y17 < getHeight() && this.f275513d.getPixel(x17, y17) == 0;
    }

    public final boolean b() {
        if (this.f275529w < getHeight()) {
            return false;
        }
        this.A = true;
        if (!this.f275526t) {
            gt4.l1 l1Var = this.C.f180730g;
            if (l1Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "onFinishScratchOrShake");
                int i17 = ((gt4.v1) l1Var).f275570a.f180741p.f1111n;
            }
            this.f275526t = true;
        }
        if (this.f275514e != null) {
            this.f275520n.reset();
            this.f275520n.moveTo(0.0f, 0.0f);
            this.f275520n.lineTo(getWidth(), 0.0f);
            this.f275520n.lineTo(getWidth(), getHeight());
            this.f275520n.lineTo(0.0f, getHeight());
            this.f275514e.drawPath(this.f275520n, this.f275518i);
        }
        invalidate();
        return true;
    }

    public final void c() {
        if (this.f275514e != null) {
            this.f275520n.reset();
            this.f275520n.moveTo(0.0f, this.f275529w);
            this.f275520n.cubicTo(getWidth() / 2, getHeight(), getWidth() / 2, 0.0f, getWidth(), this.f275528v);
            this.f275520n.lineTo(getWidth(), 0.0f);
            this.f275520n.lineTo(0.0f, 0.0f);
            this.f275514e.drawPath(this.f275520n, this.f275518i);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        if (this.f275513d == null) {
            int width = getWidth();
            int height = getHeight();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletScratchShakeView", "createMasker width: %s, height: %s, waterMark: %s", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height), this.f275516g);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletScratchShakeView$WalletScratchShakeInnerView", "createMasker", "(II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/wallet_core/ui/view/WalletScratchShakeView$WalletScratchShakeInnerView", "createMasker", "(II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.f275513d = createBitmap;
            this.f275514e = new android.graphics.Canvas(this.f275513d);
            if (this.f275516g != null) {
                this.f275516g.setBounds(new android.graphics.Rect(0, 0, width, height));
                this.f275516g.draw(this.f275514e);
            }
            this.f275524r = new int[width * height];
        }
        canvas.drawBitmap(this.f275513d, 0.0f, 0.0f, this.f275515f);
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        if (!this.C.f180729f) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x17 = motionEvent.getX();
                    float y17 = motionEvent.getY();
                    if (this.f275514e != null) {
                        int abs = (int) java.lang.Math.abs(x17 - this.f275521o);
                        int abs2 = (int) java.lang.Math.abs(y17 - this.f275522p);
                        int i17 = this.f275523q;
                        if (abs >= i17 || abs2 >= i17) {
                            this.f275521o = x17;
                            this.f275522p = y17;
                            this.f275519m.quadTo((x17 + x17) / 2.0f, (y17 + y17) / 2.0f, x17, y17);
                            this.f275514e.drawPath(this.f275519m, this.f275517h);
                            this.f275519m.reset();
                            this.f275519m.moveTo(this.f275521o, this.f275522p);
                        }
                    }
                    invalidate();
                } else if (action != 3) {
                    z17 = false;
                    if (this.A && !a(motionEvent) && z17) {
                        return true;
                    }
                    return super.onTouchEvent(motionEvent);
                }
            }
            this.f275521o = 0.0f;
            this.f275522p = 0.0f;
            this.f275519m.reset();
            s75.d.b(new gt4.p1(this), "ScratchShakeView_calcErasePercentAndCallEnd");
            invalidate();
        } else {
            float x18 = motionEvent.getX();
            float y18 = motionEvent.getY();
            this.f275519m.reset();
            this.f275519m.moveTo(x18, y18);
            this.f275521o = x18;
            this.f275522p = y18;
            invalidate();
            if (!this.f275525s) {
                com.tencent.mm.sdk.platformtools.u3.i(new gt4.o1(this), 50L);
                this.f275525s = true;
            }
        }
        z17 = true;
        if (this.A) {
        }
        return super.onTouchEvent(motionEvent);
    }
}
