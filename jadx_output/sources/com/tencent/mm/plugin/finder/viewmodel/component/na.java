package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes15.dex */
public final class na extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC f135284d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135284d = finderEmojiListUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.na(this.f135284d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.na naVar = (com.tencent.mm.plugin.finder.viewmodel.component.na) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        naVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC = this.f135284d;
        finderEmojiListUIC.Q6().c(null, finderEmojiListUIC.B);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(finderEmojiListUIC.Q6(), false, 1, null);
        finderEmojiListUIC.Q6().requestRefresh();
        return jz5.f0.f302826a;
    }
}
