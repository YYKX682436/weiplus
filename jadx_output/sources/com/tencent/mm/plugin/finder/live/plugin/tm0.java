package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tm0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f114430d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f114431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f114432f;

    /* renamed from: g, reason: collision with root package name */
    public int f114433g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm0(com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f114432f = wn0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f114431e = obj;
        this.f114433g |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.plugin.wn0.t1(this.f114432f, this);
    }
}
