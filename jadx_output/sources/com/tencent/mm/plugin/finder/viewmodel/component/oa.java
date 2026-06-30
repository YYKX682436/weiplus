package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes15.dex */
public final class oa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f135456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC f135457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135457e = finderEmojiListUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.oa(this.f135457e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.oa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f135456d;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC = this.f135457e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            finderEmojiListUIC.B.d(finderEmojiListUIC.P6());
            com.tencent.wechat.aff.emoticon.i iVar = finderEmojiListUIC.B;
            iVar.f216649f = false;
            this.f135456d = 1;
            if (iVar.a(false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.finder.viewmodel.component.na naVar = new com.tencent.mm.plugin.finder.viewmodel.component.na(finderEmojiListUIC, null);
        this.f135456d = 2;
        if (kotlinx.coroutines.l.g(g3Var, naVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
