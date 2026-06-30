package cv4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/l;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class l extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null || !jSONObject.has("bizName") || !jSONObject.has("bizKey")) {
            this.f143443f.a("Require bizName and bizKey");
            return;
        }
        java.lang.String optString = jSONObject.optString("bizName");
        int i17 = (!kotlin.jvm.internal.o.b(optString, "k1kVideo") && kotlin.jvm.internal.o.b(optString, ya.a.SEARCH)) ? 30 : 27;
        java.lang.String optString2 = jSONObject.optString("bizKey");
        kotlin.jvm.internal.o.d(optString2);
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        multiTaskInfo.field_id = optString2;
        multiTaskInfo.field_type = i17;
        this.f143443f.b(kz5.c1.l(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, java.lang.Integer.valueOf(((com.tencent.mm.plugin.multitask.p1) l0Var).Ri(multiTaskInfo) ? 1 : 0))));
    }
}
