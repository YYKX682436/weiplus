package xu2;

/* loaded from: classes3.dex */
public final class r extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xu2.u f457227a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xu2.u uVar, long j17) {
        super(j17, 100L);
        this.f457227a = uVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        xu2.u uVar = this.f457227a;
        uVar.getClass();
        pm0.v.X(new xu2.o(uVar, true));
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        xu2.u uVar = this.f457227a;
        ((mm2.c1) uVar.S0().a(mm2.c1.class)).K5 = (int) ((((mm2.c1) uVar.S0().a(mm2.c1.class)).J5 - (j17 / 1000)) - 1);
        if (uVar.v1() > 0 && !((mm2.c1) uVar.S0().a(mm2.c1.class)).M5) {
            xu2.v vVar = uVar.f457232r;
            if (vVar != null) {
                r45.i33 i33Var = vVar.f457240b;
                vVar.a();
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
                    optJSONObject.put("exp_time", vVar.f457244f);
                    optJSONObject.put("clk_time", 0);
                    jSONObject.put("weapp_extra_data", optJSONObject.toString());
                    long j18 = vVar.f457246h;
                    long j19 = vVar.f457245g;
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    new ek2.h0(j18, j19, 1, jSONObject2).l().f(vVar.f457239a);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(vVar.f457241c, th6, "reportFirstPlay", new java.lang.Object[0]);
                }
            }
            ((mm2.c1) uVar.S0().a(mm2.c1.class)).M5 = true;
        }
        pm0.v.X(new xu2.o(uVar, false));
    }
}
