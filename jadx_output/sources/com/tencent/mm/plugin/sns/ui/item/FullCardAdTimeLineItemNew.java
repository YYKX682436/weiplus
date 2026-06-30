package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class FullCardAdTimeLineItemNew extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem implements xd4.d, i64.k0, androidx.lifecycle.x, com.tencent.mm.plugin.sns.ui.y4 {
    public k84.d4 A;
    public final android.view.View.OnClickListener B;
    public boolean C;
    public final u74.e D;
    public fd4.l E;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.item.y f169311r;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f169314u;

    /* renamed from: v, reason: collision with root package name */
    public int f169315v;

    /* renamed from: w, reason: collision with root package name */
    public final u74.f f169316w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.n f169317x;

    /* renamed from: y, reason: collision with root package name */
    public k84.q1 f169318y;

    /* renamed from: z, reason: collision with root package name */
    public p44.z f169319z;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Handler f169310q = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f169312s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f169313t = false;

    public FullCardAdTimeLineItemNew() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFullCardAdWrapper", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        u74.f fVar = new u74.f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullCardAdWrapper", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        this.f169316w = fVar;
        this.B = new ed4.l(this);
        this.C = false;
        this.D = new ed4.o(this);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    private void onUIDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "onUIDestroy, hash=" + hashCode());
        fd4.l lVar = this.E;
        if (lVar != null) {
            lVar.d();
        }
        p84.e eVar = this.f169316w.f425173h;
        if (eVar != null) {
            eVar.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    public boolean F() {
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        int i17 = this.f169311r.timeLineObject.ContentObj.f369837e;
        if (i17 != 5 && i17 != 15) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "doPause, hash=" + hashCode());
        k84.d4 d4Var = this.A;
        if (d4Var != null && d4Var.n(this.f169314u)) {
            k84.d4 d4Var2 = this.A;
            d4Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            com.tencent.mars.xlog.Log.i(d4Var2.j(), "onPause");
            ((kotlinx.coroutines.flow.h3) d4Var2.O).k(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        }
        com.tencent.mm.plugin.sns.ui.item.y yVar = this.f169311r;
        if (yVar != null) {
            u74.d dVar = yVar.D0;
            if (dVar.f425154o != null) {
                u74.f fVar = this.f169316w;
                boolean z17 = dVar.T.f425133c;
                fVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                fVar.h(z17, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f169314u;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                com.tencent.mm.plugin.sns.ui.bs bsVar = this.f169251h;
                if (bsVar != null && (l1Var = bsVar.f168036b) != null && (b1Var = l1Var.f169702c) != null && snsInfo != null) {
                    b1Var.q(snsInfo.field_snsId);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchVideoPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                fd4.l lVar = this.E;
                if (lVar != null) {
                    lVar.onVideoPause();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchVideoPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            }
        }
        this.f169312s = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.y4
    public void F3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        p44.z zVar = this.f169319z;
        if (zVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
            com.tencent.mars.xlog.Log.i("RandomPickCardLogic", "onScrollIdle");
            zVar.f351873l.m();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEndViewShow", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEndViewShow", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    public fd4.l H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return null;
    }

    public final void I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f169314u;
        boolean z17 = snsInfo != null && (snsInfo.isBreakFrameAd() || this.f169314u.isAdIpInteractVideo() || this.f169314u.isSolidBreakFrameAd());
        com.tencent.mm.plugin.sns.ui.item.y yVar = this.f169311r;
        if (yVar != null && yVar.D0.f425154o != null && !this.f169312s) {
            u74.d dVar = this.f169311r.D0;
            if (!dVar.T.f425132b && !z17) {
                dVar.f425154o.f168419i.setVisibility(0);
                this.f169311r.D0.f425154o.f168420j.setVisibility(8);
                this.f169311r.D0.f425154o.f168419i.setImageDrawable(i65.a.i(this.f169249f, com.tencent.mm.R.raw.shortvideo_play_btn));
                this.f169311r.D0.f425154o.f168419i.setContentDescription(this.f169249f.getString(com.tencent.mm.R.string.hjf));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    public boolean J(com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        boolean m17 = u74.f.m(aDXml);
        if (!this.C) {
            this.C = true;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, m17 ? 4 : 3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return m17;
    }

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView snsAdCardVideoEndView;
        com.tencent.mm.plugin.sns.ui.g9 g9Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        int i18 = baseViewHolder.timeLineObject.ContentObj.f369837e;
        if (i18 == 5 || i18 == 15) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "play: hash=" + hashCode() + ", pos=" + i17 + ", isEndViewShow=" + this.f169313t + ", isPlayingSight=" + this.f169312s);
            xd4.o0.d().j();
            xd4.g.a().d(this);
            k84.d4 d4Var = this.A;
            if (d4Var != null && d4Var.n(this.f169314u)) {
                k84.d4 d4Var2 = this.A;
                d4Var2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                com.tencent.mars.xlog.Log.i(d4Var2.j(), "onPlay");
                ((kotlinx.coroutines.flow.h3) d4Var2.O).k(java.lang.Boolean.TRUE);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            }
            if (!this.f169313t && (baseViewHolder instanceof com.tencent.mm.plugin.sns.ui.item.y)) {
                this.f169316w.l(((com.tencent.mm.plugin.sns.ui.item.y) baseViewHolder).D0.T.f425133c);
                fd4.l lVar = this.E;
                if (lVar != null) {
                    lVar.c();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            com.tencent.mm.plugin.sns.ui.item.y yVar = this.f169311r;
            if (yVar != null && (g9Var = yVar.D0.f425154o) != null) {
                g9Var.f168419i.setVisibility(8);
                this.f169311r.D0.f425154o.f168420j.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            this.f169312s = true;
            if (baseViewHolder instanceof com.tencent.mm.plugin.sns.ui.item.y) {
                ((com.tencent.mm.plugin.sns.ui.item.y) baseViewHolder).D0.T.f425132b = false;
            }
            if (!this.f169313t && (snsAdCardVideoEndView = this.f169311r.D0.f425155p) != null && snsAdCardVideoEndView.getVisibility() == 0) {
                this.f169311r.D0.f425155p.c(true);
            }
            p44.z zVar = this.f169319z;
            if (zVar != null) {
                zVar.g();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "onAdRemoved, snsId=" + str + ", hash=" + hashCode());
        fd4.l lVar = this.E;
        if (lVar != null) {
            lVar.j();
        }
        p84.e eVar = this.f169316w.f425173h;
        if (eVar != null) {
            eVar.a();
        }
        p44.z zVar = this.f169319z;
        if (zVar != null) {
            zVar.f();
        }
        java.lang.String T = ca4.z0.T(this.f169314u);
        if (T != null && !T.equals(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FullCardAdTimeLineItemNew", "onAdRemoved, curSnsId=" + T + ", snsId=" + str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 123);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "onUIPause");
        F();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.ui.item.y yVar = this.f169311r;
        if (yVar == null || (view = yVar.D0.f425165z) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, this.f169311r.D0.f425165z.getMeasuredWidth() + i17, this.f169311r.D0.f425165z.getMeasuredHeight() + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return rect;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        android.view.View findViewById;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        java.lang.System.currentTimeMillis();
        this.f169311r = (com.tencent.mm.plugin.sns.ui.item.y) baseViewHolder;
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) != null) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.f489523cu2);
            if (!baseViewHolder.f169290q) {
                findViewById = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                baseViewHolder.f169290q = true;
            }
            findViewById = null;
        } else {
            if (!baseViewHolder.f169290q) {
                findViewById = baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.ggo);
                baseViewHolder.f169290q = true;
            }
            findViewById = null;
        }
        com.tencent.mm.plugin.sns.ui.item.y yVar = this.f169311r;
        yVar.D0 = u74.f.g(yVar.f169272h);
        com.tencent.mm.plugin.sns.ui.item.y yVar2 = this.f169311r;
        u74.d dVar = yVar2.D0;
        u74.c cVar = dVar.T;
        boolean z17 = this.f169247d;
        cVar.f425137g = z17;
        dVar.f425165z = findViewById;
        cVar.f425131a = 0;
        dVar.f425163x = yVar2.f169301v0;
        dVar.f425164y = yVar2.f169305x0;
        yVar2.f169269f0 = dVar.f425154o;
        this.f169315v = ca4.m0.y("MicroMsg.FullCardAdTimeLineItemNew", this.f169249f, 0, z17);
        u74.f fVar = this.f169316w;
        u74.e eVar = this.D;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWraperInterface", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        fVar.f425175j = eVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWraperInterface", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        this.f169316w.f(this.f169311r.D0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBuildSubItemContent", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        if (this.E == null) {
            fd4.l H = H();
            this.E = H;
            if (H != null) {
                com.tencent.mm.plugin.sns.ui.l1 l1Var = this.f169251h.f168036b;
                H.i(this.f169249f, l1Var.f169702c, l1Var.f169722w, this.f169311r.D0, this.f169316w);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBuildSubItemContent", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        u74.c cVar2 = this.f169311r.D0.T;
        cVar2.f425135e = this.E;
        cVar2.f425136f = new com.tencent.mm.plugin.sns.ui.item.u(this);
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f169249f;
        if (componentCallbacks2 instanceof androidx.lifecycle.y) {
            ((androidx.lifecycle.y) componentCallbacks2).mo133getLifecycle().a(this);
        }
        java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.ui.item.v(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0437  */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r43, int r44, com.tencent.mm.plugin.sns.ui.ns r45, com.tencent.mm.protocal.protobuf.TimeLineObject r46, int r47, com.tencent.mm.plugin.sns.ui.bs r48) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "pause");
        if (F()) {
            I();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    @Override // xd4.d
    public void stop() {
        u74.d dVar;
        com.tencent.mm.plugin.sns.ui.g9 g9Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "stop, hash=" + hashCode());
        com.tencent.mm.plugin.sns.ui.item.y yVar = this.f169311r;
        if (yVar != null && (g9Var = (dVar = yVar.D0).f425154o) != null && !dVar.T.f425133c) {
            g9Var.f168417g.u();
        }
        this.f169312s = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return "FullCardAdTimeLineItemNew";
    }
}
