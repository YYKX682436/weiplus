package ee4;

/* loaded from: classes4.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(java.lang.String str, java.lang.String str2) {
        super(0);
        this.f251754d = str;
        this.f251755e = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$dealAlertTips$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$dealAlertTips$2");
        ke4.a aVar = ke4.a.f307025a;
        java.lang.String snsSessionId = this.f251754d;
        kotlin.jvm.internal.o.f(snsSessionId, "$snsSessionId");
        aVar.d(1, snsSessionId, this.f251755e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$dealAlertTips$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$dealAlertTips$2");
        return f0Var;
    }
}
