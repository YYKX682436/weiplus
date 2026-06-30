package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class li implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.si f132605d;

    public li(com.tencent.mm.plugin.finder.view.si siVar) {
        this.f132605d = siVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.si siVar = this.f132605d;
        r45.qy0 qy0Var = siVar.f133044f;
        if (qy0Var == null || (str = qy0Var.getString(6)) == null) {
            str = "";
        }
        android.content.Context context = siVar.f133040b;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int i17 = nyVar != null ? nyVar.f135380n : 0;
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        long j17 = siVar.f133041c;
        java.lang.String format = java.lang.String.format("t=weixin_report/w_type&scene=%s&wechat_real_lang=%s&content_ID=%s&commentscene=%s", java.util.Arrays.copyOf(new java.lang.Object[]{58, d17, pm0.v.u(j17), java.lang.Integer.valueOf(i17)}, 4));
        kotlin.jvm.internal.o.f(format, "format(...)");
        java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, siVar.f133042d, i17);
        if (ek6.length() > 0) {
            format = java.lang.String.format(format.concat("&session_buffer=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{ek6}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
        }
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String str2 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            format = java.lang.String.format(format.concat("&context_id=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{str2}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
        }
        if (str.length() > 0) {
            format = java.lang.String.format(format.concat("&promotion_id=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
        }
        xc2.y2 y2Var = xc2.y2.f453343a;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        r45.k74 k74Var = new r45.k74();
        k74Var.set(0, "wxalite949d20096e938e0a9b88fb5793431a26");
        k74Var.set(2, format);
        finderJumpInfo.setLite_app_info(k74Var);
        xc2.y2.L(y2Var, context, new xc2.p0(finderJumpInfo), null, null, null, 28, null);
        siVar.dismiss();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("feedid", pm0.v.u(siVar.f133041c));
        lVarArr[1] = new jz5.l("ad_label_option_type", 3);
        java.lang.String string = siVar.f133044f.getString(4);
        lVarArr[2] = new jz5.l("promotion_buffer", string != null ? string : "");
        ((cy1.a) rVar).Bj("promotion_comment_ad_label_option", "view_clk", kz5.c1.k(lVarArr), 1, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
