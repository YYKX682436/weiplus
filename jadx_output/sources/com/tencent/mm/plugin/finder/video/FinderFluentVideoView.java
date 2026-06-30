package com.tencent.mm.plugin.finder.video;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001dJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0016J\u001e\u0010\f\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nH\u0016J\u0018\u0010\r\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0016R*\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderFluentVideoView;", "Lcom/tencent/mm/plugin/finder/video/FinderAutoSeekTPProxy;", "Lzy2/p7;", "Landroid/view/Surface;", "surface", "Ljz5/f0;", "setRenderSurface", "Lkotlin/Function0;", "callback", "setFirstVideoFrameRenderedAfterSurfaceChange", "Lkotlin/Function1;", "", "setFluentSwitchCompleteCallback", "setPlayStopCallback", "", "value", "t2", "Z", "isFluentView", "()Z", "setFluentView", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderFluentVideoView extends com.tencent.mm.plugin.finder.video.FinderAutoSeekTPProxy implements zy2.p7 {

    /* renamed from: m2, reason: collision with root package name */
    public final int f130529m2;

    /* renamed from: n2, reason: collision with root package name */
    public final ew2.f f130530n2;

    /* renamed from: o2, reason: collision with root package name */
    public boolean f130531o2;

    /* renamed from: p2, reason: collision with root package name */
    public boolean f130532p2;

    /* renamed from: q2, reason: collision with root package name */
    public boolean f130533q2;

    /* renamed from: r2, reason: collision with root package name */
    public boolean f130534r2;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f130535s2;

    /* renamed from: t2, reason: collision with root package name and from kotlin metadata */
    public boolean isFluentView;

    /* renamed from: u2, reason: collision with root package name */
    public boolean f130537u2;

    /* renamed from: v2, reason: collision with root package name */
    public yz5.a f130538v2;

    /* renamed from: w2, reason: collision with root package name */
    public yz5.l f130539w2;

    /* renamed from: x2, reason: collision with root package name */
    public yz5.a f130540x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFluentVideoView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ae).getValue()).r()).intValue();
        this.f130529m2 = intValue;
        if (intValue == 2) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                ew2.f fVar = new ew2.f();
                fVar.d();
                this.f130530n2 = fVar;
            } else {
                try {
                    ew2.f fVar2 = new ew2.f();
                    fVar2.d();
                    this.f130530n2 = fVar2;
                } catch (java.lang.Throwable th6) {
                    ew2.f fVar3 = this.f130530n2;
                    if (fVar3 != null) {
                        fVar3.c();
                    }
                    this.f130530n2 = null;
                    com.tencent.mars.xlog.Log.e("FinderFluentVideoView", "create FinderGLRender " + th6);
                }
            }
        }
        setLifecycle(new cw2.c1(this));
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.g5
    public boolean J(java.lang.Integer num) {
        zy2.ub videoViewCallback;
        cw2.wa mediaSource;
        cw2.i9 lifecycle;
        cw2.i9 lifecycle2;
        if (!this.f130531o2) {
            return super.J(num);
        }
        setFirstStart(true);
        boolean J2 = super.J(num);
        if (this.f130532p2) {
            kz2.a r17 = getR();
            if (r17 != null) {
                r17.c("onPrepared");
            }
            zy2.ub videoViewCallback2 = getVideoViewCallback();
            if (videoViewCallback2 != null) {
                cw2.wa mediaSource2 = getMediaSource();
                videoViewCallback2.o("", mediaSource2 != null ? mediaSource2.f224096c : null);
            }
            cw2.wa mediaSource3 = getMediaSource();
            if (mediaSource3 != null && (lifecycle2 = getLifecycle()) != null) {
                com.tencent.mm.plugin.finder.storage.FeedData feedData = mediaSource3.f224099f;
                lifecycle2.C(new nk4.q(feedData.getExpectId(), ((kk4.f0) getPlayer()).f308532h, android.os.SystemClock.uptimeMillis(), feedData.getDupFlag()));
            }
        }
        if (this.f130535s2) {
            zy2.ub videoViewCallback3 = getVideoViewCallback();
            if (videoViewCallback3 != null) {
                cw2.wa mediaSource4 = getMediaSource();
                videoViewCallback3.l("", mediaSource4 != null ? mediaSource4.f224096c : null);
            }
            cw2.i9 lifecycle3 = getLifecycle();
            if (lifecycle3 != null) {
                cw2.wa mediaSource5 = getMediaSource();
                lifecycle3.h(mediaSource5 != null ? mediaSource5.f224097d : null);
            }
        }
        if (this.f130534r2) {
            kz2.a r18 = getR();
            if (r18 != null) {
                r18.b("onRendered");
            }
            cw2.i9 lifecycle4 = getLifecycle();
            if (lifecycle4 != null) {
                cw2.wa mediaSource6 = getMediaSource();
                lifecycle4.D(mediaSource6 != null ? mediaSource6.f224097d : null, ((kk4.f0) getPlayer()).f308532h);
            }
            cw2.i9 lifecycle5 = getLifecycle();
            if (lifecycle5 != null) {
                cw2.wa mediaSource7 = getMediaSource();
                lifecycle5.u(mediaSource7 != null ? mediaSource7.f224097d : null, 0L, getR());
            }
        }
        if (this.f130533q2 && (mediaSource = getMediaSource()) != null && (lifecycle = getLifecycle()) != null) {
            com.tencent.mm.plugin.finder.storage.FeedData feedData2 = mediaSource.f224099f;
            lifecycle.p(new nk4.j(feedData2.getExpectId(), android.os.SystemClock.uptimeMillis(), feedData2.getDupFlag()));
        }
        if (this.isBuffering && (videoViewCallback = getVideoViewCallback()) != null) {
            videoViewCallback.N5("", getVideoMediaId(), java.lang.Boolean.valueOf(this.isSeeking));
        }
        this.f130531o2 = false;
        return J2;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy
    public void N() {
        ((kk4.f0) getPlayer()).setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildInt(451, 0));
        ((kk4.f0) getPlayer()).setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildBoolean(101, true));
        ((kk4.f0) getPlayer()).setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildString(452, "assets/shaders"));
        int i17 = this.f130529m2;
        if (i17 == 0 || i17 == 1) {
            ((kk4.f0) getPlayer()).setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildBoolean(445, true));
        }
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy
    public void R() {
        pm0.v.V(0L, new cw2.d1(this));
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderAutoSeekTPProxy, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, cw2.da
    public /* bridge */ /* synthetic */ android.widget.ImageView getCoverImage() {
        return null;
    }

    public void q0() {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "quitFluent");
        this.f130531o2 = false;
        c61.s9 s9Var = (c61.s9) i95.n0.c(c61.s9.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        cw2.wa mediaSource = getMediaSource();
        sb6.append(pm0.v.u((mediaSource == null || (feedData = mediaSource.f224099f) == null) ? 0L : feedData.getFeedId()));
        sb6.append('_');
        sb6.append(hashCode());
        s9Var.Vi(sb6.toString());
    }

    public void r0() {
        java.lang.Object renderView = getRenderView();
        android.view.View view = renderView instanceof android.view.View ? (android.view.View) renderView : null;
        android.view.ViewParent parent = view != null ? view.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            java.lang.Object renderView2 = getRenderView();
            viewGroup.removeView(renderView2 instanceof android.view.View ? (android.view.View) renderView2 : null);
            java.lang.Object renderView3 = getRenderView();
            viewGroup.addView(renderView3 instanceof android.view.View ? (android.view.View) renderView3 : null);
        }
        android.view.Surface surface = getSurface();
        if (surface != null) {
            surface.release();
        }
        setSurface(null);
        setCurrSurfaceTexture(null);
    }

    @Override // zy2.p7
    public void setFirstVideoFrameRenderedAfterSurfaceChange(yz5.a aVar) {
        this.f130538v2 = aVar;
    }

    @Override // zy2.p7
    public void setFluentSwitchCompleteCallback(yz5.l lVar) {
        this.f130539w2 = lVar;
    }

    @Override // zy2.p7
    public void setFluentView(boolean z17) {
        this.isFluentView = z17;
    }

    public void setPlayStopCallback(yz5.a aVar) {
        this.f130540x2 = aVar;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.p7
    public void setRenderSurface(android.view.Surface surface) {
        setSurface(surface);
        int i17 = this.f130529m2;
        if (i17 != 0 && i17 != 2) {
            ((kk4.f0) getPlayer()).switchHdrModeWithSurface(surface, 1);
            return;
        }
        jz5.f0 f0Var = null;
        android.view.Surface surface2 = null;
        if (surface == null) {
            ((kk4.f0) getPlayer()).setSurface(null);
            return;
        }
        ew2.f fVar = this.f130530n2;
        if (fVar != null) {
            if (fVar != null) {
                fVar.f257042b.post(new ew2.e(fVar, new cw2.f1(this), surface));
            }
            if (!this.f130537u2) {
                kk4.c player = getPlayer();
                if (fVar != null) {
                    fVar.f257048h.await();
                    ew2.h hVar = fVar.f257047g;
                    kotlin.jvm.internal.o.d(hVar);
                    surface2 = hVar.f257062f;
                }
                ((kk4.f0) player).setSurface(surface2);
                this.f130537u2 = true;
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            super.setRenderSurface(surface);
        }
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderAutoSeekTPProxy, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.g5
    public void stop() {
        super.stop();
        yz5.a aVar = this.f130540x2;
        if (aVar != null) {
            aVar.invoke();
        }
        ew2.f fVar = this.f130530n2;
        if (fVar != null) {
            fVar.c();
        }
        this.f130539w2 = null;
        this.f130540x2 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFluentVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ae).getValue()).r()).intValue();
        this.f130529m2 = intValue;
        if (intValue == 2) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                ew2.f fVar = new ew2.f();
                fVar.d();
                this.f130530n2 = fVar;
            } else {
                try {
                    ew2.f fVar2 = new ew2.f();
                    fVar2.d();
                    this.f130530n2 = fVar2;
                } catch (java.lang.Throwable th6) {
                    ew2.f fVar3 = this.f130530n2;
                    if (fVar3 != null) {
                        fVar3.c();
                    }
                    this.f130530n2 = null;
                    com.tencent.mars.xlog.Log.e("FinderFluentVideoView", "create FinderGLRender " + th6);
                }
            }
        }
        setLifecycle(new cw2.c1(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFluentVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ae).getValue()).r()).intValue();
        this.f130529m2 = intValue;
        if (intValue == 2) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                ew2.f fVar = new ew2.f();
                fVar.d();
                this.f130530n2 = fVar;
            } else {
                try {
                    ew2.f fVar2 = new ew2.f();
                    fVar2.d();
                    this.f130530n2 = fVar2;
                } catch (java.lang.Throwable th6) {
                    ew2.f fVar3 = this.f130530n2;
                    if (fVar3 != null) {
                        fVar3.c();
                    }
                    this.f130530n2 = null;
                    com.tencent.mars.xlog.Log.e("FinderFluentVideoView", "create FinderGLRender " + th6);
                }
            }
        }
        setLifecycle(new cw2.c1(this));
    }
}
