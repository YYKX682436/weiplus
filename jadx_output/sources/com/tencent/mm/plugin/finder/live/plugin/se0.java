package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class se0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f114243d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f114244e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f114245f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f114246g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jf0 f114247h;

    /* renamed from: i, reason: collision with root package name */
    public int f114248i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se0(com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f114247h = jf0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f114246g = obj;
        this.f114248i |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.plugin.jf0.t1(this.f114247h, this);
    }
}
