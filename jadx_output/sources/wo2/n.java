package wo2;

/* loaded from: classes2.dex */
public final class n extends com.tencent.mm.plugin.finder.viewmodel.component.hy {

    /* renamed from: g, reason: collision with root package name */
    public r45.f03 f448103g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f448104h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.hy
    public java.lang.String O6() {
        return !c92.g.f39738a.b() ? "NearbyEntrance" : "FinderLiveEntrance";
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.hy
    public boolean P6() {
        if (c92.g.f39738a.b()) {
            boolean E = ((c61.l7) i95.n0.c(c61.l7.class)).nk().E();
            com.tencent.mars.xlog.Log.i("Finder.RedDotUIJumpUIC", "[isIgnore] isEnableShowFinderLiveEntranceRedDot=" + E);
            if (!E) {
                return true;
            }
        } else {
            boolean v17 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().v();
            com.tencent.mars.xlog.Log.i("Finder.RedDotUIJumpUIC", "[isIgnore] isEnableShowNearByEntranceRedDot=" + v17);
            if (!v17) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.hy
    public void Q6() {
        r45.xs2 xs2Var = this.f134677d;
        int integer = xs2Var != null ? xs2Var.getInteger(12) : 0;
        if (integer == 0) {
            ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
            integer = wo2.n0.f448105a.c(94);
            com.tencent.mars.xlog.Log.i("Finder.RedDotUIJumpUIC", "prepareLiveSquare use last cache targetTabId=" + integer);
        }
        int Di = ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).Di(94, 0);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        int i17 = 1005000 + integer + Di;
        if (P6()) {
            return;
        }
        ey2.o0 N6 = this.f134679f.N6(i17);
        N6.a(ey2.q0.f257472e);
        N6.f257448h = 0L;
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        r45.dd2 dd2Var = new r45.dd2();
        dd2Var.set(0, java.lang.Integer.valueOf(integer));
        pq2.e c17 = nq2.d.f338980a.c(dd2Var);
        if (c17 != null) {
            c17.i();
        }
    }

    public final void R6() {
        if (c92.g.f39738a.b()) {
            this.f448103g = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("FinderLiveEntrance");
            this.f448104h = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderLiveEntrance");
        } else {
            this.f448103g = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("NearbyEntrance");
            this.f448104h = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("NearbyEntrance");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
