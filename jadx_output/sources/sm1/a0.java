package sm1;

/* loaded from: classes10.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409314d;

    public a0(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter) {
        this.f409314d = bizCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        m40.k0 finderConfigService;
        m40.k0 finderConfigService2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409314d;
        finderConfigService = bizCommentFooter.getFinderConfigService();
        if (((c61.p7) finderConfigService).aj() > 0) {
            finderConfigService2 = bizCommentFooter.getFinderConfigService();
            ((c61.p7) finderConfigService2).getClass();
            com.tencent.mm.plugin.finder.storage.t70.f127590a.c3(0);
            android.view.View switchSceneTip = bizCommentFooter.getSwitchSceneTip();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(switchSceneTip, arrayList2.toArray(), "com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            switchSceneTip.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(switchSceneTip, "com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(bizCommentFooter.getContext());
            y1Var.j(com.tencent.mm.R.layout.f488228e00);
            com.tencent.mm.ui.bk.r0(((android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.fsz)).getPaint(), 0.8f);
            android.view.View findViewById = y1Var.f212027f.findViewById(com.tencent.mm.R.id.fsx);
            kotlin.jvm.internal.o.d(findViewById);
            com.tencent.mm.plugin.audio.comment.view.BizCommentFooter.b(bizCommentFooter, findViewById, 1, new sm1.y(bizCommentFooter, y1Var));
            android.view.View findViewById2 = y1Var.f212027f.findViewById(com.tencent.mm.R.id.fsy);
            kotlin.jvm.internal.o.d(findViewById2);
            com.tencent.mm.plugin.audio.comment.view.BizCommentFooter.b(bizCommentFooter, findViewById2, 2, new sm1.z(bizCommentFooter, y1Var));
            y1Var.s();
        } else {
            com.tencent.mm.plugin.audio.comment.view.BizCommentFooter.c(bizCommentFooter);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
