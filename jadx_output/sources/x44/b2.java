package x44;

/* loaded from: classes4.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q64.b f451790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(q64.b bVar, java.lang.String str) {
        super(2);
        this.f451790d = bVar;
        this.f451791e = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$onServerRun$1");
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$onServerRun$1");
        q64.b bVar = this.f451790d;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, intValue);
            bundle.putInt("state", intValue2);
            bundle.putString("hbCoverId", this.f451791e);
            ((r64.b) bVar).e(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$onServerRun$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$onServerRun$1");
        return f0Var;
    }
}
