package fc4;

/* loaded from: classes4.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc4.p f261181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f261182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ib6 f261183f;

    public l(fc4.p pVar, byte[] bArr, r45.ib6 ib6Var) {
        this.f261181d = pVar;
        this.f261182e = bArr;
        this.f261183f = ib6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int Ni;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC$dealCutSameJumpClick$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/flexible/FlexibleSameStyleUIC$dealCutSameJumpClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getScene$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        fc4.p pVar = this.f261181d;
        int i17 = pVar.f261193e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getScene$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        if (i17 == 0) {
            dx1.g.f244489a.i("SnsPublishProcess", "fromPage", 1);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getScene$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
            int i18 = pVar.f261193e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getScene$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
            if (i18 == 1) {
                dx1.g.f244489a.i("SnsPublishProcess", "fromPage", 4);
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("album_template_info", this.f261182e);
        intent.putExtra("key_sns_publish_template", true);
        intent.putExtra("key_filter_hdr_video", true);
        uy0.h hVar = (uy0.h) i95.n0.c(uy0.h.class);
        r45.ib6 ib6Var = this.f261183f;
        java.lang.String templateId = ib6Var.f376910e;
        kotlin.jvm.internal.o.f(templateId, "templateId");
        ((ez0.i) hVar).getClass();
        nz0.o.f341530a.e(templateId, 4);
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPublish$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        java.lang.String str = pVar.f261194f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPublish$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        s0Var.c(str, 2, ib6Var.f376910e, ib6Var.f376911f);
        if (android.text.TextUtils.isEmpty(ib6Var.f376915m)) {
            Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_num, 20);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + Ni);
        } else {
            Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_publish_ai_template_image_litmit, 9);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishAITemplateImageLimit: " + Ni);
        }
        com.tencent.mm.pluginsdk.ui.tools.l7.c(pVar.getActivity(), 4098, Ni, 4, 3, com.tencent.mm.plugin.sns.ui.ws.a(), intent);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleSameStyleUIC$dealCutSameJumpClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC$dealCutSameJumpClick$1");
    }
}
