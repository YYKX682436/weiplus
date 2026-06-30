package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f148332a = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);

    /* renamed from: b, reason: collision with root package name */
    public static final int f148333b = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 140);

    /* renamed from: c, reason: collision with root package name */
    public static int f148334c;

    /* renamed from: d, reason: collision with root package name */
    public static int f148335d;

    /* renamed from: e, reason: collision with root package name */
    public static int f148336e;

    /* renamed from: f, reason: collision with root package name */
    public static int f148337f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f148338g;

    /* renamed from: h, reason: collision with root package name */
    public static float f148339h;

    static {
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 85);
        f148334c = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 39);
        f148335d = 0;
        f148336e = 0;
        f148337f = 0;
        f148338g = 38;
        f148339h = 1.0f;
    }

    public static void a(com.tencent.mm.ui.MMActivity mMActivity, boolean z17) {
        int i17;
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(mMActivity);
        int i18 = h17.x;
        int i19 = h17.y;
        int j17 = com.tencent.mm.ui.bk.k(mMActivity) ? i19 - com.tencent.mm.ui.bk.j(mMActivity) : i19;
        if (mMActivity.getSupportActionBar() != null) {
            i17 = mMActivity.getSupportActionBar().l();
            if (i17 <= 0) {
                i17 = mMActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay);
            }
        } else {
            i17 = 0;
        }
        int p17 = (j17 - i17) - com.tencent.mm.ui.bk.p(mMActivity);
        double d17 = (i19 / i18) * 1.0d;
        int i27 = f148332a;
        int i28 = d17 > 2.0d ? (p17 - (i27 * 3)) / 20 : (p17 - (i27 * 3)) / 17;
        f148337f = java.lang.Math.max(i28 * 4, f148333b);
        f148334c = (int) (i28 * 1.5d);
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionGridSizeCalculator", "baseA: %s, top height: %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(f148337f));
        f148336e = (i18 - (i27 * 2)) / 3;
        gm0.j1.i();
        java.util.Iterator it = ef3.r.wi().Ai(((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, null)).intValue()).iterator();
        int i29 = 0;
        while (it.hasNext()) {
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction = (com.tencent.mm.plugin.wallet_core.model.mall.MallFunction) it.next();
            if (mallFunction != null) {
                android.text.TextPaint textPaint = new android.text.TextPaint(1);
                float q17 = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
                f148339h = q17;
                if (com.tencent.mm.ui.bk.M(q17, i65.a.u(com.tencent.mm.sdk.platformtools.x2.f193071a)) || com.tencent.mm.ui.bk.M(f148339h, i65.a.v(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
                    f148339h = i65.a.t(com.tencent.mm.sdk.platformtools.x2.f193071a);
                }
                textPaint.setTextSize(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 14) * f148339h);
                int height = new android.text.StaticLayout(mallFunction.f179820e, textPaint, f148336e - i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479688cn), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 0), true).getHeight();
                if (i29 < height) {
                    i29 = height;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionGridSizeCalculator", "maxTextHeight: %s", java.lang.Integer.valueOf(i29));
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 24) + i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 35) + i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 5) + i29 + i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        f148335d = b17;
        int i37 = f148336e;
        if (b17 < i37) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FunctionGridSizeCalculator", "GRID_HEIGHT_SIZE_PX < GRID_Width_SIZE_PX,use GRID_Width_SIZE_PX: %s", java.lang.Integer.valueOf(i37));
            f148335d = f148336e;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionGridSizeCalculator", "GRID_GAP_SIZE_PX: %s，GRID_Width_SIZE_PX:%s,MAX_GRID_HEIGHT ：%s", java.lang.Integer.valueOf(f148334c), java.lang.Integer.valueOf(f148336e), java.lang.Integer.valueOf(f148335d));
    }

    public static void b(com.tencent.mm.ui.MMActivity mMActivity, boolean z17, boolean z18) {
        if (z18) {
            a(mMActivity, z17);
            return;
        }
        a(mMActivity, z17);
        if (z17) {
            f148337f = f148337f + i65.a.b(mMActivity, f148338g) + f148332a;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionGridSizeCalculator", "calcGridSize, GRID_HEIGHT_SIZE_PX: %s, TOP_FUNC_LINE_GRID_SIZE_PX: %s", java.lang.Integer.valueOf(f148335d), java.lang.Integer.valueOf(f148337f));
    }

    public static void c(com.tencent.mm.ui.MMActivity mMActivity) {
        android.graphics.Rect rect = new android.graphics.Rect();
        mMActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i17 = rect.right - rect.left;
        int i18 = f148332a;
        int i19 = i18 * 11;
        int i27 = (i17 - (i19 * 4)) / 5;
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionGridSizeCalculator", "screenWidth，：%s , defaultGapWidth: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionGridSizeCalculator", "baseA：%s , tempGridGapSize: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27));
        if (i27 >= i18) {
            f148334c = i27;
            f148336e = i19;
        } else {
            f148334c = i18;
            f148336e = (i17 - (i18 * 5)) / 4;
        }
        gm0.j1.i();
        int i28 = 0;
        java.util.Iterator it = bt4.d.b(((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue()).iterator();
        while (it.hasNext()) {
            r45.n53 n53Var = (r45.n53) it.next();
            if (n53Var != null) {
                android.text.TextPaint textPaint = new android.text.TextPaint(1);
                float q17 = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
                f148339h = q17;
                if (com.tencent.mm.ui.bk.M(q17, i65.a.u(com.tencent.mm.sdk.platformtools.x2.f193071a)) || com.tencent.mm.ui.bk.M(f148339h, i65.a.v(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
                    f148339h = i65.a.t(com.tencent.mm.sdk.platformtools.x2.f193071a);
                }
                textPaint.setTextSize(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 14) * f148339h);
                int height = new android.text.StaticLayout(n53Var.f381082d.f381997e, textPaint, f148336e, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6), true).getHeight();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(n53Var.f381088m)) {
                    textPaint.setTextSize(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 10) * f148339h);
                    height = height + new android.text.StaticLayout(n53Var.f381088m, textPaint, f148336e, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6), true).getHeight() + i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 1);
                }
                if (i28 < height) {
                    i28 = height;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionGridSizeCalculator", "maxTextHeight: %s", java.lang.Integer.valueOf(i28));
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 32) + b17 + i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 10) + i28 + b17;
        f148335d = b18;
        int i29 = f148336e;
        if (b18 < i29) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FunctionGridSizeCalculator", "GRID_HEIGHT_SIZE_PX < GRID_Width_SIZE_PX,use GRID_Width_SIZE_PX: %s", java.lang.Integer.valueOf(i29));
            f148335d = f148336e;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionGridSizeCalculator", "GRID_GAP_SIZE_PX: %s，GRID_Width_SIZE_PX:%s,MAX_GRID_HEIGHT ：%s", java.lang.Integer.valueOf(f148334c), java.lang.Integer.valueOf(f148336e), java.lang.Integer.valueOf(f148335d));
    }
}
