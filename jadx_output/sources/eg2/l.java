package eg2;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg2.n f252584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(eg2.n nVar) {
        super(0);
        this.f252584d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        eg2.n nVar = this.f252584d;
        com.tencent.mm.plugin.finder.live.widget.sl slVar = nVar.f252591i;
        if (slVar != null) {
            slVar.dismiss();
        }
        nVar.f252591i = null;
        com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView = nVar.f252590h;
        kotlin.jvm.internal.o.d(finderLiveHDCheckboxView);
        if (!finderLiveHDCheckboxView.f111647d.isChecked()) {
            com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView2 = nVar.f252590h;
            if (finderLiveHDCheckboxView2 != null) {
                finderLiveHDCheckboxView2.setChecked(true);
            }
            eg2.n.a(nVar, true);
        }
        return jz5.f0.f302826a;
    }
}
