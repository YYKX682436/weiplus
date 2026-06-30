package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class h3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.o3 f168487d;

    public h3(com.tencent.mm.plugin.sns.ui.o3 o3Var) {
        this.f168487d = o3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.o3 o3Var = this.f168487d;
        if (com.tencent.mm.plugin.sns.ui.o3.c(o3Var) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$1");
            return;
        }
        if (com.tencent.mm.plugin.sns.ui.o3.c(o3Var).getLikeFlag() == 0) {
            if (com.tencent.mm.plugin.sns.ui.o3.c(o3Var).isExtFlag()) {
                com.tencent.mm.plugin.sns.storage.SnsInfo c17 = com.tencent.mm.plugin.sns.ui.o3.c(o3Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
                int i17 = o3Var.f170082m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
                com.tencent.mm.plugin.sns.model.d6.m(c17, 1, "", 0L, "", false, i17);
            } else {
                java.lang.String str = com.tencent.mm.plugin.sns.ui.o3.c(o3Var).field_userName;
                com.tencent.mm.plugin.sns.storage.SnsInfo c18 = com.tencent.mm.plugin.sns.ui.o3.c(o3Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
                int i18 = o3Var.f170082m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
                com.tencent.mm.plugin.sns.model.d6.p(str, 5, null, c18, i18);
            }
            com.tencent.mm.plugin.sns.ui.o3.c(o3Var).setLikeFlag(1);
            com.tencent.mm.plugin.sns.model.l4.Fj().V2(com.tencent.mm.plugin.sns.ui.o3.c(o3Var));
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.Q().f60459s = 2L;
        } else {
            com.tencent.mm.plugin.sns.ui.o3.c(o3Var).setLikeFlag(0);
            com.tencent.mm.plugin.sns.model.l4.Fj().V2(com.tencent.mm.plugin.sns.ui.o3.c(o3Var));
            com.tencent.mm.plugin.sns.model.d6.a(com.tencent.mm.plugin.sns.ui.o3.c(o3Var).getSnsId());
            com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(com.tencent.mm.plugin.sns.ui.o3.c(o3Var).field_snsId);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            o3Var.f170078f = W0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.Q().f60459s = 4L;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11989, 1, com.tencent.mm.plugin.sns.ui.o3.c(o3Var).field_snsId == 0 ? "" : ca4.z0.t0(com.tencent.mm.plugin.sns.ui.o3.c(o3Var).field_snsId), 0);
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.sns.ui.g3(this), 500L);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$1");
    }
}
