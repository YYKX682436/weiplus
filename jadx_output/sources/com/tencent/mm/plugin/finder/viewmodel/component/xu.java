package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class xu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f136498d;

    public xu(android.content.Context context) {
        this.f136498d = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderPrivateMsgSecurityRemindApi$createRemindBottomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/egQdjE6IEL6Ss12z");
        j45.l.j(this.f136498d, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderPrivateMsgSecurityRemindApi$createRemindBottomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
