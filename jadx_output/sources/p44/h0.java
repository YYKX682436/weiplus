package p44;

/* loaded from: classes4.dex */
public final class h0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p44.r f351793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p44.o0 f351794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f351795f;

    public h0(p44.r rVar, p44.o0 o0Var, kotlin.jvm.internal.c0 c0Var) {
        this.f351793d = rVar;
        this.f351794e = o0Var;
        this.f351795f = c0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        java.lang.String a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2$1");
        i64.p pVar = (i64.p) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe countTitle is ");
        org.json.JSONObject jSONObject = null;
        sb6.append(pVar != null ? pVar.a() : null);
        com.tencent.mars.xlog.Log.i("TimelineRandomPickLayoutCtrl", sb6.toString());
        java.lang.String a18 = pVar != null ? pVar.a() : null;
        boolean z17 = a18 == null || a18.length() == 0;
        kotlin.jvm.internal.c0 c0Var = this.f351795f;
        p44.o0 o0Var = this.f351794e;
        p44.r rVar = this.f351793d;
        if (z17) {
            boolean z18 = c0Var.f310112d;
            rVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str2 = rVar.f351843i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            p44.o0.a(o0Var, z18, str2, rVar.a());
        } else {
            try {
                jSONObject = new org.json.JSONObject(a18);
            } catch (org.json.JSONException unused) {
            }
            if (jSONObject == null || (str = jSONObject.optString("collectedCountInfo")) == null) {
                rVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                str = rVar.f351843i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            }
            if (jSONObject == null || (a17 = jSONObject.optString("involvedCountInfo")) == null) {
                a17 = rVar.a();
            }
            p44.o0.a(o0Var, c0Var.f310112d, str, a17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2$1");
        return f0Var;
    }
}
