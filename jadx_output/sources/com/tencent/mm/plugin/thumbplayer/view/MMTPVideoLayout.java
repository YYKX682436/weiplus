package com.tencent.mm.plugin.thumbplayer.view;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u00014B\u001b\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100B#\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b/\u00103J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R2\u0010*\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00065"}, d2 = {"Lcom/tencent/mm/plugin/thumbplayer/view/MMTPVideoLayout;", "Landroid/widget/FrameLayout;", "Lkk4/d;", "Ldk4/a;", "mediaInfo", "Ljz5/f0;", "setMediaInfo", "", "enable", "setEnableEffect", "Lkk4/b;", "e", "Lkk4/b;", "getPlayer", "()Lkk4/b;", "setPlayer", "(Lkk4/b;)V", "player", "Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "f", "Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "getTextureView", "()Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "setTextureView", "(Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;)V", "textureView", "Lgk4/b;", "g", "Lgk4/b;", "getEffector", "()Lgk4/b;", "setEffector", "(Lgk4/b;)V", "effector", "Lkotlin/Function1;", "Landroid/graphics/SurfaceTexture;", "o", "Lyz5/l;", "getOnFrameAvailable", "()Lyz5/l;", "setOnFrameAvailable", "(Lyz5/l;)V", "onFrameAvailable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pk4/o", "plugin-thumbplayer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MMTPVideoLayout extends android.widget.FrameLayout implements kk4.d {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f174542p = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f174543d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public kk4.b player;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView textureView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public gk4.b effector;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.SurfaceTexture f174547h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f174548i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.SurfaceTexture f174549m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.Surface f174550n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public yz5.l onFrameAvailable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMTPVideoLayout(android.content.Context context, boolean z17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f174543d = "MicroMsg.TP.MMTPVideoLayout@" + hashCode();
        this.effector = new gk4.h0();
        this.f174548i = true;
        a(z17);
    }

    public final void a(boolean z17) {
        if (z17) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kk4.v vVar = new kk4.v(context);
            gk4.h0 h0Var = (gk4.h0) getEffector();
            h0Var.getClass();
            vVar.F(new gk4.w(h0Var));
            setPlayer(vVar);
        }
        setTextureView(new com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView(getContext()));
        getTextureView().setAlpha(1.0f);
        if (this.f174548i) {
            b();
        }
    }

    public final void b() {
        ((gk4.h0) getEffector()).d(new pk4.p(this));
        gk4.b effector = getEffector();
        pk4.q qVar = new pk4.q(this);
        gk4.h0 h0Var = (gk4.h0) effector;
        h0Var.getClass();
        h0Var.D = qVar;
    }

    public void c() {
        int i17;
        int i18;
        dk4.a aVar;
        dk4.a aVar2;
        if (getTextureView().getParent() != null) {
            removeView(getTextureView());
        }
        getTextureView().setTextureListenerCallback(new pk4.o(this));
        if (this.f174548i) {
            getTextureView().setScaleType(2);
            i18 = -1;
            i17 = -1;
        } else {
            ck4.c cVar = ck4.c.f42548a;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kk4.b player = getPlayer();
            int i19 = (player == null || (aVar2 = ((kk4.v) player).f308578c) == null) ? 0 : aVar2.f234485v;
            kk4.b player2 = getPlayer();
            android.os.Bundle a17 = cVar.a(context, i19, (player2 == null || (aVar = ((kk4.v) player2).f308578c) == null) ? 0 : aVar.f234486w);
            int i27 = a17.getInt("width", 0);
            int i28 = a17.getInt("height", 0);
            getTextureView().m(i27, i28);
            i17 = i28;
            i18 = i27;
        }
        addView(getTextureView(), new android.widget.FrameLayout.LayoutParams(i18, i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initTextureView() ");
        kk4.b player3 = getPlayer();
        sb6.append(player3 != null ? ((kk4.v) player3).w() : null);
        sb6.append(", layout size:[");
        sb6.append(getWidth());
        sb6.append(',');
        sb6.append(getHeight());
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(this.f174543d, sb6.toString());
    }

    public void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recreatePlayer, this.player:");
        kk4.b player = getPlayer();
        sb6.append(player != null ? player.hashCode() : 0);
        sb6.append(", mediaInfo:");
        kk4.b player2 = getPlayer();
        sb6.append(player2 != null ? ((kk4.v) player2).f308578c : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f174543d;
        com.tencent.mars.xlog.Log.i(str, sb7);
        kk4.b player3 = getPlayer();
        if (player3 != null) {
            ((kk4.v) player3).R();
        }
        kk4.b player4 = getPlayer();
        if (player4 != null) {
            kk4.b.e(player4, null, 1, null);
        }
        kk4.b player5 = getPlayer();
        if (player5 != null) {
            ((kk4.v) player5).P();
        }
        kk4.b player6 = getPlayer();
        if (player6 != null) {
            player6.recycle();
        }
        setPlayer(null);
        android.view.Surface surface = this.f174550n;
        if (surface != null) {
            surface.release();
        }
        this.f174550n = null;
        this.f174549m = null;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kk4.v vVar = new kk4.v(context);
        gk4.h0 h0Var = (gk4.h0) getEffector();
        h0Var.getClass();
        vVar.F(new gk4.w(h0Var));
        setPlayer(vVar);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("recreatePlayer finished, this.player:");
        kk4.b player7 = getPlayer();
        sb8.append(player7 != null ? player7.hashCode() : 0);
        sb8.append(", playerSurface:");
        sb8.append(this.f174550n);
        com.tencent.mars.xlog.Log.i(str, sb8.toString());
    }

    @Override // kk4.d
    public gk4.b getEffector() {
        return this.effector;
    }

    public yz5.l getOnFrameAvailable() {
        return this.onFrameAvailable;
    }

    @Override // kk4.d
    public kk4.b getPlayer() {
        return this.player;
    }

    public final com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView getTextureView() {
        com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView mMThumbPlayerTextureView = this.textureView;
        if (mMThumbPlayerTextureView != null) {
            return mMThumbPlayerTextureView;
        }
        kotlin.jvm.internal.o.o("textureView");
        throw null;
    }

    public void setEffector(gk4.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<set-?>");
        this.effector = bVar;
    }

    public void setEnableEffect(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f174543d, "setEnableEffect:" + z17 + ", surfaceTexture:" + this.f174547h);
        if (this.f174548i != z17) {
            this.f174548i = z17;
            if (z17) {
                getTextureView().setScaleType(2);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                if (getTextureView().getParent() == null) {
                    addView(getTextureView(), layoutParams);
                } else {
                    getTextureView().setLayoutParams(layoutParams);
                    getTextureView().requestLayout();
                }
                b();
            }
        }
    }

    @Override // kk4.d
    public void setMediaInfo(dk4.a mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kk4.b player = getPlayer();
        if (player != null) {
            ((kk4.v) player).B(mediaInfo);
        }
        com.tencent.mars.xlog.Log.i(this.f174543d, "setMediaInfo:" + mediaInfo);
        gk4.h0 h0Var = (gk4.h0) getEffector();
        h0Var.getClass();
        h0Var.f272565j = mediaInfo.f234485v;
        h0Var.f272566k = mediaInfo.f234486w;
        h0Var.f272580y = mediaInfo;
        h0Var.A = mediaInfo.f234470g;
        com.tencent.mars.xlog.Log.i(h0Var.f272556a, "setMediaInfo, size:[" + h0Var.f272565j + ',' + h0Var.f272566k + "], totalDurationMs:" + h0Var.A);
        getTextureView().m(mediaInfo.f234485v, mediaInfo.f234486w);
        android.view.Surface surface = this.f174550n;
        if (surface != null) {
            surface.release();
        }
        this.f174550n = null;
        this.f174549m = null;
        gk4.b effector = getEffector();
        pk4.r rVar = new pk4.r(this);
        gk4.h0 h0Var2 = (gk4.h0) effector;
        h0Var2.getClass();
        h0Var2.e(new gk4.b0(h0Var2, rVar));
    }

    @Override // kk4.d
    public void setOnFrameAvailable(yz5.l lVar) {
        this.onFrameAvailable = lVar;
    }

    public void setPlayer(kk4.b bVar) {
        this.player = bVar;
    }

    public final void setTextureView(com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView mMThumbPlayerTextureView) {
        kotlin.jvm.internal.o.g(mMThumbPlayerTextureView, "<set-?>");
        this.textureView = mMThumbPlayerTextureView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMTPVideoLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f174543d = "MicroMsg.TP.MMTPVideoLayout@" + hashCode();
        this.effector = new gk4.h0();
        this.f174548i = true;
        a(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMTPVideoLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f174543d = "MicroMsg.TP.MMTPVideoLayout@" + hashCode();
        this.effector = new gk4.h0();
        this.f174548i = true;
        a(true);
    }
}
