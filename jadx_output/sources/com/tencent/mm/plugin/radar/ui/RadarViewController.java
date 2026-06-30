package com.tencent.mm.plugin.radar.ui;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003:;<B\u001b\u0012\u0006\u00105\u001a\u000204\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010+R$\u00103\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u0006="}, d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarViewController;", "Landroid/widget/RelativeLayout;", "Lps3/q;", "Lps3/c;", "Lcom/tencent/mm/plugin/radar/ui/RadarWaveView;", "d", "Ljz5/g;", "getWaveView", "()Lcom/tencent/mm/plugin/radar/ui/RadarWaveView;", "waveView", "Lcom/tencent/mm/plugin/radar/ui/RadarMemberView;", "e", "getMemberDetailView", "()Lcom/tencent/mm/plugin/radar/ui/RadarMemberView;", "memberDetailView", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;", "f", "getGrid", "()Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;", "grid", "Lcom/tencent/mm/plugin/radar/ui/RadarTipsView;", "g", "getRadarTips", "()Lcom/tencent/mm/plugin/radar/ui/RadarTipsView;", "radarTips", "Landroid/widget/TextView;", "h", "getNewRadarTip", "()Landroid/widget/TextView;", "newRadarTip", "Landroid/widget/ProgressBar;", "i", "getNewRadarTipLoading", "()Landroid/widget/ProgressBar;", "newRadarTipLoading", "Landroid/widget/Button;", "m", "getQuitBtn", "()Landroid/widget/Button;", "quitBtn", "Landroid/view/View;", "n", "getRadarBgMask", "()Landroid/view/View;", "radarBgMask", "Lps3/r;", "<set-?>", "r", "Lps3/r;", "getRadarStatus", "()Lps3/r;", "radarStatus", "Landroid/content/Context;", "mContext", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "qs3/n0", "qs3/p0", "qs3/q0", "plugin-radar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class RadarViewController extends android.widget.RelativeLayout implements ps3.q, ps3.c {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f155034w = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g waveView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g memberDetailView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g grid;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g radarTips;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g newRadarTip;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g newRadarTipLoading;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g quitBtn;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g radarBgMask;

    /* renamed from: o, reason: collision with root package name */
    public final ps3.w f155043o;

    /* renamed from: p, reason: collision with root package name */
    public final ps3.m f155044p;

    /* renamed from: q, reason: collision with root package name */
    public qs3.p0 f155045q;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public ps3.r radarStatus;

    /* renamed from: s, reason: collision with root package name */
    public boolean f155047s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f155048t;

    /* renamed from: u, reason: collision with root package name */
    public final int f155049u;

    /* renamed from: v, reason: collision with root package name */
    public final int f155050v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarViewController(android.content.Context mContext, android.util.AttributeSet attributeSet) {
        super(mContext, attributeSet);
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.waveView = jz5.h.b(new qs3.b1(this));
        this.memberDetailView = qs3.e1.a(this, com.tencent.mm.R.id.lh8);
        this.grid = qs3.e1.a(this, com.tencent.mm.R.id.lhm);
        this.radarTips = qs3.e1.a(this, com.tencent.mm.R.id.lho);
        this.newRadarTip = qs3.e1.a(this, com.tencent.mm.R.id.lhc);
        this.newRadarTipLoading = qs3.e1.a(this, com.tencent.mm.R.id.lhd);
        this.quitBtn = qs3.e1.a(this, com.tencent.mm.R.id.lhg);
        this.radarBgMask = qs3.e1.a(this, com.tencent.mm.R.id.f486511lh2);
        this.radarStatus = ps3.r.f358120d;
        this.f155048t = new qs3.x0(this);
        this.f155049u = 33554433;
        this.f155050v = 33554434;
        android.content.Context applicationContext = mContext.getApplicationContext();
        kotlin.jvm.internal.o.f(applicationContext, "getApplicationContext(...)");
        this.f155043o = new ps3.w(this, applicationContext);
        this.f155044p = new ps3.m(this, mContext);
    }

    public static final void a(com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController, java.lang.String str, r45.oi5 oi5Var, ps3.e eVar) {
        long c17 = radarViewController.f155044p.c(str);
        ps3.w wVar = radarViewController.f155043o;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("radarManager");
            throw null;
        }
        wVar.f358141q.put(java.lang.Long.valueOf(c17), new ps3.p(oi5Var, eVar));
        radarViewController.r(str, ps3.e.f358077e);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.tencent.mm.plugin.radar.ui.RadarViewController r10, java.lang.String r11, r45.oi5 r12, ps3.e r13) {
        /*
            ps3.m r0 = r10.f155044p
            r0.getClass()
            java.lang.String r1 = "username"
            kotlin.jvm.internal.o.g(r11, r1)
            java.lang.Class<vg3.x3> r1 = vg3.x3.class
            lm0.a r1 = gm0.j1.s(r1)
            vg3.x3 r1 = (vg3.x3) r1
            com.tencent.mm.plugin.messenger.foundation.h2 r1 = (com.tencent.mm.plugin.messenger.foundation.h2) r1
            com.tencent.mm.storage.k4 r1 = r1.Bi()
            r2 = 1
            com.tencent.mm.storage.z3 r1 = r1.n(r11, r2)
            java.lang.String r3 = "MicroMsg.RadarAddContact"
            if (r1 != 0) goto L27
            java.lang.String r0 = "verifyContact: contact is null"
            com.tencent.mars.xlog.Log.w(r3, r0)
            goto L67
        L27:
            java.lang.String r4 = r1.d1()
            r5 = 0
            if (r4 == 0) goto L37
            boolean r4 = r26.n0.N(r4)
            if (r4 == 0) goto L35
            goto L37
        L35:
            r4 = r5
            goto L38
        L37:
            r4 = r2
        L38:
            if (r4 == 0) goto L3c
            r1 = r11
            goto L45
        L3c:
            java.lang.String r1 = r1.d1()
            java.lang.String r4 = "getUsername(...)"
            kotlin.jvm.internal.o.f(r1, r4)
        L45:
            java.util.HashMap r4 = r0.f358105g
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L58
            boolean r6 = r26.n0.N(r4)
            if (r6 == 0) goto L56
            goto L58
        L56:
            r6 = r5
            goto L59
        L58:
            r6 = r2
        L59:
            if (r6 == 0) goto L6a
            java.lang.String r2 = "Verify Contact username(%s) error, verifyTicket is null"
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            com.tencent.mars.xlog.Log.e(r3, r2, r4)
            r0.c(r1)
        L67:
            r0 = -1
            goto Lb6
        L6a:
            com.tencent.mm.storage.e9 r3 = com.tencent.mm.storage.e9.f(r4)
            long r6 = java.lang.System.currentTimeMillis()
            ps3.b r8 = new ps3.b
            ps3.l r9 = new ps3.l
            r9.<init>(r4, r0, r6)
            r8.<init>(r0, r9)
            java.lang.String r0 = r3.f193878t
            java.lang.String r3 = "getVerifyTicket(...)"
            kotlin.jvm.internal.o.f(r0, r3)
            int r3 = r1.length()
            if (r3 <= 0) goto L8a
            goto L8b
        L8a:
            r2 = r5
        L8b:
            java.lang.String r3 = "username is null"
            iz5.a.g(r3, r2)
            com.tencent.mm.modelbase.r1 r2 = gm0.j1.d()
            r3 = 30
            r2.a(r3, r8)
            com.tencent.mm.modelbase.r1 r2 = gm0.j1.d()
            java.lang.Class<ns.k> r3 = ns.k.class
            i95.m r3 = i95.n0.c(r3)
            ns.k r3 = (ns.k) r3
            ms.a r3 = (ms.a) r3
            r3.getClass()
            com.tencent.mm.pluginsdk.model.m3 r3 = new com.tencent.mm.pluginsdk.model.m3
            r4 = 3
            r5 = 48
            r3.<init>(r4, r1, r0, r5)
            r2.g(r3)
            r0 = r6
        Lb6:
            ps3.w r2 = r10.f155043o
            if (r2 == 0) goto Lce
            java.util.Map r2 = r2.f358141q
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            ps3.p r1 = new ps3.p
            r1.<init>(r12, r13)
            r2.put(r0, r1)
            ps3.e r12 = ps3.e.f358077e
            r10.r(r11, r12)
            return
        Lce:
            java.lang.String r10 = "radarManager"
            kotlin.jvm.internal.o.o(r10)
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.radar.ui.RadarViewController.d(com.tencent.mm.plugin.radar.ui.RadarViewController, java.lang.String, r45.oi5, ps3.e):void");
    }

    private final com.tencent.mm.plugin.radar.ui.RadarSpecialGridView getGrid() {
        return (com.tencent.mm.plugin.radar.ui.RadarSpecialGridView) this.grid.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.radar.ui.RadarMemberView getMemberDetailView() {
        return (com.tencent.mm.plugin.radar.ui.RadarMemberView) this.memberDetailView.getValue();
    }

    private final android.widget.TextView getNewRadarTip() {
        return (android.widget.TextView) this.newRadarTip.getValue();
    }

    private final android.widget.ProgressBar getNewRadarTipLoading() {
        return (android.widget.ProgressBar) this.newRadarTipLoading.getValue();
    }

    private final android.widget.Button getQuitBtn() {
        return (android.widget.Button) this.quitBtn.getValue();
    }

    private final android.view.View getRadarBgMask() {
        return (android.view.View) this.radarBgMask.getValue();
    }

    private final com.tencent.mm.plugin.radar.ui.RadarTipsView getRadarTips() {
        return (com.tencent.mm.plugin.radar.ui.RadarTipsView) this.radarTips.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.radar.ui.RadarWaveView getWaveView() {
        java.lang.Object value = ((jz5.n) this.waveView).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.plugin.radar.ui.RadarWaveView) value;
    }

    public final void e() {
        ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
        getContext();
        kVar.getClass();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.lh7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        layoutParams2.width = displayMetrics.widthPixels;
        relativeLayout.setLayoutParams(layoutParams2);
        getRadarTips().c();
        com.tencent.mm.plugin.radar.ui.RadarTipsView radarTips = getRadarTips();
        qs3.l0 l0Var = radarTips.f155029q;
        l0Var.sendEmptyMessageDelayed(radarTips.f155026n, 1000);
        l0Var.sendEmptyMessageDelayed(radarTips.f155025m, 9000);
        getRadarTips().setPressingDown(true);
        getQuitBtn().setOnClickListener(this.f155048t);
        android.view.ViewGroup.LayoutParams layoutParams3 = getQuitBtn().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
        int i17 = layoutParams4.topMargin;
        if (com.tencent.mm.ui.bk.u(getContext(), false)) {
            i17 += com.tencent.mm.ui.bk.p(getContext());
        }
        layoutParams4.setMargins(layoutParams4.leftMargin, i17, layoutParams4.rightMargin, layoutParams4.bottomMargin);
        getQuitBtn().setLayoutParams(layoutParams4);
        com.tencent.mm.plugin.radar.ui.RadarWaveView waveView = getWaveView();
        waveView.f155051d = waveView.findViewById(com.tencent.mm.R.id.lhk);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(waveView.getContext(), com.tencent.mm.R.anim.f477866dp);
        waveView.f155052e = loadAnimation;
        kotlin.jvm.internal.o.d(loadAnimation);
        loadAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        qs3.c cVar = qs3.c.f366337a;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ml8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        cVar.a((android.widget.ImageView) findViewById2, r17);
        getMemberDetailView().setListener(new qs3.w0(this));
        com.tencent.mm.plugin.radar.ui.RadarSpecialGridView grid = getGrid();
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.f155045q = new qs3.p0(this, grid, context2);
        getGrid().setOnItemClickListener(new qs3.a1(this));
    }

    public final boolean f(java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.d(linkedList);
        java.util.Iterator it = linkedList.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            r45.oi5 oi5Var = (r45.oi5) it.next();
            ps3.w wVar = this.f155043o;
            if (wVar == null) {
                kotlin.jvm.internal.o.o("radarManager");
                throw null;
            }
            kotlin.jvm.internal.o.d(oi5Var);
            ps3.e a17 = wVar.a(oi5Var, false);
            if (a17 == null) {
                java.lang.String str = oi5Var.f382283d;
                if (str == null && (str = oi5Var.f382287h) == null) {
                    str = "";
                }
                ps3.e d17 = this.f155044p.d(str);
                if (wVar == null) {
                    kotlin.jvm.internal.o.o("radarManager");
                    throw null;
                }
                wVar.c(str, d17);
                a17 = d17;
            }
            if (a17 == ps3.e.f358078f) {
                z17 = true;
            }
        }
        return z17;
    }

    public void g(boolean z17, boolean z18, java.lang.String str, java.lang.String str2, long j17) {
        java.lang.String str3;
        ps3.w wVar = this.f155043o;
        if (z17) {
            r(str2, ps3.e.f358078f);
        } else if (z18) {
            r(str2, ps3.e.f358077e);
        } else {
            com.tencent.mm.plugin.radar.ui.RadarTipsView radarTips = getRadarTips();
            java.lang.String str4 = "";
            if (str == null) {
                str = "";
            }
            radarTips.d(str);
            if (wVar == null) {
                kotlin.jvm.internal.o.o("radarManager");
                throw null;
            }
            ps3.p pVar = (ps3.p) ((java.util.LinkedHashMap) wVar.f358141q).get(java.lang.Long.valueOf(j17));
            if (pVar != null) {
                r45.oi5 member = pVar.f358118a;
                kotlin.jvm.internal.o.g(member, "member");
                java.lang.String str5 = member.f382283d;
                if (str5 == null && (str5 = member.f382287h) == null) {
                    str5 = "";
                }
                ps3.e eVar = pVar.f358119b;
                r(str5, eVar);
                if (member != null && ((str3 = member.f382287h) != null || (str3 = member.f382283d) != null)) {
                    str4 = str3;
                }
                r(str4, eVar);
            }
        }
        if (wVar != null) {
            wVar.f358141q.remove(java.lang.Long.valueOf(j17));
        } else {
            kotlin.jvm.internal.o.o("radarManager");
            throw null;
        }
    }

    public final ps3.r getRadarStatus() {
        return this.radarStatus;
    }

    public final void h() {
        ps3.m mVar = this.f155044p;
        mVar.getClass();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(mVar);
        mVar.f358106h.dead();
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f37061a.h("addcontact", mVar.f358107i, true);
        ps3.w wVar = this.f155043o;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("radarManager");
            throw null;
        }
        gm0.j1.d().q(425, wVar);
        gm0.j1.d().q(602, wVar);
        wVar.g();
        i11.e eVar = wVar.f358132e;
        if (eVar != null) {
            ((i11.h) eVar).m(wVar.f358145u);
        }
        getWaveView().getClass();
    }

    public void i(boolean z17, com.tencent.mm.pluginsdk.model.lbs.Location location) {
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.radar.ui.RadarTipsView radarTips = getRadarTips();
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.f492755hr2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        radarTips.d(string);
        if (this.f155047s || com.tencent.mm.sdk.platformtools.n2.a()) {
            return;
        }
        this.f155047s = true;
        db5.e1.C(getContext(), getContext().getString(com.tencent.mm.R.string.fs_), getContext().getString(com.tencent.mm.R.string.f490573yv), getContext().getString(com.tencent.mm.R.string.g6z), getContext().getString(com.tencent.mm.R.string.f490347sg), false, new qs3.y0(this), null);
    }

    public void j(int i17, int i18, java.util.LinkedList linkedList, int i19) {
        if (i17 == 0 && i18 == 0) {
            o(linkedList);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Radar.RadarViewController", "radar member return error : %s, type : %s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        if (2 == i17) {
            com.tencent.mm.plugin.radar.ui.RadarTipsView radarTips = getRadarTips();
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.f490500wu);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            radarTips.d(string);
            return;
        }
        com.tencent.mm.plugin.radar.ui.RadarTipsView radarTips2 = getRadarTips();
        java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.f492756hr3);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        radarTips2.d(string2);
    }

    public void k(int i17, int i18, java.util.LinkedList linkedList, int i19) {
        java.lang.String str;
        java.util.LinkedList linkedList2 = linkedList;
        if (i17 != 0 || i18 != 0 || linkedList2 == null) {
            s(ps3.r.f358120d);
            com.tencent.mm.plugin.radar.ui.RadarTipsView radarTips = getRadarTips();
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.f492756hr3);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            radarTips.d(string);
            return;
        }
        s(ps3.r.f358122f);
        qs3.p0 p0Var = this.f155045q;
        if (p0Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController = p0Var.f366381k;
        ps3.w wVar = radarViewController.f155043o;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("radarManager");
            throw null;
        }
        ((java.util.LinkedHashMap) wVar.f358142r).clear();
        ps3.w wVar2 = radarViewController.f155043o;
        if (wVar2 == null) {
            kotlin.jvm.internal.o.o("radarManager");
            throw null;
        }
        ((java.util.LinkedHashMap) wVar2.f358138n).clear();
        p0Var.f366376f.clear();
        java.util.HashMap hashMap = p0Var.f366377g;
        hashMap.clear();
        if (linkedList.size() > 0) {
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            int size = linkedList.size();
            int i27 = 0;
            while (true) {
                java.lang.String str2 = "";
                if (i27 < size) {
                    java.lang.Object obj = linkedList2.get(i27);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    r45.mi5 mi5Var = (r45.mi5) obj;
                    r45.ni5 ni5Var = new r45.ni5();
                    ni5Var.f381432d = mi5Var.f380548d;
                    linkedList3.add(ni5Var);
                    if (wVar2 == null) {
                        kotlin.jvm.internal.o.o("radarManager");
                        throw null;
                    }
                    java.util.Map map = wVar2.f358138n;
                    java.lang.String EncodeUserName = mi5Var.f380550f;
                    kotlin.jvm.internal.o.f(EncodeUserName, "EncodeUserName");
                    java.lang.String UserName = mi5Var.f380548d;
                    kotlin.jvm.internal.o.f(UserName, "UserName");
                    map.put(EncodeUserName, UserName);
                    java.lang.String str3 = mi5Var.f380550f;
                    if (str3 != null || (str3 = mi5Var.f380548d) != null) {
                        str2 = str3;
                    }
                    hashMap.put(str2, 0);
                    i27++;
                    linkedList2 = linkedList;
                } else {
                    for (r45.oi5 oi5Var : p0Var.f366375e) {
                        if (wVar2 == null) {
                            kotlin.jvm.internal.o.o("radarManager");
                            throw null;
                        }
                        java.util.Map map2 = wVar2.f358138n;
                        if (oi5Var == null || ((str = oi5Var.f382287h) == null && (str = oi5Var.f382283d) == null)) {
                            str = "";
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) ((java.util.LinkedHashMap) map2).get(str))) {
                            qs3.p0 p0Var2 = radarViewController.f155045q;
                            if (p0Var2 == null) {
                                kotlin.jvm.internal.o.o("adapter");
                                throw null;
                            }
                            p0Var2.b(oi5Var);
                            if (wVar2 == null) {
                                kotlin.jvm.internal.o.o("radarManager");
                                throw null;
                            }
                            wVar2.e(oi5Var);
                        }
                    }
                }
            }
        }
        if (wVar2 == null) {
            kotlin.jvm.internal.o.o("radarManager");
            throw null;
        }
        qs3.p0 p0Var3 = this.f155045q;
        if (p0Var3 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        p0Var3.a();
    }

    public void l(com.tencent.mm.storage.z3 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        if (getMemberDetailView().getVisibility() == 0) {
            com.tencent.mm.plugin.radar.ui.RadarMemberView memberDetailView = getMemberDetailView();
            java.lang.String J0 = contact.J0();
            kotlin.jvm.internal.o.f(J0, "getEncryptUsername(...)");
            memberDetailView.g(J0, ps3.e.f358078f);
        }
        java.lang.String d17 = contact.d1();
        ps3.e eVar = ps3.e.f358078f;
        r(d17, eVar);
        r(contact.J0(), eVar);
    }

    public void m(com.tencent.mm.storage.z3 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        ps3.w wVar = this.f155043o;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("radarManager");
            throw null;
        }
        java.lang.String d17 = contact.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        if (wVar.b(d17, false) == null) {
            java.lang.String J0 = contact.J0();
            kotlin.jvm.internal.o.f(J0, "getEncryptUsername(...)");
            if (wVar.b(J0, false) == null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.lang.String d18 = contact.d1();
                kotlin.jvm.internal.o.f(d18, "getUsername(...)");
                java.lang.String J02 = contact.J0();
                kotlin.jvm.internal.o.f(J02, "getEncryptUsername(...)");
                java.lang.String P0 = contact.P0();
                kotlin.jvm.internal.o.f(P0, "getNickname(...)");
                r45.oi5 oi5Var = new r45.oi5();
                oi5Var.f382284e = 100;
                oi5Var.f382283d = d18;
                oi5Var.f382285f = P0;
                oi5Var.f382286g = "";
                oi5Var.f382287h = J02;
                linkedList.add(oi5Var);
                o(linkedList);
            }
        }
        if (getMemberDetailView().getVisibility() == 0) {
            com.tencent.mm.plugin.radar.ui.RadarMemberView memberDetailView = getMemberDetailView();
            java.lang.String J03 = contact.J0();
            kotlin.jvm.internal.o.f(J03, "getEncryptUsername(...)");
            memberDetailView.g(J03, ps3.e.f358079g);
        }
        java.lang.String d19 = contact.d1();
        ps3.e eVar = ps3.e.f358079g;
        r(d19, eVar);
        r(contact.J0(), eVar);
    }

    public void n(boolean z17, java.lang.String str, java.lang.String str2, long j17) {
        ps3.w wVar = this.f155043o;
        if (z17) {
            r(str2, ps3.e.f358078f);
        } else {
            com.tencent.mm.plugin.radar.ui.RadarTipsView radarTips = getRadarTips();
            if (str == null) {
                str = "";
            }
            radarTips.d(str);
            if (wVar == null) {
                kotlin.jvm.internal.o.o("radarManager");
                throw null;
            }
            ps3.p pVar = (ps3.p) ((java.util.LinkedHashMap) wVar.f358141q).get(java.lang.Long.valueOf(j17));
            if (pVar != null) {
                r45.oi5 member = pVar.f358118a;
                kotlin.jvm.internal.o.g(member, "member");
                java.lang.String str3 = member.f382283d;
                r((str3 == null && (str3 = member.f382287h) == null) ? "" : str3, pVar.f358119b);
            }
        }
        if (wVar != null) {
            wVar.f358141q.remove(java.lang.Long.valueOf(j17));
        } else {
            kotlin.jvm.internal.o.o("radarManager");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d7, code lost:
    
        if ((r11 == null || r26.n0.N(r11)) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.util.LinkedList r14) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.radar.ui.RadarViewController.o(java.util.LinkedList):void");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 == 4) {
            if (getMemberDetailView().getVisibility() == 0) {
                getMemberDetailView().c();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        getWaveView().a();
    }

    public final void q() {
        getWaveView().b();
    }

    public final void r(java.lang.String str, ps3.e eVar) {
        ps3.w wVar = this.f155043o;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("radarManager");
            throw null;
        }
        kotlin.jvm.internal.o.d(str);
        ps3.e b17 = wVar.b(str, false);
        if (b17 == null || b17 == eVar) {
            return;
        }
        wVar.c(str, eVar);
        qs3.p0 p0Var = this.f155045q;
        if (p0Var != null) {
            p0Var.a();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    public final void s(ps3.r rVar) {
        this.radarStatus = rVar;
        int ordinal = rVar.ordinal();
        ps3.w wVar = this.f155043o;
        if (ordinal == 0) {
            android.view.View radarBgMask = getRadarBgMask();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(radarBgMask, arrayList.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            radarBgMask.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(radarBgMask, "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getQuitBtn().setText(com.tencent.mm.R.string.hqx);
            getNewRadarTipLoading().setVisibility(8);
            getNewRadarTip().setText("");
            getWaveView().a();
            getWaveView().setVisibility(0);
            if (wVar != null) {
                wVar.f();
                return;
            } else {
                kotlin.jvm.internal.o.o("radarManager");
                throw null;
            }
        }
        if (ordinal == 1) {
            android.view.View radarBgMask2 = getRadarBgMask();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(radarBgMask2, arrayList2.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            radarBgMask2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(radarBgMask2, "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getNewRadarTipLoading().setVisibility(8);
            getNewRadarTip().setText("");
            return;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                android.view.View radarBgMask3 = getRadarBgMask();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(radarBgMask3, arrayList3.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                radarBgMask3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(radarBgMask3, "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (wVar == null) {
                    kotlin.jvm.internal.o.o("radarManager");
                    throw null;
                }
                wVar.h();
                getNewRadarTipLoading().setVisibility(8);
                getNewRadarTip().setText(com.tencent.mm.R.string.hqp);
                getGrid().setVisibility(0);
                return;
            }
            if (ordinal != 4) {
                return;
            }
            android.view.View radarBgMask4 = getRadarBgMask();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(radarBgMask4, arrayList4.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            radarBgMask4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(radarBgMask4, "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (wVar == null) {
                kotlin.jvm.internal.o.o("radarManager");
                throw null;
            }
            wVar.h();
            getNewRadarTipLoading().setVisibility(0);
            getNewRadarTip().setText(com.tencent.mm.R.string.hqq);
            return;
        }
        if (getRadarBgMask().getVisibility() != 0) {
            getRadarBgMask().setAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477859dh));
            android.view.View radarBgMask5 = getRadarBgMask();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(radarBgMask5, arrayList5.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController", "radarBackgroundFadeIn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            radarBgMask5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(radarBgMask5, "com/tencent/mm/plugin/radar/ui/RadarViewController", "radarBackgroundFadeIn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        getQuitBtn().setText(com.tencent.mm.R.string.f490347sg);
        if (wVar == null) {
            kotlin.jvm.internal.o.o("radarManager");
            throw null;
        }
        wVar.h();
        getNewRadarTipLoading().setVisibility(0);
        getNewRadarTip().setText(com.tencent.mm.R.string.hqz);
        getWaveView().b();
        getWaveView().setVisibility(4);
        getGrid().setVisibility(4);
        qs3.p0 p0Var = this.f155045q;
        if (p0Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        p0Var.f366377g.clear();
        java.util.HashMap hashMap = p0Var.f366380j;
        hashMap.clear();
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) hashMap.get((java.lang.String) it.next());
            if (view != null) {
                qs3.n0 n0Var = p0Var.f366378h;
                n0Var.getClass();
                java.lang.Object tag = view.getTag(n0Var.f366366d.f155049u);
                java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
                int intValue = num != null ? num.intValue() : -1;
                if (intValue > 0) {
                    n0Var.f366365c.removeMessages(intValue);
                }
                view.clearAnimation();
            }
        }
        p0Var.a();
    }
}
