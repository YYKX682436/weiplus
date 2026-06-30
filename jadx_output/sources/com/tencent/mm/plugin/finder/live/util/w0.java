package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes15.dex */
public final class w0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f115732d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f115733e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f115734f;

    /* renamed from: g, reason: collision with root package name */
    public int f115735g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f115736h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.a1 f115737i;

    /* renamed from: m, reason: collision with root package name */
    public int f115738m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.plugin.finder.live.util.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f115737i = a1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f115736h = obj;
        this.f115738m |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.util.a1.Z6(this.f115737i, 0, this);
    }
}
