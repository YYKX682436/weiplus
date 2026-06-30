package com.tencent.mm.ui.tools;

@java.lang.Deprecated
/* loaded from: classes15.dex */
public class CropImageNewUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f209997t = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f209998d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.tools.FilterImageView f210000f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f210001g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.tools.CropImageView f210002h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f210003i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f210004m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f210006o;

    /* renamed from: e, reason: collision with root package name */
    public int f209999e = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f210005n = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f210007p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f210008q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f210009r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f210010s = 0;

    /* JADX WARN: Removed duplicated region for block: B:40:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean T6(com.tencent.mm.ui.tools.CropImageNewUI r24) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.CropImageNewUI.T6(com.tencent.mm.ui.tools.CropImageNewUI):boolean");
    }

    public static void U6(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI, com.tencent.mm.ui.tools.CropImageView cropImageView, android.view.View view) {
        android.graphics.Bitmap bitmap;
        int width;
        int height;
        android.graphics.Bitmap createBitmap;
        boolean z17 = cropImageNewUI.f210009r;
        if (cropImageView == null || view == null || z17) {
            return;
        }
        cropImageNewUI.f210009r = true;
        android.graphics.Bitmap m17 = com.tencent.mm.sdk.platformtools.x.m(cropImageView.getBmp().getWidth(), cropImageView.getBmp().getHeight(), android.graphics.Bitmap.Config.RGB_565, false);
        if (m17 == null) {
            cropImageNewUI.setResult(-1);
            cropImageNewUI.finish();
            return;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(m17);
        canvas.translate(cropImageView.getScrollX(), cropImageView.getScrollY());
        cropImageView.draw(canvas);
        float[] fArr = new float[9];
        cropImageView.getImageMatrix().getValues(fArr);
        int left = view.getLeft();
        int top = view.getTop();
        int width2 = view.getWidth();
        float f17 = fArr[0];
        if (f17 == 0.0f) {
            f17 = fArr[1];
        }
        java.lang.Math.abs(f17);
        android.graphics.Matrix imageMatrix = cropImageView.getImageMatrix();
        float[][] fArr2 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 3, 3);
        float[] fArr3 = new float[9];
        imageMatrix.getValues(fArr3);
        for (int i17 = 0; i17 < 3; i17++) {
            for (int i18 = 0; i18 < 3; i18++) {
                fArr2[i17][i18] = fArr3[(i17 * 3) + i18];
            }
        }
        float[][] fArr4 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 3, 3);
        int i19 = 0;
        while (i19 < 3) {
            int i27 = 0;
            while (i27 < 3) {
                fArr4[i19][i27] = i19 == i27 ? 1.0f : 0.0f;
                i27++;
            }
            i19++;
        }
        for (int i28 = 0; i28 < 3; i28++) {
            float f18 = fArr2[i28][i28];
            if (f18 == 0.0f) {
                int i29 = i28 + 1;
                while (true) {
                    if (i29 >= 3) {
                        break;
                    }
                    if (fArr2[i29][i28] == 0.0f) {
                        i29++;
                    } else {
                        for (int i37 = 0; i37 < 3; i37++) {
                            float[] fArr5 = fArr2[i29];
                            float f19 = fArr5[i37];
                            float[] fArr6 = fArr2[i28];
                            fArr5[i37] = fArr6[i37];
                            fArr6[i37] = f19;
                            float[] fArr7 = fArr4[i29];
                            float f27 = fArr7[i37];
                            float[] fArr8 = fArr4[i28];
                            fArr7[i37] = fArr8[i37];
                            fArr8[i37] = f27;
                        }
                    }
                }
                f18 = fArr2[i28][i28];
            }
            for (int i38 = 0; i38 < 3; i38++) {
                float[] fArr9 = fArr2[i28];
                fArr9[i38] = fArr9[i38] / f18;
                float[] fArr10 = fArr4[i28];
                fArr10[i38] = fArr10[i38] / f18;
            }
            for (int i39 = 0; i39 < 3; i39++) {
                if (i39 != i28) {
                    float f28 = fArr2[i39][i28];
                    for (int i47 = 0; i47 < 3; i47++) {
                        float[] fArr11 = fArr2[i39];
                        fArr11[i47] = fArr11[i47] - (fArr2[i28][i47] * f28);
                        float[] fArr12 = fArr4[i39];
                        fArr12[i47] = fArr12[i47] - (fArr4[i28][i47] * f28);
                    }
                }
            }
        }
        try {
            if (cropImageNewUI.f210010s == 1) {
                int i48 = (int) (width2 * 0.125d);
                bitmap = W6(fArr4, left, top + i48, left + width2, (top + width2) - i48, cropImageView);
            } else {
                bitmap = W6(fArr4, left, top, left + width2, top + width2, cropImageView);
            }
        } catch (java.lang.Throwable unused) {
            bitmap = null;
        }
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CropImageUI", "doCropImage: error");
            cropImageNewUI.setResult(-1);
            cropImageNewUI.finish();
            return;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        if (cropImageNewUI.f210010s != 1 && (width = bitmap.getWidth()) != (height = bitmap.getHeight())) {
            if (width > height) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(0);
                arrayList.add(java.lang.Integer.valueOf((width - height) / 2));
                arrayList.add(bitmap);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "doCropImage", "(Lcom/tencent/mm/ui/tools/CropImageView;Landroid/view/View;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/tools/CropImageNewUI", "doCropImage", "(Lcom/tencent/mm/ui/tools/CropImageView;Landroid/view/View;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(width));
                arrayList2.add(java.lang.Integer.valueOf(width));
                arrayList2.add(java.lang.Integer.valueOf((height - width) / 2));
                arrayList2.add(0);
                arrayList2.add(bitmap);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "doCropImage", "(Lcom/tencent/mm/ui/tools/CropImageView;Landroid/view/View;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), ((java.lang.Integer) arrayList2.get(3)).intValue(), ((java.lang.Integer) arrayList2.get(4)).intValue());
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/ui/tools/CropImageNewUI", "doCropImage", "(Lcom/tencent/mm/ui/tools/CropImageView;Landroid/view/View;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            }
            bitmap = createBitmap;
        }
        java.lang.String stringExtra = cropImageNewUI.getIntent().getStringExtra("CropImage_OutputPath");
        if (stringExtra == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lp0.b.m());
            sb6.append(kk.k.g((cropImageNewUI.f210006o + java.lang.System.currentTimeMillis()).getBytes()));
            sb6.append("_crop.jpg");
            stringExtra = sb6.toString();
        }
        if (cropImageNewUI.Y6(bitmap, stringExtra, true)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("CropImage_OutputPath", stringExtra);
            com.tencent.mm.ui.tools.FilterImageView filterImageView = cropImageNewUI.f210000f;
            if (filterImageView != null) {
                intent.putExtra("CropImage_filterId", filterImageView.getFilterId());
            }
            cropImageNewUI.setResult(-1, intent);
        } else {
            cropImageNewUI.setResult(-1);
        }
        cropImageNewUI.finish();
    }

    public static void V6(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI, boolean z17) {
        java.lang.String stringExtra = cropImageNewUI.getIntent().getStringExtra("CropImage_OutputPath");
        if (x51.t1.b(stringExtra)) {
            stringExtra = cropImageNewUI.f210006o;
        } else {
            byte[] N = com.tencent.mm.vfs.w6.N(cropImageNewUI.f210006o, 0, -1);
            com.tencent.mm.vfs.w6.S(stringExtra, N, 0, N.length);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImage_Compress_Img", z17);
        intent.putExtra("CropImage_OutputPath", stringExtra);
        intent.putExtra("CropImage_rotateCount", cropImageNewUI.f210002h.getRotateCount() % 4);
        com.tencent.mm.ui.tools.FilterImageView filterImageView = cropImageNewUI.f210000f;
        if (filterImageView != null) {
            intent.putExtra("CropImage_filterId", filterImageView.getFilterId());
        }
        intent.putExtra("from_source", cropImageNewUI.getIntent().getIntExtra("from_source", 0));
        cropImageNewUI.setResult(-1, intent);
        cropImageNewUI.finish();
    }

    public static android.graphics.Bitmap W6(float[][] fArr, float f17, float f18, float f19, float f27, com.tencent.mm.ui.tools.CropImageView cropImageView) {
        if (cropImageView == null) {
            return null;
        }
        float[] fArr2 = {f17, f18, 1.0f};
        float[] fArr3 = {f19, f27, 1.0f};
        float[] fArr4 = new float[3];
        int i17 = 0;
        while (true) {
            float f28 = 0.0f;
            if (i17 >= 3) {
                break;
            }
            for (int i18 = 0; i18 < 3; i18++) {
                f28 += fArr[i17][i18] * fArr2[i18];
            }
            fArr4[i17] = f28;
            i17++;
        }
        float[] fArr5 = new float[3];
        for (int i19 = 0; i19 < 3; i19++) {
            float f29 = 0.0f;
            for (int i27 = 0; i27 < 3; i27++) {
                f29 += fArr[i19][i27] * fArr3[i27];
            }
            fArr5[i19] = f29;
        }
        int min = (int) java.lang.Math.min(fArr4[0], fArr5[0]);
        int min2 = (int) java.lang.Math.min(fArr4[1], fArr5[1]);
        if (min < 0) {
            min = 0;
        }
        if (min2 < 0) {
            min2 = 0;
        }
        int abs = (int) java.lang.Math.abs(fArr4[0] - fArr5[0]);
        int abs2 = (int) java.lang.Math.abs(fArr4[1] - fArr5[1]);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int rotateCount = cropImageView.getRotateCount() % 4;
        if (rotateCount == 0) {
            matrix.setRotate(0.0f, abs / 2, abs2 / 2);
        } else if (rotateCount == 1) {
            matrix.setRotate(90.0f, abs / 2, abs2 / 2);
        } else if (rotateCount == 2) {
            matrix.setRotate(180.0f, abs / 2, abs2 / 2);
        } else if (rotateCount == 3) {
            matrix.setRotate(270.0f, abs / 2, abs2 / 2);
        }
        android.graphics.Bitmap bmp = cropImageView.getBmp();
        if (min + abs > bmp.getWidth()) {
            abs = bmp.getWidth() - min;
        }
        if (min2 + abs2 > bmp.getHeight()) {
            abs2 = bmp.getHeight() - min2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CropImageUI", "rawWidth:%d, rawHeigth:%d, originalLX:%d, originalTY:%d, realWidth:%d, realHeight:%d", java.lang.Integer.valueOf(bmp.getWidth()), java.lang.Integer.valueOf(bmp.getHeight()), java.lang.Integer.valueOf(min), java.lang.Integer.valueOf(min2), java.lang.Integer.valueOf(abs), java.lang.Integer.valueOf(abs2));
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(abs2));
        aVar.c(java.lang.Integer.valueOf(abs));
        aVar.c(java.lang.Integer.valueOf(min2));
        aVar.c(java.lang.Integer.valueOf(min));
        aVar.c(bmp);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/ui/tools/CropImageNewUI", "corpByMaptoOriginalImg", "([[FFFFFLcom/tencent/mm/ui/tools/CropImageView;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/tools/CropImageNewUI", "corpByMaptoOriginalImg", "([[FFFFFLcom/tencent/mm/ui/tools/CropImageView;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    public final android.graphics.Bitmap X6(int i17, int i18) {
        android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(this.f210006o, i18, i17, true);
        if (this.f210005n == 0) {
            return T;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.reset();
        matrix.setRotate(this.f210005n, T.getWidth() / 2, T.getHeight() / 2);
        int width = T.getWidth();
        int height = T.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(T);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/ui/tools/CropImageNewUI", "getCopeBackImg", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/tools/CropImageNewUI", "getCopeBackImg", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        if (T != createBitmap) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CropImageUI", "recycle bitmap:%s", T.toString());
            T.recycle();
        }
        return createBitmap;
    }

    public final boolean Y6(android.graphics.Bitmap bitmap, java.lang.String str, boolean z17) {
        if (str != null && !str.equals("")) {
            try {
                int i17 = this.f210010s;
                if (i17 == 1) {
                    com.tencent.mm.sdk.platformtools.x.D0(bitmap, 30, android.graphics.Bitmap.CompressFormat.JPEG, str, z17);
                } else if (i17 == 2) {
                    com.tencent.mm.sdk.platformtools.x.D0(bitmap, 80, android.graphics.Bitmap.CompressFormat.JPEG, str, z17);
                } else {
                    com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, z17);
                }
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CropImageUI", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.e("MicroMsg.CropImageUI", "saveBitmapToImage failed:" + e17.toString());
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void activateBroadcast(boolean z17) {
        if (z17) {
            db5.m9.a(z17, new android.content.Intent().putExtra("classname", getClass().getName()).putExtra("main_process", false));
        } else {
            super.activateBroadcast(z17);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a3b;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        this.f210001g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cng);
        this.f210003i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.cne);
        this.f210004m = findViewById(com.tencent.mm.R.id.cn_);
        int intExtra = getIntent().getIntExtra("CropImageMode", 0);
        this.f209998d = intExtra;
        iz5.a.g("the image mode must be set", intExtra != 0);
        this.f210010s = getIntent().getIntExtra("CropImage_from_scene", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("CropImage_Filter", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false);
        if (booleanExtra) {
            com.tencent.mm.ui.tools.u2 u2Var = new com.tencent.mm.ui.tools.u2(this);
            com.tencent.mm.ui.tools.v2 v2Var = new com.tencent.mm.ui.tools.v2(this);
            com.tencent.mm.ui.tools.FilterImageView filterImageView = (com.tencent.mm.ui.tools.FilterImageView) findViewById(com.tencent.mm.R.id.cn7);
            this.f210000f = filterImageView;
            filterImageView.setOnConfirmImp(u2Var);
            this.f210000f.setOnExitImp(v2Var);
        }
        this.f210009r = false;
        com.tencent.mm.ui.tools.CropImageView cropImageView = (com.tencent.mm.ui.tools.CropImageView) findViewById(com.tencent.mm.R.id.cnh);
        this.f210002h = cropImageView;
        cropImageView.post(new com.tencent.mm.ui.tools.h2(this));
        this.f210002h.setOnShortClick(new com.tencent.mm.ui.tools.m2(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.cni)).setOnClickListener(new com.tencent.mm.ui.tools.z1(this));
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.cnj);
        button.setOnClickListener(new com.tencent.mm.ui.tools.a2(this));
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.cnk);
        button2.setOnClickListener(new com.tencent.mm.ui.tools.b2(this));
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.ui.tools.c2(this), true);
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.ui.tools.d2(this), true);
        button.setOnTouchListener(new com.tencent.mm.ui.tools.e2(this, b4Var));
        button2.setOnTouchListener(new com.tencent.mm.ui.tools.f2(this, b4Var2));
        int i17 = this.f209998d;
        if (i17 == 1) {
            com.tencent.mm.ui.tools.x1 x1Var = new com.tencent.mm.ui.tools.x1(this);
            com.tencent.mm.ui.tools.y1 y1Var = new com.tencent.mm.ui.tools.y1(this);
            com.tencent.mm.ui.tools.FilterImageView filterImageView2 = (com.tencent.mm.ui.tools.FilterImageView) findViewById(com.tencent.mm.R.id.cn7);
            this.f210000f = filterImageView2;
            filterImageView2.setOnConfirmImp(x1Var);
            this.f210000f.setOnExitImp(y1Var);
            this.f210000f.setLimitZoomIn(false);
            com.tencent.mm.ui.tools.FilterImageView filterImageView3 = this.f210000f;
            com.tencent.mm.ui.tools.CropImageView cropImageView2 = filterImageView3.f210046h;
            if (cropImageView2 != null) {
                cropImageView2.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
                com.tencent.mm.ui.tools.CropImageView cropImageView3 = filterImageView3.f210046h;
                cropImageView3.setOnTouchListener(cropImageView3.C);
            }
            this.f210000f.setCropMaskVisible(0);
            if (this.f210010s == 1) {
                this.f210000f.setCropMaskBackground(com.tencent.mm.R.drawable.bko);
            }
        } else if (i17 == 2) {
            this.f210002h.setEnableOprate(false);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483990cn2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.cna);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i17 == 3) {
            this.f210001g.setVisibility(8);
        } else if (i17 == 5) {
            int intExtra2 = getIntent().getIntExtra("CropImage_CompressType", 1);
            boolean booleanExtra3 = getIntent().getBooleanExtra("CropImage_BHasHD", false);
            if (intExtra2 == 1 || !booleanExtra3) {
                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.cna);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "initFooterBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/ui/tools/CropImageNewUI", "initFooterBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.cna);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "initFooterBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/ui/tools/CropImageNewUI", "initFooterBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.Button button3 = (android.widget.Button) findViewById(com.tencent.mm.R.id.cnb);
                button3.setBackgroundResource(com.tencent.mm.R.drawable.f481071k3);
                button3.setPadding(25, 8, 25, 8);
                button3.setOnClickListener(new com.tencent.mm.ui.tools.g2(this));
            }
        }
        int i18 = this.f209998d;
        com.tencent.mm.ui.tools.n2 n2Var = new com.tencent.mm.ui.tools.n2(this, booleanExtra, booleanExtra2);
        com.tencent.mm.ui.fb fbVar = com.tencent.mm.ui.fb.GREEN;
        if (i18 == 5) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, n2Var);
        } else if (i18 == 4) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, n2Var);
            android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.cna);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.Button button4 = (android.widget.Button) findViewById(com.tencent.mm.R.id.cnb);
            button4.setText(com.tencent.mm.R.string.f491020bm0);
            button4.setOnClickListener(new com.tencent.mm.ui.tools.o2(this));
        } else {
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.f491024bm4), n2Var, null, fbVar);
        }
        if (booleanExtra && booleanExtra2) {
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.f491020bm0), n2Var, null, fbVar);
        }
        setBackBtn(new com.tencent.mm.ui.tools.p2(this));
        if (this.f209998d == 6) {
            android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.cna);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.f491024bm4), new com.tencent.mm.ui.tools.s2(this), null, fbVar);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i17 = configuration.orientation;
        if (i17 == 1 || i17 == 2) {
            this.f210002h.post(new com.tencent.mm.ui.tools.t2(this));
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.ui.tools.CropImageView cropImageView = this.f210002h;
        if (cropImageView != null) {
            android.graphics.Bitmap bitmap = cropImageView.f210012e;
            if (bitmap != null && !bitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CropImageView", "recycle bitmap:%s", cropImageView.f210012e.toString());
                cropImageView.f210012e.recycle();
            }
            wu5.c cVar = cropImageView.f210026v;
            if (cVar != null) {
                cVar.cancel(false);
                cropImageView.f210026v = null;
            }
            cropImageView.f210027w.removeCallbacksAndMessages(null);
            cropImageView.f210028x.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.ui.tools.FilterImageView filterImageView = this.f210000f;
        if (filterImageView != null) {
            filterImageView.f210043e = null;
            android.graphics.Bitmap bitmap2 = filterImageView.f210047i;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FilterView", "recycle bitmap:%s", filterImageView.f210047i.toString());
                filterImageView.f210047i.recycle();
            }
            filterImageView.f210047i = null;
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        setRequestedOrientation(1);
    }
}
