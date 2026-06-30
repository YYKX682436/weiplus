package fi2;

/* loaded from: classes10.dex */
public final class e0 implements ah2.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f262816a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.y20 f262817b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.v0 f262818c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.x0 f262819d;

    /* renamed from: e, reason: collision with root package name */
    public final int f262820e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f262821f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f262822g;

    /* renamed from: h, reason: collision with root package name */
    public mh2.k0 f262823h;

    /* renamed from: i, reason: collision with root package name */
    public mh2.k f262824i;

    /* renamed from: j, reason: collision with root package name */
    public mh2.u1 f262825j;

    /* renamed from: k, reason: collision with root package name */
    public kotlinx.coroutines.r2 f262826k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f262827l;

    /* renamed from: m, reason: collision with root package name */
    public final ah2.a f262828m;

    public e0(android.content.Context context, com.tencent.mm.plugin.finder.feed.y20 y20Var, lj2.v0 pluginAbility, lj2.x0 service, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        this.f262816a = context;
        this.f262817b = y20Var;
        this.f262818c = pluginAbility;
        this.f262819d = service;
        this.f262820e = i17;
        this.f262821f = "KTVFeedContentServiceCore_" + hashCode();
        this.f262822g = jz5.h.b(new fi2.c0(this));
        this.f262827l = jz5.h.b(new fi2.d0(this));
        this.f262828m = new fi2.b0(this);
    }

    @Override // ah2.f
    public kotlinx.coroutines.y0 a() {
        kotlinx.coroutines.y0 a17 = this.f262819d.a();
        return a17 == null ? kotlinx.coroutines.z0.b() : a17;
    }

    @Override // ah2.f
    public void b(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f262818c.a0().b(callback);
    }

    @Override // ah2.f
    public kotlinx.coroutines.flow.j c() {
        com.tencent.mm.plugin.finder.feed.ag agVar;
        com.tencent.mm.plugin.finder.feed.y20 y20Var = this.f262817b;
        if (y20Var == null || (agVar = ((com.tencent.mm.plugin.finder.feed.df) y20Var).f106558a.f107203q) == null) {
            return null;
        }
        return agVar.f106290h;
    }

    @Override // ah2.f
    public kotlinx.coroutines.flow.j e() {
        com.tencent.mm.plugin.finder.feed.ag agVar;
        com.tencent.mm.plugin.finder.feed.y20 y20Var = this.f262817b;
        if (y20Var == null || (agVar = ((com.tencent.mm.plugin.finder.feed.df) y20Var).f106558a.f107203q) == null) {
            return null;
        }
        return agVar.f106288f;
    }

    @Override // ah2.f
    public mh2.n0 f() {
        return (mh2.n0) ((jz5.n) this.f262822g).getValue();
    }

    @Override // ah2.f
    public void g() {
    }

    @Override // ah2.f
    public boolean h() {
        return true;
    }

    @Override // ah2.f
    public void i() {
    }

    @Override // ah2.f
    public void j(fn2.u1 sourceScene, java.lang.String str) {
        kotlin.jvm.internal.o.g(sourceScene, "sourceScene");
    }

    @Override // ah2.f
    public boolean k() {
        return false;
    }

    @Override // ah2.f
    public kotlinx.coroutines.flow.j l() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (((kotlinx.coroutines.a) r0).a() == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r9 = this;
            mh2.k r0 = r9.f262824i
            if (r0 == 0) goto L7
            r0.c()
        L7:
            mh2.k0 r0 = r9.f262823h
            if (r0 == 0) goto Le
            r0.g()
        Le:
            int r0 = r9.f262820e
            r1 = 3
            if (r0 == r1) goto L14
            goto L5d
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "collectKTVOutPreviewData isActive: "
            r0.<init>(r1)
            kotlinx.coroutines.r2 r1 = r9.f262826k
            r2 = 0
            if (r1 == 0) goto L2b
            kotlinx.coroutines.a r1 = (kotlinx.coroutines.a) r1
            boolean r1 = r1.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L2c
        L2b:
            r1 = r2
        L2c:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r9.f262821f
            com.tencent.mars.xlog.Log.i(r1, r0)
            kotlinx.coroutines.r2 r0 = r9.f262826k
            if (r0 == 0) goto L46
            kotlinx.coroutines.a r0 = (kotlinx.coroutines.a) r0
            boolean r0 = r0.a()
            r1 = 1
            if (r0 != r1) goto L46
            goto L47
        L46:
            r1 = 0
        L47:
            if (r1 == 0) goto L4a
            goto L5d
        L4a:
            kotlinx.coroutines.y0 r3 = r9.a()
            r4 = 0
            r5 = 0
            fi2.y r6 = new fi2.y
            r6.<init>(r9, r2)
            r7 = 3
            r8 = 0
            kotlinx.coroutines.r2 r0 = kotlinx.coroutines.l.d(r3, r4, r5, r6, r7, r8)
            r9.f262826k = r0
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fi2.e0.m():void");
    }

    public final void n(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView voiceRoomLayout) {
        android.view.ViewParent viewParent;
        android.view.View view;
        kotlin.jvm.internal.o.g(voiceRoomLayout, "voiceRoomLayout");
        mh2.k kVar = this.f262824i;
        android.view.ViewParent parent = kVar != null ? kVar.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f262824i);
        }
        mh2.k0 k0Var = this.f262823h;
        android.view.ViewParent parent2 = k0Var != null ? k0Var.getParent() : null;
        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f262823h);
        }
        mh2.u1 u1Var = this.f262825j;
        if (u1Var != null) {
            android.view.View view2 = u1Var.f326292b;
            kotlin.jvm.internal.o.d(view2);
            viewParent = view2.getParent();
        } else {
            viewParent = null;
        }
        android.view.ViewGroup viewGroup3 = viewParent instanceof android.view.ViewGroup ? (android.view.ViewGroup) viewParent : null;
        if (viewGroup3 != null) {
            mh2.u1 u1Var2 = this.f262825j;
            if (u1Var2 != null) {
                view = u1Var2.f326292b;
                kotlin.jvm.internal.o.d(view);
            } else {
                view = null;
            }
            viewGroup3.removeView(view);
        }
        jz5.g gVar = this.f262827l;
        android.view.ViewParent parent3 = ((fg2.n0) ((jz5.n) gVar).getValue()).f262160a.getParent();
        android.view.ViewGroup viewGroup4 = parent3 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent3 : null;
        if (viewGroup4 != null) {
            viewGroup4.removeView(((fg2.n0) ((jz5.n) gVar).getValue()).f262160a);
        }
        lj2.v0 v0Var = this.f262818c;
        int i17 = this.f262820e;
        if (i17 != 3) {
            mh2.k kVar2 = this.f262824i;
            android.content.Context context = this.f262816a;
            if (kVar2 == null) {
                this.f262824i = new mh2.k(context, this, this.f262828m);
            }
            voiceRoomLayout.getCoverBackgroundLayout().addView(this.f262824i, new android.view.ViewGroup.LayoutParams(-1, -1));
            if (this.f262823h == null) {
                this.f262823h = new mh2.k0(context, this, v0Var, i17 == 4);
            }
            voiceRoomLayout.getSingContentLayout().addView(this.f262823h, new android.view.ViewGroup.LayoutParams(-1, -1));
        } else if (this.f262825j == null) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            this.f262825j = new mh2.u1(context2, new fi2.a0(this), false);
        }
        voiceRoomLayout.getSongListLayout().addView(((fg2.n0) ((jz5.n) gVar).getValue()).f262160a, new android.view.ViewGroup.LayoutParams(-2, -2));
        if (v0Var.f() == lj2.w0.f318959e) {
            voiceRoomLayout.getContentScrollWrapperLayout().setVisibility(8);
        }
    }

    public final void o() {
        ((mh2.n0) ((jz5.n) this.f262822g).getValue()).removeAllViews();
        mh2.k0 k0Var = this.f262823h;
        if (k0Var != null) {
            com.tencent.mars.xlog.Log.i(k0Var.f326386g, "reset");
            kotlinx.coroutines.r2 r2Var = k0Var.f326393q;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.r2 r2Var2 = k0Var.f326394r;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            kotlinx.coroutines.r2 r2Var3 = k0Var.f326395s;
            if (r2Var3 != null) {
                kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
            }
            mh2.a aVar = k0Var.f326392p;
            if (aVar != null) {
                android.view.View view = aVar.f326292b;
                kotlin.jvm.internal.o.d(view);
                k0Var.removeView(view);
            }
            k0Var.f326392p = null;
        }
        com.tencent.mars.xlog.Log.i(this.f262821f, "cancelKTVOutPreviewDataCollect job:" + this.f262826k);
        kotlinx.coroutines.r2 r2Var4 = this.f262826k;
        if (r2Var4 != null) {
            kotlinx.coroutines.p2.a(r2Var4, null, 1, null);
        }
    }
}
