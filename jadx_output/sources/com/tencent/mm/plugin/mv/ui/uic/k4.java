package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class k4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f151246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f151247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.v4 f151248f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.c3 f151249g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f151250h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(kotlinx.coroutines.flow.j jVar, com.tencent.mm.plugin.mv.ui.uic.v4 v4Var, com.tencent.mm.plugin.mv.ui.uic.c3 c3Var, java.util.HashMap hashMap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151247e = jVar;
        this.f151248f = v4Var;
        this.f151249g = c3Var;
        this.f151250h = hashMap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mv.ui.uic.k4(this.f151247e, this.f151248f, this.f151249g, this.f151250h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.mv.ui.uic.k4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f151246d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.mv.ui.uic.j4 j4Var = new com.tencent.mm.plugin.mv.ui.uic.j4(this.f151248f, this.f151249g, this.f151250h);
            this.f151246d = 1;
            if (this.f151247e.a(j4Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
