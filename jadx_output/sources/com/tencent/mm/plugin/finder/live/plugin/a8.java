package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class a8 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f111820p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.ViewGroup f111821q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.ViewGroup f111822r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.ViewGroup f111823s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f111824t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f111825u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f111826v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f111827w;

    /* renamed from: x, reason: collision with root package name */
    public int f111828x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f111820p = "Finder.FinderLiveAnchorLiveStatePlugin";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.enp);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f111821q = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.evf);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f111822r = (android.view.ViewGroup) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.qrq);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f111823s = (android.view.ViewGroup) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.evd);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById4;
        this.f111824t = mMPAGView;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.fag);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f111825u = findViewById5;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.nhb);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f111826v = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.nha);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f111827w = (android.widget.TextView) findViewById7;
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.f463325v));
        android.content.res.AssetManager assets = root.getContext().getAssets();
        kotlin.jvm.internal.o.f(assets, "getAssets(...)");
        mMPAGView.k(assets, "finder_live_link_mic_wave.pag");
        mMPAGView.setRepeatCount(-1);
        zl2.r4.b(zl2.r4.f473950a, root, this, false, false, 12, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
    
        if (((mm2.o4) P0(mm2.o4.class)).Z6().isEmpty() == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(java.util.LinkedHashMap r6) {
        /*
            r5 = this;
            java.lang.String r0 = "micUserMap"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.Class<mm2.o4> r0 = mm2.o4.class
            androidx.lifecycle.c1 r1 = r5.P0(r0)
            mm2.o4 r1 = (mm2.o4) r1
            km2.q r1 = r1.l7()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onMicUserChanged: curLinkMicUser:"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ", micUserMap:"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = r5.f111820p
            com.tencent.mars.xlog.Log.i(r2, r1)
            r5.x1()
            java.lang.Class<mm2.y2> r1 = mm2.y2.class
            androidx.lifecycle.c1 r1 = r5.P0(r1)
            mm2.y2 r1 = (mm2.y2) r1
            pm2.a r1 = r1.f329560m
            pm2.a r2 = pm2.a.f356853f
            r3 = 0
            android.view.ViewGroup r4 = r5.f111822r
            if (r1 != r2) goto L5b
            int r6 = r6.size()
            r1 = 1
            if (r6 != r1) goto L48
            goto L49
        L48:
            r1 = 0
        L49:
            if (r1 != 0) goto L61
            androidx.lifecycle.c1 r6 = r5.P0(r0)
            mm2.o4 r6 = (mm2.o4) r6
            java.util.List r6 = r6.Z6()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L61
        L5b:
            boolean r6 = r5.w1()
            if (r6 == 0) goto L8a
        L61:
            if (r4 == 0) goto Ld6
            android.view.ViewParent r6 = r4.getParent()
            android.view.ViewGroup r0 = r5.f111821q
            boolean r6 = kotlin.jvm.internal.o.b(r6, r0)
            if (r6 != 0) goto Ld6
            android.view.ViewParent r6 = r4.getParent()
            boolean r1 = r6 instanceof android.view.ViewGroup
            if (r1 == 0) goto L7a
            r3 = r6
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L7a:
            if (r3 == 0) goto L7f
            r3.removeView(r4)
        L7f:
            if (r0 == 0) goto L84
            r0.removeAllViews()
        L84:
            if (r0 == 0) goto Ld6
            r0.addView(r4)
            goto Ld6
        L8a:
            java.lang.Class<zi2.w> r6 = zi2.w.class
            com.tencent.mm.plugin.finder.live.plugin.l r6 = r5.X0(r6)
            zi2.w r6 = (zi2.w) r6
            if (r6 == 0) goto Ld6
            android.view.ViewGroup r6 = r6.v1()
            if (r6 == 0) goto Ld6
            if (r4 == 0) goto Ld6
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = kotlin.jvm.internal.o.b(r0, r6)
            if (r0 != 0) goto Ld6
            boolean r0 = r6 instanceof android.widget.FrameLayout
            if (r0 == 0) goto Ld6
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto Lb5
            r3 = r0
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        Lb5:
            if (r3 == 0) goto Lba
            r3.removeView(r4)
        Lba:
            r6.removeAllViews()
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            android.view.ViewGroup r1 = r5.f365323d
            android.content.Context r1 = r1.getContext()
            r2 = 20
            int r1 = i65.a.b(r1, r2)
            r2 = -2
            r0.<init>(r2, r1)
            r1 = 16
            r0.gravity = r1
            r6.addView(r4, r0)
        Ld6:
            r5.t1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.a8.C0(java.util.LinkedHashMap):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        int i17;
        int i18;
        int i19;
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            if (zl2.r4.f473950a.x1()) {
                if (((mm2.c1) P0(mm2.c1.class)).O4) {
                    int i27 = this.f111828x;
                    java.util.regex.Pattern pattern = pm0.v.f356802a;
                    i17 = i27 | 4;
                } else {
                    int i28 = this.f111828x;
                    java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                    i17 = i28 & (-5);
                }
                this.f111828x = i17;
                x1();
                return;
            }
            return;
        }
        if (ordinal == 27) {
            K0(8);
            return;
        }
        if (ordinal == 191) {
            if (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false) {
                int i29 = this.f111828x;
                java.util.regex.Pattern pattern3 = pm0.v.f356802a;
                i18 = i29 | 1;
            } else {
                int i37 = this.f111828x;
                java.util.regex.Pattern pattern4 = pm0.v.f356802a;
                i18 = i37 & (-2);
            }
            this.f111828x = i18;
            x1();
            return;
        }
        if (ordinal == 198 && zl2.r4.f473950a.x1()) {
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_MUTE_MIC", false) : false;
            ((mm2.c1) P0(mm2.c1.class)).n9(z17);
            if (z17) {
                int i38 = this.f111828x;
                java.util.regex.Pattern pattern5 = pm0.v.f356802a;
                i19 = i38 | 4;
            } else {
                int i39 = this.f111828x;
                java.util.regex.Pattern pattern6 = pm0.v.f356802a;
                i19 = i39 & (-5);
            }
            this.f111828x = i19;
            x1();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        android.view.ViewGroup v17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkIsNeedShowAudioModeGroup audioModeGroup: ");
        android.view.ViewGroup viewGroup = this.f111823s;
        sb6.append(viewGroup.getVisibility());
        sb6.append(" audioModeMuteGroup: ");
        android.view.View view = this.f111825u;
        sb6.append(view.getVisibility());
        sb6.append(" audioModeWaveIcon: ");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f111824t;
        sb6.append(mMPAGView.getVisibility());
        sb6.append(" anchorNameText: ");
        android.widget.TextView textView = this.f111826v;
        sb6.append(textView.getVisibility());
        sb6.append(" anchorMicHeartText: ");
        android.widget.TextView textView2 = this.f111827w;
        sb6.append(textView2.getVisibility());
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i(this.f111820p, sb6.toString());
        int visibility = viewGroup.getVisibility();
        android.view.ViewGroup viewGroup2 = this.f111821q;
        if (visibility == 0 || view.getVisibility() == 0 || mMPAGView.getVisibility() == 0 || textView.getVisibility() == 0 || textView2.getVisibility() == 0) {
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            zi2.w wVar = (zi2.w) X0(zi2.w.class);
            v17 = wVar != null ? wVar.v1() : null;
            if (v17 == null) {
                return;
            }
            v17.setVisibility(0);
            return;
        }
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        zi2.w wVar2 = (zi2.w) X0(zi2.w.class);
        v17 = wVar2 != null ? wVar2.v1() : null;
        if (v17 == null) {
            return;
        }
        v17.setVisibility(8);
    }

    public final lj2.t0 u1() {
        zi2.w wVar = (zi2.w) X0(zi2.w.class);
        if (wVar != null) {
            return wVar.w1();
        }
        return null;
    }

    public final boolean v1(km2.q qVar) {
        lj2.t0 u17 = u1();
        if (!kotlin.jvm.internal.o.b(u17 != null ? ((zi2.y) u17).p() : null, qVar.f309170a)) {
            return false;
        }
        lj2.t0 u18 = u1();
        return u18 != null && ((zi2.y) u18).H();
    }

    public final boolean w1() {
        xh2.c cVar;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        xh2.i iVar;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.o4) P0(mm2.o4.class)).A;
        if (liveMutableData == null || (cVar = (xh2.c) liveMutableData.getValue()) == null || (linkedList = cVar.f454531a) == null) {
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((xh2.a) obj).b(), ((mm2.e1) P0(mm2.e1.class)).f328987q.f380301n)) {
                break;
            }
        }
        xh2.a aVar = (xh2.a) obj;
        return (aVar == null || (iVar = aVar.f454521b) == null || iVar.f454555g != 1) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x010a, code lost:
    
        if (r1 != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009f A[EDGE_INSN: B:86:0x009f->B:87:0x009f BREAK  A[LOOP:0: B:31:0x0072->B:35:0x009c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1() {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.a8.x1():void");
    }
}
