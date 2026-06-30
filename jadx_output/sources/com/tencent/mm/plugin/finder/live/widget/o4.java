package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class o4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f119245d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f119246e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f119247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q4 f119248g;

    /* renamed from: h, reason: collision with root package name */
    public int f119249h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(com.tencent.mm.plugin.finder.live.widget.q4 q4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f119248g = q4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f119247f = obj;
        this.f119249h |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.widget.q4.b(this.f119248g, null, this);
    }
}
