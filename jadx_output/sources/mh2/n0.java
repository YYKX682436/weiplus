package mh2;

/* loaded from: classes10.dex */
public final class n0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final lj2.v0 f326420d;

    /* renamed from: e, reason: collision with root package name */
    public final lj2.x0 f326421e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f326422f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f326423g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f326424h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        this.f326420d = pluginAbility;
        this.f326421e = service;
        this.f326422f = jz5.h.b(new mh2.m0(context, this));
        this.f326423g = jz5.h.b(new mh2.l0(context, this));
        setClipChildren(false);
        getAnchorCoverWidget().setVisibility(0);
        getAudioCoverWidget().setVisibility(0);
    }

    private final qh2.d getAnchorCoverWidget() {
        return (qh2.d) ((jz5.n) this.f326423g).getValue();
    }

    private final qh2.i getAudioCoverWidget() {
        return (qh2.i) ((jz5.n) this.f326422f).getValue();
    }

    public final void a(java.lang.String sdkUserId, r45.xn1 xn1Var) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        android.view.ViewGroup.LayoutParams layoutParams3;
        android.view.ViewGroup.LayoutParams layoutParams4;
        android.view.ViewGroup.LayoutParams layoutParams5;
        android.view.ViewGroup.LayoutParams layoutParams6;
        android.view.ViewGroup.LayoutParams layoutParams7;
        android.view.ViewGroup.LayoutParams layoutParams8;
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        this.f326424h = null;
        lj2.v0 v0Var = this.f326420d;
        if (com.tencent.mm.sdk.platformtools.t8.D0(v0Var.a0().p(), sdkUserId)) {
            b(getAnchorCoverWidget(), sdkUserId, xn1Var);
        } else {
            b(getAudioCoverWidget(), sdkUserId, xn1Var);
        }
        boolean v17 = v0Var.a0().v();
        if (!kotlin.jvm.internal.o.b(this.f326424h, java.lang.Boolean.valueOf(v17))) {
            this.f326424h = java.lang.Boolean.valueOf(v17);
            qh2.i audioCoverWidget = getAudioCoverWidget();
            if (v17) {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = audioCoverWidget.Q;
                if (ripperAnimateView != null && (layoutParams8 = ripperAnimateView.getLayoutParams()) != null) {
                    int b17 = i65.a.b(audioCoverWidget.getContext(), 72);
                    layoutParams8.width = b17;
                    layoutParams8.height = b17;
                    com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView2 = audioCoverWidget.Q;
                    if (ripperAnimateView2 != null) {
                        ripperAnimateView2.setInitRadius(i65.a.b(audioCoverWidget.getContext(), 24));
                    }
                }
                android.widget.ImageView finderLiveMicUserAvatar = audioCoverWidget.getFinderLiveMicUserAvatar();
                if (finderLiveMicUserAvatar != null && (layoutParams7 = finderLiveMicUserAvatar.getLayoutParams()) != null) {
                    int b18 = i65.a.b(audioCoverWidget.getContext(), 48);
                    layoutParams7.width = b18;
                    layoutParams7.height = b18;
                }
            } else {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView3 = audioCoverWidget.Q;
                if (ripperAnimateView3 != null && (layoutParams2 = ripperAnimateView3.getLayoutParams()) != null) {
                    int b19 = i65.a.b(audioCoverWidget.getContext(), 116);
                    layoutParams2.width = b19;
                    layoutParams2.height = b19;
                    com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView4 = audioCoverWidget.Q;
                    if (ripperAnimateView4 != null) {
                        ripperAnimateView4.setInitRadius(i65.a.b(audioCoverWidget.getContext(), 40));
                    }
                }
                android.widget.ImageView finderLiveMicUserAvatar2 = audioCoverWidget.getFinderLiveMicUserAvatar();
                if (finderLiveMicUserAvatar2 != null && (layoutParams = finderLiveMicUserAvatar2.getLayoutParams()) != null) {
                    int b27 = i65.a.b(audioCoverWidget.getContext(), 80);
                    layoutParams.width = b27;
                    layoutParams.height = b27;
                }
            }
            qh2.d anchorCoverWidget = getAnchorCoverWidget();
            if (v17) {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView = anchorCoverWidget.getWaveView();
                if (waveView != null && (layoutParams6 = waveView.getLayoutParams()) != null) {
                    int b28 = i65.a.b(anchorCoverWidget.getContext(), 72);
                    layoutParams6.width = b28;
                    layoutParams6.height = b28;
                    com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView2 = anchorCoverWidget.getWaveView();
                    if (waveView2 != null) {
                        waveView2.setInitRadius(i65.a.b(anchorCoverWidget.getContext(), 24));
                    }
                }
                android.widget.ImageView finderLiveMicUserAvatar3 = anchorCoverWidget.getFinderLiveMicUserAvatar();
                if (finderLiveMicUserAvatar3 != null && (layoutParams5 = finderLiveMicUserAvatar3.getLayoutParams()) != null) {
                    int b29 = i65.a.b(anchorCoverWidget.getContext(), 48);
                    layoutParams5.width = b29;
                    layoutParams5.height = b29;
                }
            } else {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView3 = anchorCoverWidget.getWaveView();
                if (waveView3 != null && (layoutParams4 = waveView3.getLayoutParams()) != null) {
                    int b37 = i65.a.b(anchorCoverWidget.getContext(), 114);
                    layoutParams4.width = b37;
                    layoutParams4.height = b37;
                    com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView4 = anchorCoverWidget.getWaveView();
                    if (waveView4 != null) {
                        waveView4.setInitRadius(i65.a.b(anchorCoverWidget.getContext(), 40));
                    }
                }
                android.widget.ImageView finderLiveMicUserAvatar4 = anchorCoverWidget.getFinderLiveMicUserAvatar();
                if (finderLiveMicUserAvatar4 != null && (layoutParams3 = finderLiveMicUserAvatar4.getLayoutParams()) != null) {
                    int b38 = i65.a.b(anchorCoverWidget.getContext(), 80);
                    layoutParams3.width = b38;
                    layoutParams3.height = b38;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("KTVSingerLayout", "bindData sdkUserId: ".concat(sdkUserId));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 xh2.a, still in use, count: 3, list:
          (r2v0 xh2.a) from 0x00cb: MOVE (r44v0 xh2.a) = (r2v0 xh2.a)
          (r2v0 xh2.a) from 0x00b9: MOVE (r44v2 xh2.a) = (r2v0 xh2.a)
          (r2v0 xh2.a) from 0x003f: MOVE (r44v4 xh2.a) = (r2v0 xh2.a)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final void b(wj2.w r47, java.lang.String r48, r45.xn1 r49) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.n0.b(wj2.w, java.lang.String, r45.xn1):void");
    }

    public final void c() {
        km2.q qVar;
        qh2.i audioCoverWidget = getAudioCoverWidget();
        xh2.a finderLiveMicCoverData = audioCoverWidget.getFinderLiveMicCoverData();
        if (finderLiveMicCoverData == null || (qVar = finderLiveMicCoverData.f454520a) == null) {
            return;
        }
        audioCoverWidget.f(qVar.f309183n, qVar.f309191v, false);
    }

    public final lj2.v0 getPluginAbility() {
        return this.f326420d;
    }

    public final lj2.x0 getService() {
        return this.f326421e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("KTVSingerLayout", "onAttachedToWindow");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("KTVSingerLayout", "onDetachedFromWindow");
    }
}
