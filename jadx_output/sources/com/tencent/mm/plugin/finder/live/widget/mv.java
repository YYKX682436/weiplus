package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class mv extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f119122d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f119123e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f119124f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f119125g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pv f119126h;

    /* renamed from: i, reason: collision with root package name */
    public int f119127i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(com.tencent.mm.plugin.finder.live.widget.pv pvVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f119126h = pvVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f119125g = obj;
        this.f119127i |= Integer.MIN_VALUE;
        return this.f119126h.i(null, false, null, this);
    }
}
