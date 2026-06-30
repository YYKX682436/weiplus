package eg2;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg2.n f252582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(eg2.n nVar) {
        super(0);
        this.f252582d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        eg2.n nVar = this.f252582d;
        com.tencent.mm.plugin.finder.live.widget.sl slVar = nVar.f252591i;
        if (slVar != null) {
            slVar.dismiss();
        }
        nVar.f252591i = null;
        com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView = nVar.f252590h;
        if ((finderLiveHDCheckboxView == null || finderLiveHDCheckboxView.f111647d.isChecked()) ? false : true) {
            com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView2 = nVar.f252590h;
            if (finderLiveHDCheckboxView2 != null) {
                finderLiveHDCheckboxView2.setChecked(true);
            }
            eg2.n.a(nVar, true);
        }
        return jz5.f0.f302826a;
    }
}
