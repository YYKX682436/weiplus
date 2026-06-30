package hd2;

/* loaded from: classes2.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f280487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280488f;

    public j0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, android.content.Context context) {
        this.f280486d = finderProfileCardFragment;
        this.f280487e = finderJumpInfo;
        this.f280488f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onAbnormalAccount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment = this.f280486d;
        nk6.y("PersonalCenterBanEntry", finderProfileCardFragment.f110053q);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f280487e;
        if (finderJumpInfo != null) {
            xc2.y2.i(xc2.y2.f453343a, this.f280488f, new xc2.p0(finderJumpInfo), 0, null, 12, null);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            m92.b j37 = g92.a.j3(g92.b.f269769e, finderProfileCardFragment.f110053q, false, 2, null);
            if (j37 == null || (string = j37.u0().getString(32)) == null) {
                f0Var2 = null;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", "[handleJumpError] jumpJson=".concat(string));
                qd2.q qVar = new qd2.q();
                android.content.Context context = view.getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                qd2.q.e(qVar, (com.tencent.mm.ui.MMActivity) context, 0, string, 0, 8, null);
            }
            if (f0Var2 == null) {
                finderProfileCardFragment.t0(this.f280488f);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onAbnormalAccount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
