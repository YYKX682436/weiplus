package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sw extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final boolean f114313p;

    /* renamed from: q, reason: collision with root package name */
    public final yz5.l f114314q;

    /* renamed from: r, reason: collision with root package name */
    public final ve2.a f114315r;

    /* renamed from: s, reason: collision with root package name */
    public r45.uy2 f114316s;

    /* renamed from: t, reason: collision with root package name */
    public int f114317t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(android.view.ViewGroup root, com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView finderLiveLogoGroupView, qo0.c statusMonitor, boolean z17, yz5.l choiceData) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(choiceData, "choiceData");
        this.f114313p = z17;
        this.f114314q = choiceData;
        this.f114317t = root.getVisibility();
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ve2.c cVar = new ve2.c(root, context, S0(), statusMonitor, this);
        this.f114315r = cVar;
        android.content.Context context2 = root.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        cVar.onAttach(new ve2.d(root, finderLiveLogoGroupView, (com.tencent.mm.ui.MMActivity) context2, cVar));
        ((mm2.w) P0(mm2.w.class)).f329503o.observe(this, new com.tencent.mm.plugin.finder.live.plugin.qw(this, root));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        byte[] byteArray;
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        if (com.tencent.mm.plugin.finder.live.plugin.rw.f114199a[status.ordinal()] != 1 || bundle == null || (byteArray = bundle.getByteArray("PARAM_FINDER_LIVE_RECEIVE_LOGO_RESP_KEY")) == null) {
            return;
        }
        try {
            r45.uy2 uy2Var = new r45.uy2();
            uy2Var.parseFrom(byteArray);
            this.f114316s = uy2Var;
            u1();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("FinderLiveLogoForViewPlugin", "#statusChange-parse err ".concat(jz5.a.b(e17)));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        com.tencent.mars.xlog.Log.i("FinderLiveLogoForViewPlugin", "#unMount");
        ve2.a aVar = this.f114315r;
        if (aVar != null) {
            ((ve2.c) aVar).c();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public void m0(boolean z17) {
        d1(z17);
        com.tencent.mars.xlog.Log.i("FinderLiveLogoForViewPlugin", "#onClearScreenEndNotify clear=" + z17);
        u1();
    }

    public final void onResume() {
        ve2.a aVar = this.f114315r;
        if (aVar != null) {
            ve2.c cVar = (ve2.c) aVar;
            com.tencent.mars.xlog.Log.i("FinderLiveLogoPresenter", "#reloadData");
            cVar.f(cVar.f436091f);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public void s(boolean z17) {
        e1(z17);
        com.tencent.mars.xlog.Log.i("FinderLiveLogoForViewPlugin", "#onClearScreenStartNotify clear=" + z17);
        u1();
    }

    public final void t1(int i17) {
        boolean x07 = x0();
        boolean z17 = this.f114313p;
        android.view.ViewGroup viewGroup = this.f365323d;
        if (!x07) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = java.lang.Math.max(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 120), i17) + i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
            if (z17) {
                layoutParams2.leftMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
            } else {
                layoutParams2.rightMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
            }
            viewGroup.setLayoutParams(layoutParams2);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 72);
        int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 104);
        if (!z17) {
            b17 = b18;
        }
        layoutParams4.topMargin = b17;
        float n17 = ((com.tencent.mm.ui.bk.n(1.0f) - (com.tencent.mm.ui.bk.o(1.0f) * (((mm2.c1) P0(mm2.c1.class)).f328879s2 / ((mm2.c1) P0(mm2.c1.class)).f328885t2))) / 2) + i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        int b19 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        if (z17) {
            layoutParams4.leftMargin = java.lang.Math.max((int) n17, b19);
        } else {
            layoutParams4.rightMargin = java.lang.Math.max((int) n17, b19);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r4 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1() {
        /*
            r5 = this;
            java.lang.String r0 = "FinderLiveLogoForViewPlugin"
            java.lang.String r1 = "#updateGiftInfo"
            com.tencent.mars.xlog.Log.i(r0, r1)
            r45.uy2 r0 = r5.f114316s
            ve2.a r1 = r5.f114315r
            r2 = 0
            if (r0 == 0) goto L54
            yz5.l r3 = r5.f114314q
            java.lang.Object r0 = r3.invoke(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L54
            java.lang.Object r0 = kz5.n0.Z(r0)
            r45.rd4 r0 = (r45.rd4) r0
            if (r0 == 0) goto L54
            r4 = 6
            boolean r0 = r0.getBoolean(r4)
            jz5.f0 r4 = jz5.f0.f302826a
            if (r0 == 0) goto L3c
            com.tencent.mm.plugin.finder.live.view.k0 r0 = r5.R0()
            boolean r0 = r0.isScreenClear()
            if (r0 != 0) goto L3c
            if (r1 == 0) goto L51
            r0 = r1
            ve2.c r0 = (ve2.c) r0
            r0.f(r2)
            goto L52
        L3c:
            if (r1 == 0) goto L51
            r45.uy2 r0 = r5.f114316s
            if (r0 == 0) goto L49
            java.lang.Object r0 = r3.invoke(r0)
            java.util.List r0 = (java.util.List) r0
            goto L4a
        L49:
            r0 = r2
        L4a:
            r3 = r1
            ve2.c r3 = (ve2.c) r3
            r3.f(r0)
            goto L52
        L51:
            r4 = r2
        L52:
            if (r4 != 0) goto L5b
        L54:
            if (r1 == 0) goto L5b
            ve2.c r1 = (ve2.c) r1
            r1.f(r2)
        L5b:
            java.lang.Class<mm2.w> r0 = mm2.w.class
            androidx.lifecycle.c1 r0 = r5.P0(r0)
            mm2.w r0 = (mm2.w) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r0 = r0.f329503o
            java.lang.Object r0 = r0.getValue()
            mm2.f r0 = (mm2.f) r0
            mm2.f r1 = mm2.f.f329016g
            r2 = 0
            if (r0 != r1) goto L72
            r0 = 1
            goto L73
        L72:
            r0 = r2
        L73:
            if (r0 == 0) goto L7d
            r5.f114317t = r2
            r0 = 8
            r5.K0(r0)
            goto L80
        L7d:
            r5.K0(r2)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.sw.u1():void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mars.xlog.Log.i("FinderLiveLogoForViewPlugin", "#mount");
    }
}
