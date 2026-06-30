package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public class q3 implements bi4.n0, bi4.p0, android.view.View.OnClickListener {
    public mj4.h A;
    public pj4.o0 A1;
    public final android.widget.FrameLayout B;
    public al5.a0 B1;
    public final cj4.l1 C;
    public final com.tencent.mm.plugin.textstatus.ui.m3 C1;
    public final android.view.View D;
    public bi4.m0 D1;
    public final android.view.View E;
    public f25.m0 E1;
    public final android.view.ViewGroup F;
    public final android.widget.TextView G;
    public final android.widget.TextView H;
    public final android.view.ViewGroup I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.View f174188J;
    public final android.view.View K;
    public final android.view.View L;
    public com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout M;
    public final android.widget.FrameLayout N;
    public final android.widget.FrameLayout P;
    public final android.view.View Q;
    public final android.widget.TextView R;
    public final android.view.View S;
    public final android.view.View T;
    public final android.view.View U;
    public final android.view.View V;
    public final android.view.View W;
    public final android.view.View X;
    public final com.tencent.mm.plugin.textstatus.ui.e4 Y;
    public boolean Z;

    /* renamed from: d, reason: collision with root package name */
    public final bi4.k1 f174189d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f174190e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f174191f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f174192g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f174193h;

    /* renamed from: i, reason: collision with root package name */
    public final float f174194i;

    /* renamed from: l1, reason: collision with root package name */
    public bi4.j1 f174195l1;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f174196m;

    /* renamed from: n, reason: collision with root package name */
    public final android.content.Context f174197n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.LongTextView f174198o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f174199p;

    /* renamed from: p0, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.nd f174200p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f174201p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f174202q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f174203r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f174204s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f174205t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f174206u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f174207v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.ImageView f174208w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.ImageView f174209x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f174210x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f174211x1;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f174212y;

    /* renamed from: y0, reason: collision with root package name */
    public final android.view.View.OnAttachStateChangeListener f174213y0;

    /* renamed from: y1, reason: collision with root package name */
    public long f174214y1;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f174215z;

    /* renamed from: z1, reason: collision with root package name */
    public final bi4.m0 f174216z1;

    public q3(android.content.Context context, bi4.k1 showParam) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(showParam, "showParam");
        this.f174189d = showParam;
        this.f174190e = "MicroMsg.TextStatus.StatusCardView@" + hashCode();
        this.f174191f = jz5.h.b(com.tencent.mm.plugin.textstatus.ui.i3.f173972d);
        this.f174192g = jz5.h.b(com.tencent.mm.plugin.textstatus.ui.j3.f174001d);
        this.f174193h = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.k3(this));
        this.f174194i = 1.7777778f;
        boolean z17 = false;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cyp, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f174196m = inflate;
        this.f174197n = context;
        this.f174202q = "";
        com.tencent.mm.plugin.textstatus.ui.e4 e4Var = new com.tencent.mm.plugin.textstatus.ui.e4(context);
        this.Y = e4Var;
        com.tencent.mm.plugin.textstatus.ui.nd ndVar = new com.tencent.mm.plugin.textstatus.ui.nd(s());
        this.f174200p0 = ndVar;
        com.tencent.mm.plugin.textstatus.ui.h3 h3Var = new com.tencent.mm.plugin.textstatus.ui.h3(this);
        this.f174213y0 = h3Var;
        this.f174195l1 = bi4.j1.NONE;
        cj4.i1 i1Var = new cj4.i1(showParam);
        this.C = i1Var;
        i1Var.i(inflate);
        i1Var.f41969z1 = new com.tencent.mm.plugin.textstatus.ui.c3(this);
        i1Var.C1 = new com.tencent.mm.plugin.textstatus.ui.d3();
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.opk);
        if (textView != null) {
            textView.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479628b3));
        }
        this.f174198o = (com.tencent.mm.plugin.textstatus.ui.LongTextView) inflate.findViewById(com.tencent.mm.R.id.om7);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate.findViewById(com.tencent.mm.R.id.hwc);
        this.f174208w = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.b0s);
        this.f174209x = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h7m);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.onw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ope);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        this.f174203r = inflate.findViewById(com.tencent.mm.R.id.hvn);
        this.f174204s = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hkk);
        this.f174205t = inflate.findViewById(com.tencent.mm.R.id.hnr);
        this.K = inflate.findViewById(com.tencent.mm.R.id.hmt);
        this.L = inflate.findViewById(com.tencent.mm.R.id.f487532ow3);
        this.B = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.hyw);
        this.f174206u = inflate.findViewById(com.tencent.mm.R.id.hvz);
        this.f174207v = inflate.findViewById(com.tencent.mm.R.id.hvp);
        this.N = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.hyd);
        this.P = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.hyc);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f483487b03);
        this.D = findViewById2;
        this.E = inflate.findViewById(com.tencent.mm.R.id.b0y);
        this.f174212y = inflate.findViewById(com.tencent.mm.R.id.owd);
        this.f174215z = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oqc);
        this.F = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.hye);
        this.G = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487433om5);
        this.H = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oqx);
        this.I = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.hxg);
        this.f174188J = inflate.findViewById(com.tencent.mm.R.id.hmy);
        this.Q = inflate.findViewById(com.tencent.mm.R.id.qpo);
        this.S = inflate.findViewById(com.tencent.mm.R.id.f484091qi1);
        this.R = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484092qi2);
        this.T = inflate.findViewById(com.tencent.mm.R.id.r9p);
        this.U = inflate.findViewById(com.tencent.mm.R.id.qkr);
        this.V = inflate.findViewById(com.tencent.mm.R.id.r_b);
        this.W = inflate.findViewById(com.tencent.mm.R.id.qql);
        this.X = inflate.findViewById(com.tencent.mm.R.id.rbo);
        if (showParam.l(128)) {
            inflate.setOutlineProvider(new bk4.e2(true, true, i65.a.a(context, 12.0f)));
            inflate.setClipToOutline(true);
        }
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC textStatusCardFeedUIC = (com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) a17;
        if (showParam.l(32) && textStatusCardFeedUIC.f173773d) {
            z17 = true;
        }
        v5(z17);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.e3(this));
        }
        inflate.addOnAttachStateChangeListener(h3Var);
        ndVar.f174133e = new com.tencent.mm.plugin.textstatus.ui.f3(this, context);
        di4.i iVar = di4.i.f232782a;
        if (((java.lang.Boolean) ((jz5.n) di4.i.f232789h).getValue()).booleanValue()) {
            android.view.ViewGroup viewGroup = constraintLayout instanceof androidx.constraintlayout.widget.ConstraintLayout ? constraintLayout : null;
            if (viewGroup != null && e4Var.f173835i == null) {
                android.widget.ImageView imageView = new android.widget.ImageView(e4Var.f173827a);
                imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable((android.graphics.drawable.Drawable) ((jz5.n) e4Var.f173833g).getValue());
                imageView.setVisibility(8);
                imageView.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.w3(e4Var));
                imageView.setAlpha(1.0f);
                imageView.setId(android.view.View.generateViewId());
                jz5.g gVar = e4Var.f173828b;
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
                layoutParams.f10906q = com.tencent.mm.R.id.om7;
                layoutParams.f10897j = com.tencent.mm.R.id.om7;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = e4Var.b();
                viewGroup.addView(imageView, layoutParams);
                e4Var.f173835i = imageView;
            }
            e4Var.f173839m = new com.tencent.mm.plugin.textstatus.ui.g3(this);
        }
        this.f174201p1 = "";
        this.f174211x1 = "";
        this.f174216z1 = new com.tencent.mm.plugin.textstatus.ui.l3(this);
        this.C1 = new com.tencent.mm.plugin.textstatus.ui.m3(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        if (this.f174189d.f21067g == 6) {
            android.view.View view = this.f174196m;
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.nwo);
            pj4.n1 n1Var = tag instanceof pj4.n1 ? (pj4.n1) tag : null;
            if (n1Var != null) {
                int i17 = com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity.f173502q;
                android.content.Context context = this.f174197n;
                kotlin.jvm.internal.o.g(context, "context");
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity.class);
                intent.putExtra("history_item", n1Var.toByteArray());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDetailActivity$Companion", "start", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusHistory;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusDetailActivity$Companion", "start", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusHistory;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.nwq);
            qj4.s.m(qj4.s.f363958a, this.f174197n, 27L, null, this.A, 0L, 0L, (tag2 instanceof java.lang.Integer ? (java.lang.Integer) tag2 : null) != null ? r4.intValue() : 0, 0L, null, null, 0L, 1972, null);
        }
    }

    private final void i() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append("] destroyThirdBackManual ");
        al5.a0 a0Var = this.B1;
        sb6.append(a0Var != null ? java.lang.Integer.valueOf(a0Var.hashCode()) : null);
        com.tencent.mars.xlog.Log.i(this.f174190e, sb6.toString());
        C();
        o(this.B1);
        al5.a0 a0Var2 = this.B1;
        if (a0Var2 != null) {
            a0Var2.onDestroy();
        }
        this.B1 = null;
        this.A1 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r0.q(r2) == true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v() {
        /*
            r4 = this;
            cj4.l1 r0 = r4.C
            cj4.i1 r0 = (cj4.i1) r0
            bi4.o0 r0 = r0.d()
            r1 = 0
            android.widget.FrameLayout r2 = r4.N
            if (r2 == 0) goto L17
            if (r0 == 0) goto L17
            boolean r0 = r0.q(r2)
            r3 = 1
            if (r0 != r3) goto L17
            goto L18
        L17:
            r3 = r1
        L18:
            if (r3 == 0) goto L21
            if (r2 != 0) goto L1d
            goto L29
        L1d:
            r2.setVisibility(r1)
            goto L29
        L21:
            if (r2 != 0) goto L24
            goto L29
        L24:
            r0 = 8
            r2.setVisibility(r0)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.q3.v():void");
    }

    public final void A() {
        kk4.b player;
        mj4.h hVar = this.A;
        if (hVar != null && ((mj4.k) hVar).x()) {
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.M;
            com.tencent.mm.plugin.textstatus.ui.nd ndVar = this.f174200p0;
            ndVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusLivePlayHandler", "outSideLongClick");
            if (mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null) {
                return;
            }
            kk4.v vVar = (kk4.v) player;
            boolean s17 = vVar.s();
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusLivePlayHandler", "outSideLongClick to play layout long press " + s17);
            if (s17) {
                return;
            }
            ndVar.f174130b = false;
            ndVar.f174131c = true;
            kk4.b.f(player, 0, false, null, 6, null);
            vVar.O();
            yz5.a aVar = ndVar.f174133e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (((mj4.k) r0).x() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            r5 = this;
            mj4.h r0 = r5.A
            r1 = 0
            if (r0 == 0) goto Lf
            mj4.k r0 = (mj4.k) r0
            boolean r0 = r0.x()
            r2 = 1
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L3c
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r0 = r5.M
            com.tencent.mm.plugin.textstatus.ui.nd r2 = r5.f174200p0
            r2.getClass()
            if (r0 == 0) goto L3c
            kk4.b r0 = r0.getPlayer()
            if (r0 == 0) goto L3c
            r3 = r0
            kk4.v r3 = (kk4.v) r3
            boolean r3 = r3.s()
            boolean r4 = r2.f174131c
            if (r3 == 0) goto L3a
            if (r4 == 0) goto L3a
            r3 = 3
            r4 = 0
            kk4.b.i(r0, r1, r1, r3, r4)
            android.widget.FrameLayout r0 = r5.B
            if (r0 == 0) goto L3a
            r2.a(r0)
        L3a:
            r2.f174131c = r1
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.q3.B():void");
    }

    public final void C() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pauseThirdPreview: ");
        al5.a0 a0Var = this.B1;
        sb6.append(a0Var != null ? java.lang.Integer.valueOf(a0Var.hashCode()) : null);
        sb6.append(", statusId=");
        mj4.h hVar = this.A;
        sb6.append(hVar != null ? ((mj4.k) hVar).l() : null);
        sb6.append(", icon=");
        bk4.f a17 = bk4.i.a();
        mj4.h hVar2 = this.A;
        sb6.append(a17.m(hVar2 != null ? xe0.j0.a(hVar2, false, 1, null) : null));
        com.tencent.mars.xlog.Log.i(this.f174190e, sb6.toString());
        al5.a0 a0Var2 = this.B1;
        if (a0Var2 != null) {
            a0Var2.i();
        }
        al5.a0 a0Var3 = this.B1;
        if (a0Var3 != null) {
            a0Var3.g();
        }
    }

    public final void D() {
        kk4.b player;
        kk4.b player2;
        kk4.b player3;
        java.lang.String str = this.f174190e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pauseVideo() called textureView:");
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.M;
        sb6.append((mMTPEffectVideoLayout == null || (player3 = mMTPEffectVideoLayout.getPlayer()) == null) ? null : java.lang.Integer.valueOf(player3.hashCode()));
        sb6.append(" state:");
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.M;
        sb6.append((mMTPEffectVideoLayout2 == null || (player2 = mMTPEffectVideoLayout2.getPlayer()) == null) ? null : java.lang.Integer.valueOf(((kk4.v) player2).f308579d));
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout3 = this.M;
        if (mMTPEffectVideoLayout3 != null && (player = mMTPEffectVideoLayout3.getPlayer()) != null) {
            kk4.b.i(player, false, false, 3, null);
        }
        G();
    }

    public void E() {
        al5.a0 a0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playThirdPreview: onPreOpen onPostOpen ");
        sb6.append(this.B1);
        sb6.append(", statusId=");
        mj4.h hVar = this.A;
        sb6.append(hVar != null ? ((mj4.k) hVar).l() : null);
        sb6.append(", icon=");
        bk4.f a17 = bk4.i.a();
        mj4.h hVar2 = this.A;
        sb6.append(a17.m(hVar2 != null ? xe0.j0.a(hVar2, false, 1, null) : null));
        com.tencent.mm.sdk.platformtools.Log.a(this.f174190e, sb6.toString(), new java.lang.Object[0]);
        al5.a0 a0Var2 = this.B1;
        if (a0Var2 != null) {
            a0Var2.j();
        }
        if ((this.Y.f173836j ? !this.Z : false) && (a0Var = this.B1) != null) {
            a0Var.a(true);
        }
        al5.a0 a0Var3 = this.B1;
        if (a0Var3 != null) {
            a0Var3.h();
        }
    }

    public void F() {
        kk4.b player;
        kk4.b player2;
        kk4.b player3;
        kk4.b player4;
        kk4.b player5;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playVideo() called textureView:");
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.M;
        sb6.append((mMTPEffectVideoLayout == null || (player5 = mMTPEffectVideoLayout.getPlayer()) == null) ? null : java.lang.Integer.valueOf(player5.hashCode()));
        com.tencent.mars.xlog.Log.i(this.f174190e, sb6.toString());
        mj4.h hVar = this.A;
        boolean z17 = hVar != null && ((mj4.k) hVar).x();
        android.widget.FrameLayout frameLayout = this.B;
        com.tencent.mm.plugin.textstatus.ui.nd ndVar = this.f174200p0;
        if (z17) {
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.M;
            ndVar.f174130b = false;
            ndVar.f174131c = false;
            if (frameLayout != null) {
                frameLayout.setAlpha(0.0f);
            }
            if (mMTPEffectVideoLayout2 != null && (player4 = mMTPEffectVideoLayout2.getPlayer()) != null) {
                ((kk4.v) player4).A(false);
            }
            if (mMTPEffectVideoLayout2 != null) {
                mMTPEffectVideoLayout2.setOnFrameAvailable(new com.tencent.mm.plugin.textstatus.ui.ld(ndVar, frameLayout));
            }
            kk4.b player6 = mMTPEffectVideoLayout2 != null ? mMTPEffectVideoLayout2.getPlayer() : null;
            if (player6 != null) {
                ((kk4.v) player6).f308595t = new com.tencent.mm.plugin.textstatus.ui.md(ndVar, frameLayout);
            }
        } else {
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout3 = this.M;
            ndVar.f174130b = false;
            ndVar.f174131c = false;
            if (mMTPEffectVideoLayout3 != null && (player = mMTPEffectVideoLayout3.getPlayer()) != null) {
                ((kk4.v) player).A(true);
            }
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f);
            }
            if (mMTPEffectVideoLayout3 != null) {
                mMTPEffectVideoLayout3.setOnFirstFrameAvailable(null);
            }
            kk4.b player7 = mMTPEffectVideoLayout3 != null ? mMTPEffectVideoLayout3.getPlayer() : null;
            if (player7 != null) {
                ((kk4.v) player7).f308595t = null;
            }
        }
        if (this.f174210x0) {
            this.f174210x0 = false;
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout4 = this.M;
            if (mMTPEffectVideoLayout4 != null && (player3 = mMTPEffectVideoLayout4.getPlayer()) != null) {
                kk4.b.f(player3, 0, false, null, 6, null);
            }
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout5 = this.M;
        if (mMTPEffectVideoLayout5 == null || (player2 = mMTPEffectVideoLayout5.getPlayer()) == null) {
            return;
        }
        ((kk4.v) player2).O();
    }

    public final void G() {
        java.util.Objects.toString(this.E1);
        f25.m0 m0Var = this.E1;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.E1 = null;
    }

    public void H() {
        pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this.f174197n, 9, pj4.p0.class);
        if (p0Var != null) {
            java.lang.Object tag = this.f174196m.getTag(com.tencent.mm.R.id.nwq);
            java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
            p0Var.f355244o = num != null ? num.intValue() : 0;
            qj4.s.m(qj4.s.f363958a, this.f174197n, 1L, null, this.A, 0L, 0L, 0L, 0L, null, null, this.f174189d.f21067g, 1012, null);
        }
        this.f174214y1 = c01.id.c();
    }

    public final void I(android.view.View view, mj4.h hVar, bi4.k1 k1Var) {
        int i17;
        bk4.q0 q0Var = bk4.q0.f21538a;
        if (view == null || hVar == null) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.TextStatusGroupVisibilityHelper", "setupGroupIcon: failed", new java.lang.Object[0]);
            return;
        }
        mj4.k kVar = (mj4.k) hVar;
        boolean z17 = kotlin.jvm.internal.o.b(kVar.o(), en1.a.a()) && ((i17 = kVar.f327067b.field_Visibility) == 1 || i17 == 3 || i17 == 4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setupGroupIcon: ");
        sb6.append(z17);
        sb6.append(", ");
        sb6.append(kVar.l());
        sb6.append(", hash=");
        sb6.append(hVar.hashCode());
        sb6.append(", visibility:");
        mj4.a aVar = kVar.f327067b;
        sb6.append(aVar.field_Visibility);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusGroupVisibilityHelper", sb6.toString());
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/util/TextStatusGroupVisibilityHelper", "setupGroupIcon", "(Landroid/view/View;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/util/TextStatusGroupVisibilityHelper", "setupGroupIcon", "(Landroid/view/View;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(null);
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.h6y);
        if (weImageView != null) {
            weImageView.setImageResource(aVar.field_Visibility == 1 ? com.tencent.mm.R.raw.icons_filled_lock : com.tencent.mm.R.raw.icons_filled_group_detail);
        }
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        view.setOnClickListener(new bk4.p0(view, hVar, new bk4.n0(context, hVar)));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/util/TextStatusGroupVisibilityHelper", "setupGroupIcon", "(Landroid/view/View;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/textstatus/util/TextStatusGroupVisibilityHelper", "setupGroupIcon", "(Landroid/view/View;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // bi4.s0
    public void I5(java.lang.String str) {
        boolean z17 = str == null || r26.n0.N(str);
        java.lang.String str2 = this.f174190e;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str2, "updateByStatusId: failed");
            return;
        }
        mj4.h t17 = ai4.m0.f5173a.G().t(str);
        this.A = t17;
        java.lang.String o17 = t17 != null ? ((mj4.k) t17).o() : "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateByStatusId: ");
        sb6.append(str);
        sb6.append(", ");
        sb6.append(o17);
        sb6.append(", ");
        mj4.h hVar = this.A;
        sb6.append(hVar != null ? java.lang.Long.valueOf(((mj4.k) hVar).f327067b.field_profileSeq) : null);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        bi4.p0.U2(this, o17, this.A, null, 4, null);
    }

    public final void J() {
        kk4.b player;
        if (this.M == null) {
            com.tencent.mars.xlog.Log.i(this.f174190e, "trySetMute but videoLayout not init");
            return;
        }
        boolean z17 = false;
        if (x()) {
            G();
        } else {
            f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.y.f259117c, new com.tencent.mm.plugin.textstatus.ui.n3(this));
            this.E1 = m96;
            if (m96 != null && ((g25.e) m96).f267980c) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.M;
        if (mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null) {
            return;
        }
        ((kk4.v) player).C(true ^ z17);
    }

    public final void K(mj4.h hVar) {
        java.lang.String o17 = hVar != null ? ((mj4.k) hVar).o() : null;
        boolean b17 = o17 == null ? false : kotlin.jvm.internal.o.b(o17, en1.a.a());
        boolean l17 = this.f174189d.l(65536);
        android.view.View view = this.E;
        if (!l17 || !b17) {
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "updateBtnMore", "(Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "updateBtnMore", "(Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "updateBtnMore", "(Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "updateBtnMore", "(Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view != null) {
            bk4.k1.b(view, 0L, null, new com.tencent.mm.plugin.textstatus.ui.p3(this, hVar, b17), 3, null);
        }
    }

    public final void L() {
        boolean l17 = this.f174189d.l(32768);
        android.view.View view = this.L;
        if (l17) {
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "updateMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "updateMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "updateMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "updateMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean M(bi4.j1 j1Var) {
        if (this.f174195l1 != j1Var) {
            this.f174195l1 = j1Var;
            return true;
        }
        com.tencent.mars.xlog.Log.i(this.f174190e, "updateStatusCardLifeState: skip " + j1Var);
        return false;
    }

    @Override // bi4.n0
    public void S5(long j17) {
        qj4.s sVar = qj4.s.f363958a;
        if (j17 == 111) {
            qj4.s.m(sVar, this.f174197n, j17, null, this.A, 0L, 0L, 0L, 0L, null, null, this.f174189d.f21067g, 1012, null);
            return;
        }
        long c17 = c01.id.c();
        long j18 = this.f174214y1;
        long j19 = c17 - j18;
        qj4.s.m(sVar, this.f174197n, 2L, null, this.A, j17, (j19 < 0 || j18 == 0) ? 0L : j19, 0L, 0L, null, null, 0L, 1988, null);
    }

    @Override // bi4.q0
    public void a() {
        java.lang.String str = this.f174190e;
        com.tencent.mars.xlog.Log.i(str, "[onStatusShowResume]");
        M(bi4.j1.RESUMED);
        mj4.h hVar = this.A;
        java.lang.String o17 = hVar != null ? ((mj4.k) hVar).o() : null;
        if (o17 == null ? false : kotlin.jvm.internal.o.b(o17, en1.a.a())) {
            si4.a G = ai4.m0.f5173a.G();
            mj4.h hVar2 = this.A;
            java.lang.String o18 = hVar2 != null ? ((mj4.k) hVar2).o() : null;
            mj4.h hVar3 = this.A;
            mj4.h i17 = G.i(o18, hVar3 != null ? ((mj4.k) hVar3).f327067b.field_CreateTime : 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStatusShowResume ");
            mj4.h hVar4 = this.A;
            sb6.append(hVar4 != null ? ((mj4.k) hVar4).l() : null);
            sb6.append(' ');
            sb6.append(i17 != null ? ((mj4.k) i17).l() : null);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (i17 != null) {
                mj4.h hVar5 = this.A;
                mj4.k kVar = (mj4.k) i17;
                if (kotlin.jvm.internal.o.b(hVar5 != null ? ((mj4.k) hVar5).l() : null, kVar.l())) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onStatusShowResume to update ");
                    mj4.h hVar6 = this.A;
                    sb7.append(hVar6 != null ? ((mj4.k) hVar6).l() : null);
                    sb7.append(' ');
                    sb7.append(kVar.l());
                    com.tencent.mars.xlog.Log.i(str, sb7.toString());
                    h(false);
                    java.lang.String a17 = en1.a.a();
                    kotlin.jvm.internal.o.f(a17, "username(...)");
                    bi4.p0.U2(this, a17, i17, null, 4, null);
                    h(true);
                    bi4.k1 k1Var = this.f174189d;
                    if (k1Var.l(2097152)) {
                        I(this.T, i17, k1Var);
                    } else if (k1Var.l(131072)) {
                        I(this.V, i17, k1Var);
                    } else {
                        I(this.X, i17, k1Var);
                    }
                    android.view.View view = this.E;
                    if (view != null && view.getVisibility() == 0) {
                        qj4.s.m(qj4.s.f363958a, this.f174197n, 38L, null, i17, 0L, 0L, 0L, 0L, null, null, k1Var.f21067g, 1012, null);
                    }
                }
            }
        }
        if (y() && b21.m.c()) {
            b21.m.j();
        }
        J();
        E();
        F();
        cj4.l1 l1Var = this.C;
        ((cj4.i1) l1Var).c0();
        ((cj4.i1) l1Var).a0();
        si4.a G2 = ai4.m0.f5173a.G();
        mj4.h hVar7 = this.A;
        java.lang.String o19 = hVar7 != null ? ((mj4.k) hVar7).o() : null;
        mj4.h hVar8 = this.A;
        si4.a.k(G2, o19, hVar8 != null ? ((mj4.k) hVar8).l() : null, false, 4, null);
        com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView = this.f174198o;
        if (longTextView != null) {
            longTextView.a(false);
        }
        java.util.Map map = cj4.p1.f42017a;
        android.content.Context context = this.f174197n;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.textstatus.ui.m3 owner = this.C1;
        kotlin.jvm.internal.o.g(owner, "owner");
        java.lang.String str2 = context.getClass().getCanonicalName() + '_' + context.hashCode();
        java.util.Map map2 = cj4.p1.f42017a;
        if (!map2.containsKey(str2)) {
            map2.put(str2, new cj4.n1(str2, context, new cj4.o1(str2)));
        }
        cj4.n1 n1Var = (cj4.n1) ((java.util.LinkedHashMap) map2).get(str2);
        if (n1Var == null) {
            return;
        }
        n1Var.f42006h = new java.lang.ref.WeakReference(owner);
    }

    @Override // bi4.s0
    public void b4(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return;
        }
        com.tencent.mm.sdk.platformtools.Log.c(this.f174190e, "update: " + str, new java.lang.Object[0]);
        mj4.h M = ai4.m0.f5173a.M(str);
        this.A = M;
        bi4.p0.U2(this, str, M, null, 4, null);
    }

    @Override // bi4.q0
    public void c() {
        com.tencent.mars.xlog.Log.i(this.f174190e, "[onStatusShowDestroy]");
        if (M(bi4.j1.DESTROYED)) {
            k();
            cj4.l1 l1Var = this.C;
            l1Var.o();
            l1Var.n();
            i();
        }
    }

    @Override // bi4.q0
    public void d() {
        com.tencent.mars.xlog.Log.i(this.f174190e, "[onStatusShowPause]");
        if (M(bi4.j1.PAUSED)) {
            C();
            D();
            this.C.l();
            com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView = this.f174198o;
            if (longTextView != null) {
                longTextView.a(false);
            }
        }
    }

    @Override // bi4.n0
    public android.view.View getView() {
        return this.f174196m;
    }

    public final void h(boolean z17) {
        bi4.k1 k1Var = this.f174189d;
        if (k1Var.f21067g == 9) {
            com.tencent.mars.xlog.Log.i(this.f174190e, "changeShowParamInHistoryScene: " + z17);
            k1Var.f21066f = z17;
            k1Var.f21065e = z17;
        }
    }

    public final void k() {
        kk4.b player;
        kk4.b player2;
        android.widget.FrameLayout frameLayout = this.B;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.M;
        if (mMTPEffectVideoLayout != null && (player2 = mMTPEffectVideoLayout.getPlayer()) != null) {
            ((kk4.v) player2).P();
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.M;
        if (mMTPEffectVideoLayout2 != null && (player = mMTPEffectVideoLayout2.getPlayer()) != null) {
            player.recycle();
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout3 = this.M;
        if (mMTPEffectVideoLayout3 != null) {
            mMTPEffectVideoLayout3.g();
        }
        G();
    }

    public void l(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:108|(6:(1:111)(1:342)|112|(1:114)(1:341)|(2:116|(1:118))|(5:120|(1:122)(1:339)|123|(1:127)|128)(1:340)|129)(2:343|(7:(1:346)(1:361)|347|(1:349)(1:360)|(2:351|(1:353))|(1:355)(1:359)|(1:357)|358)(2:362|(4:(1:365)(1:372)|366|(1:368)(1:371)|(1:370))(23:373|(1:375)|376|(5:378|(1:380)(1:387)|381|(1:383)(1:386)|(1:385))|131|(11:133|(4:137|(1:139)(1:180)|(1:179)(1:145)|(6:147|(1:178)(1:151)|(1:177)(1:155)|(1:176)(1:159)|160|(3:162|(1:164)(1:175)|(2:(1:167)(2:169|(1:171)(1:(1:173)(1:174)))|168))))|181|(1:149)|178|(1:153)|177|(1:157)|176|160|(0))|182|183|184|(1:186)|187|(4:189|(4:191|(1:193)(1:333)|194|(2:196|(16:198|(1:200)|(1:202)|203|(1:205)(1:330)|206|207|208|(1:210)(1:326)|211|(13:(1:214)|(1:216)(1:274)|(1:218)(1:273)|(1:220)|(1:222)|223|(1:225)|226|(1:228)|229|(1:272)(1:233)|(2:235|(1:237))(2:269|(1:271))|238)(2:275|(6:304|(1:306)|(1:308)(1:325)|(1:310)|(1:312)|(10:314|(1:316)|317|(1:(1:320))(1:(6:324|322|(1:241)(3:264|(1:266)(1:268)|267)|(3:243|(1:245)(1:251)|(1:247)(2:248|(1:250)))|252|(2:(1:262)(1:257)|(2:259|260)(1:261))(1:263)))|321|322|(0)(0)|(0)|252|(0)(0)))(9:(1:280)(1:303)|(1:282)|(1:284)|(1:286)(1:302)|(1:288)(1:301)|(1:300)(1:292)|293|(1:(1:296))(1:(1:299))|297))|239|(0)(0)|(0)|252|(0)(0))))(1:334)|332|(0))(1:335)|331|207|208|(0)(0)|211|(0)(0)|239|(0)(0)|(0)|252|(0)(0))))|130|131|(0)|182|183|184|(0)|187|(0)(0)|331|207|208|(0)(0)|211|(0)(0)|239|(0)(0)|(0)|252|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0723, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0724, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace(r14, r0, "handleThirdThumb Error", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x069b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x069c, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace(r14, r0, "update handleVideo failed", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0c49  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0ca0  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0ccf  */
    /* JADX WARN: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(java.lang.String r34, mj4.h r35, pj4.u0 r36) {
        /*
            Method dump skipped, instructions count: 3307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.q3.m(java.lang.String, mj4.h, pj4.u0):void");
    }

    public void n(al5.a0 a0Var) {
    }

    public void o(al5.a0 a0Var) {
    }

    @Override // bi4.n0
    public void onBackPressed() {
        al5.a0 a0Var = this.B1;
        if (a0Var != null) {
            a0Var.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/StatusCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.o4w) {
            g();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void r(float f17, float f18, float f19) {
    }

    public boolean s() {
        return false;
    }

    public int t() {
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x014e, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r6 != null ? r6.f355141f : null) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0162, code lost:
    
        r6 = r14.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0164, code lost:
    
        if (r6 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0166, code lost:
    
        ((cj4.i1) r6).Y(r14.B1, r15, ((cj4.i1) r6).d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0160, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r10 != null ? r10.f355141f : null) != false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u(mj4.h r15) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.q3.u(mj4.h):boolean");
    }

    @Override // bi4.n0
    public void v3(boolean z17) {
        qj4.s sVar = qj4.s.f363958a;
        if (z17) {
            qj4.s.m(sVar, this.f174197n, 72L, null, this.A, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
        } else {
            qj4.s.m(sVar, this.f174197n, 71L, null, this.A, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
        }
    }

    @Override // bi4.n0
    public void v5(boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        android.content.Context context = this.f174197n;
        android.view.View view = this.f174212y;
        if (z17) {
            if (view == null || (layoutParams2 = view.getLayoutParams()) == null) {
                return;
            }
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i65.a.h(context, com.tencent.mm.R.dimen.f479724dg);
            layoutParams2.height = -2;
            view.setLayoutParams(layoutParams2);
            return;
        }
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        bi4.k1 k1Var = this.f174189d;
        int i17 = k1Var.f21067g;
        if (i17 == 4 || i17 == 5 || !k1Var.l(32)) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        } else {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = com.tencent.mm.ui.bl.c(context);
        }
        layoutParams.height = 0;
        view.setLayoutParams(layoutParams);
    }

    public final void w() {
        mj4.h hVar;
        java.lang.String j17;
        int i17;
        int i18;
        java.util.LinkedList linkedList;
        pj4.m0 m0Var;
        if (this.f174199p == null || (hVar = this.A) == null) {
            return;
        }
        mj4.k kVar = (mj4.k) hVar;
        mj4.a aVar = kVar.f327067b;
        if (aVar.field_MediaType == 2 || kVar.x()) {
            bi4.k1 k1Var = this.f174189d;
            if (k1Var.l(16)) {
                com.tencent.mars.xlog.Log.i(this.f174190e, "playVideo create views");
                android.widget.FrameLayout frameLayout = this.B;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.M;
                android.content.Context context = this.f174197n;
                if (mMTPEffectVideoLayout == null) {
                    this.M = new com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout(context);
                }
                com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.M;
                if (mMTPEffectVideoLayout2 == null) {
                    return;
                }
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                if (frameLayout != null) {
                    frameLayout.addView(mMTPEffectVideoLayout2, layoutParams);
                }
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                java.lang.String str = null;
                if (kVar.x()) {
                    if (kVar.f327070e == null || kVar.f327071f != kVar.r().hashCode()) {
                        kVar.r();
                        if (!(kVar.r().length == 0)) {
                            com.tencent.mm.protobuf.f parseFrom = new pj4.b0().parseFrom(kVar.r());
                            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.StatusExtInfo");
                            kVar.f327070e = ((pj4.b0) parseFrom).R;
                            kVar.f327071f = kVar.r().hashCode();
                        }
                        if (kVar.f327070e == null) {
                            kVar.f327070e = new java.util.LinkedList();
                        }
                        linkedList = kVar.f327070e;
                    } else {
                        linkedList = kVar.f327070e;
                    }
                    j17 = (linkedList == null || (m0Var = (pj4.m0) kz5.n0.Z(linkedList)) == null) ? null : m0Var.f355177f;
                } else {
                    j17 = kVar.j();
                }
                if (j17 != null) {
                    byte[] bytes = j17.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    str = kk.k.g(bytes);
                }
                java.lang.String str2 = str == null ? "" : str;
                java.lang.String str3 = j17 != null ? j17 : "";
                bk4.n nVar = bk4.n.f21513a;
                java.lang.String g17 = nVar.g("video", kVar.l(), str3);
                boolean j18 = com.tencent.mm.vfs.w6.j(g17);
                if (k1Var.f21066f) {
                    g17 = nVar.b(str3);
                    j18 = false;
                }
                int i19 = aVar.field_mediaWidth;
                int i27 = aVar.field_mediaHeight;
                if (i19 <= 0 || i27 <= 0) {
                    com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
                    com.tencent.mm.ui.ah a18 = com.tencent.mm.ui.bh.a(context);
                    i17 = a17.f197135a;
                    i18 = a18.f197136b;
                } else {
                    i18 = i27;
                    i17 = i19;
                }
                dk4.a aVar2 = new dk4.a(str2, g17, str3, i17, i18);
                aVar2.f234468e = j18;
                if (j18) {
                    qc0.e1 e1Var = (qc0.e1) i95.n0.c(qc0.e1.class);
                    kotlin.jvm.internal.o.d(g17);
                    qc0.d1 Ai = ((pc0.g2) e1Var).Ai(g17, true);
                    aVar2.f234470g = Ai != null ? Ai.f361366d : 0L;
                    aVar2.f234474k = Ai != null ? Ai.f361368f : 0;
                }
                mMTPEffectVideoLayout2.f();
                mMTPEffectVideoLayout2.setMediaInfo(aVar2);
                kk4.b player = mMTPEffectVideoLayout2.getPlayer();
                if (player != null) {
                    ((kk4.v) player).f308585j = true;
                }
                kk4.b player2 = mMTPEffectVideoLayout2.getPlayer();
                if (player2 != null) {
                    ((kk4.v) player2).A(true);
                }
                mMTPEffectVideoLayout2.getEffectManager().f();
                mMTPEffectVideoLayout2.getEffectManager().d();
                if (kVar.v()) {
                    uq5.b b17 = mMTPEffectVideoLayout2.getEffectManager().b();
                    b17.d(5.0f);
                    b17.e(1.0f);
                } else {
                    mMTPEffectVideoLayout2.getEffectManager().p(uq5.k.BlurEffect);
                }
                this.M = mMTPEffectVideoLayout2;
                J();
                if (k1Var.l(8192)) {
                    F();
                    return;
                }
                return;
            }
        }
        k();
    }

    public boolean x() {
        if ((this.f174189d.l(64) && iq.b.y()) || iq.b.F(this.f174197n, false)) {
            return true;
        }
        if (this.Y.f173836j) {
            return !this.Z;
        }
        return false;
    }

    public boolean y() {
        al5.a0 a0Var = this.B1;
        return this.f174189d.l(32) && !(a0Var != null ? a0Var.e() : false);
    }

    public final void z() {
        i();
    }
}
