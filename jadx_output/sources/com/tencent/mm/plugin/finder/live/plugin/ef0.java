package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ef0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112406d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f112407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jf0 f112408f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef0(com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112408f = jf0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.ef0 ef0Var = new com.tencent.mm.plugin.finder.live.plugin.ef0(this.f112408f, continuation);
        ef0Var.f112407e = obj;
        return ef0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.ef0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        kotlinx.coroutines.y0 y0Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112406d;
        com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var = this.f112408f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var3 = (kotlinx.coroutines.y0) this.f112407e;
            java.lang.Integer num = jf0Var.Y().f410660o;
            if (num == null || num.intValue() <= 0) {
                y0Var = y0Var3;
                kotlinx.coroutines.f1 b17 = kotlinx.coroutines.l.b(y0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.df0(jf0Var, null), 3, null);
                jf0Var.getClass();
                com.tencent.mm.plugin.finder.live.plugin.oo0.Z(jf0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.bf0(b17, jf0Var, null), 3, null);
                jf0Var.getClass();
                com.tencent.mm.plugin.finder.live.plugin.oo0.Z(jf0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.gf0(b17, jf0Var, null), 3, null);
                jf0Var.getClass();
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.f1 L = com.tencent.mm.plugin.finder.live.plugin.oo0.L(jf0Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.plugin.if0(b17, jf0Var, null), 2, null);
                jf0Var.getClass();
                com.tencent.mm.plugin.finder.live.plugin.oo0.Z(jf0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.cf0(b17, L, jf0Var, null), 3, null);
                return jz5.f0.f302826a;
            }
            long intValue = num.intValue();
            this.f112407e = y0Var3;
            this.f112406d = 1;
            if (kotlinx.coroutines.k1.b(intValue, this) == aVar) {
                return aVar;
            }
            y0Var2 = y0Var3;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var2 = (kotlinx.coroutines.y0) this.f112407e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        y0Var = y0Var2;
        kotlinx.coroutines.f1 b172 = kotlinx.coroutines.l.b(y0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.df0(jf0Var, null), 3, null);
        jf0Var.getClass();
        com.tencent.mm.plugin.finder.live.plugin.oo0.Z(jf0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.bf0(b172, jf0Var, null), 3, null);
        jf0Var.getClass();
        com.tencent.mm.plugin.finder.live.plugin.oo0.Z(jf0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.gf0(b172, jf0Var, null), 3, null);
        jf0Var.getClass();
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.f1 L2 = com.tencent.mm.plugin.finder.live.plugin.oo0.L(jf0Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.plugin.if0(b172, jf0Var, null), 2, null);
        jf0Var.getClass();
        com.tencent.mm.plugin.finder.live.plugin.oo0.Z(jf0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.cf0(b172, L2, jf0Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
