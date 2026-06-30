package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class o7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f132770d;

    public o7(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f132770d = finderCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f132770d;
        if (i17 >= 27) {
            finderCommentFooter.getSwitchClickLayout().performHapticFeedback(3);
        } else {
            finderCommentFooter.getSwitchClickLayout().performHapticFeedback(3);
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (t70Var.C2() > 0) {
            t70Var.c3(0);
            android.view.View switchSceneTip = finderCommentFooter.getSwitchSceneTip();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(switchSceneTip, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            switchSceneTip.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(switchSceneTip, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderCommentFooter.setSwitchSceneTipHeight(0.0f);
            finderCommentFooter.getSwitchSceneTip().post(new com.tencent.mm.plugin.finder.view.n7(finderCommentFooter));
        }
        yz5.a aVar = finderCommentFooter.switchSceneListener;
        if (aVar != null) {
            aVar.invoke();
        }
        finderCommentFooter.setScene(finderCommentFooter.com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String == 2 ? 1 : 2);
        finderCommentFooter.u(false, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
