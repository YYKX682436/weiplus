package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f168552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.o3 f168553e;

    public i3(com.tencent.mm.plugin.sns.ui.o3 o3Var, android.content.Context context) {
        this.f168553e = o3Var;
        this.f168552d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.o3 o3Var = this.f168553e;
        if (com.tencent.mm.plugin.sns.ui.o3.c(o3Var) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$2");
            return;
        }
        int i17 = com.tencent.mm.plugin.sns.ui.o3.c(o3Var).localid;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_comment_localId", i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        int i18 = o3Var.f170082m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        intent.putExtra("sns_source", i18);
        intent.setClass(this.f168552d, com.tencent.mm.plugin.sns.ui.SnsCommentUI.class);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11989, 2, com.tencent.mm.plugin.sns.ui.o3.c(o3Var).field_snsId == 0 ? "" : ca4.z0.t0(com.tencent.mm.plugin.sns.ui.o3.c(o3Var).field_snsId), 0);
        android.content.Context context = this.f168552d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/GalleryFooter$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/GalleryFooter$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$2");
    }
}
