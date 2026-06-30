package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f112364d;

    public e3(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        this.f112364d = v3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$showBottomLink$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_HELP_AND_FEEDBACK_ENTRY_URL_STRING_SYNC, ""));
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.j(this.f112364d.f365323d.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$showBottomLink$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
