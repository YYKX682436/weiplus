package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f115501d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f115502e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f115503f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f115504g;

    /* renamed from: h, reason: collision with root package name */
    public int f115505h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.j1 f115506i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f115507m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f115508n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.finder.live.util.j1 j1Var, kotlin.jvm.internal.h0 h0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f115506i = j1Var;
        this.f115507m = h0Var;
        this.f115508n = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.util.f1(this.f115506i, this.f115507m, this.f115508n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.util.f1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.util.j1 j1Var;
        kotlin.jvm.internal.h0 h0Var;
        java.lang.String str;
        kotlinx.coroutines.sync.d dVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f115505h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            j1Var = this.f115506i;
            kotlinx.coroutines.sync.d dVar2 = j1Var.f115577j;
            this.f115501d = dVar2;
            kotlin.jvm.internal.h0 h0Var2 = this.f115507m;
            this.f115502e = h0Var2;
            this.f115503f = j1Var;
            java.lang.String str2 = this.f115508n;
            this.f115504g = str2;
            this.f115505h = 1;
            kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) dVar2;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
            str = str2;
            dVar = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f115504g;
            j1Var = (com.tencent.mm.plugin.finder.live.util.j1) this.f115503f;
            h0Var = (kotlin.jvm.internal.h0) this.f115502e;
            dVar = (kotlinx.coroutines.sync.d) this.f115501d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            h0Var.f310123d = ((java.util.LinkedHashMap) j1Var.f115576i).getOrDefault(str, null);
            ((kotlinx.coroutines.sync.k) dVar).d(null);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            ((kotlinx.coroutines.sync.k) dVar).d(null);
            throw th6;
        }
    }
}
