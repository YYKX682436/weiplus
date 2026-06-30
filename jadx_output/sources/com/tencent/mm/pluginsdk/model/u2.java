package com.tencent.mm.pluginsdk.model;

/* loaded from: classes10.dex */
public final class u2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f189471d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f189472e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f189473f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f189474g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f189475h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f189476i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.x2 f189477m;

    /* renamed from: n, reason: collision with root package name */
    public int f189478n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.tencent.mm.pluginsdk.model.x2 x2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f189477m = x2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f189476i = obj;
        this.f189478n |= Integer.MIN_VALUE;
        return this.f189477m.e(null, null, null, false, false, 0L, this);
    }
}
