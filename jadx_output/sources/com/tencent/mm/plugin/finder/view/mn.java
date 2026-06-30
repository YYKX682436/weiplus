package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class mn extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f132672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(android.content.Context context) {
        super(1);
        this.f132672d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent it = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.setClass(this.f132672d, com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31.class);
        android.content.Context context = this.f132672d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(it);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$showWxProfileDialog$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$showWxProfileDialog$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
