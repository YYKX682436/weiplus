package eg2;

/* loaded from: classes3.dex */
public final class j implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg2.n f252580d;

    public j(eg2.n nVar) {
        this.f252580d = nVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView;
        hk0.c1 c1Var = (hk0.c1) obj;
        eg2.n nVar = this.f252580d;
        if (!nVar.f252595p || (finderLiveHDCheckboxView = nVar.f252590h) == null) {
            return;
        }
        finderLiveHDCheckboxView.setVisibility(c1Var.f281712b ? 0 : 4);
    }
}
