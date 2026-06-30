package com.tencent.mm.pluginsdk.model;

/* loaded from: classes10.dex */
public final class r2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f189424d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f189425e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f189426f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f189427g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f189428h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f189429i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.x2 f189430m;

    /* renamed from: n, reason: collision with root package name */
    public int f189431n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.pluginsdk.model.x2 x2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f189430m = x2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f189429i = obj;
        this.f189431n |= Integer.MIN_VALUE;
        return this.f189430m.d(null, null, null, false, false, 0L, this);
    }
}
