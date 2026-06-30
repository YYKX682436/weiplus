package nn0;

/* loaded from: classes14.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.TextureView f338592a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f338593b;

    /* renamed from: c, reason: collision with root package name */
    public int f338594c;

    /* renamed from: d, reason: collision with root package name */
    public int f338595d;

    /* renamed from: e, reason: collision with root package name */
    public int f338596e = 640;

    /* renamed from: f, reason: collision with root package name */
    public int f338597f = 480;

    /* renamed from: g, reason: collision with root package name */
    public int f338598g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f338599h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f338600i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f338601j = 0;

    /* renamed from: k, reason: collision with root package name */
    public float f338602k = 1.0f;

    public m(android.view.TextureView textureView) {
        this.f338594c = 0;
        this.f338595d = 0;
        this.f338592a = textureView;
        this.f338594c = textureView.getWidth();
        this.f338595d = textureView.getHeight();
        this.f338593b = new android.os.Handler(textureView.getContext().getMainLooper());
    }

    public final void a() {
        try {
            nn0.l lVar = new nn0.l(this);
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                lVar.run();
            } else {
                this.f338593b.post(lVar);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("CustomTextureViewWrapper", "adjust video size failed.", e17);
        }
    }

    public void b(int i17) {
        try {
            this.f338593b.post(new nn0.j(this, i17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("CustomTextureViewWrapper", "set render mode failed", e17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r2 > r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005a, code lost:
    
        if (r2 < r8) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r8) {
        /*
            r7 = this;
            r7.f338600i = r8
            android.view.TextureView r0 = r7.f338592a
            if (r0 == 0) goto L82
            r1 = 1
            r2 = 90
            r3 = 270(0x10e, float:3.78E-43)
            r4 = 180(0xb4, float:2.52E-43)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r8 != r1) goto L38
            int r8 = r7.f338601j
            if (r8 == 0) goto L6e
            if (r8 != r4) goto L18
            goto L6e
        L18:
            if (r8 == r3) goto L1c
            if (r8 != r2) goto L6e
        L1c:
            int r8 = r7.f338598g
            if (r8 == 0) goto L37
            int r1 = r7.f338599h
            if (r1 != 0) goto L25
            goto L37
        L25:
            int r2 = r7.f338595d
            float r2 = (float) r2
            float r8 = (float) r8
            float r2 = r2 / r8
            int r8 = r7.f338594c
            float r8 = (float) r8
            float r1 = (float) r1
            float r8 = r8 / r1
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 <= 0) goto L35
        L33:
            r5 = r8
            goto L6e
        L35:
            r5 = r2
            goto L6e
        L37:
            return
        L38:
            if (r8 != 0) goto L6e
            int r8 = r7.f338598g
            if (r8 == 0) goto L6d
            int r1 = r7.f338599h
            if (r1 != 0) goto L43
            goto L6d
        L43:
            int r6 = r7.f338601j
            if (r6 == 0) goto L5d
            if (r6 != r4) goto L4a
            goto L5d
        L4a:
            if (r6 == r3) goto L4e
            if (r6 != r2) goto L6e
        L4e:
            int r2 = r7.f338595d
            float r2 = (float) r2
            float r8 = (float) r8
            float r2 = r2 / r8
            int r8 = r7.f338594c
            float r8 = (float) r8
            float r1 = (float) r1
            float r8 = r8 / r1
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 >= 0) goto L35
            goto L33
        L5d:
            int r2 = r7.f338595d
            float r2 = (float) r2
            float r1 = (float) r1
            float r2 = r2 / r1
            int r1 = r7.f338594c
            float r1 = (float) r1
            float r8 = (float) r8
            float r1 = r1 / r8
            int r8 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r8 >= 0) goto L35
            r5 = r1
            goto L6e
        L6d:
            return
        L6e:
            float r8 = r7.f338602k
            r1 = 0
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 >= 0) goto L76
            float r5 = -r5
        L76:
            r0.setScaleX(r5)
            float r8 = java.lang.Math.abs(r5)
            r0.setScaleY(r8)
            r7.f338602k = r5
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nn0.m.c(int):void");
    }

    public void d(int i17) {
        try {
            this.f338593b.post(new nn0.k(this, i17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("CustomTextureViewWrapper", "set render rotation failed.", e17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r6 > r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r6 < r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(int r6) {
        /*
            r5 = this;
            int r6 = r6 % 360
            r5.f338601j = r6
            android.view.TextureView r0 = r5.f338592a
            if (r0 == 0) goto L86
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L4b
            r3 = 180(0xb4, float:2.52E-43)
            if (r6 != r3) goto L12
            goto L4b
        L12:
            r3 = 270(0x10e, float:3.78E-43)
            if (r6 == r3) goto L1a
            r3 = 90
            if (r6 != r3) goto L72
        L1a:
            int r3 = r5.f338598g
            if (r3 == 0) goto L4a
            int r3 = r5.f338599h
            if (r3 != 0) goto L23
            goto L4a
        L23:
            int r6 = 360 - r6
            float r6 = (float) r6
            r0.setRotation(r6)
            int r6 = r5.f338595d
            float r6 = (float) r6
            int r3 = r5.f338598g
            float r3 = (float) r3
            float r6 = r6 / r3
            int r3 = r5.f338594c
            float r3 = (float) r3
            int r4 = r5.f338599h
            float r4 = (float) r4
            float r3 = r3 / r4
            int r4 = r5.f338600i
            if (r4 != r1) goto L43
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 <= 0) goto L41
        L3f:
            r2 = r3
            goto L72
        L41:
            r2 = r6
            goto L72
        L43:
            if (r4 != 0) goto L72
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 >= 0) goto L41
            goto L3f
        L4a:
            return
        L4b:
            int r6 = 360 - r6
            float r6 = (float) r6
            r0.setRotation(r6)
            int r6 = r5.f338600i
            if (r6 != r1) goto L56
            goto L72
        L56:
            if (r6 != 0) goto L72
            int r6 = r5.f338598g
            if (r6 == 0) goto L71
            int r1 = r5.f338599h
            if (r1 != 0) goto L61
            goto L71
        L61:
            int r2 = r5.f338595d
            float r2 = (float) r2
            float r1 = (float) r1
            float r2 = r2 / r1
            int r1 = r5.f338594c
            float r1 = (float) r1
            float r6 = (float) r6
            float r1 = r1 / r6
            int r6 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r6 >= 0) goto L72
            r2 = r1
            goto L72
        L71:
            return
        L72:
            float r6 = r5.f338602k
            r1 = 0
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 >= 0) goto L7a
            float r2 = -r2
        L7a:
            r0.setScaleX(r2)
            float r6 = java.lang.Math.abs(r2)
            r0.setScaleY(r6)
            r5.f338602k = r2
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nn0.m.e(int):void");
    }

    public void f(int i17, int i18) {
        com.tencent.mars.xlog.Log.w("CustomTextureViewWrapper", "vrender: set video size:" + i17 + "," + i18);
        this.f338596e = i17;
        this.f338597f = i18;
        a();
    }

    public void g(int i17, int i18) {
        com.tencent.mars.xlog.Log.w("CustomTextureViewWrapper", "vrender: set view size:" + i17 + "," + i18);
        this.f338594c = i17;
        this.f338595d = i18;
        a();
    }
}
