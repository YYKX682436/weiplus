package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class ih0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f112976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.th0 f112977b;

    public ih0(kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.th0 th0Var) {
        this.f112976a = continuation;
        this.f112977b = th0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        kotlin.coroutines.Continuation continuation = this.f112976a;
        if (i17 != 0 || fVar.f70616b != 0) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.hh0(fVar, this.f112977b));
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(bool, bool)));
        } else if (((r45.kl1) fVar.f70618d).getBoolean(1)) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(bool2, bool2)));
        } else {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE)));
        }
        return jz5.f0.f302826a;
    }
}
