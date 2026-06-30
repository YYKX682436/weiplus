package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f117718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h3 f117719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.widget.h3 h3Var) {
        super(2, continuation);
        this.f117718d = hVar;
        this.f117719e = h3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.a3(this.f117718d, continuation, this.f117719e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.a3 a3Var = (com.tencent.mm.plugin.finder.live.widget.a3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.content.Context context = this.f117719e.f118512a;
        db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.f493408k22));
        return jz5.f0.f302826a;
    }
}
