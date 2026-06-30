package hd2;

/* loaded from: classes2.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f280528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ct4 f280529f;

    public s0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment, java.lang.Boolean bool, r45.ct4 ct4Var) {
        this.f280527d = finderProfileCardFragment;
        this.f280528e = bool;
        this.f280529f = ct4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        r45.xs2 xs2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$updateTabShowWording$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment = this.f280527d;
        androidx.fragment.app.FragmentActivity activity = finderProfileCardFragment.getActivity();
        if (activity == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$updateTabShowWording$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Boolean bool = this.f280528e;
        if (bool == null || kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).kk(activity, finderProfileCardFragment.f110053q, this.f280529f);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$updateTabShowWording$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = finderProfileCardFragment.f110057u;
        com.tencent.mm.protobuf.g byteString = (z9Var == null || (jbVar = z9Var.f105329c) == null || (xs2Var = jbVar.N) == null) ? null : xs2Var.getByteString(11);
        if (byteString == null) {
            i95.m c17 = i95.n0.c(c61.t8.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((c61.t8) c17).Ai(finderProfileCardFragment.f110053q, "FinderMpCardEntry");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$updateTabShowWording$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        i95.m c18 = i95.n0.c(c61.l7.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.fa nk6 = ((c61.l7) c18).nk();
        r45.f03 b07 = nk6.b0("FinderMpCardEntry", finderProfileCardFragment.f110053q);
        com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(nk6, "FinderMpCardEntry", finderProfileCardFragment.f110053q, false, false, 12, null);
        if (S0 != null && b07 != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            com.tencent.mm.plugin.finder.extension.reddot.a3[] a3VarArr = com.tencent.mm.plugin.finder.extension.reddot.a3.f105338d;
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "15", S0, b07, 2, V6, 0, null, 0, 0, 480, null);
        }
        i95.m c19 = i95.n0.c(c61.t8.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        ((c61.t8) c19).Bi(activity, byteString, "FinderMpCardEntry", finderProfileCardFragment.f110053q);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$updateTabShowWording$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
