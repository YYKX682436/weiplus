package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class hp extends com.tencent.mm.plugin.finder.live.widget.e0 implements android.view.View.OnClickListener {
    public androidx.recyclerview.widget.RecyclerView A1;
    public android.view.View B1;
    public android.widget.TextView C1;
    public android.widget.TextView D1;
    public android.view.ViewGroup E1;
    public android.widget.LinearLayout F1;
    public android.widget.TextView G1;
    public final com.tencent.mm.plugin.finder.live.plugin.l H;
    public android.view.View H1;
    public final java.lang.String I;
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget I1;

    /* renamed from: J */
    public yz5.a f118579J;
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget J1;
    public yz5.a K;
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget K1;
    public yz5.l L;
    public android.view.View L1;
    public yz5.l M;
    public android.widget.Button M1;
    public yz5.l N;
    public android.widget.ProgressBar N1;
    public android.view.View O1;
    public r45.xn1 P;
    public com.tencent.mm.ui.widget.imageview.WeImageView P1;
    public int Q;
    public android.widget.TextView Q1;
    public r45.qt2 R;
    public android.widget.ProgressBar R1;
    public boolean S;
    public android.widget.TextView S1;
    public boolean T;
    public com.tencent.mm.sdk.event.IListener T1;
    public int U;
    public boolean U1;
    public long V;
    public com.tencent.mm.ui.widget.dialog.k0 V1;
    public java.lang.String W;
    public android.view.View W1;
    public android.view.View X;
    public boolean X1;
    public android.widget.TextView Y;
    public boolean Y1;
    public android.widget.ImageView Z;
    public com.tencent.mm.plugin.finder.live.widget.mo Z1;

    /* renamed from: a2 */
    public java.lang.String f118580a2;

    /* renamed from: l1 */
    public android.view.View f118581l1;

    /* renamed from: p0 */
    public android.widget.TextView f118582p0;

    /* renamed from: p1 */
    public android.widget.TextView f118583p1;

    /* renamed from: x0 */
    public android.view.ViewGroup f118584x0;

    /* renamed from: x1 */
    public android.widget.ImageView f118585x1;

    /* renamed from: y0 */
    public com.tencent.mm.ui.widget.imageview.WeImageView f118586y0;

    /* renamed from: y1 */
    public android.widget.RelativeLayout f118587y1;

    /* renamed from: z1 */
    public android.widget.TextView f118588z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hp(android.content.Context r8, com.tencent.mm.plugin.finder.live.plugin.l r9, zl2.u4 r10, int r11, kotlin.jvm.internal.i r12) {
        /*
            r7 = this;
            r12 = r11 & 2
            if (r12 == 0) goto L5
            r9 = 0
        L5:
            r11 = r11 & 4
            if (r11 == 0) goto Lb
            zl2.u4 r10 = zl2.u4.f473988d
        Lb:
            r3 = r10
            java.lang.String r10 = "context"
            kotlin.jvm.internal.o.g(r8, r10)
            java.lang.String r10 = "uiMode"
            kotlin.jvm.internal.o.g(r3, r10)
            r2 = 0
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.H = r9
            java.lang.String r8 = "FinderLiveMemebrProfileWidget"
            r7.I = r8
            java.lang.String r8 = ""
            r7.W = r8
            com.tencent.mm.plugin.finder.live.widget.mo r8 = com.tencent.mm.plugin.finder.live.widget.mo.f119104f
            r7.Z1 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.hp.<init>(android.content.Context, com.tencent.mm.plugin.finder.live.plugin.l, zl2.u4, int, kotlin.jvm.internal.i):void");
    }

    public static final void e0(com.tencent.mm.plugin.finder.live.widget.hp hpVar, java.lang.String str) {
        hpVar.getClass();
        if ((str == null || str.length() == 0) || zl2.r4.f473950a.c2(str)) {
            return;
        }
        hpVar.s0(2);
        dk2.q4 q4Var = dk2.q4.f233938a;
        android.content.Context context = hpVar.f118183e;
        gk2.e eVar = new gk2.e(null, 1, null);
        android.content.Context context2 = hpVar.f118183e;
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dk2.q4.j(q4Var, context, eVar, false, str, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.ra.class))).V6(), false, null, 96, null);
    }

    public static /* synthetic */ void y0(com.tencent.mm.plugin.finder.live.widget.hp hpVar, r45.xn1 xn1Var, java.lang.String str, int i17, r45.qt2 qt2Var, boolean z17, java.lang.String str2, int i18, java.lang.Object obj) {
        hpVar.x0(xn1Var, (i18 & 2) != 0 ? "" : str, i17, (i18 & 8) != 0 ? null : qt2Var, z17, (i18 & 32) != 0 ? "" : str2);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.aud;
    }

    /* JADX WARN: Code restructure failed: missing block: B:464:0x05bc, code lost:
    
        if ((r4 != null && r4.getVisibility() == 0) != false) goto L1081;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02e2, code lost:
    
        if ((r8 != null ? java.lang.Boolean.valueOf(r8.post(new com.tencent.mm.plugin.finder.live.widget.ap(r28, r5))) : null) == null) goto L900;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x09fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0887 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0(r45.xn1 r29, int r30) {
        /*
            Method dump skipped, instructions count: 2679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.hp.A0(r45.xn1, int):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        android.widget.RelativeLayout relativeLayout;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.W1 = rootView;
        this.X = rootView.findViewById(com.tencent.mm.R.id.f_7);
        this.Y = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f485892jg2);
        this.Z = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.a88);
        this.f118582p0 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f9z);
        this.f118584x0 = (android.view.ViewGroup) rootView.findViewById(com.tencent.mm.R.id.f_0);
        this.f118586y0 = (com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.g4m);
        this.f118581l1 = rootView.findViewById(com.tencent.mm.R.id.l8j);
        this.f118583p1 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f487520ov2);
        this.f118585x1 = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.f_8);
        this.f118587y1 = (android.widget.RelativeLayout) rootView.findViewById(com.tencent.mm.R.id.f_1);
        this.f118588z1 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f_5);
        this.E1 = (android.view.ViewGroup) rootView.findViewById(com.tencent.mm.R.id.oun);
        this.H1 = rootView.findViewById(com.tencent.mm.R.id.t48);
        this.I1 = (com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget) rootView.findViewById(com.tencent.mm.R.id.r9k);
        this.J1 = (com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget) rootView.findViewById(com.tencent.mm.R.id.vpt);
        this.K1 = (com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget) rootView.findViewById(com.tencent.mm.R.id.tcr);
        this.A1 = (androidx.recyclerview.widget.RecyclerView) rootView.findViewById(com.tencent.mm.R.id.l_e);
        this.L1 = rootView.findViewById(com.tencent.mm.R.id.f9y);
        this.M1 = (android.widget.Button) rootView.findViewById(com.tencent.mm.R.id.f_9);
        this.B1 = rootView.findViewById(com.tencent.mm.R.id.rvx);
        this.D1 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.rvz);
        this.C1 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.s5j);
        this.N1 = (android.widget.ProgressBar) rootView.findViewById(com.tencent.mm.R.id.imc);
        this.O1 = rootView.findViewById(com.tencent.mm.R.id.f_3);
        this.P1 = (com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.f_2);
        this.Q1 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f_4);
        this.F1 = (android.widget.LinearLayout) rootView.findViewById(com.tencent.mm.R.id.toi);
        this.G1 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.tog);
        android.view.View G = G();
        this.R1 = G != null ? (android.widget.ProgressBar) G.findViewById(com.tencent.mm.R.id.tke) : null;
        android.view.View G2 = G();
        this.S1 = G2 != null ? (android.widget.TextView) G2.findViewById(com.tencent.mm.R.id.tkf) : null;
        android.view.View view = this.O1;
        if (view != null) {
            view.setOnClickListener(this);
        }
        android.widget.LinearLayout linearLayout = this.F1;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(this);
        }
        yz5.l lVar = this.M;
        if (lVar != null) {
            lVar.invoke(rootView);
        }
        android.content.Context context = this.f118183e;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f17 = (17.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
        android.widget.Button button = this.M1;
        if (button != null) {
            button.setTextSize(1, f17);
        }
        android.widget.Button button2 = this.M1;
        com.tencent.mm.ui.bk.r0(button2 != null ? button2.getPaint() : null, 0.8f);
        android.widget.TextView textView = this.Q1;
        com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        android.widget.RelativeLayout relativeLayout2 = this.f118587y1;
        if (relativeLayout2 != null && (relativeLayout2.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams)) {
            if (!(context.getResources().getConfiguration().orientation == 2) && (relativeLayout = this.f118587y1) != null) {
                int paddingLeft = relativeLayout != null ? relativeLayout.getPaddingLeft() : 0;
                android.widget.RelativeLayout relativeLayout3 = this.f118587y1;
                int paddingTop = relativeLayout3 != null ? relativeLayout3.getPaddingTop() : 0;
                android.widget.RelativeLayout relativeLayout4 = this.f118587y1;
                relativeLayout.setPadding(paddingLeft, paddingTop, relativeLayout4 != null ? relativeLayout4.getPaddingRight() : 0, com.tencent.mm.ui.bl.c(relativeLayout2.getContext()));
            }
        }
        com.tencent.mm.ui.bl.c(context);
        this.T1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FollowUserEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget$initContentView$2
            {
                this.__eventId = 398763182;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact;
                com.tencent.mm.autogen.events.FollowUserEvent event = followUserEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.live.widget.hp hpVar = com.tencent.mm.plugin.finder.live.widget.hp.this;
                r45.xn1 xn1Var = hpVar.P;
                java.lang.String username = (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername();
                if (!(username == null || username.length() == 0)) {
                    am.zd zdVar = event.f54346g;
                    if (kotlin.jvm.internal.o.b(zdVar != null ? zdVar.f8551a : null, username)) {
                        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.xo(hpVar));
                    }
                }
                return false;
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget finderLiveFinderDetailWidget = this.K1;
        if (finderLiveFinderDetailWidget != null) {
            ns2.j jVar = finderLiveFinderDetailWidget.f117618e;
            jVar.getClass();
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            ns2.g gVar = jVar.f339388a;
            d17.q(6276, gVar);
            gVar.f339382d = null;
            gVar.f339383e = null;
            finderLiveFinderDetailWidget.f117631u = null;
            finderLiveFinderDetailWidget.f117619f = null;
            finderLiveFinderDetailWidget.f117632v = null;
            finderLiveFinderDetailWidget.f117633w = 0;
            finderLiveFinderDetailWidget.f117634x = 0;
            finderLiveFinderDetailWidget.f117635y = null;
            finderLiveFinderDetailWidget.f117636z = null;
            finderLiveFinderDetailWidget.A = false;
        }
        this.U1 = false;
        this.X1 = false;
        yz5.a aVar = this.K;
        if (aVar != null) {
            aVar.invoke();
        }
        g0();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void U() {
        java.util.List list;
        java.lang.Object obj;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        android.widget.ProgressBar progressBar = this.R1;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        android.widget.TextView textView = this.S1;
        if (textView != null) {
            textView.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.H;
        if (lVar == null || (list = ((mm2.o4) lVar.P0(mm2.o4.class)).f329327v) == null) {
            return;
        }
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.String str = ((km2.q) next).f309172c;
                r45.xn1 xn1Var = this.P;
                if (xn1Var != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
                    obj = finderContact.getUsername();
                }
                if (kotlin.jvm.internal.o.b(str, obj)) {
                    obj = next;
                    break;
                }
            }
        }
        km2.q qVar = (km2.q) obj;
        if (qVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_MIC_ID", qVar.f309175f);
            this.H.f113325g.statusChange(qo0.b.M3, bundle);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        super.V(e0Var, z17, i17);
        this.U1 = true;
        yz5.a aVar = this.f118579J;
        if (aVar != null) {
            aVar.invoke();
        }
        f0();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.hp.b():void");
    }

    public final void f0() {
        com.tencent.mars.xlog.Log.i(this.I, "activate");
        com.tencent.mm.sdk.event.IListener iListener = this.T1;
        if (iListener != null) {
            iListener.alive();
        }
    }

    public final void g0() {
        com.tencent.mars.xlog.Log.i(this.I, "deActivate");
        com.tencent.mm.sdk.event.IListener iListener = this.T1;
        if (iListener != null) {
            iListener.dead();
        }
    }

    public final void h0(int i17) {
        java.lang.String str;
        dk2.xf W0;
        java.util.List list;
        java.lang.Object obj;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        r45.xn1 xn1Var = this.P;
        r45.o72 o72Var = null;
        java.lang.String username = (xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact2.getUsername();
        if (username != null) {
            r45.qt2 qt2Var = this.R;
            if (qt2Var == null) {
                android.content.Context context = this.f118183e;
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                qt2Var = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
            }
            r45.qt2 qt2Var2 = qt2Var;
            java.lang.String str2 = "";
            com.tencent.mm.plugin.finder.live.plugin.l lVar = this.H;
            if (lVar != null && (list = ((mm2.o4) lVar.P0(mm2.o4.class)).f329327v) != null) {
                synchronized (list) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        java.lang.String str3 = ((km2.q) obj).f309172c;
                        r45.xn1 xn1Var2 = this.P;
                        if (kotlin.jvm.internal.o.b(str3, (xn1Var2 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact.getUsername())) {
                            break;
                        }
                    }
                }
                km2.q qVar = (km2.q) obj;
                if (qVar != null && (str2 = qVar.f309175f) == null) {
                    str2 = "";
                }
            }
            java.lang.String str4 = str2;
            int i18 = str4.length() > 0 ? 27 : 28;
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            com.tencent.mm.plugin.finder.live.plugin.l lVar2 = this.H;
            long j17 = lVar2 != null ? ((mm2.e1) lVar2.P0(mm2.e1.class)).f328983m : 0L;
            java.lang.String e17 = xy2.c.e(this.f118183e);
            com.tencent.mm.plugin.finder.live.plugin.l lVar3 = this.H;
            if (lVar3 != null && (W0 = lVar3.W0()) != null) {
                o72Var = ((dk2.r4) W0).K(((mm2.e1) this.H.P0(mm2.e1.class)).f328988r.getLong(0));
            }
            r45.o72 o72Var2 = o72Var;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            com.tencent.mm.plugin.finder.live.plugin.l lVar4 = this.H;
            if (lVar4 == null || (str = ((mm2.e1) lVar4.P0(mm2.e1.class)).f328992v) == null) {
                str = "";
            }
            c61.yb.R8(ybVar, qt2Var2, username, i17, j17, false, e17, o72Var2, valueOf, null, null, null, str, str4, 1792, null);
        }
    }

    public final java.lang.String i0(r45.xn1 xn1Var) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("headUrl is empty:");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
        java.lang.String headUrl = finderContact != null ? finderContact.getHeadUrl() : null;
        sb6.append(headUrl == null || headUrl.length() == 0);
        sb6.append(", nickName:");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
        sb6.append(finderContact2 != null ? finderContact2.getNickname() : null);
        sb6.append(",authIconType:");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
        sb6.append((finderContact3 == null || (authInfo = finderContact3.getAuthInfo()) == null) ? null : java.lang.Integer.valueOf(authInfo.getAuthIconType()));
        sb6.append(",roleType:");
        sb6.append(xn1Var.getInteger(7));
        sb6.append(",disableComment:");
        sb6.append(xn1Var.getInteger(2));
        sb6.append(", extInfo is empty:");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
        sb6.append((finderContact4 != null ? finderContact4.getExtInfo() : null) == null);
        sb6.append(",signature is empty:");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
        sb6.append((finderContact5 != null ? finderContact5.getSignature() : null) == null);
        sb6.append(",reward:");
        sb6.append(xn1Var.getInteger(3));
        return sb6.toString();
    }

    public final int j0(int i17) {
        int i18 = 1;
        if (i17 == 1) {
            return 2;
        }
        if (i17 != 2) {
            i18 = 3;
            if (i17 != 3) {
                return (i17 == 10 || i17 == 11) ? 2 : 0;
            }
        }
        return i18;
    }

    public final void k0(r45.xn1 xn1Var) {
        boolean m07 = m0();
        java.lang.String str = this.I;
        if (!m07 && !n0() && !o0()) {
            if (!((!m0() && !n0()) && q0())) {
                com.tencent.mars.xlog.Log.i(str, "handleFollowBtn: not anchor or assistant or visitor");
                android.view.View view = this.O1;
                if (view == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        java.lang.Integer valueOf = xn1Var != null ? java.lang.Integer.valueOf(xn1Var.getInteger(7)) : null;
        if (valueOf == null || valueOf.intValue() != 3) {
            com.tencent.mars.xlog.Log.i(str, "handleFollowBtn: roleType not finder:" + valueOf);
            android.view.View view2 = this.O1;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
        java.lang.String username = finderContact != null ? finderContact.getUsername() : null;
        if (username == null || username.length() == 0) {
            com.tencent.mars.xlog.Log.i(str, "handleFollowBtn: finderUsername is null or empty");
            android.view.View view3 = this.O1;
            if (view3 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.O1;
        if (view4 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).rj(username)) {
            com.tencent.mars.xlog.Log.i(str, "handleFollowBtn have follow user:" + username);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.P1;
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_done);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.P1;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
            android.widget.TextView textView = this.Q1;
            if (textView == null) {
                return;
            }
            textView.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7d));
            return;
        }
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        if (nv2.d0.f340470e.d(username)) {
            com.tencent.mars.xlog.Log.i(str, "handleFollowBtn waiting user:" + username + " to allow");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.P1;
            if (weImageView3 != null) {
                weImageView3.setImageResource(com.tencent.mm.R.raw.icons_filled_done);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.P1;
            if (weImageView4 != null) {
                weImageView4.setVisibility(0);
            }
            android.widget.TextView textView2 = this.Q1;
            if (textView2 == null) {
                return;
            }
            textView2.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7e));
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = this.P1;
        if (weImageView5 != null) {
            weImageView5.setImageResource(com.tencent.mm.R.raw.icons_filled_add);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = this.P1;
        if (weImageView6 != null) {
            weImageView6.setVisibility(0);
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7c);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (this.S) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7x);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView7 = this.P1;
            if (weImageView7 != null) {
                weImageView7.setVisibility(8);
            }
        }
        android.widget.TextView textView3 = this.Q1;
        if (textView3 != null) {
            textView3.setText(string);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        jSONObject.put("element", 1);
        jSONObject.put(ya.b.SOURCE, j0(this.Q));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        if ((m0() || n0()) ? false : true) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.f327229f3, jSONObject2, 0L, null, null, null, null, null, 252, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.y6((zy2.zb) c18, ml2.z4.F2, jSONObject2, null, 4, null);
        }
    }

    public final void l0() {
        com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
    }

    public final boolean m0() {
        if (this.Q != 5) {
            return zl2.r4.f473950a.w1();
        }
        java.lang.String str = this.f118580a2;
        return str != null && str.equals(xy2.c.e(this.f118183e));
    }

    public final boolean n0() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.H;
        if (lVar != null) {
            return ((mm2.c1) lVar.P0(mm2.c1.class)).T;
        }
        return false;
    }

    public final boolean o0() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.H;
        return lVar != null && ((mm2.n0) lVar.P0(mm2.n0.class)).f329273r;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        qo0.c cVar;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String str2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        java.util.List list;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object obj = null;
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        boolean z17 = false;
        if ((valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f_8) || (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.oun)) {
            com.tencent.mm.plugin.finder.live.plugin.l lVar = this.H;
            if (!(lVar != null && ((mm2.c1) lVar.P0(mm2.c1.class)).R6())) {
                com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget finderLiveFinderDetailWidget = this.K1;
                if (finderLiveFinderDetailWidget != null && finderLiveFinderDetailWidget.getVisibility() == 0) {
                    int j07 = j0(this.Q);
                    r45.xn1 xn1Var = this.P;
                    java.lang.Integer valueOf2 = xn1Var != null ? java.lang.Integer.valueOf(xn1Var.getInteger(7)) : null;
                    com.tencent.mm.plugin.finder.live.widget.no[] noVarArr = com.tencent.mm.plugin.finder.live.widget.no.f119195d;
                    t0(2, j07, valueOf2, 1);
                }
                if (m0()) {
                    ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                    ml2.h2[] h2VarArr = ml2.h2.f327521d;
                    int i17 = this.Q;
                    r45.xn1 xn1Var2 = this.P;
                    int integer = xn1Var2 != null ? xn1Var2.getInteger(7) : 0;
                    java.lang.String str3 = this.f118580a2;
                    if (str3 == null) {
                        str3 = "";
                    }
                    j0Var.Uj(2, i17, integer, str3);
                } else {
                    ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                    ml2.l2[] l2VarArr = ml2.l2.f327693d;
                    int i18 = this.Q;
                    r45.xn1 xn1Var3 = this.P;
                    int integer2 = xn1Var3 != null ? xn1Var3.getInteger(7) : 0;
                    java.lang.String str4 = this.f118580a2;
                    if (str4 == null) {
                        str4 = "";
                    }
                    r0Var.Pk(2, i18, integer2, str4);
                }
                if (m0()) {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).Xj(ml2.r3.f327907o);
                }
                l0();
                yz5.l lVar2 = this.L;
                if (lVar2 != null) {
                    r45.xn1 xn1Var4 = this.P;
                    if (xn1Var4 != null && (finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) != null) {
                        obj = finderContact5.getUsername();
                    }
                    lVar2.invoke(obj);
                }
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f_3) {
            android.widget.TextView textView = this.Q1;
            java.lang.CharSequence text = textView != null ? textView.getText() : null;
            if (kotlin.jvm.internal.o.b(text, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7c)) || kotlin.jvm.internal.o.b(text, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7x))) {
                if (m0()) {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).Xj(ml2.r3.f327903h);
                    ml2.j0 j0Var2 = (ml2.j0) i95.n0.c(ml2.j0.class);
                    ml2.h2[] h2VarArr2 = ml2.h2.f327521d;
                    int i19 = this.Q;
                    r45.xn1 xn1Var5 = this.P;
                    int integer3 = xn1Var5 != null ? xn1Var5.getInteger(7) : 0;
                    java.lang.String str5 = this.f118580a2;
                    if (str5 == null) {
                        str5 = "";
                    }
                    j0Var2.Uj(4, i19, integer3, str5);
                }
                r45.xn1 xn1Var6 = this.P;
                java.lang.String username = (xn1Var6 == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var6.getCustom(0)) == null) ? null : finderContact4.getUsername();
                if (username != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", 2);
                    jSONObject.put("element", 1);
                    jSONObject.put("mic_finderusername", username);
                    if (q0()) {
                        java.lang.String str6 = "";
                        com.tencent.mm.plugin.finder.live.plugin.l lVar3 = this.H;
                        if (lVar3 != null && (list = ((mm2.o4) lVar3.P0(mm2.o4.class)).f329327v) != null) {
                            synchronized (list) {
                                java.util.Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    java.lang.Object next = it.next();
                                    java.lang.String str7 = ((km2.q) next).f309172c;
                                    r45.xn1 xn1Var7 = this.P;
                                    if (kotlin.jvm.internal.o.b(str7, (xn1Var7 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var7.getCustom(0)) == null) ? null : finderContact3.getUsername())) {
                                        obj = next;
                                        break;
                                    }
                                }
                            }
                            km2.q qVar = (km2.q) obj;
                            if (qVar != null && (str6 = qVar.f309175f) == null) {
                                str6 = "";
                            }
                        }
                        jSONObject.put("mic_id", str6);
                    }
                    jSONObject.put(ya.b.SOURCE, j0(this.Q));
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    if (!m0() && !n0()) {
                        z17 = true;
                    }
                    if (z17) {
                        i95.m c17 = i95.n0.c(ml2.r0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327229f3, jSONObject2, 0L, null, null, null, null, null, 252, null);
                    } else {
                        i95.m c18 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c18, "getService(...)");
                        zy2.zb.y6((zy2.zb) c18, ml2.z4.F2, jSONObject2, null, 4, null);
                    }
                }
                h0(1);
                k0(this.P);
                java.lang.String string = this.S ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7f) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7d);
                kotlin.jvm.internal.o.d(string);
                pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.cp(this, string, com.tencent.mm.R.raw.icons_outlined_done));
            } else if (kotlin.jvm.internal.o.b(text, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7d))) {
                if (this.V1 == null) {
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(this.f118183e, 1, true);
                    this.V1 = k0Var;
                    k0Var.U1 = true;
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.V1;
                if (k0Var2 != null) {
                    k0Var2.t(true);
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.V1;
                if (k0Var3 != null) {
                    k0Var3.f211855d2 = false;
                }
                if (k0Var3 != null) {
                    k0Var3.f211872n = new com.tencent.mm.plugin.finder.live.widget.oo(this);
                }
                if (k0Var3 != null) {
                    k0Var3.f211881s = new com.tencent.mm.plugin.finder.live.widget.po(this);
                }
                if (k0Var3 != null) {
                    k0Var3.p(new com.tencent.mm.plugin.finder.live.widget.qo(this));
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var4 = this.V1;
                if (k0Var4 != null) {
                    k0Var4.v();
                }
            } else if (kotlin.jvm.internal.o.b(text, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7e))) {
                h0(3);
                k0(this.P);
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491781e82);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.cp(this, string2, com.tencent.mm.R.raw.icons_outlined_done));
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.toi) {
            if (this.Q == 8) {
                fj2.s sVar = fj2.s.f263183a;
                ml2.w4 w4Var = ml2.w4.f328194o;
                r45.xn1 xn1Var8 = this.P;
                if (xn1Var8 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var8.getCustom(0)) == null || (str2 = finderContact2.getUsername()) == null) {
                    str2 = "";
                }
                fj2.s.h(sVar, w4Var, str2, 0, 0, 12, null);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            r45.xn1 xn1Var9 = this.P;
            if (xn1Var9 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var9.getCustom(0)) == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            bundle.putString("PARAM_FINDER_LIVE_LINK_USERNAME", str);
            com.tencent.mm.plugin.finder.live.plugin.l lVar4 = this.H;
            if (lVar4 != null && (cVar = lVar4.f113325g) != null) {
                cVar.statusChange(qo0.b.f365341d4, bundle);
            }
            com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final boolean p0(r45.xn1 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.H;
        if (!kotlin.jvm.internal.o.b(lVar != null ? ((mm2.c1) lVar.P0(mm2.c1.class)).m8() : null, this.W)) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) contact.getCustom(0);
            if (!r4Var.k2(finderContact != null ? finderContact.getUsername() : null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean q0() {
        java.lang.Boolean bool;
        java.util.List list;
        java.lang.Object obj;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.H;
        java.lang.Boolean bool2 = null;
        if (lVar != null && (list = ((mm2.o4) lVar.P0(mm2.o4.class)).f329327v) != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    java.lang.String str = ((km2.q) obj).f309172c;
                    r45.xn1 xn1Var = this.P;
                    if (kotlin.jvm.internal.o.b(str, (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername())) {
                        break;
                    }
                }
            }
            if (((km2.q) obj) != null) {
                bool2 = java.lang.Boolean.TRUE;
                bool = java.lang.Boolean.valueOf(!kotlin.jvm.internal.o.b(r5.f309189t, r0));
                java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                return !kotlin.jvm.internal.o.b(bool2, bool3) && kotlin.jvm.internal.o.b(bool, bool3);
            }
        }
        bool = null;
        java.lang.Boolean bool32 = java.lang.Boolean.TRUE;
        if (kotlin.jvm.internal.o.b(bool2, bool32)) {
        }
    }

    public final void r0(int i17, int i18) {
        gk2.e eVar = dk2.ef.I;
        int i19 = ((eVar == null || !((mm2.c1) eVar.a(mm2.c1.class)).R6()) ? 0 : 1) ^ 1;
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        if (!zl2.r4.f473950a.w1()) {
            int j07 = j0(this.Q);
            r45.xn1 xn1Var = this.P;
            ml2.r0.hj(r0Var, ml2.b4.f327235h3, r0Var.Ai(i17, j07, xn1Var != null ? java.lang.Integer.valueOf(xn1Var.getInteger(7)) : null, i18, this.Z1.f119106d, i19), 0L, null, null, null, null, null, 252, null);
        } else {
            int j08 = j0(this.Q);
            r45.xn1 xn1Var2 = this.P;
            java.lang.String Ai = r0Var.Ai(i17, j08, xn1Var2 != null ? java.lang.Integer.valueOf(xn1Var2.getInteger(7)) : null, i18, this.Z1.f119106d, i19);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.L2, Ai, null, 4, null);
        }
    }

    public final void s0(int i17) {
        int i18 = this.Q;
        if (i18 == 10 || i18 == 11) {
            r45.xn1 xn1Var = this.P;
            int i19 = 0;
            int integer = xn1Var != null ? xn1Var.getInteger(7) : 0;
            com.tencent.mm.plugin.finder.live.plugin.l lVar = this.H;
            if (lVar != null && ((mm2.c1) lVar.P0(mm2.c1.class)).R6()) {
                i19 = 1;
            }
            int i27 = this.U;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17);
            jSONObject.put(ya.b.SOURCE, 2);
            jSONObject.put("identity", integer);
            jSONObject.put("display_type", i19 ^ 1);
            jSONObject.put("sort_type", i27);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            if (zl2.r4.f473950a.w1()) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.f328347d2, jSONObject2, null, 4, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.hj((ml2.r0) c18, ml2.b4.G2, jSONObject2, 0L, null, null, null, null, null, 252, null);
            }
        }
    }

    public final void t0(int i17, int i18, java.lang.Integer num, java.lang.Integer num2) {
        cl0.g gVar = new cl0.g();
        if (i17 == 2 && num2 != null) {
            gVar.o("profile_pos", num2.intValue());
        }
        gVar.o("user_type", this.Z1.f119106d);
        gVar.o("type", i17);
        gVar.o(ya.b.SOURCE, i18);
        if (num != null) {
            gVar.o("identity", num.intValue());
        }
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        int i19 = 0;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).R6()) {
            i19 = 1;
        }
        gVar.o("display_type", i19 ^ 1);
        int i27 = this.Q;
        if (i27 == 10 || i27 == 11) {
            gVar.o("sort_type", this.U);
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        if (zl2.r4.f473950a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328349e2, gVar2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.H2, gVar2, 0L, null, null, null, null, null, 252, null);
        }
    }

    public final void u0(int i17, java.lang.Integer num, int i18) {
        cl0.g gVar = new cl0.g();
        gVar.o("user_type", this.Z1.f119106d);
        gVar.o(ya.b.SOURCE, i17);
        gVar.h("identity", num);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        int i19 = 0;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).R6()) {
            i19 = 1;
        }
        gVar.o("display_type", i19 ^ 1);
        gVar.o("show_finder_profile", i18);
        int i27 = this.Q;
        if (i27 == 10 || i27 == 11) {
            gVar.o("sort_type", this.U);
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        if (zl2.r4.f473950a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328347d2, gVar2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.G2, gVar2, 0L, null, null, null, null, null, 252, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View v() {
        return android.view.LayoutInflater.from(this.f118183e).inflate(com.tencent.mm.R.layout.f488916ea3, (android.view.ViewGroup) null);
    }

    public final void v0() {
        dk2.u4 u4Var;
        java.lang.Object invoke;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        if (!m0()) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.l2[] l2VarArr = ml2.l2.f327693d;
            int i17 = this.Q;
            r45.xn1 xn1Var = this.P;
            int integer = xn1Var != null ? xn1Var.getInteger(7) : 0;
            java.lang.String str4 = this.f118580a2;
            if (str4 == null) {
                str4 = "";
            }
            r0Var.Pk(3, i17, integer, str4);
        }
        l0();
        com.tencent.mm.plugin.finder.live.widget.yo yoVar = new com.tencent.mm.plugin.finder.live.widget.yo(this);
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.H;
        if (lVar != null && (u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z) != null) {
            ce2.i e17 = dk2.u7.f234181a.e(u4Var.f234162i);
            if (u4Var.f() && u4Var.f234161h == 1 && e17 != null) {
                r45.zb4 zb4Var = new r45.zb4();
                zb4Var.set(1, java.lang.Boolean.TRUE);
                r45.xn1 xn1Var2 = this.P;
                if (xn1Var2 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null || (str = finderContact3.getUsername()) == null) {
                    str = "";
                }
                zb4Var.set(6, str);
                r45.xn1 xn1Var3 = this.P;
                if (xn1Var3 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null || (str2 = finderContact2.getNickname()) == null) {
                    str2 = "";
                }
                zb4Var.set(7, str2);
                r45.xn1 xn1Var4 = this.P;
                if (xn1Var4 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) == null || (str3 = finderContact.getHeadUrl()) == null) {
                    str3 = "";
                }
                zb4Var.set(8, str3);
                zb4Var.set(0, u4Var.f234162i);
                android.content.res.Resources resources = this.f118183e.getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.lang.String str5 = e17.field_name;
                objArr[0] = str5 != null ? str5 : "";
                zb4Var.set(5, resources.getString(com.tencent.mm.R.string.lid, objArr));
                com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.s2) lVar.P0(mm2.s2.class)).f329411p;
                if (liveMutableData != null) {
                    liveMutableData.postValue(zb4Var);
                    invoke = jz5.f0.f302826a;
                } else {
                    invoke = null;
                }
            } else {
                invoke = yoVar.invoke();
            }
            if (invoke != null) {
                return;
            }
        }
        yoVar.invoke();
    }

    public final void w0() {
        jz5.f0 f0Var;
        if (m0()) {
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            ml2.h2[] h2VarArr = ml2.h2.f327521d;
            int i17 = this.Q;
            r45.xn1 xn1Var = this.P;
            int integer = xn1Var != null ? xn1Var.getInteger(7) : 0;
            java.lang.String str = this.f118580a2;
            if (str == null) {
                str = "";
            }
            j0Var.Uj(3, i17, integer, str);
        }
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.G().r()).intValue();
        android.content.Context context = this.f118183e;
        if (intValue <= 0) {
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.cn9), 0).show();
        } else if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mars.xlog.Log.i(this.I, "sendPrivacyMsg skip is teen mode");
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.ega), 0).show();
        } else {
            r45.xn1 xn1Var2 = this.P;
            if (xn1Var2 != null) {
                if (m0()) {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).Xj(ml2.r3.f327902g);
                }
                java.lang.String str2 = this.f118580a2;
                if (str2 != null) {
                    ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Ui(this.f118183e, str2, xn1Var2, 1, 2, new com.tencent.mm.plugin.finder.live.widget.zo(this));
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    l0();
                    i95.m c17 = i95.n0.c(c61.ub.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) c17)).Ui(context, xy2.c.e(context), xn1Var2, 1, 2, null);
                }
            }
        }
        if (this.Q == 7) {
            if (m0()) {
                ml2.q2 q2Var = ml2.q2.G;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 34 ");
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
            } else {
                ml2.n4 n4Var = ml2.n4.H;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 31");
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.ik((ml2.r0) c18, n4Var, null, 0, 6, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x03b0, code lost:
    
        if ((r1 != null && ((mm2.c1) r1.P0(mm2.c1.class)).R6()) == false) goto L388;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0611  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(r45.xn1 r41, java.lang.String r42, int r43, r45.qt2 r44, boolean r45, java.lang.String r46) {
        /*
            Method dump skipped, instructions count: 1612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.hp.x0(r45.xn1, java.lang.String, int, r45.qt2, boolean, java.lang.String):void");
    }

    public final void z0(android.widget.Button button, boolean z17) {
        button.setVisibility(0);
        java.lang.Object tag = button.getTag();
        boolean b17 = kotlin.jvm.internal.o.b(tag, 1);
        android.content.Context context = this.f118183e;
        if (b17) {
            button.setText(context.getString(com.tencent.mm.R.string.dn9));
            if (z17) {
                button.setBackground(context.getDrawable(com.tencent.mm.R.drawable.a5p));
                button.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
            }
            button.setOnClickListener(com.tencent.mm.plugin.finder.live.widget.dp.f118135d);
            return;
        }
        if (kotlin.jvm.internal.o.b(tag, 2)) {
            button.setText(context.getString(com.tencent.mm.R.string.cqv));
            if (z17) {
                button.setBackground(context.getDrawable(com.tencent.mm.R.drawable.a0u));
                button.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
            }
            button.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ep(this));
            return;
        }
        if (kotlin.jvm.internal.o.b(tag, 3)) {
            ml2.i2[] i2VarArr = ml2.i2.f327553d;
            r0(1, 3);
            button.setText(context.getString(com.tencent.mm.R.string.dn_));
            if (z17) {
                button.setBackground(context.getDrawable(com.tencent.mm.R.drawable.a0u));
                button.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
            }
            button.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.fp(this));
            return;
        }
        if (!kotlin.jvm.internal.o.b(tag, 4)) {
            if (kotlin.jvm.internal.o.b(tag, 0)) {
                button.setVisibility(8);
                return;
            } else {
                button.setVisibility(8);
                return;
            }
        }
        ml2.i2[] i2VarArr2 = ml2.i2.f327553d;
        r0(1, 4);
        button.setText(context.getString(com.tencent.mm.R.string.dni));
        if (z17) {
            button.setBackground(context.getDrawable(com.tencent.mm.R.drawable.a0u));
            button.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        }
        button.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.gp(this));
    }
}
