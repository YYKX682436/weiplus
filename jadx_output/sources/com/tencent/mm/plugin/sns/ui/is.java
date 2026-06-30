package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class is implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bs f169246d;

    public is(com.tencent.mm.plugin.sns.ui.bs bsVar) {
        this.f169246d = bsVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f169246d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getParent() == null || !(view.getParent() instanceof com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
            return;
        }
        if (((com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout) view.getParent()).getTag() == null || !(((com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout) view.getParent()).getTag() instanceof com.tencent.mm.plugin.sns.ui.u1)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
            return;
        }
        com.tencent.mm.plugin.sns.ui.u1 u1Var = (com.tencent.mm.plugin.sns.ui.u1) ((com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout) view.getParent()).getTag();
        if (u1Var == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_text_show", u1Var.f170555c);
            intent.putExtra("sns_local_id", u1Var.f170553a);
            intent.putExtra("sns_comment_buf", u1Var.f170557e.toByteArray());
            intent.putExtra("sns_content_source", 2);
            intent.setClass(bsVar.f168042h, com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.class);
            com.tencent.mm.ui.MMActivity mMActivity = bsVar.f168042h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mMActivity, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(mMActivity, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsTimeLineBaseAdapter", e17, "commentCollapse click exception.", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
    }
}
