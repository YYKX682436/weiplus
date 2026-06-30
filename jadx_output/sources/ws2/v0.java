package ws2;

/* loaded from: classes3.dex */
public final class v0 implements dt2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f449148a;

    public v0(ws2.k1 k1Var) {
        this.f449148a = k1Var;
    }

    @Override // dt2.d0
    public void a(boolean z17) {
    }

    @Override // dt2.d0
    public void b() {
        android.content.Context context;
        dt2.a0 a0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("miniWindowClickListener onClick, ");
        ws2.u0 u0Var = ws2.k1.f449066r;
        ws2.k1 k1Var = this.f449148a;
        sb6.append(k1Var.i());
        com.tencent.mars.xlog.Log.i("FinderLiveReplayService", sb6.toString());
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        if (jVar != null) {
            jVar.e7(kn0.m.f309573d);
        }
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if ((k17 != null ? (android.app.Activity) k17.get() : null) == null) {
            k17 = com.tencent.mm.app.w.INSTANCE.j();
        }
        if (k17 == null || (context = (android.app.Activity) k17.get()) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderLiveReplayUI.class);
        intent.putExtra("route_to_maximize", true);
        if (context instanceof android.app.Activity) {
            intent.addFlags(603979776);
        } else {
            intent.addFlags(872415232);
        }
        dt2.a0 a0Var2 = k1Var.f449083o;
        if (((a0Var2 == null || a0Var2.f243158a.isPlaying()) ? false : true) && (a0Var = k1Var.f449083o) != null) {
            a0Var.e(null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        android.content.Context context2 = context;
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayService", "startReplayUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayService", "startReplayUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ct2.j jVar2 = (ct2.j) k1Var.e(ct2.j.class);
        int i17 = jVar2 != null ? jVar2.f222273q : 0;
        ct2.j jVar3 = (ct2.j) k1Var.e(ct2.j.class);
        k1Var.m(i17, jVar3 != null ? jVar3.O6() : 0L);
        fo0.c.f264799b.c();
    }

    @Override // dt2.d0
    public void c(qs5.o mode) {
        kotlin.jvm.internal.o.g(mode, "mode");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mini window close,");
        ws2.u0 u0Var = ws2.k1.f449066r;
        ws2.k1 k1Var = this.f449148a;
        sb6.append(k1Var.i());
        sb6.append(",mode:");
        sb6.append(mode);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("FinderLiveReplayService", sb6.toString());
        dt2.b0 b0Var = k1Var.f449073e;
        if (b0Var != null) {
            b0Var.x();
        }
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        k1Var.l(2, jVar != null ? jVar.O6() : 0L, true);
    }
}
