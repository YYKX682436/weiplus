package s74;

/* loaded from: classes4.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.ADXml f404524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404525g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s74.o2 o2Var, com.tencent.mm.plugin.sns.storage.ADXml aDXml, s74.f3 f3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404523e = o2Var;
        this.f404524f = aDXml;
        this.f404525g = f3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$2");
        s74.r1 r1Var = new s74.r1(this.f404523e, this.f404524f, this.f404525g, continuation);
        r1Var.f404522d = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$2");
        return r1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$2");
        s74.r1 r1Var = (s74.r1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r1Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$2");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f404522d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$observeActionLinkUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        s74.o2 o2Var = this.f404523e;
        o2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("observeActionLinkUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.storage.ADXml aDXml = this.f404524f;
        if (aDXml != null && (adClickActionInfo = aDXml.adActionLinkClickInfo) != null && aDXml.adCheckDownloadAppInfo != null) {
            if (adClickActionInfo.a()) {
                s74.f3 f3Var = this.f404525g;
                androidx.appcompat.widget.AppCompatImageView c17 = f3Var.c();
                if (c17 != null) {
                    c17.setColorFilter(c17.getContext().getResources().getColor(com.tencent.mm.R.color.f478524a5), android.graphics.PorterDuff.Mode.SRC_IN);
                }
                if (f3Var.d() != null) {
                    com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo2 = aDXml.adActionLinkClickInfo;
                    java.lang.String str = adClickActionInfo2.A;
                    java.lang.String str2 = adClickActionInfo2.B;
                    kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new s74.m1(str, str2, null), 2, null);
                    kotlinx.coroutines.l.d(y0Var, null, null, new s74.o1(str, f3Var, o2Var, str2, null), 3, null);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("observeActionLinkUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$observeActionLinkUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$2");
        return f0Var;
    }
}
