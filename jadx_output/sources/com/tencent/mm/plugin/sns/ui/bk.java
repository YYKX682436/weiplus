package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class bk extends db5.p8 {

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f167917g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f167918h;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f167921n;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsInfoFlip f167925r;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f167919i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f167920m = new java.util.HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f167922o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final dd4.e0 f167923p = new dd4.e0();

    /* renamed from: q, reason: collision with root package name */
    public boolean f167924q = false;

    public bk(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip, android.content.Context context) {
        this.f167925r = snsInfoFlip;
        this.f167917g = context;
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip.E(snsInfoFlip).size();
        this.f167918h = ((iv.a) ((jv.e) i95.n0.c(jv.e.class))).Ai();
    }

    @Override // db5.p8
    public com.tencent.mm.ui.base.MultiTouchImageView c(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsGalleryAdapter", "position : %d getMultiTouchImageViewByPosition view is null.", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.jk jkVar = (com.tencent.mm.plugin.sns.ui.jk) e17.getTag();
        if (jkVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsGalleryAdapter", "position : %d getMultiTouchImageViewByPosition holder is null.", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        if (z17 && jkVar.f169517d.getVisibility() == 8) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = jkVar.f169517d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return multiTouchImageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.widget.FrameLayout, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.widget.FrameLayout, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.widget.FrameLayout, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.tencent.mm.plugin.sns.ui.bk] */
    /* JADX WARN: Type inference failed for: r6v15, types: [y51.c, y51.g] */
    @Override // db5.p8
    public java.lang.Object d(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        androidx.lifecycle.c1 a17;
        android.view.View view2;
        ?? frameLayout;
        androidx.lifecycle.c1 a18;
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView;
        android.content.res.Resources resources;
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2;
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView;
        java.lang.Object tag;
        int abs;
        android.view.View view3;
        android.view.View view4 = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        r45.jj4 jj4Var = m(i17).f380109d;
        if (jj4Var.f377856e != 6) {
            int i18 = 5;
            if (jj4Var.X == null) {
                android.view.View l17 = l(i17, view4, viewGroup, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return l17;
            }
            android.os.Vibrator vibrator = ca4.z0.f40068a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLocalLivePhoto", "com.tencent.mm.plugin.sns.data.SnsUtil");
            boolean startsWith = jj4Var.f377855d.startsWith("pre_temp_sns_live_photo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLocalLivePhoto", "com.tencent.mm.plugin.sns.data.SnsUtil");
            if (startsWith) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillViewMMLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(i17);
                objArr[1] = java.lang.Boolean.valueOf(view4 == null);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "fill fillView LivePhotoView %d convert view is null %b.", objArr);
                if (m(i17) == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryAdapter", "fill livePhoto view, but flip item is null.");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewMMLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                } else {
                    r45.jj4 jj4Var2 = m(i17).f380109d;
                    if (jj4Var2 != null) {
                        android.content.Context context = this.f167917g;
                        java.lang.String tips = i65.a.r(context, com.tencent.mm.R.string.f493232ok4);
                        kotlin.jvm.internal.o.g(tips, "tips");
                        a61.d dVar = new a61.d(true, null, true, false, true, tips, false, null, true, null);
                        long parseLong = java.lang.Long.parseLong(jj4Var2.f377855d.substring(23));
                        boolean j17 = com.tencent.mm.vfs.w6.j(jj4Var2.X.f377858g);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "fillViewMMLivePhotoView >> isParsed: %b, mediaId: %d，videoPath: %s", java.lang.Boolean.valueOf(j17), java.lang.Long.valueOf(parseLong), jj4Var2.X.f377858g);
                        ?? Ai = ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).Ai(new a61.a(dVar, new a61.c(1, jj4Var2.f377860i, java.lang.Boolean.valueOf(j17).booleanValue(), jj4Var2.X.f377858g, java.lang.Long.valueOf(parseLong), new com.tencent.mm.plugin.sns.ui.ck(this), null)), context);
                        Ai.setTagViewCallback(new com.tencent.mm.plugin.sns.ui.dk(this, jj4Var2));
                        Ai.setPlayCallback(new com.tencent.mm.plugin.sns.ui.ek(this, jj4Var2));
                        android.view.View view5 = (android.view.View) Ai;
                        view5.setTag(com.tencent.mm.R.id.s6v, java.lang.Integer.valueOf(i17));
                        ((y51.b) Ai).d();
                        if (view5.getParent() != null) {
                            ((android.view.ViewGroup) view5.getParent()).removeAllViews();
                        }
                        frameLayout = new android.widget.FrameLayout(context);
                        frameLayout.addView(view5, new android.widget.FrameLayout.LayoutParams(-1, -1));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewMMLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        return frameLayout;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryAdapter", "fill livePhotoView sight view, but media is null.");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewMMLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                }
                frameLayout = view4;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return frameLayout;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillViewLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = java.lang.Integer.valueOf(i17);
            objArr2[1] = java.lang.Boolean.valueOf(view4 == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "fill fillView LivePhotoView %d convert view is null %b.", objArr2);
            r45.m33 m17 = m(i17);
            if (m17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryAdapter", "fill livePhoto view, but flip item is null.");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                view2 = view4;
            } else {
                java.lang.String str = m17.f380110e;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryAdapter", "fill livePhotoView sight view, but sns local id is null.");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                    view2 = view4;
                } else {
                    r45.jj4 jj4Var3 = m(i17).f380109d;
                    if (jj4Var3 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryAdapter", "fill livePhotoView sight view, but media is null.");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        view2 = view4;
                    } else {
                        synchronized (jm0.k.f300270i) {
                            gm0.j1.b().c();
                            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                            }
                            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
                        }
                        xc4.p a76 = ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).a7(str);
                        java.lang.String a19 = a76 != null ? a76.a1() : "";
                        android.content.Context context2 = this.f167917g;
                        boolean D = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.D(this.f167925r);
                        int hashCode = this.f167917g.hashCode();
                        com.tencent.mm.storage.s7 s7Var = this.f167925r.C;
                        int i19 = m(i17).f380111f;
                        com.tencent.mm.storage.s7 s7Var2 = new com.tencent.mm.storage.s7(s7Var.f195312a);
                        s7Var2.f195313b = i19;
                        boolean H = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.H(this.f167925r);
                        boolean z17 = !com.tencent.mm.plugin.sns.ui.SnsInfoFlip.Q(this.f167925r);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivePhotoReportScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f167925r;
                        if (!com.tencent.mm.plugin.sns.ui.SnsInfoFlip.Q(snsInfoFlip)) {
                            i18 = 4;
                        } else if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.H(snsInfoFlip)) {
                            i18 = 3;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoReportScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        final com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = new com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView(context2, jj4Var3, i17, D, hashCode, s7Var2, H, a76, z17, i18, new com.tencent.mm.plugin.sns.ui.bk$$a(this, i17, a19), new com.tencent.mm.plugin.sns.ui.fk(this, i17));
                        flexibleLivePhotoView.setTag(com.tencent.mm.R.id.s6v, java.lang.Integer.valueOf(i17));
                        flexibleLivePhotoView.p();
                        if (flexibleLivePhotoView.getParent() != null) {
                            ((android.view.ViewGroup) flexibleLivePhotoView.getParent()).removeAllViews();
                        }
                        flexibleLivePhotoView.setPlayCallback(new com.tencent.mm.plugin.sns.ui.gk(this, a76, jj4Var3));
                        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(this.f167917g);
                        frameLayout2.addView(flexibleLivePhotoView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                        if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.Q(this.f167925r) || com.tencent.mm.plugin.sns.ui.SnsInfoFlip.z(this.f167925r)) {
                            com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar k17 = k(jj4Var3, frameLayout2);
                            k17.setLivePhotoTagClickCallback(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.bk$$b
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view6) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$fillViewLivePhotoView$1", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                                    java.lang.Object obj = new java.lang.Object();
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView2 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.this;
                                    arrayList.add(flexibleLivePhotoView2);
                                    arrayList.add(view6);
                                    java.lang.Object[] array = arrayList.toArray();
                                    arrayList.clear();
                                    yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsInfoFlip$SnsGalleryAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
                                    flexibleLivePhotoView2.n();
                                    yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip$SnsGalleryAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$fillViewLivePhotoView$1", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                                }
                            });
                            com.tencent.mm.plugin.sns.ui.s4 s4Var = this.f167925r.f166279g;
                            if (s4Var != null && s4Var.getJumpToDetailCallback() != null) {
                                k17.setDetailBtnClickCallback(this.f167925r.f166279g.getJumpToDetailCallback());
                            }
                        }
                        r(i17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        view2 = frameLayout2;
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return view2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillViewOnlineSight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        r45.m33 m18 = m(i17);
        if (m18 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryAdapter", "fill online sight view, but flip item is null.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewOnlineSight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        } else {
            java.lang.String str2 = m18.f380110e;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) this.f167922o).get(str2);
                synchronized (jm0.k.f300270i) {
                    gm0.j1.b().c();
                    if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                        throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                    a18 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
                }
                xc4.p a77 = ((zc4.g) ((zc4.h) a18).P6(zc4.g.class)).a7(str2);
                com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView2 = null;
                if (a77 == null || !pc4.d.f353410a.d(a77.h1())) {
                    if (weakReference == null || weakReference.get() == null) {
                        onlineVideoView = new com.tencent.mm.plugin.sns.ui.OnlineVideoView(this.f167917g, (android.util.AttributeSet) null);
                        ((java.util.HashMap) this.f167922o).put(str2, new java.lang.ref.WeakReference(onlineVideoView));
                    } else {
                        onlineVideoView = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) weakReference.get();
                    }
                    onlineVideoView.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableSnsEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    onlineVideoView.S1 = null;
                    onlineVideoView.T1 = true;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSnsEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    if (com.tencent.mm.sdk.platformtools.t8.D0(str2, this.f167921n)) {
                        o(i17);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "return online sight view %d parent id %s.", java.lang.Integer.valueOf(onlineVideoView.hashCode()), m18.f380110e);
                    com.tencent.mm.plugin.sns.storage.SnsInfo k18 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str2);
                    if (k18 != null) {
                        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = this.f167925r;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        int i27 = snsInfoFlip2.V1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        onlineVideoView.setScene(i27);
                        onlineVideoView.setSessionId(new kk.v(gm0.j1.b().h()).toString() + "_" + java.lang.System.currentTimeMillis());
                        onlineVideoView.setSessionTimestamp(java.lang.System.currentTimeMillis());
                        onlineVideoView.setSnsId(ca4.z0.t0(k18.field_snsId));
                        onlineVideoView.setFilePath(com.tencent.mm.plugin.sns.model.y6.p(m18.f380109d));
                        onlineVideoView.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
                        int i28 = this.f167925r.D;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uiFromSceneToSnsScene", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
                        int i29 = i28 != 2 ? i28 != 3 ? (i28 == 4 || i28 == 5) ? 2 : i28 : 5 : 3;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiFromSceneToSnsScene", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
                        onlineVideoView.setSnsScene(i29);
                        onlineVideoView.setSessionIdSns(ca4.z0.f40071d);
                        if (iq.b.y()) {
                            onlineVideoView.setMute(true);
                        }
                    }
                    if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.Q(this.f167925r) || com.tencent.mm.plugin.sns.ui.SnsInfoFlip.z(this.f167925r)) {
                        if (onlineVideoView.getParent() != null) {
                            ((android.view.ViewGroup) onlineVideoView.getParent()).removeAllViews();
                        }
                        ?? frameLayout3 = new android.widget.FrameLayout(this.f167917g);
                        frameLayout3.addView(onlineVideoView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                        com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar k19 = k(m18.f380109d, frameLayout3);
                        com.tencent.mm.plugin.sns.ui.s4 s4Var2 = this.f167925r.f166279g;
                        if (s4Var2 != null && s4Var2.getJumpToDetailCallback() != null) {
                            k19.setDetailBtnClickCallback(this.f167925r.f166279g.getJumpToDetailCallback());
                        }
                        onlineVideoView2 = frameLayout3;
                        if (k19 instanceof com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar) {
                            android.content.Context context3 = this.f167917g;
                            onlineVideoView2 = frameLayout3;
                            if (context3 instanceof android.app.Activity) {
                                com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar snsAlbumImgBottomBar = (com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar) k19;
                                android.app.Activity activity = (android.app.Activity) context3;
                                r45.jj4 jj4Var4 = m18.f380109d;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindOnlineVideoView", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
                                kotlin.jvm.internal.o.g(activity, "activity");
                                if (snsAlbumImgBottomBar.f166798h != null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unbindOnlineVideoView", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
                                    xd4.e eVar = snsAlbumImgBottomBar.f166798h;
                                    if (eVar != null) {
                                        ((xd4.z) eVar).destroy();
                                    }
                                    snsAlbumImgBottomBar.f166798h = null;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unbindOnlineVideoView", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
                                }
                                android.view.ViewStub viewStub = snsAlbumImgBottomBar.f166797g;
                                if (viewStub == null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindOnlineVideoView", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
                                } else {
                                    xd4.z zVar = new xd4.z();
                                    snsAlbumImgBottomBar.f166798h = zVar;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initWithRootView", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                    zVar.f453727h = jj4Var4;
                                    zVar.f453725f = onlineVideoView;
                                    zVar.f453723d = activity;
                                    android.view.KeyEvent.Callback videoView = onlineVideoView.getVideoView();
                                    zVar.f453726g = videoView instanceof com.tencent.mm.pluginsdk.ui.tools.f4 ? (com.tencent.mm.pluginsdk.ui.tools.f4) videoView : null;
                                    viewStub.setLayoutResource(com.tencent.mm.R.layout.eoq);
                                    android.view.View inflate = viewStub.inflate();
                                    kotlin.jvm.internal.o.d(inflate);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initControlBarWithRootView", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                    android.app.Activity activity2 = zVar.f453723d;
                                    if (activity2 == null) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initControlBarWithRootView", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                    } else {
                                        zVar.f453720a = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
                                        zVar.f453724e = (com.tencent.mm.ui.widget.InsectLinearLayout) activity2.findViewById(com.tencent.mm.R.id.u4v);
                                        android.app.Activity activity3 = zVar.f453723d;
                                        zVar.onConfigurationChanged((activity3 == null || (resources = activity3.getResources()) == null) ? null : resources.getConfiguration());
                                        com.tencent.mm.ui.widget.InsectLinearLayout insectLinearLayout = zVar.f453724e;
                                        if (insectLinearLayout != null) {
                                            insectLinearLayout.setInsectCallback(new xd4.p(zVar));
                                        }
                                        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = (com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView) inflate.findViewById(com.tencent.mm.R.id.ncv);
                                        zVar.f453721b = expandableHeroSeekBarView;
                                        if (expandableHeroSeekBarView == null) {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initControlBarWithRootView", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                        } else {
                                            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.u2b);
                                            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.u2c);
                                            com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView2 = zVar.f453721b;
                                            kotlin.jvm.internal.o.d(expandableHeroSeekBarView2);
                                            com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView mediaControlBar = expandableHeroSeekBarView2.getMediaControlBar();
                                            mediaControlBar.setIndCurrentTimeTv(textView);
                                            mediaControlBar.setIndTotalTimeTv(textView2);
                                            mediaControlBar.setVisibleChangeListener(new xd4.q(zVar));
                                            com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView3 = zVar.f453721b;
                                            if (expandableHeroSeekBarView3 != null) {
                                                expandableHeroSeekBarView3.setExpandStatusChangeListener(new xd4.r(zVar));
                                            }
                                            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView3 = zVar.f453725f;
                                            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView.i(mediaControlBar, onlineVideoView3 != null ? onlineVideoView3.getVideoSpeedRatio() : 1.0f, false, 2, null);
                                            mediaControlBar.setVideoSpeedChangeListener(new xd4.s(zVar));
                                            mediaControlBar.setHeroSeekBarChangeListener(new xd4.t(mediaControlBar, zVar));
                                            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView4 = zVar.f453725f;
                                            if (onlineVideoView4 != null) {
                                                onlineVideoView4.setSeekBarHelperCallback(new xd4.u(mediaControlBar, zVar));
                                            }
                                            mediaControlBar.setTotalTimeMs((zVar.f453727h != null ? a06.d.b(r3.R) : 0) * 1000);
                                            mediaControlBar.setVideoPlayDurationProvider(new xd4.v(zVar));
                                            mediaControlBar.f();
                                            kotlin.jvm.internal.o.d(zVar.f453726g);
                                            mediaControlBar.setEnableDrag(!android.text.TextUtils.isEmpty(r3.getF174598m()));
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initControlBarWithRootView", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                        }
                                    }
                                    com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView4 = zVar.f453721b;
                                    kotlin.jvm.internal.o.d(expandableHeroSeekBarView4);
                                    zVar.j(expandableHeroSeekBarView4, onlineVideoView);
                                    zVar.i();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWithRootView", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindOnlineVideoView", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
                                }
                                onlineVideoView2 = frameLayout3;
                                if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.z(this.f167925r)) {
                                    snsAlbumImgBottomBar.setDisallowParentIntercept(true);
                                    onlineVideoView2 = frameLayout3;
                                }
                            }
                        }
                    } else {
                        onlineVideoView2 = onlineVideoView;
                    }
                } else {
                    if (weakReference == null || weakReference.get() == null || !(weakReference.get() instanceof com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView)) {
                        if (((java.util.HashMap) this.f167922o).size() >= 3) {
                            java.util.Map.Entry entry = null;
                            int i37 = 0;
                            for (java.util.Map.Entry entry2 : ((java.util.HashMap) this.f167922o).entrySet()) {
                                android.view.View view6 = (android.view.View) ((java.lang.ref.WeakReference) entry2.getValue()).get();
                                if (view6 != null && (tag = view6.getTag(com.tencent.mm.R.id.s6v)) != null && (abs = java.lang.Math.abs(((java.lang.Integer) tag).intValue() - i17)) > i37) {
                                    entry = entry2;
                                    i37 = abs;
                                }
                            }
                            if (entry != null && (((java.lang.ref.WeakReference) entry.getValue()).get() instanceof com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView)) {
                                ((java.util.HashMap) this.f167922o).remove(entry.getKey());
                                flexibleVideoView2 = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) ((java.lang.ref.WeakReference) entry.getValue()).get();
                            }
                        }
                        if (flexibleVideoView2 == null) {
                            flexibleVideoView = new com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView(this.f167917g);
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "new video view pos:%d", java.lang.Integer.valueOf(i17));
                        } else {
                            flexibleVideoView = flexibleVideoView2;
                        }
                        ((java.util.HashMap) this.f167922o).put(str2, new java.lang.ref.WeakReference(flexibleVideoView));
                    } else {
                        flexibleVideoView = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) weakReference.get();
                    }
                    flexibleVideoView.q(false, true, true);
                    flexibleVideoView.setTag(com.tencent.mm.R.id.s6v, java.lang.Integer.valueOf(i17));
                    boolean y17 = iq.b.y();
                    com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip3 = this.f167925r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    int i38 = snsInfoFlip3.V1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    flexibleVideoView.o(a77, false, com.tencent.mm.pluginsdk.ui.e1.CONTAIN, y17, true, true, com.tencent.mm.R.color.a9e, new fc4.k(i38, new kk.v(gm0.j1.b().h()) + "_" + java.lang.System.currentTimeMillis(), java.lang.System.currentTimeMillis()));
                    if (com.tencent.mm.sdk.platformtools.t8.D0(str2, this.f167921n)) {
                        o(i17);
                    }
                    if (flexibleVideoView.getParent() != null) {
                        ((android.view.ViewGroup) flexibleVideoView.getParent()).removeAllViews();
                    }
                    ?? frameLayout4 = new android.widget.FrameLayout(this.f167917g);
                    frameLayout4.addView(flexibleVideoView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.Q(this.f167925r) || com.tencent.mm.plugin.sns.ui.SnsInfoFlip.z(this.f167925r)) {
                        com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar k27 = k(m18.f380109d, frameLayout4);
                        com.tencent.mm.plugin.sns.ui.s4 s4Var3 = this.f167925r.f166279g;
                        if (s4Var3 != null && s4Var3.getJumpToDetailCallback() != null) {
                            k27.setDetailBtnClickCallback(this.f167925r.f166279g.getJumpToDetailCallback());
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "return online sight view %d parent id %s.", java.lang.Integer.valueOf(frameLayout4.hashCode()), m18.f380110e);
                    onlineVideoView2 = frameLayout4;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewOnlineSight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                view3 = onlineVideoView2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return view3;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryAdapter", "fill online sight view, but sns local id is null.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewOnlineSight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        }
        view3 = view4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return view3;
    }

    @Override // db5.p8, androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroyItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        android.view.View view = (android.view.View) obj;
        viewGroup.removeView(view);
        s(view);
        super.destroyItem(viewGroup, i17, obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroyItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    @Override // db5.p8
    public com.tencent.mm.ui.base.WxImageView f(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsGalleryAdapter", "position : %d getWxImageViewByPosition view is null.", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.jk jkVar = (com.tencent.mm.plugin.sns.ui.jk) e17.getTag();
        if (jkVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsGalleryAdapter", "position : %d getWxImageViewByPosition holder is null.", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        if (z17 && jkVar.f169518e.getVisibility() == 8) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        com.tencent.mm.ui.base.WxImageView wxImageView = jkVar.f169518e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return wxImageView;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f167925r;
        int size = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.E(snsInfoFlip) == null ? 0 : com.tencent.mm.plugin.sns.ui.SnsInfoFlip.E(snsInfoFlip).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return size;
    }

    @Override // db5.p8, androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        if (this.f167924q) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return -2;
        }
        int itemPosition = super.getItemPosition(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return itemPosition;
    }

    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "adapter clear.");
        java.util.Map map = this.f167922o;
        java.util.Iterator it = ((java.util.HashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
            if (view instanceof com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) {
                ((com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) view).q(false, false, true);
            }
        }
        ((java.util.HashMap) map).clear();
        this.f167923p.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public final void j(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        r45.jj4 jj4Var = m(i17).f380109d;
        com.tencent.mm.storage.s7 s7Var = this.f167925r.C;
        int i18 = m(i17).f380111f;
        com.tencent.mm.storage.s7 s7Var2 = new com.tencent.mm.storage.s7(s7Var.f195312a);
        s7Var2.f195313b = i18;
        if (jj4Var.f377856e != 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        boolean e17 = com.tencent.mm.plugin.sns.storage.w2.e(m(i17).f380110e);
        com.tencent.mm.plugin.sns.model.l4.hj().n0(jj4Var, n(jj4Var), s7Var2, e17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public final com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar k(r45.jj4 jj4Var, android.widget.FrameLayout frameLayout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f167925r;
        boolean z17 = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.z(snsInfoFlip);
        android.content.Context context = this.f167917g;
        com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar snsAlbumImgBottomBar = z17 ? new com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar(context) : new com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar(context);
        snsAlbumImgBottomBar.b(jj4Var, snsInfoFlip.getSnsId(), com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar.f166825d.a(snsInfoFlip.D));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.z(snsInfoFlip)) {
            layoutParams.bottomMargin = i65.a.b(context, 0);
        } else if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.A(snsInfoFlip).getVisibility() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            int i17 = snsInfoFlip.f167187a2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            layoutParams.bottomMargin = i17 + i65.a.h(context, com.tencent.mm.R.dimen.ais);
        } else {
            layoutParams.bottomMargin = i65.a.b(context, 16) + com.tencent.mm.ui.bl.c(snsInfoFlip.getContext());
        }
        frameLayout.addView(snsAlbumImgBottomBar, layoutParams);
        if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.z(snsInfoFlip) && (snsAlbumImgBottomBar instanceof com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar)) {
            ((com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar) snsAlbumImgBottomBar).c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z18 = snsInfoFlip.f167197k2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (z18) {
            snsAlbumImgBottomBar.setVisibility(0);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2002", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            snsInfoFlip.f167197k2 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2002", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            snsAlbumImgBottomBar.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return snsAlbumImgBottomBar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x045f, code lost:
    
        if (r0 == 2) goto L147;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x028c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04d5  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View l(final int r35, android.view.View r36, android.view.ViewGroup r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.bk.l(int, android.view.View, android.view.ViewGroup, boolean):android.view.View");
    }

    public r45.m33 m(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f167925r;
        if (i17 >= com.tencent.mm.plugin.sns.ui.SnsInfoFlip.E(snsInfoFlip).size() || i17 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        r45.m33 m33Var = (r45.m33) com.tencent.mm.plugin.sns.ui.SnsInfoFlip.E(snsInfoFlip).get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return m33Var;
    }

    public final int n(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        if (android.text.TextUtils.isEmpty(jj4Var.f377855d) || jj4Var.N) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "getMediaDownloadType big1 id:%s", jj4Var.f377855d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return 0;
        }
        java.util.HashMap hashMap = this.f167919i;
        if (hashMap.containsKey(jj4Var.f377855d)) {
            int intValue = ((java.lang.Integer) hashMap.get(jj4Var.f377855d)).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return intValue;
        }
        if (android.text.TextUtils.isEmpty(jj4Var.f377879y0)) {
            hashMap.put(jj4Var.f377855d, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "getMediaDownloadType big2 id:%s", jj4Var.f377855d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return 0;
        }
        if (com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.i1.u(jj4Var))) {
            hashMap.put(jj4Var.f377855d, 2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return 2;
        }
        int r17 = pc4.d.f353410a.r();
        if ((r17 == 4 || r17 == 1) && android.text.TextUtils.isEmpty(jj4Var.A1)) {
            hashMap.put(jj4Var.f377855d, 0);
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsGalleryAdapter", "hd url is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "getMediaDownloadType type:%d id:%s", java.lang.Integer.valueOf(r17), jj4Var.f377855d);
        hashMap.put(jj4Var.f377855d, java.lang.Integer.valueOf(r17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return r17;
    }

    @Override // androidx.viewpager.widget.a
    public void notifyDataSetChanged() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        this.f167924q = true;
        super.notifyDataSetChanged();
        this.f167924q = false;
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f167925r;
        if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.E(snsInfoFlip).size() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            java.lang.Runnable runnable = snsInfoFlip.N1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (runnable != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                java.lang.Runnable runnable2 = snsInfoFlip.N1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                runnable2.run();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public final void o(int i17) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        r45.m33 m17 = m(i17);
        if (m17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryAdapter", "notify online sight play, but flip item is null.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        java.lang.String str = m17.f380110e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryAdapter", "notify online sight play, but sns local id is null.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "notify online sight play pos %s sns local id %s.", java.lang.Integer.valueOf(i17), str);
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) this.f167922o).get(str);
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryAdapter", "notify online sight play, but view cache is null.");
            this.f167921n = str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        android.view.View view = (android.view.View) weakReference.get();
        if (view instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView) {
            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) view;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "%d notify online sight play video %s.", java.lang.Integer.valueOf(onlineVideoView.hashCode()), str);
            this.f167921n = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("regSnsFlipUiEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            onlineVideoView.hashCode();
            onlineVideoView.Z1.alive();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("regSnsFlipUiEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            onlineVideoView.P(m17.f380109d, m17.f380110e, m17.f380111f);
            com.tencent.mm.autogen.events.SnsFlipUIEvent snsFlipUIEvent = new com.tencent.mm.autogen.events.SnsFlipUIEvent();
            am.sv svVar = snsFlipUIEvent.f54810g;
            svVar.f7939b = 1;
            svVar.f7940c = str;
            snsFlipUIEvent.e();
        } else if (view instanceof com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) {
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) view;
            flexibleVideoView.l(false, false, true);
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
            }
            xc4.p a76 = ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).a7(str);
            if (a76 != null) {
                this.f167923p.d(this.f167917g, flexibleVideoView, a76);
            }
        } else if (view == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryAdapter", "online sight view is null, do nothing. snsLocalId %s.", str);
            this.f167921n = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyOnlineSightStop", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "notify online sight stop %s", new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mm.autogen.events.SnsFlipUIEvent snsFlipUIEvent = new com.tencent.mm.autogen.events.SnsFlipUIEvent();
        am.sv svVar = snsFlipUIEvent.f54810g;
        svVar.f7938a = this.f167917g;
        svVar.f7940c = this.f167921n;
        svVar.f7939b = 2;
        snsFlipUIEvent.e();
        this.f167921n = null;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.f167186o2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int i18 = this.f167925r.R1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        q(i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyOnlineSightStop", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void q(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        if (pc4.e.f353426a.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "pauseOtherVideoView curPos: %d", java.lang.Integer.valueOf(i17));
            android.util.SparseArray sparseArray = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(this.f167925r).f228471f;
            for (int i18 = 0; i18 < sparseArray.size(); i18++) {
                java.lang.Object valueAt = sparseArray.valueAt(i18);
                if (valueAt instanceof android.view.View) {
                    android.view.View childAt = ((android.view.ViewGroup) valueAt).getChildAt(0);
                    if (childAt instanceof com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView) {
                        if (((java.lang.Integer) childAt.getTag(com.tencent.mm.R.id.s6v)).intValue() != i17) {
                            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView) childAt;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                            boolean l17 = flexibleLivePhotoView.l();
                            flexibleLivePhotoView.B = false;
                            flexibleLivePhotoView.m("pausePlay isPlaying: " + l17);
                            if (l17) {
                                com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = flexibleLivePhotoView.f169192g;
                                flexibleVideoView.k(false);
                                android.widget.RelativeLayout videoContainer = flexibleVideoView.getVideoContainer();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("aniToThumb", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                                flexibleVideoView.post(new dd4.i(videoContainer, flexibleLivePhotoView));
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("aniToThumb", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                        }
                    } else if ((childAt instanceof y51.c) && ((java.lang.Integer) childAt.getTag(com.tencent.mm.R.id.s6v)).intValue() != i17) {
                        ((y51.b) ((y51.c) childAt)).b();
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public final void r(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        if (!this.f167918h) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f167925r;
        if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(snsInfoFlip) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        if (!com.tencent.mm.network.y2.a(this.f167917g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        int i18 = i17 - 1;
        if (i18 >= 0) {
            j(i18);
        }
        int i19 = i17 + 1;
        if (i19 < com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(snsInfoFlip).getCount()) {
            j(i19);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public final void s(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseVideoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        if (view instanceof android.view.ViewGroup) {
            android.view.KeyEvent.Callback childAt = ((android.view.ViewGroup) view).getChildAt(0);
            if (childAt instanceof com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView) {
                com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView) childAt;
                flexibleLivePhotoView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                flexibleLivePhotoView.m("release " + flexibleLivePhotoView.f169206x);
                if (!flexibleLivePhotoView.f169206x) {
                    flexibleLivePhotoView.f169206x = true;
                    flexibleLivePhotoView.f169192g.q(false, false, true);
                    ke4.c cVar = flexibleLivePhotoView.f169204v;
                    if (cVar == null) {
                        kotlin.jvm.internal.o.o("shareHelper");
                        throw null;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoShareHelper", "release");
                    cVar.f307038i.dead();
                    cVar.f307031b.e();
                    kotlinx.coroutines.r2 r2Var = cVar.f307035f;
                    if (r2Var != null) {
                        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                    }
                    kotlinx.coroutines.z0.e(cVar.f307033d, null, 1, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            } else if (childAt instanceof y51.c) {
                ((y51.b) ((y51.c) childAt)).e();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseVideoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public boolean t(int i17, int i18, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        android.view.View e17 = e(i17);
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f167925r;
        if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.D(snsInfoFlip) && (!com.tencent.mm.plugin.sns.ui.SnsInfoFlip.J(snsInfoFlip).containsKey(str) || !((java.lang.Boolean) com.tencent.mm.plugin.sns.ui.SnsInfoFlip.J(snsInfoFlip).get(str)).booleanValue())) {
            l(i17, e17, null, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return true;
        }
        if (e17 != null && c(i17, true) == null && f(i17, true) == null) {
            l(i17, e17, null, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return true;
        }
        if (!this.f167920m.contains(str) || i18 != 10 || !z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "image spec 0 to uhd id:%s", str);
        if (e17 != null) {
            l(i17, e17, null, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "view has been released");
        this.f167919i.remove(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return false;
    }

    public final void u(final com.tencent.mm.plugin.sns.ui.jk jkVar, final int i17, final r45.jj4 jj4Var, final boolean z17, boolean z18, final boolean z19) {
        int i18;
        int i19;
        java.lang.String str;
        java.lang.String str2;
        int i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useMultiTouchImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.tencent.mm.storage.s7 s7Var = this.f167925r.C;
        int i28 = m(i17).f380111f;
        final com.tencent.mm.storage.s7 s7Var2 = new com.tencent.mm.storage.s7(s7Var.f195312a);
        s7Var2.f195313b = i28;
        java.lang.Object tag = jkVar.f169517d.getTag(com.tencent.mm.R.id.f487033qx1);
        if (tag == null || !((java.lang.String) tag).equals(jj4Var.f377855d)) {
            jkVar.f169517d.setVisibility(8);
            jkVar.f169517d.f197663y = false;
        }
        jkVar.f169517d.setTag(com.tencent.mm.R.id.f487033qx1, jj4Var.f377855d);
        jkVar.f169518e.setVisibility(8);
        if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.L(this.f167925r) != null && i17 == com.tencent.mm.plugin.sns.ui.SnsInfoFlip.L(this.f167925r).getCurrentItem()) {
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip.C(this.f167925r, jkVar.f169517d);
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip.B(this.f167925r).e(com.tencent.mm.plugin.sns.ui.SnsInfoFlip.D(this.f167925r));
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f167925r;
            db5.f0 B = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.B(snsInfoFlip);
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = this.f167925r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            int i29 = snsInfoFlip2.R1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (snsInfoFlip.m0(B, i29)) {
                jkVar.f169517d.setVisibility(0);
            }
        }
        if (z18) {
            java.lang.String l17 = com.tencent.mm.plugin.sns.model.i1.l(jj4Var);
            final java.lang.String str3 = m(i17).f380114i;
            if (com.tencent.mm.vfs.w6.j(str3)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "useMultiTouchImageView isTranslate result is success, go to show trans img path: %s, position: %d", l17, java.lang.Integer.valueOf(i17));
                ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.bk$$e
                    @Override // java.lang.Runnable
                    public final void run() {
                        final com.tencent.mm.plugin.sns.ui.bk bkVar = com.tencent.mm.plugin.sns.ui.bk.this;
                        java.lang.String str4 = str3;
                        final int i37 = i17;
                        final com.tencent.mm.plugin.sns.ui.jk jkVar2 = jkVar;
                        bkVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$useMultiTouchImageView$5", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        final android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str4, null);
                        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.bk$$g
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.plugin.sns.ui.bk bkVar2 = com.tencent.mm.plugin.sns.ui.bk.this;
                                bkVar2.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$useMultiTouchImageView$4", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                                android.graphics.Bitmap bitmap = J2;
                                int i38 = i37;
                                if (bitmap != null) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "set translate photo success %d", java.lang.Integer.valueOf(i38));
                                    com.tencent.mm.plugin.sns.ui.jk jkVar3 = jkVar2;
                                    jkVar3.f169517d.setVisibility(0);
                                    com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = jkVar3.f169517d;
                                    int i39 = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.f167186o2;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                                    boolean z27 = bkVar2.f167925r.E1;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                                    multiTouchImageView.setEnableHorLongBmpMode(z27);
                                    com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView2 = jkVar3.f169517d;
                                    int width = bitmap.getWidth();
                                    int height = bitmap.getHeight();
                                    multiTouchImageView2.f197651o = width;
                                    multiTouchImageView2.f197652p = height;
                                    jkVar3.f169517d.setImageBitmap(bitmap);
                                } else {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsGalleryAdapter", "set translate photo error %d", java.lang.Integer.valueOf(i38));
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$useMultiTouchImageView$4", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                            }
                        });
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$useMultiTouchImageView$5", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                    }
                });
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useMultiTouchImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsGalleryAdapter", "useMultiTouchImageView isTranslate but result is error, go to show origin img position: %d", java.lang.Integer.valueOf(i17));
        }
        int n17 = n(jj4Var);
        int i37 = z19 ? 2 : n17 == 3 ? 0 : n17 == 4 ? 1 : n17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "real load type:%d", java.lang.Integer.valueOf(i37));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImageType2DownLoadType", "com.tencent.mm.plugin.sns.data.DownLoadType");
        if (i37 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageType2DownLoadType", "com.tencent.mm.plugin.sns.data.DownLoadType");
            i18 = 2;
        } else {
            if (i37 == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageType2DownLoadType", "com.tencent.mm.plugin.sns.data.DownLoadType");
                i19 = 11;
            } else if (i37 == 2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageType2DownLoadType", "com.tencent.mm.plugin.sns.data.DownLoadType");
                i19 = 10;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageType2DownLoadType", "com.tencent.mm.plugin.sns.data.DownLoadType");
                i18 = 0;
            }
            i18 = i19;
        }
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = jkVar.f169517d;
        int hashCode = this.f167917g.hashCode();
        boolean z27 = !z17;
        boolean e17 = com.tencent.mm.plugin.sns.storage.w2.e(m(i17).f380110e);
        java.lang.String t07 = ca4.z0.t0(this.f167925r.getSnsId());
        int i38 = i37;
        final int i39 = i18;
        com.tencent.mm.plugin.sns.model.c2 c2Var = new com.tencent.mm.plugin.sns.model.c2() { // from class: com.tencent.mm.plugin.sns.ui.bk$$f
            @Override // com.tencent.mm.plugin.sns.model.c2
            public final void a(android.graphics.Bitmap bitmap) {
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip3;
                java.lang.String str4;
                int i47;
                java.lang.String str5;
                java.lang.String str6;
                r45.jj4 jj4Var2;
                java.lang.String str7;
                r45.jj4 jj4Var3 = jj4Var;
                int i48 = i39;
                com.tencent.mm.storage.s7 s7Var3 = s7Var2;
                com.tencent.mm.plugin.sns.ui.bk bkVar = com.tencent.mm.plugin.sns.ui.bk.this;
                bkVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$useMultiTouchImageView$6", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                boolean f17 = ca4.z0.f(bitmap);
                int i49 = i17;
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip4 = bkVar.f167925r;
                if (f17 || !com.tencent.mm.plugin.sns.ui.SnsInfoFlip.H(snsInfoFlip4) || snsInfoFlip4.getSelectItem() == null) {
                    snsInfoFlip3 = snsInfoFlip4;
                    str4 = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
                    i47 = 0;
                } else {
                    com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(bkVar.m(i49).f380110e);
                    java.lang.String t08 = k17 != null ? ca4.z0.t0(k17.field_snsId) : "";
                    int i57 = snsInfoFlip4.getSelectItem().f380112g == i49 ? 0 : 1;
                    int i58 = snsInfoFlip4.getSelectItem().f380112g;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    str4 = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
                    i47 = 0;
                    snsInfoFlip3 = snsInfoFlip4;
                    snsInfoFlip4.g0(t08, jj4Var3, i58, i48, 1, i57);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                }
                boolean f18 = ca4.z0.f(bitmap);
                com.tencent.mm.plugin.sns.ui.jk jkVar2 = jkVar;
                if (f18 || (str7 = (jj4Var2 = jj4Var).f377855d) == null || str7.startsWith("pre_temp_extend_pic") || jj4Var2.f377855d.startsWith("sns_cmt_local_")) {
                    str5 = "lambda$useMultiTouchImageView$6";
                    com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip5 = snsInfoFlip3;
                    str6 = str4;
                    if (ca4.z0.f(bitmap)) {
                        com.tencent.mm.plugin.sns.ui.SnsInfoFlip.J(snsInfoFlip5).put(jj4Var3.f377855d, java.lang.Boolean.TRUE);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "pennqin, use multiTouchImageView, %s.", jkVar2.f169517d);
                        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView2 = jkVar2.f169517d;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        boolean z28 = snsInfoFlip5.E1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        multiTouchImageView2.setEnableHorLongBmpMode(z28);
                        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView3 = jkVar2.f169517d;
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        multiTouchImageView3.f197651o = width;
                        multiTouchImageView3.f197652p = height;
                        if (z19) {
                            jkVar2.f169517d.setUhdImageBitmap(bitmap);
                        } else {
                            jkVar2.f169517d.setImageBitmap(bitmap);
                        }
                        jkVar2.f169517d.setVisibility(i47);
                        jkVar2.f169517d.post(new com.tencent.mm.plugin.sns.ui.ik(bkVar, jkVar2));
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "big image not ready, set loading img. position: %d, media id: %s.", java.lang.Integer.valueOf(i49), jj4Var2.f377855d);
                    jkVar2.f169515b.setVisibility(i47);
                    jkVar2.f169516c.setVisibility(i47);
                    jkVar2.f169516c.setAlpha(0.1f);
                    jkVar2.f169516c.animate().alpha(1.0f).setDuration(2000L).setListener(null);
                    jkVar2.f169518e.setVisibility(8);
                    if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.D(snsInfoFlip3)) {
                        str5 = "lambda$useMultiTouchImageView$6";
                        str6 = str4;
                        snsInfoFlip3.m0(jkVar2.f169517d, i49);
                    } else {
                        jkVar2.f169517d.setVisibility(8);
                        com.tencent.mm.plugin.sns.model.l4.hj().P(jkVar2.f169515b);
                        str6 = str4;
                        str5 = "lambda$useMultiTouchImageView$6";
                        com.tencent.mm.plugin.sns.model.l4.hj().l0(jj4Var2, jkVar2.f169515b, com.tencent.mm.R.drawable.bgn, bkVar.f167917g.hashCode(), s7Var3);
                    }
                    if (z17) {
                        jkVar2.f169516c.setVisibility(8);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str6);
            }
        };
        hj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.lang.String str4 = jj4Var.f377855d;
        if (str4 == null || str4.equals("")) {
            str = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
            str2 = "useMultiTouchImageView";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else {
            java.lang.String r17 = com.tencent.mm.plugin.sns.model.i1.r(jj4Var);
            if (i38 == 2) {
                r17 = com.tencent.mm.plugin.sns.model.i1.u(jj4Var);
                i27 = 8;
            } else if ((i38 == 1 || i38 == 4) && !android.text.TextUtils.isEmpty(jj4Var.A1)) {
                r17 = com.tencent.mm.plugin.sns.model.i1.q(jj4Var);
                i27 = 9;
            } else {
                i27 = 3;
            }
            java.lang.String x17 = ca4.z0.x(i27, jj4Var.f377855d);
            if (com.tencent.mm.plugin.sns.model.l4.Cj().l(jj4Var.f377855d)) {
                hj6.t0(multiTouchImageView, x17, false, -1, hashCode, -1, -1);
                c2Var.a(null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                str = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
                str2 = "useMultiTouchImageView";
            } else {
                android.graphics.Bitmap m17 = hj6.m(hj6.f164255d, x17);
                if (ca4.z0.f(m17)) {
                    hj6.t0(multiTouchImageView, x17, false, -1, hashCode, m17.getWidth(), m17.getHeight());
                    c2Var.a(m17);
                    str = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
                    str2 = "useMultiTouchImageView";
                } else {
                    str = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
                    java.lang.String str5 = r17;
                    str2 = "useMultiTouchImageView";
                    com.tencent.mm.plugin.sns.model.l4.bj().execute(new com.tencent.mm.plugin.sns.model.o1(hj6, str5, multiTouchImageView, x17, hashCode, z27, i38, jj4Var, s7Var2, t07, e17, c2Var));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
    }
}
