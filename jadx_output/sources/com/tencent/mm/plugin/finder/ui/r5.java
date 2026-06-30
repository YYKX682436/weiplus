package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class r5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f129766d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI) {
        super(1);
        this.f129766d = finderFansListUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI = this.f129766d;
        com.tencent.mm.plugin.finder.view.e3 e3Var = finderFansListUI.B;
        if (e3Var != null) {
            e3Var.h();
        }
        intent.setClass(finderFansListUI.getContext(), com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31.class);
        androidx.appcompat.app.AppCompatActivity context = finderFansListUI.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderFansListUI$initView$3$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/ui/FinderFansListUI$initView$3$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
