package x44;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.s f451871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x44.s sVar) {
        super(2);
        this.f451871d = sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$doAction$1");
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String rspUsername = (java.lang.String) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$doAction$1");
        kotlin.jvm.internal.o.g(rspUsername, "rspUsername");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$toJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
        this.f451871d.q(intValue, rspUsername);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$toJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$doAction$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$doAction$1");
        return f0Var;
    }
}
