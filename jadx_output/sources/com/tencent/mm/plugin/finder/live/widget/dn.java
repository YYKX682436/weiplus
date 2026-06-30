package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class dn implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mn f118133d;

    public dn(com.tencent.mm.plugin.finder.live.widget.mn mnVar) {
        this.f118133d = mnVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "onEditorAction actionId:" + i17 + ", keyEvent:" + keyEvent);
        com.tencent.mm.plugin.finder.live.widget.mn mnVar = this.f118133d;
        java.lang.String str = mnVar.f119100x;
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null && (3 == i17 || (keyEvent != null && keyEvent.getKeyCode() == 66))) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "loadSearchData query:" + mnVar.f119100x);
            mnVar.f119091o.setVisibility(8);
            android.view.View view = mnVar.f119092p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "loadSearchData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "loadSearchData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mnVar.f119099w.clear();
            mnVar.f119101y = 0;
            mnVar.f119102z = null;
            mnVar.A = zl2.q4.f473933a.m();
            java.lang.String str2 = mnVar.f119100x;
            if (!(str2 == null || str2.length() == 0)) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                java.lang.String query = mnVar.f119100x;
                int i18 = mnVar.f119101y;
                java.lang.String requestId = mnVar.A;
                com.tencent.mm.protobuf.g gVar = mnVar.f119102z;
                kotlin.jvm.internal.o.g(query, "query");
                kotlin.jvm.internal.o.g(requestId, "requestId");
                gm0.j1.d().g(new db2.y5(query, i18, requestId, gVar, 11, null, null, null, null, null, false, com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX, null));
                gm0.j1.d().a(3820, mnVar);
            }
            com.tencent.mm.sdk.platformtools.t8.t0(mnVar.f119090n);
        }
        return true;
    }
}
