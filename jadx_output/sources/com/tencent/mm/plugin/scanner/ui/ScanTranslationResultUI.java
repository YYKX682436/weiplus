package com.tencent.mm.plugin.scanner.ui;

@db5.a(131)
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "Le04/v2;", "<init>", "()V", "com/tencent/mm/plugin/scanner/ui/b3", "scan-translation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ScanTranslationResultUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, e04.v2 {
    public static final /* synthetic */ int G = 0;
    public int A;
    public int B;
    public com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest E;
    public final com.tencent.mm.sdk.event.IListener F;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f159374d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f159375e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f159376f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f159377g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f159378h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f159379i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f159380m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.tools.MMGestureGallery f159381n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.b3 f159382o;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Bitmap f159384q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap f159385r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f159386s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f159387t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f159388u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.model.o2 f159389v;

    /* renamed from: w, reason: collision with root package name */
    public int f159390w;

    /* renamed from: x, reason: collision with root package name */
    public int f159391x;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f159393z;

    /* renamed from: p, reason: collision with root package name */
    public final android.animation.ValueAnimator f159383p = new android.animation.ValueAnimator();

    /* renamed from: y, reason: collision with root package name */
    public int f159392y = -1;
    public final com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct C = new com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct();
    public final long[] D = new long[2];

    public ScanTranslationResultUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.F = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent>(a0Var) { // from class: com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI$changeTransLangListener$1
            {
                this.__eventId = -348375692;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent) {
                com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent event = changeTranslateLanguageEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI = com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI.this;
                com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = scanTranslationResultUI.E;
                java.lang.String str = settingsTranslateLanguageRequest != null ? settingsTranslateLanguageRequest.f67822e : null;
                java.lang.String str2 = scanTranslationResultUI.f159386s;
                java.lang.String str3 = "ScanTranslationResultUI.SettingsRequestSessionId_" + str2;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeTransLangListener, eventSessionId: ");
                am.z1 z1Var = event.f54035g;
                sb6.append(z1Var.f8502a);
                sb6.append(", requestSessionId: ");
                sb6.append(str);
                sb6.append(", currentImgPath: ");
                sb6.append(str2);
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", sb6.toString());
                if (str == null || !android.text.TextUtils.equals(str, z1Var.f8502a) || !android.text.TextUtils.equals(str, str3)) {
                    return false;
                }
                scanTranslationResultUI.E = null;
                scanTranslationResultUI.L0();
                return false;
            }
        };
    }

    public static final void T6(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        int i17 = scanTranslationResultUI.f159392y;
        if (i17 == 3) {
            android.graphics.Bitmap bitmap = scanTranslationResultUI.f159384q;
            if (bitmap != null) {
                scanTranslationResultUI.Z6(bitmap);
            }
            java.lang.String str = scanTranslationResultUI.f159393z;
            if (str != null && r26.i0.p(str, "zh_CN", false)) {
                android.widget.ImageView imageView = scanTranslationResultUI.f159375e;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("viewSourceBtn");
                    throw null;
                }
                imageView.setImageResource(com.tencent.mm.R.raw.translation_result_chinese_highlighted);
            } else {
                android.widget.ImageView imageView2 = scanTranslationResultUI.f159375e;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("viewSourceBtn");
                    throw null;
                }
                imageView2.setImageResource(com.tencent.mm.R.raw.translation_result_english_highlighted);
            }
            scanTranslationResultUI.f159392y = 2;
            scanTranslationResultUI.C.f59751j++;
            return;
        }
        if (i17 == 2) {
            android.graphics.Bitmap bitmap2 = scanTranslationResultUI.f159385r;
            if (bitmap2 != null) {
                scanTranslationResultUI.Z6(bitmap2);
            }
            java.lang.String str2 = scanTranslationResultUI.f159393z;
            if (str2 != null && r26.i0.p(str2, "zh_CN", true)) {
                android.widget.ImageView imageView3 = scanTranslationResultUI.f159375e;
                if (imageView3 == null) {
                    kotlin.jvm.internal.o.o("viewSourceBtn");
                    throw null;
                }
                imageView3.setImageResource(com.tencent.mm.R.drawable.f482187b81);
            } else {
                android.widget.ImageView imageView4 = scanTranslationResultUI.f159375e;
                if (imageView4 == null) {
                    kotlin.jvm.internal.o.o("viewSourceBtn");
                    throw null;
                }
                imageView4.setImageResource(com.tencent.mm.R.drawable.f482189b83);
            }
            scanTranslationResultUI.f159392y = 3;
        }
    }

    public static final void U6(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        scanTranslationResultUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "enterTranslateFinishStatus");
        scanTranslationResultUI.f159392y = 3;
        android.view.View view = scanTranslationResultUI.f159374d;
        if (view == null) {
            kotlin.jvm.internal.o.o("saveContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateFinishStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateFinishStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (r26.i0.p(scanTranslationResultUI.f159393z, "zh_CN", true)) {
            android.widget.ImageView imageView = scanTranslationResultUI.f159375e;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("viewSourceBtn");
                throw null;
            }
            imageView.setImageResource(com.tencent.mm.R.drawable.f482187b81);
        } else {
            android.widget.ImageView imageView2 = scanTranslationResultUI.f159375e;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("viewSourceBtn");
                throw null;
            }
            imageView2.setImageResource(com.tencent.mm.R.drawable.f482189b83);
        }
        android.widget.ImageView imageView3 = scanTranslationResultUI.f159379i;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("scanLine");
            throw null;
        }
        imageView3.setVisibility(8);
        scanTranslationResultUI.a7();
        if (scanTranslationResultUI.A == 1 && com.tencent.mm.sdk.platformtools.t8.K0(scanTranslationResultUI.f159387t)) {
            java.lang.String Zi = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).Zi("jpg");
            scanTranslationResultUI.f159387t = Zi;
            try {
                com.tencent.mm.sdk.platformtools.x.D0(scanTranslationResultUI.f159385r, 80, android.graphics.Bitmap.CompressFormat.JPEG, Zi, false);
                com.tencent.mm.plugin.scanner.model.o2 o2Var = new com.tencent.mm.plugin.scanner.model.o2();
                o2Var.field_originMD5 = com.tencent.mm.sdk.platformtools.w2.a(scanTranslationResultUI.f159386s + com.tencent.mm.vfs.w6.l(scanTranslationResultUI.f159386s));
                java.lang.String str = scanTranslationResultUI.f159387t;
                o2Var.field_resultFile = str;
                com.tencent.mm.plugin.scanner.model.o2 o2Var2 = scanTranslationResultUI.f159389v;
                o2Var.field_originalImageFileId = o2Var2 != null ? o2Var2.field_originalImageFileId : null;
                o2Var.field_originalImageAesKey = o2Var2 != null ? o2Var2.field_originalImageAesKey : null;
                o2Var.field_resultImageFileId = o2Var2 != null ? o2Var2.field_resultImageFileId : null;
                o2Var.field_resultImageAesKey = o2Var2 != null ? o2Var2.field_resultImageAesKey : null;
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "insert translate result %s", str);
                ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).cj().z0(o2Var);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanTranslationResultUI", e17, "save translate result file error", new java.lang.Object[0]);
            }
        }
    }

    public static final void V6(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        int i17 = scanTranslationResultUI.f159392y;
        com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct = scanTranslationResultUI.C;
        if (i17 == 2) {
            try {
                oCRTranslateReportStruct.f59753l = 1L;
                java.lang.String str = scanTranslationResultUI.f159386s;
                if (str != null) {
                    ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(scanTranslationResultUI.getContext(), str, new com.tencent.mm.plugin.scanner.ui.u3(scanTranslationResultUI));
                    return;
                }
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanTranslationResultUI", e17, "copy to gallery error", new java.lang.Object[0]);
                return;
            }
        }
        if (i17 == 3) {
            try {
                oCRTranslateReportStruct.f59752k = 1L;
                if (scanTranslationResultUI.A == 0) {
                    try {
                        java.lang.String Zi = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).Zi("jpg");
                        scanTranslationResultUI.f159387t = Zi;
                        com.tencent.mm.sdk.platformtools.x.D0(scanTranslationResultUI.f159385r, 80, android.graphics.Bitmap.CompressFormat.JPEG, Zi, false);
                    } catch (java.io.IOException e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanTranslationResultUI", e18, "save translate result file error", new java.lang.Object[0]);
                    }
                }
                java.lang.String str2 = scanTranslationResultUI.f159387t;
                if (str2 != null) {
                    ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(scanTranslationResultUI.getContext(), str2, new com.tencent.mm.plugin.scanner.ui.v3(scanTranslationResultUI));
                }
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanTranslationResultUI", e19, "save to gallery error", new java.lang.Object[0]);
            }
        }
    }

    public final void L0() {
        this.C.f59747f = 2L;
        this.f159391x = (int) ((c01.z1.r().hashCode() + java.lang.System.currentTimeMillis()) & (-1));
        this.f159392y = 1;
        Y6();
        if (r26.i0.p(this.f159393z, "zh_CN", true)) {
            android.widget.ImageView imageView = this.f159375e;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("viewSourceBtn");
                throw null;
            }
            imageView.setImageResource(com.tencent.mm.R.raw.translation_result_chinese);
        } else {
            android.widget.ImageView imageView2 = this.f159375e;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("viewSourceBtn");
                throw null;
            }
            imageView2.setImageResource(com.tencent.mm.R.raw.translation_result_english);
        }
        android.view.View view = this.f159377g;
        if (view == null) {
            kotlin.jvm.internal.o.o("topBgLayer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f159378h;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("bottomBgLayer");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f159374d;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("saveContainer");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView3 = this.f159379i;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("scanLine");
            throw null;
        }
        imageView3.setVisibility(0);
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = this.f159381n;
        if (mMGestureGallery == null) {
            kotlin.jvm.internal.o.o("gestureGallery");
            throw null;
        }
        mMGestureGallery.setVisibility(0);
        android.animation.ValueAnimator valueAnimator = this.f159383p;
        valueAnimator.setRepeatMode(1);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.start();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "doTranslation");
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f159386s)) {
                return;
            }
            this.f159388u = e04.t2.c(this.f159386s);
            java.lang.String str = this.f159386s;
            int i17 = this.A;
            if (i17 == 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                android.graphics.Bitmap bitmap = this.f159384q;
                if (bitmap != null) {
                    com.tencent.mm.sdk.platformtools.x.D0(bitmap, 80, android.graphics.Bitmap.CompressFormat.JPEG, this.f159386s, false);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "doTranslation save img cost %d", java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - currentTimeMillis)));
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "doTranslation fileSize %d", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(this.f159386s)));
            } else if (i17 == 1) {
                dm.aa y07 = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).cj().y0(com.tencent.mm.sdk.platformtools.w2.a(this.f159386s + com.tencent.mm.vfs.w6.l(this.f159386s)));
                java.lang.String c17 = com.tencent.mm.sdk.platformtools.m2.c(this);
                kotlin.jvm.internal.o.f(c17, "getActualTranslateLanguageIso(...)");
                if (y07 != null && android.text.TextUtils.equals(y07.field_toLang, c17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "doTranslation already has translation result");
                    java.lang.String str2 = y07.field_resultFile;
                    this.f159387t = str2;
                    android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str2, new android.graphics.BitmapFactory.Options());
                    this.f159385r = J2;
                    if (J2 != null) {
                        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.scanner.ui.c3(this), 500L);
                        return;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanTranslationResultUI", "can not find old translation result!");
                }
                if (this.B != 0) {
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    java.lang.String Ai = ((com.tencent.mm.plugin.scanner.u0) ((com.tencent.mm.plugin.scanner.a0) i95.n0.c(com.tencent.mm.plugin.scanner.a0.class))).Ai("jpg");
                    com.tencent.mm.sdk.platformtools.x.D0(this.f159384q, 80, android.graphics.Bitmap.CompressFormat.JPEG, Ai, false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "doTranslation save img cost %d", java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - currentTimeMillis2)));
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "doTranslation fileSize %d", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(Ai)));
                    str = Ai;
                }
            }
            this.D[1] = java.lang.System.currentTimeMillis();
            java.lang.String str3 = this.f159388u;
            if (str3 == null) {
                str3 = "";
            }
            e04.t2.a(str3, str == null ? "" : str, 2, new com.tencent.mm.plugin.scanner.ui.j3(this, str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanTranslationResultUI", e17, "", new java.lang.Object[0]);
        }
    }

    public final void W6() {
        setResult(-1);
        finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
    }

    public final void X6(java.lang.String str) {
        a7();
        com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct = this.C;
        oCRTranslateReportStruct.f59747f = 5L;
        oCRTranslateReportStruct.f59750i = (int) (java.lang.System.currentTimeMillis() - this.D[1]);
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.iaw);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            string = java.lang.String.valueOf(str);
        }
        db5.e1.G(getContext(), string, "", false, new com.tencent.mm.plugin.scanner.ui.t3(this));
    }

    public final void Y6() {
        if (r26.i0.p(com.tencent.mm.sdk.platformtools.m2.d(), "zh_CN", true)) {
            this.f159393z = com.tencent.mm.sdk.platformtools.m2.f(getContext());
        } else {
            this.f159393z = com.tencent.mm.sdk.platformtools.m2.f(getContext());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "targetLang %s", this.f159393z);
    }

    public final void Z6(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "setImageBitmap size: %s, %s", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
        com.tencent.mm.plugin.scanner.ui.b3 b3Var = this.f159382o;
        if (b3Var != null) {
            b3Var.f159509d = bitmap;
        }
        com.tencent.mm.plugin.scanner.ui.b3 b3Var2 = this.f159382o;
        if (b3Var2 != null) {
            b3Var2.notifyDataSetChanged();
        }
    }

    public final void a7() {
        android.animation.ValueAnimator valueAnimator = this.f159383p;
        valueAnimator.setRepeatMode(1);
        valueAnimator.setRepeatCount(0);
        valueAnimator.end();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489209bp0;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 561 && i18 == -1) {
            java.lang.String b17 = com.tencent.mm.ui.tools.i1.b(getContext(), intent, g83.a.a());
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "select: [%s]", b17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                return;
            }
            this.f159386s = b17;
            this.A = 1;
            this.C.f59745d = 2L;
            int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(b17).getOrientationInDegree();
            this.B = orientationInDegree;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "degree %s", java.lang.Integer.valueOf(orientationInDegree));
            android.graphics.Bitmap K = com.tencent.mm.sdk.platformtools.x.K(b17);
            if (K != null) {
                this.f159384q = com.tencent.mm.sdk.platformtools.x.w0(K, this.B);
                L0();
                Z6(this.f159384q);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getController().E0(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m7j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f159380m = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ojc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f159381n = (com.tencent.mm.ui.tools.MMGestureGallery) findViewById2;
        com.tencent.mm.plugin.scanner.ui.b3 b3Var = new com.tencent.mm.plugin.scanner.ui.b3(this);
        this.f159382o = b3Var;
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = this.f159381n;
        if (mMGestureGallery == null) {
            kotlin.jvm.internal.o.o("gestureGallery");
            throw null;
        }
        mMGestureGallery.setAdapter((android.widget.SpinnerAdapter) b3Var);
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery2 = this.f159381n;
        if (mMGestureGallery2 == null) {
            kotlin.jvm.internal.o.o("gestureGallery");
            throw null;
        }
        mMGestureGallery2.setLongClickOverListener(new com.tencent.mm.plugin.scanner.ui.l3(this));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.m9v);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f159374d = findViewById3;
        android.view.View findViewById4 = findViewById3.findViewById(com.tencent.mm.R.id.ojh);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        this.f159375e = imageView;
        imageView.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.m3(this));
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ojg);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f159377g = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.oj_);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f159378h = findViewById6;
        hideTitleView();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.m_h);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f159379i = (android.widget.ImageView) findViewById7;
        android.view.View view = this.f159374d;
        if (view == null) {
            kotlin.jvm.internal.o.o("saveContainer");
            throw null;
        }
        android.view.View findViewById8 = view.findViewById(com.tencent.mm.R.id.ojb);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f159376f = findViewById8;
        findViewById8.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.n3(this));
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.bz6);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById9).setOnClickListener(new com.tencent.mm.plugin.scanner.ui.o3(this));
        this.f159390w = i65.a.k(getContext());
        android.animation.ValueAnimator valueAnimator = this.f159383p;
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addListener(new com.tencent.mm.plugin.scanner.ui.p3(this));
        valueAnimator.addUpdateListener(new com.tencent.mm.plugin.scanner.ui.q3(this));
        android.view.View view2 = this.f159374d;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("saveContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin += com.tencent.mm.ui.bk.j(getContext());
        android.view.View view3 = this.f159374d;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("saveContainer");
            throw null;
        }
        view3.setLayoutParams(layoutParams2);
        valueAnimator.setDuration(5000L);
        db5.f.c(this, null);
        Y6();
        this.F.alive();
        java.lang.String stringExtra = getIntent().getStringExtra("key_translation_origin_image_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f159386s = stringExtra;
        int intExtra = getIntent().getIntExtra("key_translation_source", 0);
        this.A = intExtra;
        if (intExtra == 0) {
            this.C.f59746e = getIntent().getLongExtra("key_translation_capture_time", 0L);
            this.C.f59745d = 1L;
        } else if (intExtra == 1) {
            com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct = this.C;
            oCRTranslateReportStruct.f59746e = 0L;
            oCRTranslateReportStruct.f59745d = 2L;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "initData originPath: %s, source: %d", this.f159386s, java.lang.Integer.valueOf(this.A));
        java.lang.String str = this.f159386s;
        kotlin.jvm.internal.o.d(str);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.tencent.mm.plugin.scanner.model.n2.f158964a.get(str);
        this.f159384q = bitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            android.graphics.Bitmap bitmap2 = this.f159384q;
            kotlin.jvm.internal.o.d(bitmap2);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(bitmap2.getWidth());
            android.graphics.Bitmap bitmap3 = this.f159384q;
            kotlin.jvm.internal.o.d(bitmap3);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "initData bitmap width: %d, height: %d", valueOf, java.lang.Integer.valueOf(bitmap3.getHeight()));
        }
        Z6(this.f159384q);
        if (this.f159384q == null) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.scanner.ui.s3(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f159383p.removeAllListeners();
        this.f159383p.removeAllUpdateListeners();
        this.f159383p.cancel();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.scanner.model.n2.f158964a;
        ((ku5.t0) ku5.t0.f312615d).g(com.tencent.mm.plugin.scanner.model.m2.f158958d);
        this.F.dead();
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.scanner.q0.class);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.PluginScanTranslation");
        e04.w2 aj6 = ((com.tencent.mm.plugin.scanner.q0) c17).aj();
        aj6.f246149a = 0;
        aj6.f246150b = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 != 4) {
            return super.onKeyDown(i17, event);
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.scanner.q0.class);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.PluginScanTranslation");
        e04.w2 aj6 = ((com.tencent.mm.plugin.scanner.q0) c17).aj();
        aj6.f246149a = 0;
        aj6.f246150b = null;
        int i18 = this.f159392y;
        if (i18 == 0) {
            W6();
        } else if (i18 == 1 || i18 == 2 || i18 == 3) {
            com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct = this.C;
            if (i18 == 1) {
                oCRTranslateReportStruct.f59750i = (int) (java.lang.System.currentTimeMillis() - this.D[1]);
            }
            if (oCRTranslateReportStruct.f59747f != 0) {
                oCRTranslateReportStruct.k();
            }
            W6();
        }
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.audio.k1.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.E = null;
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(2097280);
        }
        if (fp.h.c(19)) {
            getWindow().addFlags(67109888);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        getWindow().getDecorView().setSystemUiVisibility(1280);
        qp1.h0.b();
        gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.audio.k1.CTRL_INDEX, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "onResume curState: %d", java.lang.Integer.valueOf(this.f159392y));
        if (this.f159392y == -1) {
            L0();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.scanner.model.e0 e0Var = m1Var instanceof com.tencent.mm.plugin.scanner.model.e0 ? (com.tencent.mm.plugin.scanner.model.e0) m1Var : null;
        if (e0Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "scanTranslate onSceneEnd errType %s, errCode %s, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "TranslationSpr useNewCgi: %d newOcrmt: %s", 1, java.lang.String.valueOf(e0Var.f158884p));
        if (i17 != 0 || i18 != 0) {
            X6(str);
            return;
        }
        boolean z17 = ((com.tencent.mm.plugin.scanner.model.e0) m1Var).f158884p;
        java.lang.String str2 = e0Var.f158883o;
        java.lang.String str3 = e0Var.f158882n;
        if (z17) {
            int i19 = this.f159391x;
            com.tencent.mm.plugin.scanner.model.o2 o2Var = new com.tencent.mm.plugin.scanner.model.o2();
            o2Var.field_originMD5 = com.tencent.mm.sdk.platformtools.w2.a(this.f159386s + com.tencent.mm.vfs.w6.l(this.f159386s));
            o2Var.field_resultFile = this.f159387t;
            o2Var.field_originalImageFileId = str3;
            o2Var.field_originalImageAesKey = str2;
            o2Var.field_resultImageFileId = e0Var.f158885q;
            o2Var.field_resultImageAesKey = e0Var.f158886r;
            this.f159389v = o2Var;
            ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).hj(i19, e0Var, this);
            return;
        }
        int i27 = this.f159391x;
        com.tencent.mm.plugin.scanner.model.o2 o2Var2 = new com.tencent.mm.plugin.scanner.model.o2();
        o2Var2.field_originMD5 = com.tencent.mm.sdk.platformtools.w2.a(this.f159386s + com.tencent.mm.vfs.w6.l(this.f159386s));
        o2Var2.field_resultFile = this.f159387t;
        o2Var2.field_originalImageFileId = str3;
        o2Var2.field_originalImageAesKey = str2;
        o2Var2.field_resultImageFileId = e0Var.f158885q;
        o2Var2.field_resultImageAesKey = e0Var.f158886r;
        this.f159389v = o2Var2;
        java.util.List list = e0Var.f158878g;
        if (list == null || e0Var.f158879h != i27) {
            return;
        }
        long currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - e0Var.f158880i);
        com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct = this.C;
        oCRTranslateReportStruct.f59749h = currentTimeMillis;
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "scanTranslate onSceneEnd angle %f, translationInfos length %d", java.lang.Float.valueOf(e0Var.H()), java.lang.Integer.valueOf(linkedList.size()));
        if (linkedList.size() <= 0) {
            oCRTranslateReportStruct.f59750i = (int) (java.lang.System.currentTimeMillis() - this.D[1]);
            java.lang.String string = getResources().getString(com.tencent.mm.R.string.iaw);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            db5.e1.G(getContext(), string, "", false, new com.tencent.mm.plugin.scanner.ui.y3(this));
            return;
        }
        oCRTranslateReportStruct.f59747f = 1L;
        ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).aj().e(i27, list, e0Var.H(), this.f159384q, this);
        if (com.tencent.mm.sdk.platformtools.t8.K0(e0Var.I())) {
            return;
        }
        this.f159393z = e0Var.I();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.audio.k1.CTRL_INDEX, this);
    }

    @Override // e04.v2
    public void v5(int i17, android.graphics.Bitmap bitmap) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.scanner.ui.k3(i17, bitmap, this));
    }
}
