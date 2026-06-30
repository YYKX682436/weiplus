package oe2;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final oe2.x f344786a = new oe2.x();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f344787b = jz5.h.b(oe2.w.f344785d);

    public static final void a(oe2.x xVar, dm.s4 s4Var) {
        xVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "checkAndInsert ".concat(pm0.v.u(s4Var.field_liveId)));
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        long j17 = s4Var.field_liveId;
        oe2.v vVar = new oe2.v(s4Var);
        qs5.d dVar = qs5.d.f366426e;
        s40.w0.u9(w0Var, j17, false, null, vVar, 1, null, null, null, 224, null);
    }

    public static final rl2.v b(oe2.x xVar) {
        xVar.getClass();
        return (rl2.v) ((jz5.n) f344787b).getValue();
    }

    public final dm.s4 c(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            dm.s4 s4Var = new dm.s4();
            s4Var.field_liveId = pm0.v.Z(jSONObject.getString("liveid"));
            s4Var.field_hostRoomId = str;
            s4Var.field_timeStamp = jSONObject.optLong("createtime", c01.id.e());
            s4Var.field_anchorWxUsername = jSONObject.getString("livesendername");
            s4Var.field_anchorFinderUsername = jSONObject.getString("liveusername");
            s4Var.field_anchorFinderNickname = jSONObject.getString("nickname");
            s4Var.field_finderObjectId = pm0.v.Z(jSONObject.getString("finderobjectid"));
            s4Var.field_finderNonceId = jSONObject.optString("findernonceid");
            if (s4Var.field_liveId != 0) {
                return s4Var;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "liveId invalid, json:" + jSONObject);
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderLiveTipsBarDataEventReceiver", th6, "jsonToBaseFinderLiveTipsBar", new java.lang.Object[0]);
            pm0.z.b(xy2.b.f458155b, "parseNewXmlToTipsBarData_item", false, null, null, false, false, null, 124, null);
            return null;
        }
    }
}
