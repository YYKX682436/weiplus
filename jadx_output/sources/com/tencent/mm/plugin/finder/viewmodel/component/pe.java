package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class pe extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ye f135548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(com.tencent.mm.plugin.finder.viewmodel.component.ye yeVar) {
        super(0);
        this.f135548d = yeVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        com.tencent.mm.plugin.finder.viewmodel.component.ye yeVar = this.f135548d;
        if (yeVar.isBelongFragment() && (yeVar.getFragment() instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment)) {
            zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
            androidx.fragment.app.Fragment fragment = yeVar.getFragment();
            kotlin.jvm.internal.o.e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
            i17 = ((com.tencent.mm.plugin.finder.report.o3) qaVar).bl(((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment).f129265p);
        } else {
            androidx.appcompat.app.AppCompatActivity activity = yeVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            i17 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class))).f135380n;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
