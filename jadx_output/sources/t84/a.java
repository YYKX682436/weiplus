package t84;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public int f416420a;

    /* renamed from: b, reason: collision with root package name */
    public int f416421b;

    /* renamed from: c, reason: collision with root package name */
    public float f416422c;

    /* renamed from: d, reason: collision with root package name */
    public float f416423d;

    /* renamed from: e, reason: collision with root package name */
    public float f416424e;

    /* renamed from: f, reason: collision with root package name */
    public float f416425f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f416426g;

    /* renamed from: i, reason: collision with root package name */
    public java.nio.FloatBuffer f416428i;

    /* renamed from: j, reason: collision with root package name */
    public java.nio.FloatBuffer f416429j;

    /* renamed from: k, reason: collision with root package name */
    public int f416430k;

    /* renamed from: l, reason: collision with root package name */
    public int f416431l;

    /* renamed from: m, reason: collision with root package name */
    public int f416432m;

    /* renamed from: n, reason: collision with root package name */
    public int f416433n;

    /* renamed from: s, reason: collision with root package name */
    public t84.h f416438s;

    /* renamed from: t, reason: collision with root package name */
    public int f416439t;

    /* renamed from: h, reason: collision with root package name */
    public int f416427h = 0;

    /* renamed from: o, reason: collision with root package name */
    public float[] f416434o = null;

    /* renamed from: p, reason: collision with root package name */
    public float[] f416435p = null;

    /* renamed from: q, reason: collision with root package name */
    public boolean f416436q = false;

    /* renamed from: r, reason: collision with root package name */
    public float f416437r = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public float f416440u = 0.0f;

    public a(android.content.Context context) {
    }

    public final float a(float f17, float f18, float f19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRotatedX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        double d17 = f19;
        float cos = (float) ((f17 * java.lang.Math.cos(d17)) + (f18 * java.lang.Math.sin(d17)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRotatedX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        return cos;
    }

    public final float b(float f17, float f18, float f19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRotatedY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        double d17 = f18;
        double d18 = f19;
        float cos = (float) ((d17 * java.lang.Math.cos(d18)) - (f17 * java.lang.Math.sin(d18)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRotatedY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        return cos;
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invalidate", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        t84.h hVar = this.f416438s;
        if (hVar != null) {
            hVar.invalidate();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invalidate", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
    }

    public void d(t84.h hVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttach", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f416438s = hVar;
        this.f416436q = true;
        this.f416433n = i17;
        android.graphics.Bitmap bitmap = this.f416426g;
        if (bitmap != null) {
            this.f416432m = ((com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer) hVar).f(bitmap);
        }
        c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttach", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
    }

    public void e(int i17, int i18) {
        float[] fArr;
        float[] fArr2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f416420a = i17;
        this.f416421b = i18;
        float f17 = i18;
        this.f416437r = f17;
        float f18 = this.f416422c;
        float f19 = f18 / f17;
        float f27 = f18 / f17;
        float f28 = this.f416423d;
        float f29 = f28 / f17;
        float f37 = -f19;
        float f38 = -(f28 / f17);
        this.f416434o = new float[]{f37, f29, 0.0f, f37, f38, 0.0f, f27, f29, 0.0f, f27, f38, 0.0f};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateStaticRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        float radians = (float) java.lang.Math.toRadians(this.f416440u);
        float f39 = -f29;
        this.f416434o = new float[]{a(f37, f29, radians), b(f37, f29, radians), 0.0f, a(f37, f39, radians), b(f37, f39, radians), 0.0f, a(f19, f29, radians), b(f19, f29, radians), 0.0f, a(f19, f39, radians), b(f19, f39, radians), 0.0f};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateStaticRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        int i19 = this.f416427h;
        float f47 = this.f416422c;
        float f48 = this.f416423d;
        float f49 = this.f416424e;
        float f57 = this.f416425f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
        if (i19 == 0) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
        } else if (i19 == 1) {
            float f58 = f49 * 1.0f;
            if ((f47 * 1.0f) / f48 > f58 / f57) {
                float f59 = ((f57 * 1.0f) * f47) / f49;
                float f66 = (f59 - f48) / 2.0f;
                float f67 = f66 / f59;
                float f68 = (f59 - f66) / f59;
                fArr2 = new float[]{0.0f, f67, 0.0f, f68, 1.0f, f67, 1.0f, f68};
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
            } else {
                float f69 = (f58 * f48) / f57;
                float f76 = (f69 - f47) / 2.0f;
                float f77 = f76 / f69;
                float f78 = (f69 - f76) / f69;
                fArr2 = new float[]{f77, 0.0f, f77, 1.0f, f78, 0.0f, f78, 1.0f};
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
            }
            fArr = fArr2;
        } else if (i19 == 2) {
            float f79 = f49 * 1.0f;
            if ((f47 * 1.0f) / f48 > f79 / f57) {
                float f86 = f48 / (((f57 * 1.0f) * f47) / f49);
                fArr = new float[]{0.0f, 0.0f, 0.0f, f86, 1.0f, 0.0f, 1.0f, f86};
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
            } else {
                float f87 = f47 / ((f79 * f48) / f57);
                fArr = new float[]{0.0f, 0.0f, 0.0f, 1.0f, f87, 0.0f, f87, 1.0f};
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
            }
        } else {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
        }
        this.f416435p = fArr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initVertex", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        java.nio.FloatBuffer put = java.nio.ByteBuffer.allocateDirect(this.f416434o.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer().put(this.f416434o);
        this.f416428i = put;
        put.position(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initVertex", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFragment", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        java.nio.FloatBuffer put2 = java.nio.ByteBuffer.allocateDirect(this.f416435p.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer().put(this.f416435p);
        this.f416429j = put2;
        put2.position(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFragment", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
    }

    public void f(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f416426g = bitmap;
        if (bitmap != null) {
            this.f416424e = bitmap.getWidth();
            this.f416425f = bitmap.getHeight();
            if (this.f416436q) {
                this.f416432m = ((com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer) this.f416438s).f(this.f416426g);
                e(this.f416420a, this.f416421b);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
    }
}
