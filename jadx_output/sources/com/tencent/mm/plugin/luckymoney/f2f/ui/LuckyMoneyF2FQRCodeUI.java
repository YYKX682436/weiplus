package com.tencent.mm.plugin.luckymoney.f2f.ui;

/* loaded from: classes15.dex */
public class LuckyMoneyF2FQRCodeUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI implements com.tencent.mm.sdk.platformtools.f7 {
    public static final /* synthetic */ int G1 = 0;
    public java.util.List A;
    public android.graphics.Bitmap A1;
    public com.tencent.mm.ui.widget.dialog.k0 B;
    public android.graphics.Bitmap B1;
    public android.view.ViewGroup C;
    public android.graphics.Bitmap C1;
    public android.view.ViewGroup D;
    public android.view.View E;
    public java.lang.String F;
    public com.tencent.mm.sdk.platformtools.b4 G;
    public sb3.c H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f145069J;
    public long K;
    public java.lang.String L;
    public android.animation.ValueAnimator M;
    public float N;
    public float P;
    public android.util.DisplayMetrics Q;
    public java.lang.String R;
    public java.lang.String S;
    public android.hardware.SensorManager T;
    public float U;
    public int[] V;
    public android.graphics.Bitmap Z;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f145070g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f145071h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f145072i;

    /* renamed from: l1, reason: collision with root package name */
    public android.graphics.Bitmap f145073l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f145074m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f145075n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f145076o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f145077p;

    /* renamed from: p0, reason: collision with root package name */
    public android.graphics.Bitmap f145078p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.graphics.Bitmap f145079p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f145080q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f145081r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.base.HorizontalListViewV2 f145082s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f145083t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.Map f145084u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.Queue f145085v;

    /* renamed from: w, reason: collision with root package name */
    public ub3.t f145086w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f145087x;

    /* renamed from: x0, reason: collision with root package name */
    public android.graphics.Bitmap f145088x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.graphics.Bitmap f145089x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.Button f145090y;

    /* renamed from: y0, reason: collision with root package name */
    public android.graphics.Bitmap f145091y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.graphics.Bitmap f145092y1;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView f145093z;

    /* renamed from: z1, reason: collision with root package name */
    public android.graphics.Bitmap f145094z1;
    public final c01.zc W = new ub3.j(this);
    public final db5.o4 X = new ub3.k(this);
    public final db5.t4 Y = new ub3.l(this);
    public final e51.f D1 = new ub3.m(this);
    public final e51.f E1 = new ub3.n(this);
    public final android.hardware.SensorEventListener F1 = new ub3.i(this);

    public static android.graphics.Bitmap V6(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI, int i17, int i18) {
        android.content.res.Resources resources = luckyMoneyF2FQRCodeUI.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI", "createBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI", "createBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        return android.graphics.Bitmap.createScaledBitmap(decodeResource, i18, i18, false);
    }

    public final void W6() {
        int width = this.f145082s.getWidth() - (((java.util.ArrayList) this.f145083t).size() * getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479564g));
        if (width <= 0) {
            this.f145082s.setPadding(0, 0, 0, 0);
        } else {
            int i17 = width / 2;
            this.f145082s.setPadding(i17, 0, i17, 0);
        }
    }

    public final void X6() {
        android.graphics.Bitmap bitmap;
        int[] iArr;
        int i17 = 0;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I)) {
            kd0.k2 k2Var = (kd0.k2) i95.n0.c(kd0.k2.class);
            java.lang.String str = this.I;
            ((jd0.w1) k2Var).getClass();
            int[] iArr2 = new int[2];
            boolean z17 = et5.h.f256676a;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL);
            int e17 = et5.h.e(allocateDirect, iArr2, str, 12, 1, com.tencent.mapsdk.internal.rv.f51270c, -1);
            byte[] f17 = et5.h.f(allocateDirect);
            com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeBitmapFactory", "createColorfulQRCodeBitmap result: %d, matrix: %s", java.lang.Integer.valueOf(e17), f17);
            if (f17 == null || e17 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeBitmapFactory", "result %d %s", java.lang.Integer.valueOf(e17), com.tencent.mm.sdk.platformtools.z3.b(true));
                bitmap = null;
            } else {
                android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                int i18 = displayMetrics.widthPixels;
                int i19 = displayMetrics.heightPixels;
                if (i18 >= i19) {
                    i18 = i19;
                }
                int i27 = (int) (i18 * 0.8d);
                int i28 = iArr2[0];
                int i29 = (int) (i28 * 0.1d);
                int i37 = i28 + (i29 * 2);
                int i38 = i27 / i37;
                if (i38 == 0) {
                    i38 = 1;
                }
                int i39 = i29 * i38;
                int i47 = i38 * i37;
                int i48 = i38 * 2;
                int i49 = (iArr2[1] * i38) + (i29 * i48);
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i49));
                arrayList.add(java.lang.Integer.valueOf(i47));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/qrcode/encoder/QRCodeBitmapFactory", "createColorfulQRCodeBitmap", "(Landroid/content/Context;[B[III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, bitmap, "com/tencent/mm/qrcode/encoder/QRCodeBitmapFactory", "createColorfulQRCodeBitmap", "(Landroid/content/Context;[B[III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                int[] iArr3 = new int[i47 * i49];
                int i57 = i38 / 2;
                int i58 = i48 + i57;
                int i59 = (i38 * 3) + i57;
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setAntiAlias(true);
                java.util.Arrays.fill(iArr3, -1);
                int i66 = 6;
                int[] iArr4 = {i59, i59, (((iArr2[0] - 1) - 3) * i38) + i57, i59, i59, (((iArr2[1] - 1) - 3) * i38) + i57};
                int i67 = 0;
                while (i67 < iArr2[1]) {
                    int i68 = i17;
                    while (true) {
                        int i69 = iArr2[i17];
                        if (i68 < i69) {
                            if (f17[(i67 * i69) + i68] == 1) {
                                if ((i67 < 0 || i67 > i66 || i68 < 0 || i68 > i66) && (i67 < 0 || i67 > i66 || i68 < i69 - 7 || i68 > i69 - 1)) {
                                    int i76 = iArr2[1];
                                    if (i67 < i76 - 7 || i67 > i76 - 1 || i68 < 0 || i68 > i66) {
                                        boolean[] zArr = new boolean[10];
                                        zArr[5] = true;
                                        iArr = iArr4;
                                        if (zArr[(int) (java.lang.Math.random() * 10.0d)]) {
                                            for (int i77 = 0; i77 < i38; i77++) {
                                                for (int i78 = 0; i78 < i38; i78++) {
                                                    iArr3[(((i67 * i38) + i39 + i77) * i47) + (i68 * i38) + i39 + i78] = -3041484;
                                                }
                                            }
                                        } else {
                                            for (int i79 = 0; i79 < i38; i79++) {
                                                for (int i86 = 0; i86 < i38; i86++) {
                                                    iArr3[(((i67 * i38) + i39 + i79) * i47) + (i68 * i38) + i39 + i86] = -2598591;
                                                }
                                            }
                                            i68++;
                                            iArr4 = iArr;
                                            i66 = 6;
                                            i17 = 0;
                                        }
                                    }
                                }
                                for (int i87 = 0; i87 < i38; i87++) {
                                    for (int i88 = 0; i88 < i38; i88++) {
                                        iArr3[(((i67 * i38) + i39 + i87) * i47) + (i68 * i38) + i39 + i88] = -1;
                                    }
                                }
                                iArr = iArr4;
                            } else {
                                iArr = iArr4;
                            }
                            i68++;
                            iArr4 = iArr;
                            i66 = 6;
                            i17 = 0;
                        }
                    }
                    i67++;
                    i66 = 6;
                    i17 = 0;
                }
                int[] iArr5 = iArr4;
                int i89 = -1;
                int i96 = -2598591;
                bitmap.setPixels(iArr3, 0, i47, 0, 0, i47, i49);
                int i97 = 0;
                int i98 = 3;
                while (i97 < i98) {
                    paint.setColor(i96);
                    paint.setStyle(android.graphics.Paint.Style.FILL);
                    int i99 = (i97 * 2) + 1;
                    canvas.drawCircle(iArr5[r2] + i39, iArr5[i99] + i39, i59, paint);
                    paint.setColor(-1);
                    canvas.drawCircle(iArr5[r2] + i39, iArr5[i99] + i39, i58, paint);
                    i97++;
                    i98 = 3;
                    i96 = -2598591;
                }
                int i100 = 0;
                while (i100 < i98) {
                    paint.setColor(-3041484);
                    paint.setStyle(android.graphics.Paint.Style.FILL);
                    int i101 = i100 * 2;
                    int i102 = iArr5[i101] + i39;
                    int i103 = (i38 * 1) / 4;
                    int i104 = iArr5[i101 + 1] + i39;
                    canvas.drawRect((i102 - i38) - i103, (i104 - i38) - i103, i102 + i38 + i103, i104 + i38 + i103, paint);
                    i100++;
                    i98 = 3;
                }
                int i105 = 0;
                while (i105 < i98) {
                    paint.setColor(i89);
                    paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                    android.graphics.Path path = new android.graphics.Path();
                    int i106 = i105 * 2;
                    int i107 = (i38 * 1) / 4;
                    int i108 = i106 + 1;
                    path.moveTo(((iArr5[i106] + i39) - i38) - i107, ((iArr5[i108] + i39) - i38) - i107);
                    int i109 = i38 / 4;
                    path.quadTo(iArr5[i106] + i39, (iArr5[i108] + i39) - i38, r7 + i38 + i109, r2 - i107);
                    path.lineTo(((iArr5[i106] + i39) - i38) - i107, ((iArr5[i108] + i39) - i38) - i107);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.moveTo(((iArr5[i106] + i39) - i38) - i107, ((iArr5[i108] + i39) - i38) - i107);
                    path.quadTo((iArr5[i106] + i39) - i38, iArr5[i108] + i39, r2 - i109, r12 + i38 + i107);
                    path.lineTo(((iArr5[i106] + i39) - i38) - i107, ((iArr5[i108] + i39) - i38) - i107);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.moveTo(iArr5[i106] + i39 + i38 + i107, iArr5[i108] + i39 + i38 + i107);
                    path.quadTo(iArr5[i106] + i39, iArr5[i108] + i39 + i38, (r2 - i38) - i109, r12 + i107);
                    path.lineTo(iArr5[i106] + i39 + i38 + i107, iArr5[i108] + i39 + i38 + i107);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.moveTo(iArr5[i106] + i39 + i38 + i107, iArr5[i108] + i39 + i38 + i107);
                    path.quadTo(iArr5[i106] + i39 + i38, iArr5[i108] + i39, r2 + i109, (r12 - i38) - i107);
                    path.lineTo(iArr5[i106] + i39 + i38 + i107, iArr5[i108] + i39 + i38 + i107);
                    path.close();
                    canvas.drawPath(path, paint);
                    i105++;
                    i98 = 3;
                    i89 = -1;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", bitmap);
            }
            this.f145077p.setImageBitmap(bitmap);
        }
        if (this.f145069J > 0) {
            this.f145077p.setPadding(0, 0, 0, 0);
            this.f145080q.setText(getString(com.tencent.mm.R.string.f492422gl1));
            this.f145080q.setVisibility(0);
            this.f145081r.setText(getString(com.tencent.mm.R.string.f492422gl1));
            this.f145087x.setText(getString(com.tencent.mm.R.string.f492421gl0, java.lang.Integer.valueOf(this.f145069J)));
            this.f145087x.setVisibility(0);
            this.f145090y.setVisibility(8);
            return;
        }
        this.f145077p.setPadding(i65.a.b(this, 5), i65.a.b(this, 5), i65.a.b(this, 5), i65.a.b(this, 5));
        this.f145077p.setImageResource(com.tencent.mm.R.drawable.c9v);
        this.f145087x.setVisibility(8);
        this.f145090y.setVisibility(0);
        this.f145080q.setVisibility(4);
        android.view.View view = this.f145070g;
        view.setPadding(view.getPaddingLeft(), o25.n1.a(this), this.f145070g.getPaddingRight(), this.f145070g.getPaddingBottom());
        if (((java.util.ArrayList) this.f145083t).size() > 0) {
            this.f145081r.setText(getString(com.tencent.mm.R.string.gkv));
        } else {
            this.f145081r.setText(getString(com.tencent.mm.R.string.gkw));
        }
    }

    public final void Y6() {
        if (((java.util.ArrayList) this.A).size() != this.f145069J) {
            com.tencent.mars.xlog.Log.i("LuckyMoneyF2FQRCodeUI", "shuffle cards: %d", java.lang.Integer.valueOf(((java.util.ArrayList) this.A).size()), java.lang.Integer.valueOf(this.f145069J));
            ((java.util.ArrayList) this.A).clear();
            for (int i17 = 0; i17 < this.f145069J; i17++) {
                android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bue, (android.view.ViewGroup) this.f145093z, false);
                ((android.widget.FrameLayout.LayoutParams) inflate.getLayoutParams()).gravity = 81;
                ((java.util.ArrayList) this.A).add(inflate);
            }
            this.f145093z.setAllShuffleCards(this.A);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.buf;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.Q = getResources().getDisplayMetrics();
        this.f145083t = new java.util.ArrayList();
        this.f145084u = new java.util.HashMap();
        this.f145085v = new java.util.LinkedList();
        this.A = new java.util.ArrayList();
        int[] iArr = new int[6];
        this.V = iArr;
        iArr[0] = iArr[0] + 1;
        this.G = new com.tencent.mm.sdk.platformtools.b4(new ub3.o(this), true);
        this.f145071h = findViewById(com.tencent.mm.R.id.j1v);
        this.f145070g = findViewById(com.tencent.mm.R.id.plt);
        this.f145081r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j1r);
        this.f145080q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j1s);
        this.U = this.f145081r.getAlpha();
        this.f145077p = (android.widget.ImageView) this.f145071h.findViewById(com.tencent.mm.R.id.j1q);
        this.f145082s = (com.tencent.mm.ui.base.HorizontalListViewV2) findViewById(com.tencent.mm.R.id.j1t);
        ub3.t tVar = new ub3.t(this, null);
        this.f145086w = tVar;
        this.f145082s.setAdapter((android.widget.ListAdapter) tVar);
        this.f145082s.setOnItemClickListener(new ub3.p(this));
        this.f145082s.setOnScrollStateChangedListener(new ub3.q(this));
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.j1p);
        this.f145090y = button;
        button.setOnClickListener(new ub3.r(this));
        this.f145087x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j1x);
        this.f145072i = findViewById(com.tencent.mm.R.id.j1w);
        setBackBtn(new ub3.c(this));
        setMMTitle(getString(com.tencent.mm.R.string.f492424gl3));
        addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_icon_dark_more, new ub3.d(this));
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f479342wx));
        hideActionbarLine();
        this.C = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j1k);
        this.D = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j1j);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.j1m);
        this.E = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI", "initQRCodeView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI", "initQRCodeView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
        this.T = sensorManager;
        sensorManager.registerListener(this.F1, sensorManager.getDefaultSensor(1), 3);
        this.H = new sb3.c(2, 3);
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = (com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView) findViewById(com.tencent.mm.R.id.j1y);
        this.f145093z = shuffleView;
        ub3.v0 v0Var = new ub3.v0();
        v0Var.f426143c = 4;
        v0Var.f426141a = 2;
        v0Var.f426142b = 4;
        v0Var.f426145e = 300;
        v0Var.f426144d = 0.0f;
        shuffleView.setShuffleSetting(v0Var);
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.E = this.Q;
        this.f145093z.setExitAnimator(android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L));
        this.f145093z.setExitAnimatorListener(new ub3.e(this));
        this.f145093z.setCardListener(new ub3.f(this));
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("touch_card.m4a");
        hashSet.add("select_card.m4a");
        for (int i17 = 1; i17 <= 8; i17++) {
            hashSet.add("music" + i17 + ".m4a");
        }
        hashSet.add("packet_received.m4a");
        hashSet.add("most_lucky.m4a");
        hashSet.add("whistle.m4a");
        sb3.c cVar = this.H;
        cVar.getClass();
        gm0.j1.e().j(new sb3.a(cVar, hashSet, new java.lang.ref.WeakReference(this)));
        cVar.f405435a.setOnLoadCompleteListener(new sb3.b(cVar));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.M = ofFloat;
        ofFloat.setDuration(300L);
        this.M.setStartDelay(3000L);
        this.M.addUpdateListener(new ub3.g(this));
        X6();
        getWindow().addFlags(128);
        if (com.tencent.mm.wallet_core.ui.r1.P()) {
            getWindow().addFlags(8192);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_overlay_hidden, false) || android.os.Build.VERSION.SDK_INT < 31) {
                return;
            }
            try {
                if (b3.l.checkSelfPermission(getContext(), "android.permission.HIDE_OVERLAY_WINDOWS") == 0) {
                    getWindow().setHideOverlayWindows(true);
                } else {
                    com.tencent.mars.xlog.Log.i("LuckyMoneyF2FQRCodeUI", "no permission");
                    jx3.f.INSTANCE.kvStat(28867, "100");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("LuckyMoneyF2FQRCodeUI", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14007, java.lang.Integer.valueOf(this.V[0]), java.lang.Integer.valueOf(this.V[1]), java.lang.Integer.valueOf(this.V[2]), java.lang.Integer.valueOf(this.V[3]), java.lang.Integer.valueOf(this.V[4]), java.lang.Integer.valueOf(this.V[5]));
        sb3.c cVar = this.H;
        cVar.f405438d = true;
        cVar.f405435a.release();
        getWindow().clearFlags(128);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        android.hardware.SensorManager sensorManager = this.T;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.F1);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        doSceneProgress(new tb3.e(), true);
        this.G.c(60000L, 60000L);
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f37061a.b("ffopenwxhb", this.W, true);
        addSceneEndListener(1990);
        addSceneEndListener(1987);
        addSceneEndListener(1971);
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.screenBrightness < 0.85f) {
            attributes.screenBrightness = 0.85f;
            getWindow().setAttributes(attributes);
        }
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(this, this);
        android.hardware.SensorManager sensorManager = this.T;
        if (sensorManager != null) {
            sensorManager.registerListener(this.F1, sensorManager.getDefaultSensor(1), 3);
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("LuckyMoneyF2FQRCodeUI", "errType: %d,errCode: %d,errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return true;
            }
            db5.e1.s(this, str, getString(com.tencent.mm.R.string.f490573yv));
            return true;
        }
        if (m1Var instanceof tb3.e) {
            tb3.e eVar = (tb3.e) m1Var;
            if (!com.tencent.mm.sdk.platformtools.t8.N0(this.F, eVar.f417011f) && !this.F.equals(eVar.f417011f)) {
                ((java.util.ArrayList) this.f145083t).clear();
                ((java.util.HashMap) this.f145084u).clear();
                ((java.util.LinkedList) this.f145085v).clear();
                this.f145086w.notifyDataSetChanged();
                this.L = "";
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(eVar.f417011f)) {
                this.F = eVar.f417011f;
            }
            this.I = eVar.f417012g;
            this.f145069J = eVar.f417015m;
            this.R = eVar.f417014i;
            this.S = eVar.f417013h;
            X6();
            Y6();
            if (this.f145069J == 0) {
                this.G.d();
            }
            if (((java.util.ArrayList) this.f145083t).size() != 0 || com.tencent.mm.sdk.platformtools.t8.K0(this.F)) {
                return true;
            }
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.v5(this.F, 5, 0, null, "v1.0"), false);
            return true;
        }
        if (m1Var instanceof tb3.a) {
            this.F = "";
            this.I = "";
            this.f145069J = 0;
            ((java.util.ArrayList) this.f145083t).clear();
            this.L = "";
            this.f145086w.notifyDataSetChanged();
            X6();
            Y6();
            this.G.d();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.R)) {
                db5.e1.T(this, this.R);
            }
            this.S = "";
            return true;
        }
        if (!(m1Var instanceof com.tencent.mm.plugin.luckymoney.model.v5)) {
            if (!(m1Var instanceof tb3.b)) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("LuckyMoneyF2FQRCodeUI", "onSceneEnd NetSceneF2FLuckyMoneyInvalid");
            tb3.b bVar = (tb3.b) m1Var;
            int i19 = bVar.f416983f;
            java.lang.String str2 = bVar.f416984g;
            com.tencent.mars.xlog.Log.i("LuckyMoneyF2FQRCodeUI", "retcode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return true;
        }
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = ((com.tencent.mm.plugin.luckymoney.model.v5) m1Var).f145665h;
        this.K = e1Var.f145246r;
        java.util.LinkedList linkedList = e1Var.M;
        if (linkedList == null || linkedList.size() <= 0) {
            return true;
        }
        for (int i27 = 0; i27 < linkedList.size(); i27++) {
            com.tencent.mm.plugin.luckymoney.model.h5 h5Var = (com.tencent.mm.plugin.luckymoney.model.h5) linkedList.get(i27);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145317i)) {
                if (!((java.util.ArrayList) this.f145083t).contains(h5Var.f145317i)) {
                    ((java.util.ArrayList) this.f145083t).add(h5Var.f145317i);
                    java.lang.String str3 = h5Var.f145319n;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145318m)) {
                        this.L = str3;
                    }
                    ((java.util.HashMap) this.f145084u).put(h5Var.f145317i, str3);
                }
            }
        }
        W6();
        this.f145086w.notifyDataSetChanged();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.G.d();
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f37061a.h("ffopenwxhb", this.W, true);
        removeSceneEndListener(1990);
        removeSceneEndListener(1987);
        removeSceneEndListener(1971);
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(this, this);
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("LuckyMoneyF2FQRCodeUI", "screenShot");
        if (this.f145069J > 0) {
            java.lang.String str2 = this.I;
            com.tencent.mars.xlog.Log.i("LuckyMoneyF2FQRCodeUI", "invalidQRCode");
            doSceneProgress(new tb3.b(str2), false);
            com.tencent.mars.xlog.Log.i("LuckyMoneyF2FQRCodeUI", "getQRCode");
            doSceneProgress(new tb3.e(), false);
            X6();
            int[] iArr = this.V;
            iArr[1] = iArr[1] + 1;
            db5.e1.s(this, getString(com.tencent.mm.R.string.f492423gl2), null);
        }
    }
}
