package kw2;

/* loaded from: classes12.dex */
public final class k0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f313043a;

    public k0(org.json.JSONObject jSONObject) {
        this.f313043a = jSONObject;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        java.lang.Integer num = (java.lang.Integer) ((oh.b) o2Var.f395486c).f345175d.f395552a;
        kotlin.jvm.internal.o.d(num);
        int intValue = num.intValue();
        org.json.JSONObject jSONObject = this.f313043a;
        jSONObject.put("battLevelDetal", intValue);
        jSONObject.put("startPower", ((oh.b) o2Var.f395484a).f345175d.f395552a.intValue());
        jSONObject.put("endPower", ((oh.b) o2Var.f395485b).f345175d.f395552a.intValue());
    }
}
