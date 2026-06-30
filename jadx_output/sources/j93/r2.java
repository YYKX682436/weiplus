package j93;

/* loaded from: classes.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.v2 f298490d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(j93.v2 v2Var) {
        super(1);
        this.f298490d = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        j93.v2 v2Var = this.f298490d;
        if (dVar != null && (dVar instanceof wi5.c)) {
            v2Var.f298518e.clear();
            v2Var.f298518e.addAll(state.f446319o);
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectLabelRemoveContactUIC", "showRemoveTipsBottomSheet() called");
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) v2Var.getContext(), 1, true);
            k0Var.f211872n = new j93.s2(1, v2Var);
            k0Var.f211881s = new j93.t2(1, v2Var);
            k0Var.v();
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.b)) {
            if (v2Var.f298523m) {
                v2Var.f298523m = false;
            } else {
                com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) v2Var.f298517d).getValue()).k();
                kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
                com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
                b93.q.f18605a.a(0, 2, 1, 23, v2Var.f298519f, v2Var.T6(), 0, 0, (a17 == null || (arrayList = a17.f152065o) == null) ? 0 : arrayList.size(), 0);
                v2Var.f298522i = 0;
                v2Var.f298521h = 0;
                v2Var.f298520g = false;
            }
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof wi5.y0)) {
            v2Var.f298521h++;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.SelectContactReportUIC", "onCreate: UnSelectUserActionFromFooterView " + ((wi5.y0) dVar3).f446365b);
        }
        j75.d dVar4 = state.f298066d;
        if (dVar4 != null && (dVar4 instanceof wi5.m)) {
            v2Var.f298520g = true;
        }
        if (dVar4 != null && (dVar4 instanceof wi5.z0)) {
            v2Var.f298522i += java.lang.Math.abs(((wi5.z0) dVar4).f446370b);
        }
        return jz5.f0.f302826a;
    }
}
