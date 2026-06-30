package mu2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final mu2.b f331394a = new mu2.b();

    public final void a(android.content.Context context, java.lang.String eid, int i17, long j17, long j18, java.lang.String topicName) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(eid, "eid");
        kotlin.jvm.internal.o.g(topicName, "topicName");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("feedid", pm0.v.u(j17));
            jSONObject.put("topicid", pm0.v.u(j18));
            jSONObject.put("topicname", topicName);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, eid, i17, jSONObject, false, null, 48, null);
    }
}
