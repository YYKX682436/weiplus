package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xr extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120370d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f120371e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f120372f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f120373g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f120374h;

    /* renamed from: i, reason: collision with root package name */
    public int f120375i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr(com.tencent.mm.plugin.finder.live.widget.et etVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f120374h = etVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f120373g = obj;
        this.f120375i |= Integer.MIN_VALUE;
        return this.f120374h.j0(0, this);
    }
}
