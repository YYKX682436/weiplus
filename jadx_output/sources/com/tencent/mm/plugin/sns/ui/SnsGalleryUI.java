package com.tencent.mm.plugin.sns.ui;

@gm0.a2
/* loaded from: classes4.dex */
public class SnsGalleryUI extends com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI implements com.tencent.mm.plugin.sns.ui.zj {
    public static final /* synthetic */ int I1 = 0;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.ImageView f167152l1;

    /* renamed from: p1, reason: collision with root package name */
    public android.os.Bundle f167154p1;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s4 f167155x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f167156x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.graphics.Rect f167157y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f167158y1;
    public int S = 0;
    public java.lang.String T = "";
    public int U = 0;
    public boolean V = false;
    public boolean W = true;
    public boolean X = false;
    public boolean Y = false;
    public final com.tencent.mm.plugin.sns.statistics.n Z = new com.tencent.mm.plugin.sns.statistics.n();

    /* renamed from: p0, reason: collision with root package name */
    public int f167153p0 = 0;

    /* renamed from: z1, reason: collision with root package name */
    public float f167159z1 = 1.0f;
    public int A1 = 0;
    public int B1 = 0;
    public boolean C1 = false;
    public int D1 = 0;
    public int E1 = 0;
    public int F1 = 0;
    public final android.os.Handler G1 = new android.os.Handler(android.os.Looper.getMainLooper());
    public java.util.List H1 = null;

    public static /* synthetic */ android.graphics.Rect r7(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        android.graphics.Rect rect = snsGalleryUI.f167157y0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return rect;
    }

    public static /* synthetic */ int s7(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int i17 = snsGalleryUI.A1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return i17;
    }

    public static /* synthetic */ int t7(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int i17 = snsGalleryUI.B1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return i17;
    }

    public static /* synthetic */ float u7(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        float f17 = snsGalleryUI.f167159z1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return f17;
    }

    public static /* synthetic */ boolean v7(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        boolean z17 = snsGalleryUI.Y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return z17;
    }

    public final void A7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBottomSheetMenu", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        java.lang.String selectId = this.f166810o.getSelectId();
        java.lang.String selectedMediaId = this.f166810o.getSelectedMediaId();
        r45.m33 selectItem = this.f166810o.getSelectItem();
        if (android.text.TextUtils.isEmpty(selectId) || android.text.TextUtils.isEmpty(selectedMediaId) || selectItem == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsGalleryUI", "showBottomSheetMenu >> data is invalid");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheetMenu", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return;
        }
        this.f166810o.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needTranslationImage", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needTranslationImage", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f166810o.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needOCRImage", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needOCRImage", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (selectItem.f380113h) {
            this.f166810o.p0(selectItem);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheetMenu", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(selectId);
        if (k17 != null && !k17.isWaitPost()) {
            n7(com.tencent.mm.plugin.sns.model.i1.l(selectItem.f380109d), true);
        }
        try {
            int x76 = x7(k17);
            com.tencent.mm.plugin.sns.ui.c4 f76 = f7();
            f76.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearQBarDataList", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            f76.f168102v.clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearQBarDataList", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            com.tencent.mm.plugin.sns.ui.c4 f77 = f7();
            boolean z17 = this.V;
            r45.jj4 jj4Var = selectItem.f380109d;
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
            snsInfoFlip.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needTranslationImage", "com.tencent.mm.plugin.sns.ui.FlipView");
            boolean z18 = snsInfoFlip.f166288s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needTranslationImage", "com.tencent.mm.plugin.sns.ui.FlipView");
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = this.f166810o;
            snsInfoFlip2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needOCRImage", "com.tencent.mm.plugin.sns.ui.FlipView");
            boolean z19 = snsInfoFlip2.f166289t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needOCRImage", "com.tencent.mm.plugin.sns.ui.FlipView");
            f77.m(z17, k17, jj4Var, z18, z19, 1, this.f166810o.getCurrentImageView(), x76);
            wd4.d2.a(this);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsGalleryUI", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheetMenu", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.n4
    public void C2(final java.lang.String str, final java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchCodeScanned", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsGalleryUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.I1;
                com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.this;
                snsGalleryUI.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$dispatchCodeScanned$1", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                if (snsGalleryUI.H1 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$dispatchCodeScanned$1", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    return;
                }
                java.util.Iterator it = new java.util.ArrayList(snsGalleryUI.H1).iterator();
                while (it.hasNext()) {
                    wd4.v1 v1Var = (wd4.v1) ((com.tencent.mm.plugin.sns.ui.pi) it.next());
                    v1Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$scanCodeListener$1");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCodeScanned, mediaPath: ");
                    java.lang.String str2 = str;
                    sb6.append(str2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", sb6.toString());
                    if (kotlin.jvm.internal.o.b(str2, v1Var.f445044a)) {
                        ((yz5.l) v1Var.f445045b.f310123d).invoke(java.lang.Boolean.valueOf(((zh1.p) v1Var.f445046c).wi(list)));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$scanCodeListener$1");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$scanCodeListener$1");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$dispatchCodeScanned$1", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            }
        };
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        }
        ((ku5.t0) ku5.t0.f312615d).B(runnable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchCodeScanned", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
    public void W6(boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildFoot", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        super.W6(z17, i17);
        if (this.X && b7() != null) {
            b7().setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildFoot", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertActivityFromTranslucent", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        boolean z17 = !this.X;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertActivityFromTranslucent", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
    public int d7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return 4;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return dispatchKeyEvent;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("backPress", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        boolean z17 = X6() || Y6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("backPress", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_cmd_list", f7().h());
        setResult(-1, intent);
        android.graphics.Rect rect = this.f167157y0;
        if (rect == null || rect.isEmpty()) {
            finish();
        } else {
            z7();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
    public int e7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return 4;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean enableEdge2Edge() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableEdge2Edge", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableEdge2Edge", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
    public boolean g7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return com.tencent.mm.R.layout.crv;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
    public void h7(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFooterDetailClick", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.statistics.n nVar = this.Z;
        boolean z17 = this.W;
        nVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportFeedDetailClick", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportFeedDetailClick", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
        } else {
            java.lang.String s07 = ca4.z0.s0(snsInfo.field_snsId);
            com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(snsInfo.field_attrBuf);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) parseFrom;
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("snsalbumsid", nVar.f164908a);
            lVarArr[1] = new jz5.l("view_method", java.lang.Integer.valueOf(z17 ? 1 : 2));
            lVarArr[2] = new jz5.l("sns_feed_id", s07);
            lVarArr[3] = new jz5.l("is_pin_feed", java.lang.Integer.valueOf(snsObject.InTopList));
            lVarArr[4] = new jz5.l("sns_page_scene", java.lang.Integer.valueOf(nVar.f164909b));
            java.util.HashMap i17 = kz5.c1.i(lVarArr);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportViewEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
            com.tencent.mm.plugin.sns.statistics.w.f164988a.a();
            java.util.Objects.toString(ri.l0.a(i17));
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.statistics.v("sns_image_detail", "view_clk", i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportViewEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportFeedDetailClick", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFooterDetailClick", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.storage.s7 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        this.f167155x0 = new com.tencent.mm.ui.tools.s4(getContext());
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ght);
        this.f167152l1 = imageView;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
        }
        this.X = getIntent().getBooleanExtra("K_use_new_interaction", false);
        this.Y = getIntent().getBooleanExtra("K_is_from_day_view", false);
        if (this.X) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.tzo);
            if (findViewById != null) {
                findViewById.setBackgroundColor(android.R.color.transparent);
            }
            this.f167152l1.setVisibility(0);
            this.f167152l1.setAlpha(0.0f);
        }
        this.U = getIntent().getIntExtra("sns_video_scene", 0);
        this.T = getIntent().getStringExtra("sns_gallery_userName");
        int intExtra = getIntent().getIntExtra("sns_gallery_localId", 0);
        this.V = getIntent().getBooleanExtra("sns_gallery_is_self", false);
        this.S = getIntent().getIntExtra("sns_gallery_position", 0);
        java.lang.String i17 = com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", intExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryUI", "initView localId:%s, pos:%d", i17, java.lang.Integer.valueOf(this.S));
        y1(i17, this.S);
        W6(this.V, 1);
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = new com.tencent.mm.plugin.sns.ui.SnsInfoFlip(this);
        this.f166810o = snsInfoFlip;
        snsInfoFlip.setVideoScene(this.U);
        this.f166810o.setNeedScanImage(true);
        if (this.X) {
            this.f166810o.setUseFixAnimation(!this.Y);
            this.f166810o.setTouchFinish(true);
            this.f166810o.setUseNewInteraction(true);
            this.f166810o.setShowPageControl(true);
            this.f166810o.n0();
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = this.f166810o;
            snsInfoFlip2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustTitleBarForStatusBar", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (snsInfoFlip2.G1 != null) {
                int h17 = com.tencent.mm.ui.bl.h(snsInfoFlip2.getContext());
                int paddingTop = snsInfoFlip2.G1.getPaddingTop();
                android.view.View view = snsInfoFlip2.G1;
                view.setPadding(view.getPaddingLeft(), h17 + paddingTop, snsInfoFlip2.G1.getPaddingRight(), snsInfoFlip2.G1.getPaddingBottom());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustTitleBarForStatusBar", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (!this.Y) {
                this.f166810o.setFirstItemLoadListener(new com.tencent.mm.plugin.sns.ui.yj() { // from class: com.tencent.mm.plugin.sns.ui.SnsGalleryUI$$b
                    @Override // com.tencent.mm.plugin.sns.ui.yj
                    public final void a(db5.f0 f0Var, int i18) {
                        com.tencent.mm.memory.r c17;
                        int i19 = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.I1;
                        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.this;
                        snsGalleryUI.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$initView$0", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                        r45.m33 selectItem = snsGalleryUI.f166810o.getSelectItem();
                        if (selectItem != null && selectItem.f380109d != null) {
                            java.lang.String str = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), selectItem.f380109d.f377855d) + ca4.z0.U(selectItem.f380109d);
                            if (com.tencent.mm.vfs.w6.j(str) && (c17 = r94.a.c(str, null)) != null) {
                                android.graphics.Bitmap bitmap = c17.f68970d;
                                f0Var.setBitmapPlaceHolder(bitmap);
                                f0Var.r(bitmap.getWidth(), bitmap.getHeight());
                            }
                        }
                        f0Var.n(0.0f, true);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$initView$0", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    }
                });
            }
        } else {
            this.f166810o.setShowTitle(true);
        }
        com.tencent.mm.plugin.sns.model.d6 Kj = com.tencent.mm.plugin.sns.model.l4.Kj();
        java.lang.String str = this.T;
        Kj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsGalleryItems", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        java.util.ArrayList arrayList = (java.util.ArrayList) ((java.util.HashMap) Kj.f164156p).get(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsGalleryItems", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = arrayList;
        this.f166810o.setEnableHorLongBmpMode(false);
        this.f166810o.setGalleyLongClickOverListener(new db5.a8() { // from class: com.tencent.mm.plugin.sns.ui.SnsGalleryUI$$c
            @Override // db5.a8
            public final void a() {
                int i18 = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.I1;
                com.tencent.mm.plugin.sns.ui.SnsGalleryUI.this.A7();
            }
        });
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip3 = this.f166810o;
        android.view.View contentView = getContentView();
        snsInfoFlip3.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSetTouchScalePreviewLayout", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        snsInfoFlip3.f167188b2 = true;
        snsInfoFlip3.f167189c2 = contentView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSetTouchScalePreviewLayout", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (this.f166802d) {
            b7().setUseNewInteraction(this.X);
            b7().setAlbumScene(this.f167153p0);
            this.f166810o.X(arrayList2, this.T, this.S, b7(), this);
        } else {
            this.f166810o.X(arrayList2, this.T, this.S, a7(), this);
        }
        this.f166810o.setOnDeleteAllAction(new com.tencent.mm.plugin.sns.ui.hi(this));
        this.f166810o.setOnPageSelectListener(this);
        this.f166810o.setOnPageScrollChangeListener(this);
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.T, true);
        if (n17 == null || ((int) n17.E2) <= 0 || !n17.r2()) {
            a17 = this.T.equals(c01.z1.r()) ? com.tencent.mm.storage.s7.a() : new com.tencent.mm.storage.s7("album_stranger");
        } else {
            a17 = new com.tencent.mm.storage.s7("album_friend");
        }
        this.f166810o.setFromScene(a17);
        this.f166810o.setUIFromScene(c7());
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip4 = this.f166810o;
        snsInfoFlip4.f166286q = this.T;
        addView(snsInfoFlip4);
        setBackBtn(new com.tencent.mm.plugin.sns.ui.ii(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.sns.ui.ji(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isSupportNavigationSwipeBack */
    public boolean getF65848t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSupportNavigationSwipeBack", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        boolean z17 = !this.X;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportNavigationSwipeBack", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
    public void j7(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTranslateEnd", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        if ((z17 || z18) && f7() != null) {
            com.tencent.mm.plugin.sns.ui.c4 f76 = f7();
            f76.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowingMenu", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            wd4.l1 l1Var = f76.f168091h;
            boolean z19 = l1Var != null && l1Var.g();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowingMenu", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            if (z19) {
                java.lang.String selectId = this.f166810o.getSelectId();
                java.lang.String selectedMediaId = this.f166810o.getSelectedMediaId();
                r45.m33 selectItem = this.f166810o.getSelectItem();
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryUI", "onTranslateEnd showTranslateMenu: %s, showOcrMenu: %s, selectLocalId: %s, mediaId: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), selectId, selectedMediaId);
                com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(selectId);
                f7().m(this.V, k17, selectItem.f380109d, z17, z18, 1, this.f166810o.getCurrentImageView(), x7(k17));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTranslateEnd", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        r45.jj4 jj4Var;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryUI", "onAcvityResult requestCode:" + i17);
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return;
        }
        if (2 == i17) {
            if (-1 == i18) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
                if (snsInfoFlip != null) {
                    r45.jj4 jj4Var2 = snsInfoFlip.getSelectItem().f380109d;
                    if (jj4Var2.f377856e != 6) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                        return;
                    } else {
                        jj4Var = jj4Var2;
                        str = this.f166810o.getSelectId();
                    }
                } else {
                    jj4Var = null;
                    str = null;
                }
                if (jj4Var == null || str == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    return;
                }
                wd4.l1.f444950g.c(this, stringExtra, stringExtra2, jj4Var, str);
            }
        } else if (1 == i17) {
            int intExtra = intent.getIntExtra("sns_gallery_op_id", 0);
            java.lang.String i19 = com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", intent.getIntExtra("sns_gallery_op_id", 0));
            com.tencent.mm.plugin.sns.ui.c4 f76 = f7();
            f76.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOpCmd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            if (intExtra == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOpCmd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            } else {
                f76.f168088e.a(intExtra);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOpCmd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            }
            s3(true, i19, 1);
            if (intent.getBooleanExtra("sns_gallery_force_finish", false)) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("sns_cmd_list", f7().h());
                setResult(-1, intent2);
                finish();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        super.onConfigurationChanged(configuration);
        if (this.X && (snsInfoFlip = this.f166810o) != null) {
            snsInfoFlip.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBottomBarMarginForNavigationBar", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (snsInfoFlip.D1) {
                com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar imgBottomBarView = snsInfoFlip.getImgBottomBarView();
                if (imgBottomBarView instanceof com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar) {
                    ((com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar) imgBottomBarView).c();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBottomBarMarginForNavigationBar", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBottomBarMarginForNavigationBar", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        this.f167154p1 = bundle;
        this.X = getIntent().getBooleanExtra("K_use_new_interaction", false);
        this.f167153p0 = getIntent().getIntExtra("INTENT_ALBUM_SCENE", 0);
        com.tencent.mm.ui.bk.u0(this);
        super.onCreate(bundle);
        si0.w0.f408206a = new java.lang.ref.WeakReference(this);
        getWindow().addFlags(128);
        if (this.X) {
            androidx.appcompat.app.b supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o();
            }
            getWindow().setFlags(134217728, 134217728);
            getWindow().addFlags(67108864);
            setLightNavigationbarIcon();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyEdgeToEdgeHideStrategyForNewInteraction", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            android.view.ViewGroup viewGroup = this.mWrappingFrame;
            if (viewGroup instanceof com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) {
                com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout edgeToEdgeWrapperLayout = (com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) viewGroup;
                edgeToEdgeWrapperLayout.setStatusBarStrategy(al5.r.f6004d);
                edgeToEdgeWrapperLayout.setNavigationBarStrategy(al5.q.f5988d);
                edgeToEdgeWrapperLayout.M();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyEdgeToEdgeHideStrategyForNewInteraction", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyEdgeToEdgeHideStrategyForNewInteraction", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            }
        }
        if (this.X) {
            int color = getContext().getResources().getColor(com.tencent.mm.R.color.a9e);
            setActionbarColor(color);
            setNavigationbarColor(color);
        } else {
            setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478861j7));
            setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478861j7));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initReporter", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        java.lang.String stringExtra = getIntent().getStringExtra("INTENT_ALBUM_COMMENT_SESSION_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.plugin.sns.statistics.n nVar = this.Z;
        nVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAlbumSessionId", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
        nVar.f164908a = stringExtra;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAlbumSessionId", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
        if (getIntent().getBooleanExtra("INTENT_STAR_LIST", false)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAlbumScene", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
            nVar.f164909b = 9;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAlbumScene", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
        } else if (this.X) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAlbumScene", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
            nVar.f164909b = 3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAlbumScene", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initReporter", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        initView();
        if (this.B) {
            java.util.ArrayList arrayList = ta4.h1.f416750a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("galleryPageStart", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
            ta4.h1.f416759j = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("galleryPageStart", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        } else {
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("galleryPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            s0Var.A = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("galleryPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        getWindow().clearFlags(128);
        si0.w0.f408206a = null;
        com.tencent.mm.plugin.sns.model.l4.hj().N(this);
        super.onDestroy();
        if (this.B) {
            java.util.ArrayList arrayList = ta4.h1.f416750a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("galleryPageStop", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
            if (ta4.h1.f416759j != 0) {
                ta4.h1.f416760k += java.lang.System.currentTimeMillis() - ta4.h1.f416759j;
                ta4.h1.f416759j = 0L;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("galleryPageStop", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        } else {
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("galleryPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            if (s0Var.A != 0) {
                s0Var.B += java.lang.System.currentTimeMillis() - s0Var.A;
                s0Var.A = 0L;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("galleryPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        com.tencent.mm.plugin.sns.statistics.s0 s0Var2 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var2.s();
        s0Var2.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        super.onPause();
        qp1.h0.b();
        this.Z.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        super.onResume();
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            r45.jj4 cntMedia = snsInfoFlip.getCntMedia();
            this.f166810o.c0(cntMedia != null && cntMedia.f377856e == 6);
        }
        qp1.h0.a(true, true, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        android.os.Bundle bundle = this.f167154p1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        android.graphics.Rect rect = (android.graphics.Rect) getIntent().getParcelableExtra("sns_gallery_thumb_location");
        this.f167157y0 = rect;
        if (rect == null) {
            this.f167157y0 = new android.graphics.Rect();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        } else {
            this.f167155x0.e(rect.left, rect.top, rect.width(), this.f167157y0.height());
            if (bundle == null) {
                this.f166810o.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.sns.ui.li(this));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        super.onStart();
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        super.onStop();
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.s();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void s3(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        if (this.f166810o != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && i17 != 3) {
                this.f166810o.i0(str);
            }
            if (z17) {
                this.f166810o.c0(true);
            } else {
                this.f166810o.W();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    public void w7(com.tencent.mm.plugin.sns.ui.c3 c3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addMediaChangeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMediaChangeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        } else {
            snsInfoFlip.e(c3Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMediaChangeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
    }

    public final int x7(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int position = this.f166810o.getPosition();
        int size = snsInfo.getTimeLine().ContentObj.f369840h.size();
        int i17 = (size <= 1 || position <= 1 || position > size) ? 0 : position - 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return i17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void y1(java.lang.String str, int i17) {
        java.lang.String str2;
        java.lang.String str3;
        int i18;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        super.y1(str, i17);
        this.A1 = 0;
        this.B1 = 0;
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        if (k17 != null) {
            if (this.B) {
                java.util.ArrayList arrayList = ta4.h1.f416750a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("browseGalleryFeed", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
                java.lang.String s07 = ca4.z0.s0(k17.field_snsId);
                java.util.ArrayList arrayList2 = ta4.h1.f416753d;
                if (!arrayList2.contains(s07)) {
                    arrayList2.add(s07);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("browseGalleryFeed", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("browseGalleryMedia", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
                java.lang.String str4 = ca4.z0.s0(k17.field_snsId) + '_' + i17;
                java.util.ArrayList arrayList3 = ta4.h1.f416754e;
                if (!arrayList3.contains(str4)) {
                    arrayList3.add(str4);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("browseGalleryMedia", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
            } else {
                com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                s0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("browseGalleryFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                java.lang.String s08 = ca4.z0.s0(k17.field_snsId);
                java.util.ArrayList arrayList4 = (java.util.ArrayList) s0Var.f164968u;
                if (!arrayList4.contains(s08)) {
                    arrayList4.add(s08);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("browseGalleryFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("browseGalleryMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                java.lang.String str5 = ca4.z0.s0(k17.field_snsId) + "_" + i17;
                java.util.ArrayList arrayList5 = (java.util.ArrayList) s0Var.f164969v;
                if (!arrayList5.contains(str5)) {
                    arrayList5.add(str5);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("browseGalleryMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            }
            if (i17 != this.S) {
                this.W = false;
            }
            com.tencent.mm.plugin.sns.statistics.n nVar = this.Z;
            boolean z17 = this.W;
            nVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportFeedGalleryExp", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
            java.lang.String s09 = ca4.z0.s0(k17.field_snsId);
            if (kotlin.jvm.internal.o.b(s09, nVar.f164912e)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportFeedGalleryExp", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
                str3 = "onSelectedId";
                i18 = 2;
            } else {
                kotlin.jvm.internal.o.d(s09);
                nVar.f164912e = s09;
                nVar.a();
                com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(k17.field_attrBuf);
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
                com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) parseFrom;
                jz5.l[] lVarArr = new jz5.l[5];
                str3 = "onSelectedId";
                lVarArr[0] = new jz5.l("snsalbumsid", nVar.f164908a);
                lVarArr[1] = new jz5.l("view_method", java.lang.Integer.valueOf(z17 ? 1 : 2));
                i18 = 2;
                lVarArr[2] = new jz5.l("sns_feed_id", s09);
                lVarArr[3] = new jz5.l("is_pin_feed", java.lang.Integer.valueOf(snsObject.InTopList));
                lVarArr[4] = new jz5.l("sns_page_scene", java.lang.Integer.valueOf(nVar.f164909b));
                java.util.HashMap i19 = kz5.c1.i(lVarArr);
                nVar.f164910c = i19;
                nVar.f164911d = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportViewEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                java.util.Objects.toString(ri.l0.a(i19));
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.statistics.v("sns_image_detail", "view_exp", i19));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportViewEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportFeedGalleryExp", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
            }
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = k17.getTimeLine();
            if (timeLine != null && (a90Var = timeLine.ContentObj) != null && !com.tencent.mm.sdk.platformtools.t8.L0(a90Var.f369840h)) {
                com.tencent.mm.plugin.sns.statistics.s0 s0Var2 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                s0Var2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastSnsAlbumFeedBehaviourStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct snsAlbumFeedBehaviourStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct) s0Var2.E.peekLast();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastSnsAlbumFeedBehaviourStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                int i27 = this.B ? i18 : 1;
                if (this.C == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryUI", "sessionId is null");
                    this.C = "";
                }
                if (snsAlbumFeedBehaviourStruct == null) {
                    com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct F = s0Var2.F(i27, this.C);
                    F.f60450j = 1L;
                    F.f60446f = F.b("FeedId", ca4.z0.s0(k17.field_snsId), true);
                    F.f60444d = F.b("ToUsername", s0Var2.y().f60771d, true);
                    F.f60445e = s0Var2.y().f60772e;
                    r45.a90 a90Var2 = timeLine.ContentObj;
                    F.f60447g = a90Var2.f369837e;
                    F.f60449i = a90Var2.f369840h.size();
                    s0Var2.r();
                } else if (!com.tencent.mm.sdk.platformtools.t8.D0(ca4.z0.s0(k17.field_snsId), snsAlbumFeedBehaviourStruct.f60446f)) {
                    s0Var2.h();
                    com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct F2 = s0Var2.F(i27, this.C);
                    F2.f60450j = 0L;
                    F2.f60446f = F2.b("FeedId", ca4.z0.s0(k17.field_snsId), true);
                    F2.f60444d = F2.b("ToUsername", s0Var2.y().f60771d, true);
                    F2.f60445e = s0Var2.y().f60772e;
                    r45.a90 a90Var3 = timeLine.ContentObj;
                    F2.f60447g = a90Var3.f369837e;
                    F2.f60449i = a90Var3.f369840h.size();
                    s0Var2.r();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("feedBrowseGalleryMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                java.lang.String str6 = ca4.z0.s0(k17.field_snsId) + "_" + i17;
                java.util.ArrayList arrayList6 = (java.util.ArrayList) s0Var2.G;
                if (!arrayList6.contains(str6)) {
                    arrayList6.add(str6);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedBrowseGalleryMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            }
            str2 = str3;
        } else {
            str2 = "onSelectedId";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    public void y7(com.tencent.mm.plugin.sns.ui.c3 c3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeMediaChangeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeMediaChangeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        } else {
            snsInfoFlip.v(c3Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeMediaChangeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void z7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        android.graphics.Rect rect = this.f167157y0;
        if (rect == null || rect.isEmpty()) {
            finish();
            overridePendingTransition(0, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return;
        }
        this.f167156x1 = this.f166810o.getWidth();
        this.f167158y1 = this.f166810o.getHeight();
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.S();
        }
        java.lang.String l17 = com.tencent.mm.plugin.sns.model.i1.l(this.f166810o.getCntMedia());
        if (l17 != null) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            arrayList.add(l17);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsGalleryUI", "runExitAnimation", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/plugin/sns/ui/SnsGalleryUI", "runExitAnimation", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            int i17 = options.outWidth;
            if (i17 > 0) {
                int i18 = (int) ((this.f167156x1 / i17) * options.outHeight);
                this.f167158y1 = i18;
                if (i18 > this.f166810o.getHeight()) {
                    if (this.f167158y1 < this.f166810o.getHeight() * 2.5d) {
                        this.F1 = this.f167158y1 - this.f166810o.getHeight();
                        if (this.Y) {
                            int height = (this.f166810o.getHeight() * this.f167157y0.height()) / this.f167158y1;
                            android.graphics.Rect rect2 = this.f167157y0;
                            rect2.bottom = rect2.top + height;
                            this.F1 = 0;
                        }
                    }
                    this.f167158y1 = this.f166810o.getHeight();
                }
            }
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.f167155x0;
        int i19 = this.f167156x1;
        int i27 = this.f167158y1;
        s4Var.f210699f = i19;
        s4Var.f210700g = i27;
        android.graphics.Rect rect3 = this.f167157y0;
        s4Var.e(rect3.left, rect3.top, rect3.width(), this.f167157y0.height());
        android.view.View currentImageView = this.f166810o.getCurrentImageView();
        com.tencent.mm.ui.base.MMViewPager gallery = this.f166810o.getGallery();
        android.view.View selectedView = gallery.getSelectedView();
        r45.jj4 cntMedia = this.f166810o.getCntMedia();
        boolean z17 = cntMedia != null && cntMedia.f377856e == 6;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryUI", "runExitAnimation: isVideoType=%b, current=%s, curView=%s", java.lang.Boolean.valueOf(z17), currentImageView, selectedView);
        if (this.D1 == 0 || this.E1 == 0) {
            this.D1 = this.f166810o.getWidth();
            this.E1 = this.f166810o.getHeight();
        }
        float width = (this.f167157y0.width() * 1.0f) / gallery.getWidth();
        if (z17) {
            this.f167157y0.width();
            gallery.getWidth();
        }
        if (z17) {
            this.f167157y0.height();
            gallery.getHeight();
        }
        float f17 = 1.0f - width;
        int height2 = (int) ((this.f167157y0.top - ((gallery.getHeight() * f17) / 2.0f)) - (((gallery.getHeight() - gallery.getWidth()) * width) / 2.0f));
        int width2 = (int) (this.f167157y0.left - ((gallery.getWidth() * f17) / 2.0f));
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryUI", "runExitAnimation useNewInteraction:%b zoomScale:%f rect:%s gallery width:%d height:%d topOffset:%d leftOffset:%d screenWidth:%d screenHeight:%d", java.lang.Boolean.valueOf(this.X), java.lang.Float.valueOf(width), this.f167157y0, java.lang.Integer.valueOf(gallery.getWidth()), java.lang.Integer.valueOf(gallery.getHeight()), java.lang.Integer.valueOf(height2), java.lang.Integer.valueOf(width2), java.lang.Integer.valueOf(this.D1), java.lang.Integer.valueOf(this.E1));
        if (this.X && !this.Y && (currentImageView instanceof db5.f0)) {
            ((db5.f0) currentImageView).setAnimationScale(width);
        } else if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryUI", "runExitAnimation: video type, skip setAnimationScale");
        } else {
            float f18 = this.f167159z1;
            if (f18 != 1.0f) {
                this.f167155x0.f210707n = 1.0f / f18;
                if (this.A1 != 0 || this.B1 != 0) {
                    int width3 = ((int) ((this.f166810o.getWidth() / 2) * (1.0f - this.f167159z1))) + this.A1;
                    int height3 = (int) (((this.f166810o.getHeight() / 2) + this.B1) - ((this.f167158y1 / 2) * this.f167159z1));
                    com.tencent.mm.ui.tools.s4 s4Var2 = this.f167155x0;
                    s4Var2.f210708o = width3;
                    s4Var2.f210709p = height3;
                }
            }
        }
        com.tencent.mm.ui.tools.s4 s4Var3 = this.f167155x0;
        s4Var3.f210711r = this.F1;
        s4Var3.d(selectedView, this.f167152l1, !this.Y, new com.tencent.mm.plugin.sns.ui.ni(this, currentImageView, selectedView, width2, height2, width, z17), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }
}
