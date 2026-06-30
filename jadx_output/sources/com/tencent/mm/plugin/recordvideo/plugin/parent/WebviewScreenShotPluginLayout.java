package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\b\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00064"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/WebviewScreenShotPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lju3/d0;", "Lyt3/j2;", "", "getLayoutId", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "i", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "getConfigProvider", "()Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "setConfigProvider", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "configProvider", "Lct0/b;", "m", "Lct0/b;", "getCaptureInfo", "()Lct0/b;", "setCaptureInfo", "(Lct0/b;)V", "captureInfo", "Lyt3/q2;", "n", "Lyt3/q2;", "getEditCropPhotoPlugin", "()Lyt3/q2;", "editCropPhotoPlugin", "Lyt3/b2;", "o", "Lyt3/b2;", "getEditPhotoWrapper", "()Lyt3/b2;", "editPhotoWrapper", "Lyt3/p1;", "p", "Lyt3/p1;", "getBackToRecordPlugin", "()Lyt3/p1;", "backToRecordPlugin", "Lyt3/f2;", "q", "Lyt3/f2;", "getPhotoControlUI", "()Lyt3/f2;", "photoControlUI", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class WebviewScreenShotPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout implements ju3.d0, yt3.j2 {

    /* renamed from: h, reason: collision with root package name */
    public it3.y f155849h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public ct0.b captureInfo;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final yt3.q2 editCropPhotoPlugin;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final yt3.b2 editPhotoWrapper;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final yt3.p1 backToRecordPlugin;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final yt3.f2 photoControlUI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebviewScreenShotPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View.inflate(context, getLayoutId(), this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.bet);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        new yt3.t((com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView) findViewById, this);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.d7v);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        yt3.p1 p1Var = new yt3.p1((android.widget.ImageView) findViewById2, this);
        this.backToRecordPlugin = p1Var;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.d7y);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        yt3.q2 q2Var = new yt3.q2((android.view.ViewGroup) findViewById3, this, this);
        this.editCropPhotoPlugin = q2Var;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.kva);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        yt3.b2 b2Var = new yt3.b2((android.widget.FrameLayout) findViewById4, this);
        this.editPhotoWrapper = b2Var;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.cia);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        yt3.f2 f2Var = new yt3.f2((android.view.ViewGroup) findViewById5, this);
        this.photoControlUI = f2Var;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.mqh);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoShadowPlugin", "status bar : " + com.tencent.mm.ui.bl.c(findViewById6.getContext()));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, findViewById6.getLayoutParams().height + com.tencent.mm.ui.bl.c(findViewById6.getContext()));
        layoutParams.addRule(12, -1);
        findViewById6.setLayoutParams(layoutParams);
        findViewById6.invalidate();
        getPluginList().add(f2Var);
        getPluginList().add(q2Var);
        getPluginList().add(b2Var);
        getPluginList().add(p1Var);
    }

    public final yt3.p1 getBackToRecordPlugin() {
        return this.backToRecordPlugin;
    }

    public final ct0.b getCaptureInfo() {
        return this.captureInfo;
    }

    public final com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider getConfigProvider() {
        return this.configProvider;
    }

    public final yt3.q2 getEditCropPhotoPlugin() {
        return this.editCropPhotoPlugin;
    }

    public final yt3.b2 getEditPhotoWrapper() {
        return this.editPhotoWrapper;
    }

    public int getLayoutId() {
        return com.tencent.mm.R.layout.dxt;
    }

    public final yt3.f2 getPhotoControlUI() {
        return this.photoControlUI;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(it3.y r18, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r19) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout.m(it3.y, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "onActivityResult requestCode:" + i17 + " resultCode:" + i18);
        if (i17 == 4 && i18 == -1 && intent != null) {
            qk.o9 o9Var = this.editPhotoWrapper.f465360i;
            java.lang.String str = null;
            qk.v7 b17 = o9Var != null ? o9Var.b() : null;
            kotlin.jvm.internal.o.d(b17);
            if (((f65.r) b17).g()) {
                str = (java.lang.String) ((jz5.n) this.editPhotoWrapper.f465359h).getValue();
            } else {
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.configProvider;
                if (recordConfigProvider != null) {
                    str = recordConfigProvider.D;
                }
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "select " + stringExtra + " for sending imagePath: " + str);
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            k70.i0 i0Var = new k70.i0();
            i0Var.f304642a = 4;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String r17 = c01.z1.r();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            r70.g gVar = new r70.g(str2, 0, r17 == null ? "" : r17, stringExtra == null ? "" : stringExtra, i0Var);
            gVar.f393108j = "webview_screen_shot_send_img";
            ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
            ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, stringExtra);
            ((ku5.t0) ku5.t0.f312615d).B(new ju3.r2(this));
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public boolean onBackPress() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "report onBackPress");
        com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct webviewFullSnapshotActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct();
        webviewFullSnapshotActionReportStruct.f62947e = 6L;
        webviewFullSnapshotActionReportStruct.f62949g = 1L;
        yt3.b2 b2Var = this.editPhotoWrapper;
        qk.o9 o9Var = b2Var.f465360i;
        qk.v7 b17 = o9Var != null ? o9Var.b() : null;
        kotlin.jvm.internal.o.d(b17);
        webviewFullSnapshotActionReportStruct.f62948f = (((f65.r) b17).g() && b2Var.b()) ? 1L : 0L;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.configProvider;
        webviewFullSnapshotActionReportStruct.p(recordConfigProvider != null ? recordConfigProvider.W : null);
        webviewFullSnapshotActionReportStruct.k();
        if (super.onBackPress()) {
            return true;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 124L, 1L, false);
        nu3.i iVar = nu3.i.f340218a;
        iVar.n("KEY_AFTER_EDIT_INT", 0);
        iVar.h();
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context context = getContext();
        ju3.t2 t2Var = new ju3.t2(this);
        ((yb0.g) b0Var).getClass();
        com.tencent.mm.platformtools.ExportFileUtil.l(context, t2Var);
        it3.y yVar = this.f155849h;
        if (yVar == null) {
            return true;
        }
        it3.y.a(yVar, 0, null, 2, null);
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onDetach() {
        super.onDetach();
        dx1.g.f244489a.j("SnsPublishProcess", "mediaEditPageStaytime_", java.lang.Long.valueOf(getBrowserTimeMs()), bx1.u.f36310e);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        qk.o9 o9Var;
        android.os.Bundle bundle;
        float[] floatArray;
        bn5.f baseBoardView;
        boolean z17;
        android.os.Bundle bundle2;
        super.r(bVar);
        nu3.m mVar = nu3.m.f340229a;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.configProvider;
        mVar.u((recordConfigProvider == null || (bundle2 = recordConfigProvider.M) == null) ? -1 : bundle2.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", -1));
        if (bVar != null) {
            this.captureInfo = bVar;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.configProvider;
            kotlin.jvm.internal.o.d(recordConfigProvider2);
            yt3.b2 b2Var = this.editPhotoWrapper;
            b2Var.getClass();
            b2Var.f465361m = recordConfigProvider2;
            b2Var.f465362n = bVar;
            java.lang.String path = bVar.f222213j;
            kotlin.jvm.internal.o.g(path, "path");
            android.widget.FrameLayout frameLayout = b2Var.f465355d;
            frameLayout.setVisibility(0);
            ct0.b bVar2 = b2Var.f465362n;
            if (bVar2 != null && bVar2.f222216m) {
                java.lang.Object value = ((jz5.n) b2Var.f465358g).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                o9Var = (qk.o9) value;
            } else {
                java.lang.Object value2 = ((jz5.n) b2Var.f465357f).getValue();
                kotlin.jvm.internal.o.f(value2, "getValue(...)");
                o9Var = (qk.o9) value2;
            }
            b2Var.f465360i = o9Var;
            if (b2Var.f465364p == null) {
                b2Var.f465364p = java.lang.String.valueOf(java.lang.System.currentTimeMillis() + b2Var.hashCode());
            }
            com.tencent.mm.cache.ArtistCacheManager.a().g(path);
            qk.o9 o9Var2 = b2Var.f465360i;
            if (o9Var2 != null) {
                qk.l9 l9Var = new qk.l9();
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = b2Var.f465361m;
                if (!(recordConfigProvider3 != null && recordConfigProvider3.F == 291)) {
                    if (!(recordConfigProvider3 != null && recordConfigProvider3.F == 293)) {
                        if (!(recordConfigProvider3 != null && recordConfigProvider3.F == 294)) {
                            z17 = true;
                            l9Var.f364232b = z17;
                            l9Var.f364233c = false;
                            l9Var.f364236f = new android.graphics.Rect(frameLayout.getLeft(), frameLayout.getTop(), frameLayout.getRight(), frameLayout.getBottom());
                            l9Var.f364231a = qk.n9.PHOTO;
                            l9Var.f364238h = true;
                            l9Var.f364234d = path;
                            l9Var.f364242l = b2Var.f465369u;
                            l9Var.f364243m = b2Var.f465370v;
                            o9Var2.d(l9Var);
                        }
                    }
                }
                z17 = false;
                l9Var.f364232b = z17;
                l9Var.f364233c = false;
                l9Var.f364236f = new android.graphics.Rect(frameLayout.getLeft(), frameLayout.getTop(), frameLayout.getRight(), frameLayout.getBottom());
                l9Var.f364231a = qk.n9.PHOTO;
                l9Var.f364238h = true;
                l9Var.f364234d = path;
                l9Var.f364242l = b2Var.f465369u;
                l9Var.f364243m = b2Var.f465370v;
                o9Var2.d(l9Var);
            }
            qk.o9 o9Var3 = b2Var.f465360i;
            qk.s c17 = o9Var3 != null ? o9Var3.c(b2Var.f465366r) : null;
            kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
            b2Var.f465363o = (ym5.x2) c17;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = b2Var.f465361m;
            if (recordConfigProvider4 != null && (bundle = recordConfigProvider4.M) != null && (floatArray = bundle.getFloatArray("matrix")) != null) {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.setValues(floatArray);
                ym5.x2 x2Var = b2Var.f465363o;
                if (x2Var != null && (baseBoardView = x2Var.getBaseBoardView()) != null) {
                    baseBoardView.setForceMatrix(matrix);
                }
            }
            ym5.x2 x2Var2 = b2Var.f465363o;
            dn5.e eVar = x2Var2 != null ? (dn5.e) x2Var2.getBaseFooterView() : null;
            if (eVar != null) {
                eVar.setHideFooter(true);
            }
            ym5.x2 x2Var3 = b2Var.f465363o;
            kotlin.jvm.internal.o.e(x2Var3, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
            b2Var.f465365q = x2Var3.getPresenter();
            frameLayout.addView(b2Var.f465363o, new android.widget.FrameLayout.LayoutParams(-1, -1));
            ym5.x2 x2Var4 = b2Var.f465363o;
            if (x2Var4 != null) {
                x2Var4.setSelectedFeatureListener(new yt3.t1(b2Var));
            }
            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(path);
            if (n07 != null) {
                nu3.i iVar = nu3.i.f340218a;
                iVar.n("KEY_ORIGIN_MEDIA_WIDTH_INT", java.lang.Integer.valueOf(n07.outWidth));
                iVar.n("KEY_ORIGIN_MEDIA_HEIGHT_INT", java.lang.Integer.valueOf(n07.outHeight));
            }
            nu3.i iVar2 = nu3.i.f340218a;
            iVar2.n("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            iVar2.n("KEY_EDIT_PUBLISHID_INT", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            iVar2.n("KEY_MEDIA_TYPE_INT", 1);
            if (!bVar.f222206c) {
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider5 = this.configProvider;
                if ((recordConfigProvider5 != null ? recordConfigProvider5.F : 0) > 0) {
                    iVar2.n("KEY_MEDIA_SOURCE_INT", 0);
                }
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 119L, 1L, false);
        }
    }

    public final void setCaptureInfo(ct0.b bVar) {
        this.captureInfo = bVar;
    }

    public final void setConfigProvider(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        this.configProvider = recordConfigProvider;
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "status change to :" + status + " , param :" + bundle);
        int ordinal = status.ordinal();
        if (ordinal == 32) {
            nu3.m.f340229a.i(2, 3L);
            onBackPress();
            return;
        }
        yt3.f2 f2Var = this.photoControlUI;
        if (ordinal == 52) {
            f2Var.setVisibility(0);
            return;
        }
        qk.g6 g6Var = qk.g6.CROP_PHOTO;
        yt3.b2 b2Var = this.editPhotoWrapper;
        yt3.p1 p1Var = this.backToRecordPlugin;
        if (ordinal == 72) {
            p1Var.f465595f.setVisibility(4);
            f2Var.getClass();
            f2Var.f465446i = yt3.c2.f465389d;
            f2Var.f465443f.setVisibility(4);
            f2Var.f465444g.setVisibility(0);
            if (b2Var.f465368t == g6Var) {
                return;
            }
            b2Var.f465368t = g6Var;
            l45.q qVar = b2Var.f465365q;
            dl.t tVar = qVar != null ? (dl.t) ((l45.n) qVar).d(g6Var) : null;
            if (tVar != null) {
                tVar.f235122a0 = true;
            }
            l45.q qVar2 = b2Var.f465365q;
            if (qVar2 != null) {
                new l45.a((l45.n) qVar2).a(g6Var);
                return;
            }
            return;
        }
        qk.g6 g6Var2 = qk.g6.DEFAULT;
        if (ordinal == 85) {
            p1Var.f465595f.setVisibility(0);
            f2Var.getClass();
            f2Var.f465446i = yt3.c2.f465390e;
            f2Var.f465443f.setVisibility(0);
            f2Var.f465444g.setVisibility(4);
            b2Var.f465368t = g6Var2;
            l45.q qVar3 = b2Var.f465365q;
            if (qVar3 != null) {
                new l45.a((l45.n) qVar3).b(g6Var, 1, null);
                return;
            }
            return;
        }
        if (ordinal == 86) {
            p1Var.f465595f.setVisibility(0);
            b2Var.f465368t = g6Var2;
            l45.q qVar4 = b2Var.f465365q;
            if (qVar4 != null) {
                new l45.a((l45.n) qVar4).b(g6Var, 2, null);
                return;
            }
            return;
        }
        if (ordinal != 88) {
            if (ordinal != 89) {
                return;
            }
            p1Var.f465595f.setVisibility(0);
            f2Var.setVisibility(0);
            return;
        }
        b2Var.f465368t = g6Var;
        l45.q qVar5 = b2Var.f465365q;
        if (qVar5 != null) {
            new l45.a((l45.n) qVar5).b(g6Var, 3, null);
        }
    }
}
