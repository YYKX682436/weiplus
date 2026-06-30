package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f170731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.p3 f170732e;

    public w3(com.tencent.mm.plugin.sns.ui.p3 p3Var, android.content.Context context) {
        this.f170732e = p3Var;
        this.f170731d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.p3 p3Var = this.f170732e;
        if (com.tencent.mm.plugin.sns.ui.p3.c(p3Var) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$6");
            return;
        }
        int i17 = com.tencent.mm.plugin.sns.ui.p3.c(p3Var).localid;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_comment_localId", i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        int i18 = p3Var.f170145n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        intent.putExtra("sns_source", i18);
        intent.setClass(this.f170731d, com.tencent.mm.plugin.sns.ui.SnsCommentUI.class);
        java.lang.String t07 = com.tencent.mm.plugin.sns.ui.p3.c(p3Var).field_snsId == 0 ? "" : ca4.z0.t0(com.tencent.mm.plugin.sns.ui.p3.c(p3Var).field_snsId);
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryFooterNew", "comment cmd id:%s", t07);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11989, 2, t07, 0);
        android.content.Context context = this.f170731d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.model.k7.f164367a.b(com.tencent.mm.plugin.sns.ui.p3.c(p3Var), 3);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$6");
    }
}
