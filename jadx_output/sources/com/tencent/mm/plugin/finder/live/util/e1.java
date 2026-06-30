package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class e1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f115486d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f115487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.j1 f115488f;

    /* renamed from: g, reason: collision with root package name */
    public int f115489g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.finder.live.util.j1 j1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f115488f = j1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f115487e = obj;
        this.f115489g |= Integer.MIN_VALUE;
        return this.f115488f.e(null, this);
    }
}
