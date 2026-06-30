package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f122470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.k8 f122471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f122472f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.w1 f122473g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.vx0 f122474h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f122475i;

    public u1(in5.s0 s0Var, com.tencent.mm.plugin.finder.feed.k8 k8Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.playlist.w1 w1Var, r45.vx0 vx0Var, boolean z17) {
        this.f122470d = s0Var;
        this.f122471e = k8Var;
        this.f122472f = baseFinderFeed;
        this.f122473g = w1Var;
        this.f122474h = vx0Var;
        this.f122475i = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerUIC$onBindView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f122470d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var = (com.tencent.mm.plugin.finder.viewmodel.component.a4) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f122471e;
        com.tencent.mm.plugin.finder.feed.pz pzVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) k8Var : null;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = pzVar != null ? pzVar.f108756h : null;
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer P6 = this.f122473g.P6();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f122472f;
        a4Var.W6(finderHomeTabFragment, baseFinderFeed, s0Var, P6);
        boolean z17 = true;
        int i18 = this.f122474h.getInteger(9) == 2 ? 2 : this.f122475i ? 1 : 0;
        com.tencent.mm.plugin.finder.playlist.w1 w1Var = this.f122473g;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed.getFeedObject();
        int adapterPosition = s0Var.getAdapterPosition();
        android.content.Context context2 = s0Var.f293121e;
        int c17 = com.tencent.mm.ui.bl.c(context2 == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context2);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i19 = b17.x;
        int i27 = b17.y;
        java.lang.System.nanoTime();
        if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
            z17 = false;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i17 = i27 - c17;
        } else {
            if (i27 >= i19) {
                i19 = i27;
            }
            i17 = i19 - c17;
        }
        w1Var.T6(feedObject, i18, adapterPosition, (int) (i17 * kx2.a.f313278a.a(context2)), null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerUIC$onBindView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
