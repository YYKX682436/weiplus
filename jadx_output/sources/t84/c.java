package t84;

/* loaded from: classes4.dex */
public class c extends t84.a {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public boolean H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f416441J;
    public float K;
    public final float[] L;

    /* renamed from: v, reason: collision with root package name */
    public float f416442v;

    /* renamed from: w, reason: collision with root package name */
    public float f416443w;

    /* renamed from: x, reason: collision with root package name */
    public float f416444x;

    /* renamed from: y, reason: collision with root package name */
    public float f416445y;

    /* renamed from: z, reason: collision with root package name */
    public float f416446z;

    public c(android.content.Context context) {
        super(context);
        this.f416442v = 0.0f;
        this.f416443w = 0.0f;
        this.f416444x = 0.0f;
        this.f416445y = 0.0f;
        this.f416446z = 1.0f;
        this.A = 1.0f;
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.f416441J = 0.0f;
        this.K = 1.0f;
        this.L = new float[16];
    }

    public void g(android.graphics.Rect rect) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGlobalVisibleRect", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        t84.h hVar = this.f416438s;
        android.graphics.Rect globalVisibleRect = hVar != null ? hVar.getGlobalVisibleRect() : null;
        if (globalVisibleRect == null) {
            globalVisibleRect = new android.graphics.Rect();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float f17 = this.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float f18 = this.f416442v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        rect.left = ((int) (f17 + f18)) + globalVisibleRect.left;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float f19 = this.f416441J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float f27 = this.f416443w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        int i17 = ((int) (f19 + f27)) + globalVisibleRect.top;
        rect.top = i17;
        rect.right = (int) (rect.left + this.f416422c);
        rect.bottom = (int) (i17 + this.f416423d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGlobalVisibleRect", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
    }

    public final float h(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNormalizedDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        float f18 = this.f416437r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        float f19 = f17 / (f18 * 0.5f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNormalizedDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        return f19;
    }

    public void i(int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        this.I = i17;
        this.f416441J = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSize", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f416422c = i19 - i17;
        this.f416423d = i27 - i18;
        c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSize", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r5 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(float r5) {
        /*
            r4 = this;
            java.lang.String r0 = "setAlpha"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 >= 0) goto Lf
        Ld:
            r5 = r2
            goto L16
        Lf:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 <= 0) goto L16
            goto Ld
        L16:
            r4.K = r5
            r4.c()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t84.c.j(float):void");
    }

    public void k(t84.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        this.I = ((android.widget.FrameLayout.LayoutParams) bVar).leftMargin;
        this.f416441J = ((android.widget.FrameLayout.LayoutParams) bVar).topMargin;
        int i17 = ((android.widget.FrameLayout.LayoutParams) bVar).width;
        int i18 = ((android.widget.FrameLayout.LayoutParams) bVar).height;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSize", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f416422c = i17;
        this.f416423d = i18;
        c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSize", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
    }

    public void l(float f17) {
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStaticRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        this.f416440u = f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestLayout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAttached", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        boolean z17 = this.f416436q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAttached", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        if (z17 && (i17 = this.f416420a) != 0 && (i18 = this.f416421b) != 0) {
            e(i17, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestLayout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStaticRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
    }
}
