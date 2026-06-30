package com.tencent.mm.plugin.finder.service;

/* loaded from: classes15.dex */
public final class w4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f126244d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f126245e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f126246f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f126247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.x4 f126248h;

    /* renamed from: i, reason: collision with root package name */
    public int f126249i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(com.tencent.mm.plugin.finder.service.x4 x4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f126248h = x4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f126247g = obj;
        this.f126249i |= Integer.MIN_VALUE;
        return this.f126248h.Di(null, null, null, null, this);
    }
}
