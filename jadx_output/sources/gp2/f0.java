package gp2;

/* loaded from: classes10.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(gp2.l0 l0Var) {
        super(1);
        this.f274219d = l0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        gp2.l0 l0Var = this.f274219d;
        com.tencent.mars.xlog.Log.i(l0Var.t(), "invokeAutoPlayCallback pos:" + intValue);
        androidx.recyclerview.widget.RecyclerView recyclerView = l0Var.f274243b;
        if (recyclerView != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager;
            android.view.View findViewByPosition = finderStaggeredGridLayoutManager.findViewByPosition(intValue);
            int i17 = 0;
            if (findViewByPosition != null) {
                if (l0Var.f274245d && !l0Var.B) {
                    if (l0Var.x(intValue)) {
                        com.tencent.mars.xlog.Log.i(l0Var.t(), "disableLiveMuteByPos pos:" + intValue);
                        java.util.Iterator it = l0Var.f274267z.iterator();
                        while (it.hasNext()) {
                            gp2.f fVar = (gp2.f) it.next();
                            int i18 = fVar.f274214a;
                            ws5.f fVar2 = fVar.f274215b;
                            if (i18 == intValue) {
                                if (fVar2 != null) {
                                    fVar2.setMute(false);
                                }
                            } else if (fVar2 != null) {
                                fVar2.setMute(true);
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w(l0Var.t(), "disableLiveMuteByPos return for pos:" + intValue);
                    }
                    java.util.HashSet hashSet = l0Var.A;
                    hashSet.clear();
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewByPosition.findViewById(com.tencent.mm.R.id.icp);
                    hashSet.add(new gp2.g(intValue, frameLayout != null ? frameLayout.hashCode() : 0, false));
                }
                l0Var.f274265x = true;
                l0Var.h(intValue, findViewByPosition);
                l0Var.p(intValue);
            }
            if (!l0Var.D(intValue)) {
                int i19 = l0Var.A(intValue) ? intValue + 1 : intValue - 1;
                com.tencent.mars.xlog.Log.i(l0Var.t(), "findSameLineOtherPos otherPos:" + i19 + ", headerCount = " + l0Var.s());
                if (i19 < 0) {
                    com.tencent.mars.xlog.Log.i(l0Var.t(), "findSameLineOtherPos fix otherPos:0 pos:" + intValue + " otherPos:0");
                } else {
                    if (l0Var.s() + intValue >= l0Var.f274244c.size()) {
                        i17 = l0Var.s() + (r5.size() - 1);
                        com.tencent.mars.xlog.Log.i(l0Var.t(), "findSameLineOtherPos fix otherPos:" + i17 + " pos:" + intValue + " otherPos:" + i17);
                    } else {
                        i17 = i19;
                    }
                }
                android.view.View findViewByPosition2 = finderStaggeredGridLayoutManager.findViewByPosition(i17);
                if (findViewByPosition2 != null) {
                    l0Var.f274265x = true;
                    l0Var.h(i17, findViewByPosition2);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
