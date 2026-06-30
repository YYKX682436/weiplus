package um5;

/* loaded from: classes10.dex */
public final class p extends um5.w {
    public um5.e A;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.SurfaceTexture f429178v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f429179w;

    /* renamed from: x, reason: collision with root package name */
    public long f429180x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f429182z;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f429176t = "EffectRenderController@" + hashCode();

    /* renamed from: u, reason: collision with root package name */
    public final um5.f f429177u = new um5.f(0, false, 0, 0, 0, 31, null);

    /* renamed from: y, reason: collision with root package name */
    public int f429181y = 1;

    public static final void k(final um5.p pVar) {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createExternInputTexture, size:[");
        um5.f fVar = pVar.f429177u;
        sb6.append(fVar.f429152c);
        sb6.append(", ");
        sb6.append(fVar.f429153d);
        sb6.append(']');
        java.lang.String str = pVar.f429176t;
        xm5.b.c(str, sb6.toString(), new java.lang.Object[0]);
        int createTexture = com.tencent.tav.decoder.RenderContext.createTexture(36197);
        fVar.f429150a = createTexture;
        fVar.f429151b = true;
        pVar.f429182z = false;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(createTexture);
        surfaceTexture.setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: um5.g
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                um5.p pVar2 = um5.p.this;
                java.lang.String str2 = pVar2.f429176t;
                if (surfaceTexture2 != null) {
                    try {
                        surfaceTexture2.updateTexImage();
                    } catch (java.lang.Exception unused) {
                        xm5.b.b(str2, "updateTexImage error", new java.lang.Object[0]);
                    }
                }
                if (!pVar2.f429182z) {
                    xm5.b.c(str2, "onExternTextureInputUpdate", new java.lang.Object[0]);
                    pVar2.f429182z = true;
                }
                pVar2.f429180x = (surfaceTexture2 != null ? surfaceTexture2.getTimestamp() : 0L) / 1000000;
                pVar2.f(new um5.l(pVar2));
            }
        });
        int i18 = fVar.f429152c;
        if (i18 > 0 && (i17 = fVar.f429153d) > 0) {
            try {
                surfaceTexture.setDefaultBufferSize(i18, i17);
            } catch (java.lang.Exception e17) {
                xm5.b.d(str, e17, "setDefaultBufferSize error:" + e17.getMessage(), new java.lang.Object[0]);
            }
        }
        pVar.f429178v = surfaceTexture;
        xm5.d.b(new um5.h(pVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    @Override // um5.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List a(long r11) {
        /*
            r10 = this;
            um5.f r11 = r10.f429177u
            int r1 = r11.f429150a
            r12 = 0
            if (r1 <= 0) goto L54
            int r2 = r11.f429152c
            if (r2 <= 0) goto L54
            int r3 = r11.f429153d
            if (r3 > 0) goto L10
            goto L54
        L10:
            int r0 = r11.f429154e
            r6 = 3
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L2a
            r4 = 90
            if (r0 == r4) goto L28
            r4 = 180(0xb4, float:2.52E-43)
            if (r0 == r4) goto L26
            r4 = 270(0x10e, float:3.78E-43)
            if (r0 == r4) goto L24
            goto L2a
        L24:
            r5 = r6
            goto L2b
        L26:
            r5 = r7
            goto L2b
        L28:
            r5 = r8
            goto L2b
        L2a:
            r5 = r12
        L2b:
            tq5.f r9 = new tq5.f
            boolean r4 = r11.f429151b
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            com.tencent.mm.xeffect.LayoutInfo r11 = r9.f421264i
            int r0 = r10.f429194c
            int r0 = r0 / r7
            r11.f214793b = r0
            int r0 = r10.f429195d
            int r0 = r0 / r7
            r11.f214794c = r0
            int r0 = r10.f429181y
            if (r0 == r7) goto L47
            if (r0 == r6) goto L48
            r6 = r8
            goto L48
        L47:
            r6 = 4
        L48:
            r11.f214796e = r6
            if (r0 == r8) goto L4d
            r12 = r8
        L4d:
            r9.f421261f = r12
            java.util.List r11 = kz5.b0.c(r9)
            return r11
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "error externInput id:"
            r0.<init>(r1)
            int r1 = r11.f429150a
            r0.append(r1)
            java.lang.String r1 = " width:"
            r0.append(r1)
            int r1 = r11.f429152c
            r0.append(r1)
            java.lang.String r1 = " height:"
            r0.append(r1)
            int r11 = r11.f429153d
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r0 = r10.f429176t
            xm5.b.f(r0, r11, r12)
            kz5.p0 r11 = kz5.p0.f313996d
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: um5.p.a(long):java.util.List");
    }

    @Override // um5.w
    public void b() {
        f(new um5.i(this));
        super.b();
        xm5.d.b(new um5.j(this));
    }

    @Override // um5.w
    public java.lang.String c() {
        return this.f429176t;
    }

    @Override // um5.w
    public void d() {
        super.d();
        f(new um5.k(this));
    }

    @Override // um5.w
    public void h(long j17) {
        super.h(j17);
        if (this.f429194c > 0 && this.f429195d > 0) {
            xm5.d.b(new um5.m(this));
            return;
        }
        xm5.b.f(this.f429176t, "render with size error " + this.f429194c + ", " + this.f429195d, new java.lang.Object[0]);
    }

    public final void l(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        java.lang.String str = this.f429176t;
        xm5.b.c(str, "setInputBitmap: " + bitmap + ", size:[" + bitmap.getWidth() + ',' + bitmap.getHeight() + ']', new java.lang.Object[0]);
        if (this.f429177u.f429150a > 0) {
            xm5.b.c(str, "already set a inputTexture, will override the old one", new java.lang.Object[0]);
            android.graphics.SurfaceTexture surfaceTexture = this.f429178v;
            if (surfaceTexture != null) {
                surfaceTexture.setOnFrameAvailableListener(null);
            }
        }
        this.f429180x = 0L;
        f(new um5.n(this, bitmap));
    }

    public final void m(int i17, int i18, int i19) {
        java.lang.String str = this.f429176t;
        xm5.b.c(str, "setInputContentInfo, size:[" + i17 + ',' + i18 + "], rotate:" + i19, new java.lang.Object[0]);
        um5.f fVar = this.f429177u;
        fVar.f429152c = i17;
        fVar.f429153d = i18;
        fVar.f429154e = i19;
        try {
            android.graphics.SurfaceTexture surfaceTexture = this.f429178v;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i17, i18);
            }
        } catch (java.lang.Exception e17) {
            xm5.b.d(str, e17, "setDefaultBufferSize error:" + e17.getMessage(), new java.lang.Object[0]);
        }
    }

    public final void n(um5.e eVar) {
        this.A = eVar;
        this.f429179w = true;
        if (!this.f429201j || this.f429177u.f429150a > 0) {
            return;
        }
        f(new um5.o(this));
    }
}
