package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.z0 f143832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.lite.jsapi.comms.z0 z0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f143832d = z0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.lite.jsapi.comms.y0(this.f143832d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.lite.jsapi.comms.y0 y0Var = (com.tencent.mm.plugin.lite.jsapi.comms.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class)) != null) {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("isClose", ((((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EmotionRewardOption", 0) & 1) == 1 ? 0 : 1) ^ 1);
        } else {
            jSONObject = null;
        }
        this.f143832d.f143443f.c(jSONObject, false);
        return jz5.f0.f302826a;
    }
}
