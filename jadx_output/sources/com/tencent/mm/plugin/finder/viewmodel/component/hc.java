package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class hc extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f134614d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f134615e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f134616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f134617g;

    /* renamed from: h, reason: collision with root package name */
    public int f134618h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f134617g = ncVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f134616f = obj;
        this.f134618h |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.viewmodel.component.nc.Q6(this.f134617g, null, 0, null, this);
    }
}
