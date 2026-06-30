package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f120228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f120229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f120230f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.widget.et etVar, kotlin.jvm.internal.c0 c0Var) {
        super(2, continuation);
        this.f120228d = hVar;
        this.f120229e = etVar;
        this.f120230f = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.wr(this.f120228d, continuation, this.f120229e, this.f120230f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.wr wrVar = (com.tencent.mm.plugin.finder.live.widget.wr) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wrVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.eo1 eo1Var = (r45.eo1) ((xg2.i) this.f120228d).f454393b;
        com.tencent.mars.xlog.Log.i(this.f120229e.f118280J, "[cgiSendWxGift] success, resp = " + pm0.b0.g(eo1Var));
        this.f120230f.f310112d = true;
        return jz5.f0.f302826a;
    }
}
