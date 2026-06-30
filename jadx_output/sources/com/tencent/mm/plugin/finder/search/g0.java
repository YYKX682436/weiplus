package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFansSearchUI f125699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI) {
        super(1);
        this.f125699d = finderFansSearchUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent fansId = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(fansId, "fansId");
        com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI = this.f125699d;
        com.tencent.mm.plugin.finder.view.e3 e3Var = finderFansSearchUI.F;
        if (e3Var != null) {
            e3Var.h();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("FansId", fansId);
        intent.setClass(finderFansSearchUI.getContext(), com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31.class);
        androidx.appcompat.app.AppCompatActivity context = finderFansSearchUI.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter$onBindViewHolder$1$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter$onBindViewHolder$1$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
