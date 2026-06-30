package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class zk extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f120578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f120579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120578d = h0Var;
        this.f120579e = h0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.zk(this.f120578d, this.f120579e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.zk) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) this.f120578d.f310123d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlin.jvm.internal.h0 h0Var = this.f120579e;
        xk2.c cVar = (xk2.c) h0Var.f310123d;
        if (cVar != null) {
            cVar.c();
        }
        xk2.c cVar2 = (xk2.c) h0Var.f310123d;
        if (cVar2 == null) {
            return null;
        }
        cVar2.b();
        return jz5.f0.f302826a;
    }
}
