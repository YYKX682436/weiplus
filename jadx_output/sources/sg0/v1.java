package sg0;

/* loaded from: classes8.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.a2 f407827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f407828e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(sg0.a2 a2Var, org.json.JSONObject jSONObject) {
        super(0);
        this.f407827d = a2Var;
        this.f407828e = jSONObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sg0.a2 a2Var = this.f407827d;
        kz5.h0.B(a2Var.f407671i, sg0.u1.f407817d);
        java.util.Iterator it = ((java.util.ArrayList) a2Var.f407671i).iterator();
        while (it.hasNext()) {
            ((sg0.k1) it.next()).getClass();
            org.json.JSONObject ret = this.f407828e;
            kotlin.jvm.internal.o.g(ret, "ret");
        }
        return jz5.f0.f302826a;
    }
}
