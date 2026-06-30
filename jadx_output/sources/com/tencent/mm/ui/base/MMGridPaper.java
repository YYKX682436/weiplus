package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public final class MMGridPaper extends android.widget.LinearLayout {
    public static final /* synthetic */ int N = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f197397J;
    public boolean K;
    public final db5.y1 L;
    public final db5.z1 M;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFlipper f197398d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMDotView f197399e;

    /* renamed from: f, reason: collision with root package name */
    public db5.v2 f197400f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f197401g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f197402h;

    /* renamed from: i, reason: collision with root package name */
    public int f197403i;

    /* renamed from: m, reason: collision with root package name */
    public int f197404m;

    /* renamed from: n, reason: collision with root package name */
    public int f197405n;

    /* renamed from: o, reason: collision with root package name */
    public int f197406o;

    /* renamed from: p, reason: collision with root package name */
    public int f197407p;

    /* renamed from: q, reason: collision with root package name */
    public int f197408q;

    /* renamed from: r, reason: collision with root package name */
    public int f197409r;

    /* renamed from: s, reason: collision with root package name */
    public int f197410s;

    /* renamed from: t, reason: collision with root package name */
    public int f197411t;

    /* renamed from: u, reason: collision with root package name */
    public int f197412u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f197413v;

    /* renamed from: w, reason: collision with root package name */
    public int f197414w;

    /* renamed from: x, reason: collision with root package name */
    public int f197415x;

    /* renamed from: y, reason: collision with root package name */
    public int f197416y;

    /* renamed from: z, reason: collision with root package name */
    public int f197417z;

    public MMGridPaper(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197405n = 0;
        this.f197406o = 0;
        this.f197407p = 3;
        this.f197408q = 0;
        this.f197409r = 3 - 1;
        this.f197410s = 0;
        this.f197411t = 0;
        this.f197412u = 0;
        this.f197413v = false;
        this.f197414w = 9;
        this.f197415x = -1;
        this.f197416y = -1;
        this.f197417z = 96;
        this.A = 96;
        this.B = 10;
        this.C = 10;
        this.D = false;
        this.E = false;
        this.F = -1;
        this.G = -1;
        this.H = 0;
        this.I = -1;
        this.f197397J = -1;
        this.K = false;
        this.L = new db5.p2(this);
        this.M = new db5.s2(this);
        this.f197402h = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bym, this);
        this.H = getScreenOrientation();
    }

    public static void a(com.tencent.mm.ui.base.MMGridPaper mMGridPaper, int i17) {
        int i18 = mMGridPaper.f197408q + i17;
        mMGridPaper.f197408q = i18;
        if (i18 < 0) {
            mMGridPaper.f197408q = 0;
        } else {
            int i19 = mMGridPaper.f197410s - mMGridPaper.f197407p;
            if (i18 > i19) {
                mMGridPaper.f197408q = i19;
            }
        }
        mMGridPaper.f197409r = (mMGridPaper.f197408q + mMGridPaper.f197407p) - 1;
    }

    private com.tencent.mm.ui.base.MMGridPaperGridView getCurrentPage() {
        com.tencent.mm.ui.base.MMFlipper mMFlipper = this.f197398d;
        return (com.tencent.mm.ui.base.MMGridPaperGridView) mMFlipper.getChildAt(mMFlipper.getCurScreen());
    }

    private int getScreenOrientation() {
        android.view.Display defaultDisplay = ((android.view.WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        return defaultDisplay.getWidth() < defaultDisplay.getHeight() ? 1 : 2;
    }

    public final void b() {
        if (-1 != this.f197415x && getScreenOrientation() == 2) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.gto);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            int b17 = i65.a.b(getContext(), this.f197415x);
            if (b17 != layoutParams.height) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMGridPaper", "set land mode, special height is %d", java.lang.Integer.valueOf(this.f197415x));
                layoutParams.height = b17;
                findViewById.setLayoutParams(layoutParams);
                this.f197402h.post(new db5.n2(this));
                return;
            }
            return;
        }
        if (-1 == this.f197416y || getScreenOrientation() != 1) {
            return;
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.gto);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) findViewById2.getLayoutParams();
        int b18 = i65.a.b(getContext(), this.f197416y);
        if (b18 != layoutParams2.height) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMGridPaper", "set port mode, special height is %d", java.lang.Integer.valueOf(this.f197416y));
            layoutParams2.height = b18;
            findViewById2.setLayoutParams(layoutParams2);
            this.f197402h.post(new db5.o2(this));
        }
    }

    public final int c(int i17, int i18) {
        int i19 = 0;
        if (i18 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMGridPaper", "ceil:total[%d], length[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return 0;
        }
        int i27 = i17;
        while (i27 > 0) {
            i27 -= i18;
            i19++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMGridPaper", "ceil:num[%d], length[%d], result[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        return i19;
    }

    public final void d() {
        if (this.f197399e == null) {
            com.tencent.mm.ui.base.MMDotView mMDotView = (com.tencent.mm.ui.base.MMDotView) findViewById(com.tencent.mm.R.id.gtp);
            this.f197399e = mMDotView;
            mMDotView.setMaxCount(this.f197414w);
        }
        if (this.f197398d == null) {
            com.tencent.mm.ui.base.MMFlipper mMFlipper = (com.tencent.mm.ui.base.MMFlipper) findViewById(com.tencent.mm.R.id.gtq);
            this.f197398d = mMFlipper;
            mMFlipper.setOnMeasureListener(this.L);
            this.f197398d.setOnScreenChangedListener(this.M);
        }
        b();
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.MMGridPaper.e():void");
    }

    public final void f() {
        iz5.a.g(null, this.f197410s >= 0);
        this.f197399e.setDotCount(this.f197410s);
        if (this.f197400f == null || this.f197410s <= 1) {
            this.f197399e.setVisibility(8);
        } else {
            this.f197399e.setVisibility(0);
        }
        int i17 = this.f197406o;
        int i18 = this.f197410s;
        if (i17 >= i18) {
            this.f197406o = i18 - 1;
        }
        this.f197398d.a(this.f197406o - this.f197408q);
        com.tencent.mm.ui.base.MMFlipper mMFlipper = this.f197398d;
        int i19 = this.f197406o;
        mMFlipper.f197346h = i19;
        this.f197399e.setSelectedDot(i19);
    }

    public int getItemsCountPerPage() {
        return this.f197412u * this.f197411t;
    }

    public int getPageCount() {
        return this.f197410s;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i17 = configuration.orientation;
        if (i17 == 1 || i17 == 2) {
            this.D = true;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        if (this.H != getScreenOrientation()) {
            this.H = getScreenOrientation();
            this.D = true;
            clearAnimation();
            b();
            e();
        }
        super.onLayout(z17, i17, i18, i19, i27);
    }

    public void setDialogMode(boolean z17) {
        this.E = z17;
    }

    public void setDisplayHeightLandInDp(int i17) {
        this.f197415x = i17;
    }

    public void setDisplayHeightPortInDp(int i17) {
        this.f197416y = i17;
    }

    public void setGridHeight(int i17) {
        this.f197404m = i17;
    }

    public void setGridPaperAdapter(db5.v2 v2Var) {
        this.f197400f = v2Var;
        db5.v2 v2Var2 = this.f197400f;
        if (v2Var2 != null) {
            v2Var2.f228552a = new db5.m2(this);
        }
        d();
    }

    public void setGridWidth(int i17) {
        this.f197403i = i17;
    }

    public void setHeaderView(android.view.View view) {
        this.f197401g = view;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.gy6);
        viewGroup.removeAllViews();
        android.view.View view2 = this.f197401g;
        if (view2 != null) {
            viewGroup.addView(view2);
        }
    }

    public void setItemHeightInDp(int i17) {
        this.A = i17;
    }

    public void setItemWidthInDp(int i17) {
        this.f197417z = i17;
    }

    public void setManualMeasureMode(boolean z17) {
        this.K = z17;
    }

    public void setMaxCol(int i17) {
        this.I = i17;
    }

    public void setMaxDotCount(int i17) {
        this.f197414w = i17;
    }

    public void setMaxRow(int i17) {
        this.f197397J = i17;
    }

    public void setOnPageSizeChangeListener(db5.t2 t2Var) {
    }
}
