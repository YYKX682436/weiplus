package j94;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final j94.g f298554a = new j94.g();

    public static final void a(j94.g gVar, android.content.Context context, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo adJumpKefuConfirmInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$jumpToConfirmPage", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
        gVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToConfirmPage", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("click_action_type", 18);
        intent.putExtra("ad_uxInfo", str2);
        intent.putExtra("ad_source", 0);
        intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_IS_HALF_SCREEN, 0);
        intent.putExtra("kefu_confirm_info", adJumpKefuConfirmInfo);
        intent.putExtra("kefu_url", str);
        intent.putExtra("scroll_to_top", 0);
        intent.setClass(context, com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdGeneralPageUI.class);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/wsfold/helper/WsFoldJumpWxKefuHelper", "jumpToConfirmPage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/ad/adxml/AdJumpKefuConfirmInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/ad/wsfold/helper/WsFoldJumpWxKefuHelper", "jumpToConfirmPage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/ad/adxml/AdJumpKefuConfirmInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToConfirmPage", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$jumpToConfirmPage", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
    }

    public final void b(android.content.Context context, java.lang.String str, java.lang.String str2, r45.e80 e80Var) {
        com.tencent.mm.ui.widget.dialog.u3 Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fetchContactThenJump", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
        java.lang.String str3 = "ADKEFU_" + str;
        com.tencent.mars.xlog.Log.i("WsFoldJumpWxKefuHelper", "fetchContactThenJump, prefixedUrl=%s", str3);
        j41.h0 h0Var = new j41.h0(23, "", str3);
        h0Var.f297635e = true;
        h0Var.f297637g = null;
        h0Var.f297638h = null;
        if (context instanceof android.app.Activity) {
            try {
                Q = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.f490468vx), false, true, null);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("WsFoldJumpWxKefuHelper", "showProgressDlg exp=%s", th6.toString());
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1903L, 14L);
            j41.y yVar = (j41.y) i95.n0.c(j41.y.class);
            j94.f fVar = new j94.f(context, Q, str, str2, e80Var);
            ((l41.b2) yVar).getClass();
            k41.h1.b(h0Var, new l41.z1(h0Var, fVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchContactThenJump", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
        }
        Q = null;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1903L, 14L);
        j41.y yVar2 = (j41.y) i95.n0.c(j41.y.class);
        j94.f fVar2 = new j94.f(context, Q, str, str2, e80Var);
        ((l41.b2) yVar2).getClass();
        k41.h1.b(h0Var, new l41.z1(h0Var, fVar2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchContactThenJump", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
    }
}
