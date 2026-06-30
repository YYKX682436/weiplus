package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ig extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f118672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bh f118673e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.widget.bh bhVar) {
        super(2, continuation);
        this.f118672d = hVar;
        this.f118673e = bhVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.ig(this.f118672d, continuation, this.f118673e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.ig igVar = (com.tencent.mm.plugin.finder.live.widget.ig) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        igVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f118672d).f454381b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finderlivefanclubgetcustomgi errType:");
        rm0.j jVar = aVar2.f454379a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f397424e) : null);
        sb6.append(", errCode:");
        rm0.j jVar2 = aVar2.f454379a;
        sb6.append(jVar2 != null ? new java.lang.Integer(jVar2.f397425f) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveFansListWidget", sb6.toString());
        this.f118673e.f117893x.setText(com.tencent.mm.R.string.f491525de1);
        return jz5.f0.f302826a;
    }
}
