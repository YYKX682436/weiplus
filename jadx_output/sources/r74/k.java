package r74;

/* loaded from: classes4.dex */
public final class k extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem implements xd4.d, i64.k0 {
    public n74.j1 A;
    public com.tencent.mm.plugin.sns.ad.widget.living.v B;

    /* renamed from: q, reason: collision with root package name */
    public r74.a f393209q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f393210r;

    /* renamed from: s, reason: collision with root package name */
    public r45.jj4 f393211s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f393212t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f393213u = jz5.h.b(new r74.i(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f393214v = jz5.h.b(new r74.h(this));

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f393215w = "";

    /* renamed from: x, reason: collision with root package name */
    public r74.a0 f393216x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.l f393217y;

    /* renamed from: z, reason: collision with root package name */
    public a44.k f393218z;

    public static final /* synthetic */ android.app.Activity F(r74.k kVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMActivity$p$s22868293", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        android.app.Activity activity = kVar.f169249f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMActivity$p$s22868293", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return activity;
    }

    public final boolean G() {
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        if (!ca4.m0.X(I())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            return false;
        }
        com.tencent.mars.xlog.Log.i("AdCombineGridCardItem", "%s GridCardAd doPause", this);
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(this.f393210r)) {
            com.tencent.mm.plugin.sns.ad.widget.living.v vVar = this.B;
            if (vVar != null) {
                vVar.g();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f393210r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f169251h;
        if (bsVar != null && (l1Var = bsVar.f168036b) != null && (b1Var = l1Var.f169702c) != null && snsInfo != null) {
            b1Var.q(snsInfo.field_snsId);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        this.f393212t = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r3.isAdForbidAutoPlay() == true) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(r74.a r13, r45.jj4 r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r74.k.H(r74.a, r45.jj4):void");
    }

    public final int I() {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContentStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        r74.a aVar = this.f393209q;
        int i17 = (aVar == null || (timeLineObject = aVar.timeLineObject) == null || (a90Var = timeLineObject.ContentObj) == null) ? 0 : a90Var.f369837e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContentStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return i17;
    }

    public final android.widget.ImageView J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMainImage", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f393214v).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMainImage", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return imageView;
    }

    public final android.view.ViewGroup K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f393213u).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return viewGroup;
    }

    public final android.view.ViewGroup L() {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        r74.a aVar = this.f393209q;
        if (aVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
            viewGroup = aVar.D0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
        } else {
            viewGroup = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return viewGroup;
    }

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        if (baseViewHolder == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            return;
        }
        if (ca4.m0.X(I())) {
            if (com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(this.f393210r)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playLiveStream", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                com.tencent.mars.xlog.Log.w("AdCombineGridCardItem", "%s isAdLivingStream, gridCardAd autoPlay pos %d", this, java.lang.Integer.valueOf(i17));
                xd4.o0.d().j();
                xd4.g.a().d(this);
                com.tencent.mm.plugin.sns.ad.widget.living.v vVar = this.B;
                if (vVar != null) {
                    vVar.i();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playLiveStream", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playSightVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                xd4.g.a().c();
                com.tencent.mars.xlog.Log.w("AdCombineGridCardItem", "%s GridCardAd autoPlay pos %d", this, java.lang.Integer.valueOf(i17));
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f393210r;
                r45.jj4 a17 = n74.x1.a(baseViewHolder);
                java.lang.String c17 = n74.x1.c(baseViewHolder);
                i64.b1 b17 = n74.x1.b(this.f169251h);
                android.view.ViewGroup K = K();
                java.lang.String str = baseViewHolder.f169268f;
                if (snsInfo != null && a17 != null && K != null) {
                    com.tencent.mars.xlog.Log.w("AdCombineGridCardItem", "the sns info is " + snsInfo + " the media is " + a17);
                    z74.h hVar = new z74.h("AdCombineGridCardItem");
                    hVar.a(K);
                    hVar.b(a17);
                    hVar.c(snsInfo);
                    hVar.d(str);
                    hVar.g(c17);
                    hVar.f(b17);
                    hVar.e(4, new r74.j(this));
                }
                r74.a0 a0Var = this.f393216x;
                if (a0Var != null) {
                    a0Var.m(r74.l.f393219d);
                }
                this.f393212t = true;
                r74.a aVar = this.f393209q;
                if (aVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setForbidShowPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
                    aVar.E0 = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setForbidShowPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playSightVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(this.f393210r) && (vVar = this.B) != null) {
            vVar.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        com.tencent.mars.xlog.Log.i("AdCombineGridCardItem", "onUIPause");
        G();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        android.view.ViewGroup K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        if (!ca4.m0.X(I()) || (K = K()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            return null;
        }
        int[] iArr = new int[2];
        K.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, K.getMeasuredWidth() + i17, K.getMeasuredHeight() + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return rect;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        com.tencent.mars.xlog.Log.i("AdCombineGridCardItem", "AdCombineGridCardItemHolder build content is called");
        if (!(baseViewHolder instanceof r74.a)) {
            com.tencent.mars.xlog.Log.e("AdCombineGridCardItem", "buildContent::the holder is not type of AdCombineGridCardItemHolder!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            return;
        }
        this.f393209q = (r74.a) baseViewHolder;
        try {
            if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) != null) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.ctz);
                if (!((r74.a) baseViewHolder).f169290q) {
                    r74.a aVar = this.f393209q;
                    if (aVar != null) {
                        android.view.View inflate = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
                        aVar.D0 = (android.view.ViewGroup) inflate;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
                    }
                    ((r74.a) baseViewHolder).f169290q = true;
                }
            } else if (!((r74.a) baseViewHolder).f169290q) {
                r74.a aVar2 = this.f393209q;
                if (aVar2 != null) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((r74.a) baseViewHolder).f169272h.findViewById(com.tencent.mm.R.id.f486975n22);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
                    aVar2.D0 = viewGroup;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
                }
                ((r74.a) baseViewHolder).f169290q = true;
            }
            android.view.ViewStub viewStub2 = (android.view.ViewStub) ((r74.a) baseViewHolder).f169272h.findViewById(com.tencent.mm.R.id.g6y);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComplianceManagementViewStub", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
            ((r74.a) baseViewHolder).F0 = viewStub2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComplianceManagementViewStub", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
            r74.a aVar3 = (r74.a) baseViewHolder;
            android.view.ViewStub viewStub3 = (android.view.ViewStub) ((r74.a) baseViewHolder).f169272h.findViewById(com.tencent.mm.R.id.n4i);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdLivingContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
            aVar3.G0 = viewStub3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdLivingContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ee, code lost:
    
        if (r10 != null) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r29, int r30, com.tencent.mm.plugin.sns.ui.ns r31, com.tencent.mm.protocal.protobuf.TimeLineObject r32, int r33, com.tencent.mm.plugin.sns.ui.bs r34) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r74.k.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // xd4.d
    public void pause() {
        r74.a0 a0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        com.tencent.mars.xlog.Log.i("AdCombineGridCardItem", "pause");
        if (G() && (a0Var = this.f393216x) != null) {
            a0Var.m(r74.l.f393222g);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        com.tencent.mars.xlog.Log.i("AdCombineGridCardItem", "%s GridCardAd stop", this);
        this.f393212t = false;
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(this.f393210r) && (vVar = this.B) != null) {
            vVar.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return "AdCombineGridCardItem";
    }
}
