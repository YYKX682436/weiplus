package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class ok implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.ok f135477d = new com.tencent.mm.plugin.finder.viewmodel.component.ok();

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$setSearchEntranceClick$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.content.Context context = view.getContext();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmfindersupport-bin/newreadtemplate?t=page/outer_page/switch_recommendation");
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$setSearchEntranceClick$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
