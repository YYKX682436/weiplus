package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class nx extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f119214d;

    /* renamed from: e, reason: collision with root package name */
    public int f119215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rx f119216f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f119217g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(com.tencent.mm.plugin.finder.live.widget.rx rxVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119216f = rxVar;
        this.f119217g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.nx(this.f119216f, this.f119217g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.nx) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.widget.rx rxVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f119215e;
        com.tencent.mm.plugin.finder.live.widget.rx rxVar2 = this.f119216f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f119214d = rxVar2;
            this.f119215e = 1;
            obj = com.tencent.mm.plugin.finder.live.widget.rx.e0(rxVar2, this);
            if (obj == aVar) {
                return aVar;
            }
            rxVar = rxVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rxVar = (com.tencent.mm.plugin.finder.live.widget.rx) this.f119214d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        rxVar.S = (java.util.LinkedList) obj;
        yz5.l lVar = this.f119217g;
        if (lVar != null) {
            lVar.invoke(rxVar2.S);
        }
        return jz5.f0.f302826a;
    }
}
