package te2;

/* loaded from: classes3.dex */
public final class p1 implements te2.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f418286d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f418287e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f418288f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f418289g;

    /* renamed from: h, reason: collision with root package name */
    public te2.k0 f418290h;

    /* renamed from: i, reason: collision with root package name */
    public bm2.m f418291i;

    /* renamed from: m, reason: collision with root package name */
    public r45.d22 f418292m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f418293n;

    /* renamed from: o, reason: collision with root package name */
    public final int f418294o;

    /* renamed from: p, reason: collision with root package name */
    public final int f418295p;

    /* renamed from: q, reason: collision with root package name */
    public long f418296q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f418297r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f418298s;

    public p1(android.view.View rootView, gk2.e liveData, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f418286d = rootView;
        this.f418287e = liveData;
        this.f418288f = statusMonitor;
        this.f418289g = basePlugin;
        this.f418294o = 1000;
        this.f418295p = 1001;
        this.f418297r = "";
        this.f418298s = jz5.h.b(new te2.h1(this));
    }

    public static java.lang.Object A(te2.p1 p1Var, int i17, java.lang.Integer num, r45.rm1 rm1Var, int i18, kotlin.coroutines.Continuation continuation, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            i18 = ((mm2.c1) p1Var.f418287e.a(mm2.c1.class)).E4;
        }
        return p1Var.z(i17, num, rm1Var, i18, continuation);
    }

    @Override // te2.l0
    public boolean D2(int i17, r45.xg7 xg7Var) {
        gk2.e eVar = this.f418287e;
        int size = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f233877f.size();
        return size < ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f233876e.size() && i17 >= 0 && i17 >= size + (-25);
    }

    public final dk2.vg c() {
        gk2.e eVar = this.f418287e;
        int i17 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f233875d;
        if (i17 < 0 || i17 >= ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f233877f.size()) {
            return null;
        }
        return (dk2.vg) ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f233877f.get(i17);
    }

    public final com.tencent.mm.sdk.platformtools.n3 f() {
        return (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f418298s).getValue();
    }

    public final boolean g() {
        android.view.View view = this.f418286d;
        if (view.getContext() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostUI) {
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!((com.tencent.mm.plugin.finder.live.viewmodel.a1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.a1.class)).W6()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return ((mm2.c1) this.f418287e.a(mm2.c1.class)).a8();
    }

    public void i(dk2.vg musicItem, int i17) {
        com.tencent.mm.plugin.finder.live.view.k0 Y0;
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        this.f418292m = null;
        zl2.r4 r4Var = zl2.r4.f473950a;
        gk2.e eVar = this.f418287e;
        if (r4Var.s1(eVar)) {
            com.tencent.mm.plugin.finder.live.util.y.m(this.f418289g, null, null, new te2.w0(this, musicItem, null), 3, null);
        } else {
            tn0.w0 f17 = dk2.ef.f233372a.f();
            if (f17 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pauseBgMusic path:");
                com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = f17.L;
                sb6.append(audioMusicParam != null ? audioMusicParam.path : null);
                sb6.append(", publish:");
                com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam2 = f17.L;
                sb6.append(audioMusicParam2 != null ? java.lang.Boolean.valueOf(audioMusicParam2.publish) : null);
                sb6.append(", loopCount:");
                com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam3 = f17.L;
                sb6.append(audioMusicParam3 != null ? java.lang.Integer.valueOf(audioMusicParam3.loopCount) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", sb6.toString());
                com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam4 = f17.L;
                if (audioMusicParam4 != null) {
                    f17.T().getAudioEffectManager().pausePlayMusic(audioMusicParam4.f46245id);
                    f17.N = false;
                }
            }
            if (g() && (Y0 = this.f418289g.Y0()) != null) {
                com.tencent.mm.plugin.finder.live.util.y.n(Y0, null, null, new te2.x0(this, musicItem, null), 3, null);
            }
        }
        ((mm2.c1) eVar.a(mm2.c1.class)).Z6().i(musicItem, i17);
        te2.d4 d4Var = te2.d4.f417948a;
        boolean a86 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
        ml2.u2[] u2VarArr = ml2.u2.f328109d;
        d4Var.a(a86, 9, ((mm2.c1) eVar.a(mm2.c1.class)).Z6().e(), this.f418297r);
    }

    public void m(dk2.vg musicItem, int i17, boolean z17) {
        com.tencent.mm.plugin.finder.live.view.k0 Y0;
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        v();
        r45.d22 d22Var = this.f418292m;
        r45.d22 d22Var2 = musicItem.f234254a;
        boolean z18 = !(d22Var != null && dk2.q.d(d22Var, d22Var2));
        dk2.vg c17 = c();
        if (z18 && c17 != null) {
            te2.d4.f417948a.c(h(), 4, c17, false, true);
        }
        this.f418292m = d22Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playMusic ");
        sb6.append(musicItem);
        sb6.append(", forcePlay:");
        sb6.append(z17);
        sb6.append(", stack:");
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPresenter", sb6.toString());
        if (zl2.r4.f473950a.s1(this.f418287e)) {
            dk2.ef.f233372a.K(musicItem, i17, z17, new te2.b1(this, z18, musicItem));
            return;
        }
        dk2.ef.f233372a.K(musicItem, i17, z17, null);
        if (!g() || (Y0 = this.f418289g.Y0()) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.util.y.n(Y0, null, null, new te2.c1(this, z18, musicItem, null), 3, null);
    }

    @Override // fs2.a
    public void onAttach(java.lang.Object obj) {
        te2.k0 callback = (te2.k0) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPresenter", "onAttach");
        this.f418290h = callback;
        te2.q1 q1Var = (te2.q1) callback;
        com.tencent.mars.xlog.Log.i(q1Var.f418349h, "initView");
        android.view.View view = q1Var.f418345d;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gk2.e eVar = q1Var.f418347f;
        te2.j0 j0Var = q1Var.f418348g;
        q1Var.f418350i = new com.tencent.mm.plugin.finder.live.widget.d7(context, eVar, j0Var, q1Var);
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        q1Var.f418351m = new com.tencent.mm.plugin.finder.live.widget.h7(context2, eVar, j0Var);
        bm2.m mVar = new bm2.m(this.f418287e);
        this.f418291i = mVar;
        mVar.f22080q = new te2.s0(this, mVar);
        mVar.f22081r = new te2.t0(this);
    }

    @Override // fs2.a
    public void onDetach() {
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPresenter", "onDetach");
        f().removeCallbacksAndMessages(null);
    }

    public void p(dk2.vg musicItem, int i17) {
        com.tencent.mm.plugin.finder.live.view.k0 Y0;
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        v();
        this.f418292m = musicItem.f234254a;
        zl2.r4 r4Var = zl2.r4.f473950a;
        gk2.e eVar = this.f418287e;
        if (r4Var.s1(eVar)) {
            com.tencent.mm.plugin.finder.live.util.y.m(this.f418289g, null, null, new te2.e1(this, musicItem, null), 3, null);
        } else {
            tn0.w0 f17 = dk2.ef.f233372a.f();
            if (f17 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resumeBgMusic path:");
                com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = f17.L;
                sb6.append(audioMusicParam != null ? audioMusicParam.path : null);
                sb6.append(", publish:");
                com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam2 = f17.L;
                sb6.append(audioMusicParam2 != null ? java.lang.Boolean.valueOf(audioMusicParam2.publish) : null);
                sb6.append(", loopCount:");
                com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam3 = f17.L;
                sb6.append(audioMusicParam3 != null ? java.lang.Integer.valueOf(audioMusicParam3.loopCount) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", sb6.toString());
                com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam4 = f17.L;
                if (audioMusicParam4 != null) {
                    f17.T().getAudioEffectManager().resumePlayMusic(audioMusicParam4.f46245id);
                    f17.N = true;
                }
            }
            if (g() && (Y0 = this.f418289g.Y0()) != null) {
                com.tencent.mm.plugin.finder.live.util.y.n(Y0, null, null, new te2.f1(this, musicItem, null), 3, null);
            }
        }
        dk2.p Z6 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6();
        Z6.getClass();
        if (musicItem.f234255b != 1) {
            musicItem.f234255b = 1;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", "resumeMusicItem " + musicItem + " songId size:" + Z6.f233876e.size() + ", musicList id size:" + Z6.f233877f.size() + ", pos:" + i17 + ", curPlayPos:" + Z6.f233875d);
    }

    public void q(int i17, boolean z17) {
        boolean s17 = zl2.r4.f473950a.s1(this.f418287e);
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        if (s17 && z17) {
            kotlinx.coroutines.r2 r2Var = this.f418293n;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f418293n = kotlinx.coroutines.l.d(i2Var, null, null, new te2.j1(this, i17, null), 3, null);
            return;
        }
        if (g() && z17) {
            kotlinx.coroutines.r2 r2Var2 = this.f418293n;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            this.f418293n = kotlinx.coroutines.l.d(i2Var, null, null, new te2.l1(this, i17, null), 3, null);
        }
        tn0.w0 f17 = dk2.ef.f233372a.f();
        if (f17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "setMusicVolume level:" + i17);
            if (i17 < 0) {
                i17 = 0;
            }
            if (i17 > 100) {
                i17 = 100;
            }
            f17.f420778x0 = i17;
            f17.f420781y0 = true;
            f17.T().getAudioEffectManager().setAllMusicVolume(f17.f420778x0);
        }
    }

    public void s(java.lang.String str) {
        com.tencent.mm.plugin.finder.live.widget.d7 d7Var;
        gk2.e eVar = this.f418287e;
        java.util.ArrayList arrayList = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f233877f;
        java.util.List list = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f233876e;
        this.f418297r = str == null ? "" : str;
        if (list.isEmpty()) {
            te2.k0 k0Var = this.f418290h;
            if (k0Var != null) {
                ((te2.q1) k0Var).d(true);
                return;
            }
            return;
        }
        if (!arrayList.isEmpty()) {
            te2.k0 k0Var2 = this.f418290h;
            if (k0Var2 != null) {
                ((te2.q1) k0Var2).a(arrayList);
            }
            bm2.m mVar = this.f418291i;
            if (mVar != null) {
                mVar.b(true);
                return;
            }
            return;
        }
        te2.l0.A0(this, false, null, new te2.p0(this), 3, null);
        te2.k0 k0Var3 = this.f418290h;
        if (k0Var3 == null || (d7Var = ((te2.q1) k0Var3).f418350i) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.e0.W(d7Var, null, true, (int) (com.tencent.mm.ui.bl.b(d7Var.f118183e).y * 0.75f), 1, null);
        android.view.View view = d7Var.P;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = d7Var.T;
        if (view2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = d7Var.U;
        if (view3 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = d7Var.f118084y0;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = d7Var.f118083x0;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        d7Var.e0(false);
    }

    @Override // te2.l0
    public void u5(boolean z17, r45.xg7 xg7Var, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        gk2.e eVar = this.f418287e;
        java.util.LinkedList g17 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().g(z17);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPresenter", "loadMoreData loadAll:" + z17 + " udpateMusicList:" + g17);
        if (!(g17.isEmpty())) {
            com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f418289g;
            if (lVar.W0() != null) {
                dk2.xf W0 = lVar.W0();
                if (W0 != null) {
                    long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
                    byte[] bArr = ((mm2.e1) eVar.a(mm2.e1.class)).f328985o;
                    android.content.Context context = this.f418286d.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    ((dk2.r4) W0).O(j17, bArr, xy2.c.e(context), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, 1, g17, new te2.r0(this, callback));
                    return;
                }
                return;
            }
        }
        callback.invoke(0);
    }

    public final void v() {
        mm2.m6 m6Var = (mm2.m6) this.f418287e.a(mm2.m6.class);
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f418289g;
        sf2.x xVar = (sf2.x) lVar.U0(sf2.x.class);
        dk2.yg c17 = m6Var.f329241f.c();
        if (c17 != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPresenter", "stopAllSinging: stopping old song list before bg music");
            if (xVar != null) {
                xVar.t7(c17);
            }
        }
        if (((kotlinx.coroutines.flow.h3) m6Var.f329251s).getValue() instanceof mm2.g6) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPresenter", "stopAllSinging: stopping new song list before bg music");
        sf2.e1 e1Var = (sf2.e1) lVar.U0(sf2.e1.class);
        if (e1Var != null) {
            kotlinx.coroutines.l.d(e1Var.getStore().getLiveRoomData().f272475i, null, null, new sf2.c1(e1Var, null), 3, null);
        }
    }

    public void y() {
        tn0.w0 f17 = dk2.ef.f233372a.f();
        if (f17 != null) {
            f17.F0();
        }
        this.f418292m = null;
        dk2.p Z6 = ((mm2.c1) this.f418287e.a(mm2.c1.class)).Z6();
        dk2.vg d17 = Z6.d();
        int i17 = Z6.f233875d;
        Z6.getClass();
        if (!(d17 != null && d17.f234255b == 3) && d17 != null) {
            d17.f234255b = 3;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", "stopMusicItem " + d17 + " songId size:" + Z6.f233876e.size() + ", musicList id size:" + Z6.f233877f.size() + ", pos:" + i17 + ", curPlayPos:" + Z6.f233875d);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(int r24, java.lang.Integer r25, r45.rm1 r26, int r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.p1.z(int, java.lang.Integer, r45.rm1, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
