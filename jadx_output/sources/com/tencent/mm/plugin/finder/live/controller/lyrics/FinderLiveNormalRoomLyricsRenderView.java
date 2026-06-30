package com.tencent.mm.plugin.finder.live.controller.lyrics;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveNormalRoomLyricsRenderView;", "Landroid/widget/FrameLayout;", "Lnh2/b;", "Lph2/d;", "", "getCurrentTime", "Lmy5/a;", "getCurrentLyric", "Lnf2/j1;", "alignment", "Ljz5/f0;", "setHorizontalAlignment", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveNormalRoomLyricsRenderView extends android.widget.FrameLayout implements nh2.b, ph2.d {

    /* renamed from: d, reason: collision with root package name */
    public nf2.f1 f111590d;

    /* renamed from: e, reason: collision with root package name */
    public pf2.b f111591e;

    /* renamed from: f, reason: collision with root package name */
    public my5.a f111592f;

    /* renamed from: g, reason: collision with root package name */
    public nh2.c f111593g;

    /* renamed from: h, reason: collision with root package name */
    public ph2.e f111594h;

    /* renamed from: i, reason: collision with root package name */
    public int f111595i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f111596m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveNormalRoomLyricsRenderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // nh2.b
    public void a() {
        com.tencent.mars.xlog.Log.i("NormalRoomLyricsRenderView", "onViewChanged");
    }

    @Override // ph2.d
    public void b() {
        pf2.b bVar;
        try {
            nh2.c cVar = this.f111593g;
            if (cVar == null) {
                kotlin.jvm.internal.o.o("renderView");
                throw null;
            }
            android.graphics.Canvas lockCanvas = ((nh2.j) cVar).lockCanvas();
            if (lockCanvas != null) {
                lockCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                int i17 = this.f111595i;
                if (i17 >= 0 && (bVar = this.f111591e) != null) {
                    bVar.a(lockCanvas, i17, getMeasuredWidth(), getMeasuredHeight());
                }
                nh2.c cVar2 = this.f111593g;
                if (cVar2 != null) {
                    ((nh2.j) cVar2).unlockCanvasAndPost(lockCanvas);
                } else {
                    kotlin.jvm.internal.o.o("renderView");
                    throw null;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("NormalRoomLyricsRenderView", th6, "draw error", new java.lang.Object[0]);
        }
    }

    @Override // nh2.b
    public void c() {
        com.tencent.mars.xlog.Log.i("NormalRoomLyricsRenderView", "onViewCreated");
        if (this.f111596m) {
            ph2.e eVar = this.f111594h;
            if (eVar != null) {
                eVar.c();
            } else {
                kotlin.jvm.internal.o.o("drawerLooper");
                throw null;
            }
        }
    }

    @Override // nh2.b
    public void d() {
        com.tencent.mars.xlog.Log.i("NormalRoomLyricsRenderView", "onViewDestroyed");
        ph2.e eVar = this.f111594h;
        if (eVar != null) {
            ((ph2.c) eVar).a();
        } else {
            kotlin.jvm.internal.o.o("drawerLooper");
            throw null;
        }
    }

    public final void e() {
        int color = getContext().getResources().getColor(this.f111590d.f336719a);
        nf2.l1 l1Var = this.f111590d.f336736r;
        kotlin.jvm.internal.o.f(getContext(), "getContext(...)");
        l1Var.getClass();
        pf2.b bVar = this.f111591e;
        int i17 = l1Var.f336775d;
        if (bVar != null) {
            bVar.c(color, i17);
        }
        com.tencent.mars.xlog.Log.i("NormalRoomLyricsRenderView", "applyConfig: normal=" + color + ", highlight=" + i17);
    }

    public final void f(my5.a lyric) {
        kotlin.jvm.internal.o.g(lyric, "lyric");
        this.f111592f = lyric;
        pf2.b bVar = this.f111591e;
        if (bVar != null) {
            bVar.b(lyric);
        }
        com.tencent.mars.xlog.Log.i("NormalRoomLyricsRenderView", "bindLyrics: size=" + lyric.b());
    }

    public final void g() {
        pf2.b aVar;
        pf2.b bVar = this.f111591e;
        if (bVar != null) {
            bVar.release();
        }
        int ordinal = this.f111590d.f336733o.ordinal();
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i("NormalRoomLyricsRenderView", "createRenderer: HORIZONTAL");
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            aVar = new pf2.a(context);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            com.tencent.mars.xlog.Log.i("NormalRoomLyricsRenderView", "createRenderer: VERTICAL with rotateCharsPattern=" + this.f111590d.f336734p);
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            aVar = new pf2.c(context2, this.f111590d.f336734p);
        }
        this.f111591e = aVar;
        e();
        my5.a aVar2 = this.f111592f;
        if (aVar2 != null) {
            pf2.b bVar2 = this.f111591e;
            if (bVar2 != null) {
                bVar2.b(aVar2);
            }
            com.tencent.mars.xlog.Log.i("NormalRoomLyricsRenderView", "createRenderer: re-bind lyrics to new renderer");
        }
    }

    /* renamed from: getCurrentLyric, reason: from getter */
    public final my5.a getF111592f() {
        return this.f111592f;
    }

    /* renamed from: getCurrentTime, reason: from getter */
    public final int getF111595i() {
        return this.f111595i;
    }

    public final void h() {
        if (this.f111596m) {
            return;
        }
        this.f111595i = 0;
        ph2.e eVar = this.f111594h;
        if (eVar == null) {
            kotlin.jvm.internal.o.o("drawerLooper");
            throw null;
        }
        ((ph2.c) eVar).c();
        this.f111596m = true;
        com.tencent.mars.xlog.Log.i("NormalRoomLyricsRenderView", "startRender");
    }

    public final void i() {
        ph2.e eVar = this.f111594h;
        if (eVar == null) {
            kotlin.jvm.internal.o.o("drawerLooper");
            throw null;
        }
        ((ph2.c) eVar).a();
        pf2.b bVar = this.f111591e;
        if (bVar != null) {
            bVar.reset();
        }
        this.f111595i = 0;
        this.f111596m = false;
        com.tencent.mars.xlog.Log.i("NormalRoomLyricsRenderView", "stopRender");
    }

    public final void j(nf2.f1 newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        nf2.f1 f1Var = this.f111590d;
        nf2.k1 k1Var = f1Var.f336733o;
        nf2.k1 k1Var2 = newConfig.f336733o;
        boolean z17 = k1Var != k1Var2;
        this.f111590d = newConfig;
        if (z17) {
            com.tencent.mars.xlog.Log.i("NormalRoomLyricsRenderView", "updateConfig: render direction changed from " + f1Var.f336733o + " to " + k1Var2);
            setAlpha(0.0f);
            animate().alpha(1.0f).setDuration(this.f111590d.f336735q).start();
            g();
        } else {
            e();
        }
        invalidate();
    }

    public final void setHorizontalAlignment(nf2.j1 alignment) {
        kotlin.jvm.internal.o.g(alignment, "alignment");
        pf2.b bVar = this.f111591e;
        if (bVar != null) {
            bVar.d(alignment);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveNormalRoomLyricsRenderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f111590d = new nf2.f1(0, 0.0f, false, 0L, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, nf2.a.f336648e, nf2.k1.f336767d, null, 0L, null, 237567, null);
        android.view.TextureView textureView = new android.view.TextureView(getContext());
        textureView.setOpaque(false);
        addView(textureView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        nh2.j jVar = new nh2.j(textureView, null);
        this.f111593g = jVar;
        jVar.a(this);
        ph2.c cVar = new ph2.c();
        cVar.f354379d = this;
        this.f111594h = cVar;
        g();
        com.tencent.mars.xlog.Log.i("NormalRoomLyricsRenderView", "initView completed with config=" + this.f111590d);
    }
}
