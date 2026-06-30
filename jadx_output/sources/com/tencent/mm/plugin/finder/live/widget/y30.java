package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class y30 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f120408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.c40 f120409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.widget.c40 c40Var) {
        super(2, continuation);
        this.f120408d = hVar;
        this.f120409e = c40Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.y30(this.f120408d, continuation, this.f120409e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.y30 y30Var = (com.tencent.mm.plugin.finder.live.widget.y30) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y30Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.widget.c40 c40Var = this.f120409e;
        int i17 = c40Var.f117960p + 1;
        c40Var.f117960p = i17;
        if (i17 > 3) {
            com.tencent.mars.xlog.Log.e(c40Var.A(), "requestMicStats failed");
            c40Var.I();
        } else {
            com.tencent.mars.xlog.Log.w(c40Var.A(), "requestMicStats failed,curRetryTime = " + c40Var.f117960p);
            int i18 = c40Var.f117960p;
            kotlinx.coroutines.r2 r2Var = c40Var.f117961q;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.y0 y0Var = c40Var.f117959o;
            c40Var.f117961q = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.b40(i18, c40Var, null), 3, null) : null;
        }
        return jz5.f0.f302826a;
    }
}
