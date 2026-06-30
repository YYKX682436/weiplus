package zu2;

/* loaded from: classes8.dex */
public final class u extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zu2.a0 f475750g;

    public u(zu2.a0 a0Var) {
        this.f475750g = a0Var;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return event instanceof ec2.f;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            if (fVar.f250959d == 3) {
                zu2.a0 a0Var = this.f475750g;
                java.lang.String str = a0Var.f475692d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PlayEvent ev.video:");
                mn2.j4 j4Var = fVar.f250962g;
                sb6.append(j4Var != null ? j4Var.hashCode() : 0);
                sb6.append(", offset:");
                sb6.append(fVar.f250963h);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                if (kotlin.jvm.internal.o.b(a0Var.f475703r, fVar.f250962g) && java.lang.Math.abs(fVar.f250963h - a0Var.f475704s) <= 2 && a0Var.f475704s != fVar.f250963h) {
                    a0Var.f475701p++;
                }
                a0Var.f475703r = fVar.f250962g;
                a0Var.f475704s = fVar.f250963h;
                if (java.lang.Math.max(a0Var.f475699n - a0Var.f475701p, 0) > 0 && !a0Var.f475702q) {
                    zu2.q qVar = a0Var.f475694f;
                    if (qVar != null) {
                        r45.i33 i33Var = qVar.f475731a;
                        qVar.a();
                        try {
                            java.lang.String string = i33Var.getString(5);
                            if (string == null) {
                                string = "";
                            }
                            org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("weapp_extra_data");
                            if (optJSONObject == null) {
                                optJSONObject = new org.json.JSONObject();
                            }
                            jSONObject.put("report_type", 1);
                            jSONObject.put("report_link", i33Var.getString(3));
                            jSONObject.put("viewable", true);
                            jSONObject.put("exposure_type", 1);
                            optJSONObject.put("exp_time", qVar.f475735e);
                            optJSONObject.put("clk_time", 0);
                            jSONObject.put("weapp_extra_data", optJSONObject.toString());
                            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.K().r()).booleanValue()) {
                                java.lang.String jSONObject2 = jSONObject.toString();
                                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                                new db2.m2(1, jSONObject2, null).l();
                            } else {
                                java.lang.String jSONObject3 = jSONObject.toString();
                                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                                gm0.j1.d().g(new db2.w5(1, jSONObject3));
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.printErrStackTrace(qVar.f475732b, th6, "reportFirstPlay", new java.lang.Object[0]);
                        }
                    }
                    a0Var.f475702q = true;
                }
                pm0.v.X(new zu2.v(a0Var));
            }
        }
    }
}
