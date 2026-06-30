package dv4;

/* loaded from: classes11.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final dv4.n f243999a;

    /* renamed from: b, reason: collision with root package name */
    public final double f244000b;

    public b(org.json.JSONObject data) {
        dv4.n nVar;
        kotlin.jvm.internal.o.g(data, "data");
        dv4.m mVar = dv4.n.f244017e;
        java.lang.String optString = data.optString("screenType", "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        mVar.getClass();
        int hashCode = optString.hashCode();
        if (hashCode == -1078030475) {
            if (optString.equals(ya.b.MEDIUM)) {
                nVar = dv4.n.f244020h;
            }
            nVar = dv4.n.f244018f;
        } else if (hashCode != 107348) {
            if (hashCode == 3202466 && optString.equals("high")) {
                nVar = dv4.n.f244021i;
            }
            nVar = dv4.n.f244018f;
        } else {
            if (optString.equals("low")) {
                nVar = dv4.n.f244019g;
            }
            nVar = dv4.n.f244018f;
        }
        this.f243999a = nVar;
        this.f244000b = data.optDouble("animationDuration", 0.25d);
    }
}
