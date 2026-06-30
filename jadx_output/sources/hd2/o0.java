package hd2;

/* loaded from: classes2.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280507e;

    public o0(android.content.Context context, com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment) {
        this.f280506d = context;
        this.f280507e = finderProfileCardFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onNormalOrAbnormal$finderAccountAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        ya2.g gVar = ya2.h.f460484a;
        android.content.Context context = this.f280506d;
        ya2.b2 b17 = gVar.b(xy2.c.e(context));
        if (b17 != null && b17.G0()) {
            intent.setClass(context, com.tencent.mm.plugin.finder.ui.FinderExposeUI.class);
            android.content.Context context2 = this.f280506d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onNormalOrAbnormal$finderAccountAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onNormalOrAbnormal$finderAccountAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            g92.b bVar = g92.b.f269769e;
            com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment = this.f280507e;
            m92.i X4 = bVar.X4(finderProfileCardFragment.f110053q);
            jz5.f0 f0Var = null;
            if (X4 != null) {
                if (X4.f324987a == 1) {
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Mj(context, finderProfileCardFragment.f110053q);
                    finderProfileCardFragment.f110052p = null;
                } else {
                    finderProfileCardFragment.t0(context);
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                finderProfileCardFragment.t0(context);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onNormalOrAbnormal$finderAccountAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
