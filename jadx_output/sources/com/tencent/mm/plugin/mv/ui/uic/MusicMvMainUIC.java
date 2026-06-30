package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class MusicMvMainUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: J, reason: collision with root package name */
    public static final java.lang.Object f150973J = new java.lang.Object();
    public int A;
    public final com.tencent.mm.plugin.mv.ui.uic.j2 B;
    public final com.tencent.mm.plugin.mv.ui.uic.m2 C;
    public final com.tencent.mm.sdk.event.IListener D;
    public final com.tencent.mm.modelbase.u0 E;
    public boolean F;
    public boolean G;
    public final mv2.w0 H;
    public final com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$finderCommentEventListener$1 I;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f150974d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f150975e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f150976f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f150977g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f150978h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f150979i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.music.player.base.k f150980m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.i f150981n;

    /* renamed from: o, reason: collision with root package name */
    public int f150982o;

    /* renamed from: p, reason: collision with root package name */
    public pk4.c f150983p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f150984q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f150985r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.view.layoutmanager.Flip3DLayoutManager f150986s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f150987t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f150988u;

    /* renamed from: v, reason: collision with root package name */
    public volatile fm3.l0 f150989v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f150990w;

    /* renamed from: x, reason: collision with root package name */
    public int f150991x;

    /* renamed from: y, reason: collision with root package name */
    public long f150992y;

    /* renamed from: z, reason: collision with root package name */
    public float f150993z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$finderCommentEventListener$1] */
    public MusicMvMainUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f150974d = "MicroMsg.Mv.MusicMvMainUIC";
        this.f150975e = "MicroMsg.Mv.GetLyric";
        this.f150977g = new java.util.ArrayList();
        this.f150978h = new java.util.ArrayList();
        this.f150979i = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.t1(this, activity));
        this.f150980m = new com.tencent.mm.plugin.mv.ui.uic.t2(this);
        this.f150981n = new com.tencent.mm.plugin.mv.ui.view.i();
        this.f150982o = -1;
        this.f150986s = new com.tencent.mm.view.layoutmanager.Flip3DLayoutManager(activity, 0, false);
        this.f150992y = -1L;
        this.f150993z = -1.0f;
        this.A = -1;
        this.B = new com.tencent.mm.plugin.mv.ui.uic.j2(this);
        this.C = new com.tencent.mm.plugin.mv.ui.uic.m2(this);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.D = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$musicListener$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                androidx.appcompat.app.AppCompatActivity activity2 = androidx.appcompat.app.AppCompatActivity.this;
                kotlin.jvm.internal.o.g(activity2, "activity");
                com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
                am.jk jkVar = event.f54512g;
                if (!n0Var.R6(jkVar.f7037c) || jkVar.f7036b != 0) {
                    return false;
                }
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this;
                lm3.e eVar = (lm3.e) kz5.n0.Z(musicMvMainUIC.f150977g);
                if (eVar != null) {
                    musicMvMainUIC.a7(eVar.f319482d);
                }
                musicMvMainUIC.b7();
                return false;
            }
        };
        this.E = new com.tencent.mm.plugin.mv.ui.uic.r2(activity, this);
        this.H = new com.tencent.mm.plugin.mv.ui.uic.a2(this, activity);
        this.I = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderCommentReportEvent>(a0Var) { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$finderCommentEventListener$1
            {
                this.__eventId = 1857469149;
            }

            /* JADX WARN: Code restructure failed: missing block: B:40:0x015d, code lost:
            
                if (r1 == null) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0170, code lost:
            
                r12 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x016e, code lost:
            
                if ((r1.getId() != 0) != false) goto L57;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.FinderCommentReportEvent r18) {
                /*
                    Method dump skipped, instructions count: 416
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$finderCommentEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
    }

    public static final fm3.u O6(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC, long j17, java.lang.String str) {
        java.util.Iterator it = musicMvMainUIC.f150977g.iterator();
        int i17 = 0;
        while (true) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = null;
            if (!it.hasNext()) {
                return null;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            lm3.e eVar = (lm3.e) next;
            fm3.u musicMv = eVar.f319482d;
            kotlin.jvm.internal.o.g(musicMv, "musicMv");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = musicMv.f264137q;
            if (finderObject2 != null) {
                if (!(finderObject2.getId() != 0)) {
                    finderObject2 = null;
                }
                if (finderObject2 != null) {
                    finderObject = finderObject2;
                    if (finderObject == null && finderObject.getId() == j17) {
                        if (kotlin.jvm.internal.o.b(finderObject.getObjectNonceId(), str)) {
                            com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "getMusicMv exist index:" + i17);
                            r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(musicMvMainUIC.getContext(), 7, r45.bt4.class);
                            if (bt4Var != null) {
                                bt4Var.f371036d = 11;
                            }
                            return eVar.f319482d;
                        }
                    }
                    i17 = i18;
                }
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = musicMv.f264140t;
            if (finderObject3 != null) {
                if (finderObject3.getId() != 0) {
                    finderObject = finderObject3;
                }
            }
            if (finderObject == null) {
            }
            i17 = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void P6(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r22, r45.h51 r23, int r24) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.P6(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC, r45.h51, int):void");
    }

    public static final void Q6(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC, int i17) {
        boolean z17;
        pk4.c cVar;
        java.lang.Long l17;
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.e(musicMvMainUIC.f150974d, "refreshVideo position error:" + i17);
            return;
        }
        if (((lm3.e) musicMvMainUIC.f150977g.get(i17)).f319482d.f264127g.size() == 0 && ((lm3.e) musicMvMainUIC.f150977g.get(i17)).f319482d.f264128h.size() == 0) {
            com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "refreshVideo " + i17 + " trackDataList empty");
            return;
        }
        if (!fm3.u.A.e(((lm3.e) musicMvMainUIC.f150977g.get(i17)).f319482d) && (((lm3.e) musicMvMainUIC.f150977g.get(i17)).f319482d.f264121a == null || ((l17 = ((lm3.e) musicMvMainUIC.f150977g.get(i17)).f319482d.f264121a) != null && l17.longValue() == 0))) {
            com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "no mv");
            return;
        }
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(musicMvMainUIC.getContext(), 7, r45.bt4.class);
        if (bt4Var != null) {
            bt4Var.f371042m = 2;
        }
        r45.bt4 bt4Var2 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(musicMvMainUIC.getActivity(), 7, r45.bt4.class);
        if (bt4Var2 != null) {
            bt4Var2.f371043n = 2;
        }
        com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "refreshVideo, position:" + i17 + ", lastPos:" + musicMvMainUIC.f150982o);
        musicMvMainUIC.R6();
        java.lang.String str = musicMvMainUIC.f150974d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshVideo, videoLayout.parent:");
        java.lang.Object obj = musicMvMainUIC.f150983p;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        sb6.append(view != null ? view.getParent() : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        int i18 = musicMvMainUIC.f150982o;
        if (i18 == i17 || i18 < 0) {
            z17 = false;
        } else {
            if (musicMvMainUIC.f150989v != null && (cVar = musicMvMainUIC.f150983p) != null) {
                cVar.getCurrentPositionMs();
            }
            z17 = !kl3.t.g().a().i();
            java.lang.Object obj2 = musicMvMainUIC.f150983p;
            android.view.View view2 = obj2 instanceof android.view.View ? (android.view.View) obj2 : null;
            java.util.Objects.toString(view2 != null ? view2.getParent() : null);
            pk4.c cVar2 = musicMvMainUIC.f150983p;
            if (cVar2 != null) {
                ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar2).a();
            }
            java.lang.Object obj3 = musicMvMainUIC.f150983p;
            android.view.View view3 = obj3 instanceof android.view.View ? (android.view.View) obj3 : null;
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) (view3 != null ? view3.getParent() : null);
            if (viewGroup != null) {
                java.lang.Object obj4 = musicMvMainUIC.f150983p;
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type android.view.View");
                viewGroup.removeView((android.view.View) obj4);
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = musicMvMainUIC.f150976f;
        androidx.recyclerview.widget.k3 p07 = wxRecyclerView != null ? wxRecyclerView.p0(i17) : null;
        if (p07 != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) p07.itemView.findViewById(com.tencent.mm.R.id.oy7);
            java.lang.Object obj5 = musicMvMainUIC.f150983p;
            android.view.View view4 = obj5 instanceof android.view.View ? (android.view.View) obj5 : null;
            if ((view4 != null ? view4.getParent() : null) == null) {
                java.lang.Object obj6 = musicMvMainUIC.f150983p;
                android.view.View view5 = obj6 instanceof android.view.View ? (android.view.View) obj6 : null;
                if (view5 != null) {
                    view5.setId(com.tencent.mm.R.id.k0o);
                }
                com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "refreshVideo add videoLayout to current videoContainer");
                java.lang.Object obj7 = musicMvMainUIC.f150983p;
                kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type android.view.View");
                frameLayout.addView((android.view.View) obj7);
                java.lang.Object obj8 = musicMvMainUIC.f150983p;
                android.view.View view6 = obj8 instanceof android.view.View ? (android.view.View) obj8 : null;
                if (view6 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    android.view.View view7 = view6;
                    yj0.a.d(view7, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "refreshVideo", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view6.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "refreshVideo", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            if (musicMvMainUIC.f150982o >= 0) {
                fm3.j0 j0Var = fm3.j0.f264078a;
                androidx.appcompat.app.AppCompatActivity activity = musicMvMainUIC.getActivity();
                fm3.u uVar = ((lm3.e) musicMvMainUIC.f150977g.get(musicMvMainUIC.f150982o)).f319482d;
                pk4.c cVar3 = musicMvMainUIC.f150983p;
                j0Var.l(activity, uVar, cVar3 != null ? cVar3.getReportInfo() : null);
            }
            com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "refreshVideo current music position:" + kl3.t.g().a().a());
            fm3.u uVar2 = ((lm3.e) musicMvMainUIC.f150977g.get(i17)).f319482d;
            pk4.c cVar4 = musicMvMainUIC.f150983p;
            if (cVar4 != null) {
                cVar4.setMediaList(uVar2.a());
            }
            pk4.c cVar5 = musicMvMainUIC.f150983p;
            if (cVar5 != null) {
                cVar5.setFirstFrameRenderCallback(new com.tencent.mm.plugin.mv.ui.uic.v2(musicMvMainUIC));
            }
            pk4.c cVar6 = musicMvMainUIC.f150983p;
            if (cVar6 != null) {
                cVar6.setPlayStatusChangeListener(new com.tencent.mm.plugin.mv.ui.uic.w2(uVar2));
            }
            pk4.c cVar7 = musicMvMainUIC.f150983p;
            if (cVar7 != null) {
                ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar7).f();
            }
            kl3.t.g().a().a();
            pk4.c cVar8 = musicMvMainUIC.f150983p;
            if (cVar8 != null) {
                cVar8.setPauseOnVideoPlay(z17);
            }
            java.lang.Object obj9 = musicMvMainUIC.f150983p;
            android.view.View view8 = obj9 instanceof android.view.View ? (android.view.View) obj9 : null;
            if (view8 == null) {
                return;
            }
            view8.setKeepScreenOn(true);
        }
    }

    public final void R6() {
        if (this.f150983p == null) {
            df0.t tVar = (df0.t) i95.n0.c(df0.t.class);
            androidx.appcompat.app.AppCompatActivity context = getActivity();
            ((cf0.c0) tVar).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout multiMediaEffectVideoLayout = new com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout(context);
            this.f150983p = multiMediaEffectVideoLayout;
            multiMediaEffectVideoLayout.setMvMusicProxy(new com.tencent.mm.plugin.mv.ui.uic.u1());
            java.lang.Object obj = this.f150983p;
            android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
            if (view != null) {
                view.setId(com.tencent.mm.R.id.k0o);
            }
        }
        pk4.c cVar = this.f150983p;
        if (cVar == null) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        cVar.setMediaChangeListener(((com.tencent.mm.plugin.mv.ui.uic.e1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.e1.class)).f151110h);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int S6(r45.hf2 r13, com.tencent.mm.pluginsdk.model.app.a5 r14) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.S6(r45.hf2, com.tencent.mm.pluginsdk.model.app.a5):int");
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter T6() {
        return (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((jz5.n) this.f150979i).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0081, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(long r11, java.lang.String r13, fm3.u r14) {
        /*
            r10 = this;
            java.lang.String r0 = "mvNonceId"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = "musicMv"
            kotlin.jvm.internal.o.g(r14, r0)
            java.lang.String r0 = r10.f150974d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getMvDetailInfo mvObjectId:"
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r2 = " mvNonceId:"
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = " localId:"
            r1.append(r2)
            java.lang.Long r2 = r14.f264121a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            fm3.y r0 = fm3.y.f264161a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "tryGetCacheFinderFeedDetail, feedId:"
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r2 = ", nonceId:"
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.Mv.MusicMvCgiRetCache"
            com.tencent.mars.xlog.Log.i(r2, r1)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r3 = android.os.SystemClock.elapsedRealtime()
            java.util.HashMap r1 = fm3.y.f264162b
            fm3.f r5 = new fm3.f
            r5.<init>(r11, r13)
            java.lang.Object r1 = r1.get(r5)
            fm3.e r1 = (fm3.e) r1
            r5 = 0
            if (r1 == 0) goto L83
            long r6 = r1.f264044b
            long r6 = r3 - r6
            r8 = 180000(0x2bf20, double:8.8932E-319)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L77
            java.lang.String r0 = "tryGetCacheFinderFeedDetail success from cache"
            com.tencent.mars.xlog.Log.i(r2, r0)
            r45.h51 r0 = r1.f264043a
            goto L81
        L77:
            java.lang.String r1 = "tryGetCacheFinderFeedDetail failed timeout"
            com.tencent.mars.xlog.Log.i(r2, r1)
            r0.a(r3)
            r0 = r5
        L81:
            if (r0 != 0) goto L8a
        L83:
            java.lang.String r0 = "tryGetCacheFinderFeedDetail not found"
            com.tencent.mars.xlog.Log.i(r2, r0)
            r0 = r5
        L8a:
            if (r0 == 0) goto La0
            java.lang.String r1 = r10.f150974d
            java.lang.String r2 = "getMvDetailInfo hit cache"
            com.tencent.mars.xlog.Log.i(r1, r2)
            ku5.u0 r1 = ku5.t0.f312615d
            com.tencent.mm.plugin.mv.ui.uic.b2 r2 = new com.tencent.mm.plugin.mv.ui.uic.b2
            r2.<init>(r10, r0, r14)
            ku5.t0 r1 = (ku5.t0) r1
            wu5.c r5 = r1.B(r2)
        La0:
            if (r5 != 0) goto Lbd
            com.tencent.mm.modelbase.r1 r0 = gm0.j1.d()
            hm3.m r7 = new hm3.m
            int r5 = r14.hashCode()
            androidx.appcompat.app.AppCompatActivity r14 = r10.getActivity()
            int r6 = r14.hashCode()
            r1 = r7
            r2 = r11
            r4 = r13
            r1.<init>(r2, r4, r5, r6)
            r0.g(r7)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.U6(long, java.lang.String, fm3.u):void");
    }

    public final void V6() {
        boolean z17 = this.F;
        java.lang.String str = this.f150974d;
        if (!z17 || !this.G) {
            com.tencent.mars.xlog.Log.e(str, "con is not satisfy, don't do getUniInfo");
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a17;
        if (!(n0Var.A.length() == 0)) {
            if (!(n0Var.B.length() == 0)) {
                com.tencent.mars.xlog.Log.i(str, "getUniInfo");
                gm0.j1.d().g(new hm3.e(n0Var.A, n0Var.B, getActivity().hashCode()));
                return;
            }
        }
        T6().notifyItemChanged(0, "NotPermittedSong");
        com.tencent.mars.xlog.Log.e(str, "NotPermittedSong");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6(r45.es4 r24) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.W6(r45.es4):void");
    }

    public final void X6(int i17) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a17;
        lm3.e eVar = (lm3.e) kz5.n0.a0(this.f150977g, this.f150982o);
        if (eVar != null) {
            fm3.j0.f264078a.e(getContext(), n0Var.f151310i, eVar.f319482d);
        }
        Y6(n0Var);
    }

    public final void Y6(com.tencent.mm.plugin.mv.ui.uic.n0 n0Var) {
        lm3.e eVar;
        java.lang.String e17;
        java.lang.String sessionBuffer;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        fm3.l0 l0Var = this.f150989v;
        if (l0Var == null || (eVar = (lm3.e) kz5.n0.a0(this.f150977g, this.f150982o)) == null) {
            return;
        }
        android.app.Activity context = getContext();
        r45.hf2 songInfo = n0Var.f151310i;
        fm3.u musicMv = eVar.f319482d;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        kotlin.jvm.internal.o.g(musicMv, "musicMv");
        r45.vd6 vd6Var = new r45.vd6();
        java.lang.Long l17 = musicMv.f264123c;
        vd6Var.set(0, java.lang.Long.valueOf(l17 != null ? l17.longValue() : 0L));
        vd6Var.set(4, musicMv.f264124d);
        vd6Var.set(2, new r45.yw6());
        vd6Var.set(3, new r45.q25());
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = musicMv.f264137q;
        vd6Var.set(13, java.lang.Integer.valueOf((finderObject == null || (objectDesc = finderObject.getObjectDesc()) == null) ? 0 : objectDesc.getMediaType()));
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = musicMv.f264137q;
        java.lang.String str = "";
        if ((finderObject2 == null || (e17 = finderObject2.getUsername()) == null) && (e17 = xy2.c.e(context)) == null) {
            e17 = "";
        }
        vd6Var.set(5, e17);
        long j17 = l0Var.f264089b;
        vd6Var.set(6, java.lang.Long.valueOf(j17));
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = musicMv.f264137q;
        if (finderObject3 != null && (sessionBuffer = finderObject3.getSessionBuffer()) != null) {
            str = sessionBuffer;
        }
        vd6Var.set(8, str);
        vd6Var.set(16, java.lang.Long.valueOf(j17));
        long c17 = c01.id.c();
        r45.yw6 yw6Var = (r45.yw6) vd6Var.getCustom(2);
        if (yw6Var != null) {
            yw6Var.set(0, java.lang.Integer.valueOf(songInfo.getInteger(14)));
            long j18 = c17 - j17;
            yw6Var.set(1, java.lang.Integer.valueOf((int) (j18 / 1000)));
            yw6Var.set(2, java.lang.Long.valueOf(j18));
            yw6Var.set(3, java.lang.Long.valueOf(musicMv.f264143w));
            yw6Var.set(4, java.lang.Long.valueOf(musicMv.f264143w));
            yw6Var.set(5, java.lang.Long.valueOf(yw6Var.getLong(2)));
            yw6Var.set(6, java.lang.Long.valueOf(j17));
            yw6Var.set(7, java.lang.Long.valueOf(c17));
            yw6Var.set(9, java.lang.Long.valueOf(musicMv.f264144x));
        }
        r45.q25 q25Var = (r45.q25) vd6Var.getCustom(3);
        if (q25Var != null) {
            q25Var.set(1, java.lang.Integer.valueOf(l0Var.f264091d));
            r45.yw6 yw6Var2 = (r45.yw6) vd6Var.getCustom(2);
            q25Var.set(2, java.lang.Integer.valueOf(yw6Var2 != null ? yw6Var2.getInteger(1) : 0));
            q25Var.set(14, java.lang.Integer.valueOf(l0Var.f264090c));
            q25Var.set(3, java.lang.Integer.valueOf(l0Var.f264092e));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvReportLogic", "print stats: " + vd6Var + " index:" + l0Var.f264088a);
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        r45.qt2 qt2Var = new r45.qt2();
        if (bt4Var != null) {
            qt2Var.set(1, bt4Var.f371037e);
            qt2Var.set(5, 91);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(vd6Var);
        com.tencent.mm.plugin.finder.report.w4.f125422a.b(linkedList, qt2Var, 0);
    }

    public final void Z6(int i17) {
        com.tencent.mm.plugin.mv.ui.view.i iVar = this.f150981n;
        if (i17 == iVar.f151864m) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f150974d, "scrollMvToPosition:" + i17 + ", snapPosition:" + iVar.f151864m + ", dataList.size:" + this.f150977g.size());
        this.f150986s.f213605w = true;
        if (i17 > iVar.f151864m) {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f150976f;
            if (wxRecyclerView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17 - 1));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "scrollMvToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                wxRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "scrollMvToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            }
        } else {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f150976f;
            if (wxRecyclerView2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i17 + 1));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(wxRecyclerView2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "scrollMvToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                wxRecyclerView2.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(wxRecyclerView2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "scrollMvToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f150976f;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.post(new com.tencent.mm.plugin.mv.ui.uic.y2(this, i17));
        }
    }

    public final void a7(fm3.u musicMv) {
        kotlin.jvm.internal.o.g(musicMv, "musicMv");
        int duration = kl3.t.g().a().getDuration();
        com.tencent.mm.sdk.event.IListener iListener = this.D;
        java.lang.String str = this.f150974d;
        if (duration == 0) {
            com.tencent.mars.xlog.Log.i(str, "wait song start");
            iListener.alive();
            return;
        }
        iListener.dead();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.hf2 hf2Var = ((com.tencent.mm.plugin.mv.ui.uic.n0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).f151310i;
        hf2Var.set(14, java.lang.Integer.valueOf(duration));
        com.tencent.mars.xlog.Log.i(str, "syncBeatTrack songId:" + hf2Var.getString(5) + " songName:" + hf2Var.getString(0) + " singer:" + hf2Var.getString(1) + " musicTotalDuration:" + duration);
        gm0.j1.d().g(new hm3.j(hf2Var, duration, musicMv.hashCode(), getActivity().hashCode()));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b7() {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.b7():void");
    }

    public final void c7(int i17) {
        fm3.u uVar;
        ka0.h0 h0Var = (ka0.h0) i95.n0.c(ka0.h0.class);
        android.content.Intent intent = getActivity().getIntent();
        android.os.Bundle extras = intent != null ? intent.getExtras() : null;
        ((ja0.c0) h0Var).getClass();
        ll3.q0.f(extras);
        lm3.e eVar = (lm3.e) kz5.n0.a0(this.f150977g, i17);
        if (eVar == null || (uVar = eVar.f319482d) == null) {
            return;
        }
        ka0.h0 h0Var2 = (ka0.h0) i95.n0.c(ka0.h0.class);
        r45.xs4 xs4Var = new r45.xs4();
        if (!uVar.f264146z) {
            java.lang.Long l17 = uVar.f264123c;
            xs4Var.set(0, pm0.v.u(l17 != null ? l17.longValue() : 0L));
            xs4Var.set(1, uVar.f264124d);
            xs4Var.set(2, uVar.f264125e);
            xs4Var.set(3, uVar.f264126f);
        }
        ((ja0.c0) h0Var2).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicFloatBallManager", "updateMusicMvInfo objectId: %s, nonceId: %s", xs4Var.getString(0), xs4Var.getString(1));
        if (ll3.q0.f319211b) {
            ll3.b1.f319140a.getClass();
            ll3.e1 e1Var = ll3.b1.f319141b;
            r45.xs4 xs4Var2 = e1Var.f319155s;
            if (xs4Var2 != null) {
                xs4Var2.set(0, xs4Var.getString(0));
                xs4Var2.set(1, xs4Var.getString(1));
                xs4Var2.set(2, xs4Var.getString(2));
                xs4Var2.set(3, xs4Var.getString(3));
            }
            android.os.Bundle bundle = e1Var.f319153q;
            if (bundle != null) {
                java.lang.String string = xs4Var.getString(0);
                if (string == null) {
                    string = "";
                }
                bundle.putString("key_mv_feed_id", string);
                java.lang.String string2 = xs4Var.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                bundle.putString("key_mv_nonce_id", string2);
                java.lang.String string3 = xs4Var.getString(2);
                if (string3 == null) {
                    string3 = "";
                }
                bundle.putString("key_mv_cover_url", string3);
                java.lang.String string4 = xs4Var.getString(3);
                bundle.putString("key_mv_poster", string4 != null ? string4 : "");
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.modelbase.u0 u0Var = this.E;
        d17.a(6860, u0Var);
        gm0.j1.d().a(3763, u0Var);
        gm0.j1.d().a(5292, u0Var);
        gm0.j1.d().a(5904, u0Var);
        gm0.j1.d().a(5286, u0Var);
        gm0.j1.d().a(3627, u0Var);
        gm0.j1.d().a(6448, u0Var);
        gm0.j1.d().a(6473, u0Var);
        gm0.j1.d().a(8967, u0Var);
        gm0.j1.d().a(8167, u0Var);
        gm0.j1.d().a(8141, u0Var);
        gm0.j1.d().a(5950, u0Var);
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f331561a.a(this.H);
        alive();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023d  */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateAfter(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.onCreateAfter(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        fm3.u uVar;
        com.tencent.mars.xlog.Log.i(this.f150974d, "onDestroy");
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f331561a.t(this.H);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.modelbase.u0 u0Var = this.E;
        d17.q(6860, u0Var);
        gm0.j1.d().q(3763, u0Var);
        gm0.j1.d().q(5292, u0Var);
        gm0.j1.d().q(5904, u0Var);
        gm0.j1.d().q(5286, u0Var);
        gm0.j1.d().q(3627, u0Var);
        gm0.j1.d().q(6448, u0Var);
        gm0.j1.d().q(6473, u0Var);
        gm0.j1.d().q(8967, u0Var);
        gm0.j1.d().q(8167, u0Var);
        gm0.j1.d().q(8141, u0Var);
        gm0.j1.d().q(5950, u0Var);
        pk4.c cVar = this.f150983p;
        if (cVar != null) {
            ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).b();
        }
        this.D.dead();
        this.f150984q = false;
        dead();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a17;
        lm3.e eVar = (lm3.e) kz5.n0.a0(this.f150977g, this.f150982o);
        if (eVar != null && (uVar = eVar.f319482d) != null) {
            fm3.j0 j0Var = fm3.j0.f264078a;
            j0Var.e(getContext(), n0Var.f151310i, uVar);
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            pk4.c cVar2 = this.f150983p;
            j0Var.l(activity2, uVar, cVar2 != null ? cVar2.getReportInfo() : null);
        }
        Y6(n0Var);
        if (b21.m.c()) {
            return;
        }
        b21.m.j();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        byte[] byteArrayExtra;
        if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("key_track_data")) == null) {
            return;
        }
        r45.ss4 ss4Var = new r45.ss4();
        ss4Var.parseFrom(byteArrayExtra);
        fm3.u a17 = fm3.u.A.a(ss4Var);
        com.tencent.mm.plugin.finder.storage.FinderItem f17 = cu2.u.f222441a.f(ss4Var.getLong(4));
        if (f17 != null) {
            if (f17.isPostFailed()) {
                a17.f264136p = 3;
            } else if (f17.isPostFinish()) {
                a17.f264136p = 1;
            } else {
                a17.f264136p = 2;
            }
        }
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getContext(), 7, r45.bt4.class);
        if (bt4Var != null) {
            bt4Var.f371036d = 14;
        }
        kl3.t.g().a().c(0);
        com.tencent.mars.xlog.Log.i(this.f150974d, "onNewIntent mvLocalId:" + a17.f264121a + " coverPath:" + a17.f264122b + " mvPostStatus:" + a17.f264136p);
        this.f150984q = false;
        this.f150977g.add(0, new lm3.e(a17));
        T6().notifyDataSetChanged();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f150976f;
        if (wxRecyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "scrollToPosition", "(I)V");
            wxRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        pk4.c cVar = this.f150983p;
        if (cVar != null) {
            ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).a();
        }
        this.f150984q = true;
        com.tencent.mars.xlog.Log.i(this.f150974d, "onPause");
        kl3.t.g().f(this.f150980m);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean g17 = ep1.m.g(((com.tencent.mm.plugin.mv.ui.uic.y0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.mv.ui.uic.y0.class)).getActivity().getIntent());
        java.lang.String str = "onResume, needResumePosition:" + this.f150984q + ", isJumpToApp:" + this.f150985r + ", fromFloatBall: " + g17;
        java.lang.String str2 = this.f150974d;
        com.tencent.mars.xlog.Log.i(str2, str);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a17;
        b21.r j17 = kl3.t.g().j();
        if (!n0Var.R6(j17)) {
            com.tencent.mars.xlog.Log.i(str2, "onResume different music firstTimeEnterMusicId:" + n0Var.f151308g + ' ');
            com.tencent.mm.plugin.finder.storage.oa0 oa0Var = com.tencent.mm.plugin.finder.storage.oa0.f127302a;
            r45.hf2 hf2Var = n0Var.f151310i;
            java.lang.String str3 = n0Var.f151308g;
            if (str3 == null && (str3 = hf2Var.getString(5)) == null) {
                str3 = "";
            }
            java.lang.Integer num = n0Var.f151307f;
            int intValue = num != null ? num.intValue() : 0;
            java.lang.String str4 = n0Var.f151309h.f264125e;
            oa0Var.d(hf2Var, str3, intValue, str4 != null ? str4 : "");
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f150976f;
            if (wxRecyclerView != null) {
                wxRecyclerView.post(new com.tencent.mm.plugin.mv.ui.uic.n2(this));
            }
        } else if (this.f150984q || this.f150985r || g17) {
            com.tencent.mars.xlog.Log.i(str2, "onResume same music " + j17.f17346e + ' ' + j17.f17345d + ", musicPlayer.isPlaying:" + kl3.t.g().a().i());
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f150976f;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.post(new com.tencent.mm.plugin.mv.ui.uic.o2(this, g17));
            }
        }
        this.f150984q = false;
        kl3.t g18 = kl3.t.g();
        com.tencent.mm.plugin.music.player.base.k kVar = this.f150980m;
        rl3.b bVar = (rl3.b) g18.a();
        if (kVar == null) {
            bVar.getClass();
        } else {
            java.util.LinkedList linkedList = bVar.f397235j;
            if (!linkedList.contains(kVar)) {
                linkedList.add(kVar);
            }
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        androidx.lifecycle.c1 a18 = zVar.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        if (((com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC) a18).f151002g) {
            java.lang.String AppId = j17.f17358t;
            kotlin.jvm.internal.o.f(AppId, "AppId");
            java.lang.String mid = j17.P;
            kotlin.jvm.internal.o.f(mid, "mid");
            if (com.tencent.mm.sdk.platformtools.t8.K0(mid)) {
                return;
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            r45.as4 as4Var = new r45.as4();
            as4Var.f370240d = AppId;
            as4Var.f370241e = mid;
            linkedList2.add(as4Var);
            gm0.j1.d().g(new hm3.f(linkedList2));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i(this.f150974d, "onStart: ");
        pk4.c cVar = this.f150983p;
        if (cVar != null) {
            cVar.setMute(true);
        }
        pk4.c cVar2 = this.f150983p;
        if (cVar2 != null) {
            ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar2).f();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i(this.f150974d, "onStop");
        pk4.c cVar = this.f150983p;
        if (cVar != null) {
            ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).g();
        }
    }
}
