package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f209268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f209269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f209270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 f209271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f209272h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f209273i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(kotlinx.coroutines.flow.i2 i2Var, java.util.List list, com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 h1Var, java.util.HashMap hashMap, kotlinx.coroutines.flow.i2 i2Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f209269e = i2Var;
        this.f209270f = list;
        this.f209271g = h1Var;
        this.f209272h = hashMap;
        this.f209273i = i2Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.mvvm.uic.conversation.recent.b1(this.f209269e, this.f209270f, this.f209271g, this.f209272h, this.f209273i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.ui.mvvm.uic.conversation.recent.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f209268d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.ui.mvvm.uic.conversation.recent.a1 a1Var = new com.tencent.mm.ui.mvvm.uic.conversation.recent.a1(this.f209270f, this.f209271g, this.f209272h, this.f209273i);
            this.f209268d = 1;
            if (this.f209269e.a(a1Var, this) == aVar) {
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
