package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class j3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f169477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.o3 f169478e;

    public j3(com.tencent.mm.plugin.sns.ui.o3 o3Var, android.content.Context context) {
        this.f169478e = o3Var;
        this.f169477d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.o3 o3Var = this.f169478e;
        if (com.tencent.mm.plugin.sns.ui.o3.c(o3Var) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$3");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11989, 3, com.tencent.mm.plugin.sns.ui.o3.c(o3Var).field_snsId == 0 ? "" : ca4.z0.t0(com.tencent.mm.plugin.sns.ui.o3.c(o3Var).field_snsId), 0);
        int i17 = com.tencent.mm.plugin.sns.ui.o3.c(o3Var).localid;
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f169477d;
        intent.setClass(context, com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.class);
        intent.putExtra("INTENT_TALKER", com.tencent.mm.plugin.sns.ui.o3.c(o3Var).getUserName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        boolean z17 = o3Var.f170086q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        intent.putExtra("INTENT_STAR_LIST", z17);
        intent.putExtra("INTENT_SNS_LOCAL_ID", com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", i17));
        intent.putExtra("INTENT_FROMGALLERY", true);
        ((com.tencent.mm.ui.MMActivity) context).startActivityForResult(intent, 1);
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.Q().f60451k = 1L;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$3");
    }
}
