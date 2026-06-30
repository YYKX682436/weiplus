package pt2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment f358239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f358240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f358241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f358242g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment finderMixSearchFeedFragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, androidx.recyclerview.widget.k3 k3Var) {
        super(1);
        this.f358239d = finderMixSearchFeedFragment;
        this.f358240e = baseFinderFeed;
        this.f358241f = i17;
        this.f358242g = k3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment finderMixSearchFeedFragment = this.f358239d;
        android.content.Context context = finderMixSearchFeedFragment.getContext();
        if (context != null) {
            pf5.u uVar = pf5.u.f353936a;
            java.lang.String valueOf = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p);
            java.lang.String valueOf2 = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
            java.lang.String str = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135387s;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135387s;
            if (str3 == null) {
                str3 = "";
            }
            zl2.q4 q4Var = zl2.q4.f473933a;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f358240e;
            boolean C = q4Var.C(baseFinderFeed);
            com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter = finderMixSearchFeedFragment.f125904u;
            if (C) {
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((ml2.j0) ((zy2.zb) c17)).sj(baseFinderFeed, this.f358241f, ml2.x1.f328207n, valueOf2, str2, str3, "");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_context_id", valueOf);
                intent.putExtra("key_from_comment_scene", valueOf2);
                intent.putExtra("key_click_tab_context_id", str2);
                intent.putExtra("key_click_sub_tab_context_id", str3);
                if (finderMixSearchPresenter != null) {
                    finderMixSearchPresenter.g(baseFinderFeed, intent, finderMixSearchFeedFragment.f125905v);
                }
            } else {
                int i17 = finderMixSearchFeedFragment.f129265p;
                if (i17 == -1) {
                    i17 = 0;
                }
                if (finderMixSearchPresenter != null) {
                    java.util.List list = finderMixSearchFeedFragment.f125905v;
                    android.view.View itemView = this.f358242g.itemView;
                    kotlin.jvm.internal.o.f(itemView, "itemView");
                    finderMixSearchPresenter.m(baseFinderFeed, list, i17, itemView);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
