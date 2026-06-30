package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes15.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f115670d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f115671e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f115672f;

    /* renamed from: g, reason: collision with root package name */
    public int f115673g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f115674h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.a1 f115675i;

    /* renamed from: m, reason: collision with root package name */
    public int f115676m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.finder.live.util.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f115675i = a1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f115674h = obj;
        this.f115676m |= Integer.MIN_VALUE;
        return this.f115675i.a7(0, this);
    }
}
