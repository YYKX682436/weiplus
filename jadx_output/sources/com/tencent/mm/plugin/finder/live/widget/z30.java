package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class z30 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f120519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.c40 f120520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f120521f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z30(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.widget.c40 c40Var, kotlinx.coroutines.y0 y0Var) {
        super(2, continuation);
        this.f120519d = hVar;
        this.f120520e = c40Var;
        this.f120521f = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.z30(this.f120519d, continuation, this.f120520e, this.f120521f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.z30 z30Var = (com.tencent.mm.plugin.finder.live.widget.z30) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z30Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.l71 l71Var = (r45.l71) ((xg2.i) this.f120519d).f454393b;
        com.tencent.mm.plugin.finder.live.widget.c40 c40Var = this.f120520e;
        com.tencent.mars.xlog.Log.i(c40Var.A(), "requestMicStats success,curRetryTime = " + c40Var.f117960p);
        c40Var.f117960p = 0;
        r45.ob obVar = (r45.ob) l71Var.getCustom(39);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (obVar != null) {
            dk2.qf qfVar = c40Var.f117956i;
            qfVar.getClass();
            qfVar.f233979p = obVar.getLong(0);
            qfVar.f233980q = obVar.getLong(1);
            qfVar.f233981r = obVar.getLong(2);
            qfVar.f233982s = obVar.getLong(3);
            qfVar.f233983t = obVar.getBoolean(4);
            qfVar.f233984u = obVar.getBoolean(5);
            qfVar.f233985v = obVar.getLong(6);
            c40Var.K();
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(c40Var.A(), "audience_mic_stats is null");
            c40Var.I();
        }
        return f0Var2;
    }
}
