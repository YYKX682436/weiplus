package ym5;

/* loaded from: classes15.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f463393d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.OverScroller f463394e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.OverScroller f463395f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.Scroller f463396g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.Scroller f463397h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.Scroller f463398i;

    /* renamed from: m, reason: collision with root package name */
    public ym5.d3 f463399m;

    /* renamed from: n, reason: collision with root package name */
    public int f463400n;

    /* renamed from: o, reason: collision with root package name */
    public int f463401o;

    /* renamed from: p, reason: collision with root package name */
    public int f463402p;

    /* renamed from: q, reason: collision with root package name */
    public int f463403q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.RectF f463404r = new android.graphics.RectF();

    /* renamed from: s, reason: collision with root package name */
    public final ym5.f3 f463405s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.PhotoView f463406t;

    public j3(com.tencent.mm.view.PhotoView photoView) {
        this.f463406t = photoView;
        ym5.f3 f3Var = new ym5.f3(photoView, null);
        this.f463405s = f3Var;
        android.content.Context context = photoView.getContext();
        this.f463394e = new android.widget.OverScroller(context, f3Var);
        this.f463396g = new android.widget.Scroller(context, f3Var);
        this.f463395f = new android.widget.OverScroller(context, f3Var);
        this.f463397h = new android.widget.Scroller(context, f3Var);
        this.f463398i = new android.widget.Scroller(context, f3Var);
    }

    public final void a() {
        com.tencent.mm.view.PhotoView photoView = this.f463406t;
        photoView.f213387o.reset();
        android.graphics.Matrix matrix = photoView.f213387o;
        android.graphics.RectF rectF = photoView.K;
        matrix.postTranslate(-rectF.left, -rectF.top);
        android.graphics.Matrix matrix2 = photoView.f213387o;
        android.graphics.PointF pointF = photoView.R;
        matrix2.postTranslate(pointF.x, pointF.y);
        photoView.f213387o.postTranslate(-photoView.H, -photoView.I);
        android.graphics.Matrix matrix3 = photoView.f213387o;
        float f17 = photoView.D;
        android.graphics.PointF pointF2 = photoView.R;
        matrix3.postRotate(f17, pointF2.x, pointF2.y);
        android.graphics.Matrix matrix4 = photoView.f213387o;
        float f18 = photoView.E;
        android.graphics.PointF pointF3 = photoView.Q;
        matrix4.postScale(f18, f18, pointF3.x, pointF3.y);
        photoView.f213387o.postTranslate(photoView.F, photoView.G);
        photoView.u();
    }

    public void b() {
        this.f463406t.removeCallbacks(this);
        this.f463394e.abortAnimation();
        this.f463396g.abortAnimation();
        this.f463395f.abortAnimation();
        this.f463398i.abortAnimation();
        this.f463393d = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean computeScrollOffset = this.f463396g.computeScrollOffset();
        boolean z18 = false;
        com.tencent.mm.view.PhotoView photoView = this.f463406t;
        boolean z19 = true;
        if (computeScrollOffset) {
            photoView.E = r0.getCurrX() / 10000.0f;
            z17 = false;
        } else {
            z17 = true;
        }
        android.widget.OverScroller overScroller = this.f463394e;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX() - this.f463402p;
            int currY = overScroller.getCurrY() - this.f463403q;
            photoView.F += currX;
            photoView.G += currY;
            this.f463402p = overScroller.getCurrX();
            this.f463403q = overScroller.getCurrY();
            z17 = false;
        }
        android.widget.OverScroller overScroller2 = this.f463395f;
        if (overScroller2.computeScrollOffset()) {
            int currX2 = overScroller2.getCurrX() - this.f463400n;
            int currY2 = overScroller2.getCurrY() - this.f463401o;
            this.f463400n = overScroller2.getCurrX();
            this.f463401o = overScroller2.getCurrY();
            photoView.F += currX2;
            photoView.G += currY2;
            z17 = false;
        }
        if (this.f463398i.computeScrollOffset()) {
            photoView.D = r1.getCurrX();
            z17 = false;
        }
        if (this.f463397h.computeScrollOffset() || photoView.T != null) {
            float currX3 = r1.getCurrX() / 10000.0f;
            float currY3 = r1.getCurrY() / 10000.0f;
            android.graphics.Matrix matrix = photoView.f213391q;
            android.graphics.RectF rectF = photoView.L;
            matrix.setScale(currX3, currY3, (rectF.left + rectF.right) / 2.0f, this.f463399m.a());
            android.graphics.Matrix matrix2 = photoView.f213391q;
            android.graphics.RectF rectF2 = this.f463404r;
            matrix2.mapRect(rectF2, photoView.L);
            if (currX3 == 1.0f) {
                android.graphics.RectF rectF3 = photoView.f213379J;
                rectF2.left = rectF3.left;
                rectF2.right = rectF3.right;
            }
            if (currY3 == 1.0f) {
                android.graphics.RectF rectF4 = photoView.f213379J;
                rectF2.top = rectF4.top;
                rectF2.bottom = rectF4.bottom;
            }
            photoView.T = rectF2;
        }
        if (!z17) {
            a();
            if (this.f463393d) {
                photoView.post(this);
                return;
            }
            return;
        }
        this.f463393d = false;
        if (photoView.B) {
            android.graphics.RectF rectF5 = photoView.L;
            float f17 = rectF5.left;
            if (f17 > 0.0f) {
                photoView.F = (int) (photoView.F - f17);
            } else if (rectF5.right < photoView.f213379J.width()) {
                photoView.F -= (int) (photoView.f213379J.width() - photoView.L.right);
            }
            z18 = true;
        }
        if (photoView.C) {
            android.graphics.RectF rectF6 = photoView.L;
            float f18 = rectF6.top;
            if (f18 > 0.0f) {
                photoView.G = (int) (photoView.G - f18);
            } else if (rectF6.bottom < photoView.f213379J.height()) {
                photoView.G -= (int) (photoView.f213379J.height() - photoView.L.bottom);
            }
        } else {
            z19 = z18;
        }
        if (z19) {
            a();
        }
        photoView.invalidate();
        if (photoView.W != null) {
            photoView.post(new ym5.i3(this));
        }
    }
}
