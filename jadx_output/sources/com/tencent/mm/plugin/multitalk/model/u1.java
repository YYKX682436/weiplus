package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class u1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f150150d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f150151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.a2 f150152f;

    /* renamed from: g, reason: collision with root package name */
    public int f150153g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.tencent.mm.plugin.multitalk.model.a2 a2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f150152f = a2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f150151e = obj;
        this.f150153g |= Integer.MIN_VALUE;
        return this.f150152f.d(this);
    }
}
