package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120920d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f120921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.g0 f120922f;

    /* renamed from: g, reason: collision with root package name */
    public int f120923g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.megavideo.topstory.flow.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f120922f = g0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f120921e = obj;
        this.f120923g |= Integer.MIN_VALUE;
        return this.f120922f.f(null, 0L, this);
    }
}
