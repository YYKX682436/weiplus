package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f143675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f143676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f143677f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f143678g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143679h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f143680i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.n1 f143681m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(int i17, long j17, int i18, java.lang.String str, int i19, com.tencent.mm.plugin.lite.jsapi.comms.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f143676e = i17;
        this.f143677f = j17;
        this.f143678g = i18;
        this.f143679h = str;
        this.f143680i = i19;
        this.f143681m = n1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.lite.jsapi.comms.m1(this.f143676e, this.f143677f, this.f143678g, this.f143679h, this.f143680i, this.f143681m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.lite.jsapi.comms.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f143675d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
            int i18 = this.f143676e;
            long j17 = this.f143677f;
            int i19 = this.f143678g;
            java.lang.String reqBufStr = this.f143679h;
            kotlin.jvm.internal.o.f(reqBufStr, "$reqBufStr");
            int i27 = this.f143680i;
            this.f143675d = 1;
            obj = ((com.tencent.mm.feature.emoji.c4) o6Var).hj(i18, j17, i19, reqBufStr, i27, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f143681m.f143443f.c((org.json.JSONObject) obj, false);
        return jz5.f0.f302826a;
    }
}
