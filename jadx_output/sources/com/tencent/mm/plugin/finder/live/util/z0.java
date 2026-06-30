package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes15.dex */
public final class z0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f115759d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f115760e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f115761f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f115762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.a1 f115763h;

    /* renamed from: i, reason: collision with root package name */
    public int f115764i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.finder.live.util.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f115763h = a1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f115762g = obj;
        this.f115764i |= Integer.MIN_VALUE;
        return this.f115763h.c7(null, this);
    }
}
