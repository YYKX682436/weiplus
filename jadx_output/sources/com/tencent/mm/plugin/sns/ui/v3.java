package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class v3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.p3 f170620d;

    public v3(com.tencent.mm.plugin.sns.ui.p3 p3Var) {
        this.f170620d = p3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.p3 p3Var = this.f170620d;
        if (com.tencent.mm.plugin.sns.ui.p3.c(p3Var) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$5");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryFooterNew", "footer likeCmd click,%s", ca4.z0.t0(com.tencent.mm.plugin.sns.ui.p3.c(p3Var).field_snsId));
        if (com.tencent.mm.plugin.sns.ui.p3.c(p3Var).getLikeFlag() == 0) {
            if (com.tencent.mm.plugin.sns.ui.p3.c(p3Var).isExtFlag()) {
                gm0.j1.i();
                gm0.j1.n().f273288b.a(213, p3Var);
                gm0.j1.i();
                gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.pay.o1.CTRL_INDEX, p3Var);
                com.tencent.mm.plugin.sns.storage.SnsInfo c17 = com.tencent.mm.plugin.sns.ui.p3.c(p3Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                int i17 = p3Var.f170145n;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                com.tencent.mm.plugin.sns.model.d6.m(c17, 1, "", 0L, "", false, i17);
            } else {
                java.lang.String str = com.tencent.mm.plugin.sns.ui.p3.c(p3Var).field_userName;
                com.tencent.mm.plugin.sns.storage.SnsInfo c18 = com.tencent.mm.plugin.sns.ui.p3.c(p3Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                int i18 = p3Var.f170145n;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                com.tencent.mm.plugin.sns.model.d6.p(str, 5, null, c18, i18);
            }
            android.widget.LinearLayout linearLayout = p3Var.f170138d.f167822e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.haj);
            android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(200L);
            scaleAnimation.setStartOffset(100L);
            scaleAnimation.setRepeatCount(0);
            imageView.clearAnimation();
            imageView.startAnimation(scaleAnimation);
            scaleAnimation.setAnimationListener(new com.tencent.mm.plugin.sns.ui.q3(p3Var, linearLayout, null));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            com.tencent.mm.plugin.sns.ui.p3.c(p3Var).setLikeFlag(1);
            com.tencent.mm.plugin.sns.model.l4.Fj().V2(com.tencent.mm.plugin.sns.ui.p3.c(p3Var));
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.Q().f60459s = 2L;
            com.tencent.mm.plugin.sns.model.k7.f164367a.b(com.tencent.mm.plugin.sns.ui.p3.c(p3Var), 3);
        } else {
            com.tencent.mm.plugin.sns.ui.p3.c(p3Var).setLikeFlag(0);
            com.tencent.mm.plugin.sns.model.l4.Fj().V2(com.tencent.mm.plugin.sns.ui.p3.c(p3Var));
            com.tencent.mm.plugin.sns.model.d6.a(com.tencent.mm.plugin.sns.ui.p3.c(p3Var).getSnsId());
            com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(com.tencent.mm.plugin.sns.ui.p3.c(p3Var).field_snsId);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            p3Var.f170140f = W0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            boolean x17 = xa4.g.x(com.tencent.mm.plugin.sns.ui.p3.c(p3Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            p3Var.f170141g = x17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.Q().f60459s = 4L;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11989, 1, com.tencent.mm.plugin.sns.ui.p3.c(p3Var).field_snsId == 0 ? "" : ca4.z0.t0(com.tencent.mm.plugin.sns.ui.p3.c(p3Var).field_snsId), 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        com.tencent.mm.sdk.platformtools.n3 n3Var = p3Var.f170153v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        java.lang.Runnable runnable = p3Var.f170154w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        n3Var.removeCallbacks(runnable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        n3Var.postDelayed(runnable, 500L);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$5");
    }
}
