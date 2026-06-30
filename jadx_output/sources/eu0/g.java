package eu0;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f256713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.l lVar) {
        super(1);
        this.f256713d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject result = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String jSONObject = result.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        this.f256713d.invoke(jSONObject);
        return jz5.f0.f302826a;
    }
}
