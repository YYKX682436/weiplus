package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public final class l9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f195093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.q9 f195094e;

    /* renamed from: f, reason: collision with root package name */
    public int f195095f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(com.tencent.mm.storage.q9 q9Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f195094e = q9Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f195093d = obj;
        this.f195095f |= Integer.MIN_VALUE;
        return this.f195094e.a(this);
    }
}
