package xs2;

/* loaded from: classes3.dex */
public final class b1 implements xs2.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f456309d;

    public b1(java.lang.ref.WeakReference rReplayPluginLayout) {
        kotlin.jvm.internal.o.g(rReplayPluginLayout, "rReplayPluginLayout");
        this.f456309d = rReplayPluginLayout;
    }

    @Override // cw2.fb
    public void D(r45.mb4 mb4Var, long j17) {
        com.tencent.mm.plugin.finder.live.view.k0 c17 = c();
        if (c17 != null) {
        }
    }

    @Override // cw2.fb
    public void F(r45.mb4 mb4Var) {
        at2.i iVar;
        xs2.c1 c1Var;
        com.tencent.mm.plugin.finder.live.view.k0 c17 = c();
        if (c17 == null || (iVar = (at2.i) c17.getPlugin(at2.i.class)) == null || (c1Var = iVar.f13685r) == null) {
            return;
        }
        ((xs2.m) c1Var).F(mb4Var);
    }

    @Override // cw2.fb
    public void G(r45.mb4 mb4Var) {
        com.tencent.mm.plugin.finder.live.view.k0 c17 = c();
        if (c17 != null) {
        }
    }

    @Override // cw2.fb
    public void J(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
    }

    @Override // xs2.c1
    public void a(int i17) {
        at2.i iVar;
        xs2.c1 c1Var;
        com.tencent.mm.plugin.finder.live.view.k0 c17 = c();
        if (c17 == null || (iVar = (at2.i) c17.getPlugin(at2.i.class)) == null || (c1Var = iVar.f13685r) == null) {
            return;
        }
        ((xs2.m) c1Var).a(i17);
    }

    @Override // cw2.fb
    public void b(float f17) {
        at2.i iVar;
        xs2.c1 c1Var;
        com.tencent.mm.plugin.finder.live.view.k0 c17 = c();
        if (c17 == null || (iVar = (at2.i) c17.getPlugin(at2.i.class)) == null || (c1Var = iVar.f13685r) == null) {
            return;
        }
        ((xs2.m) c1Var).b(f17);
    }

    public final com.tencent.mm.plugin.finder.live.view.k0 c() {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = (com.tencent.mm.plugin.finder.live.view.k0) this.f456309d.get();
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.i("VideoPlayLifecycleFullUIProxy", "getPluginLayout fail!");
        }
        return k0Var;
    }

    @Override // cw2.fb
    public void d(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
    }

    @Override // cw2.fb
    public void e(r45.mb4 mb4Var, int i17, int i18, nk4.r rVar) {
        at2.i iVar;
        xs2.c1 c1Var;
        com.tencent.mm.plugin.finder.live.view.k0 c17 = c();
        if (c17 == null || (iVar = (at2.i) c17.getPlugin(at2.i.class)) == null || (c1Var = iVar.f13685r) == null) {
            return;
        }
        cw2.fb.w(c1Var, mb4Var, i17, i18, null, 8, null);
    }

    @Override // cw2.fb
    public void g(r45.mb4 mb4Var, nk4.t tVar) {
        com.tencent.mm.plugin.finder.live.view.k0 c17 = c();
        if (c17 != null) {
        }
    }

    @Override // cw2.fb
    public void h(r45.mb4 mb4Var) {
        at2.i iVar;
        xs2.c1 c1Var;
        com.tencent.mm.plugin.finder.live.view.k0 c17 = c();
        if (c17 == null || (iVar = (at2.i) c17.getPlugin(at2.i.class)) == null || (c1Var = iVar.f13685r) == null) {
            return;
        }
        ((xs2.m) c1Var).h(mb4Var);
    }

    @Override // cw2.fb
    public void n(r45.mb4 mb4Var, nk4.a aVar) {
        at2.i iVar;
        xs2.c1 c1Var;
        com.tencent.mm.plugin.finder.live.view.k0 c17 = c();
        if (c17 == null || (iVar = (at2.i) c17.getPlugin(at2.i.class)) == null || (c1Var = iVar.f13685r) == null) {
            return;
        }
        ((xs2.m) c1Var).n(mb4Var, aVar);
    }

    @Override // cw2.fb
    public void s(cw2.wa waVar, nk4.a aVar) {
    }

    @Override // cw2.fb
    public void u(r45.mb4 mb4Var, long j17, kz2.a aVar) {
        com.tencent.mm.plugin.finder.live.view.k0 c17 = c();
        if (c17 != null) {
        }
    }

    @Override // cw2.fb
    public void v(r45.mb4 mb4Var, long j17, long j18) {
        com.tencent.mm.plugin.finder.live.view.k0 c17 = c();
        if (c17 != null) {
        }
    }

    @Override // cw2.fb
    public void x(r45.mb4 mb4Var, cw2.wa waVar, int i17, nk4.e eVar) {
        com.tencent.mm.plugin.finder.live.view.k0 c17 = c();
        if (c17 != null) {
        }
    }
}
