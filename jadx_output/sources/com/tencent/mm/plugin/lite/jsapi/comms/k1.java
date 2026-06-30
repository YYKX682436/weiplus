package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f143630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.l1 f143632f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(java.lang.String str, com.tencent.mm.plugin.lite.jsapi.comms.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f143631e = str;
        this.f143632f = l1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.lite.jsapi.comms.k1(this.f143631e, this.f143632f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.lite.jsapi.comms.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f143630d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
            if (o6Var == null) {
                jSONObject = null;
                this.f143632f.f143443f.c(jSONObject, false);
                return jz5.f0.f302826a;
            }
            java.lang.String productId = this.f143631e;
            kotlin.jvm.internal.o.f(productId, "$productId");
            this.f143630d = 1;
            obj = ((com.tencent.mm.feature.emoji.c4) o6Var).Ui(productId, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jSONObject = (org.json.JSONObject) obj;
        this.f143632f.f143443f.c(jSONObject, false);
        return jz5.f0.f302826a;
    }
}
