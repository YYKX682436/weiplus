package x44;

/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q64.b f451891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q64.b bVar) {
        super(1);
        this.f451891d = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser$onServerRun$2");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser$onServerRun$2");
        q64.b bVar = this.f451891d;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("followed", booleanValue);
            bundle.putInt("error", 0);
            ((r64.b) bVar).e(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser$onServerRun$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser$onServerRun$2");
        return f0Var;
    }
}
