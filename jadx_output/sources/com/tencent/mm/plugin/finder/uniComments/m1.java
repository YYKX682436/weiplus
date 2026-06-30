package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f130304d;

    public m1(com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter) {
        this.f130304d = textStatusCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int C2 = t70Var.C2();
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = this.f130304d;
        if (C2 > 0) {
            t70Var.c3(0);
            android.view.View switchSceneTip = textStatusCommentFooter.getSwitchSceneTip();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(switchSceneTip, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            switchSceneTip.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(switchSceneTip, "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(textStatusCommentFooter.getContext());
            e3Var.f(com.tencent.mm.R.layout.d0f);
            com.tencent.mm.ui.bk.r0(((android.widget.TextView) e3Var.f131959f.findViewById(com.tencent.mm.R.id.fsz)).getPaint(), 0.8f);
            android.view.View findViewById = e3Var.f131959f.findViewById(com.tencent.mm.R.id.fsx);
            kotlin.jvm.internal.o.d(findViewById);
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter.a(textStatusCommentFooter, findViewById, 1, new com.tencent.mm.plugin.finder.uniComments.k1(textStatusCommentFooter, e3Var));
            android.view.View findViewById2 = e3Var.f131959f.findViewById(com.tencent.mm.R.id.fsy);
            kotlin.jvm.internal.o.d(findViewById2);
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter.a(textStatusCommentFooter, findViewById2, 2, new com.tencent.mm.plugin.finder.uniComments.l1(textStatusCommentFooter, e3Var));
            e3Var.i();
        } else {
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter.b(textStatusCommentFooter);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
