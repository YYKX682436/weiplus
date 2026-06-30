package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f209320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f209321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 f209322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.z f209323g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f209324h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(kotlinx.coroutines.flow.i2 i2Var, com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 h1Var, wi5.z zVar, java.util.HashMap hashMap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f209321e = i2Var;
        this.f209322f = h1Var;
        this.f209323g = zVar;
        this.f209324h = hashMap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.mvvm.uic.conversation.recent.f1(this.f209321e, this.f209322f, this.f209323g, this.f209324h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.ui.mvvm.uic.conversation.recent.f1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f209320d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e1 e1Var = new com.tencent.mm.ui.mvvm.uic.conversation.recent.e1(this.f209322f, this.f209323g, this.f209324h);
            this.f209320d = 1;
            if (this.f209321e.a(e1Var, this) == aVar) {
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
