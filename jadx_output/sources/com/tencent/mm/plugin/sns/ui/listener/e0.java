package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169774d;

    public e0(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169774d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$28");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.go) {
            com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(((com.tencent.mm.plugin.sns.ui.go) view.getTag()).f168445a);
            if (b17 == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$28");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_text_show", b17.getTimeLine().ContentDesc);
            intent.putExtra("sns_local_id", b17.getLocalid());
            intent.putExtra("sns_content_source", 1);
            com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169774d;
            intent.setClass(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar), com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.class);
            android.app.Activity e17 = com.tencent.mm.plugin.sns.ui.listener.i.e(iVar);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$28", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            e17.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$28", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$28");
    }
}
