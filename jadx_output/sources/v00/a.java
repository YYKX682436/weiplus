package v00;

/* loaded from: classes.dex */
public final class a implements c00.x2 {

    /* renamed from: a, reason: collision with root package name */
    public final f10.a f432193a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f432194b;

    public a(f10.a ecsEventAction, org.json.JSONObject eccEventParam) {
        kotlin.jvm.internal.o.g(ecsEventAction, "ecsEventAction");
        kotlin.jvm.internal.o.g(eccEventParam, "eccEventParam");
        this.f432193a = ecsEventAction;
        this.f432194b = eccEventParam;
    }

    public java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f432193a.getClass();
        jSONObject.put("action", "EcsEventActionShareDialogHandle");
        jSONObject.put("params", this.f432194b);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
