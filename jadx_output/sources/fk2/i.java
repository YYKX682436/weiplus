package fk2;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.k f263401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f263402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fk2.k kVar, int i17, java.lang.String str) {
        super(0);
        this.f263401d = kVar;
        this.f263402e = i17;
        this.f263403f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fk2.k kVar = this.f263401d;
        if (!kVar.f445240a.t()) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.g4[] g4VarArr = ml2.g4.f327479d;
            ml2.h4[] h4VarArr = ml2.h4.f327523d;
            jSONObject.put("type", 3);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str = this.f263403f;
            if (str == null) {
                str = "";
            }
            jSONObject.put("doc", fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            r0Var.getClass();
            ml2.r0.hj(r0Var, ml2.b4.R, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
        kVar.f445240a.o(false, this.f263402e);
        return jz5.f0.f302826a;
    }
}
