package fh1;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f262589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f262591f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(fh1.z zVar, java.lang.String str, int i17) {
        super(0);
        this.f262589d = zVar;
        this.f262590e = str;
        this.f262591f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fh1.x0 a17 = this.f262589d.a();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, this.f262590e);
        jSONObject.put("frameId", this.f262591f);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        a17.G1("onMessageFromMiniprogram", jSONObject2);
        return jz5.f0.f302826a;
    }
}
