package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f119826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f119827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f119828f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.widget.et etVar, kotlin.jvm.internal.c0 c0Var) {
        super(2, continuation);
        this.f119826d = hVar;
        this.f119827e = etVar;
        this.f119828f = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.sr(this.f119826d, continuation, this.f119827e, this.f119828f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.sr srVar = (com.tencent.mm.plugin.finder.live.widget.sr) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        srVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f119826d).f454381b;
        java.lang.String str = this.f119827e.f118280J;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[cgiDelLottery] fail, errCode = ");
        rm0.j jVar = aVar2.f454379a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f397425f) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        rm0.j jVar2 = aVar2.f454379a;
        if (jVar2 != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            int i17 = jVar2.f397424e;
            int i18 = jVar2.f397425f;
            com.tencent.mm.protobuf.f fVar = jVar2.f397427h;
            r45.q32 q32Var = fVar instanceof r45.q32 ? (r45.q32) fVar : null;
            r4Var.l1(i17, i18, q32Var != null ? (r45.qp1) q32Var.getCustom(1) : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        this.f119828f.f310112d = false;
        return jz5.f0.f302826a;
    }
}
