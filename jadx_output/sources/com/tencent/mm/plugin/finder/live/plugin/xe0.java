package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xe0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f115077d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f115078e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f115079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jf0 f115080g;

    /* renamed from: h, reason: collision with root package name */
    public int f115081h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe0(com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f115080g = jf0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f115079f = obj;
        this.f115081h |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.plugin.jf0.u1(this.f115080g, this);
    }
}
