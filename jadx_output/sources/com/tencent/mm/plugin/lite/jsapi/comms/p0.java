package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f143712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f143714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.q0 f143715g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String str, java.util.List list, com.tencent.mm.plugin.lite.jsapi.comms.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f143713e = str;
        this.f143714f = list;
        this.f143715g = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.lite.jsapi.comms.p0(this.f143713e, this.f143714f, this.f143715g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.lite.jsapi.comms.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f143712d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
            this.f143712d = 1;
            obj = ((com.tencent.mm.feature.emoji.c4) o6Var).Vi(this.f143713e, this.f143714f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        com.tencent.mm.plugin.lite.jsapi.comms.q0 q0Var = this.f143715g;
        if (jSONObject == null) {
            q0Var.f143443f.a("emoticonGetDesc:null data");
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", jSONObject);
            q0Var.f143443f.c(jSONObject2, false);
        }
        return jz5.f0.f302826a;
    }
}
