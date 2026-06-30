package ya2;

/* loaded from: classes8.dex */
public abstract class w1 {
    public static final void a(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.extension.reddot.jb localCtrlInfo) {
        kotlin.jvm.internal.o.g(linkedList, "<this>");
        kotlin.jvm.internal.o.g(localCtrlInfo, "localCtrlInfo");
        r45.vs2 vs2Var = localCtrlInfo.field_ctrInfo;
        if (vs2Var != null) {
            linkedList.add(vs2Var);
            return;
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        boolean Fk = ((c61.l7) ((zy2.b6) c17)).Fk();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("tips_id", localCtrlInfo.field_tipsId);
        jSONObject.put("tips_uuid", localCtrlInfo.field_tips_uuid);
        jSONObject.put("is_field_ctrInfo_null", localCtrlInfo.field_ctrInfo == null);
        r45.vs2 vs2Var2 = localCtrlInfo.field_ctrInfo;
        jSONObject.put("field_ctrInfo_tips_id", vs2Var2 != null ? vs2Var2.f388490h : null);
        r45.vs2 vs2Var3 = localCtrlInfo.field_ctrInfo;
        jSONObject.put("field_ctrInfo_tips_uuid", vs2Var3 != null ? vs2Var3.f388503x : null);
        jSONObject.put("paths", localCtrlInfo.J0());
        jSONObject.put("stack", com.tencent.mm.sdk.platformtools.z3.b(true));
        pm0.z.b(xy2.b.f458155b, "SyncArgs_addCtrlInfo_ctrInfo_null", false, pm0.w.f356806g, null, false, Fk, new ya2.v1(jSONObject), 24, null);
    }
}
