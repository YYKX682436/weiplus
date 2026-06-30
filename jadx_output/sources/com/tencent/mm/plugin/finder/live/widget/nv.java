package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class nv extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f119204d;

    /* renamed from: e, reason: collision with root package name */
    public int f119205e;

    /* renamed from: f, reason: collision with root package name */
    public int f119206f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f119207g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pv f119208h;

    /* renamed from: i, reason: collision with root package name */
    public int f119209i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(com.tencent.mm.plugin.finder.live.widget.pv pvVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f119208h = pvVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f119207g = obj;
        this.f119209i |= Integer.MIN_VALUE;
        return this.f119208h.j(0, 0, false, this);
    }
}
