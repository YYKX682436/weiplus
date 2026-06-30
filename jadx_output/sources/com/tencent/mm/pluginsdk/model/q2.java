package com.tencent.mm.pluginsdk.model;

/* loaded from: classes10.dex */
public final class q2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f189408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.x2 f189409e;

    /* renamed from: f, reason: collision with root package name */
    public int f189410f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.tencent.mm.pluginsdk.model.x2 x2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f189409e = x2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f189408d = obj;
        this.f189410f |= Integer.MIN_VALUE;
        return this.f189409e.c(null, null, this);
    }
}
