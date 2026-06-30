package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f194985d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f194986e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f194987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a1 f194988g;

    /* renamed from: h, reason: collision with root package name */
    public int f194989h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.storage.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f194988g = a1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f194987f = obj;
        this.f194989h |= Integer.MIN_VALUE;
        return com.tencent.mm.storage.a1.e(this.f194988g, false, null, null, this);
    }
}
