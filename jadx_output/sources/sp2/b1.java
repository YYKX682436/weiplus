package sp2;

/* loaded from: classes2.dex */
public final class b1 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f410985d;

    public b1(sp2.o2 o2Var) {
        this.f410985d = o2Var;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.ui.widget.dialog.k0 a17;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).a0();
        if (i17 < a07) {
            return true;
        }
        int i18 = i17 - a07;
        sp2.o2 o2Var = this.f410985d;
        so2.j5 j5Var = (so2.j5) kz5.n0.a0(o2Var.f411145m, i18);
        if (!(j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
            return true;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
        if (!zl2.q4.f473933a.C(baseFinderFeed) || (a17 = zl2.r4.f473950a.a1(o2Var.f411121a, baseFinderFeed, 1005, o2Var.f411127d, new sp2.a1(o2Var, i18, j5Var, adapter, i17))) == null) {
            return true;
        }
        a17.v();
        return true;
    }
}
