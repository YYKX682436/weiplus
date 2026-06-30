package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class zd extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120564d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f120565e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f120566f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f120567g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ce f120568h;

    /* renamed from: i, reason: collision with root package name */
    public int f120569i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(com.tencent.mm.plugin.finder.live.widget.ce ceVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f120568h = ceVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f120567g = obj;
        this.f120569i |= Integer.MIN_VALUE;
        return this.f120568h.i(null, false, null, this);
    }
}
