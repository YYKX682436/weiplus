package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class j implements com.tencent.mm.plugin.multitalk.model.b0, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f150004d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f150005e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RelativeLayout f150006f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.model.k f150007g;

    /* renamed from: h, reason: collision with root package name */
    public sj3.j f150008h;

    /* renamed from: i, reason: collision with root package name */
    public sj3.d f150009i;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.model.c0 f150011n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f150013p;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.model.p3 f150015r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f150016s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f150017t;

    /* renamed from: m, reason: collision with root package name */
    public final android.util.ArrayMap f150010m = new android.util.ArrayMap();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f150012o = "";

    /* renamed from: q, reason: collision with root package name */
    public final boolean f150014q = zj3.j.h();

    public j() {
        com.tencent.mm.plugin.multitalk.model.p3 q17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().q();
        kotlin.jvm.internal.o.f(q17, "getVideoDataMuxer(...)");
        this.f150015r = q17;
        this.f150016s = kz5.c1.k(new jz5.l(0, new com.tencent.mm.plugin.multitalk.model.b(this)), new jz5.l(1, new com.tencent.mm.plugin.multitalk.model.g(this)), new jz5.l(2, new com.tencent.mm.plugin.multitalk.model.f(this)), new jz5.l(3, new com.tencent.mm.plugin.multitalk.model.e(this)), new jz5.l(4, new com.tencent.mm.plugin.multitalk.model.d(this)));
        this.f150017t = true;
    }

    public static final void e(com.tencent.mm.plugin.multitalk.model.j jVar) {
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView;
        jVar.getClass();
        zj3.g gVar = zj3.g.f473302a;
        zj3.g.f473323v.a();
        android.widget.FrameLayout frameLayout = jVar.f150005e;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = jVar.f150004d;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        com.tencent.mm.plugin.multitalk.model.k kVar = jVar.f150007g;
        if (kVar != null) {
            com.tencent.mm.plugin.multitalk.model.k.a(kVar, "", false, 2, null);
            ((sj3.a5) kVar).m();
        }
        sj3.j jVar2 = jVar.f150008h;
        if (jVar2 == null || (multitalkFrameView = jVar2.f408577d) == null) {
            return;
        }
        java.lang.String f150344m = multitalkFrameView.getF150344m();
        if (f150344m != null) {
            if ((kotlin.jvm.internal.o.b(f150344m, c01.z1.r()) ^ true ? f150344m : null) != null) {
                com.tencent.mm.plugin.multitalk.model.e3.Ri().getClass();
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
                allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(-1);
                com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
                byte[] array = allocate.array();
                i4Var.getClass();
                com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(22, array, 4);
            }
        }
        multitalkFrameView.d();
    }

    @Override // com.tencent.mm.plugin.multitalk.model.b0
    public com.tencent.mm.plugin.multitalk.model.a0 b(java.lang.String wxUserName) {
        kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
        sj3.j g17 = g(wxUserName);
        if (g17 == null) {
            return null;
        }
        if (!(g17.getAdapterPosition() >= 0)) {
            g17 = null;
        }
        if (g17 != null) {
            return g17.f408577d;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.b0
    public void c() {
        if (!this.f150013p) {
            sj3.j jVar = this.f150008h;
            boolean z17 = false;
            if (jVar != null && jVar.f408595y == 1) {
                z17 = true;
            }
            if (!z17) {
                return;
            }
        }
        pm0.v.X(new com.tencent.mm.plugin.multitalk.model.i(this));
    }

    @Override // com.tencent.mm.plugin.multitalk.model.b0
    public com.tencent.mm.plugin.multitalk.model.a0 d(int i17) {
        sj3.j jVar = this.f150008h;
        if (jVar == null) {
            return null;
        }
        boolean z17 = false;
        if (1 <= i17 && i17 < 6) {
            z17 = true;
        }
        if (z17) {
            pm0.v.X(new com.tencent.mm.plugin.multitalk.model.h(i17, jVar));
        }
        return jVar.f408577d;
    }

    public final void f() {
        sj3.j jVar;
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView;
        java.lang.String f150344m;
        android.widget.FrameLayout frameLayout = this.f150005e;
        boolean z17 = false;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            z17 = true;
        }
        if (!z17 || (jVar = this.f150008h) == null || (multitalkFrameView = jVar.f408577d) == null || (f150344m = multitalkFrameView.getF150344m()) == null) {
            return;
        }
        int c17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().o().c(f150344m);
        if (c17 == 100 || c17 == 104) {
            i();
        } else {
            l(f150344m, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final sj3.j g(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "wxUserName"
            kotlin.jvm.internal.o.g(r6, r0)
            sj3.d r0 = r5.f150009i
            r1 = 0
            if (r0 == 0) goto L43
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.f408460e
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()
            r4 = r3
            aj3.c r4 = (aj3.c) r4
            if (r4 == 0) goto L26
            com.tencent.mm.modeltalkroom.MultiTalkGroupMember r4 = r4.f5303a
            if (r4 == 0) goto L26
            java.lang.String r4 = r4.f71612d
            goto L27
        L26:
            r4 = r1
        L27:
            boolean r4 = kotlin.jvm.internal.o.b(r4, r6)
            if (r4 == 0) goto L10
            goto L2f
        L2e:
            r3 = r1
        L2f:
            aj3.c r3 = (aj3.c) r3
            if (r3 == 0) goto L36
            int r6 = r3.f5305c
            goto L37
        L36:
            r6 = -1
        L37:
            int r0 = r0.f408466n
            int r6 = r6 + r0
            androidx.recyclerview.widget.RecyclerView r0 = r5.f150004d
            if (r0 == 0) goto L43
            android.view.View r6 = r0.getChildAt(r6)
            goto L44
        L43:
            r6 = r1
        L44:
            if (r6 == 0) goto L57
            androidx.recyclerview.widget.RecyclerView r0 = r5.f150004d
            if (r0 == 0) goto L4f
            androidx.recyclerview.widget.k3 r6 = r0.w0(r6)
            goto L50
        L4f:
            r6 = r1
        L50:
            boolean r0 = r6 instanceof sj3.j
            if (r0 == 0) goto L57
            sj3.j r6 = (sj3.j) r6
            r1 = r6
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.j.g(java.lang.String):sj3.j");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0.contains(r2) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.multitalk.model.p3 h() {
        /*
            r2 = this;
            com.tencent.mm.plugin.multitalk.model.v0 r0 = com.tencent.mm.plugin.multitalk.model.e3.Ri()
            com.tencent.mm.plugin.multitalk.model.p3 r0 = r0.q()
            java.lang.String r1 = "getVideoDataMuxer(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r2.f150015r = r0
            java.util.ArrayList r0 = r0.f150068a
            if (r0 == 0) goto L1b
            boolean r0 = r0.contains(r2)
            r1 = 1
            if (r0 != r1) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 != 0) goto L23
            com.tencent.mm.plugin.multitalk.model.p3 r0 = r2.f150015r
            r0.e(r2)
        L23:
            com.tencent.mm.plugin.multitalk.model.p3 r0 = r2.f150015r
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.j.h():com.tencent.mm.plugin.multitalk.model.p3");
    }

    public final void i() {
        zj3.g gVar = zj3.g.f473302a;
        zj3.g.f473322u.a();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f150004d;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        com.tencent.mm.plugin.multitalk.model.k kVar = this.f150007g;
        if (kVar != null) {
            sj3.a5 a5Var = (sj3.a5) kVar;
            a5Var.w(java.lang.Boolean.FALSE);
            a5Var.t(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t, false);
        }
        com.tencent.mm.plugin.multitalk.model.k kVar2 = this.f150007g;
        if (kVar2 != null) {
            com.tencent.mm.plugin.multitalk.model.k.a(kVar2, "", false, 2, null);
        }
        sj3.j jVar = this.f150008h;
        if (jVar != null) {
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView = jVar.f408577d;
            if (multitalkFrameView != null) {
                multitalkFrameView.d();
            }
            jVar.j(true);
            jVar.i();
        }
        android.widget.FrameLayout frameLayout = this.f150005e;
        if (frameLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            com.tencent.mm.plugin.multitalk.model.k kVar3 = this.f150007g;
            if (kVar3 != null) {
                sj3.a5 a5Var2 = (sj3.a5) kVar3;
                int[] iArr = {a5Var2.B, a5Var2.C};
                layoutParams2.topMargin = iArr[1] - iArr[0];
            }
            frameLayout.setLayoutParams(layoutParams2);
            frameLayout.setVisibility(8);
        }
        com.tencent.mm.plugin.multitalk.model.k kVar4 = this.f150007g;
        if (kVar4 != null) {
            ((sj3.a5) kVar4).g();
        }
        com.tencent.mm.plugin.multitalk.model.k kVar5 = this.f150007g;
        if (kVar5 != null) {
            ((sj3.a5) kVar5).s();
        }
        this.f150017t = true;
        com.tencent.mm.plugin.multitalk.model.e3.Ri().getClass();
    }

    public final boolean j() {
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView;
        android.widget.FrameLayout frameLayout = this.f150005e;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            sj3.j jVar = this.f150008h;
            if ((jVar == null || (multitalkFrameView = jVar.f408577d) == null) ? false : multitalkFrameView.j()) {
                return true;
            }
        }
        return false;
    }

    public final void k(androidx.recyclerview.widget.RecyclerView talkingAvatarContainer, android.widget.FrameLayout talkingBigAvatarLayout, com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI mainUI, com.tencent.mm.plugin.multitalk.model.k uiCallback) {
        kotlin.jvm.internal.o.g(talkingAvatarContainer, "talkingAvatarContainer");
        kotlin.jvm.internal.o.g(talkingBigAvatarLayout, "talkingBigAvatarLayout");
        kotlin.jvm.internal.o.g(mainUI, "mainUI");
        kotlin.jvm.internal.o.g(uiCallback, "uiCallback");
        if (this.f150014q) {
            return;
        }
        this.f150007g = uiCallback;
        this.f150004d = talkingAvatarContainer;
        this.f150005e = talkingBigAvatarLayout;
        androidx.recyclerview.widget.f2 adapter = talkingAvatarContainer.getAdapter();
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.multitalk.ui.widget.AvatarLayoutAdapter");
        this.f150009i = (sj3.d) adapter;
        android.view.View inflate = android.view.LayoutInflater.from(mainUI).inflate(com.tencent.mm.R.layout.bvq, (android.view.ViewGroup) talkingBigAvatarLayout, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
        sj3.j jVar = new sj3.j(relativeLayout);
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView = (com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView) relativeLayout.findViewById(com.tencent.mm.R.id.nyi);
        jVar.f408577d = multitalkFrameView;
        if (multitalkFrameView != null) {
            multitalkFrameView.setIndex(0);
        }
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView2 = jVar.f408577d;
        if (multitalkFrameView2 != null) {
            multitalkFrameView2.setOnClickListener(this);
        }
        jVar.f408578e = relativeLayout.findViewById(com.tencent.mm.R.id.jcb);
        android.view.View findViewById = relativeLayout.findViewById(com.tencent.mm.R.id.p5h);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        jVar.f408579f = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = relativeLayout.findViewById(com.tencent.mm.R.id.jxj);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        jVar.f408580g = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = relativeLayout.findViewById(com.tencent.mm.R.id.ntr);
        kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        android.view.View findViewById4 = relativeLayout.findViewById(com.tencent.mm.R.id.im6);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
        jVar.f408582i = (android.widget.ImageView) findViewById4;
        relativeLayout.setTag(jVar);
        this.f150006f = relativeLayout;
        java.lang.Object tag = relativeLayout.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.multitalk.ui.widget.AvatarLayoutHolder");
        this.f150008h = (sj3.j) tag;
        talkingBigAvatarLayout.addView(this.f150006f);
        android.widget.RelativeLayout relativeLayout2 = this.f150006f;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
        talkingBigAvatarLayout.setVisibility(8);
        this.f150011n = new com.tencent.mm.plugin.multitalk.model.a(this);
        com.tencent.mm.plugin.multitalk.model.e3.Ri().o().f150028a = this.f150011n;
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[Catch: all -> 0x005d, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0021, B:12:0x004b, B:15:0x0052, B:17:0x0056), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void l(java.lang.String r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "wxUserName"
            kotlin.jvm.internal.o.g(r8, r0)     // Catch: java.lang.Throwable -> L5d
            com.tencent.mm.plugin.multitalk.model.v0 r0 = com.tencent.mm.plugin.multitalk.model.e3.Ri()     // Catch: java.lang.Throwable -> L5d
            com.tencent.mm.plugin.multitalk.model.k2 r0 = r0.o()     // Catch: java.lang.Throwable -> L5d
            int r0 = r0.c(r8)     // Catch: java.lang.Throwable -> L5d
            r1 = 102(0x66, float:1.43E-43)
            r2 = 1
            if (r9 != r2) goto L20
            r3 = 101(0x65, float:1.42E-43)
            if (r0 == r3) goto L1e
            if (r0 == r1) goto L1e
            goto L20
        L1e:
            r3 = 3
            goto L21
        L20:
            r3 = r9
        L21:
            java.lang.String r4 = "AvatarViewManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r5.<init>()     // Catch: java.lang.Throwable -> L5d
            r5.append(r8)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = " to state "
            r5.append(r6)     // Catch: java.lang.Throwable -> L5d
            r5.append(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5d
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L5d
            com.tencent.mm.sdk.platformtools.Log.c(r4, r5, r6)     // Catch: java.lang.Throwable -> L5d
            java.util.Map r4 = r7.f150016s     // Catch: java.lang.Throwable -> L5d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Throwable -> L5d
            yz5.l r3 = (yz5.l) r3     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L4e
            r3.invoke(r8)     // Catch: java.lang.Throwable -> L5d
        L4e:
            if (r9 != r2) goto L5b
            if (r0 != r1) goto L5b
            com.tencent.mm.plugin.multitalk.model.c0 r9 = r7.f150011n     // Catch: java.lang.Throwable -> L5d
            if (r9 == 0) goto L5b
            com.tencent.mm.plugin.multitalk.model.a r9 = (com.tencent.mm.plugin.multitalk.model.a) r9     // Catch: java.lang.Throwable -> L5d
            r9.a(r8)     // Catch: java.lang.Throwable -> L5d
        L5b:
            monitor-exit(r7)
            return
        L5d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.j.l(java.lang.String, int):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/model/AvatarViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = false;
        if (!j()) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView");
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView = (com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView) view;
            if (multitalkFrameView.getF150344m() == null) {
                com.tencent.mars.xlog.Log.e("AvatarViewManager", "videoview get null username");
                yj0.a.h(this, "com/tencent/mm/plugin/multitalk/model/AvatarViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            android.widget.FrameLayout frameLayout = this.f150005e;
            if (frameLayout != null && frameLayout.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                if (multitalkFrameView.j()) {
                    l(multitalkFrameView.getF150344m(), 3);
                    com.tencent.mm.plugin.multitalk.model.k kVar = this.f150007g;
                    if (kVar != null) {
                        ((sj3.a5) kVar).g();
                    }
                } else {
                    l(multitalkFrameView.getF150344m(), 1);
                    com.tencent.mm.plugin.multitalk.model.k kVar2 = this.f150007g;
                    if (kVar2 != null) {
                        ((sj3.a5) kVar2).g();
                    }
                }
            } else if (multitalkFrameView.j()) {
                l(multitalkFrameView.getF150344m(), 4);
                com.tencent.mm.plugin.multitalk.model.u0.f150147g++;
                com.tencent.mm.plugin.multitalk.model.k kVar3 = this.f150007g;
                if (kVar3 != null) {
                    sj3.a5 a5Var = (sj3.a5) kVar3;
                    wj3.a aVar = new wj3.a(a5Var.f408417d);
                    a5Var.S = aVar;
                    android.widget.RelativeLayout rootView = a5Var.R;
                    kotlin.jvm.internal.o.g(rootView, "rootView");
                    rootView.removeAllViews();
                    uj3.b0 b0Var = aVar.f446746e;
                    if (b0Var != null) {
                        b0Var.e(rootView);
                    }
                }
            } else {
                l(multitalkFrameView.getF150344m(), 2);
                com.tencent.mm.plugin.multitalk.model.k kVar4 = this.f150007g;
                if (kVar4 != null) {
                    ((sj3.a5) kVar4).g();
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/model/AvatarViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (this.f150017t) {
            com.tencent.mm.plugin.multitalk.model.k kVar5 = this.f150007g;
            if (kVar5 != null) {
                sj3.a5 a5Var2 = (sj3.a5) kVar5;
                if (a5Var2.M) {
                    android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                    android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation2.setDuration(150L);
                    alphaAnimation.setDuration(150L);
                    a5Var2.M = false;
                    a5Var2.f408423m.setAnimation(alphaAnimation2);
                    android.view.View view2 = a5Var2.f408423m;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a5Var2.f408418e.setAnimation(alphaAnimation2);
                    android.view.View view3 = a5Var2.f408418e;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView = a5Var2.H;
                    collapseView.setAnimation(alphaAnimation);
                    collapseView.setVisibility(4);
                    android.view.View view4 = a5Var2.f408431u;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(4);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view5 = a5Var2.f408432v;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            this.f150017t = false;
        } else {
            com.tencent.mm.plugin.multitalk.model.k kVar6 = this.f150007g;
            if (kVar6 != null) {
                ((sj3.a5) kVar6).s();
            }
            this.f150017t = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/model/AvatarViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
