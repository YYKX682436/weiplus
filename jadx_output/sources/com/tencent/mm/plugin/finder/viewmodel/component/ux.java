package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class ux extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f136183d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f136184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.dy f136185f;

    /* renamed from: g, reason: collision with root package name */
    public int f136186g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(com.tencent.mm.plugin.finder.viewmodel.component.dy dyVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f136185f = dyVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f136184e = obj;
        this.f136186g |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.viewmodel.component.dy.a(this.f136185f, null, this);
    }
}
