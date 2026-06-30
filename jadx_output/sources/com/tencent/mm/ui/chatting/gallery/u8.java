package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class u8 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f201483d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f201484e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f201485f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201486g;

    /* renamed from: h, reason: collision with root package name */
    public int f201487h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(com.tencent.mm.ui.chatting.gallery.ja jaVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f201486g = jaVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f201485f = obj;
        this.f201487h |= Integer.MIN_VALUE;
        return this.f201486g.F(null, this);
    }
}
