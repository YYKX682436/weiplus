package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class e extends com.tencent.mm.plugin.voip.widget.BaseSmallView {
    public android.graphics.Bitmap A;
    public android.graphics.Bitmap B;
    public android.graphics.Bitmap C;
    public android.graphics.Bitmap D;
    public final java.lang.Runnable E;
    public final com.tencent.mm.sdk.event.IListener F;
    public final androidx.lifecycle.k0 G;
    public final androidx.lifecycle.k0 H;
    public boolean I;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView f177133h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView f177134i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f177135m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f177136n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f177137o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f177138p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f177139q;

    /* renamed from: r, reason: collision with root package name */
    public int f177140r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f177141s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f177142t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.RelativeLayout f177143u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.ImageView f177144v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f177145w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f177146x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f177147y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f177148z;

    public e(android.content.Context context) {
        super(context, null);
        float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);
        this.f177140r = -1;
        this.f177141s = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f177146x = false;
        this.f177147y = false;
        this.f177148z = false;
        this.E = new com.tencent.mm.plugin.voip.widget.f(this);
        com.tencent.mm.plugin.voip.widget.NewVideoTalkingSmallView$2 newVideoTalkingSmallView$2 = new com.tencent.mm.plugin.voip.widget.NewVideoTalkingSmallView$2(this, com.tencent.mm.app.a0.f53288d);
        this.F = newVideoTalkingSmallView$2;
        com.tencent.mm.plugin.voip.widget.h hVar = new com.tencent.mm.plugin.voip.widget.h(this);
        this.G = hVar;
        com.tencent.mm.plugin.voip.widget.i iVar = new com.tencent.mm.plugin.voip.widget.i(this);
        this.H = iVar;
        this.I = false;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d4v, this);
        this.f177142t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o_q);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.p7z);
        this.f177143u = relativeLayout;
        relativeLayout.setVisibility(4);
        this.f177144v = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.p7x);
        this.f177145w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p7y);
        this.f177133h = (com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView) findViewById(com.tencent.mm.R.id.khr);
        this.f177142t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o_q);
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = (com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView) findViewById(com.tencent.mm.R.id.khq);
        this.f177134i = voIPRenderTextureView;
        voIPRenderTextureView.setClipToOutline(true);
        voIPRenderTextureView.setOutlineProvider(new com.tencent.mm.plugin.voip.ui.f1(b17));
        this.f177135m = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById(com.tencent.mm.R.id.imt);
        this.f177136n = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById(com.tencent.mm.R.id.lxd);
        this.f177137o = findViewById(com.tencent.mm.R.id.lxc);
        this.f177138p = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById(com.tencent.mm.R.id.lxe);
        this.f177139q = false;
        newVideoTalkingSmallView$2.alive();
        if (gq4.v.Bi() != null && gq4.v.Bi().f176559b != null) {
            ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.widget.e$$a
                @Override // java.lang.Runnable
                public final void run() {
                    final com.tencent.mm.plugin.voip.widget.e eVar = com.tencent.mm.plugin.voip.widget.e.this;
                    eVar.getClass();
                    gq4.a aVar = gq4.v.Bi().f176559b;
                    java.lang.String r17 = c01.z1.r();
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
                    android.graphics.Bitmap loadBitmap = com.tencent.mm.pluginsdk.ui.u.c().loadBitmap(r17);
                    eVar.A = loadBitmap;
                    if (loadBitmap == null) {
                        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
                        eVar.A = com.tencent.mm.pluginsdk.ui.u.c().uc();
                    }
                    if (aVar != null) {
                        java.lang.String str = ((com.tencent.mm.plugin.voip.model.d0) aVar).f176383p;
                        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
                        eVar.B = com.tencent.mm.pluginsdk.ui.u.c().loadBitmap(str);
                    }
                    if (eVar.B == null) {
                        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
                        eVar.B = com.tencent.mm.pluginsdk.ui.u.c().uc();
                    }
                    android.graphics.Bitmap bitmap = eVar.A;
                    if (bitmap != null) {
                        eVar.C = com.tencent.mm.sdk.platformtools.x.X(bitmap, 30);
                    }
                    android.graphics.Bitmap bitmap2 = eVar.B;
                    if (bitmap2 != null) {
                        eVar.D = com.tencent.mm.sdk.platformtools.x.X(bitmap2, 30);
                    }
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.widget.e$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.voip.widget.e.this.m();
                        }
                    });
                }
            });
            boolean z17 = gq4.v.wi().f365976j;
            if (this.f177140r == -1 || z17 != this.f177147y) {
                this.f177147y = z17;
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "showLocalCaptureState: " + z17);
                n();
            }
            i(gq4.v.Bi().w());
        }
        gq4.v.wi().f365968b.observeForever(hVar);
        gq4.v.wi().f365973g.observeForever(iVar);
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void c(boolean z17) {
        if (!z17) {
            super.c(false);
            return;
        }
        android.widget.TextView textView = this.f177142t;
        textView.setVisibility(0);
        textView.setText(com.tencent.mm.R.string.kcl);
        setContentDescription(getResources().getString(com.tencent.mm.R.string.jps));
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public boolean d() {
        super.d();
        this.f177142t.setVisibility(8);
        this.f177143u.setVisibility(0);
        this.f177144v.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_call_end, android.graphics.Color.parseColor("#FFFFFF")));
        android.widget.TextView textView = this.f177145w;
        textView.setVisibility(0);
        textView.setText(com.tencent.mm.R.string.kc_);
        textView.requestLayout();
        setContentDescription("");
        return true;
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void e(int i17) {
        qq4.b wi6 = gq4.v.wi();
        if (i17 > 0) {
            wi6.f365974h = i17;
        } else {
            wi6.getClass();
        }
        o();
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void f() {
        this.f177142t.setVisibility(8);
        this.f177143u.setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void g() {
        this.f177142t.setVisibility(8);
        this.f177143u.setVisibility(0);
        this.f177144v.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icon_filled_mike_off, android.graphics.Color.parseColor("#FFFFFF")));
        android.widget.TextView textView = this.f177145w;
        textView.setText(com.tencent.mm.R.string.kdc);
        textView.requestLayout();
        super.g();
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void h(int i17, int i18) {
        int i19 = this.f177140r;
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = this.f177134i;
        if (i19 == 2 || i19 == 0 || i19 == 256 || this.f177146x) {
            voIPRenderTextureView.a(false);
        } else {
            this.f177139q = true;
            m();
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "onRemoteReady");
            n();
            o();
            voIPRenderTextureView.b();
            this.f177133h.a(false);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void i(boolean z17) {
        if (this.f177140r == -1 || z17 != this.f177148z) {
            this.f177148z = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "showRemoteCaptureState: " + z17);
            n();
        }
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void j() {
        ((com.tencent.mm.plugin.voip.ui.g) this.f177090f.get()).g(this.f177134i);
        ((com.tencent.mm.plugin.voip.ui.g) this.f177090f.get()).g(this.f177133h);
        this.f177088d = null;
        this.F.dead();
        setVisibility(4);
        gq4.v.wi().f365968b.removeObserver(this.G);
        gq4.v.wi().f365973g.removeObserver(this.H);
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void k(java.lang.String str) {
        android.widget.TextView textView = this.f177142t;
        textView.setTextSize(1, 12.0f);
        textView.setText(str);
        setContentDescription(getResources().getString(com.tencent.mm.R.string.jpu));
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void l(java.lang.String str) {
        setContentDescription(getResources().getString(com.tencent.mm.R.string.jpt));
    }

    public final void m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "refreshAvatar: " + this.f177139q);
        this.f177135m.setImageBitmap(this.A);
        this.f177138p.setImageBitmap(this.f177139q ? this.B : this.A);
        this.f177136n.setImageBitmap(this.f177139q ? this.D : this.C);
    }

    public final void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus, mIsRemoteReady:" + this.f177139q + ", isLocalPause:" + this.f177147y + ", isRemotePause::" + this.f177148z);
        boolean z17 = this.f177139q;
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f177138p;
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = this.f177134i;
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView2 = this.f177133h;
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView2 = this.f177135m;
        if (z17) {
            mMRoundCornerImageView2.setVisibility(this.f177147y ? 0 : 8);
            voIPRenderTextureView.setVisibility(this.f177147y ? 8 : 0);
            mMRoundCornerImageView.setVisibility(this.f177148z ? 0 : 8);
            android.view.View view = this.f177137o;
            int i17 = this.f177148z ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voip/widget/NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/voip/widget/NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            voIPRenderTextureView2.setVisibility(this.f177148z ? 8 : 0);
            return;
        }
        mMRoundCornerImageView2.setVisibility(8);
        voIPRenderTextureView2.setVisibility(8);
        voIPRenderTextureView.setVisibility(this.f177147y ? 8 : 0);
        mMRoundCornerImageView.setVisibility(!this.f177147y ? 8 : 0);
        android.view.View view2 = this.f177137o;
        int i18 = this.f177147y ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/voip/widget/NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/voip/widget/NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r8 != 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if ((r10 % 2) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "refreshFloatBallSize:" + r11.f177140r + ", " + r0 + ", " + r7 + ", " + r10);
        r0 = iq4.b.f293798a;
        r0.h0(4, false, r2);
        r0.g();
        r0 = (float) ((-(r7 + r10)) * 90);
        r4.setRotation(r0);
        r3.setRotation(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        if ((((((vq4.b0.f439273d && vq4.b0.f439274e) && gq4.v.wi().f365972f) ? 0 : r7 + r10) + r0) % 2) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.widget.e.o():void");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o();
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if (this.f177090f == null) {
            this.I = true;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "view added");
        com.tencent.mm.plugin.voip.ui.g gVar = (com.tencent.mm.plugin.voip.ui.g) this.f177090f.get();
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = this.f177134i;
        gVar.h(voIPRenderTextureView, 0);
        com.tencent.mm.plugin.voip.ui.g gVar2 = (com.tencent.mm.plugin.voip.ui.g) this.f177090f.get();
        int i17 = this.f177140r;
        gVar2.j(false, (260 == i17 || 6 == i17) ? false : true);
        com.tencent.mm.plugin.voip.ui.g gVar3 = (com.tencent.mm.plugin.voip.ui.g) this.f177090f.get();
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView2 = this.f177133h;
        gVar3.h(voIPRenderTextureView2, 1);
        voIPRenderTextureView2.getClass();
        voIPRenderTextureView.getClass();
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void setConnectSec(long j17) {
        super.setConnectSec(j17);
        if (j17 != -1) {
            this.f177141s.post(this.E);
        }
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void setStatus(int i17) {
        this.f177140r = i17;
        if (i17 == 2 || i17 == 256 || i17 == 0) {
            this.f177146x = true;
            this.f177133h.a(true);
            com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = this.f177134i;
            voIPRenderTextureView.setVisibility(0);
            voIPRenderTextureView.a(false);
            this.f177142t.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        o();
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void setVoicePlayDevice(int i17) {
        if (this.f177089e != i17) {
            android.widget.TextView textView = this.f177142t;
            textView.setVisibility(8);
            this.f177089e = i17;
            this.f177143u.setVisibility(0);
            android.widget.ImageView imageView = this.f177144v;
            android.widget.TextView textView2 = this.f177145w;
            if (i17 == 1) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_volume_up, android.graphics.Color.parseColor("#FFFFFF")));
                textView2.setText(com.tencent.mm.R.string.kc9);
            } else if (i17 == 2) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_ear, android.graphics.Color.parseColor("#FFFFFF")));
                textView2.setText(com.tencent.mm.R.string.kc7);
            } else if (i17 == 3) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_headset, android.graphics.Color.parseColor("#FFFFFF")));
                textView2.setText(com.tencent.mm.R.string.kc8);
            } else if (i17 == 4) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_bluetooth, android.graphics.Color.parseColor("#FFFFFF")));
                textView2.setText(com.tencent.mm.R.string.kc6);
            }
            textView.setVisibility(8);
            textView2.requestLayout();
            super.setVoicePlayDevice(i17);
        }
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void setVoipUIListener(com.tencent.mm.plugin.voip.ui.g gVar) {
        super.setVoipUIListener(gVar);
        if (this.I) {
            com.tencent.mm.plugin.voip.ui.g gVar2 = (com.tencent.mm.plugin.voip.ui.g) this.f177090f.get();
            com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = this.f177134i;
            gVar2.h(voIPRenderTextureView, 0);
            com.tencent.mm.plugin.voip.ui.g gVar3 = (com.tencent.mm.plugin.voip.ui.g) this.f177090f.get();
            int i17 = this.f177140r;
            gVar3.j(false, (260 == i17 || 6 == i17) ? false : true);
            com.tencent.mm.plugin.voip.ui.g gVar4 = (com.tencent.mm.plugin.voip.ui.g) this.f177090f.get();
            com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView2 = this.f177133h;
            gVar4.h(voIPRenderTextureView2, 1);
            this.I = false;
            voIPRenderTextureView2.getClass();
            voIPRenderTextureView.getClass();
        }
    }
}
