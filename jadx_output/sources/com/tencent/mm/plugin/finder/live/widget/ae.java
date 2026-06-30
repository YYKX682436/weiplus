package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ae extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f117757d;

    /* renamed from: e, reason: collision with root package name */
    public int f117758e;

    /* renamed from: f, reason: collision with root package name */
    public int f117759f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f117760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ce f117761h;

    /* renamed from: i, reason: collision with root package name */
    public int f117762i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(com.tencent.mm.plugin.finder.live.widget.ce ceVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f117761h = ceVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f117760g = obj;
        this.f117762i |= Integer.MIN_VALUE;
        return this.f117761h.j(0, 0, false, this);
    }
}
