package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ur extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f119990d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f119991e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f119992f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f119993g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f119994h;

    /* renamed from: i, reason: collision with root package name */
    public int f119995i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur(com.tencent.mm.plugin.finder.live.widget.et etVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f119994h = etVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f119993g = obj;
        this.f119995i |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.widget.et.e0(this.f119994h, null, this);
    }
}
