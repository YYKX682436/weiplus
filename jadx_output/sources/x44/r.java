package x44;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f451881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x44.s f451882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yz5.p pVar, x44.s sVar) {
        super(2);
        this.f451881d = pVar;
        this.f451882e = sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$request$1");
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String respUsername = (java.lang.String) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$request$1");
        kotlin.jvm.internal.o.g(respUsername, "respUsername");
        yz5.p pVar = this.f451881d;
        if (intValue != 0 || android.text.TextUtils.isEmpty(respUsername)) {
            pVar.invoke(java.lang.Integer.valueOf(intValue), respUsername);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$request$1");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateContact", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
            this.f451882e.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateContact", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
            try {
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().updateContact(respUsername);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.FollowBrand", "there is an exception: " + th6.getMessage());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateContact", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateContact", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
            pVar.invoke(0, respUsername);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$request$1");
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$request$1");
        return f0Var;
    }
}
