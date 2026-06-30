package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pl implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f113905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f113906b;

    public pl(kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        this.f113905a = continuation;
        this.f113906b = hmVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ol(this.f113906b));
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        jz5.f0 f0Var = jz5.f0.f302826a;
        this.f113905a.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        return f0Var;
    }
}
