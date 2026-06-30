package com.tencent.mm.plugin.finder.replay;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback;", "Lws2/q;", "Ltd2/c;", "Lcom/tencent/mm/ui/MMActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Lws2/p;", "presenter", "<init>", "(Lcom/tencent/mm/ui/MMActivity;Lws2/p;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveReplayViewCallback implements ws2.q, td2.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f124878d;

    /* renamed from: e, reason: collision with root package name */
    public final ws2.p f124879e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.o6 f124880f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f124881g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView f124882h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager f124883i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f124884m;

    /* renamed from: n, reason: collision with root package name */
    public final ws2.v1 f124885n;

    /* renamed from: o, reason: collision with root package name */
    public zs2.b f124886o;

    public FinderLiveReplayViewCallback(com.tencent.mm.ui.MMActivity activity, ws2.p presenter) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f124878d = activity;
        this.f124879e = presenter;
        this.f124880f = new com.tencent.mm.plugin.finder.ui.o6();
        android.view.View findViewById = activity.findViewById(com.tencent.mm.R.id.fka);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f124881g = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
        android.view.View findViewById2 = activity.findViewById(com.tencent.mm.R.id.fk_);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView finderLiveRecyclerView = (com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView) findViewById2;
        this.f124882h = finderLiveRecyclerView;
        this.f124884m = jz5.h.b(new ws2.u1(this));
        this.f124885n = new ws2.v1(finderLiveRecyclerView, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class))).V6());
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f124878d;
    }

    @Override // td2.c
    public void onCreate(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "[LiveLifecycle]onCreate " + this);
        zs2.b bVar = new zs2.b(new dp1.u(this.f124878d));
        this.f124886o = bVar;
        bVar.b(34, "LiveReplayFloatBall");
    }

    @Override // td2.c
    public void onDestroy(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        ws2.u0 u0Var = ws2.k1.f449066r;
        ct2.j jVar = (ct2.j) u0Var.a().e(ct2.j.class);
        java.lang.Boolean valueOf = jVar != null ? java.lang.Boolean.valueOf(jVar.f222278v) : null;
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "[LiveLifecycle]onDestroy " + this + ",manualClose:" + valueOf + '!');
        if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE)) {
            ws2.k1 a17 = u0Var.a();
            ct2.j jVar2 = (ct2.j) u0Var.a().e(ct2.j.class);
            a17.l(7, jVar2 != null ? jVar2.O6() : 0L, true);
        }
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = this.f124885n.f449149a;
        if (finderLiveReplayPluginLayout != null) {
            finderLiveReplayPluginLayout.unMount();
        }
        zs2.b bVar = this.f124886o;
        if (bVar != null) {
            bVar.o0();
        }
    }

    @Override // td2.c
    public void onPause(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "[LiveLifecycle]onPause " + this);
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = this.f124885n.f449149a;
        if (finderLiveReplayPluginLayout != null) {
            finderLiveReplayPluginLayout.pause();
        }
    }

    @Override // td2.c
    public void onResume(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "[LiveLifecycle]onResume " + this);
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = this.f124885n.f449149a;
        if (finderLiveReplayPluginLayout != null) {
            finderLiveReplayPluginLayout.resume();
        }
    }

    @Override // td2.c
    public void onStart(androidx.lifecycle.y var1) {
        at2.u1 u1Var;
        android.view.ViewGroup viewGroup;
        dt2.a0 a0Var;
        com.tencent.mm.pluginsdk.ui.e1 e1Var;
        cw2.wa f124897p;
        mn2.j4 j4Var;
        r45.mb4 e17;
        kotlin.jvm.internal.o.g(var1, "var1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LiveLifecycle]onStart ");
        sb6.append(this);
        sb6.append(", needMiniWindow:");
        ws2.u0 u0Var = ws2.k1.f449066r;
        mm2.c1 c1Var = (mm2.c1) u0Var.a().e(mm2.c1.class);
        sb6.append(c1Var != null ? java.lang.Boolean.valueOf(c1Var.O1) : null);
        sb6.append(",manualClose:");
        ct2.j jVar = (ct2.j) u0Var.a().e(ct2.j.class);
        sb6.append(jVar != null ? java.lang.Boolean.valueOf(jVar.f222278v) : null);
        sb6.append(",manualMinimum:");
        ct2.j jVar2 = (ct2.j) u0Var.a().e(ct2.j.class);
        sb6.append(jVar2 != null ? java.lang.Boolean.valueOf(jVar2.f222279w) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", sb6.toString());
        zs2.b bVar = this.f124886o;
        if (bVar != null) {
            bVar.p0();
        }
        qp1.h0.a(true, false, true);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "tryHideFloatBallWhenEnterPage hideFloatBall");
        ws2.k1 a17 = u0Var.a();
        dt2.b0 b0Var = a17.f449073e;
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = b0Var instanceof com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout ? (com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout) b0Var : null;
        if (finderLiveReplayPluginLayout != null && (u1Var = (at2.u1) finderLiveReplayPluginLayout.getPlugin(at2.u1.class)) != null && (viewGroup = u1Var.f365323d) != null && (a0Var = a17.f449083o) != null) {
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = a0Var.f243158a;
            android.util.Size size = (finderLiveThumbPlayerProxy == null || (f124897p = finderLiveThumbPlayerProxy.getF124897p()) == null || (j4Var = f124897p.f224098e) == null || (e17 = j4Var.e()) == null) ? new android.util.Size(0, 0) : bu2.z.g(e17);
            mm2.c1 c1Var2 = (mm2.c1) a17.e(mm2.c1.class);
            if (!(c1Var2 != null && c1Var2.L9()) || size.getWidth() < size.getHeight() || size.getHeight() <= 0) {
                ct2.j jVar3 = (ct2.j) a17.e(ct2.j.class);
                if (!(jVar3 != null && jVar3.f222272p)) {
                    e1Var = com.tencent.mm.pluginsdk.ui.e1.COVER;
                    a0Var.c(viewGroup, size, e1Var, false);
                }
            }
            e1Var = com.tencent.mm.pluginsdk.ui.e1.CONTAIN;
            a0Var.c(viewGroup, size, e1Var, false);
        }
        mm2.c1 c1Var3 = (mm2.c1) u0Var.a().e(mm2.c1.class);
        if (c1Var3 != null) {
            c1Var3.O1 = true;
        }
        ct2.j jVar4 = (ct2.j) u0Var.a().e(ct2.j.class);
        if (jVar4 != null) {
            jVar4.X6(false);
        }
        ct2.j jVar5 = (ct2.j) u0Var.a().e(ct2.j.class);
        if (jVar5 != null) {
            jVar5.Y6(false);
        }
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout2 = this.f124885n.f449149a;
        if (finderLiveReplayPluginLayout2 != null) {
            finderLiveReplayPluginLayout2.start();
        }
    }

    @Override // td2.c
    public void onStop(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        ws2.u0 u0Var = ws2.k1.f449066r;
        mm2.c1 c1Var = (mm2.c1) u0Var.a().e(mm2.c1.class);
        java.lang.Boolean valueOf = c1Var != null ? java.lang.Boolean.valueOf(c1Var.O1) : null;
        ct2.j jVar = (ct2.j) u0Var.a().e(ct2.j.class);
        java.lang.Boolean valueOf2 = jVar != null ? java.lang.Boolean.valueOf(jVar.f222278v) : null;
        ct2.j jVar2 = (ct2.j) u0Var.a().e(ct2.j.class);
        java.lang.Boolean valueOf3 = jVar2 != null ? java.lang.Boolean.valueOf(jVar2.f222279w) : null;
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "[LiveLifecycle]onStop " + this + ", needMiniView:" + valueOf + ", manualClose:" + valueOf2 + ",manualMinumum:" + valueOf3 + ",lifecycleOwner:" + var1);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (kotlin.jvm.internal.o.b(valueOf3, bool) || kotlin.jvm.internal.o.b(valueOf2, bool) || kotlin.jvm.internal.o.b(valueOf, bool)) {
            zs2.b bVar = this.f124886o;
            if (bVar != null) {
                bVar.t0(false);
            }
        } else {
            zs2.b bVar2 = this.f124886o;
            if (bVar2 != null) {
                bVar2.t0(true);
            }
        }
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        if (kotlin.jvm.internal.o.b(valueOf2, bool2) && !kotlin.jvm.internal.o.b(valueOf, bool2)) {
            ws2.k1 a17 = u0Var.a();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 3);
            com.tencent.mm.ui.MMActivity context = this.f124878d;
            kotlin.jvm.internal.o.g(context, "context");
            boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context);
            com.tencent.mars.xlog.Log.i("FinderLiveReplayService", "tryToStartReplayMiniUI isFloatWindowOpAllowed:" + Ui);
            if (Ui) {
                a17.r(intent);
            } else {
                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310569b, null, new ws2.a1(context, a17, intent, null), 2, null);
            }
        }
        qp1.h0.b();
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = this.f124885n.f449149a;
        if (finderLiveReplayPluginLayout != null) {
            finderLiveReplayPluginLayout.stop();
        }
    }
}
