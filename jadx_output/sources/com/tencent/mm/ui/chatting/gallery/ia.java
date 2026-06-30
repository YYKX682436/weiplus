package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class ia extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f201029d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f201030e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f201031f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f201032g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f201033h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f201034i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201035m;

    /* renamed from: n, reason: collision with root package name */
    public int f201036n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(com.tencent.mm.ui.chatting.gallery.ja jaVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f201035m = jaVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f201034i = obj;
        this.f201036n |= Integer.MIN_VALUE;
        return this.f201035m.T(null, null, null, null, null, this);
    }
}
