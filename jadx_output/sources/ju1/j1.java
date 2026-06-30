package ju1;

/* loaded from: classes9.dex */
public final class j1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI f301748d;

    public j1(com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI) {
        this.f301748d = historyCardListUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ju1.k kVar = this.f301748d.f95425n;
        if (kVar == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        androidx.lifecycle.j0 j0Var = kVar.f301750e;
        java.util.List list = (java.util.List) kVar.f301749d.getValue();
        j0Var.postValue(list != null ? (r45.xt) list.get(i17) : null);
    }
}
