package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class sl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.zl f135908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135908d = zlVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.sl(this.f135908d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.sl slVar = (com.tencent.mm.plugin.finder.viewmodel.component.sl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        slVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar = this.f135908d;
        if (zlVar.f136691f.f122296a.size() > 0) {
            com.tencent.mm.plugin.finder.feed.tl tlVar = zlVar.f136690e;
            if (tlVar == null) {
                kotlin.jvm.internal.o.o("longVideoShareContract");
                throw null;
            }
            tlVar.g().c(new qr2.a(zlVar.f136691f.f122296a));
        }
        return jz5.f0.f302826a;
    }
}
