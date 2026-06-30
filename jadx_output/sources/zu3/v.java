package zu3;

/* loaded from: classes10.dex */
public class v extends android.view.View implements zu3.n, cw3.s {
    public final float[] A;
    public final float[] B;
    public final android.graphics.Matrix C;
    public final cw3.a D;
    public zu3.f E;
    public final bw3.e F;
    public java.lang.CharSequence G;
    public float H;
    public zu3.e I;

    /* renamed from: J, reason: collision with root package name */
    public java.util.ArrayList f475833J;
    public int K;
    public android.graphics.Paint L;
    public android.graphics.Paint M;
    public android.graphics.Rect N;
    public final android.graphics.Rect P;
    public boolean Q;
    public zu3.t R;
    public android.graphics.Matrix S;
    public float T;
    public float U;
    public boolean V;
    public final int W;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f475834d;

    /* renamed from: e, reason: collision with root package name */
    public long f475835e;

    /* renamed from: f, reason: collision with root package name */
    public long f475836f;

    /* renamed from: g, reason: collision with root package name */
    public long f475837g;

    /* renamed from: h, reason: collision with root package name */
    public int f475838h;

    /* renamed from: i, reason: collision with root package name */
    public int f475839i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f475840m;

    /* renamed from: n, reason: collision with root package name */
    public final long f475841n;

    /* renamed from: o, reason: collision with root package name */
    public final long f475842o;

    /* renamed from: p, reason: collision with root package name */
    public final long f475843p;

    /* renamed from: q, reason: collision with root package name */
    public final int f475844q;

    /* renamed from: r, reason: collision with root package name */
    public final float f475845r;

    /* renamed from: s, reason: collision with root package name */
    public final float f475846s;

    /* renamed from: t, reason: collision with root package name */
    public final int f475847t;

    /* renamed from: u, reason: collision with root package name */
    public final float f475848u;

    /* renamed from: v, reason: collision with root package name */
    public final float f475849v;

    /* renamed from: w, reason: collision with root package name */
    public final float f475850w;

    /* renamed from: x, reason: collision with root package name */
    public final int f475851x;

    /* renamed from: y, reason: collision with root package name */
    public final int f475852y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.RectF[] f475853z;

    public v(android.content.Context context) {
        super(context);
        this.f475834d = new java.util.ArrayList();
        this.f475840m = "MicroMsg.LyricsItemView";
        this.f475841n = 50L;
        this.f475842o = 200L;
        this.f475843p = 3000L;
        this.f475844q = 11;
        int a17 = com.tencent.mm.ui.zk.a(context, 1);
        float f17 = a17;
        float f18 = 1.5f * f17;
        this.f475845r = f18;
        this.f475846s = 9.0f * f17;
        this.f475847t = a17;
        this.f475848u = f18;
        this.f475849v = 12.0f * f17;
        this.f475850w = f17 * 2.0f;
        this.f475851x = a17;
        this.f475852y = com.tencent.mm.ui.zk.a(context, 32);
        android.graphics.RectF[] rectFArr = new android.graphics.RectF[11];
        for (int i17 = 0; i17 < 11; i17++) {
            rectFArr[i17] = new android.graphics.RectF();
        }
        this.f475853z = rectFArr;
        this.A = new float[this.f475844q];
        this.B = new float[9];
        this.C = new android.graphics.Matrix();
        bw3.e eVar = new bw3.e();
        this.F = eVar;
        this.H = getResources().getDimension(com.tencent.mm.R.dimen.f480341v2);
        this.I = zu3.e.f475800i;
        this.f475833J = new java.util.ArrayList();
        this.L = new android.graphics.Paint();
        this.M = new android.graphics.Paint();
        this.N = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);
        this.P = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);
        this.Q = true;
        eVar.f24928r = 0.5f;
        eVar.f24927q = 3.0f;
        this.M.setColor(android.graphics.Color.parseColor("#CCFFFFFF"));
        android.content.res.Resources resources = getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        this.D = new cw3.a(resources);
        kotlin.jvm.internal.o.d(context);
        this.W = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f475836f = java.lang.System.currentTimeMillis();
    }

    public final void c() {
        java.util.Iterator it = this.f475834d.iterator();
        while (it.hasNext()) {
            r45.ge4 ge4Var = (r45.ge4) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(ge4Var.f375167d)) {
                android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cwi, (android.view.ViewGroup) new android.widget.LinearLayout(getContext()), false);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.not);
                kotlin.jvm.internal.o.d(textView);
                pm0.v.c(textView);
                textView.setText(ge4Var.f375167d);
                android.graphics.Rect rect = lt3.n.f321262c;
                textView.setMaxHeight(rect.height());
                int i17 = rect.left;
                int i18 = this.f475852y;
                textView.setMaxWidth(i18 >= i17 ? rect.width() - ((i18 - rect.left) * 2) : rect.width());
                inflate.measure(0, 0);
                inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
                int width = (inflate.getMeasuredWidth() <= 0 || inflate.getMeasuredWidth() > rect.width()) ? rect.width() : inflate.getMeasuredWidth();
                int height = (inflate.getMeasuredHeight() <= 0 || inflate.getMeasuredHeight() > rect.height()) ? rect.height() : inflate.getMeasuredHeight();
                com.tencent.mars.xlog.Log.i(this.f475840m, "it.lyrics=" + ge4Var.f375167d + " lyricsText.maxWidth=" + textView.getMaxWidth() + " lyricsText.maxHeight=" + textView.getMaxHeight() + " parent.measuredWidth=" + inflate.getMeasuredWidth() + " parent.measuredHeight=" + inflate.getMeasuredHeight());
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/item/LyricsItemView", "createLyricsBitmap", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/ui/editor/item/LyricsItemView", "createLyricsBitmap", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                inflate.draw(new android.graphics.Canvas(createBitmap));
                this.I = zu3.e.f475800i;
                this.f475833J.add(createBitmap);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r3) > r19.f475841n) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "canvas"
            kotlin.jvm.internal.o.g(r1, r2)
            java.util.ArrayList r2 = r0.f475834d
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto Lb2
            long r3 = r0.f475837g
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            android.graphics.RectF[] r6 = r0.f475853z
            if (r5 == 0) goto L2b
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r3
            long r3 = r0.f475841n
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto L29
            goto L2b
        L29:
            r3 = 0
            goto L92
        L2b:
            long r3 = java.lang.System.currentTimeMillis()
            r0.f475837g = r3
            int r3 = r6.length
            r4 = 0
            r5 = 0
            r8 = 0
        L35:
            if (r5 >= r3) goto L29
            r9 = r6[r5]
            int r10 = r8 + 1
            float r11 = r9.height()
            int r12 = r0.f475847t
            float r13 = (float) r12
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            float r14 = r0.f475846s
            float[] r15 = r0.A
            if (r13 > 0) goto L57
            r16 = r8
            double r7 = (double) r14
            double r17 = java.lang.Math.random()
            double r7 = r7 * r17
            float r7 = (float) r7
            r15[r16] = r7
            goto L62
        L57:
            r16 = r8
            r7 = r15[r16]
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 < 0) goto L62
            float r7 = (float) r12
            r15[r16] = r7
        L62:
            r7 = r15[r16]
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 > 0) goto L70
            float r7 = r0.f475850w
            float r11 = r11 + r7
            float r7 = java.lang.Math.min(r11, r14)
            goto L79
        L70:
            int r7 = r0.f475851x
            float r7 = (float) r7
            float r11 = r11 - r7
            float r7 = (float) r12
            float r7 = java.lang.Math.max(r11, r7)
        L79:
            float r8 = r0.f475848u
            float r11 = r4 + r8
            r12 = 2
            float r12 = (float) r12
            float r15 = r14 / r12
            float r7 = r7 / r12
            float r15 = r15 - r7
            float r4 = r4 + r8
            float r8 = r0.f475845r
            float r4 = r4 + r8
            float r14 = r14 / r12
            float r14 = r14 + r7
            r9.set(r11, r15, r4, r14)
            float r4 = r9.right
            int r5 = r5 + 1
            r8 = r10
            goto L35
        L92:
            java.lang.Object r2 = r2.get(r3)
            r45.ge4 r2 = (r45.ge4) r2
            long r4 = r2.f375168e
            r0.k(r4)
            android.graphics.Paint r2 = r0.M
            int r4 = r0.f475839i
            r2.setAlpha(r4)
            int r2 = r6.length
            r7 = r3
        La6:
            if (r7 >= r2) goto Lb2
            r3 = r6[r7]
            android.graphics.Paint r4 = r0.M
            r1.drawRect(r3, r4)
            int r7 = r7 + 1
            goto La6
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu3.v.d(android.graphics.Canvas):void");
    }

    public void f() {
        int i17 = this.K;
        java.util.ArrayList arrayList = this.f475834d;
        if (i17 < arrayList.size()) {
            long j17 = ((r45.ge4) arrayList.get(this.K)).f375168e;
            r45.ge4 ge4Var = (r45.ge4) kz5.n0.a0(arrayList, this.K + 1);
            long j18 = ge4Var != null ? ge4Var.f375168e : ((r45.ge4) arrayList.get(this.K)).f375168e + this.f475843p;
            long j19 = this.f475835e;
            long j27 = j19 - j17;
            long j28 = this.f475842o;
            if (0 <= j27 && j27 <= j28) {
                this.f475838h = (int) ((255 * ((float) (j19 - j17))) / ((float) j28));
                return;
            }
            long j29 = j18 - j19;
            if (0 <= j29 && j29 <= j28) {
                this.f475838h = (int) (255 * (((float) (j18 - j19)) / ((float) j28)));
            } else {
                if (j19 - j17 <= j28 || j18 - j19 <= j28) {
                    return;
                }
                this.f475838h = 255;
            }
        }
    }

    @Override // zu3.n
    public zu3.a g() {
        if (this.f475833J.isEmpty()) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postConcat(this.F.f24917g);
        return new zu3.t(this.f475834d, matrix);
    }

    @Override // android.view.View
    public final int getAlpha() {
        return this.f475838h;
    }

    public final java.util.ArrayList<android.graphics.Bitmap> getBitmapList() {
        return this.f475833J;
    }

    @Override // cw3.s
    public float[] getContentBoundary() {
        return (float[]) this.F.f24924n.clone();
    }

    public final int getCurIndex() {
        return this.K;
    }

    public final android.graphics.Rect getDisplayRect() {
        return this.P;
    }

    @Override // cw3.s
    public android.graphics.RectF getDrawRect() {
        float[] fArr = this.F.f24924n;
        return new android.graphics.RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public final long getDuration() {
        return this.f475835e;
    }

    @Override // cw3.s
    public zu3.a getEditorData() {
        return this.R;
    }

    public final cw3.a getFrameDrawable() {
        return this.D;
    }

    public final long getLAST_INTERVAL() {
        return this.f475843p;
    }

    public final float getLYRICS_VERTICAL_OFFSET() {
        return this.f475849v;
    }

    public final zu3.t getLyricsItem() {
        return this.R;
    }

    public final java.util.ArrayList<r45.ge4> getLyricsList() {
        return this.f475834d;
    }

    public final boolean getNeedInvalidate() {
        return this.Q;
    }

    public final android.graphics.Paint getPaint() {
        return this.L;
    }

    public android.graphics.Rect getSafeArea() {
        android.graphics.Rect rect = this.F.f24918h;
        return rect == null ? new android.graphics.Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    public final zu3.e getSourceDataType() {
        return this.I;
    }

    public final long getStartTime() {
        return this.f475836f;
    }

    public final long getTRANS_TIME() {
        return this.f475842o;
    }

    public final java.lang.CharSequence getText() {
        return this.G;
    }

    public final float getTextSize() {
        return this.H;
    }

    public final float getTouchDownX() {
        return this.T;
    }

    public final float getTouchDownY() {
        return this.U;
    }

    public final boolean getTouchMoved() {
        return this.V;
    }

    public final int getTouchSlop() {
        return this.W;
    }

    public final bw3.e getTouchTracker() {
        return this.F;
    }

    @Override // cw3.s
    public cw3.j getType() {
        return cw3.j.f224168g;
    }

    public final android.graphics.Rect getValidRect() {
        return this.N;
    }

    public final android.graphics.Matrix getViewMatrix() {
        return this.S;
    }

    public final int getWaveAlpha() {
        return this.f475839i;
    }

    public final android.graphics.Paint getWavePaint() {
        return this.M;
    }

    public final long getWaveTime() {
        return this.f475837g;
    }

    @Override // cw3.s
    public void i(android.graphics.Rect displayRect, float f17) {
        kotlin.jvm.internal.o.g(displayRect, "displayRect");
        this.P.set(displayRect);
    }

    @Override // cw3.s
    public void j(android.graphics.Rect safeRect, int i17) {
        kotlin.jvm.internal.o.g(safeRect, "safeRect");
        bw3.e eVar = this.F;
        eVar.f24918h = safeRect;
        eVar.f24919i = i65.a.b(getContext(), 54);
    }

    public void k(long j17) {
        if (this.f475839i < 255) {
            long j18 = this.f475835e;
            long j19 = j18 - j17;
            boolean z17 = false;
            long j27 = this.f475842o;
            if (0 <= j19 && j19 <= j27) {
                z17 = true;
            }
            if (z17) {
                this.f475839i = (int) ((255 * ((float) (j18 - j17))) / ((float) j27));
            } else if (j18 - j17 > j27) {
                this.f475839i = 255;
            }
        }
    }

    public void m() {
        java.util.ArrayList arrayList = this.f475834d;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f475835e = java.lang.System.currentTimeMillis() - this.f475836f;
        r45.ge4 ge4Var = (r45.ge4) kz5.n0.a0(arrayList, this.K + 1);
        if (this.f475835e >= (ge4Var != null ? ge4Var.f375168e : ((r45.ge4) arrayList.get(this.K)).f375168e + this.f475843p)) {
            int i17 = this.K + 1;
            this.K = i17;
            if (i17 >= arrayList.size()) {
                this.K = 0;
                this.f475836f = java.lang.System.currentTimeMillis();
                this.f475835e = 0L;
            }
        }
    }

    public final void n(java.util.List lyricsInfo) {
        kotlin.jvm.internal.o.g(lyricsInfo, "lyricsInfo");
        q(lyricsInfo);
        c();
        int i17 = 0;
        int i18 = 0;
        for (android.graphics.Bitmap bitmap : this.f475833J) {
            if (bitmap.getWidth() > i17) {
                i17 = bitmap.getWidth();
            }
            if (bitmap.getHeight() > i18) {
                i18 = bitmap.getHeight();
            }
        }
        if (i17 == 0 || i18 == 0) {
            return;
        }
        bw3.e eVar = this.F;
        eVar.f24926p = i17;
        eVar.f24925o = i18;
        this.D.setBounds(0, 0, i17, i18);
        float f17 = i17;
        float f18 = i18;
        eVar.getClass();
        eVar.f24922l = new float[]{0.0f, 0.0f, f17, 0.0f, 0.0f, f18, f17, f18};
        float height = (this.P.height() - com.tencent.mm.ui.zk.a(getContext(), com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1)) - i18;
        lt3.n nVar = lt3.n.f321260a;
        int i19 = lt3.n.f321262c.left;
        int i27 = this.f475852y;
        eVar.f24917g.setTranslate(i27 >= i19 ? i27 : i19, height);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.save();
        android.graphics.Matrix matrix = this.S;
        if (matrix != null) {
            canvas.setMatrix(matrix);
        } else {
            canvas.setMatrix(this.F.f24917g);
        }
        if (isActivated()) {
            this.D.draw(canvas);
        }
        d(canvas);
        m();
        if ((!this.f475833J.isEmpty()) && this.K < this.f475833J.size()) {
            f();
            this.L.setAlpha(this.f475838h);
            canvas.drawBitmap((android.graphics.Bitmap) this.f475833J.get(this.K), 0.0f, this.f475849v, this.L);
        }
        canvas.restore();
        if (this.Q) {
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        android.graphics.Matrix matrix = this.C;
        bw3.e eVar = this.F;
        matrix.set(eVar.f24917g);
        float[] fArr = this.B;
        matrix.getValues(fArr);
        float f17 = fArr[2];
        boolean a17 = eVar.a(event);
        eVar.f24917g.getValues(fArr);
        float f18 = fArr[5];
        eVar.f24917g.set(matrix);
        eVar.f24917g.setTranslate(f17, f18);
        if (a17) {
            zu3.f fVar = this.E;
            if (fVar != null) {
                fVar.a(this, event);
            }
            bringToFront();
            postInvalidate();
        }
        if (a17) {
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                this.T = event.getX();
                this.U = event.getY();
                this.V = false;
            } else if (actionMasked == 1) {
                if (!this.V) {
                    performClick();
                }
                bw3.b bVar = new bw3.b();
                android.graphics.Rect rect = this.N;
                bVar.f24902c = eVar.f24928r;
                bVar.f24903d = eVar.f24927q;
                bVar.f24901b = new float[]{eVar.f24926p / 2.0f, eVar.f24925o / 2.0f};
                bVar.f24900a = new android.graphics.RectF(rect.left, rect.top, rect.right, rect.bottom);
                bVar.a(eVar.f24917g, new zu3.u(this));
            } else if (actionMasked == 2) {
                float max = java.lang.Math.max(java.lang.Math.abs(event.getX() - this.T), java.lang.Math.abs(event.getY() - this.U));
                if (!this.V) {
                    this.V = max > ((float) this.W);
                }
            }
        }
        return a17;
    }

    public av3.a p(android.graphics.Matrix matrix) {
        if (this.f475833J.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : this.f475834d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.ge4 ge4Var = (r45.ge4) obj;
            if (i17 < this.f475833J.size()) {
                java.lang.Object obj2 = this.f475833J.get(i17);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                arrayList.add(new av3.g(ge4Var, (android.graphics.Bitmap) obj2));
            }
            i17 = i18;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postConcat(this.F.f24917g);
        return new av3.h(arrayList, matrix2);
    }

    public final void q(java.util.List list) {
        java.util.ArrayList arrayList = this.f475834d;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(((r45.ge4) obj).f375167d)) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
    }

    public final void setAlpha(int i17) {
        this.f475838h = i17;
    }

    public final void setBitmapList(java.util.ArrayList<android.graphics.Bitmap> arrayList) {
        kotlin.jvm.internal.o.g(arrayList, "<set-?>");
        this.f475833J = arrayList;
    }

    public final void setCurIndex(int i17) {
        this.K = i17;
    }

    public final void setDuration(long j17) {
        this.f475835e = j17;
    }

    public final void setLyricsItem(zu3.t tVar) {
        this.R = tVar;
    }

    public final void setNeedInvalidate(boolean z17) {
        this.Q = z17;
    }

    public final void setPaint(android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(paint, "<set-?>");
        this.L = paint;
    }

    public final void setSourceDataType(zu3.e eVar) {
        kotlin.jvm.internal.o.g(eVar, "<set-?>");
        this.I = eVar;
    }

    public final void setStartTime(long j17) {
        this.f475836f = j17;
    }

    public final void setStateResolve(zu3.f stateResolve) {
        kotlin.jvm.internal.o.g(stateResolve, "stateResolve");
        this.E = stateResolve;
    }

    public final void setText(java.lang.CharSequence charSequence) {
        this.G = charSequence;
    }

    public final void setTextSize(float f17) {
        this.H = f17;
    }

    public final void setTouchDownX(float f17) {
        this.T = f17;
    }

    public final void setTouchDownY(float f17) {
        this.U = f17;
    }

    public final void setTouchMoved(boolean z17) {
        this.V = z17;
    }

    @Override // cw3.s
    public void setValidArea(android.graphics.Rect validRect) {
        kotlin.jvm.internal.o.g(validRect, "validRect");
        this.N.set(validRect);
    }

    public final void setValidRect(android.graphics.Rect rect) {
        kotlin.jvm.internal.o.g(rect, "<set-?>");
        this.N = rect;
    }

    public final void setViewMatrix(android.graphics.Matrix matrix) {
        this.S = matrix;
        if (matrix != null) {
            bw3.e eVar = this.F;
            eVar.getClass();
            eVar.f24917g = matrix;
            android.graphics.Canvas canvas = new android.graphics.Canvas();
            canvas.save();
            if (this.S != null) {
                canvas.setMatrix(matrix);
            }
            if (isActivated()) {
                this.D.draw(canvas);
            }
        }
    }

    public final void setWaveAlpha(int i17) {
        this.f475839i = i17;
    }

    public final void setWavePaint(android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(paint, "<set-?>");
        this.M = paint;
    }

    public final void setWaveTime(long j17) {
        this.f475837g = j17;
    }
}
