package fh1;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f262604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f262605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(fh1.z zVar, int i17) {
        super(0);
        this.f262604d = zVar;
        this.f262605e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fh1.z zVar = this.f262604d;
        java.lang.String str = zVar.f262631e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRemoveFrame frameId:");
        int i17 = this.f262605e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        fh1.x0 a17 = zVar.a();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("frameId", i17);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        a17.G1("onRemoveFrame", jSONObject2);
        return jz5.f0.f302826a;
    }
}
