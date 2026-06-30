package hd2;

/* loaded from: classes2.dex */
public final class h0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280479a;

    public h0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment) {
        this.f280479a = finderProfileCardFragment;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment;
        androidx.fragment.app.FragmentActivity activity;
        kotlin.jvm.internal.o.g(view, "view");
        if (z17 && (activity = (finderProfileCardFragment = this.f280479a).getActivity()) != null) {
            i95.m c17 = i95.n0.c(c61.l7.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            r45.f03 b07 = ((c61.l7) c17).nk().b0("FinderMpCardEntry", finderProfileCardFragment.f110053q);
            i95.m c18 = i95.n0.c(c61.l7.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(((c61.l7) c18).nk(), "FinderMpCardEntry", finderProfileCardFragment.f110053q, false, false, 12, null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            if (S0 == null || b07 == null) {
                return;
            }
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            com.tencent.mm.plugin.finder.extension.reddot.a3[] a3VarArr = com.tencent.mm.plugin.finder.extension.reddot.a3.f105338d;
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "15", S0, b07, 1, V6, 0, null, 0, 0, 480, null);
        }
    }
}
