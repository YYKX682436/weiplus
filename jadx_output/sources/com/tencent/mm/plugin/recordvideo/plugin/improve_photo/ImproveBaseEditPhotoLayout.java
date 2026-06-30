package com.tencent.mm.plugin.recordvideo.plugin.improve_photo;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005R\u001b\u0010\f\u001a\u00020\u00078DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveBaseEditPhotoLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/AutoRegisterLifeCyclePluginLayout;", "", "Ldu3/e;", "getFuncButtonOrder", "", "getLayoutId", "Lhk0/u0;", "m", "Ljz5/g;", "getStateModel", "()Lhk0/u0;", "stateModel", "Ldu3/t3;", "q", "Ldu3/t3;", "getPreviewPlugin", "()Ldu3/t3;", "previewPlugin", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "u", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "getConfigProvider", "()Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "setConfigProvider", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "configProvider", "", org.chromium.base.BaseSwitches.V, "F", "getCropRectRatio", "()F", "setCropRectRatio", "(F)V", "cropRectRatio", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class ImproveBaseEditPhotoLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.AutoRegisterLifeCyclePluginLayout {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g stateModel;

    /* renamed from: n, reason: collision with root package name */
    public final du3.g2 f155755n;

    /* renamed from: o, reason: collision with root package name */
    public final du3.i1 f155756o;

    /* renamed from: p, reason: collision with root package name */
    public final du3.b0 f155757p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final du3.t3 previewPlugin;

    /* renamed from: r, reason: collision with root package name */
    public final yt3.i f155759r;

    /* renamed from: s, reason: collision with root package name */
    public final du3.m f155760s;

    /* renamed from: t, reason: collision with root package name */
    public it3.y f155761t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public float cropRectRatio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveBaseEditPhotoLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.stateModel = jz5.h.b(new du3.f(context, this));
        this.f155755n = new du3.g2(this, this);
        new du3.s2(this, this);
        new du3.h4(this, this);
        new du3.j0(this, this);
        this.f155756o = new du3.i1(this, this);
        new du3.t0(this, this);
        this.f155757p = new du3.b0(this, this);
        this.previewPlugin = new du3.t3(this, this);
        this.cropRectRatio = -1.0f;
        android.view.View.inflate(context, getLayoutId(), this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.pvn);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        yt3.i iVar = new yt3.i(this, (android.widget.ImageView) findViewById, this);
        hk0.u0 stateModel = getStateModel();
        kotlin.jvm.internal.o.g(stateModel, "stateModel");
        iVar.f465488h = stateModel;
        this.f155759r = iVar;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.pxb);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f155760s = new du3.m(this, this, (com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView) findViewById2);
    }

    public final com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider getConfigProvider() {
        return this.configProvider;
    }

    public final float getCropRectRatio() {
        return this.cropRectRatio;
    }

    public java.util.List<du3.e> getFuncButtonOrder() {
        return null;
    }

    public final int getLayoutId() {
        return com.tencent.mm.R.layout.dcq;
    }

    public final du3.t3 getPreviewPlugin() {
        return this.previewPlugin;
    }

    public final hk0.u0 getStateModel() {
        return (hk0.u0) ((jz5.n) this.stateModel).getValue();
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.AutoRegisterLifeCyclePluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        this.f155761t = navigator;
        this.configProvider = configProvider;
        dw3.c0.f244182a.b(configProvider);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.configProvider;
        boolean z17 = (recordConfigProvider == null || (bundle2 = recordConfigProvider.M) == null) ? false : bundle2.getBoolean("key_edit_enable_emoji_search", false);
        ((th0.a0) ((sh0.e) i95.n0.c(sh0.e.class))).getClass();
        boolean z18 = org.xwalk.core.XWalkEnvironment.d() > 0;
        if (z17 && z18) {
            this.f155759r.z();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "checkShowEmojiSearch: needShow=[" + z17 + "], isXWebKernelAvailable:[" + z18 + ']');
        java.util.List<du3.e> funcButtonOrder = getFuncButtonOrder();
        if (funcButtonOrder == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveBaseEditPhotoLayout", "reOrderFunButtonsIfNeeded: skip.");
        } else {
            du3.g2 g2Var = this.f155755n;
            g2Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reorderFuncButtons: order=");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(funcButtonOrder, 10));
            java.util.Iterator<T> it = funcButtonOrder.iterator();
            while (it.hasNext()) {
                arrayList.add(((du3.e) it.next()).name());
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoFuncPlugin", sb6.toString());
            du3.e eVar = du3.e.f243562d;
            java.lang.Object value = ((jz5.n) g2Var.f243590i).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            jz5.l lVar = new jz5.l(eVar, (com.tencent.mm.ui.widget.imageview.WeImageView) value);
            du3.e eVar2 = du3.e.f243563e;
            java.lang.Object value2 = ((jz5.n) g2Var.f243591m).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            jz5.l lVar2 = new jz5.l(eVar2, (com.tencent.mm.ui.widget.imageview.WeImageView) value2);
            du3.e eVar3 = du3.e.f243564f;
            java.lang.Object value3 = ((jz5.n) g2Var.f243592n).getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            jz5.l lVar3 = new jz5.l(eVar3, (com.tencent.mm.ui.widget.imageview.WeImageView) value3);
            du3.e eVar4 = du3.e.f243565g;
            java.lang.Object value4 = ((jz5.n) g2Var.f243593o).getValue();
            kotlin.jvm.internal.o.f(value4, "getValue(...)");
            jz5.l lVar4 = new jz5.l(eVar4, (com.tencent.mm.ui.widget.imageview.WeImageView) value4);
            du3.e eVar5 = du3.e.f243566h;
            java.lang.Object value5 = ((jz5.n) g2Var.f243594p).getValue();
            kotlin.jvm.internal.o.f(value5, "getValue(...)");
            java.util.Map k17 = kz5.c1.k(lVar, lVar2, lVar3, lVar4, new jz5.l(eVar5, (com.tencent.mm.ui.widget.imageview.WeImageView) value5), new jz5.l(du3.e.f243567i, g2Var.A()));
            int h17 = i65.a.h(g2Var.f243587f.getContext(), com.tencent.mm.R.dimen.f479693cs);
            int i17 = 0;
            for (java.lang.Object obj : funcButtonOrder) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.view.View view = (com.tencent.mm.ui.widget.imageview.WeImageView) k17.get((du3.e) obj);
                if (view != null) {
                    jz5.g gVar = g2Var.f243589h;
                    java.lang.Object value6 = ((jz5.n) gVar).getValue();
                    kotlin.jvm.internal.o.f(value6, "getValue(...)");
                    ((android.widget.LinearLayout) value6).removeView(view);
                    android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.setMarginStart(i17 == 0 ? 0 : h17);
                    view.setLayoutParams(layoutParams2);
                    java.lang.Object value7 = ((jz5.n) gVar).getValue();
                    kotlin.jvm.internal.o.f(value7, "getValue(...)");
                    ((android.widget.LinearLayout) value7).addView(view);
                }
                i17 = i18;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("reorderFuncButtons: order=");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(funcButtonOrder, 10));
            java.util.Iterator<T> it6 = funcButtonOrder.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((du3.e) it6.next()).name());
            }
            sb7.append(arrayList2);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoFuncPlugin", sb7.toString());
        }
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.configProvider;
        boolean z19 = (recordConfigProvider2 == null || (bundle = recordConfigProvider2.M) == null) ? true : bundle.getBoolean("key_edit_enable_crop_rotate", true);
        du3.i1 i1Var = this.f155756o;
        i1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoCropPlugin", "setRotateEnable >> " + z19);
        jz5.g gVar2 = i1Var.f243620h;
        java.lang.Object value8 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value8, "getValue(...)");
        ((android.view.View) value8).setEnabled(z19);
        java.lang.Object value9 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value9, "getValue(...)");
        android.view.View view2 = (android.view.View) value9;
        int i19 = z19 ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin", "setRotateEnable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin", "setRotateEnable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onAttach() {
        super.onAttach();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveBaseEditPhotoLayout", "onAttach");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public boolean onBackPress() {
        if (super.onBackPress()) {
            return true;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 124L, 1L, false);
        this.previewPlugin.H();
        nu3.i iVar = nu3.i.f340218a;
        iVar.n("KEY_AFTER_EDIT_INT", 0);
        iVar.h();
        it3.y yVar = this.f155761t;
        if (yVar == null) {
            return true;
        }
        it3.y.a(yVar, 0, null, 2, null);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r4.f281783b == true) goto L12;
     */
    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDetach() {
        /*
            r6 = this;
            hk0.u0 r0 = r6.getStateModel()
            r0.getClass()
            java.lang.String r1 = "MicroMsg.ImproveEditPhotoStateModel"
            java.lang.String r2 = "reset"
            com.tencent.mars.xlog.Log.i(r1, r2)
            hk0.o r1 = r0.f281821o
            r2 = 0
            if (r1 == 0) goto L3c
            java.util.HashMap r3 = r0.f281814e
            int r1 = r1.f281782a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r3.get(r4)
            androidx.lifecycle.j0 r3 = (androidx.lifecycle.j0) r3
            if (r3 == 0) goto L31
            java.lang.Object r4 = r3.getValue()
            hk0.o r4 = (hk0.o) r4
            if (r4 == 0) goto L31
            boolean r4 = r4.f281783b
            r5 = 1
            if (r4 != r5) goto L31
            goto L32
        L31:
            r5 = r2
        L32:
            if (r5 == 0) goto L3c
            hk0.o r4 = new hk0.o
            r4.<init>(r1, r2)
            r3.postValue(r4)
        L3c:
            r0.W6()
            androidx.lifecycle.j0 r1 = new androidx.lifecycle.j0
            r1.<init>()
            r0.f281816g = r1
            androidx.lifecycle.j0 r1 = new androidx.lifecycle.j0
            r1.<init>()
            r0.f281817h = r1
            hk0.z r1 = new hk0.z
            r1.<init>()
            r0.f281818i = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            kotlinx.coroutines.flow.j2 r1 = kotlinx.coroutines.flow.i3.a(r1)
            r0.f281819m = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            kotlinx.coroutines.flow.j2 r1 = kotlinx.coroutines.flow.i3.a(r1)
            r0.f281820n = r1
            r1 = 0
            r0.f281821o = r1
            r0.f281825s = r2
            r0.f281826t = r2
            r0.f281823q = r2
            r0.f281824r = r2
            super.onDetach()
            java.lang.String r0 = "MicroMsg.ImproveBaseEditPhotoLayout"
            java.lang.String r1 = "onDetach"
            com.tencent.mars.xlog.Log.i(r0, r1)
            dx1.f r0 = dx1.g.f244489a
            long r1 = r6.getBrowserTimeMs()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            bx1.u r2 = bx1.u.f36310e
            java.lang.String r3 = "SnsPublishProcess"
            java.lang.String r4 = "mediaEditPageStaytime_"
            r0.j(r3, r4, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout.onDetach():void");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo;
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo2;
        l45.q qVar;
        android.os.Bundle bundle;
        super.r(bVar);
        nu3.m mVar = nu3.m.f340229a;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.configProvider;
        int i17 = -1;
        if (recordConfigProvider != null && (bundle = recordConfigProvider.M) != null) {
            i17 = bundle.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", -1);
        }
        mVar.u(i17);
        if (bVar != null) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.configProvider;
            kotlin.jvm.internal.o.d(recordConfigProvider2);
            du3.t3 t3Var = this.previewPlugin;
            t3Var.getClass();
            t3Var.f243724n = recordConfigProvider2;
            t3Var.f243725o = bVar;
            t3Var.F(bVar.f222213j, false);
            float f17 = this.cropRectRatio;
            if (f17 > 0.0f && (qVar = t3Var.f243726p) != null) {
                ((l45.n) qVar).f316468i = f17;
            }
            nu3.i iVar = nu3.i.f340218a;
            iVar.n("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            iVar.n("KEY_EDIT_PUBLISHID_INT", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            iVar.n("KEY_MEDIA_TYPE_INT", 1);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = this.configProvider;
            java.lang.String str = (recordConfigProvider3 == null || (videoCaptureReportInfo2 = recordConfigProvider3.I) == null) ? null : videoCaptureReportInfo2.f155701r;
            if (str == null) {
                str = "";
            }
            iVar.n("KEY_CHAT_USERNAME", str);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = this.configProvider;
            iVar.n("KEY_ROOM_SIZE", java.lang.Integer.valueOf((recordConfigProvider4 == null || (videoCaptureReportInfo = recordConfigProvider4.I) == null) ? 0 : videoCaptureReportInfo.f155702s));
            iVar.n("KEY_EDIT_SESSION_ID", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            java.lang.String str2 = nu3.f.f340213d;
            java.lang.String str3 = str2.length() > 0 ? str2 : null;
            if (str3 != null) {
                iVar.n("KEY_CAMERA_ENTER_SESSION_ID", str3);
            }
            if (bVar.f222206c) {
                return;
            }
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider5 = this.configProvider;
            if ((recordConfigProvider5 != null ? recordConfigProvider5.F : 0) > 0) {
                iVar.n("KEY_MEDIA_SOURCE_INT", 0);
            }
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.AutoRegisterLifeCyclePluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.AutoRegisterPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void release() {
        super.release();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveBaseEditPhotoLayout", "release");
        hk0.u0 stateModel = getStateModel();
        stateModel.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "release");
        kotlinx.coroutines.z0.e(stateModel.f281822p, null, 1, null);
    }

    public final void setConfigProvider(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        this.configProvider = recordConfigProvider;
    }

    public final void setCropRectRatio(float f17) {
        this.cropRectRatio = f17;
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 32) {
            nu3.m.f340229a.i(2, 3L);
            onBackPress();
            return;
        }
        if (ordinal == 45) {
            if (bundle != null) {
                java.lang.CharSequence charSequence = bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                int i17 = bundle.getInt("PARAM_EDIT_TEXT_COLOR");
                int i18 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
                du3.m mVar = this.f155760s;
                mVar.getClass();
                int i19 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAddTextPlugin", "editText >> " + ((java.lang.Object) charSequence) + ", " + i17 + ", " + i18 + " ", null);
                mVar.f243652h = true;
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = mVar.f243651g;
                editorInputView.mode = 0;
                editorInputView.setShow(true);
                editorInputView.setTypeFace("");
                editorInputView.e(charSequence, i17, i18);
                return;
            }
            return;
        }
        du3.t3 t3Var = this.previewPlugin;
        switch (ordinal) {
            case 92:
                if (bundle != null) {
                    java.lang.String string = bundle.getString("PARAM_1_STRING");
                    if (com.tencent.mm.vfs.w6.j(string)) {
                        kotlin.jvm.internal.o.d(string);
                        t3Var.F(string, true);
                        return;
                    }
                    return;
                }
                return;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_PAUSE /* 93 */:
                if (bundle != null) {
                    java.lang.String string2 = bundle.getString("PARAM_1_STRING");
                    if (com.tencent.mm.vfs.w6.j(string2)) {
                        this.f155757p.B(string2);
                        return;
                    }
                    return;
                }
                return;
            case 94:
                du3.g gVar = new du3.g(this);
                t3Var.getClass();
                qk.o9 o9Var = t3Var.f243729s;
                if (o9Var != null) {
                    du3.s3 s3Var = new du3.s3(gVar, t3Var);
                    l45.n nVar = (l45.n) ((rj.l) o9Var).f396139b.getPresenter();
                    nVar.getClass();
                    s75.d.b(new l45.l(nVar, s3Var, false, false, true), "onFinalGenerate_" + s3Var.hashCode());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
