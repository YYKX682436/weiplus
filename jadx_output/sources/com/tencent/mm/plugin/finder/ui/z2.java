package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class z2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderConversationXXUI f130076d;

    public z2(com.tencent.mm.plugin.finder.ui.FinderConversationXXUI finderConversationXXUI) {
        this.f130076d = finderConversationXXUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.appcompat.app.AppCompatActivity context = this.f130076d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.tencent.mm.plugin.finder.ui.FinderSettingMsgSayHiUI.class);
        xy2.c.c(context, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderSayHiSettingUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderSayHiSettingUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
