package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hu extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f112865d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f112866e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f112867f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f112868g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f112869h;

    /* renamed from: i, reason: collision with root package name */
    public int f112870i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(com.tencent.mm.plugin.finder.live.plugin.iv ivVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f112869h = ivVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f112868g = obj;
        this.f112870i |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.plugin.iv.u1(this.f112869h, this);
    }
}
