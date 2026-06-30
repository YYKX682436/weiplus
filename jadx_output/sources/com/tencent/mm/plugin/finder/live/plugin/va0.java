package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class va0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f114698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wa0 f114699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114700f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(com.tencent.mm.plugin.finder.live.plugin.wa0 wa0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114699e = wa0Var;
        this.f114700f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.va0 va0Var = new com.tencent.mm.plugin.finder.live.plugin.va0(this.f114699e, this.f114700f, continuation);
        va0Var.f114698d = obj;
        return va0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.va0 va0Var = (com.tencent.mm.plugin.finder.live.plugin.va0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        va0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        cl0.g b17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f114698d;
        com.tencent.mm.plugin.finder.live.plugin.wa0 wa0Var = this.f114699e;
        kotlinx.coroutines.r2 r2Var = wa0Var.f114908y;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        cl0.g gVar = new cl0.g(this.f114700f);
        int optInt = gVar.optInt("wxT");
        hn0.u uVar = hn0.u.f282437e;
        if (optInt == 2 && (b17 = gVar.b("subtitle")) != null) {
            int optInt2 = b17.optInt("index_eng");
            int optInt3 = b17.optInt("index_chn");
            int optInt4 = b17.optInt("duration");
            java.lang.String optString = b17.optString("chn");
            java.lang.String optString2 = b17.optString("eng");
            zl2.r4.f473950a.M2("FinderLiveSubtitlePlugin", "msg:\n " + b17 + '}');
            kotlin.jvm.internal.o.d(optString);
            com.tencent.mm.plugin.finder.live.plugin.wa0.u1(wa0Var, optString, optInt3, optInt4, 1);
            kotlin.jvm.internal.o.d(optString2);
            com.tencent.mm.plugin.finder.live.plugin.wa0.u1(wa0Var, optString2, optInt2, optInt4, 2);
            ((mm2.n6) wa0Var.P0(mm2.n6.class)).f329295h = true;
        }
        wa0Var.f114908y = kotlinx.coroutines.l.b(y0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.ua0(wa0Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
