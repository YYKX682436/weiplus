package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class b6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f128938d;

    public b6(com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI) {
        this.f128938d = finderFansListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Intent intent = new android.content.Intent();
        i0Var.getClass();
        com.tencent.mm.plugin.finder.ui.FinderFansListUI context = this.f128938d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.search.l4.f125763c = null;
        intent.setClass(context, com.tencent.mm.plugin.finder.search.FinderFansSearchUI.class);
        xy2.c.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderFansSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderFansSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
