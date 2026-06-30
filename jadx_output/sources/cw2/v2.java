package cw2;

/* loaded from: classes2.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f224057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.w2 f224058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f224059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cw2.f8 f224060g;

    public v2(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, cw2.w2 w2Var, in5.s0 s0Var, cw2.f8 f8Var) {
        this.f224057d = baseFinderFeed;
        this.f224058e = w2Var;
        this.f224059f = s0Var;
        this.f224060g = f8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.qt2 d17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo$initButtonClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f224057d != null) {
            cw2.w2 w2Var = this.f224058e;
            if (!w2Var.f224082g) {
                android.content.Context context = w2Var.f224076a;
                if (context == null || (d17 = xy2.c.d(context)) == null) {
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo$initButtonClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                androidx.lifecycle.y a17 = tm3.a.a(this.f224058e.f224076a);
                if (a17 == null) {
                    a17 = com.tencent.mm.app.a0.f53288d;
                }
                this.f224058e.f224079d = ((xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class)).R6(hc2.o0.s(this.f224057d), d17.getInteger(5), this.f224057d.w());
                androidx.lifecycle.j0 j0Var = this.f224058e.f224079d;
                if ((j0Var != null ? (r45.nm2) j0Var.getValue() : null) != null) {
                    com.tencent.mars.xlog.Log.i("FinderFullSeekBarLayoutListenVideo", "initListenVideoBtn: listenInfo already exists, enter directly");
                    com.tencent.mm.plugin.finder.assist.y4.f102714a.M(this.f224058e.f224076a, this.f224059f, this.f224057d, this.f224060g);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2137, 3);
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo$initButtonClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                cw2.w2 w2Var2 = this.f224058e;
                w2Var2.f224082g = true;
                w2Var2.f224077b = az2.c.a(az2.f.f16125d, w2Var2.f224076a, null, 0L, null, 14, null);
                az2.f fVar = this.f224058e.f224077b;
                if (fVar != null) {
                    fVar.a();
                }
                cw2.w2 w2Var3 = this.f224058e;
                w2Var3.f224081f = false;
                cw2.t2 t2Var = new cw2.t2(w2Var3, this.f224059f, this.f224057d, this.f224060g);
                androidx.lifecycle.j0 j0Var2 = w2Var3.f224079d;
                if (j0Var2 != null) {
                    j0Var2.observe(a17, t2Var);
                }
                w2Var3.f224078c = t2Var;
                cw2.w2 w2Var4 = this.f224058e;
                ku5.u0 u0Var = ku5.t0.f312615d;
                cw2.u2 u2Var = new cw2.u2(this.f224058e);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                w2Var4.f224080e = t0Var.z(u2Var, 3000L, false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo$initButtonClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
