package com.tencent.mm.plugin.finder.replay;

@kotlin.Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0082\u0001\u0093\u0001B!\b\u0016\u0012\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001\u0012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001B*\b\u0016\u0012\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001\u0012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001\u0012\u0007\u0010\u0091\u0001\u001a\u00020\u0006¢\u0006\u0006\b\u008f\u0001\u0010\u0092\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\b\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\n\u0010'\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001fH\u0016J\u0010\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u001fH\u0016J\u0010\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u001fH\u0016J\n\u0010.\u001a\u0004\u0018\u00010!H\u0016J\u0010\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u001fH\u0016J\u0010\u00102\u001a\u00020\b2\u0006\u00101\u001a\u00020\u001fH\u0016J\u0010\u00105\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0016J\u0010\u00108\u001a\u00020\b2\u0006\u00107\u001a\u000206H\u0016J\u0006\u00109\u001a\u00020\u0006J\u0010\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u001fH\u0016J\u0010\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u001fH\u0016J\u0010\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0016J\u0012\u0010C\u001a\u00020\b2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010F\u001a\u00020\b2\u0006\u0010E\u001a\u00020DH\u0016J\u0012\u0010I\u001a\u00020\b2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016J\n\u0010K\u001a\u0004\u0018\u00010JH\u0016J\u0006\u0010L\u001a\u00020\u0004J\u000e\u0010O\u001a\u00020\b2\u0006\u0010N\u001a\u00020MR\"\u0010V\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010]\u001a\u00020M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010_\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010Q\u001a\u0004\b_\u0010S\"\u0004\b`\u0010UR\"\u0010b\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010Q\u001a\u0004\bb\u0010S\"\u0004\bc\u0010UR$\u0010k\u001a\u0004\u0018\u00010d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR6\u0010t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020\b\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010\u0081\u0001\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R,\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R&\u0010\u0089\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010Q\u001a\u0005\b\u0089\u0001\u0010S\"\u0005\b\u008a\u0001\u0010U¨\u0006\u0094\u0001"}, d2 = {"Lcom/tencent/mm/plugin/finder/replay/FinderLiveThumbPlayerProxy;", "Lcw2/da;", "Landroid/widget/FrameLayout;", "Lyb2/a;", "", "getProxyState", "", "status", "Ljz5/f0;", "setBgPrepareStatus", "key", "setDecryptionKey", "Lcw2/wa;", "getVideoMediaInfo", "Lls5/m;", "getEventDetector", "Lls5/k;", "getEventDetectorAdapter", "Landroid/graphics/Bitmap;", "getBitmap", "getVideoMediaId", "tag", "setContextTag", "Lcw2/y9;", "getVideoAdapter", "getContextTag", "getCurrentPlaySecond", "", "getCurrentPlayMs", "getVideoDuration", "getVideoDurationMs", "", "getVideoViewFocused", "Landroid/view/View;", "getVideoView", "getCurrentStartPlayMs", "getIsShouldPlayResume", "getIsNeverStart", "Landroid/view/ViewParent;", "getParentView", "shouldPlayResume", "setIsShouldPlayResume", "focused", "setVideoViewFocused", "isPreview", "setPreview", "getPlayerView", "isInterceptDetach", "setInterceptDetach", "isMute", "setMute", "Lzy2/ub;", "_callback", "setIMMVideoViewCallback", "Lcom/tencent/mm/pluginsdk/ui/e1;", "scaleType", "setScaleType", "getScaleType", "isShow", "setIsShowBasicControls", "loop", "setLoop", "Landroid/graphics/SurfaceTexture;", "texture", "setCustomSurfaceTexture", "Lcw2/fb;", "lifecycle", "setVideoPlayLifecycle", "Lcw2/xa;", "muteListener", "setVideoMuteListener", "Lkz2/a;", "videoPlayTrace", "setFinderVideoPlayTrace", "", "getPlayer", "getFTPPTag", "", "ratio", "setPlaySpeed", "C", "Z", "y", "()Z", "setPreloadedView", "(Z)V", "isPreloadedView", "G", "F", "getPlaySpeedRatio", "()F", "setPlaySpeedRatio", "(F)V", "playSpeedRatio", "H", "isViewFocused", "setViewFocused", "I", "isShouldPlayResume", "setShouldPlayResume", "Lcom/tencent/mm/pluginsdk/ui/b1;", "J", "Lcom/tencent/mm/pluginsdk/ui/b1;", "getVideoViewCallback", "()Lcom/tencent/mm/pluginsdk/ui/b1;", "setVideoViewCallback", "(Lcom/tencent/mm/pluginsdk/ui/b1;)V", "videoViewCallback", "Lkotlin/Function2;", "Lcom/tencent/thumbplayer/api/TPPlayerMsg$TPVideoSeiInfo;", "K", "Lyz5/p;", "getSeiInfoCallback", "()Lyz5/p;", "setSeiInfoCallback", "(Lyz5/p;)V", "seiInfoCallback", "L", "Lcw2/fb;", "getLifecycle", "()Lcw2/fb;", "setLifecycle", "(Lcw2/fb;)V", "M", "Lcw2/xa;", "getOnMuteListener", "()Lcw2/xa;", "setOnMuteListener", "(Lcw2/xa;)V", "onMuteListener", "Lws2/w1;", "onPlayerStopListener", "Lws2/w1;", "getOnPlayerStopListener", "()Lws2/w1;", "setOnPlayerStopListener", "(Lws2/w1;)V", "isStartCdn", "setStartCdn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ws2/x1", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderLiveThumbPlayerProxy extends android.widget.FrameLayout implements cw2.da, yb2.a {
    public static final java.util.HashSet N = new java.util.HashSet();
    public final ls5.d A;
    public kz2.a B;

    /* renamed from: C, reason: from kotlin metadata */
    public boolean isPreloadedView;
    public boolean D;
    public boolean E;
    public final nk4.a F;

    /* renamed from: G, reason: from kotlin metadata */
    public float playSpeedRatio;

    /* renamed from: H, reason: from kotlin metadata */
    public boolean isViewFocused;

    /* renamed from: I, reason: from kotlin metadata */
    public boolean isShouldPlayResume;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.pluginsdk.ui.b1 videoViewCallback;

    /* renamed from: K, reason: from kotlin metadata */
    public yz5.p seiInfoCallback;

    /* renamed from: L, reason: from kotlin metadata */
    public cw2.fb lifecycle;

    /* renamed from: M, reason: from kotlin metadata */
    public cw2.xa onMuteListener;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f124888d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f124889e;

    /* renamed from: f, reason: collision with root package name */
    public kk4.c f124890f;

    /* renamed from: g, reason: collision with root package name */
    public ws2.x1 f124891g;

    /* renamed from: h, reason: collision with root package name */
    public pk4.b f124892h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.Surface f124893i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.SurfaceTexture f124894m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f124895n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f124896o;

    /* renamed from: p, reason: collision with root package name */
    public cw2.wa f124897p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f124898q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f124899r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f124900s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f124901t;

    /* renamed from: u, reason: collision with root package name */
    public int f124902u;

    /* renamed from: v, reason: collision with root package name */
    public nk4.t f124903v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f124904w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f124905x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Runnable f124906y;

    /* renamed from: z, reason: collision with root package name */
    public int f124907z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveThumbPlayerProxy(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f124888d = "FTPP.FinderLiveThumbPlayerProxy";
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f124889e = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127782k3).getValue()).r()).intValue() == 1 && ((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.F).getValue()).booleanValue();
        this.f124899r = true;
        this.f124905x = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f124907z = -1;
        this.A = new ls5.d(new ls5.f(this).b());
        new java.util.concurrent.atomic.AtomicBoolean(true);
        this.F = new nk4.a();
        this.playSpeedRatio = 1.0f;
        h();
    }

    public static final java.lang.String c(com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy) {
        return finderLiveThumbPlayerProxy.getProxyState();
    }

    private final java.lang.String getProxyState() {
        boolean z17 = this.isViewFocused;
        float alpha = getAlpha();
        android.view.Surface surface = this.f124893i;
        java.lang.Boolean valueOf = surface != null ? java.lang.Boolean.valueOf(surface.isValid()) : null;
        int i17 = this.f124895n;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17);
        sb6.append('-');
        sb6.append(alpha);
        sb6.append('-');
        sb6.append(valueOf);
        sb6.append('-');
        sb6.append(i17);
        return sb6.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBgPrepareStatus(int i17) {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "setBgPrepareStatus " + i17 + ' ' + getProxyState());
        this.f124902u = i17;
    }

    @Override // cw2.da
    public ig2.n E(long j17, long j18) {
        return null;
    }

    @Override // cw2.da
    public boolean F() {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "prepareToPlay()  " + getProxyState());
        if (k()) {
            if (this.f124895n != 2) {
                return false;
            }
            N(1);
            return true;
        }
        cw2.wa waVar = this.f124897p;
        if (waVar == null) {
            return false;
        }
        q(waVar.f224096c, waVar.f224095b, null, 102);
        return true;
    }

    @Override // cw2.da
    public void G() {
    }

    public final boolean H() {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "prepareToPlay()  " + getProxyState());
        this.E = true;
        return F();
    }

    @Override // zy2.g5
    public boolean J(java.lang.Integer num) {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "replay_step3-1:startOrPlay() " + getProxyState());
        this.F.h();
        if (!this.isViewFocused) {
            com.tencent.mars.xlog.Log.i(getFTPPTag(), "replay_step3-1-1:startOrPlay() return for isViewFocused:" + this.isViewFocused);
            return false;
        }
        kz2.a aVar = this.B;
        if (aVar != null) {
            aVar.c("startOrPlay");
        }
        if (this.f124899r) {
            com.tencent.mars.xlog.Log.i(getFTPPTag(), "replay_step3-1-1:startOrPlay() first time to play");
            cw2.fb fbVar = this.lifecycle;
            if (fbVar != null) {
                cw2.wa waVar = this.f124897p;
                fbVar.g(waVar != null ? waVar.f224097d : null, this.f124903v);
            }
            cw2.fb fbVar2 = this.lifecycle;
            if (fbVar2 != null) {
                cw2.wa waVar2 = this.f124897p;
                cw2.fb.j(fbVar2, waVar2 != null ? waVar2.f224097d : null, waVar2, this.f124902u, null, 8, null);
            }
            this.f124899r = false;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1505L, 252L, 1L);
        }
        if (!k()) {
            cw2.wa waVar3 = this.f124897p;
            if (waVar3 == null) {
                return false;
            }
            q(waVar3.f224096c, waVar3.f224095b, num, 101);
            return true;
        }
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "replay_step3-1-1:startOrPlay() return for currentPlayState:" + this.f124895n);
        o(3);
        return false;
    }

    @Override // cw2.da
    public boolean K() {
        return false;
    }

    public final boolean N(int i17) {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "replay_step3-3:prepareVideo(),source:" + i17);
        kk4.c cVar = this.f124890f;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        ((kk4.f0) cVar).setPlayerOptionalParam(cw2.m5.f223867a.a());
        android.view.Surface surface = this.f124893i;
        if (surface != null) {
            if (!surface.isValid()) {
                surface = null;
            }
            if (surface != null) {
                kk4.c cVar2 = this.f124890f;
                if (cVar2 == null) {
                    kotlin.jvm.internal.o.o("player");
                    throw null;
                }
                ((kk4.f0) cVar2).setSurface(surface);
            }
        }
        kz2.a aVar = this.B;
        if (aVar != null) {
            aVar.c("prepareAsync");
        }
        kk4.c cVar3 = this.f124890f;
        if (cVar3 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        ((kk4.f0) cVar3).prepareAsync();
        f(3);
        return true;
    }

    public final void O(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "resizeTextureView width:" + i17 + ",height:" + i18);
        java.lang.Object obj = this.f124892h;
        if (obj == null) {
            kotlin.jvm.internal.o.o("textureView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) obj).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i17;
            layoutParams.height = i18;
            java.lang.Object obj2 = this.f124892h;
            if (obj2 != null) {
                ((android.view.View) obj2).requestLayout();
            } else {
                kotlin.jvm.internal.o.o("textureView");
                throw null;
            }
        }
    }

    public final void P(cw2.wa waVar) {
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "startProgressTimer " + getProxyState());
        boolean z17 = false;
        if (this.f124904w == null) {
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new ws2.a2(this, waVar), true);
            this.f124904w = b4Var2;
            b4Var2.setLogging(false);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var3 = this.f124904w;
        if (b4Var3 != null && b4Var3.e()) {
            z17 = true;
        }
        if (!z17 || (b4Var = this.f124904w) == null) {
            return;
        }
        b4Var.c(0L, 20L);
    }

    public final void Q() {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "stopProgressTimer :" + this.f124904w + ' ' + getProxyState());
        cw2.wa waVar = this.f124897p;
        if (waVar != null) {
            pm0.v.X(new ws2.b2(this, waVar, getCurrentPlayMs(), getVideoDurationMs()));
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f124904w;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // zy2.g5
    public boolean a(double d17, boolean z17) {
        return r(d17, z17, 3);
    }

    @Override // zy2.g5
    public void b() {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "release FinderThumbPlayerProxy " + hashCode() + ' ' + getProxyState());
        this.f124903v = null;
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "releaseSurface " + getProxyState() + ", isReusing = " + this.D + ", detach = true");
        boolean z17 = this.D;
        if (this.f124893i != null) {
            kk4.c cVar = this.f124890f;
            if (cVar == null) {
                kotlin.jvm.internal.o.o("player");
                throw null;
            }
            ((kk4.f0) cVar).setSurface(null);
            android.view.Surface surface = this.f124893i;
            if (surface != null) {
                surface.release();
            }
            pk4.a aVar = this.f124892h;
            if (aVar == null) {
                kotlin.jvm.internal.o.o("textureView");
                throw null;
            }
            ((com.tencent.mm.plugin.thumbplayer.view.MMTextureView) aVar).h();
            this.f124893i = null;
            this.f124894m = null;
        }
        pm0.v.O("FTPP.FinderLiveThumbPlayerProxy", new ws2.z1(this));
        N.remove(java.lang.Integer.valueOf(hashCode()));
        this.onMuteListener = null;
    }

    @Override // zy2.g5
    public void d() {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "onUIDestroy " + getProxyState() + " isReUser:" + this.D);
        stop();
        this.videoViewCallback = null;
        this.seiInfoCallback = null;
        this.E = false;
    }

    public final void f(int i17) {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "changePlayerState from:" + this.f124895n + " to:" + i17);
        if (i17 == 4 && this.f124895n != 3) {
            com.tencent.mars.xlog.Log.w(getFTPPTag(), "changePlayerState from:" + this.f124895n + " to:" + i17 + " return for error state.");
            return;
        }
        this.f124895n = i17;
        int i18 = this.f124895n;
        nk4.a aVar = this.F;
        aVar.f338047g = i18;
        cw2.wa waVar = this.f124897p;
        if (waVar == null) {
            com.tencent.mars.xlog.Log.i(getFTPPTag(), "FTPP.handlePlayerStateChange() return for null");
            return;
        }
        if (i18 == 5) {
            com.tencent.mm.pluginsdk.ui.b1 b1Var = this.videoViewCallback;
            if (b1Var != null) {
                b1Var.l("", waVar.f224096c);
            }
            cw2.fb fbVar = this.lifecycle;
            if (fbVar != null) {
                cw2.wa waVar2 = this.f124897p;
                fbVar.h(waVar2 != null ? waVar2.f224097d : null);
            }
            cw2.wa waVar3 = this.f124897p;
            if (waVar3 != null) {
                P(waVar3);
            }
        } else if (i18 == 6) {
            com.tencent.mm.pluginsdk.ui.b1 b1Var2 = this.videoViewCallback;
            if (b1Var2 != null) {
                b1Var2.i("", waVar.f224096c);
            }
            cw2.fb fbVar2 = this.lifecycle;
            if (fbVar2 != null) {
                cw2.wa waVar4 = this.f124897p;
                fbVar2.n(waVar4 != null ? waVar4.f224097d : null, aVar.a());
            }
            Q();
        }
        if (i18 == 1 || i18 == 9) {
            com.tencent.mars.xlog.Log.i(getFTPPTag(), "FTPP.handlePlayerStateChange() player stop or idle " + getProxyState());
        }
    }

    public final void g(java.lang.String str) {
        if (this.f124896o) {
            return;
        }
        if (kotlin.jvm.internal.o.b(str, "startInternal")) {
            if (this.f124902u != 2) {
                com.tencent.mars.xlog.Log.w(getFTPPTag(), "FTPP.handleOnFirstFrameRendered " + str + " return for " + this.f124902u);
                return;
            }
            com.tencent.mars.xlog.Log.i(getFTPPTag(), "FTPP.handleOnFirstFrameRendered rendered for " + this.f124902u);
            cw2.fb fbVar = this.lifecycle;
            if (fbVar != null) {
                cw2.wa waVar = this.f124897p;
                r45.mb4 mb4Var = waVar != null ? waVar.f224097d : null;
                kk4.c cVar = this.f124890f;
                if (cVar == null) {
                    kotlin.jvm.internal.o.o("player");
                    throw null;
                }
                fbVar.D(mb4Var, ((kk4.f0) cVar).f308532h);
            }
            this.f124896o = true;
            return;
        }
        if (!kotlin.jvm.internal.o.b(str, "onFirstFrameRendered")) {
            com.tencent.mars.xlog.Log.w(getFTPPTag(), "FTPP.handleOnFirstFrameRendered " + str + " return for " + this.f124902u);
            return;
        }
        int i17 = this.f124902u;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i(getFTPPTag(), "FTPP.handleOnFirstFrameRendered onFirstFrameRendered " + getProxyState());
            cw2.fb fbVar2 = this.lifecycle;
            if (fbVar2 != null) {
                cw2.wa waVar2 = this.f124897p;
                r45.mb4 mb4Var2 = waVar2 != null ? waVar2.f224097d : null;
                kk4.c cVar2 = this.f124890f;
                if (cVar2 == null) {
                    kotlin.jvm.internal.o.o("player");
                    throw null;
                }
                fbVar2.D(mb4Var2, ((kk4.f0) cVar2).f308532h);
            }
            this.f124896o = true;
            return;
        }
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.w(getFTPPTag(), "FTPP.handleOnFirstFrameRendered " + str + " return for " + this.f124902u);
            return;
        }
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "FTPP.handleOnFirstFrameRendered background prepared first frame " + getProxyState());
        setBgPrepareStatus(2);
        cw2.fb fbVar3 = this.lifecycle;
        if (fbVar3 != null) {
            cw2.wa waVar3 = this.f124897p;
            fbVar3.G(waVar3 != null ? waVar3.f224097d : null);
        }
    }

    @Override // cw2.da
    public android.graphics.Bitmap getBitmap() {
        java.lang.Object obj = this.f124892h;
        if (obj != null) {
            return ((android.view.TextureView) obj).getBitmap();
        }
        kotlin.jvm.internal.o.o("textureView");
        throw null;
    }

    @Override // cw2.da
    /* renamed from: getContextTag, reason: from getter */
    public int getF130613s() {
        return this.f124907z;
    }

    @Override // cw2.da
    public /* bridge */ /* synthetic */ android.widget.ImageView getCoverImage() {
        return null;
    }

    @Override // zy2.g5
    public long getCurrentPlayMs() {
        kk4.c cVar = this.f124890f;
        if (cVar != null) {
            return ((kk4.f0) cVar).getCurrentPositionMs();
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // zy2.g5
    public int getCurrentPlaySecond() {
        kk4.c cVar = this.f124890f;
        if (cVar != null) {
            return (int) (((kk4.f0) cVar).getCurrentPositionMs() / 1000);
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // zy2.g5
    public long getCurrentStartPlayMs() {
        return 0L;
    }

    @Override // cw2.da
    public ls5.m getEventDetector() {
        return this;
    }

    @Override // ls5.m
    public ls5.k getEventDetectorAdapter() {
        return this.A;
    }

    public final java.lang.String getFTPPTag() {
        return "FTPP." + this.f124888d + '.' + this.isViewFocused;
    }

    @Override // cw2.da
    public boolean getIsNeverStart() {
        return !k();
    }

    @Override // cw2.da
    public boolean getIsShouldPlayResume() {
        return this.isShouldPlayResume;
    }

    public final cw2.fb getLifecycle() {
        return this.lifecycle;
    }

    public final cw2.xa getOnMuteListener() {
        return this.onMuteListener;
    }

    public final ws2.w1 getOnPlayerStopListener() {
        return null;
    }

    @Override // cw2.da
    public android.view.ViewParent getParentView() {
        return getParent();
    }

    public final float getPlaySpeedRatio() {
        return this.playSpeedRatio;
    }

    @Override // cw2.da
    public java.lang.Object getPlayer() {
        kk4.c cVar = this.f124890f;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // yb2.a
    public android.view.View getPlayerView() {
        return this;
    }

    public final int getScaleType() {
        pk4.b bVar = this.f124892h;
        if (bVar != null) {
            return bVar.getF174556h();
        }
        kotlin.jvm.internal.o.o("textureView");
        throw null;
    }

    public final yz5.p getSeiInfoCallback() {
        return this.seiInfoCallback;
    }

    @Override // cw2.da
    public cw2.y9 getVideoAdapter() {
        return null;
    }

    @Override // zy2.g5
    public int getVideoDuration() {
        kk4.c cVar = this.f124890f;
        if (cVar != null) {
            return (int) (((kk4.f0) cVar).getDurationMs() / 1000);
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // zy2.g5
    public long getVideoDurationMs() {
        kk4.c cVar = this.f124890f;
        if (cVar != null) {
            return ((kk4.f0) cVar).getDurationMs();
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // cw2.da
    public java.lang.String getVideoMediaId() {
        java.lang.String str;
        cw2.wa waVar = this.f124897p;
        return (waVar == null || (str = waVar.f224096c) == null) ? "" : str;
    }

    @Override // cw2.da
    /* renamed from: getVideoMediaInfo, reason: from getter */
    public cw2.wa getF130607n() {
        return this.f124897p;
    }

    @Override // zy2.g5
    public android.view.View getVideoView() {
        return this;
    }

    public final com.tencent.mm.pluginsdk.ui.b1 getVideoViewCallback() {
        return this.videoViewCallback;
    }

    @Override // zy2.g5
    /* renamed from: getVideoViewFocused, reason: from getter */
    public boolean getIsViewFocused() {
        return this.isViewFocused;
    }

    public final void h() {
        java.util.HashSet hashSet = N;
        hashSet.add(java.lang.Integer.valueOf(hashCode()));
        com.tencent.mars.xlog.Log.i("FTPP.FinderLiveThumbPlayerProxy", "create FinderThumbPlayerProxy " + hashCode() + ' ' + hashSet);
        df0.q qVar = (df0.q) i95.n0.c(df0.q.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f124890f = ((cf0.q) qVar).wi(context);
        this.f124891g = new ws2.x1(this);
        this.f124903v = new nk4.t(this.f124889e ? 1 : 0);
        this.F.k();
        df0.t tVar = (df0.t) i95.n0.c(df0.t.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((cf0.c0) tVar).getClass();
        com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView mMThumbPlayerTextureView = new com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView(context2);
        this.f124892h = mMThumbPlayerTextureView;
        mMThumbPlayerTextureView.setOpaqueInfo(true);
        pk4.b bVar = this.f124892h;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("textureView");
            throw null;
        }
        ws2.x1 x1Var = this.f124891g;
        if (x1Var == null) {
            kotlin.jvm.internal.o.o("playerListener");
            throw null;
        }
        bVar.setTextureListenerCallback(x1Var);
        kk4.c cVar = this.f124890f;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        ws2.x1 x1Var2 = this.f124891g;
        if (x1Var2 == null) {
            kotlin.jvm.internal.o.o("playerListener");
            throw null;
        }
        ((kk4.f0) cVar).setOnErrorListener(x1Var2);
        kk4.c cVar2 = this.f124890f;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        ws2.x1 x1Var3 = this.f124891g;
        if (x1Var3 == null) {
            kotlin.jvm.internal.o.o("playerListener");
            throw null;
        }
        ((kk4.f0) cVar2).setOnPreparedListener(x1Var3);
        kk4.c cVar3 = this.f124890f;
        if (cVar3 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        ws2.x1 x1Var4 = this.f124891g;
        if (x1Var4 == null) {
            kotlin.jvm.internal.o.o("playerListener");
            throw null;
        }
        ((kk4.f0) cVar3).setOnVideoSizeChangedListener(x1Var4);
        kk4.c cVar4 = this.f124890f;
        if (cVar4 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        ws2.x1 x1Var5 = this.f124891g;
        if (x1Var5 == null) {
            kotlin.jvm.internal.o.o("playerListener");
            throw null;
        }
        kk4.f0 f0Var = (kk4.f0) cVar4;
        f0Var.f308541q = x1Var5;
        f0Var.setOnInfoListener(x1Var5);
        kk4.c cVar5 = this.f124890f;
        if (cVar5 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        ws2.x1 x1Var6 = this.f124891g;
        if (x1Var6 == null) {
            kotlin.jvm.internal.o.o("playerListener");
            throw null;
        }
        ((kk4.f0) cVar5).setOnCompletionListener(x1Var6);
        kk4.c cVar6 = this.f124890f;
        if (cVar6 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        ws2.x1 x1Var7 = this.f124891g;
        if (x1Var7 == null) {
            kotlin.jvm.internal.o.o("playerListener");
            throw null;
        }
        ((kk4.f0) cVar6).setOnSeekCompleteListener(x1Var7);
        f(1);
    }

    @Override // cw2.da
    public void i() {
    }

    @Override // yb2.a
    public boolean isMute() {
        kk4.c cVar = this.f124890f;
        if (cVar != null) {
            return ((kk4.f0) cVar).f308526b;
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // zy2.g5
    public boolean isPlaying() {
        return this.f124895n == 5;
    }

    public final boolean j() {
        int i17 = this.f124895n;
        return i17 == 4 || i17 == 5 || i17 == 6 || i17 == 7;
    }

    public final boolean k() {
        switch (this.f124895n) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    @Override // cw2.da
    /* renamed from: m, reason: from getter */
    public boolean getF124901t() {
        return this.f124901t;
    }

    @Override // cw2.da
    public void n(mn2.j4 video, boolean z17, com.tencent.mm.plugin.finder.storage.FeedData feedData) {
        r45.bb1 bb1Var;
        kotlin.jvm.internal.o.g(video, "video");
        kotlin.jvm.internal.o.g(feedData, "feedData");
        kz2.a aVar = this.B;
        if (aVar != null) {
            aVar.c("setMediaInfo");
        }
        r45.mb4 e17 = video.e();
        java.lang.String string = e17.getString(0);
        java.lang.String str = string == null ? "" : string;
        java.lang.String string2 = video.e().getString(9);
        this.f124897p = new cw2.wa("", str, string2 == null ? "" : string2, e17, video, feedData);
        java.lang.String string3 = e17.getString(9);
        java.lang.String str2 = string3 != null ? string3 : "";
        java.lang.String valueOf = java.lang.String.valueOf(hashCode());
        kk4.c cVar = this.f124890f;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        int hashCode = cVar.hashCode();
        boolean z18 = this.isViewFocused;
        float alpha = getAlpha();
        android.view.Surface surface = this.f124893i;
        java.lang.Boolean valueOf2 = surface != null ? java.lang.Boolean.valueOf(surface.isValid()) : null;
        int i17 = this.f124895n;
        int position = feedData.getPosition();
        java.lang.String u17 = pm0.v.u(feedData.getFeedId());
        java.lang.String description = feedData.getDescription();
        java.lang.String nickName = feedData.getNickName();
        this.f124888d = position + '.' + hc2.b0.k(description, 0, 0, 3, null) + '.' + hc2.b0.k(valueOf, 0, 0, 3, null);
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "initFTPPTag pos:" + position + " mediaId:" + str2 + " feedId:" + u17 + " nickName:" + nickName + " description:" + description + " viewFocus:" + z18 + "finderThumbPlayerProxyHashCode:" + valueOf + " playerHashCode:" + hashCode + " viewFocus:" + this.isViewFocused + " viewAlpha:" + alpha + " surfaceIsValid:" + valueOf2 + " playerState:" + i17);
        cw2.wa waVar = this.f124897p;
        kotlin.jvm.internal.o.d(waVar);
        java.lang.Object obj = this.f124892h;
        if (obj == null) {
            kotlin.jvm.internal.o.o("textureView");
            throw null;
        }
        if (((android.view.View) obj).getParent() != null) {
            java.lang.Object obj2 = this.f124892h;
            if (obj2 == null) {
                kotlin.jvm.internal.o.o("textureView");
                throw null;
            }
            removeView((android.view.View) obj2);
        }
        android.util.Size g17 = bu2.z.g(waVar.f224098e.e());
        c50.b1 b1Var = (c50.b1) i95.n0.c(c50.b1.class);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        jz5.o Ai = ((c61.s9) b1Var).Ai(context, g17.getWidth(), g17.getHeight());
        int intValue = ((java.lang.Number) Ai.f302842e).intValue();
        int intValue2 = ((java.lang.Number) Ai.f302843f).intValue();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        java.lang.Object obj3 = this.f124892h;
        if (obj3 == null) {
            kotlin.jvm.internal.o.o("textureView");
            throw null;
        }
        addView((android.view.View) obj3, layoutParams);
        pk4.b bVar = this.f124892h;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("textureView");
            throw null;
        }
        ((com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView) bVar).m(intValue, intValue2);
        r45.mb4 mb4Var = waVar.f224097d;
        if (mb4Var != null && (bb1Var = (r45.bb1) mb4Var.getCustom(34)) != null) {
            pk4.b bVar2 = this.f124892h;
            if (bVar2 == null) {
                kotlin.jvm.internal.o.o("textureView");
                throw null;
            }
            bVar2.setCropRect(new android.graphics.Rect((int) bb1Var.getFloat(0), (int) bb1Var.getFloat(1), (int) bb1Var.getFloat(2), (int) bb1Var.getFloat(3)));
            pk4.b bVar3 = this.f124892h;
            if (bVar3 == null) {
                kotlin.jvm.internal.o.o("textureView");
                throw null;
            }
            float f17 = mb4Var.getFloat(4);
            float f18 = mb4Var.getFloat(5);
            com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView mMThumbPlayerTextureView = (com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView) bVar3;
            mMThumbPlayerTextureView.f174559n = f17;
            mMThumbPlayerTextureView.f174560o = f18;
        }
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "initTextureView(), containerWidth:" + intValue + " containerHeight:" + intValue2 + ' ' + getProxyState());
        this.F.k();
        nk4.a aVar2 = this.F;
        cw2.wa waVar2 = this.f124897p;
        kotlin.jvm.internal.o.d(waVar2);
        java.lang.String mediaId = waVar2.f224096c;
        aVar2.getClass();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        aVar2.f338044d = mediaId;
        this.F.h();
    }

    public final boolean o(int i17) {
        boolean z17;
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "playWithSource() source=" + i17 + ' ' + getProxyState() + ' ');
        if (!this.isViewFocused) {
            com.tencent.mars.xlog.Log.i(getFTPPTag(), "playWithSource() return for isViewFocused:" + this.isViewFocused);
            return false;
        }
        switch (this.f124895n) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                z17 = true;
                break;
            default:
                z17 = false;
                break;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i(getFTPPTag(), "playWithSource() return for currentState:" + this.f124895n);
            return false;
        }
        boolean isPlaying = isPlaying();
        if (isPlaying && i17 != -1) {
            com.tencent.mars.xlog.Log.i(getFTPPTag(), "playWithSource() return for isPlaying:" + isPlaying);
            return false;
        }
        if (j()) {
            android.view.Surface surface = this.f124893i;
            if (surface != null) {
                if (!surface.isValid()) {
                    surface = null;
                }
                if (surface != null) {
                    com.tencent.mars.xlog.Log.i(getFTPPTag(), "startInternal() " + getProxyState());
                    g("startInternal");
                    setBgPrepareStatus(0);
                    kz2.a aVar = this.B;
                    if (aVar != null) {
                        aVar.c("start");
                    }
                    kk4.c cVar = this.f124890f;
                    if (cVar == null) {
                        kotlin.jvm.internal.o.o("player");
                        throw null;
                    }
                    ((kk4.f0) cVar).start();
                    f(5);
                    cw2.wa waVar = this.f124897p;
                    if (waVar != null) {
                        P(waVar);
                    }
                }
            }
        } else {
            if (!(this.f124895n == 3)) {
                N(0);
            }
        }
        kk4.c cVar2 = this.f124890f;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).resumeDownload();
            return true;
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // cw2.da
    public void p() {
    }

    @Override // zy2.g5
    public boolean pause() {
        cw2.fb fbVar;
        if (!k()) {
            com.tencent.mars.xlog.Log.i(getFTPPTag(), "pause() return for state:" + this.f124895n);
            return false;
        }
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "pause()  " + getProxyState());
        if (isPlaying()) {
            kk4.c cVar = this.f124890f;
            if (cVar == null) {
                kotlin.jvm.internal.o.o("player");
                throw null;
            }
            ((kk4.f0) cVar).pause();
            kk4.c cVar2 = this.f124890f;
            if (cVar2 == null) {
                kotlin.jvm.internal.o.o("player");
                throw null;
            }
            ((kk4.f0) cVar2).pauseDownload();
            f(6);
        } else {
            if ((this.f124895n == 3) && !this.isViewFocused) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                stop();
                com.tencent.mars.xlog.Log.i(getFTPPTag(), "pause() preparing stop cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
            }
        }
        Q();
        cw2.wa waVar = this.f124897p;
        if (waVar != null && (fbVar = this.lifecycle) != null) {
            fbVar.n(waVar.f224097d, this.F.a());
        }
        return true;
    }

    @Override // zy2.g5
    public boolean play() {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "play()");
        return o(0);
    }

    public final void q(java.lang.String mediaId, java.lang.String str, java.lang.Integer num, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.w(getFTPPTag(), "replay_step3-1-1:prepareHls(), return for online url:" + str);
            return;
        }
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "replay_step3-2:prepareHls(),offsetSec:" + num + ", " + getProxyState() + ",url:" + str + ",decryptionKey:" + this.f124898q);
        com.tencent.thumbplayer.api.TPVideoInfo.Builder builder = new com.tencent.thumbplayer.api.TPVideoInfo.Builder();
        builder.fileId(mediaId);
        builder.downloadParam(new com.tencent.thumbplayer.api.proxy.TPDownloadParamData(0));
        kk4.c cVar = this.f124890f;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        ((kk4.f0) cVar).f308533i = mediaId;
        kk4.c cVar2 = this.f124890f;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        ((kk4.f0) cVar2).setVideoInfo(builder.build());
        if (num != null) {
            int intValue = num.intValue();
            kk4.c cVar3 = this.f124890f;
            if (cVar3 == null) {
                kotlin.jvm.internal.o.o("player");
                throw null;
            }
            ((kk4.f0) cVar3).setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(100, intValue * 1000));
        }
        java.lang.String str2 = this.f124898q;
        if (str2 != null) {
            kk4.c cVar4 = this.f124890f;
            if (cVar4 == null) {
                kotlin.jvm.internal.o.o("player");
                throw null;
            }
            ((kk4.f0) cVar4).setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildQueueString(453, new java.lang.String[]{str2}));
        }
        kk4.c cVar5 = this.f124890f;
        if (cVar5 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        ((kk4.f0) cVar5).setDataSource(str);
        f(2);
        N(i17);
    }

    @Override // zy2.g5
    public boolean r(double d17, boolean z17, int i17) {
        if (!k() || !j()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "seekTo " + d17 + ' ' + z17);
        kk4.c cVar = this.f124890f;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        ((kk4.f0) cVar).seekTo(a06.d.a(d17 * 1000), i17);
        if (!z17) {
            return true;
        }
        play();
        return true;
    }

    @Override // cw2.da
    public void setContextTag(int i17) {
        this.f124907z = i17;
    }

    @Override // zy2.g5
    public /* bridge */ /* synthetic */ void setCustomSurface(android.view.Surface surface) {
    }

    @Override // zy2.g5
    public void setCustomSurfaceTexture(android.graphics.SurfaceTexture texture) {
        kotlin.jvm.internal.o.g(texture, "texture");
    }

    public final void setDecryptionKey(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "setDecryptionKey ".concat(key));
        this.f124898q = key;
    }

    @Override // cw2.da
    public void setFinderVideoPlayTrace(kz2.a aVar) {
        this.B = aVar;
    }

    @Override // zy2.g5
    public void setIMMVideoViewCallback(zy2.ub _callback) {
        kotlin.jvm.internal.o.g(_callback, "_callback");
        this.videoViewCallback = _callback;
    }

    @Override // cw2.da
    public void setInterceptDetach(boolean z17) {
        pk4.b bVar = this.f124892h;
        if (bVar != null) {
            bVar.setInterceptDetach(z17);
        } else {
            kotlin.jvm.internal.o.o("textureView");
            throw null;
        }
    }

    @Override // cw2.da
    public void setIsShouldPlayResume(boolean z17) {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "setIsShouldPlayResume() " + z17 + ' ' + getProxyState());
        this.isShouldPlayResume = z17;
    }

    @Override // cw2.da
    public void setIsShowBasicControls(boolean z17) {
    }

    public final void setLifecycle(cw2.fb fbVar) {
        this.lifecycle = fbVar;
    }

    @Override // zy2.g5
    public void setLoop(boolean z17) {
        kk4.c cVar = this.f124890f;
        if (cVar != null) {
            ((kk4.f0) cVar).setLoopback(z17);
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    @Override // zy2.g5
    public void setMute(boolean z17) {
        kk4.c cVar = this.f124890f;
        if (cVar != null) {
            ((kk4.f0) cVar).setOutputMute(z17);
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    public final void setOnMuteListener(cw2.xa xaVar) {
        this.onMuteListener = xaVar;
    }

    public final void setOnPlayerStopListener(ws2.w1 w1Var) {
    }

    public final void setPlaySpeed(float f17) {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        java.lang.String fTPPTag = getFTPPTag();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPlaySpeed: ratio = ");
        sb6.append(f17);
        sb6.append(", mediaId = ");
        cw2.wa waVar = this.f124897p;
        sb6.append(waVar != null ? waVar.f224096c : null);
        sb6.append(", feedId = ");
        cw2.wa waVar2 = this.f124897p;
        sb6.append(pm0.v.u((waVar2 == null || (feedData = waVar2.f224099f) == null) ? 0L : feedData.getFeedId()));
        com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
        kk4.c cVar = this.f124890f;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        cVar.setPlaySpeedRatio(f17);
        this.playSpeedRatio = f17;
        cw2.fb fbVar = this.lifecycle;
        if (fbVar != null) {
            fbVar.b(f17);
        }
    }

    public final void setPlaySpeedRatio(float f17) {
        this.playSpeedRatio = f17;
    }

    @Override // cw2.da
    public void setPreloadedView(boolean z17) {
        this.isPreloadedView = z17;
    }

    @Override // cw2.da
    public void setPreview(boolean z17) {
        this.f124901t = z17;
    }

    @Override // cw2.da
    public void setScaleType(com.tencent.mm.pluginsdk.ui.e1 scaleType) {
        kotlin.jvm.internal.o.g(scaleType, "scaleType");
        int ordinal = scaleType.ordinal();
        if (ordinal == 2) {
            pk4.b bVar = this.f124892h;
            if (bVar != null) {
                bVar.setScaleType(1);
                return;
            } else {
                kotlin.jvm.internal.o.o("textureView");
                throw null;
            }
        }
        if (ordinal == 3) {
            pk4.b bVar2 = this.f124892h;
            if (bVar2 != null) {
                bVar2.setScaleType(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("textureView");
                throw null;
            }
        }
        if (ordinal != 4) {
            return;
        }
        pk4.b bVar3 = this.f124892h;
        if (bVar3 != null) {
            bVar3.setScaleType(3);
        } else {
            kotlin.jvm.internal.o.o("textureView");
            throw null;
        }
    }

    public final void setSeiInfoCallback(yz5.p pVar) {
        this.seiInfoCallback = pVar;
    }

    public final void setShouldPlayResume(boolean z17) {
        this.isShouldPlayResume = z17;
    }

    public final void setStartCdn(boolean z17) {
    }

    @Override // cw2.da
    public void setVideoMuteListener(cw2.xa muteListener) {
        kotlin.jvm.internal.o.g(muteListener, "muteListener");
        this.onMuteListener = muteListener;
    }

    @Override // cw2.da
    public void setVideoPlayLifecycle(cw2.fb fbVar) {
        this.lifecycle = fbVar;
    }

    public final void setVideoViewCallback(com.tencent.mm.pluginsdk.ui.b1 b1Var) {
        this.videoViewCallback = b1Var;
    }

    @Override // zy2.g5
    public void setVideoViewFocused(boolean z17) {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "setVideoViewFocused " + z17 + ' ' + getProxyState());
        this.isViewFocused = z17;
    }

    public final void setViewFocused(boolean z17) {
        this.isViewFocused = z17;
    }

    @Override // zy2.g5
    public void stop() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "stop " + getProxyState());
        if (!k()) {
            com.tencent.mars.xlog.Log.i(getFTPPTag(), "stop return for isStartPlay onPlayerStopListener:null. " + getProxyState());
        }
        cw2.fb fbVar = this.lifecycle;
        if (fbVar != null) {
            fbVar.s(this.f124897p, this.F.a());
        }
        f(8);
        kk4.c cVar = this.f124890f;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        cVar.stop();
        f(9);
        kk4.c cVar2 = this.f124890f;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        ((kk4.f0) cVar2).reset();
        f(1);
        pk4.b bVar = this.f124892h;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("textureView");
            throw null;
        }
        com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView mMThumbPlayerTextureView = (com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView) bVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "reset cropRect=" + mMThumbPlayerTextureView.f174561p);
        mMThumbPlayerTextureView.f174561p = new android.graphics.Rect();
        this.F.k();
        Q();
        this.f124899r = true;
        this.f124896o = false;
        setBgPrepareStatus(0);
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "stop end time:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // zy2.g5
    /* renamed from: t, reason: from getter */
    public boolean getQ() {
        return this.f124896o;
    }

    @Override // android.view.View
    public java.lang.String toString() {
        return getFTPPTag();
    }

    @Override // cw2.da
    public int w() {
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "pauseWithCancel " + getProxyState());
        this.F.g();
        pause();
        return 0;
    }

    @Override // cw2.da
    /* renamed from: y, reason: from getter */
    public boolean getIsPreloadedView() {
        return this.isPreloadedView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveThumbPlayerProxy(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f124888d = "FTPP.FinderLiveThumbPlayerProxy";
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f124889e = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127782k3).getValue()).r()).intValue() == 1 && ((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.F).getValue()).booleanValue();
        this.f124899r = true;
        this.f124905x = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f124907z = -1;
        this.A = new ls5.d(new ls5.f(this).b());
        new java.util.concurrent.atomic.AtomicBoolean(true);
        this.F = new nk4.a();
        this.playSpeedRatio = 1.0f;
        h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveThumbPlayerProxy(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f124888d = "FTPP.FinderLiveThumbPlayerProxy";
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f124889e = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127782k3).getValue()).r()).intValue() == 1 && ((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.F).getValue()).booleanValue();
        this.f124899r = true;
        this.f124905x = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f124907z = -1;
        this.A = new ls5.d(new ls5.f(this).b());
        new java.util.concurrent.atomic.AtomicBoolean(true);
        this.F = new nk4.a();
        this.playSpeedRatio = 1.0f;
        h();
    }
}
