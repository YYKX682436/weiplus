package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class tr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f119903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f119904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f119905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.widget.et etVar, kotlin.jvm.internal.c0 c0Var) {
        super(2, continuation);
        this.f119903d = hVar;
        this.f119904e = etVar;
        this.f119905f = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.tr(this.f119903d, continuation, this.f119904e, this.f119905f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.tr trVar = (com.tencent.mm.plugin.finder.live.widget.tr) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        trVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.q32 q32Var = (r45.q32) ((xg2.i) this.f119903d).f454393b;
        com.tencent.mars.xlog.Log.i(this.f119904e.f118280J, "[cgiDelLottery] success, resp = " + pm0.b0.g(q32Var));
        this.f119905f.f310112d = true;
        return jz5.f0.f302826a;
    }
}
