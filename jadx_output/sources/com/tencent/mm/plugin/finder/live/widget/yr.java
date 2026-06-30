package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class yr extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120459d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f120460e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f120461f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f120462g;

    /* renamed from: h, reason: collision with root package name */
    public int f120463h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f120464i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f120465m;

    /* renamed from: n, reason: collision with root package name */
    public int f120466n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr(com.tencent.mm.plugin.finder.live.widget.et etVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f120465m = etVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f120464i = obj;
        this.f120466n |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.widget.et.f0(this.f120465m, null, this);
    }
}
