package com.tencent.mm.plugin.finder.service;

/* loaded from: classes15.dex */
public final class v4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f126228d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f126229e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f126230f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f126231g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f126232h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f126233i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.x4 f126234m;

    /* renamed from: n, reason: collision with root package name */
    public int f126235n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(com.tencent.mm.plugin.finder.service.x4 x4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f126234m = x4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f126233i = obj;
        this.f126235n |= Integer.MIN_VALUE;
        return this.f126234m.wi(null, null, null, null, null, null, this);
    }
}
