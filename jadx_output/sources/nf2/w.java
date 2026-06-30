package nf2;

/* loaded from: classes10.dex */
public final class w extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public nf2.d1 f336808m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f336809n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f336810o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f336811p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r2 f336812q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f336813r;

    /* renamed from: s, reason: collision with root package name */
    public int f336814s;

    /* renamed from: t, reason: collision with root package name */
    public int f336815t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Boolean f336816u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f336817v;

    /* renamed from: w, reason: collision with root package name */
    public nf2.f1 f336818w;

    /* renamed from: x, reason: collision with root package name */
    public r45.z22 f336819x;

    /* renamed from: y, reason: collision with root package name */
    public kotlinx.coroutines.r2 f336820y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f336821z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f336809n = jz5.h.b(new nf2.i(this));
        this.f336814s = -1;
        this.f336815t = -1;
        this.f336818w = new nf2.f1(0, 0.0f, false, 0L, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, nf2.a.f336648e, nf2.k1.f336767d, null, 0L, null, 237567, null);
    }

    public final mm2.m6 Z6() {
        return (mm2.m6) ((jz5.n) this.f336809n).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(mm2.j6 r25) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nf2.w.a7(mm2.j6):void");
    }

    public final void b7() {
        nf2.d1 d1Var = this.f336808m;
        if (d1Var != null) {
            android.view.View view = d1Var.f336684e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView = d1Var.f336698s;
            if (finderLiveNormalRoomLyricsRenderView != null) {
                finderLiveNormalRoomLyricsRenderView.i();
            }
            com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "stopRender");
            com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "hide");
        }
    }

    public final void c7(boolean z17) {
        com.tencent.mm.plugin.finder.live.view.ub ubVar;
        if (this.f336821z) {
            kotlinx.coroutines.r2 r2Var = this.f336820y;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f336820y = null;
            this.f336821z = false;
            nf2.d1 d1Var = this.f336808m;
            if (d1Var != null) {
                com.tencent.mm.view.MMPAGView mMPAGView = d1Var.f336702w;
                if (mMPAGView != null) {
                    mMPAGView.n();
                }
                com.tencent.mm.view.MMPAGView mMPAGView2 = d1Var.f336702w;
                if (mMPAGView2 != null) {
                    mMPAGView2.setVisibility(8);
                }
                android.view.View view = d1Var.f336701v;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "hideGestureEducation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "hideGestureEducation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (!z17 || (ubVar = this.f291099e) == null) {
                return;
            }
            ubVar.onPluginAlphaModify(0.3f, 1.0f);
        }
    }

    public final boolean d7() {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var;
        yg2.b viewScope;
        yg2.b viewScope2;
        if (this.f336808m != null) {
            return true;
        }
        java.lang.Object obj = this.f291099e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveLyricsController", "initLyricsView: pluginLayout is null or not View");
            return false;
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.tkp);
        if (frameLayout == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveLyricsController", "initLyricsView: lyrics container not found");
            return false;
        }
        if (dk2.ef.f233384g) {
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            nf2.f1 f1Var = new nf2.f1(0, 0.0f, false, 0L, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, nf2.a.f336648e, nf2.k1.f336767d, null, 0L, null, 237567, null);
            this.f336818w = f1Var;
            com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
            k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
            if (k0Var != null && (viewScope2 = k0Var.getViewScope()) != null) {
                this.f336808m = new nf2.d1(context, frameLayout, f1Var, viewScope2);
                h7(f1Var);
                nf2.d1 d1Var = this.f336808m;
                if (d1Var != null) {
                    nf2.b bVar = new nf2.b(this);
                    d1Var.H = bVar;
                    nf2.d0 d0Var = d1Var.C;
                    if (d0Var != null) {
                        d0Var.f336677l = bVar;
                    }
                }
                if (d1Var != null) {
                    d1Var.I = new nf2.c(this);
                    d1Var.h();
                }
                nf2.d1 d1Var2 = this.f336808m;
                if (d1Var2 == null) {
                    return true;
                }
                d1Var2.g(true);
                return true;
            }
        } else {
            android.content.Context context2 = view.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            r45.g94 g94Var = (r45.g94) ((kotlinx.coroutines.flow.h3) Z6().f329240J).getValue();
            r45.f94 f94Var = g94Var != null ? g94Var.f375020h : null;
            boolean z17 = f94Var != null ? f94Var.f374112d : false;
            java.lang.String str = f94Var != null ? f94Var.f374113e : null;
            nf2.a aVar = z17 ? nf2.a.f336649f : nf2.a.f336648e;
            nf2.k1 k1Var = z17 ? nf2.k1.f336768e : nf2.k1.f336767d;
            nf2.l1 e76 = e7(str);
            this.f336816u = java.lang.Boolean.valueOf(z17);
            this.f336817v = str;
            nf2.f1 a17 = nf2.f1.a(new nf2.f1(0, 0.0f, false, 0L, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, aVar, k1Var, null, 0L, null, 237547, null), 0, 0.0f, false, 0L, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, 0L, e76, 131071, null);
            this.f336818w = a17;
            com.tencent.mm.plugin.finder.live.view.ub ubVar2 = this.f291099e;
            k0Var = ubVar2 instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar2 : null;
            if (k0Var != null && (viewScope = k0Var.getViewScope()) != null) {
                nf2.d1 d1Var3 = new nf2.d1(context2, frameLayout, a17, viewScope);
                this.f336808m = d1Var3;
                d1Var3.i(true);
                r45.g94 g94Var2 = (r45.g94) ((kotlinx.coroutines.flow.h3) Z6().f329240J).getValue();
                if (g94Var2 == null) {
                    return true;
                }
                r45.e94 e94Var = g94Var2.f375019g;
                int i17 = e94Var != null ? e94Var.f373162d : 50;
                int i18 = e94Var != null ? e94Var.f373163e : 18;
                this.f336814s = i17;
                this.f336815t = i18;
                nf2.d1 d1Var4 = this.f336808m;
                if (d1Var4 == null) {
                    return true;
                }
                d1Var4.l(i17 / 100.0f, i18 / 100.0f);
                return true;
            }
        }
        return false;
    }

    public final nf2.l1 e7(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return nf2.l1.f336772e;
        }
        if (str.length() != 9 || !r26.i0.y(str, "#", false)) {
            return nf2.l1.f336772e;
        }
        int O = zl2.q4.f473933a.O(str);
        kz5.h hVar = (kz5.h) nf2.l1.f336774g;
        hVar.getClass();
        kz5.e eVar = new kz5.e(hVar);
        while (eVar.hasNext()) {
            nf2.l1 l1Var = (nf2.l1) eVar.next();
            if (l1Var.f336775d == O) {
                return l1Var;
            }
        }
        return nf2.l1.f336772e;
    }

    public final void f7(int i17, java.lang.Integer num) {
        int i18;
        if (dk2.ef.f233384g) {
            int ordinal = this.f336818w.f336732n.ordinal();
            if (ordinal == 0) {
                i18 = 1;
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                i18 = 2;
            }
            java.lang.String color = Z6().D;
            kotlin.jvm.internal.o.g(color, "color");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Map l17 = kz5.c1.l(new jz5.l("type", java.lang.String.valueOf(i17)), new jz5.l("arrangement", java.lang.String.valueOf(i18)), new jz5.l("color", color));
            if (num != null) {
                l17.put("close_type", num.toString());
            }
            if (i17 == 1) {
                long j17 = te2.a9.f417885c;
                l17.put("duration", java.lang.String.valueOf((int) java.lang.Math.rint((j17 > 0 ? java.lang.Float.valueOf(((float) (currentTimeMillis - j17)) / 1000.0f) : 0).doubleValue())));
            }
            if (i17 == 3) {
                te2.a9.f417885c = currentTimeMillis;
            }
            ml2.z4 z4Var = ml2.z4.A2;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, z4Var, new org.json.JSONObject(l17).toString(), null, 4, null);
        }
    }

    public final void g7() {
        kotlinx.coroutines.r2 r2Var = this.f336810o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f336810o = null;
        kotlinx.coroutines.r2 r2Var2 = this.f336811p;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        this.f336811p = null;
        kotlinx.coroutines.r2 r2Var3 = this.f336812q;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        this.f336812q = null;
    }

    public final void h7(nf2.f1 f1Var) {
        boolean z17 = f1Var.f336732n == nf2.a.f336649f;
        java.lang.Object obj = this.f291099e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if ((view != null ? view.getContext() : null) == null) {
            return;
        }
        nf2.l1 l1Var = f1Var.f336736r;
        l1Var.getClass();
        zl2.q4 q4Var = zl2.q4.f473933a;
        int i17 = l1Var.f336775d;
        java.lang.String format = java.lang.String.format("#%02X%02X%02X%02X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((i17 >> 16) & 255), java.lang.Integer.valueOf((i17 >> 8) & 255), java.lang.Integer.valueOf(i17 & 255), java.lang.Integer.valueOf((i17 >> 24) & 255)}, 4));
        kotlin.jvm.internal.o.f(format, "format(...)");
        mm2.m6 Z6 = Z6();
        Z6.getClass();
        Z6.C = z17;
        Z6.D = format;
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        nf2.d1 d1Var = this.f336808m;
        if (d1Var != null) {
            com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView = d1Var.f336698s;
            if (finderLiveNormalRoomLyricsRenderView != null) {
                finderLiveNormalRoomLyricsRenderView.i();
            }
            com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "stopRender");
        }
        this.f336813r = false;
        b7();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        super.onLiveEnd();
        if (this.f336813r) {
            nf2.d1 d1Var = this.f336808m;
            if (d1Var != null) {
                com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView = d1Var.f336698s;
                if (finderLiveNormalRoomLyricsRenderView != null) {
                    finderLiveNormalRoomLyricsRenderView.i();
                }
                com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "stopRender");
            }
            this.f336813r = false;
            b7();
            f7(1, 3);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        g7();
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsController", "startObserving: isAnchorMode=" + dk2.ef.f233384g);
        this.f336810o = com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new nf2.s(this, null), 3, null);
        if (dk2.ef.f233384g) {
            this.f336811p = com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new nf2.q(this, null), 3, null);
        } else {
            this.f336812q = com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new nf2.u(this, null), 3, null);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        g7();
        nf2.d1 d1Var = this.f336808m;
        if (d1Var != null) {
            com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView = d1Var.f336698s;
            if (finderLiveNormalRoomLyricsRenderView != null) {
                finderLiveNormalRoomLyricsRenderView.i();
                pf2.b bVar = finderLiveNormalRoomLyricsRenderView.f111591e;
                if (bVar != null) {
                    bVar.release();
                }
                finderLiveNormalRoomLyricsRenderView.f111591e = null;
                finderLiveNormalRoomLyricsRenderView.f111592f = null;
                com.tencent.mars.xlog.Log.i("NormalRoomLyricsRenderView", "release");
            }
            nf2.d0 d0Var = d1Var.C;
            if (d0Var != null) {
                d0Var.e();
            }
            d1Var.C = null;
            nf2.g0 g0Var = d1Var.B;
            if (g0Var != null) {
                g0Var.f336741c = null;
                g0Var.f336742d = 0;
                g0Var.f336743e = 0;
                g0Var.f336744f = false;
                com.tencent.mars.xlog.Log.i("FinderLiveLyricsPositionManager", "release");
            }
            d1Var.B = null;
            nf2.i1 i1Var = d1Var.f336699t;
            if (i1Var != null) {
                android.animation.AnimatorSet animatorSet = i1Var.f336757f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                i1Var.f336757f = null;
                i1Var.f336756e = false;
            }
            d1Var.f336699t = null;
            com.tencent.mm.view.MMPAGView mMPAGView = d1Var.f336697r;
            if (mMPAGView != null) {
                mMPAGView.n();
            }
            com.tencent.mm.view.MMPAGView mMPAGView2 = d1Var.f336697r;
            if (mMPAGView2 != null) {
                mMPAGView2.h();
            }
            com.tencent.mm.view.MMPAGView mMPAGView3 = d1Var.f336702w;
            if (mMPAGView3 != null) {
                mMPAGView3.n();
            }
            com.tencent.mm.view.MMPAGView mMPAGView4 = d1Var.f336702w;
            if (mMPAGView4 != null) {
                mMPAGView4.h();
            }
            com.tencent.mm.view.MMPAGView mMPAGView5 = d1Var.f336702w;
            if (mMPAGView5 != null) {
                mMPAGView5.setVisibility(8);
            }
            android.view.View view = d1Var.f336701v;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "releaseGestureEducation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "releaseGestureEducation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "release");
        }
        this.f336808m = null;
        this.f336813r = false;
        kotlinx.coroutines.r2 r2Var = this.f336820y;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f336820y = null;
    }
}
