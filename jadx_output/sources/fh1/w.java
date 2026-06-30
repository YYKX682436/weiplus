package fh1;

/* loaded from: classes7.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f262610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fh1.z f262611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fh1.x0 f262612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262613g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262614h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f262615i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(fh1.z zVar, fh1.x0 x0Var, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f262611e = zVar;
        this.f262612f = x0Var;
        this.f262613g = str;
        this.f262614h = str2;
        this.f262615i = jSONObject;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fh1.w(this.f262611e, this.f262612f, this.f262613g, this.f262614h, this.f262615i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fh1.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f262610d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f262610d = 1;
            obj = this.f262611e.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            return f0Var;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", this.f262613g);
        jSONObject.put("envVersion", this.f262614h);
        org.json.JSONObject jSONObject2 = this.f262615i;
        if (jSONObject2 == null) {
            jSONObject2 = new org.json.JSONObject();
        }
        jSONObject.put("config", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        this.f262612f.G1("onWxConfigReady", jSONObject3);
        return f0Var;
    }
}
