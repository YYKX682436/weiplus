package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class s3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.p3 f170441d;

    public s3(com.tencent.mm.plugin.sns.ui.p3 p3Var) {
        this.f170441d = p3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.p3 p3Var = this.f170441d;
        if (com.tencent.mm.plugin.sns.ui.p3.c(p3Var) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$2");
            return;
        }
        if (com.tencent.mm.plugin.sns.ui.p3.d(p3Var) != null) {
            com.tencent.mm.plugin.sns.ui.p3.d(p3Var).a(com.tencent.mm.plugin.sns.ui.p3.c(p3Var));
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11989, 3, com.tencent.mm.plugin.sns.ui.p3.c(p3Var).field_snsId == 0 ? "" : ca4.z0.t0(com.tencent.mm.plugin.sns.ui.p3.c(p3Var).field_snsId), 0);
        int i17 = com.tencent.mm.plugin.sns.ui.p3.c(p3Var).localid;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        android.content.Context context = p3Var.f170139e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        intent.setClass(context, com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.class);
        intent.putExtra("INTENT_TALKER", com.tencent.mm.plugin.sns.ui.p3.c(p3Var).getUserName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        boolean z17 = p3Var.f170149r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        intent.putExtra("INTENT_STAR_LIST", z17);
        intent.putExtra("INTENT_SNS_LOCAL_ID", com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", i17));
        intent.putExtra("INTENT_FROMGALLERY", true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        java.lang.String str = p3Var.f170150s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        int i18 = p3Var.f170152u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        intent.putExtra("INTENT_ALBUM_SCENE", i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        android.content.Context context2 = p3Var.f170139e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        ((com.tencent.mm.ui.MMActivity) context2).startActivityForResult(intent, 1);
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.Q().f60451k = 1L;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$2");
    }
}
