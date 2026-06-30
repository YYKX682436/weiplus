package lr2;

/* loaded from: classes3.dex */
public final class a implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mg0 f320717d;

    public a(r45.mg0 mg0Var) {
        this.f320717d = mg0Var;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String string = this.f320717d.getString(0);
        if (string == null) {
            string = "";
        }
        jSONObject.put("orderDetailsJson", string);
        return jSONObject.toString();
    }
}
