package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class z1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f115251d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f115252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f115253f;

    /* renamed from: g, reason: collision with root package name */
    public int f115254g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f115253f = v3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f115252e = obj;
        this.f115254g |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.plugin.v3.u1(this.f115253f, null, this);
    }
}
