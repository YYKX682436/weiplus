package x64;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final x64.u f452333a = new x64.u();

    /* renamed from: b, reason: collision with root package name */
    public static kotlinx.coroutines.y0 f452334b;

    public final void a(android.view.View view, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18, java.lang.String str, int i19) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fetchContact", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        if (adClickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchContact", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            return;
        }
        java.lang.String str3 = adClickActionInfo.f162598o0;
        if (str3 == null || str3.length() == 0) {
            str2 = null;
        } else {
            str2 = "ADKEFU_" + adClickActionInfo.f162598o0;
        }
        if (str2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchContact", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            return;
        }
        com.tencent.mars.xlog.Log.i("AdJumpWxKefuClick", "fetchContact, kefuUrl is ".concat(str2));
        j41.h0 h0Var = new j41.h0(i19, "", str2);
        h0Var.f297635e = true;
        h0Var.f297637g = null;
        h0Var.f297638h = null;
        com.tencent.mm.ui.widget.dialog.u3 Q = context instanceof android.app.Activity ? db5.e1.Q(context, "", ((android.app.Activity) context).getString(com.tencent.mm.R.string.f490468vx), false, true, null) : null;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1903, 14);
        j41.y yVar = (j41.y) i95.n0.c(j41.y.class);
        x64.n nVar = new x64.n(new java.lang.ref.WeakReference(context), new java.lang.ref.WeakReference(Q), new java.lang.ref.WeakReference(view), adClickActionInfo, snsInfo, i18, i17, str);
        ((l41.b2) yVar).getClass();
        k41.h1.b(h0Var, new l41.z1(h0Var, nVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchContact", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
    }

    public final void b(android.content.Context adContext, java.lang.String jumpKefuUrl, java.lang.String uxInfo, int i17, boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToWxKefuPage", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        kotlin.jvm.internal.o.g(adContext, "adContext");
        kotlin.jvm.internal.o.g(jumpKefuUrl, "jumpKefuUrl");
        kotlin.jvm.internal.o.g(uxInfo, "uxInfo");
        com.tencent.mars.xlog.Log.i("AdJumpWxKefuClick", "jumpToWxKefuPage() called with: jumpKefuUrl = " + jumpKefuUrl + ", isFromLandingPage = " + z17);
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest();
        openIMKefuStartConversationRequest.f72272d = adContext;
        openIMKefuStartConversationRequest.f72274f = i17;
        r45.s4 s4Var = new r45.s4();
        s4Var.f385486d = jumpKefuUrl;
        s4Var.f385487e = jumpKefuUrl;
        r45.l05 l05Var = new r45.l05();
        l05Var.f379061f = jumpKefuUrl;
        l05Var.f379059d = i17;
        l05Var.f379060e = uxInfo;
        s4Var.f385489g = l05Var;
        openIMKefuStartConversationRequest.f72277i = s4Var;
        openIMKefuStartConversationRequest.f72273e = java.lang.System.currentTimeMillis();
        openIMKefuStartConversationRequest.f72276h = j41.f0.a(i17);
        openIMKefuStartConversationRequest.f72281p = true;
        android.content.res.Resources resources = adContext.getResources();
        if (resources == null || (str = resources.getString(com.tencent.mm.R.string.hez)) == null) {
            str = "";
        }
        openIMKefuStartConversationRequest.f72282q = str;
        android.content.Intent intent = new android.content.Intent();
        openIMKefuStartConversationRequest.f72288w = intent;
        android.os.Handler createFreeHandler = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
        kotlin.jvm.internal.o.f(createFreeHandler, "createFreeHandler(...)");
        intent.putExtra("key_result_receiver", new com.tencent.mm.openim.model.OpenImKefuStartChattingResultReceiver(createFreeHandler, new x64.o(new java.lang.ref.WeakReference(adContext), z17)));
        j41.z zVar = (j41.z) i95.n0.c(j41.z.class);
        if (zVar != null) {
            ((l41.g2) zVar).Bi(openIMKefuStartConversationRequest);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToWxKefuPage", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
    }

    public final void c(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpWxKefu", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1903, 5);
        d(adClickActionInfo != null ? adClickActionInfo.f162598o0 : null, snsInfo != null ? snsInfo.getUxinfo() : null, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWxKefu", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
    }

    public final void d(java.lang.String str, java.lang.String str2, android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpWxKefu", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0) && context != null) {
                kotlinx.coroutines.y0 y0Var = f452334b;
                if (y0Var != null) {
                    kotlinx.coroutines.z0.c(y0Var, null);
                }
                kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
                f452334b = b17;
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new x64.t(context, str, str2, null), 2, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWxKefu", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("AdJumpWxKefuClick", "jumpkefu param is null!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWxKefu", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
    }
}
