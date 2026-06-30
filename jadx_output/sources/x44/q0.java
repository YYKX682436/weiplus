package x44;

/* loaded from: classes4.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w44.b f451878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x44.r0 f451879e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(w44.b bVar, x44.r0 r0Var) {
        super(0);
        this.f451878d = bVar;
        this.f451879e = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment$doAction$1");
        x44.r0 r0Var = this.f451879e;
        w44.b bVar = this.f451878d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment$doAction$1");
        try {
            if (!((com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI) bVar.a()).isFinishing() && !((com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI) bVar.a()).isDestroyed()) {
                ((com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI) bVar.a()).V6();
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 209);
            java.lang.String k17 = bVar.b().k();
            if (k17 == null) {
                k17 = "";
            }
            com.tencent.mm.autogen.events.SnsAdNotifyTimelineCommentEvent snsAdNotifyTimelineCommentEvent = new com.tencent.mm.autogen.events.SnsAdNotifyTimelineCommentEvent();
            snsAdNotifyTimelineCommentEvent.f54797g.f6709a = k17;
            com.tencent.mars.xlog.Log.i("SnsAdJs.NotifyTimelineComment", "event publish, snsId is ".concat(k17));
            snsAdNotifyTimelineCommentEvent.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment");
            org.json.JSONObject l17 = r0Var.l();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment");
            r0Var.b(l17);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdJs.NotifyTimelineComment failed", th6);
            r0Var.b(r0Var.g("SnsAdJs.NotifyTimelineComment failed: " + th6.getMessage()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment$doAction$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment$doAction$1");
        return f0Var;
    }
}
