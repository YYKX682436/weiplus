package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm3.q f151025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(fm3.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151025d = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mv.ui.uic.a4(this.f151025d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.mv.ui.uic.a4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fm3.o oVar = this.f151025d.f264113n;
        if (oVar != null) {
            return oVar.e();
        }
        return null;
    }
}
