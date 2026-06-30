package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class CropImageView extends android.widget.ImageView {
    public static final /* synthetic */ int F = 0;
    public com.tencent.mm.ui.tools.a3 A;
    public boolean B;
    public final android.view.View.OnTouchListener C;
    public boolean D;
    public android.graphics.drawable.Drawable E;

    /* renamed from: d, reason: collision with root package name */
    public boolean f210011d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f210012e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f210013f;

    /* renamed from: g, reason: collision with root package name */
    public float f210014g;

    /* renamed from: h, reason: collision with root package name */
    public float f210015h;

    /* renamed from: i, reason: collision with root package name */
    public float f210016i;

    /* renamed from: m, reason: collision with root package name */
    public float f210017m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.PointF f210018n;

    /* renamed from: o, reason: collision with root package name */
    public float f210019o;

    /* renamed from: p, reason: collision with root package name */
    public float f210020p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f210021q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f210022r;

    /* renamed from: s, reason: collision with root package name */
    public float f210023s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f210024t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f210025u;

    /* renamed from: v, reason: collision with root package name */
    public wu5.c f210026v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f210027w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f210028x;

    /* renamed from: y, reason: collision with root package name */
    public long f210029y;

    /* renamed from: z, reason: collision with root package name */
    public int f210030z;

    public CropImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210011d = true;
        this.f210013f = false;
        this.f210018n = new android.graphics.PointF();
        this.f210019o = 0.0f;
        this.f210020p = 0.0f;
        this.f210021q = false;
        this.f210022r = false;
        this.f210023s = 1.0f;
        this.f210024t = false;
        this.f210025u = false;
        this.f210026v = null;
        this.f210027w = new com.tencent.mm.ui.tools.w2(this);
        this.f210028x = new com.tencent.mm.ui.tools.x2(this);
        this.f210030z = 0;
        this.B = true;
        com.tencent.mm.ui.tools.z2 z2Var = new com.tencent.mm.ui.tools.z2(this);
        this.C = z2Var;
        this.D = false;
        setOnTouchListener(z2Var);
    }

    public void a() {
        float f17 = this.f210023s * 1.0666f;
        this.f210023s = f17;
        if (this.f210011d && 4.0f < f17) {
            this.f210023s = 4.0f;
            return;
        }
        android.graphics.PointF pointF = this.f210018n;
        float f18 = pointF.x;
        float f19 = pointF.y;
        float[] fArr = {f18, f19};
        float[] fArr2 = {f18, f19};
        getImageMatrix().mapPoints(fArr2);
        getImageMatrix().postScale(1.0666f, 1.0666f);
        getImageMatrix().mapPoints(fArr);
        getImageMatrix().postTranslate((fArr2[0] - fArr[0]) / 2.0f, (fArr2[1] - fArr[1]) / 2.0f);
        setImageBitmap(this.f210012e);
        invalidate();
    }

    public void b() {
        float f17 = this.f210023s * 0.9375f;
        this.f210023s = f17;
        if (0.4f > f17) {
            this.f210023s = 0.4f;
            return;
        }
        android.graphics.PointF pointF = this.f210018n;
        float f18 = pointF.x;
        float f19 = pointF.y;
        float[] fArr = {f18, f19};
        float[] fArr2 = {f18, f19};
        getImageMatrix().mapPoints(fArr2);
        getImageMatrix().postScale(0.9375f, 0.9375f);
        getImageMatrix().mapPoints(fArr);
        getImageMatrix().postTranslate((fArr2[0] - fArr[0]) / 2.0f, (fArr2[1] - fArr[1]) / 2.0f);
        setImageBitmap(this.f210012e);
        invalidate();
    }

    public android.graphics.Bitmap getBmp() {
        return this.f210012e;
    }

    public int getGifHeight() {
        android.graphics.drawable.Drawable drawable;
        return (!this.D || (drawable = this.E) == null) ? getHeight() : drawable.getIntrinsicHeight();
    }

    public int getGifWidth() {
        android.graphics.drawable.Drawable drawable;
        return (!this.D || (drawable = this.E) == null) ? getWidth() : drawable.getIntrinsicWidth();
    }

    public int getRotateCount() {
        return this.f210030z;
    }

    public void setEnableOprate(boolean z17) {
        this.B = z17;
    }

    public void setGifPath(java.lang.String str) {
        try {
            this.D = true;
            android.graphics.drawable.Drawable a17 = og5.g.a(str, str);
            this.E = a17;
            setImageDrawable(a17);
        } catch (java.lang.Exception unused) {
            this.D = false;
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.D = false;
        this.f210012e = bitmap;
        android.graphics.PointF pointF = this.f210018n;
        if (pointF != null && bitmap != null) {
            pointF.set(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        }
        super.setImageBitmap(bitmap);
    }

    public void setLimitZoomIn(boolean z17) {
        this.f210011d = z17;
    }

    public void setOnShortClick(com.tencent.mm.ui.tools.a3 a3Var) {
        this.A = a3Var;
    }
}
