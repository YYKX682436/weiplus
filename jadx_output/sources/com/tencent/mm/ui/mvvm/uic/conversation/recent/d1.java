package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f209287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f209288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.z f209289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 f209290g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f209291h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f209292i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f209293m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(kotlinx.coroutines.flow.i2 i2Var, wi5.z zVar, com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 h1Var, java.util.List list, java.util.HashMap hashMap, kotlinx.coroutines.flow.i2 i2Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f209288e = i2Var;
        this.f209289f = zVar;
        this.f209290g = h1Var;
        this.f209291h = list;
        this.f209292i = hashMap;
        this.f209293m = i2Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.mvvm.uic.conversation.recent.d1(this.f209288e, this.f209289f, this.f209290g, this.f209291h, this.f209292i, this.f209293m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.ui.mvvm.uic.conversation.recent.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f209287d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.ui.mvvm.uic.conversation.recent.c1 c1Var = new com.tencent.mm.ui.mvvm.uic.conversation.recent.c1(this.f209289f, this.f209290g, this.f209291h, this.f209292i, this.f209293m);
            this.f209287d = 1;
            if (this.f209288e.a(c1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
