package v12;

/* loaded from: classes7.dex */
public final class f extends lc3.e implements jc3.g0, jc3.u {

    /* renamed from: d, reason: collision with root package name */
    public final jc3.j0 f432502d;

    /* renamed from: e, reason: collision with root package name */
    public v12.e f432503e;

    public f() {
        jc3.j0 wi6 = ((com.tencent.mm.plugin.magicbrush.b6) ((com.tencent.mm.plugin.magicbrush.p4) i95.n0.c(com.tencent.mm.plugin.magicbrush.p4.class))).wi("MagicSnsTimeline");
        rc3.w0 w0Var = (rc3.w0) wi6;
        w0Var.w(this);
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147828r = this;
        mBBuildConfig.f147834x = this;
        mBBuildConfig.f147821h = z65.c.a();
        mBBuildConfig.f147832v = ((je3.i) i95.n0.c(je3.i.class)).Ii(1.0E-4f);
        mBBuildConfig.a(kz5.c0.i(new w12.b(), new w12.d(), new w12.a(), new w12.e()));
        w0Var.W(mBBuildConfig);
        w0Var.start();
        this.f432502d = wi6;
    }

    public final void C0(zp0.e event) {
        kotlin.jvm.internal.o.g(event, "event");
        ((rc3.w0) this.f432502d).k("OnClientEvent", event.a());
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MagicSnsTimeline", "canvas created");
        v12.e eVar = this.f432503e;
        if (eVar != null) {
            v12.i iVar = (v12.i) eVar;
            iVar.f432508e = view;
            iVar.wi();
        }
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        v12.i iVar;
        android.view.View view2;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MagicSnsTimeline", "canvas destroyed");
        v12.e eVar = this.f432503e;
        if (eVar == null || (view2 = (iVar = (v12.i) eVar).f432508e) == null) {
            return;
        }
        android.view.ViewParent parent = view2.getParent();
        android.widget.FrameLayout frameLayout = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
        if (frameLayout != null) {
            frameLayout.removeView(view2);
        }
        iVar.f432508e = null;
    }

    @Override // jc3.u
    public void b1() {
        v12.e eVar = this.f432503e;
        if (eVar != null) {
            d75.b.g(new v12.h((v12.i) eVar));
        }
    }
}
