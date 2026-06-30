package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f143757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f143758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.s0 f143760g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(boolean z17, java.lang.String str, com.tencent.mm.plugin.lite.jsapi.comms.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f143758e = z17;
        this.f143759f = str;
        this.f143760g = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.lite.jsapi.comms.r0(this.f143758e, this.f143759f, this.f143760g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.lite.jsapi.comms.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f143757d;
        com.tencent.mm.plugin.lite.jsapi.comms.s0 s0Var = this.f143760g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f143758e;
            java.lang.String designerId = this.f143759f;
            if (z17) {
                com.tencent.mars.xlog.Log.i("emoticonGetEmoticonDesigner", "force");
                com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
                kotlin.jvm.internal.o.f(designerId, "$designerId");
                this.f143757d = 1;
                obj = ((com.tencent.mm.feature.emoji.c4) o6Var).cj(designerId, this);
                if (obj == aVar) {
                    return aVar;
                }
                s0Var.f143443f.c((org.json.JSONObject) obj, false);
            } else {
                com.tencent.mm.feature.emoji.api.o6 o6Var2 = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
                kotlin.jvm.internal.o.f(designerId, "$designerId");
                this.f143757d = 2;
                obj = ((com.tencent.mm.feature.emoji.c4) o6Var2).bj(designerId, this);
                if (obj == aVar) {
                    return aVar;
                }
                s0Var.f143443f.c((org.json.JSONObject) obj, false);
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            s0Var.f143443f.c((org.json.JSONObject) obj, false);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            s0Var.f143443f.c((org.json.JSONObject) obj, false);
        }
        return jz5.f0.f302826a;
    }
}
