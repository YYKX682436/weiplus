package l44;

/* loaded from: classes3.dex */
public final class h5 implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f316167a;

    public h5(kotlinx.coroutines.q qVar) {
        this.f316167a = qVar;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2$1$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2$1$1");
        boolean z17 = obj instanceof java.lang.String;
        kotlinx.coroutines.q qVar = this.f316167a;
        if (!z17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2$1$1");
            return;
        }
        try {
            jSONObject = new org.json.JSONObject((java.lang.String) obj);
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper");
            com.tencent.mars.xlog.Log.e("FollowRequestHelper", th6.toString());
            jSONObject = null;
        }
        if (jSONObject == null) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2$1$1");
            return;
        }
        jSONObject.optString("errMsg");
        java.lang.String optString = jSONObject.optString("respUsername");
        if (i17 == 0 && i18 == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        } else {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2$1$1");
    }
}
