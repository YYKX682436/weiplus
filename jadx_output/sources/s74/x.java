package s74;

/* loaded from: classes4.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404585f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s74.o0 o0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404584e = snsInfo;
        this.f404585f = o0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$onResume$1");
        s74.x xVar = new s74.x(this.f404584e, this.f404585f, continuation);
        xVar.f404583d = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$onResume$1");
        return xVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$onResume$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$onResume$1");
        s74.x xVar = (s74.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$onResume$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$onResume$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$onResume$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f404583d;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f404584e;
        com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
        kotlin.jvm.internal.o.f(adXml, "getAdXml(...)");
        com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo adCardActionBtnInfo = adXml.adCardActionBtnInfo;
        boolean z17 = (adCardActionBtnInfo == null || (adClickActionInfo = adCardActionBtnInfo.clickActionInfo) == null || adClickActionInfo.f162571b != 2) ? false : true;
        s74.o0 o0Var = this.f404585f;
        if (z17) {
            s74.f3 D = o0Var.D();
            if ((D != null ? D.g() : null) != null) {
                com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo2 = adCardActionBtnInfo.clickActionInfo;
                java.lang.String str = adClickActionInfo2 != null ? adClickActionInfo2.A : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = adClickActionInfo2 != null ? adClickActionInfo2.B : null;
                kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new s74.u(str, str2 != null ? str2 : "", null), 2, null);
            }
        }
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo3 = adXml.adActionLinkClickInfo;
        if (adClickActionInfo3 != null && adXml.adCheckDownloadAppInfo != null) {
            if (adClickActionInfo3 != null && adClickActionInfo3.a()) {
                s74.f3 D2 = o0Var.D();
                if ((D2 != null ? D2.d() : null) != null) {
                    com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo4 = adXml.adActionLinkClickInfo;
                    kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new s74.v(adClickActionInfo4.A, adClickActionInfo4.B, null), 2, null);
                }
            }
        }
        kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new s74.w(snsInfo, null), 2, null);
        e74.i.f().k(snsInfo, o0Var.H(), true);
        e74.i.f().j(snsInfo, o0Var.H(), false);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$onResume$1");
        return f0Var;
    }
}
