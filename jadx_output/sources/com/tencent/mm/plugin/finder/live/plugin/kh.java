package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kh extends com.tencent.mm.plugin.finder.live.plugin.l {
    public final android.view.View A;
    public final android.widget.TextView B;
    public final android.widget.Space C;
    public int D;
    public final com.tencent.mm.plugin.finder.live.plugin.a E;
    public final com.tencent.mm.plugin.finder.live.plugin.a F;
    public final com.tencent.mm.plugin.finder.live.plugin.a G;
    public final android.view.View H;
    public final android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f113241J;
    public final android.graphics.drawable.Drawable K;
    public final android.graphics.drawable.Drawable L;
    public int M;
    public java.lang.String N;
    public long P;
    public int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public boolean V;
    public final android.view.View.OnClickListener W;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113242p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f113243q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f113244r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f113245s;

    /* renamed from: t, reason: collision with root package name */
    public final fl2.e f113246t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f113247u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f113248v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f113249w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f113250x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.ImageView f113251y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ImageView f113252z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kh(android.view.ViewGroup r24, qo0.c r25) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.kh.<init>(android.view.ViewGroup, qo0.c):void");
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.kh khVar) {
        boolean z17 = true;
        if (!((mm2.e1) khVar.P0(mm2.e1.class)).t7()) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            gk2.e buContext = khVar.S0();
            kotlin.jvm.internal.o.g(buContext, "buContext");
            ae2.in inVar = ae2.in.f3688a;
            jz5.g gVar = ae2.in.f3868s;
            if (!(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() > 0 ? ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == 2 : ((mm2.c1) buContext.a(mm2.c1.class)).f328928z5) || (!khVar.z1() && !((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) khVar.P0(mm2.g1.class)).f329078s).getValue()).f329586j && ((!((mm2.o4) khVar.P0(mm2.o4.class)).z7() || !((mm2.c1) khVar.P0(mm2.c1.class)).R4) && ((!((mm2.c1) khVar.P0(mm2.c1.class)).m7() || r4Var.F0(((mm2.e1) khVar.P0(mm2.e1.class)).f328988r) <= 0) && (!((mm2.e1) khVar.P0(mm2.e1.class)).b7() || ((mm2.c1) khVar.P0(mm2.c1.class)).T1 <= 0 || !((om2.l) khVar.P0(om2.l.class)).f346343h))))) {
                z17 = false;
            }
        }
        android.widget.ImageView imageView = khVar.f113252z;
        android.view.View view = khVar.f113249w;
        if (!z17) {
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (view != null) {
                view.setTag(com.tencent.mm.R.id.e6n, java.lang.Boolean.FALSE);
            }
            if (imageView == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "refreshViews$refreshMemberClick", "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "refreshViews$refreshMemberClick", "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (view != null) {
            view.setOnClickListener(khVar.W);
        }
        if (view != null) {
            dy1.a.i(view, "finder_live_room_hot_list");
            dy1.a.l(view, 8, 25561);
        }
        if (view != null) {
            view.setTag(com.tencent.mm.R.id.e6n, java.lang.Boolean.TRUE);
        }
        if (imageView == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(imageView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "refreshViews$refreshMemberClick", "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "refreshViews$refreshMemberClick", "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void A1(java.util.List refreshMembersConfig, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(refreshMembersConfig, "refreshMembersConfig");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.fh(refreshMembersConfig, this, z18, z17));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void L0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        android.view.View findViewById;
        android.view.View findViewById2;
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            n1();
            return;
        }
        if (ordinal == 27) {
            K0(8);
            return;
        }
        android.view.ViewGroup viewGroup = this.f365323d;
        if (ordinal == 241) {
            if (x0() || (findViewById = viewGroup.findViewById(com.tencent.mm.R.id.lsj)) == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (ordinal != 242 || x0() || (findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.lsj)) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // qo0.a
    public void N0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.D = 0;
        this.E.f111775b.clear();
        this.F.f111775b.clear();
        this.G.f111775b.clear();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if ((((mm2.n0) P0(mm2.n0.class)).f329273r) != false) goto L19;
     */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n1() {
        /*
            r10 = this;
            zl2.r4 r0 = zl2.r4.f473950a
            boolean r1 = r0.x1()
            if (r1 != 0) goto Ldd
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            gk2.e r2 = r10.S0()
            boolean r2 = r0.f2(r2)
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L28
            jz5.l r0 = new jz5.l
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.<init>(r2, r4)
            r1.add(r0)
            goto Lda
        L28:
            java.lang.Class<mm2.e1> r2 = mm2.e1.class
            androidx.lifecycle.c1 r5 = r10.P0(r2)
            mm2.e1 r5 = (mm2.e1) r5
            boolean r5 = r5.t7()
            r6 = 3
            if (r5 == 0) goto L45
            jz5.l r0 = new jz5.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0.<init>(r2, r4)
            r1.add(r0)
            goto Lda
        L45:
            jz5.l r5 = new jz5.l
            r7 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.<init>(r7, r4)
            r1.add(r5)
            java.lang.Class<mm2.g1> r5 = mm2.g1.class
            androidx.lifecycle.c1 r7 = r10.P0(r5)
            mm2.g1 r7 = (mm2.g1) r7
            kotlinx.coroutines.flow.j2 r7 = r7.f329078s
            kotlinx.coroutines.flow.h3 r7 = (kotlinx.coroutines.flow.h3) r7
            java.lang.Object r7 = r7.getValue()
            mm2.y6 r7 = (mm2.y6) r7
            boolean r7 = r7.f329586j
            java.lang.Class<mm2.c1> r8 = mm2.c1.class
            if (r7 != 0) goto L85
            androidx.lifecycle.c1 r7 = r10.P0(r8)
            mm2.c1 r7 = (mm2.c1) r7
            boolean r7 = r7.T
            if (r7 != 0) goto L85
            java.lang.Class<mm2.n0> r7 = mm2.n0.class
            androidx.lifecycle.c1 r7 = r10.P0(r7)
            mm2.n0 r7 = (mm2.n0) r7
            boolean r7 = r7.f329273r
            r9 = 1
            if (r7 != r9) goto L82
            goto L83
        L82:
            r9 = r3
        L83:
            if (r9 == 0) goto L91
        L85:
            jz5.l r7 = new jz5.l
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r6, r4)
            r1.add(r7)
        L91:
            androidx.lifecycle.c1 r6 = r10.P0(r8)
            mm2.c1 r6 = (mm2.c1) r6
            boolean r6 = r6.f328862p3
            if (r6 == 0) goto Lda
            androidx.lifecycle.c1 r6 = r10.P0(r8)
            mm2.c1 r6 = (mm2.c1) r6
            boolean r6 = r6.m7()
            if (r6 == 0) goto Lda
            androidx.lifecycle.c1 r5 = r10.P0(r5)
            mm2.g1 r5 = (mm2.g1) r5
            kotlinx.coroutines.flow.j2 r5 = r5.f329078s
            kotlinx.coroutines.flow.h3 r5 = (kotlinx.coroutines.flow.h3) r5
            java.lang.Object r5 = r5.getValue()
            mm2.y6 r5 = (mm2.y6) r5
            boolean r5 = r5.f329586j
            if (r5 != 0) goto Lcd
            androidx.lifecycle.c1 r2 = r10.P0(r2)
            mm2.e1 r2 = (mm2.e1) r2
            r45.nw1 r2 = r2.f328988r
            long r5 = r0.F0(r2)
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto Lda
        Lcd:
            jz5.l r0 = new jz5.l
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.<init>(r2, r4)
            r1.add(r0)
        Lda:
            r10.A1(r1, r3, r3)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.kh.n1():void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void u1(android.os.Bundle bundle) {
        int i17;
        int i18;
        if (zl2.r4.f473950a.x1()) {
            int i19 = bundle != null ? bundle.getInt("NET_STATUS_AUDIO_STATE", 0) : 0;
            int i27 = this.S;
            boolean z17 = i27 > -1;
            com.tencent.mm.plugin.finder.live.plugin.a aVar = this.E;
            if (z17) {
                aVar.f111775b.add(java.lang.Integer.valueOf(i19));
            }
            int i28 = this.T;
            boolean z18 = i28 > -1;
            com.tencent.mm.plugin.finder.live.plugin.a aVar2 = this.F;
            if (z18) {
                aVar2.f111775b.add(java.lang.Integer.valueOf(i19));
            }
            int i29 = this.U;
            boolean z19 = i29 > -1;
            com.tencent.mm.plugin.finder.live.plugin.a aVar3 = this.G;
            if (z19) {
                aVar3.f111775b.add(java.lang.Integer.valueOf(i19));
            }
            int size = aVar.f111775b.size();
            java.lang.String str = this.f113243q;
            if (size == i27) {
                aVar.f111774a = true;
                java.util.Iterator it = aVar.f111775b.iterator();
                boolean z27 = true;
                while (it.hasNext()) {
                    if (((java.lang.Number) it.next()).intValue() != 1) {
                        z27 = false;
                    }
                }
                com.tencent.mars.xlog.Log.i(str, "checkErrBarSilentAudio silent:" + z27);
                if (z27) {
                    int i37 = this.D;
                    java.util.regex.Pattern pattern = pm0.v.f356802a;
                    i18 = i37 | 2;
                } else {
                    int i38 = this.D;
                    java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                    i18 = i38 & (-3);
                }
                this.D = i18;
                aVar.f111775b.clear();
                aVar.f111774a = false;
            }
            if (aVar2.f111775b.size() == i28) {
                aVar2.f111774a = true;
                java.util.Iterator it6 = aVar2.f111775b.iterator();
                boolean z28 = false;
                while (it6.hasNext()) {
                    if (((java.lang.Number) it6.next()).intValue() == 2) {
                        z28 = true;
                    }
                }
                com.tencent.mars.xlog.Log.i(str, "checkErrBarMaxAudio audioOverflow:" + z28);
                if (z28) {
                    int i39 = this.D;
                    java.util.regex.Pattern pattern3 = pm0.v.f356802a;
                    i17 = i39 | 1;
                } else {
                    int i47 = this.D;
                    java.util.regex.Pattern pattern4 = pm0.v.f356802a;
                    i17 = i47 & (-2);
                }
                this.D = i17;
                aVar2.f111775b.clear();
                aVar2.f111774a = false;
            }
            if (aVar3.f111775b.size() == i29) {
                aVar3.f111774a = true;
                java.util.Iterator it7 = aVar3.f111775b.iterator();
                int i48 = 0;
                while (it7.hasNext()) {
                    if (((java.lang.Number) it7.next()).intValue() == 3) {
                        i48++;
                    }
                }
                com.tencent.mars.xlog.Log.i(str, "checkBreakAudio breakCount:" + i48);
                if (i48 >= ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.J4).getValue()).r()).intValue()) {
                    vn0.f e17 = zl2.r4.f473950a.x1() ? dk2.ef.f233372a.e() : dk2.ef.f233372a.u0();
                    in0.q qVar = e17 instanceof in0.q ? (in0.q) e17 : null;
                    if (qVar != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "restartAudioDevice");
                        qVar.A("");
                    }
                }
                aVar3.f111775b.clear();
                aVar3.f111774a = false;
            }
        }
    }

    public final void v1(int i17) {
        if (gm0.j1.b().m()) {
            int e17 = c01.id.e() - i17;
            this.N = no0.l.a(no0.m.f338730a, e17, ":", false, false, false, 28, null);
            this.P = e17 > 0 ? e17 : 0L;
        }
    }

    public final void w1() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.W1(S0()) || r4Var.z1(S0())) {
            if (sn0.b.f409964e2 == null) {
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new java.lang.Object[0]);
                sn0.b.f409964e2 = new sn0.b();
            }
            sn0.b bVar = sn0.b.f409964e2;
            kotlin.jvm.internal.o.d(bVar);
            this.M = bVar.D.f309590j;
            return;
        }
        if (in0.q.f292769b2 != null) {
            if (in0.q.f292769b2 == null) {
                in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
            }
            in0.q qVar = in0.q.f292769b2;
            kotlin.jvm.internal.o.d(qVar);
            this.M = qVar.D.f309590j;
        }
    }

    public final int x1() {
        if (pm0.v.z(this.D, 2)) {
            return 2;
        }
        if (pm0.v.z(this.D, 8)) {
            return 8;
        }
        if (pm0.v.z(this.D, 4)) {
            return 4;
        }
        return pm0.v.z(this.D, 1) ? 1 : 0;
    }

    public final android.graphics.drawable.Drawable y1(int i17) {
        android.graphics.drawable.Drawable drawable = this.f365323d.getContext().getResources().getDrawable(i17);
        kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
        return drawable;
    }

    public final boolean z1() {
        if (zl2.r4.f473950a.w1() || ((mm2.c1) P0(mm2.c1.class)).T) {
            return true;
        }
        return ((mm2.n0) P0(mm2.n0.class)).f329273r;
    }
}
