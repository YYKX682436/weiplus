package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class r9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f119605d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f119606e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f119607f;

    /* renamed from: g, reason: collision with root package name */
    public int f119608g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f119609h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x9 f119610i;

    /* renamed from: m, reason: collision with root package name */
    public int f119611m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(com.tencent.mm.plugin.finder.live.widget.x9 x9Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f119610i = x9Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f119609h = obj;
        this.f119611m |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.widget.x9.f0(this.f119610i, 0, this);
    }
}
