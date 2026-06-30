package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public final class v1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f214004d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f214005e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f214006f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f214007g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.z1 f214008h;

    /* renamed from: i, reason: collision with root package name */
    public int f214009i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.wallet_core.model.z1 z1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f214008h = z1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f214007g = obj;
        this.f214009i |= Integer.MIN_VALUE;
        return this.f214008h.c(null, null, this);
    }
}
